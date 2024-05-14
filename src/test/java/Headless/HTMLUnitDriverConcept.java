package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) {
		  WebDriver driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get("http://194.195.119.204:3000/");
	      String title = driver.getTitle();
	}

}
