package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxHeadless {

	public static void main(String[] args) {

		ProfilesIni pi = new ProfilesIni();
		FirefoxProfile fp=pi.getProfile("myprofile");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://194.195.119.204:3000/");
		
		
	}

}
