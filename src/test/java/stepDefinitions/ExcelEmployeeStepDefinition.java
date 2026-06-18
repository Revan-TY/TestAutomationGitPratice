package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.qa.orangehrm.pagelayers.AddEmployeePage;
import com.qa.orangehrm.pagelayers.DashboardPage;
import com.qa.orangehrm.pagelayers.PIMPage;

import handlingdata.ReadExcel;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExcelEmployeeStepDefinition {
	AddEmployeePage aep;
	DashboardPage dashboard;
	PIMPage pim;

	@Given("add employee page")
	public void add_employee_page() {
		dashboard = new DashboardPage(Hooks.driver);
		pim = new PIMPage(Hooks.driver);
		aep = new AddEmployeePage(Hooks.driver);
		dashboard.clickPimBtn();
		pim.clickaddEmployeebtn();

	}

	@When("user enter  firstname middlename lastname {int}")
	public void user_enter_firstname_middlename_lastname(Integer row) throws IOException {

		List<Map<String, String>> data =
		ReadExcel.getData("C:\\Users\\Admin\\Desktop\\OrangeHrm.xlsx", "Sheet1");
		Map<String, String> rowdata = data.get(row);
		aep.enterEmployeeDetails(rowdata.get("firstname"),
				rowdata.get("middlename"), rowdata.get("lastname"));
	}

	@When("click on submit buttonn")
	public void click_on_submit_buttonn() throws InterruptedException {
		Thread.sleep(2000);
		aep.clickSaveBtn();
	}

	@Then("Employee should be added")
	public void employee_should_be_added() {
		System.out.println("employee added successfully");
		dashboard.clickProfileOptions();
		dashboard.clickLogoutBtn();

	}

}
