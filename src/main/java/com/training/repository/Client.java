/**
 * 
 */
package com.training.repository;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author admin
 *
 */

@Document(collection="client")
public class Client {
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(int id, String name, Date dateOfBirth, Boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.isActive = isActive;
	}


	@Id
	private int id;
	
	private String name;	
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	
	private Boolean isActive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", isActive=" + isActive + "]";
	}
	
}
