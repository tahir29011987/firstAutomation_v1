package com.firstAutomation.testCases;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class login_Page {
	public WebDriver ldriver;
	
	public login_Page(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(xpath="//*[@id='nav-link-accountList-nav-line-1']")
	WebElement Sign;
	@FindBy(xpath="//*[@name='email']")
	WebElement Userid;
	
	@FindBy(xpath="//*[@id='continue']")
	WebElement Cont;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement Pass;
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	WebElement Login;
	
/* @FindBy(xpath="//*[@class='oxd-main-menu-item active']")
	  WebElement Dash;
	 
	 @FindBy(xpath="//*[@class='oxd-text oxd-text--p']")
	 String nam;*/
	public void Sigsub() {
		Sign.click();	
		}
	public void Setusername(String Userids) {
		Userid.sendKeys(Userids);
	}
	public void Contsub() {
		Cont.click();
	}
	public void Setpassword(String Passs) {
		Pass.sendKeys(Passs);
		
	}
	
	public void Actsub() {
		Login.click();
	}
	/*public String Dash_Add() {
		Dash.click();
		return null;
	}*/
	
}
 