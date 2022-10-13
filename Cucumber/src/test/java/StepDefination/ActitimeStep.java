package StepDefination;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class ActitimeStep {
  WebDriver driver;
@Given("Browser is open")
public void browser_is_open() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\A\\Selenium1\\Browser\\chromedriver.exe");
  driver=new ChromeDriver();
}

@Given("User is on login page")
public void user_is_on_login_page() {
	driver.get("https://demo.actiTime.com/login.do");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("user should enter Un and Pwd")
public void user_should_enter_un_and_pwd() {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
   
}

@Then("User should navigate to home page")
public void user_should_navigate_to_home_page() {
  String expTitle="Enter Time-Track";
  String actTitle=driver.findElement(By.xpath("//a[text()='Enter Time-Track']")).getText();
  if(expTitle.equals(actTitle)) {
	  System.out.println("Tc is pass");
  }
  else {
	  System.out.println("Fail");
  }
}
}
