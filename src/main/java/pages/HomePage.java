package pages;

import page.sections.ElementsSection;
import page.sections.TestimLogin;

public class HomePage extends ElementsSection {

	ElementsSection elementsSection = new ElementsSection();
	TestimLogin testimLogin = new TestimLogin();
	
	public void homepageSteps() throws InterruptedException {

//		 	new ChromeDriver();
//			elementsSection.studentRegistrationForm();
			testimLogin.testimClickLogin();
		
		
	}
}
