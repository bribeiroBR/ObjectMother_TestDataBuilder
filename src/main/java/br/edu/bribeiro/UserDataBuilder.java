package br.edu.bribeiro;

/*
 * As the Test Data Builder is based on the Data Builder Pattern
 * you basically return the data builder itself in all methods.
 */

public class UserDataBuilder {

	// DATA BUILDER APPROACH

	// to make it works we basically need 4 things:
	// 1- create a private constructor
	// 2- create a static method that will be the entry point for all the others
	// 3- return the Data Builder class it self in all method
	// 4- a method to build the real object, it means, 1 method will return the
	// object itself and not the Data Builder

	// Here I am just creating a kind of template values
	// Then if nobody set any value we already have the default
	public static final String DEFAULT_NAME = "Ze Silva";
	public static final String DEFAULT_USER_NAME = "zesilva";
	public static final String DEFAULT_PASSWORD = "123456";
	public static final String DEFAULT_ROLE = "ROLE_USER";

	private String name = DEFAULT_NAME;
	private String username = DEFAULT_USER_NAME;
	private String password = DEFAULT_PASSWORD;
	private String role = DEFAULT_ROLE;

	// turning the constructor private will ensure that nobody can create a
	// object directly without using the methods and also the build
	private UserDataBuilder() {
	}

	// turning this to static we can ensure that will only exist 1 instance of
	// this object and make this method the entry point for all the rest
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

	// here is where we really build our User and check that it returns the User
	// and not the Data builder itself
	public User build() {
		return new User(name, username, password, role);
	}

}