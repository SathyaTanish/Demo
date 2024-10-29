package org.hcl.test.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Caargo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.airindia.com/");
		
		//clicking the calender
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
				WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.id("datepicker")));
				until.click();

				//identifying the current month
				WebElement cMonth = driver.findElement(By.className("ui-datepicker-month"));
				//identifying the current year
				WebElement cYear = driver.findElement(By.className("ui-datepicker-year"));

				while (!(cMonth.equals("December") && cYear.equals("2024"))) {

			//		Thread.sleep(1500);
					WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(50));
					WebElement until1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
					until1.click();

				
				String cMonth1= driver.findElement(By.className("ui-datepicker-month")).getText();
				String cYear1 = driver.findElement(By.className("ui-datepicker-year")).getText();

				if (cMonth1.equals("December")&& cYear1.equals("2024")) {

					driver.findElement(By.xpath("//a[text()='31']")).click();
					break;

				}
				
				}
				driver.switchTo().defaultContent();
			}

		

	}


