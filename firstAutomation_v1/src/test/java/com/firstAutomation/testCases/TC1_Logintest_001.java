package com.firstAutomation.testCases;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
  
	public class TC1_Logintest_001 extends BaseClass1 {
		
	//@SuppressWarnings("deprecation")
	@Test
	public void loginpg() {
		driver.get(URL);
		String ur="OrangeHRM";
		login_Page Basclas=new login_Page(driver);
		Basclas.Sigsub();
		Basclas.Setusername(Userids);
		Basclas.Contsub();
		Basclas.Setpassword(Passs);
		Basclas.Actsub();
	//String a=Basclas.Dash_Add();
	//String rt=Basclas.nam;
	        
		//if(driver.getTitle().equals("OrangeHRM"));{
		
	//assert.assertTrue(true);
		{
	if(driver.getTitle().equals("Amazon.in")) {
		System.out.println("True");
		
	}
	}
	}
	}
	/*else {
			
			System.out.println("False");
		}
		/*if(driver.getTitle().equals(ur)) {
			System.out.println("TRUE");
			}else {
				System.out.println("FALSE");}*/
		
	
/*	if(rt.equals(a)) {
		System.out.println("Working fine");
	}else {
		System.out.println("Not Working");
	}*/
	
	
	

