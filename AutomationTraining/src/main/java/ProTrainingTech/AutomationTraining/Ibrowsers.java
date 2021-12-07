package ProTrainingTech.AutomationTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekendMonTrdEvi\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://www.amazon.com");//how to open the site
//Thread.sleep(6000);
driver.navigate().refresh();//how to refresh
//Thread.sleep(6000);
driver.navigate().back();//how to go back ward
//Thread.sleep(6000);
driver.navigate().forward();//how to go forward
//Thread.sleep(6000);
driver.manage().window().maximize();//how to maximize
String windowofhandle=driver.getWindowHandle();//how to get window handle
System.out.println(windowofhandle);
String currenturlpage=driver.getCurrentUrl();//how to get current url for page
System.out.println(currenturlpage);
driver.close();//how to close the window

	}

}
