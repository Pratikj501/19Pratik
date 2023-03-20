package blazodemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.http.ConnectionFailedException;

public class flightBook 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRATIK\\Downloads\\ch\\cdriver.exe");
			WebDriver driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Thread.sleep(2000);
			//driver.get(UtilityClass.getPFdata("URL"));
			driver.get("https://blazedemo.com/index.php");
		
		
		   
//			List<WebElement> pricelist = driver.findElements(By.xpath("//body/div[2]/table/tbody/tr[*]/td[6]"));
//			
//			for(WebElement price:pricelist)
//			{
//				  ArrayList lst = new ArrayList<>();
//				lst.get(5);
//			}
	}

}
