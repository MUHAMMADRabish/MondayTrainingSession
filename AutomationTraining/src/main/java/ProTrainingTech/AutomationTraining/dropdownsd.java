package ProTrainingTech.AutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownsd {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");//how to open the site
		WebElement createanaccount=driver.findElement(By.linkText("Create new account"));
		createanaccount.click();
		Thread.sleep(6000);
		WebElement birthofmonth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(birthofmonth);
		ob.selectByIndex(6);
		WebElement birthofday=driver.findElement(By.name("birthday_day"));
		Select ot=new Select(birthofday);
		ot.selectByVisibleText("26");
		WebElement years=driver.findElement(By.name("birthday_year"));
		Select io=new Select(years);
		io.selectByVisibleText("1980");
		
	}

}
