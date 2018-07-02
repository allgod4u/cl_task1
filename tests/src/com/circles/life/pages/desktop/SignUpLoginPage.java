package com.circles.life.pages.desktop;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.circles.life.testframework.AppPage;

public class SignUpLoginPage extends AppPage{

	public SignUpLoginPage(WebDriver driver) {
		super(driver);
	}
	
	public SignUpLoginPage(WebDriver driver, String url)
	{
		super(driver);
		openURL(url);
	}
	
	public void validate(){
		assertTitle("Circuit City");
	}
	
	//WebElements
	@FindBy(name = "first_name")
	private WebElement firstNameField;
	
	@FindBy(name = "last_name")
	private WebElement lastNameField;
	
	@FindBy(name = "email")
	private WebElement emailField;
	
	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement createAccountBtn;
	
	//Action methods
	public CustomerHomePage login(String emailAddress, String password)
	{
		clearAndType(emailField, emailAddress);
		clearAndType(passwordField, password);
		clickOnElement(loginBtn);
		waitForPageLoadComplete();
		return new CustomerHomePage(driver);
	}
	
	public CustomerHomePage createAccount(String firstName, String lastName, String emailAddress, String password) {
		clearAndType(firstNameField, firstName);
		clearAndType(lastNameField, lastName);
		clearAndType(emailField, emailAddress);
		clearAndType(passwordField, password);
		clickOnElement(createAccountBtn);
		waitForPageLoadComplete();
		return new CustomerHomePage(driver);
	}
}
