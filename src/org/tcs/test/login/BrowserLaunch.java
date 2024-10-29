package org.tcs.test.login;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		@Nullable
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		//driver.close();
		
		driver.quit();
		
	}
	

}
