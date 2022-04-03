package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AttributeOptions {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\SugiWorks\\workspace\\Sample\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
	
	Thread.sleep(2000);
	
	WebElement ydn = driver.findElement(By.id("year"));
	
	Select  select= new Select(ydn);
	List<WebElement> allyear = select.getOptions();	
	
	System.out.println(allyear.size());
	System.out.println("git demo");
	
for (int i = 0; i < allyear.size();  i++) {
	
	WebElement z = allyear.get(i);
	String text = z.getAttribute("value");
	System.out.println(text);
	
	
	
}
	
}
}
