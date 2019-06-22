package AddProduct;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class AddProduct {
	
	public static void addProduct(WebDriver driver, String val[]) {
		
		AddProductElements add = PageFactory.initElements(driver, AddProductElements.class);
		add.AddProduct.click();
		//driver.findElement(By.xpath("//a[@href=' /shopieasy/admin/product/addProduct']")).click();
		Assert.assertEquals("Add Product", driver.getTitle());
		add.ProductName.sendKeys(val[0]);
		add.ProductDescription.sendKeys(val[1]);
		add.ProductCategory.click();
		add.ProductManufacturer.sendKeys(val[3]);
		add.ProductPrice.clear();
		add.ProductPrice.sendKeys(val[4]);
		add.UnitStock.sendKeys(val[5]);
		add.AddProductSubmit.click();
		//driver.findElement(By.xpath("//*[@id='productName']")).sendKeys(val[0]);
		//driver.findElement(By.xpath("//*[@id='productDescription']")).sendKeys(val[1]);
		//driver.findElement(By.xpath("//*[@id='productCategory1']")).click();
		//driver.findElement(By.xpath("//*[@id='productManufacturer']")).sendKeys(val[3]);
		//driver.findElement(By.xpath("//*[@id='productPrice']")).clear();
		//driver.findElement(By.xpath("//*[@id='productPrice']")).sendKeys(val[4]);
		//driver.findElement(By.xpath("//*[@id='unitStock']")).sendKeys(val[5]);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	//	return true;
	}

}
