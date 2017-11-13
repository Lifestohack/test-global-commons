package projects.project2.testcases;

import org.commons.selenium.DISetUp;
import org.commons.selenium.TestDataProvider;
import org.testng.annotations.Test;

import extras.TestCases;

public class Selenium {


	
	@Test
	public void SeleniumTest() {
		System.out.println(DISetUp.getSelectorsPath());
	}

}