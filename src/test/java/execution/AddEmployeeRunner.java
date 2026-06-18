package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/features"
,glue = { "stepDefinitions","hooks"},tags = "@smoke and @regression"
,plugin = {"pretty","html:target/report.html"
		,"json:target/reportjson.json"})
public class AddEmployeeRunner extends AbstractTestNGCucumberTests{

}
     