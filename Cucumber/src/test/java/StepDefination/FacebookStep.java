package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class FacebookStep {
	WebDriver driver;
	@Given("Open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\A\\Selenium1\\Browser\\chromedriver.exe");
		 driver=new ChromeDriver();
	}

	@And("Open the application")
	public void open_the_application() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User enter UN and Pwd")
	public void user_enter_un_and_pwd() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("poharkar.roshani@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Kapneel@1617");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
	}

	@Then("User is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		String expName="Roshani Poharkar";
		String actName=driver.findElement(By.xpath("//span[text()='Roshani Poharkar']")).getText();
		if(expName.equals(actName)) {
			System.out.println("Tc is pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
