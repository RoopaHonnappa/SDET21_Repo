package com.comcast.OrgTest.copy;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = { "SmokeTest" })
	public void createNewOrgTest() {
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
