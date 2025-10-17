package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features/CreateLeadAndAccount.feature",glue="Implementation",monochrome = true,publish = true)
public class RunnerClass extends AbstractTestNGCucumberTests{
	
	

}
