package com.nick.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@NoArgsConstructor
@Data
public class Customer {

	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@NotNull
	@Size(min = 1, message = "required")
	@Column(name = "last_name")
	private String lastName;
	
	@Email(regexp = ".+@.+\\..+", message = "not valid")
	@Column(name = "email")
	private String email;
}
