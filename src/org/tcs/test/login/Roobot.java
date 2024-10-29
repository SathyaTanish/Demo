package org.tcs.test.login;

import java.awt.AWTException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Roobot {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//WebElement gmail = driver.findElement(By.linkText("Gmail"));
		//Actions a = new Actions(driver);
		//a.contextClick(gmail).perform();
		//Robot r = new Robot();
		//for (int i = 0; i < 6; i++) {
			//r.keyPress(KeyEvent.VK_DOWN);
			//r.keyRelease(KeyEvent.VK_DOWN);		
		//}
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		Actions a = new Actions(driver);
		a.keyDown(Keys.SHIFT).sendKeys("apple").keyUp(Keys.SHIFT).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

		
		
		
		
		
		

	}

}
