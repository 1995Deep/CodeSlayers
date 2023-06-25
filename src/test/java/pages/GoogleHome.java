package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
	
	
	WebDriver driver;
	
	public GoogleHome(WebDriver diver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
		//WebElement searchBox = driver.findElement(By.name("q"));
		
	@FindBy(name="q")
	WebElement searchBox;
	
	
		//searchBox.sendKeys(string);
		
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
		
	}
		
	//WebElement searchBtn =driver.findElement(By.className("gNO89b"));
	@FindBy(className="gNO89b")
	WebElement searchBtn;
	


   public void clickSearch() {
	searchBtn.click();
	
}




	

}
