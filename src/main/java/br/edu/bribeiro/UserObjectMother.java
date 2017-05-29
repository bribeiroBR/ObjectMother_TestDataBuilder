package br.edu.bribeiro;

public class UserObjectMother {

	// OBJECT MOTHER APPROACH

	// creating factories

	// factory for Default User
	public static User defaultUser() {
		return new User("Ze Silva", "zesilva", "123456", "ROLE_USER");
	}

	// factory for default Admin
	public static User defaultAdmin() {
		return new User("Maria B", "mariab", "654321", "ROLE_ADMIN");
	}

	// other factories...
	
	/*
	 * One important thing to highlight is:
	 * - this file can be considerable huge, if we create 1 method for each entry we need and it means:
	 * 1- hard to maintain;
	 * 2- possible duplicated code;
	 */

}
