package Headless;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class HeadlessBrowser2 {
      public static void main(String[] args) {
	  FirefoxOptions options = new FirefoxOptions();
	  options.addArguments("--headless");	
      WebDriver driver = new FirefoxDriver(options);
      driver.manage().window().maximize();
      driver.get("http://194.195.119.204:3000/");
      String title = driver.getTitle();
      System.out.println(title);
      driver.quit();
	}
}
