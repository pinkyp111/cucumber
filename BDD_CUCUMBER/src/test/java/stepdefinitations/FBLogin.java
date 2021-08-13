package stepdefinitations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.StaticVariables;

public class FBLogin extends StaticVariables{


	@Given("Open FB URL")
	public void open_fb_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Successfully Open the FB URL");
	}

	@When("User enter invalid credentials")
	public void user_enter_invalid_credentials() {
		// Type UN & PWD
		driver.findElement(By.name("email")).sendKeys("srewvsr3w34@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("asfaskjfaskf");
	}

	@And("Click on Login button")
	public void click_on_login_button() throws Exception {
		driver.findElement(By.name("login")).click();
		Thread.sleep(9000);
	}

	@Then("Application should display the validation Message")
	public void application_should_display_the_validation_message() {
		// validate the Error page text
		if (driver.findElements(By.linkText("Create a new Facebook account.")).size()>0 ||
				driver.findElements(By.linkText("Find your account and log in.")).size()>0) {
			System.out.println("Given Credentials were invalid.........");

		} else {
			System.out.println("Given Credentials were valid..........");
		}
	}
}
