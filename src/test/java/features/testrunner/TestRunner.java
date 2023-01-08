package features.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/PNT/IdeaProjects/cucumber_gherkins/src/authentication/authentication.feature",
        glue = "feature.steps_definations")


public class TestRunner {



}
