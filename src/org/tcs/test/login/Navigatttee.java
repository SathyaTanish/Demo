package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatttee {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.selenium.dev/");
		//driver.navigate().to("https://testng.org/");
		//driver.navigate().to("https://cucumber.io/");
		//driver.navigate().to("https://www.postman.com/");
		//Thread.sleep(1500);
		//driver.navigate().back();
		//Thread.sleep(1500);
		//driver.navigate().back();
		//Thread.sleep(1500);
		//driver.navigate().back();
		//Thread.sleep(1500);
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		driver.navigate().to("https://www.facebook.com/");
		//WebElement txtUserName = driver.findElement(By.id("email"));
		//boolean enabled = txtUserName.isEnabled();	
		//System.out.println(enabled);
		
		//boolean displayed = txtUserName.isDisplayed();
		//System.out.println(displayed);
		
		//if((enabled==true)&&(displayed==true)) {
			//txtUserName.sendKeys("greenstech@gmail.com");
		//}else {
			//System.out.println("Presence of bug");
		//}
		
		WebElement btnLogin = driver.findElement(By.partialLinkText("Create"));
		
		btnLogin.click();
		
		WebElement btnMale = driver.findElement(By.xpath("//input[@value='2']"));
		boolean s1 = btnMale.isSelected();
		
		System.out.println(s1);
		
		btnMale.click();
		
		
		boolean s2 = btnMale.isSelected();
		
		System.out.println(s2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
