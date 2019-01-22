package org.suite.ui.view;

import java.util.EnumSet;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.suite.model.entity.ElytronRole;
import org.suite.model.entity.ElytronUser;
import org.suite.model.entity.enums.DefaultLanguage;
import org.suite.model.entity.enums.DefaultTheme;
import org.suite.service.ElytronService;
import org.suite.ui.authentication.CurrentUser;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

@Component
@Scope(value="session")
public class SettingsScreen extends VerticalLayout {

	@Autowired
	ElytronService service;


	private static final long serialVersionUID = 1L;

	private TextField txfUserName;
	private ComboBox<ElytronRole> cbxRole;
	private ComboBox<DefaultLanguage> cbxLanguage;
	private ComboBox<DefaultTheme> cbxTheme;
	private Checkbox ckbEdit;
	private TextArea txaComment;
	private Button saveButton;
	private ElytronUser selectedEntry;

	public SettingsScreen() {

	}

	@PostConstruct
	void init() {
		selectedEntry = new ElytronUser();
		selectedEntry = service.getElytronUserByName("haglo");
		saveButton = new Button("basic.save");
		saveButton.setEnabled(false);

		FormLayout subContent = new FormLayout();
		subContent.setSizeFull();

		try {
			TextField txfID = new TextField();
			txfID.setValue("" + selectedEntry.getId());
			txfID.setReadOnly(true);
			subContent.addFormItem(txfID, "ID");

			TextField txfUUID = new TextField();
			txfUUID.setValue("" + selectedEntry.getPuuid());
			txfUUID.setReadOnly(true);
			subContent.addFormItem(txfUUID, "UUID");

			txfUserName = new TextField();
			txfUserName.setValue(selectedEntry.getUsername() != null ? selectedEntry.getUsername() : "");
			txfUserName.setReadOnly(true);
			subContent.addFormItem(txfUserName, "account.username");

			cbxLanguage = new ComboBox<>();
			cbxLanguage.setItems(EnumSet.allOf(DefaultLanguage.class));
			cbxLanguage.setValue(selectedEntry.getDefaultLanguage());
			subContent.addFormItem(cbxLanguage, "basic.language");

			cbxTheme = new ComboBox<>();
			cbxTheme.setItems(EnumSet.allOf(DefaultTheme.class));
			cbxTheme.setValue(selectedEntry.getDefaultTheme());
			subContent.addFormItem(cbxTheme, ("basic.theme"));

			txaComment = new TextArea();
			txaComment.setValue(selectedEntry.getComment() != null ? selectedEntry.getComment() : "");
			subContent.addFormItem(txaComment, "basic.comment");

			ckbEdit = new Checkbox("basic.edit");
			ckbEdit.addValueChangeListener(event -> {
				if (event.getValue()) {
					saveButton.setEnabled(true);
				} else {
					saveButton.setEnabled(false);
				}
			});
			subContent.add(ckbEdit);

			saveButton.addClickListener(event -> {
				selectedEntry.setDefaultLanguage(cbxLanguage.getValue());
				selectedEntry.setDefaultTheme(cbxTheme.getValue());
				selectedEntry.setComment(txaComment.getValue());
				service.setElytronUser(selectedEntry);
				saveButton.setEnabled(false);
				ckbEdit.setValue(false);
			});

			Div bottomMenuBar = new Div(saveButton);

			subContent.add(bottomMenuBar);
			
			add(subContent);

		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
