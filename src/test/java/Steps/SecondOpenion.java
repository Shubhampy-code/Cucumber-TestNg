package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondOpenion {
	
	WebDriver driver;
	JavascriptExecutor js;
	
	@Given("Open browser, enter sparsh hospital url")
	public void open_browser_enter_sparsh_hospital_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.sparshhospital.com/");
	}

	@Given("select the Yashwantpur hospital from hospital dropdown")
	public void select_the_yashwantpur_hospital_from_hospital_dropdown() {
	    driver.findElement(By.xpath("(//a[@class=\"nav-link dropdown-toggle\"])[3]")).click();
	    driver.findElement(By.xpath("(//a[@href=\"https://www.sparshhospital.com/hospitals/sparsh-hospital-yeswanthpur/\"])[1]")).click();
	}

	@When("User select on second openion link")
	public void user_select_on_second_openion_link() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
	
		WebElement button = driver.findElement(By.xpath("(//a[@href=\"https://www.sparshhospital.com/second-opinion/\"])[1]"));
	    
		js.executeScript("arguments[0].click()", button);

	}

	@When("user enter the firstname,lastname, phone, email textbox")
	public void user_enter_the_firstname_lastname_phone_email_textbox() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		
		driver.findElement(By.id("secondopinion_first_name")).sendKeys("Shubham");
		driver.findElement(By.id("secondopinion_last_name")).sendKeys("Shrivastava");
		driver.findElement(By.id("secondopinion_phone")).sendKeys("9450067685");
		driver.findElement(By.id("secondopinion_email")).sendKeys("shubham.sda@gmail.com");
		driver.findElement(By.id("secondopinion_message")).sendKeys("Hi i want second openion");
		Thread.sleep(2);
		driver.findElement(By.cssSelector("[id=\"secondopinion_submit\"]")).click();
	}

	@When("upload the report")
	public void upload_the_report() {
	    
	}

	@Then("Thankyou message should be displayed")
	public void thankyou_message_should_be_displayed() {
	    
	}

	@Then("bank info should be available in the page.")
	public void bank_info_should_be_available_in_the_page() {
	    
	}


}
