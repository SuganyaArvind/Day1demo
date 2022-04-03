package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
	
		
	System.setProperty("webdriver.chrome.driver", "D:\\SugiWorks\\workspace\\Sample\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://demo.guru99.com/test/guru99home/");
	
	driver.manage().window().maximize();
	
	List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
	
	System.out.println(allframes);	
	System.out.println( allframes.size());
	
	driver.switchTo().frame("a077aa5e");

		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		img.click();
		
		driver.switchTo().defaultContent();
		
		WebElement email = driver.findElement(By.xpath("//h3[text()='Email Submission']"));
		System.out.println(email.getText());
		
		
		
		
	}
	
	
	
	
}
