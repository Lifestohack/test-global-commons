package extras;

import org.commons.selenium.DISetUp;

import projects.project1.actions.TestProject;

public class TestCases {

	public TestProject project;
	
	public TestCases() {
		DISetUp.setUpLogDirectory();
		project = new TestProject();
		
	}
	
	public void getAllSelectors() {
		System.out.println();
		
	}
	
	
}
