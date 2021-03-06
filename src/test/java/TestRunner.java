
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features"
        , glue = {"classpath:steps"}
        //,tags = {"@F-BrTxBets"}
        ,tags = {"@postRequest"}
        , monochrome = true
        , plugin = {"pretty", "html:target/reports", "json:target/reports.json"}
)
public class TestRunner {
}
