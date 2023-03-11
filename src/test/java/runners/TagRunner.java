package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;







@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/01_Tags_feature.feature"},
        glue = "stepdefinitions" ,
        tags = "@smoke",
        dryRun = false



)

public class TagRunner {





}
