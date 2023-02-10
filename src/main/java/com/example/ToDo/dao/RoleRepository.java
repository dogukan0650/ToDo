package com.example.ToDo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ToDo.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	
	Role getById(int id);
	
	@Query(" from Role where roleName =? 1")
	List<Role> getByRoleName(String roleName);
	
	@Query(" from Role where isDeleted = 'false' ")
	List<Role> getByActive();
	
	@Query(" from Role where isDeleted = 'true' ")
	List<Role> getByUnActive();
	
}
