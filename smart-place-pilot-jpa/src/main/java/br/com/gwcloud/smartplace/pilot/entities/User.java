package br.com.gwcloud.smartplace.pilot.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "USER" database table.
 * 
 */
@Entity
@Table(name="\"USER\"")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private Timestamp createdAt;
	private String email;
	private Boolean emailVerified;
	private Boolean enabled;
	private String firstName;
	private String lastName;
	private String username;

	public User() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID\"", unique=true, nullable=false, length=50)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Column(name="\"CREATED_AT\"")
	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}


	@Column(name="\"EMAIL\"", nullable=false, length=200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Column(name="\"EMAIL_VERIFIED\"")
	public Boolean getEmailVerified() {
		return this.emailVerified;
	}

	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}


	@Column(name="\"ENABLED\"")
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}


	@Column(name="\"FIRST_NAME\"", nullable=false, length=200)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	@Column(name="\"LAST_NAME\"", nullable=false, length=400)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Column(name="\"USERNAME\"", nullable=false, length=100)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}