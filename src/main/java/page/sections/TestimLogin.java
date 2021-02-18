package page.sections;

import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import extensions.TestimExtension;

public class TestimLogin {
	
	TestimExtension testExtension = new TestimExtension();

	public void testimClickLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
//		testExtension.setExtension();
		
//		ChromeOptions options = new ChromeOptions();
//        options.addExtensions(new File("C:\\\\Users\\\\User\\\\Downloads\\\\testim.crx"));
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        ChromeDriver driver = new ChromeDriver(capabilities);
        
//        WebDriver driver = new ChromeDriver();
        
//        System.out.println("Opening extension");
//        driver.manage().window().maximize();
//		Thread.sleep(500);
//        driver.get("https://testim.io/");
//        Thread.sleep(1000);
//        driver.manage().window().maximize();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        System.out.println("Refresh successfully");
//		
//		
//		
//		
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.xpath("//a[contains(.,'Login')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@name='email']")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hdas@cisscom.com");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@name='password']")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("janina@@00");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(.,'Sign In')]")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//span[@class='icon-background f-col-center Editor']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='step']")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//button[@class='Recording']")).click();
//		Thread.sleep(3000);
		
		//handle new tab
		
//		String parentTab = driver.getWindowHandle();
//		System.out.println("Current window ID is: "+ parentTab);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("javascript:window.scrollBy(0,2000)");
//		
//		Thread.sleep(1000);
//		
//		
//		
//		driver.findElement(By.xpath("(//a[@class='btn'])[2]")).click();
//		Thread.sleep(1000);
//		
//		Set<String> allWindows = driver.getWindowHandles();
//		int count = allWindows.size();
//		System.out.println("Total Windows: "+count);
//		
//		for(String child:allWindows) {
//			
//			if(!parentTab.equalsIgnoreCase(child)) {
//				driver.switchTo().window(child);
//			}
//		}
//		
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		driver.close();
//		driver.switchTo().window(parentTab);
//		driver.navigate().refresh();
		
		
		//handle new windows
		
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(1000);
		Set <String> windowsIds = driver.getWindowHandles();
		Iterator <String> iter = windowsIds.iterator();
		
		String mainWindow = iter.next();
		String childWindow= iter.next();
		driver.switchTo().window(childWindow);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
	}
}
