package org.suite.ui.view;

import javax.annotation.PostConstruct;
import org.suite.ui.MainView;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;;

@Route(value = "UserView", layout = MainView.class)
@PageTitle("UserView")
public class UserView extends VerticalLayout {

	
	private static final long serialVersionUID = 1L;
	public static final String VIEW_NAME = "UserView";
	

	public UserView() {
		setAlignItems(Alignment.END);
	}

	@PostConstruct
	void init() {
		Button profileButton = new Button("person.profile");
		profileButton.addClickListener(e -> {
			profileButton.getUI().ifPresent(ui -> ui.navigate("ProfileView"));
		});
		add(profileButton);

	
		Button logoutButton = new Button("auth.logout", VaadinIcon.SIGN_OUT.create());
		logoutButton.addClickListener(event -> {
			VaadinSession.getCurrent().getSession().invalidate();
			UI.getCurrent().getPage().reload();
		});
		add(logoutButton);

	}

}
