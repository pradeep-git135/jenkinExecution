package tyaa.product;

import org.testng.annotations.Test;

public class CreateProductTest {
	@Test
	public void createProduct() {
		System.out.println("executing");
		String browser = System.getProperty("browser");
		System.out.println("================================================browser is : "+browser);
		String url = System.getProperty("url");
		System.out.println("================================================url is : "+url);

	}
	@Test
	public void createProductwithInfo() {
		System.out.println("executing createProductwithInfo");
	}

}
