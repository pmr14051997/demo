package learnscreenshot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class activeElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().activeElement().sendKeys("madav",Keys.TAB+"asssas",Keys.ENTER);
	
		Thread.sleep(6000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
