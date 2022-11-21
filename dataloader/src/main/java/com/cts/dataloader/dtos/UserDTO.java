package com.cts.dataloader.dtos;

import javax.validation.constraints.NotNull;

public class UserDTO {

	@NotNull(message = "USERNAME IS MANDATORY")
	private String username;

	@NotNull(message = "PASSWORD IS MANDATORY")
	private String password;

	@NotNull(message = "ROLE_NAME IS MANDATORY")
	private String roleName;

	public String getUserName() {
		return username;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", password=" + password + ", roleName=" + roleName + "]";
	}

}
