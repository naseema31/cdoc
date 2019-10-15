package com.crm.qa.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSevice {

	
	@FindBy(name="email")
	WebElement email;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signupbtn;
	
	@FindBy(xpath="//img[contains(@class,'fb_logo img sp_ydUEsVjCbun sx_7e0f83')]")
	WebElement fbLogo;
	
	
	public loginPage() {
		PageFactory.i
	}
	
	
}
