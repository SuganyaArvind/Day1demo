package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\SugiWorks\\workspace\\Sample\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
//	driver.get("http://the-internet.herokuapp.com/basic_auth");
	
	String Url = "https://the-internet.herokuapp.com/basic_auth";
	

    driver.manage().window().maximize();
    
    
    String user = "admin";
    String password = "admin";
    String url = "the-internet.herokuapp.com/basic_auth";
    String auth = "https://"+user+":"+ password +"@"+url;

    driver.get(auth);
    
	
//    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    
    
    
    
}	

	
	
	
}
