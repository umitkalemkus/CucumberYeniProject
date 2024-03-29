package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;







@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty",
                "html:target/cucumber-reportsAPI.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },



        features = "src/test/resources/features",
        glue = "stepdefinitions" ,
        tags = "@smoke",
        dryRun = false



)

public class TagRunner  {


}
