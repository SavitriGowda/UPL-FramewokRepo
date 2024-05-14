package Headless;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HeadlessBrowser {
      public static void main(String[] args) {
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless");	
      WebDriver driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.get("http://194.195.119.204:3000/");
      String title = driver.getTitle();
      System.out.println(title);
      driver.quit();
	}
}
