package ProTrainingTech.AutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");//how to open the site
		//WebElement searchto=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
		//searchto.click();
        WebElement phonenumberfield=driver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
        phonenumberfield.sendKeys("Protrainingtech");
        WebElement linktx=driver.findElement(By.xpath("//*[text()='Forgot password?']"));
        
	}

}
