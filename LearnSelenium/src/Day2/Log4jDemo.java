package Day2;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo
{

	public static void main(String[] args) 
	{
		Logger log=Logger.getLogger(Log4jDemo.class);
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		log.info("URL Launched:");
		String title=driver.getTitle();
		System.out.println("Actual Title: "+title);
		log.warn("Check Title:");
		
		String Expectedtitle="Google";
		if(Expectedtitle.equals(title))
		{
			System.out.println("Correct Title.");
			log.info("The URL is correct:");
		}
		else
		{
			System.out.println("Incorrect Title.");
			log.error("The URL is not Correct");
		}

	}

}
