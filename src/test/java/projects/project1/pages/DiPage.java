package projects.project1.pages;

import org.commons.models.DIWebElements;
import org.commons.selenium.DISelectorsManager;

public class DiPage extends DISelectorsManager {

	public DiPage() {
		super(DiPage.class);
	}

	public DIWebElements image;

	public void loadurl() {
		load();
	}

	public void goToImageSearchPage() {
		click(image);
		
	}
}
