package practicetestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDummy2 {
@Test (description="open Chrome Browser",timeOut=55000)
public void method( )throws Exception
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	
}
}
