package br.edu.bribeiro;

/*
 * As the Test Data Builder is based on the Data Builder Pattern
 * you basically return the data builder itself in all methods.
 */

public class UserDataBuilder {

	// DATA BUILDER APPROACH

	// 1st I would like to create a kind of template values
	// Then if nobody set any value we already have the default

	public static final String DEFAULT_NAME = "Ze Silva";
	public static final String DEFAULT_USER_NAME = "zesilva";
	public static final String DEFAULT_PASSWORD = "123456";
	public static final String DEFAULT_ROLE = "ROLE_USER";

	private String name = DEFAULT_NAME;
	private String username = DEFAULT_USER_NAME;
	private String password = DEFAULT_PASSWORD;
	private String role = DEFAULT_ROLE;

	// this will just create a user with the default values
	public static UserDataBuilder aUser() {
		return new UserDataBuilder();
	}

	// the following methods will change the attributes 1 by 1
	public UserDataBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public UserDataBuilder withUsername(String username) {
		this.username = username;
		return this;
	}

	public UserDataBuilder withPassword(String password) {
		this.password = password;
		return this;
	}

	public UserDataBuilder asRole(String role) {
		this.role = role;
		return this;
	}

	public UserDataBuilder asUserRole() {
		this.role = "ROLE_USER";
		return this;
	}

	public UserDataBuilder asAdminRole() {
		this.role = "ROLE_ADMIN";
		return this;
	}

	public UserDataBuilder withNoPassword() {
		this.password = null;
		return this;
	}

	// this method is just if you want to ignore some parameter
	// usually we call inside this one all the methods created above
	public UserDataBuilder but() {
		return UserDataBuilder.aUser().withName(name).withUsername(username).withPassword(password).asRole(role);
	}

	// this will always build the User
	// and if we do not set any value it will use the default values
	public User build() {
		return new User(name, username, password, role);
	}

}