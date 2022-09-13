package Runners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
        tags = "@Elif",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
@Listeners({ExtentITestListenerClassAdapter.class})

public class GIP4_2_ExtentRapor extends AbstractTestNGCucumberTests {

}
