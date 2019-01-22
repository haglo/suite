package org.suite.model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.suite.model.entity.ElytronRole;
import org.suite.model.entity.ElytronUser;

public interface ElytronRoleRepository extends JpaRepository<ElytronRole, Long> {

	public List<ElytronRole> findAllByOrderByIdDesc();
	public ElytronRole  findByRolename(String rolename);
 
}
