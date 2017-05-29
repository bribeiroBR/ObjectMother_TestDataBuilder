package br.edu.bribeiro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * In this case, we are creating a new User based in the test factory
 * we have just created, based on the User class.
 * This is an Object Mother approach.
 */

public class UserObjectMotherTest {

	// Look at how we create the user
	// Just creating a new User calling the desired method from the User Factory

	@Test
	public void checkDefaultUserInformation() {

		User user = UserObjectMother.defaultUser();

		assertTrue(user.getName().equalsIgnoreCase("Ze Silva"));
		assertTrue(user.getUserName().equalsIgnoreCase("zesilva"));
		assertTrue(user.getPassword().equalsIgnoreCase("123456"));
		assertTrue(user.getRole().equalsIgnoreCase("ROLE_USER"));
	}

	@Test
	public void checkDefaultAdminInformation() {

		User admin = UserObjectMother.defaultAdmin();

		assertTrue(admin.getName().equalsIgnoreCase("Maria B"));
		assertTrue(admin.getUserName().equalsIgnoreCase("mariab"));
		assertTrue(admin.getPassword().equalsIgnoreCase("654321"));
		assertTrue(admin.getRole().equalsIgnoreCase("ROLE_ADMIN"));
	}

	/*
	 * With the Object Mother approach we just fixed
	 * the 03 previous possible issues.
	 * But, in the other hand, we created another one.
	 * The Test Factory can be a considerably big file, it means:
	 * 1- hard to maintain;
	 * 2- possible duplicated code;
	 */

}