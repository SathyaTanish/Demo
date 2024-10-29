package org.tcs.test.login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alleert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement btn1 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btn1.click();
		WebElement btn2 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		btn2.click();
		
		Alert a = driver.switchTo().alert();
		
		String text = a.getText();
		System.out.println(text);
		
		a.sendKeys("JavaSelenium");
		Thread.sleep(1500);
		a.accept();
		
		
		
		
	}

}
