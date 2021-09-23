package tyss.contact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "smoke")
	public void cereateContactTest() {
		System.out.println("executing cereateContactTest");
	}
	@Test(groups = "regression")
	public void cereateContactWithORGTest() {
		System.out.println("execuying cereateContactWithORGTest");
	}
	@Test(groups = "regression")
	public void deleteContactTest() {
		System.out.println("executing deleteContactTest");
	}


}
