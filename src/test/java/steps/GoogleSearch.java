package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleHome;

public class GoogleSearch extends GoogleBase{
	
	


	GoogleHome gh;
		
	
	//WebDriver driver;
	


	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
	   
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver ();
		
		//driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		
		launchBrowser();
		
		
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
	    
		//Identify the web element ( Finding the Locator) & named it
		
		//WebElement searchBox;
		//searchBox = driver.findElement(By.id("APjFqb"));
		
		//WebElement searchBox = driver.findElement(By.name("q"));
				
		
		//perfrom action
		
		//searchBox.sendKeys(string);

		gh = new GoogleHome(driver);
		gh.enterSearch(string);	
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
	    //WebElement searchBtn;
		//searchBtn = driver.findElement(By.className("gNO89b"));
		
		//WebElement searchBtn =driver.findElement(By.className("gNO89b"));
		
		//searchBtn.click();
		
		gh.clickSearch();
		
		
		}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		
		WebElement resultStats = driver.findElement(By.id("result-stats"));
		String displayResults= resultStats.getText();
		
		
		//String results = resultStats.getText();
		
		System.out.println("========================================");
		System.out.println(displayResults);
		System.out.println("========================================");
		
		
		closeBrowser();
		
	   
	}


		

	

}
