package org.vehiclemanagement.model;
//import java.io.Serializable;

import java.io.Serializable;
//import java.util.HashSet;
//import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int userId;
	@Column(length = 20, unique = true)
	@Id
	private String username;
	@Column(length = 12)
	private String password;
	private String passwordConf;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", passwordConf="
				+ passwordConf + "]";
	}

	public String getPasswordConf() {
		return passwordConf;
	}

	public void setPasswordConf(String passwordConf) {
		this.passwordConf = passwordConf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
