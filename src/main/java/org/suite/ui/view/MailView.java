package org.suite.ui.view;

import org.suite.component.IFrame;
import org.suite.ui.MainView;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "MailView", layout = MainView.class)
@PageTitle("MailView")
public class MailView extends VerticalLayout {
	

	private static final long serialVersionUID = 1L;
	public static final String VIEW_NAME = "MailView";
	

	public MailView() {
		initView();
		Label content = new Label();
		String iframe = " <style>" + 
				"iframe {margin: 0;padding: 0;border: none;}" + 
				"</style>" + 
				"<iframe src=\"http://localhost:8081\" width=\"100%\" height=\"1100px\"></iframe> ";
		content.getElement().setProperty("innerHTML", iframe);
		
		IFrame iFrame = new IFrame();
		iFrame.setSrc("http://localhost:8081");
		iFrame.setWidth("100%");
		iFrame.setHeight("1100px");
		
		add(iFrame);
	}


	private void initView() {
		setDefaultHorizontalComponentAlignment(Alignment.STRETCH);
	}

//	@PostConstruct
//	void init() {
//		Label content = new Label();
//		String iframe = " <iframe src=\"http://localhost:8081\" width=\"100%\" height=\"800px\"></iframe> ";
//		content.getElement().setProperty("innerHTML", iframe);
//		add(content);
//	}
}
