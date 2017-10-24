package projects.project1.testcases;

import org.commons.selenium.TestDataProvider;
import org.testng.annotations.Test;

import extras.TestCases;

public class Selenium extends TestCases {


	
	@Test(dataProvider = "dataProvider", dataProviderClass = TestDataProvider.class)
	public void SeleniumTest(String testdataName) {
		
		
		
		project.loadUrl();
		project.goToAboutUsPage();
	}

}