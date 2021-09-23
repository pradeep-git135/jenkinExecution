package tyss.organization;

import org.testng.annotations.Test;

public class CreateOrganizationTest {
	@Test(groups = "smoke")
	public void CreateOrgTest() {
		System.out.println("executing CreateOrgTest");
	}

	@Test(groups = "regression")
	public void CreateOrgWithIndustryTest() {
		System.out.println("executing CreateOrgWithIndustryTest");
	}
	@Test(groups = "regression")
	public void DeleteOrgTest() {
		System.out.println("executing DeleteOrgTest");
	}


}
