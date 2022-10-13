package StepDefination;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\B.feature",glue= {"StepDefination"},plugin= {"pretty","html:target\\Roshani\\html.report"})
public class FacebookRunner {

}
