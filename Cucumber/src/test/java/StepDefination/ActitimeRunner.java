package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\A.feature",glue= {"StepDefination"},plugin={"pretty","json:target\\log.report\\html.reports"})
public class ActitimeRunner {

}
