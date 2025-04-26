package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class LoginPage extends MasterClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//	Login
	@FindBy(id = "otherTileText")
	private WebElement anotherAct;

	public WebElement anotherAccount() {
		return anotherAct;
	}

	// email
	@FindBy(id = "i0116")
	private WebElement email;

	public WebElement enterEmail() {
		return email;
	}

//	next button
	@FindBy(xpath = "//input[@value='Next']")
	private WebElement nxtbtn;

	public WebElement nextBtn() {
		return nxtbtn;
	}

// password
	@FindBy(id = "i0118")
	private WebElement pwd;

	public WebElement enterPwd() {
		return pwd;
	}

//sign in button
	@FindBy(xpath = "//input[@value='Sign in']")
	private WebElement signin;

	public WebElement signInBtn() {
		return signin;
	}

	@FindBy(xpath = "//input[@value='Yes']")
	private WebElement yesbtn;

	public WebElement yesBtn() {
		return yesbtn;
	}

}
