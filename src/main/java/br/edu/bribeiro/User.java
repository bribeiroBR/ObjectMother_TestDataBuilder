package br.edu.bribeiro;

public class User {

	private String name;
	private String userName;
	private String password;
	private String role;

	public User(String name, String userName, String password, String role) {
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

}
