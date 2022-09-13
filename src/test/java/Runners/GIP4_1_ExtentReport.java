package Runners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
        tags = "@GIP4-1",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
@Listeners({ExtentITestListenerClassAdapter.class})
public class GIP4_1_ExtentReport extends AbstractTestNGCucumberTests {
}
