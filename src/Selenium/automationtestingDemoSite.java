package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class automationtestingDemoSite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Morad\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://demo.automationtesting.in/Index.html");
		Thread.sleep(3000);
		
		WebElement signUpButton =driver.findElement(By.cssSelector("#enterimg"));
		signUpButton.click();
		/*WebElement firstName=driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		firstName.sendKeys("JananeeAnandh");
		WebElement lastName=driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		lastName.sendKeys("Anandh");
		WebElement address=driver.findElement(By.xpath("//*[@ng-model='Adress']"));//*[@id="basicBootstrapForm"]/div[2]/div/textarea
		address.sendKeys("Thanjavur");
		WebElement email =driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
		email.sendKeys("abc@gmail.com");
		WebElement gender=driver.findElement(By.cssSelector("input[value='Male']"));
		gender.click();*/
		WebElement language=driver.findElement(By.cssSelector("#msdd"));
		language.click();
		WebElement english=driver.findElement(By.xpath("//a[text()='English']"));
		english.click();
		//WebElement =driver.findElement(By);
		
		
		
	}

}
