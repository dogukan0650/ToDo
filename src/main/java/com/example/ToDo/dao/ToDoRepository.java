package com.example.ToDo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ToDo.model.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer> {
	
	
	ToDo getById(int id);

	@Query(" from ToDo where description =? 1")
	List<ToDo> getByDescription(String description);

	@Query(" from ToDo where completed = 'true' ")
	List<ToDo> getByCompleted();
	
	@Query(" from ToDo where completed = 'false' ")
	List<ToDo> getByUnCompleted();
	
	@Query(" from ToDo where isDeleted = 'false' ")
	List<ToDo> getActive();
	
	@Query(" from ToDo where isDeleted = 'true' ")
	List<ToDo> getUnActive();
	
}
