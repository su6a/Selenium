package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginElements {
	
	WebDriver driver;

	 @FindBy(how=How.XPATH, using="//*[@id='myNavbar']/ul[3]/li[3]/a") WebElement login;
	 @FindBy(how=How.XPATH, using="//input[@name='j_username']") WebElement userName;
	 @FindBy(how=How.XPATH, using="//input[@name='j_password']") WebElement password;
	 @FindBy(how=How.XPATH, using="//button[@type='submit']") WebElement submit;
	 @FindBy(how=How.XPATH, using="//a[@href='/shopieasy/logout']") WebElement logOut;
	 
	 public LoginElements(WebDriver driver) {
		 this.driver=driver;
	 }

}
