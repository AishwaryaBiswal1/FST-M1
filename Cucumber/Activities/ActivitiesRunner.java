package cucumberTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepDefinition"},
        tags = "@activity1_1",
        //plugin = {"json: test-reports/json-report.json"},
        plugin = {"html: test-reports"},
       // plugin = {"pretty"},
        monochrome = true
)
public class ActivitiesRunner {

}
