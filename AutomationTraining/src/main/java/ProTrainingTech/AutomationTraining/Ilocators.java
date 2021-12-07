package ProTrainingTech.AutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");//how to open the site
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
	    searchbutton.click();
	    Thread.sleep(6000);
	    WebElement bestsellers=driver.findElement(By.linkText("Best Sellers"));
	    bestsellers.click();
	    Thread.sleep(6000);
	    WebElement dealof=driver.findElement(By.partialLinkText("Cyber"));
	    dealof.click();
	    WebElement fieldsof=driver.findElement(By.name("field-keywords"));
	    
	}

}
