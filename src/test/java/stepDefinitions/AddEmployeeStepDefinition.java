package stepDefinitions;

import com.qa.orangehrm.pagelayers.AddEmployeePage;
import com.qa.orangehrm.pagelayers.DashboardPage;
import com.qa.orangehrm.pagelayers.PIMPage;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeStepDefinition {

	AddEmployeePage aep;
	DashboardPage dashboard;
	PIMPage pim;

	@Given("user should be present in Addemployee page")
	public void user_should_be_present_in_addemployee_page() {
		dashboard = new DashboardPage(Hooks.driver);
		pim = new PIMPage(Hooks.driver);
		aep = new AddEmployeePage(Hooks.driver);
		dashboard.clickPimBtn();
		pim.clickaddEmployeebtn();
	}   // 102 - Raj#8419

	@When("user enter valid firstname middlename lastname")
	public void user_enter_valid_firstname_middlename_lastname() {
		aep.enterEmployeeDetails("abc", "abc12", "abc123");
	}

	@When("user enter valid {string} {string} {string}")
	public void user_enter_valid(String firstname, String middlename, String lastname) {
		aep.enterEmployeeDetails(firstname, middlename, lastname);
		System.out.println(firstname + " " + middlename + " " + lastname);
	}

	@When("click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		Thread.sleep(2000);
		aep.clickSaveBtn();
	}

	@Then("Employee should be added successfully")
	public void employee_should_be_added_successfully() {

		System.out.println("employee added successfully");
		dashboard.clickProfileOptions();
		dashboard.clickLogoutBtn();

	}

}
