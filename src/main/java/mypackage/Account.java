package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Account {
	WebDriver dr;
	String url="http://www.bravebits.io/wp03/wp-admin";
By accLogin = By.id("user_login");
By passLogin = By.id("user_pass");
By btnSubmit= By.id("wp-submit");



public void login() throws InterruptedException{
	dr.get(url);
	dr.findElement(accLogin).sendKeys("admin");
	dr.findElement(passLogin).sendKeys("1");
	dr.findElement(btnSubmit).click();
	Thread.sleep(3000);
}


}
