package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "..BDD/src/test/java/feature"
        ,glue={"steps"}
        ,monochrome = false
)
public class TestRunner {

}
