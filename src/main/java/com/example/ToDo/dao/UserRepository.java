package com.example.ToDo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ToDo.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User getById(int id);
	
	@Query(" from Users where name =? 1")
	List<User> getByName(String name);
	
	@Query(" from Users where username =? 1")
	List<User> getByUsername(String username);
	
	@Query(" from Users where surname =? 1")
	List<User> getBySurname(String surname);
	
	@Query(" from Users where email =? 1")
	User getByEmail(String email);
	
	@Query(" from Users where isDeleted = 'false' ")
	List<User> getActive(boolean isDeleted);
	
}
