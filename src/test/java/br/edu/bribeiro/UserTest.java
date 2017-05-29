package br.edu.bribeiro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * Of course it is not a real test scenario,
 * where you test the parameter you just set to your user,
 * but it is just to show how we can construct the test.
 * In this case, we are creating a new User using the old way,
 * it is not an Object Mother approach neither a Test Data Builder approach
 */

public class UserTest {

	// Look at how we create the user
	// Just creating a new User setting all the desired data in the real time

	@Test
	public void checkDefaultUserInformation() {

		User user = new User("Ze Silva", "zesilva", "123456", "ROLE_USER");

		assertTrue(user.getName().equalsIgnoreCase("Ze Silva"));
		assertTrue(user.getUserName().equalsIgnoreCase("zesilva"));
		assertTrue(user.getPassword().equalsIgnoreCase("123456"));
		assertTrue(user.getRole().equalsIgnoreCase("ROLE_USER"));

	}

	@Test
	public void checkDefaultAdminInformation() {

		User admin = new User("Maria B", "mariab", "654321", "ROLE_ADMIN");

		assertTrue(admin.getName().equalsIgnoreCase("Maria B"));
		assertTrue(admin.getUserName().equalsIgnoreCase("mariab"));
		assertTrue(admin.getPassword().equalsIgnoreCase("654321"));
		assertTrue(admin.getRole().equalsIgnoreCase("ROLE_ADMIN"));

	}

	/*
	 * The problem with the above approach is that, we have at least 3 possible issues:
	 * 1- we can set the parameter in the wrong place;
	 * 2- if we change the User's constructor we will break all tests
	 * 3- the test code is not that easy to maintain and also is not easy
	 * to ready
	 */

}