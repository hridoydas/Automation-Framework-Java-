package base;

import pages.HomePage;

public class BaseTests {
	
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");	
		
		HomePage homepage = new HomePage();
	
		homepage.homepageSteps();
		
		
		
//		driver.manage().window().setSize(new Dimension(800, 600));
//		Thread.sleep(1000);
		
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(.,'Log in')]")).click(); 
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("Hridoy");
//		Thread.sleep(2000);
//		
//		String a=  driver.findElement(By.xpath("//label[@for='log-name']")).getText();
//		
//		String checkName= "Usernamess";
//		System.out.println(a);
//		String[] b = a.split(":");
//		
//		System.out.println(b[0]);
//		
//		if (checkName.matches(b[0])) {
//			System.out.println("User name is matched");
//		}
//		else {
//			System.out.println("User name does not matched");
//		}
//		
//		String cssValue =  driver.findElement(By.xpath("(//div[@class='form-group'])[7]")).getCssValue("background-color");
//		System.out.println(cssValue);
		
//		driver.quit();
		
	}
	
	
	
	public static void main(String args[]) throws InterruptedException {
		
		BaseTests test = new BaseTests();
		test.setUp();
	}
}
