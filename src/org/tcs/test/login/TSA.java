package org.tcs.test.login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSA {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		@SuppressWarnings("unused")
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		WebElement facebook = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		File f1 = facebook .getScreenshotAs(OutputType.FILE);
		System.out.println(f1);
		
		
		File f2 = new File ("C:\\Users\\ATG\\Desktop\\FacebookLogo.png");
		FileUtils.copyFile(f1, f2);
		
		
	}

}
