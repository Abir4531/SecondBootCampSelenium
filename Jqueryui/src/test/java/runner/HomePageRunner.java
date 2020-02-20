package runner;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/feature/TestHomePage.feature"},
        glue = {"stepDefination"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict =true,
        monochrome =true,
        tags = {""})

public class HomePageRunner extends AbstractTestNGCucumberTests{
}
