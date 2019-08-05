package stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Contactdeatil {
	WebDriver driver;
	@Before()
	public void setup() throws IOException {
	System. setProperty("webdriver.chrome.driver", "C:\\Users\\mjbis\\Desktop\\Browser\\chromedriver_win32\\chromedriver.exe");
	this.driver = new ChromeDriver();
	this.driver.manage().window().maximize();
	this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
	
		@Given("^I am able to acess \"([^\"]*)\"$")
		public void i_am_able_to_acess(String url) throws Throwable {
		    driver.get(url);
		}

		@When("^I click on Contact Us page$")
		public void i_click_on_Contact_Us_page() throws Throwable {
		    driver.findElement(By.id("contact-us")).click();
		}
}
/*
		@Then("^I enters the \"([^\"]*)\" firstname$")
		public void i_enters_the_firstname(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^I enter the \"([^\"]*)\" last name$")
		public void i_enter_the_last_name(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^I enter \"([^\"]*)\" email address$")
		public void i_enter_email_address(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^I enter the \"([^\"]*)\" comment$")
		public void i_enter_the_comment(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^I click on Submit button$")
		public void i_click_on_Submit_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^I am able to sucessfully submit the request$")
		public void i_am_able_to_sucessfully_submit_the_request() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}
	}

}
*/