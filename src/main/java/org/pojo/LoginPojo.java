package org.pojo;

import org.baseclass.BaseClasses;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClasses {
	
	public LoginPojo() {
		
		PageFactory.initElements(Sun, this);
	}
	
	@FindBy(name="email")
	private WebElement Emailid;
	
	@FindBy(id="pass")
	private WebElement Password;
	
	@FindBys({
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(xpath="//input[@class='inputtext _55r1 _6luy _9npi']"),
		@FindBy(id="pass")
	})
	private WebElement loginBys;
	
	// @FindBy()
	

	public WebElement getLoginBys() {
		return loginBys;
	}

	public WebElement getEmailid() {
		return Emailid;
	}

	public WebElement getPassword() {
		return Password;
	}

//	public WebElement getLogin() {
//		return login;
//	}
	
	
}
