package page.sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsSection {

	public void studentRegistrationForm() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		
//		driver.get("https://demoqa.com/");
//		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='card-body'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(.,'Text Box')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='userName']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Hridoy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("hdas@cisscom.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Demo Current Address");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Demo Permanent Address");
		Thread.sleep(2000);
		String submitButton = driver.findElement(By.xpath("//button[@id='submit']")).getText();
		System.out.println(submitButton);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
		String username = driver.findElement(By.xpath("//p[@id='name']")).getText();
		String[]name= username.split("Name:");
		StringBuilder sequence = new StringBuilder();
		for(int i = 0;i<name.length;i++) {
			sequence.append(name[i]);
		}
		
		String demoName = sequence.toString();
		System.out.println(sequence.toString());
		
		String myName = "Hridoy";
		if(myName.matches(demoName)) {
			System.out.println("Username is matched with "+ demoName);
		}
		else {
			System.out.println("Username is not matched");
		}
		
	}
	
	
}
