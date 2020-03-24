package Day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windoHandle1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.naukri.com/");
		String mainWindow=driver.getWindowHandle();
		System.out.println("parent window"+mainWindow);
		driver.findElement(By.xpath("//li[1]//a[1]//img[1]")).click();
		 Set<String> set =driver.getWindowHandles();
		 for(String str:set)
		 {
			 System.out.println("Windows are"+str);
			 System.out.println("Navigate window");
			 driver.switchTo().window(str);
			 driver.get("https://www.google.com/");
		 }
	}

	
}
