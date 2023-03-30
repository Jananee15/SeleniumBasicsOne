package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Morad\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.facebook.com/");

	}

}
