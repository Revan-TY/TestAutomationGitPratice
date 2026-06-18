package com.qa.orangehrm.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	private By profileOptions = By.xpath("//img[@class='oxd-userdropdown-img']");
	private By Logout_btn = By.xpath("//a[.='Logout']");
	private By pim_btn = By.xpath("//span[.='PIM']");
	private WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickProfileOptions() {
		driver.findElement(profileOptions).click();
	}

	public void clickLogoutBtn() {
		driver.findElement(Logout_btn).click();

	}

	public void clickPimBtn() {
		driver.findElement(pim_btn).click();
		;
	}
}
