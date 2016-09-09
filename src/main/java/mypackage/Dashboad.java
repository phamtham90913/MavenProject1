package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dashboad {
	WebDriver dr;
	By btnDashboard = By.xpath("//div[@class = 'wp-menu-name' and text()='Dashboard']");
	By btnPost = By.xpath("//div[@class = 'wp-menu-name' and text()='Post']");
	By btnMedia = By.xpath("//div[@class = 'wp-menu-name' and text()='Media']");
	By btnAppearance = By.xpath("//div[@class='wp-menu-name' and text() = 'Appearance']");
	By btnTheme = By.xpath("//a[@class='wp-first-item' and text()='Themes']");
	By itemNitro = By.id("wr-nitro-name");
	By btnNitro1 = By.xpath("//div[@class='wp-menu-name' and text() = 'Nitro']");
	By btnDashboardinNitro = By.xpath(".//a[@class='wp-first-item' and text()='Dashboard']");
	By btnHeader = By.linkText("Header Builder");
	
	
	
	
	
	
//	@Test
	public void gotoHeaderList(){
		System.out.println("In header list");
		WebElement btnNitro = dr.findElement(btnNitro1);
		System.out.println("running in function gotoheaderlist");
		Actions action = new Actions(dr);
		action.moveToElement(btnNitro).perform();
		dr.findElement(btnHeader).click();
	}
	public boolean isNitroActive(){
		boolean nitroactivated = false;
		if (dr.findElement(itemNitro).isDisplayed())//.getText()=="WR Nitro")
		{
			nitroactivated = true ;
		}else 
			nitroactivated = false;
			return nitroactivated;
	}
	

}
