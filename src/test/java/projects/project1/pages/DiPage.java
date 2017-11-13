package projects.project1.pages;

import org.commons.models.DIWebElements;
import org.commons.selenium.DIWebPageActions;

public class DiPage extends DIWebPageActions{

	public DIWebElements image;
	
	public DiPage() {
		System.out.println("DiPage is initiated.....");
	}

	public void loadurl() {
		load();
	}

	public void goToImageSearchPage() {
		click(image);
		
	}
}
