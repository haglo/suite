package org.suite.ui;

import org.suite.ui.authentication.AccessControl;
import org.suite.ui.authentication.AccessControlFactory;
import org.suite.ui.view.LoginView;
import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;

/**
 * This class is used to listen to BeforeEnter event of all UIs in order to
 * check whether a user is signed in or not before allowing entering any page.
 * It is registered in a file named
 * com.vaadin.flow.server.VaadinServiceInitListener in META-INF/services.
 */
public class InitListener implements VaadinServiceInitListener {

	private static final long serialVersionUID = 1L;

	@Override
	public void serviceInit(ServiceInitEvent initEvent) {
		final AccessControl accessControlDatabase = AccessControlFactory.getInstance().createAccessControlDatabase();
		final AccessControl accessControlLdap = AccessControlFactory.getInstance().createAccessControlLdap();

		initEvent.getSource().addUIInitListener(uiInitEvent -> {
			uiInitEvent.getUI().addBeforeEnterListener(enterEvent -> {
				boolean isSignedIn = false;
				if (accessControlDatabase.isUserSignedIn() || accessControlLdap.isUserSignedIn()) {
					isSignedIn = true;
				}
				if (!isSignedIn && !LoginView.class.equals(enterEvent.getNavigationTarget()))
					enterEvent.rerouteTo(LoginView.class);
			});
		});
	}
}
