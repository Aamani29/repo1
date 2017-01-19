import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManageBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
WebDriver driver = new FirefoxDriver();

driver.get("https://www.facebook.com/");

//driver.manage().window().maximize();
	}

}
