package ProTrainingTech.AutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");//how to open the site
		WebElement alerts=driver.findElement(By.name("alert"));
		alerts.click();
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("Alert is displayed");
		driver.switchTo().alert().accept();
		
	}

}
