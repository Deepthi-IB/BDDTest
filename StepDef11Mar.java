package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef11Mar {
	WebDriver driver;
	@Given("User is on Gmail Login page")
	public void user_is_on_Gmail_Login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    System.out.println("Google HomePage is displayed");
	}


	@When("User clicks on Compose button")
	public void user_clicks_on_Compose_button() {
	    driver.findElement(By.xpath('//div[@style="user-select: none"]')).click();
	}


	@Then("enter the emails subject as {string} and body as {string} and recipient field as {string}")
	public void enter_the_email_s_subject_as_and_body_as_and_recipient_field_as(String subject, String body, String recipient) {
		driver.findElement(By.xpath('//input[@aria-label="To recipients"]')).sendKeys(recipient);
		driver.findElement(By.xpath('//div[@aria-label="Message Body"]')).sendKeys(body);
		driver.findElement(By.xpath('//input[@name="subjectbox"]')).sendKeys(subject);
	}

	
	@Then("click on CC and BCC links and enter in CC field as {string} and in BCC field as {string}")
	public void click_on_CC_and_BCC_links_and_enter_in_CC_field_as_and_in_BCC_field_as(String string, String string2) {
		driver.findElement(By.xpath('//span[@aria-label="Add Cc recipients ‪(Ctrl-Shift-C)‬"]')).click();
		driver.findElement(By.xpath('//input[@aria-label="CC recipients"]')).sendKeys(CC field);
		driver.findElement(By.xpath('//span[@aria-label="Add Bcc recipients ‪(Ctrl-Shift-B)‬"]')).click();
		driver.findElement(By.xpath('//input[@aria-label="BCC recipients"]')).sendKeys(BCC field);
	}

	@When("User clicks Send button and email is sent")
	public void user_clicks_Send_button_and_email_is_sent() {
		driver.findElement(By.xpath('//div[@aria-label="Send ‪(Ctrl-Enter)‬"]')).click();
	}


}
