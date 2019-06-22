package tests;

import Login.Login;
import ProjectManagement.ProductListValidation;
import org.testng.annotations.Test;
import AddProduct.AddProduct;
import Products.Products;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	WebDriver driver;
	String s[] = {"Surendar", "Surendar description", "Android"," OnePlus", "1000","2"};
  @Test
  public void f() {
	Login.LoginTest(driver, "admin8@shopping.com", "admin");
	AddProduct.addProduct(driver, s);
	Login.Logout(driver);
	Login.LoginTest(driver, "Test@abc.com", "Test");
	ProductListValidation.productlistNavigate(driver);
	ProductListValidation.clickProduct(driver, s);
	//ProductListValidation.validateProduct(driver, s);
	//Products.validateProduct(driver, s);
	Login.Logout(driver);
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
	  
	  driver = (WebDriver) new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("http://10.134.124.160:8080/shopieasy");
  }

  @AfterTest
  public void afterTest() {
	//  driver.close();
  }

}
