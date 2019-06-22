package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Login {


  static public void LoginTest(WebDriver driver, String uname, String Pass) {
	  
	  LoginElements Login = PageFactory.initElements(driver, LoginElements.class);
	  Login.login.click();;
	  Login.userName.sendKeys(uname);
	  Login.password.sendKeys(Pass);
	  Login.submit.click();
/*	  driver.findElement(By.xpath("//*[@id='myNavbar']/ul[3]/li[3]/a")).click();
	  Assert.assertEquals("Login", driver.getTitle());
	  driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys(uname);
	  driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys(Pass);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();*/
  }
  
  static public void Logout(WebDriver driver) {
	  //driver.findElement(By.xpath("//a[@href='/shopieasy/logout']")).click();
	  LoginElements Login = PageFactory.initElements(driver, LoginElements.class);
	  Login.logOut.click();
  }
}
