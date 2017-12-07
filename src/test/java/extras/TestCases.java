package extras;

import org.commons.selenium.DISetUp;
import org.commons.selenium.DIWebDriver;
import org.openqa.selenium.WebDriver;

import projects.project1.actions.TestProject;

public class TestCases extends DIWebDriver{

	public TestProject project;
	
	public TestCases() {
		DISetUp.setUpLogDirectory();
		WebDriver driver = getDriver();
		project = new TestProject(driver);	
	}
	
	public void getAllSelectors() {
		System.out.println();
		
	}
	
	
}
