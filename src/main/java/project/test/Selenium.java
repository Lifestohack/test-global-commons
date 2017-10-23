package project.test;

import org.junit.Test;

public class Selenium extends TestCases {

	@Test
	public void Selenium(String testdataName) {
		System.out.print(testdataName);
		project.loadUrl();
		project.goToAboutUsPage();
	}

}