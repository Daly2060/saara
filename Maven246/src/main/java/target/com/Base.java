package target.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base
{
    WebDriver dr;

	@Before
  public void test1(String fileName) throws IOException{
	  FileInputStream f = new FileInputStream("config.properties");
	  Properties p = new Properties();
	  p.load(f);
	  
	  String b=p.getProperty("browser");
	  
	  if(b.equals("firefox")){
		System.setProperty("", "");
		dr = new FirefoxDriver();
		System.out.println("");
	  }else if(b.equals("chrome")){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DALY\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  dr = new ChromeDriver();
		  System.out.println(" Jeasmin");
	  }
	  dr.get(p.getProperty("http://www.target.com"));
}
}



