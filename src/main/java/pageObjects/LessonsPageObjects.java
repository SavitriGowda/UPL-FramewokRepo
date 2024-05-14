package pageObjects;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableComponents.CommonMethods;
import testBase.TestBase;

public class LessonsPageObjects extends TestBase{
	// Page Object
		@FindBy(xpath = "//*[@id='right-container']/div/div/div/ul/li[5]")
		WebElement lessons ;
		@FindBy(xpath = "//button[normalize-space()='Add Lesson']")
		WebElement AddLessons ;
		@FindBy(xpath= "//div[@id='course-id-label']")
		WebElement CourseFilled;
		@FindBy(xpath ="//div[@id='menu-']/div[3]/ul/li")
		List<WebElement> listOfLessons;
	    @FindBy(name ="lesson_name")
		WebElement LessonName;
		@FindBy(name = "content")
		WebElement Content;
		@FindBy(xpath = "//button[@type='submit']")
		WebElement Submit;
		@FindBy(xpath = "//div[contains(text(),'You have successfully uploaded lessons')]")
		WebElement successMsg;
		@FindBy(xpath = "//div[contains(text(),'Email or phone number already exists Please TRY ag')]")
		WebElement errorMsg;

		public LessonsPageObjects() {
			PageFactory.initElements(driver, this);
		}

		public void AddLesson(HashMap<String, String> testdata) throws InterruptedException{
			CommonMethods.click(lessons);
			CommonMethods.click(AddLessons);
			CommonMethods.click(CourseFilled);
			CommonMethods.dynamicDropDown(listOfLessons, testdata.get("Course"));
			CommonMethods.sendKeysToElement(LessonName,testdata.get("Lesson Name"));
			CommonMethods.sendKeysToElement(Content,testdata.get("Content"));
			CommonMethods.click(Submit);
			

		}

		public String testMessage() {
			if (successMsg.isDisplayed()) {
				return successMsg.getText();
			} else {
				return errorMsg.getText();
			}

		}

	
	

}
