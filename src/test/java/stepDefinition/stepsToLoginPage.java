package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class stepsToLoginPage {

	WebDriver driver;

	@Given("Open application")
	public void open_application() {
		// Write code here that turns the phrase above into concrete actions
		
		driver = new ChromeDriver();
		
		driver.get("https://petstore.octoperf.com/");
		driver.manage().window().maximize();
		System.out.println("Application opened successfully.");
	}

	@When("Click on Enter the store link")
	public void click_on_enter_the_store_link() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Enter the Store")).click();
		System.out.println("user entered the store link.");
	}

	@When("Click on Sign on Button")
	public void click_on_sign_on_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Sign In")).click();
		System.out.println("user clicked on sign on button");
	}

	@Then("Navigate to Login page")
	public void navigate_to_login_page() {
		// Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		if(title=="JPetStore Demo") {
			System.out.println("User navigated to login page sucessfully");
		}
		else {
			System.out.println("User is not navigated to login page sucessfully");	
		}
	}
	
	@When("User enter the username and password")
	public void user_enter_the_username_and_password(){
		System.out.println("user entered the user nd passwords.");
	}
	
	@And("User clicked on the login button")
	public void User_clicked_on_the_login_button() {
		System.out.println("user clicked on submit button.");
	}
	
	@When("Entered the username and password")
	public void entered_the_username_and_password(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		System.out.println("User entered username and password.");
		
	}
	@And("User clicked on the login button")
	public void user_clicked_on_the_login_button() {
		driver.findElement(By.name("signon")).click();
	}
	
	
	@Then("User logged in successfull.")
	public void user_logged_in_successfull() {
		System.out.println("logged in successfully.");
	}

}
