package ProjectManagement;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductListValidationElements {

	WebDriver driver;

	 @FindBy(how=How.XPATH, using="//a[@href=' /shopieasy/getAllProducts']") WebElement ProductList;
	 @FindBy(how=How.XPATH, using="//*[@id='productList']/tbody/tr") List<WebElement> Table;

	 
	 public ProductListValidationElements(WebDriver driver) {
		 this.driver=driver;
	 }

}
