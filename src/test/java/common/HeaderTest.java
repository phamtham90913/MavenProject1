package common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import mypackage.Dashboad;
public class HeaderTest {
	WebDriver dr;
	mypackage.Account account;
	Dashboad dashboard = new Dashboad();
	header.Elements eheader;
	
	
	
  @Test
  public void createNewHeader() throws InterruptedException {
	 System.out.println("call login");
//	  acc.login();
	 dr.get("http://www.bravebits.io/wp03/wp-admin");
		dr.findElement(By.id("user_login")).sendKeys("admin");
		 System.out.println("call login1");

		dr.findElement(By.id("user_pass")).sendKeys("1");
		dr.findElement(By.id("wp-submit")).click();
		Thread.sleep(3000);
	  System.out.println("call go to header list");
	  dashboard.gotoHeaderList();
	  System.out.println("pass");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	 
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tham\\workspace\\geckodriver.exe");
	   dr = new FirefoxDriver();
  }


  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
