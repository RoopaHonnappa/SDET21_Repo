package com.comcast.contactTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = { "SmokeTest" })
	public void createNewContact() {
		System.out.println("new contact created");
	}

	@Test(groups = { "RegressionTest" })
	public void createNewContactWithOrgTest() {
		System.out.println("new contact created with organization");
	}

	@Test(groups = { "RegressionTest" })
	public void createNewContactWithIndTest() {
		System.out.println("new contact created with Industry");
	}

}
