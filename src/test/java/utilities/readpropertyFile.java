package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readpropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\Nina-PC\\eclipse-workspace\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");

		Properties p = new Properties();
		
		p.load(fr);
		
		System.out.println("browser");
		System.out.println("testurl");
		
	}

}
