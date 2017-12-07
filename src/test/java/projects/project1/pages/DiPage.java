package projects.project1.pages;

import org.commons.models.DIWebElements;
import org.commons.selenium.DIWebPageActions;
import org.openqa.selenium.WebDriver;

public class DiPage extends DIWebPageActions{

	public DIWebElements image;
	
	public DiPage(WebDriver driver) {
		super(driver);
		System.out.println("DiPage is initiated.....");
	}

	public void loadurl() {
		load();
	}

	public void goToImageSearchPage() {
		click(image);
		
	}
}
