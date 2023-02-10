package com.example.ToDo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "roleName")
	private String roleName;
	
	@Column(name = "creationTime")
	private Date creationTime = new Date();
	
	@Column(name = "updateTime")
	private Date updateTime;
	
	@Column(name = "isDeleted")
	private boolean isDeleted;
}
