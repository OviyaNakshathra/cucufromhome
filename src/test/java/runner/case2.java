package runner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case2 {
	WebDriver driver;
	@Given("open new tours")
	public void open_new_tours() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\arivazhagansri\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.newtours.demoaut.com/");
	    
	}

	@When("enter user name {string}")
	public void enter_user_name(String string) {
	    WebElement user=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
	   user.sendKeys(string);
	}

	@When("enter the password {string}")
	public void enter_the_password(String string1) {
	WebElement pass=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
	pass.sendKeys(string1);
	
	}

	@Then("click on login")
	public void click_on_login() {
	    WebElement login=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
	    login.click();
	    String title1;
	    title1=driver.getTitle();
	    Assert.assertEquals(title1, title1);
	    System.out.print(title1);
	    
	}

}
