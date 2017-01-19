
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver=new FirefoxDriver();
   System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
  driver.get("http//www.makemytrip.com");
  
	}

}
