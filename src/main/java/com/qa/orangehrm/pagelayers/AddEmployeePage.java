package com.qa.orangehrm.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage {

	private By firstName_TF = By.name("firstName");
	private By middleName_TF = By.name("middleName");
	private By lastName_TF = By.name("lastName");
	private By save_Btn = By.xpath("//button[@type='submit' and .=' Save ']");
	private WebDriver driver;

	public AddEmployeePage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterEmployeeDetails(String firstName,
			String middleName, String lastName) {
		driver.findElement(firstName_TF).sendKeys(firstName);
		driver.findElement(middleName_TF).sendKeys(middleName);
		driver.findElement(lastName_TF).sendKeys(lastName);
	}

	public void clickSaveBtn()  {
	
		driver.findElement(save_Btn).click();
	}
}
