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

public class FBLogin2 extends StaticVariables {

	@When("Clear the data then Enter valid credentials")
	public void clear_the_data_then_enter_valid_credentials() throws Exception {
		Thread.sleep(10000);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("h2otestingtools@gmail.com");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("pallavi@7");
	}

	@Then("Verify the user has loggedin successfully")
	public void verify_the_user_has_loggedin_successfully() {
		if (driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0
				|| driver.findElements(By.linkText("Find your account and log in.")).size() > 0) {
			System.out.println("Given Credentials were invalid.........");

		} else {
			System.out.println("Given Credentials were valid..........");
			// develop the code for Logout
		}
	}

}
