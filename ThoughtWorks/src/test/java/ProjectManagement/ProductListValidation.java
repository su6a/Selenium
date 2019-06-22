package ProjectManagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Login.LoginElements;

public class ProductListValidation {
	
	
	public static void productlistNavigate(WebDriver driver) {
		ProductListValidationElements ProductList = PageFactory.initElements(driver, ProductListValidationElements.class);
		ProductList.ProductList.click();
		//driver.findElement(By.xpath("//a[@href=' /shopieasy/getAllProducts']")).click();
	}
	
	public static void clickProduct(WebDriver driver, String val[]) {
		ProductListValidationElements ProductList = PageFactory.initElements(driver, ProductListValidationElements.class);
		List<WebElement> rowVals = ProductList.Table;
		for(WebElement e : rowVals) {				 
			 if (val[0].equalsIgnoreCase(e.findElement(By.xpath("td[4]")).getText().toString())){
				 if (val[1].equalsIgnoreCase(e.findElement(By.xpath("td[7]")).getText().toString())) {
					 if(val[2].equalsIgnoreCase(e.findElement(By.xpath("td[3]")).getText().toString())){
						 e.findElement(By.xpath("td[9]/a[1]")).click();
						 
				}
			 }
		 }
	}
		/*List<WebElement> rowVals = driver.findElements(By.xpath("//*[@id=\"productList\"]/tbody/tr"));
		for(WebElement e : rowVals) {				 
				 if (val[0].equalsIgnoreCase(e.findElement(By.xpath("td[4]")).getText().toString())){
					 if (val[1].equalsIgnoreCase(e.findElement(By.xpath("td[7]")).getText().toString())) {
						 if(val[2].equalsIgnoreCase(e.findElement(By.xpath("td[3]")).getText().toString())){
							 e.findElement(By.xpath("td[9]/a[1]")).click();
							 
					}
				 }
			 }
		}*/
	}
}
