package com.example.ToDo.model;

import java.util.Date;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "todo")
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "completed")
	private boolean completed = Boolean.FALSE;
	
	@Column(name = "creationTime")
	private Date creationTime = new Date();
	
	@Column(name = "updateTime")
	private Date updateTime;
	
	@Column(name = "isDeleted")
	private boolean isDeleted;
}
