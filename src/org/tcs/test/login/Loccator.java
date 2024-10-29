package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loccator {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");

WebElement txtUserName = driver.findElement(By.id("email"));

txtUserName.sendKeys("greenstech@gmail.com");

WebElement txtPassword = driver.findElement(By.id("pass"));

txtPassword.sendKeys("7896");

WebElement btnLogin = driver.findElement(By.name("login"));

btnLogin.click();

	}

}
