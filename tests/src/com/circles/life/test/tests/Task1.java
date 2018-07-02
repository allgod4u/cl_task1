package com.circles.life.test.tests;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.circles.life.pages.desktop.CustomerHomePage;
import com.circles.life.pages.desktop.SignUpLoginPage;
import com.circles.life.test.data.TestConstants;
import com.circles.life.test.helper.TestHelper;
import com.circles.life.testframework.MobilePage;



/*
 * Write the script for, Login in to website. Verify your email address under My account
 * 
 */
public class Task1 extends BaseTest{

	protected SignUpLoginPage signUpLoginPage;
	protected CustomerHomePage customerHomePage;
	public WebDriver driver;
	
	@BeforeTest()
	public void goToSignUpLoginPage() {
		signUpLoginPage = new SignUpLoginPage(getWebDriver(), TestConstants.SIGNUP_URL);
	}
	
	@Test(description = "Write the script for, Login in to website. Verify your email address under My account")
	public void testEmailAddressAfterLogin() {
		customerHomePage = signUpLoginPage.createAccount(TestConstants.FIRST_NAMES[TestHelper.getRandomNumber(1, 5)], TestConstants.LAST_NAMES[TestHelper.getRandomNumber(1, 5)], TestHelper.getUniqueEmailAddress() , TestConstants.PASSWORD);
	}
	
	
}
