package br.edu.bribeiro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * In this case, we are creating a new User based in the Data Builder
 * we have just created, based on the User class.
 * This is an Data Builder approach.
 */

public class UserDataBuilderTest {

	// Look at how we create the user
	// Just creating a new User calling the desired method from the Data Builder

	@Test
	public void checkDefaultUserInformation() {

		UserDataBuilder userBuilder = UserDataBuilder.aUser();
		User user = userBuilder.build();

		assertTrue(user.getName().equalsIgnoreCase("Ze Silva"));
		assertTrue(user.getUserName().equalsIgnoreCase("zesilva"));
		assertTrue(user.getPassword().equalsIgnoreCase("123456"));
		assertTrue(user.getRole().equalsIgnoreCase("ROLE_USER"));
	}

	@Test
	public void checkUserInformationSettingNewValues() {

		UserDataBuilder userBuilder = UserDataBuilder.aUser().withName("Maria B").withUsername("mariab")
				.withPassword("654321").asAdminRole();
		User admin = userBuilder.build();

		assertTrue(admin.getName().equalsIgnoreCase("Maria B"));
		assertTrue(admin.getUserName().equalsIgnoreCase("mariab"));
		assertTrue(admin.getPassword().equalsIgnoreCase("654321"));
		assertTrue(admin.getRole().equalsIgnoreCase("ROLE_ADMIN"));
	}

	/*
	 * With the Data Builder we make the test easy to be read, easy to maintain it
	 * and we can easily change any parameter we need.
	 */

}