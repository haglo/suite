package org.suite.ui.view;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.suite.ui.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout.Orientation;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "ProfileView", layout = MainView.class)
@PageTitle("Profile")
public class ProfileView extends VerticalLayout {


	@Autowired
	SettingsScreen settingsScreen;
	

	private static final long serialVersionUID = 1L;
	public static final String VIEW_NAME = "ProfileView";

	private VerticalLayout leftHolder;
	private VerticalLayout rightHolder;
	private SplitLayout horizontalSplit;

	public ProfileView() {
		setSizeFull();
	}

	@PostConstruct
	void init() {
		leftHolder = new VerticalLayout();
		rightHolder = new VerticalLayout();		
		Label demo3 = new Label("gggggggggggggggggggggggggggggggggg");


		Button settingsButton = new Button();
		settingsButton.setHeight("40px");
		Icon icon = new Icon(VaadinIcon.COG);
		icon.setSize("18px");
		settingsButton.setText("settings.settings");
		settingsButton.setIcon(icon);
		settingsButton.setIconAfterText(false);
		settingsButton.addClickListener(e -> {
			rightHolder.removeAll();
			rightHolder.add(settingsScreen);
		});
		

		leftHolder.add(settingsButton);

		rightHolder.add(demo3);
		rightHolder.add(demo3);
		rightHolder.add(demo3);

		horizontalSplit = new SplitLayout();
		horizontalSplit.setOrientation(Orientation.HORIZONTAL);
		horizontalSplit.addToPrimary(leftHolder);
		horizontalSplit.addToSecondary(rightHolder);
		horizontalSplit.setSplitterPosition(20);
		horizontalSplit.setSizeFull();

		add(horizontalSplit);

	}

}
