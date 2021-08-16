package br.com.gwcloud.smartplace.pilot.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the "USER" database table.
 * 
 */
@Entity
@Table(name="\"USER\"")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID\"")
	private String id;

	@Column(name="\"CREATED_AT\"")
	private Timestamp createdAt;

	@Column(name="\"EMAIL\"")
	private String email;

	@Column(name="\"EMAIL_VERIFIED\"")
	private Boolean emailVerified;

	@Column(name="\"ENABLED\"")
	private Boolean enabled;

	@Column(name="\"FIRST_NAME\"")
	private String firstName;

	@Column(name="\"LAST_NAME\"")
	private String lastName;

	@Column(name="\"USERNAME\"")
	private String username;

	//bi-directional many-to-many association to Group
	@ManyToMany
	@JoinTable(
		name="\"GROUP_USER\""
		, joinColumns={
				@JoinColumn(name="\"GROUP_ID\"")
			}
		, inverseJoinColumns={
				@JoinColumn(name="\"USER_ID\"")
			})
	private List<Group> groups;

	public User() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEmailVerified() {
		return this.emailVerified;
	}

	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

}