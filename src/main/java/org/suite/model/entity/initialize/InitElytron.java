package org.suite.model.entity.initialize;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.suite.model.entity.ElytronRole;
import org.suite.model.entity.ElytronUser;
import org.suite.model.entity.enums.DefaultLanguage;
import org.suite.model.entity.enums.DefaultTheme;
import org.suite.model.repository.ElytronRoleRepository;
import org.suite.service.ElytronService;

@Component
public class InitElytron implements ApplicationRunner {

	@Autowired
	private ElytronService elytronService;
	
//	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		if (elytronService.getElytronUsers().size() == 0) {
			List<String> listElytronRole = new ArrayList<>();
			listElytronRole.add("System");
			listElytronRole.add("Poweruser");
			listElytronRole.add("Administrator");
			listElytronRole.add("User");
			listElytronRole.add("Guest");

			for (String tmp : listElytronRole) {
				ElytronRole entity = new ElytronRole();
				entity.setRolename(tmp);
				elytronService.setElytronRole(entity);
			}

			List<String> listElytronUser = new ArrayList<>();
			listElytronUser.add("N-U-T");
			listElytronUser.add("Admin1");
			listElytronUser.add("Admin2");
			listElytronUser.add("haglo");

			for (String tmp : listElytronUser) {
				List<ElytronRole> elytronRoles = new ArrayList<>();
				elytronRoles.add(elytronService.getElytronRoleByName("System"));
				ElytronUser entity = new ElytronUser();
				entity.setUsername(tmp);
//				entity.setPassword(encoder.encode("123atgfd"));
				entity.setPassword("123atgfd");
				entity.setElytronRoles(elytronRoles);
				entity.setDefaultLanguage(DefaultLanguage.german);
				entity.setDefaultTheme(DefaultTheme.Dark);
				elytronService.setElytronUser(entity);
			}

		}
	}
}
