package projects.project1.actions;

import org.commons.selenium.DIPageFactory;
import org.openqa.selenium.WebDriver;

import projects.project1.pages.DiImage;
import projects.project1.pages.DiPage;

public class TestProject extends DIPageFactory {

	public TestProject(WebDriver driver) {
		super(driver);
	}

	public void loadUrl() {
		getPage(DiPage.class).loadurl();
	}

	public void goToImageSearchPage() {
		getPage(DiPage.class).goToImageSearchPage();
	}

	public void typeSearchText() {
		getPage(DiImage.class).searchImageText();
	}
}