package Products;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import tests.Test1;

public class Products extends Test1 {
	
	public static void validateProduct(WebDriver driver, String val[]) {
		//assertEquals(val[0], driver.findElement(By.xpath("/*[@id='prod']/tbody/tr[3]/td[2]")).getText().toString());
		ProductsElements Products = PageFactory.initElements(driver, ProductsElements.class);
		try {
			driver.navigate().refresh();
			assertEquals(val[0], Products.Name.getText());
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex) {
			driver.navigate().refresh();
			assertEquals(val[0], Products.Name.getText());
		}		
	}
		
}

