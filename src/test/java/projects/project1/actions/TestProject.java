package projects.project1.actions;

import projects.project1.pages.DiPage;

public class TestProject {

	DiPage diPage;

	public TestProject() {
		diPage = new DiPage();
	}

	public void loadUrl() {
		diPage.loadurl();
	}

	public void goToAboutUsPage() {
		diPage.goToAboutUsPage();
	}

}
