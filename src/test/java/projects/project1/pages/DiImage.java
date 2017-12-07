package projects.project1.pages;

import org.commons.models.DIWebElements;
import org.openqa.selenium.WebDriver;

public class DiImage extends DiPage{

	public DiImage(WebDriver driver) {
		super(driver);
	}


	public DIWebElements textToSearch, search;


	public void searchImageText() {
		useValue(textToSearch, "was just a joke");
		click(search);
	}
}
