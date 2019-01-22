package org.suite.ui.authentication;

import java.util.List;
import org.suite.model.entity.ElytronUser;
import org.suite.service.ElytronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidateElytronUser {

	@Autowired
	private ElytronService elytronUserService;

	private ElytronUser elytronUser;

	public boolean validate(String username) {

		boolean result = false;
		boolean elytronUserExists = false;
		elytronUser = new ElytronUser();

		List<ElytronUser> elytronUserList = elytronUserService.getElytronUsers();
		for (ElytronUser entry : elytronUserList) {
			if (entry.getUsername().equals(username)) {
				elytronUser = entry;
				elytronUserExists = true;
			}
		}

		if (elytronUserExists) {
			result = true;
		}

		if (!elytronUserExists) {
			try {
				ElytronUser nutElytronUser = new ElytronUser();
				nutElytronUser = elytronUserService.getElytronUserByName("N-U-T");
				elytronUser.setUsername(username);
				elytronUser.setElytronRoles(nutElytronUser.getElytronRoles());
				elytronUser.setDefaultLanguage(nutElytronUser.getDefaultLanguage());
				elytronUser.setDefaultTheme(nutElytronUser.getDefaultTheme());
				// Important to make it so
				result = true;
			} catch (Exception ex) {
				ex.printStackTrace();
				result = false;
			}
		}
		return result;
	}

}
