package br.com.gwcloud.smartplace.pilot.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the "GROUP" database table.
 * 
 */
@Entity
@Table(name = "\"GROUP\"")
@NamedQuery(name = "Group.findAll", query = "SELECT g FROM Group g")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "\"ID\"")
	private String id;

	@Column(name = "\"NAME\"")
	private String name;

	// bi-directional many-to-many association to User
	@ManyToMany(mappedBy = "groups", fetch = FetchType.EAGER)
	private List<User> users;

	// bi-directional many-to-many association to Role
	@ManyToMany
	@JoinTable(
		name="\"GROUP_USER\""
		, joinColumns={
				@JoinColumn(name="\"GROUP_ID\"")
			}
		, inverseJoinColumns={
				@JoinColumn(name="\"USER_ID\"")
			})
	private List<Role> roles;
	

	public Group() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}