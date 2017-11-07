package projects.project1.pages;

import org.commons.models.DIWebElements;
import org.commons.selenium.DISelectorsManager;

public class DiImage extends DISelectorsManager {

	public DiImage() {
		super(DiImage.class);
	}

	public DIWebElements dashboard;

	public void loadurl() {
		load();
	}

	public void goToImageSearchPage() {
		// TODO Auto-generated method stub
		
	}
}
