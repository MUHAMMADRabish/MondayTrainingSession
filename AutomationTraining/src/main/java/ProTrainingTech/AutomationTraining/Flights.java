package ProTrainingTech.AutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com");//how to open the site
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flights=driver.findElement(By.xpath("//*[text()='Flights']"));
		flights.click();
		Thread.sleep(6000);
		WebElement departure=driver.findElement(By.xpath("//*[@data-name='d1']"));
		departure.click();
		Thread.sleep(6000);
		WebElement departureofdate=driver.findElement(By.xpath("//*[@aria-label='Dec 26, 2021']"));
		departureofdate.click();
		
		//Doing to commit again for repos,
	}

}
