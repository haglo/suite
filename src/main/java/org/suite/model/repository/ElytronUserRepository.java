package org.suite.model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.suite.model.entity.ElytronRole;
import org.suite.model.entity.ElytronUser;

public interface ElytronUserRepository extends JpaRepository<ElytronUser, Long> {

	public List<ElytronUser> findAllByOrderByIdDesc();
	public List<ElytronUser> findByElytronRoles(ElytronRole elytronRole);
	public ElytronUser findOneByUsername(String username);
 
}
