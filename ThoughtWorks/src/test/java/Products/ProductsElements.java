package Products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductsElements {
	
	WebDriver driver;

	 @FindBy(how=How.XPATH, using="/*[@id='prod']/tbody/tr[2]/td[2]") WebElement Name;
	 
	 public ProductsElements(WebDriver driver) {
		 this.driver=driver;
	 }

}
