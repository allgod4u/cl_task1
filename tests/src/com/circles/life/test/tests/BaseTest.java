package com.circles.life.test.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.circles.life.pages.desktop.SignUpLoginPage;
import com.circles.life.pages.desktop.CustomerHomePage;
import com.circles.life.testframework.AppTest;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest extends AppTest{
	
	protected SignUpLoginPage signUpLoginPage;
	protected CustomerHomePage customerHomePage;
	public WebDriver driver;
	public AndroidDriver<WebElement> mobileDriver;

}
