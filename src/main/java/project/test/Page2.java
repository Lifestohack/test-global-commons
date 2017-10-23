package project.test;

import org.commons.models.DIWebElements;
import org.commons.selenium.DISelectorsManager;

public class Page2 extends DISelectorsManager{

	@SuppressWarnings("rawtypes")
	public Page2(Class clazz) {
		super(clazz);
	}

	public DIWebElements dashboard;
	
	
	public void loadurl() {
		load();
	}

	public void goToAboutUsPage() {
		click(dashboard);
	}
}
