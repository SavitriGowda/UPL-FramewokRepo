package testPages;


import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reusableComponents.ExcelOperations;
import testBase.TestBase;
public class AddLessons_Test extends TestBase {
	String filePath=System.getProperty("user.dir")+"\\src\\test\\resource\\testData\\AddLessons.xlsx";
	ExcelOperations excel=new ExcelOperations(filePath, "Sheet1");
	
	

	@Test(dataProvider = "getData")
	public void addlesson(Object obj) throws Exception {
		loginpage.login();
		HashMap<String, String> testData=(HashMap<String, String>) obj;
		lessonpageobjects.AddLesson(testData);
		lessonpageobjects.testMessage();
		//Assert.ass
	}

	@DataProvider(name = "getData")
	public Object[][] getTestData() throws Exception {
		Object[][] obj = new Object[excel.getRowCount()][1];
		for (int i = 1; i <= excel.getRowCount(); i++) {
			HashMap<String, String> testData=excel.getTestDataInMap(i);
			obj[i-1][0]=testData;
		}
		return obj;

	}
}

	
	


