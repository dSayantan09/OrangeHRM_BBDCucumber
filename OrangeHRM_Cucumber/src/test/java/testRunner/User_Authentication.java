package testRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class User_Authentication{
	WebDriver driver;
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
	}

	@When("the user enters valid username {string} and password {string}")
	public void the_user_enters_valid_username_and_password(String string, String string2) throws InterruptedException {
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
        uname.sendKeys("Admin");
        Thread.sleep(4000);
        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("admin123");
        Thread.sleep(4000);
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(4000);
	}

	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() throws InterruptedException {
	  System.out.println("Login Successful, Welcome to Dashboard");
	  Thread.sleep(4000);
	  driver.quit();
	}

	@Given("the user the redirects back to login page")
	public void the_user_the_redirects_back_to_login_page() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
	}

	@When("the user enters invalid username {string} and password {string}")
	public void the_user_enters_invalid_username_and_password(String string, String string2) throws InterruptedException {
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
        uname.sendKeys("Sayantan");
        Thread.sleep(4000);
        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("Sayonara0209");
        Thread.sleep(4000);
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(4000);
	}

	@Then("an error message {string} should be displayed")
	public void an_error_message_should_be_displayed(String string) throws InterruptedException {
		System.out.println("Login Unsuccessful");
		  Thread.sleep(4000);
		  driver.quit();
	}

	@Given("the user goes back to the login page")
	public void the_user_goes_back_to_the_login_page() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
	}

	@When("the user submits the login form with blank fields")
	public void the_user_submits_the_login_form_with_blank_fields() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(4000);
	}

	@Then("message {string} has to be displayed")
	public void message_has_to_be_displayed(String string) throws InterruptedException {
	    System.out.println("Please Enter the Username & Password");
	    Thread.sleep(4000);
	    driver.quit();
	}

	@Given("the user is logged in")
	public void the_user_is_logged_in() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
        WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
        uname.sendKeys("Admin");
        Thread.sleep(4000);
        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("admin123");
        Thread.sleep(4000);
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(4000);
	}

	@When("the user clicks the logout button")
	public void the_user_clicks_the_logout_button() throws InterruptedException {
		WebElement prof = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
        prof.click();
        Thread.sleep(4000);
        WebElement logout = driver.findElement(By.xpath("(//a[contains(text(),Logout)])[18]"));
        logout.click();
        Thread.sleep(4000);
	}

	@Then("the user should be redirected to the login page")
	public void the_user_should_be_redirected_to_the_login_page() throws InterruptedException {
	  System.out.println("Logout Successful, Welcome back to Login Page");
	  Thread.sleep(4000);
	  driver.quit();
	}
	
}