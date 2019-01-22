package org.suite.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.suite.model.entity.ElytronRole;
import org.suite.model.entity.ElytronUser;
import org.suite.model.repository.ElytronRoleRepository;
import org.suite.model.repository.ElytronUserRepository;

@Service
public class ElytronService {

	@Autowired
	private ElytronUserRepository elytronUserRepository;

	@Autowired
	private ElytronRoleRepository elytronRoleRepository;

	public List<ElytronUser> getElytronUsers() {
		List<ElytronUser> entries = elytronUserRepository.findAllByOrderByIdDesc();
		return entries;
	}

	public ElytronUser setElytronUser(ElytronUser entity) {
		ElytronUser entry = elytronUserRepository.save(entity);
		return entry;
	}
	
	public List<ElytronRole> getElytronRole() {
		List<ElytronRole> entries = elytronRoleRepository.findAllByOrderByIdDesc();
		return entries;
	}
	
	
	public ElytronRole setElytronRole(ElytronRole entity) {
		ElytronRole entry = elytronRoleRepository.save(entity);
		return entry;
	}

	public void deleteElytronUser(ElytronUser entity) {
		elytronUserRepository.delete(entity);
	}



	public ElytronUser getElytronUserByName(String name) {
		ElytronUser entry = elytronUserRepository.findOneByUsername(name);
		return entry;
	}

	public List<ElytronRole> getElytronRoles() {
		List<ElytronRole> entries = elytronRoleRepository.findAllByOrderByIdDesc();
		return entries;
	}
	
	public ElytronRole getElytronRoleByName(String name) {
		ElytronRole entry = elytronRoleRepository.findByRolename(name);
		return entry;
	}

}
