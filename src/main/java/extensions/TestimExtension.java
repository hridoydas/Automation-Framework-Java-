package extensions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestimExtension {

	@SuppressWarnings("deprecation")
	public void setExtension() throws InterruptedException {
		
//		WebDriver driver = null;
//		ChromeOptions options = new ChromeOptions();
//        options.addExtensions(new File("C:\\Users\\User\\Downloads\\testim.crx"));
//
//        DesiredCapabilities desiredCapabilites = DesiredCapabilities.chrome();
//        desiredCapabilites.setCapability(ChromeOptions.CAPABILITY,options);
//        
//        WebDriver driver = new ChromeDriver(desiredCapabilites);
        
		
		ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\\\Users\\\\User\\\\Downloads\\\\testim.crx"));

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        ChromeDriver driver = new ChromeDriver(capabilities);
        
//        WebDriver driver = new ChromeDriver();
        
        System.out.println("Opening extension");
        driver.manage().window().maximize();
		Thread.sleep(500);
        driver.get("https://testim.io/");
        Thread.sleep(1000);
        driver.navigate().refresh();
        System.out.println("Refresh successfully");
	}
}
