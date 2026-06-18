package com.qa.orangehrm.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {
	private By addEmployee_btn = By.xpath("//a[.='Add Employee']");
	private WebDriver driver;

	public PIMPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickaddEmployeebtn() {
		driver.findElement(addEmployee_btn).click();
	}
}
