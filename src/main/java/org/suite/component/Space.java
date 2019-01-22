package org.suite.component;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Label;

public class Space extends Composite<Label> {

	private static final long serialVersionUID = 1L;
	private String blanc = "&#160;";

	public Space(Integer n) {
		String space = "";
		for (int i = 0; i < n; i++) {
			space = space + blanc;
		}
		Label label = new Label();
		label.getElement().setProperty("innerHTML", space);
		getContent().add(label);
	}

}
