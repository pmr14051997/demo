package learnscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsScreeenshot {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
		Thread.sleep(3000);
		 List<WebElement> flipcart = driver.findElements(By.tagName("img"));
		 System.out.println(flipcart.size());
		
		 for(WebElement a:flipcart)
		 {
			 
		File srcFile = a.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/"+LocalDateTime.now().toString().replace(':', '-')+"fblogin.png");
		FileUtils.copyFile(srcFile, destFile);
		 }
		
	}
}