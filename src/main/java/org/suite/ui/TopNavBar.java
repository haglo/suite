package org.suite.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.suite.component.Space;
import org.suite.ui.view.HomeView;
import org.suite.ui.view.MailView;
import org.suite.ui.view.UserView;


import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;

@Component
@Scope(value="session")
public class TopNavBar extends Div implements RouterLayout {
	
	private static final long serialVersionUID = 1L;
	
	private final String TITLE = "Neural Information";

	private HorizontalLayout topNavigation;
	
	private RouterLink homeLink;
	private RouterLink mailLink;
	private RouterLink userLink;
	
	public TopNavBar() {
		addClassName("main-layout__header");
		
		homeLink = new RouterLink(null, HomeView.class);
		homeLink.add(new Icon(VaadinIcon.HOME), new Text("Home"));
		homeLink.addClassName("main-layout__top-nav-item");
		homeLink.setHighlightCondition(HighlightConditions.sameLocation());

		mailLink = new RouterLink(null, MailView.class);
		mailLink.add(new Icon(VaadinIcon.ENVELOPE_O), new Text("Mail"));
		mailLink.addClassName("main-layout__top-nav-item");
		mailLink.setHighlightCondition(HighlightConditions.sameLocation());

		userLink = new RouterLink(null, UserView.class);
		userLink.add(new Icon(VaadinIcon.POWER_OFF), new Text("Settings"));
		userLink.addClassName("main-layout__top-nav-item");
		userLink.setHighlightCondition(HighlightConditions.sameLocation());

		topNavigation = new HorizontalLayout();
		topNavigation.addClassName("main-layout__top-nav");

		H2 title = new H2(TITLE);
		title.addClassName("main-layout__title");

		Space space = new Space(4);
		


		topNavigation.add(homeLink, mailLink, userLink);

		add(title, space, topNavigation);
	}
	

	public HorizontalLayout getTopNavigation() {
		return topNavigation;
	}


	public void setTopNavigation(HorizontalLayout topNavigation) {
		this.topNavigation = topNavigation;
	}


}
