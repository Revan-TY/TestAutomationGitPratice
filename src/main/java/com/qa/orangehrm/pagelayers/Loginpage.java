package com.qa.orangehrm.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	private By username_TF = By.name("username");
	private By Login_btn = By.xpath("//button[@type='submit']");
	private By password_TF = By.name("password");
	private WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String username, String password) {
		driver.findElement(username_TF).sendKeys(username);
		driver.findElement(password_TF).sendKeys(password);
		driver.findElement(Login_btn).click();
		;
	}

}
