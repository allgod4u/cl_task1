package com.circles.life.pages.desktop;

import org.openqa.selenium.WebDriver;

import com.circles.life.testframework.AppPage;


public class CustomerHomePage extends AppPage {

	public CustomerHomePage(WebDriver driver) {
		super(driver);
		waitForPageLoadComplete();
	}
}
