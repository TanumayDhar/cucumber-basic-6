package Runner;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features={"src/feature"},glue={"Steps"},monochrome=true) //tags= {"@Functional"})
public class RunCuke extends AbstractTestNGCucumberTests {

}
