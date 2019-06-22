package AddProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddProductElements {

	
	WebDriver driver;
	 @FindBy(how=How.XPATH, using="//a[@href=' /shopieasy/admin/product/addProduct']") WebElement AddProduct;
	 @FindBy(how=How.XPATH, using="//*[@id='productName']") WebElement ProductName;
	 @FindBy(how=How.XPATH, using="//*[@id='productDescription']") WebElement ProductDescription;
	 @FindBy(how=How.XPATH, using="//*[@id='productCategory1']") WebElement ProductCategory;
	 @FindBy(how=How.XPATH, using="//*[@id='productManufacturer']") WebElement ProductManufacturer;
	 @FindBy(how=How.XPATH, using="//*[@id='productPrice']") WebElement ProductPrice;
	 @FindBy(how=How.XPATH, using="//*[@id='unitStock']") WebElement UnitStock;
	 @FindBy(how=How.XPATH, using="//button[@type='submit']") WebElement AddProductSubmit;
	
	 
	 public AddProductElements(WebDriver driver) {
		 this.driver=driver;
	 }
}
