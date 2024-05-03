package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public  Properties property;
	
	public String url = "C:\\Users\\Nina-PC\\eclipse-workspace\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties";
	
@BeforeTest
	public void setUp() throws IOException  {
	
	Properties prop= new Properties();
	FileReader fr = new FileReader("C:\\Users\\Nina-PC\\eclipse-workspace\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
prop.load(fr);

		
		
		if(prop.getProperty("broswer").equalsIgnoreCase("chrome")) {
			
			
			WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();
			
			ChromeOptions chromeOptions = new ChromeOptions();
			 chromeOptions.addArguments("--remote-allow-origins=*");
			 WebDriver driver= new ChromeDriver(chromeOptions);
			 
			driver.get(prop.getProperty("testur"));	
			
		}
//		 if(prop.getProperty("broswer").equalsIgnoreCase("firefox")) {
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.get(prop.getProperty("testurl"));	
//		}
		
		
	}
//      @AfterTest
//		public void tearDown( )  {
//        
//    	  
//    	 // WebDriver driver = new ChromeDriver();
//    	  driver.close();
//			System.out.println("done");
			
			
		}
	





