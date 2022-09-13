package Runners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;


@CucumberOptions(
        tags = "@Yesim",
        features = {"src/test/java/FeatureFiles/GIP4-8.feature"},
        glue = {"StepDefinitions"}
)
@Listeners({ExtentITestListenerClassAdapter.class})
public class GIP4_8ExtentReport extends AbstractTestNGCucumberTests{

}

