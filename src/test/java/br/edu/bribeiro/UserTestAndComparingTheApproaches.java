package br.edu.bribeiro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * Here we are comparing the 3 approaches
 * and you can decide which one you will use
 */

public class UserTestAndComparingTheApproaches {

	// Look at how we create the in put data
	// in all of the 4 tests

	@Test
	public void checkUserInformation_OldWay() {

		User user = new User("Ze Silva", "zesilva", "123456", "ROLE_USER");

		assertTrue(user.getName().equalsIgnoreCase("Ze Silva"));
		assertTrue(user.getUserName().equalsIgnoreCase("zesilva"));
		assertTrue(user.getPassword().equalsIgnoreCase("123456"));
		assertTrue(user.getRole().equalsIgnoreCase("ROLE_USER"));

	}

	@Test
	public void checkUserInformation_ObjectMother() {

		User user = UserObjectMother.defaultUser();

		assertTrue(user.getName().equalsIgnoreCase("Ze Silva"));
		assertTrue(user.getUserName().equalsIgnoreCase("zesilva"));
		assertTrue(user.getPassword().equalsIgnoreCase("123456"));
		assertTrue(user.getRole().equalsIgnoreCase("ROLE_USER"));
	}

	@Test
	public void checkUserInformation_DataBuilder() {

		UserDataBuilder userBuilder = UserDataBuilder.aUser();
		User user = userBuilder.build();

		assertTrue(user.getName().equalsIgnoreCase("Ze Silva"));
		assertTrue(user.getUserName().equalsIgnoreCase("zesilva"));
		assertTrue(user.getPassword().equalsIgnoreCase("123456"));
		assertTrue(user.getRole().equalsIgnoreCase("ROLE_USER"));
	}

	@Test
	public void checkUserInformation_DataBuilder_SettingValues() {

		UserDataBuilder userBuilder = UserDataBuilder.aUser().withName("Breno Ribeiro").withUsername("brenoribeiro")
				.withPassword("123456").asAdminRole();
		User user = userBuilder.build();

		assertTrue(user.getName().equalsIgnoreCase("Breno Ribeiro"));
		assertTrue(user.getUserName().equalsIgnoreCase("brenoribeiro"));
		assertTrue(user.getPassword().equalsIgnoreCase("123456"));
		assertTrue(user.getRole().equalsIgnoreCase("ROLE_ADMIN"));

	}

}