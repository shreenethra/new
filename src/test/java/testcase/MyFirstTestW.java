package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import base.BaseTest;


public class MyFirstTestW extends BaseTest{

	@Test
	public static void LoginTest()  throws InterruptedException
	{
		
	System.out.println("login");
	 Thread.sleep(1000);
	 driver.findElement(By.linkText("SIGN IN")).click();		
	 driver.findElement(By.id("login_id")).sendKeys("nethratech1@gmail.com");
	 driver.findElement(By.id("nextbtn")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("nethrashree");  
	 System.out.println("clicked");
	 driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
}

}
	


