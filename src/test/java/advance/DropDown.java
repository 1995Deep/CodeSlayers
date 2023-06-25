package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/dropdown");
	driver.manage().window().maximize();
	
	
	WebElement dropdown = driver.findElement(By.id("dropdown"));
	
	Select sel = new Select(dropdown);
	//sel.selectByIndex(2);
	//sel.selectByValue("1");
	sel.selectByVisibleText("Option 2");
	driver.close();
	
	//driver.get("https://www.macys.com/?trackingid=486x887349&m_sc=sem&m_sb=Google&m_tp=Text&m_ac=Google_Trademark&m_ag=GGL_Trademark_Core_Macys_Exact&m_cn=GGL_Trademark_Core_Exact&m_pi=go_cmp-10091130926_adg-102928468058_ad-605549892883_aud-942843544955:kwd-13122476_dev-c_ext-_prd-&gclid=EAIaIQobChMI1OWFlcj1_gIVqvfjBx2d2ADaEAAYASAAEgIn7_D_BwE");
	

	
	}

}
