package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/features",
        glue = {"step_definitions"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true,
        dryRun = false
)
public class TestRunner {
}
