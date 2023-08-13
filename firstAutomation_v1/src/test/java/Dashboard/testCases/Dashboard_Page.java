package Dashboard.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.firstAutomation.testCases.login_Page;

public class Dashboard_Page extends login_Page {
	
	public Dashboard_Page(WebDriver rdriver) {
		super(rdriver);
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
		}
      
	  @FindBy(xpath="//*[@class='oxd-main-menu-item active']")
	  WebElement Dash;
	  
 public void Dash_Submit() {
	 Dash.click();
 
}
}


