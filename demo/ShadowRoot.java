package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot {
	public static void main(String[] args) {
		WebDriver d  = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		d.findElement(By.xpath("//input[@placeholder='Enter your username']")).sendKeys("abd");
		
	}

}
