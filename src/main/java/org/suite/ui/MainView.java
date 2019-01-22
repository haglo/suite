package org.suite.ui;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@HtmlImport("frontend://styles/shared-styles.html")
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
@Theme(value = Lumo.class)
@Route("")
public class MainView extends HorizontalLayout implements RouterLayout {

	private static final long serialVersionUID = 1L;
	private TopNavBar topNav;

	
	public MainView() {
		topNav = new TopNavBar();
		addClassName("main-layout");
		add(topNav);
		
	}

}
