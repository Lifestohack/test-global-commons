package projects.project1.pages;

import org.commons.models.DIWebElements;
import org.commons.selenium.DISelectorsManager;

public class DiPage extends DISelectorsManager {

	public DiPage() {
		super(DiPage.class);
	}

	public DIWebElements dashboard;

	public void loadurl() {
		load();
	}

	public void goToAboutUsPage() {
		click(dashboard);
	}
}
