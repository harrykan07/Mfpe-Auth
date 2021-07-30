package com.cognizantmfpe.authservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This is a model class which is used as a table using Spring Data
 * JPA's @Entity Annotations. It contains fields like UserId, Password and
 * UserName.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
public class MyUser {

	@Id
	@Column(name = "userId", length = 20)
	private String userId;

	@Column(name = "password", length = 200)
	private String password;

	@Column(name = "userName", length = 20)
	private String userName;

}
