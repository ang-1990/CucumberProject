package Testrunner;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AppFeature",glue ={"stepDefinitions"},plugin ={"pretty"},tags ="@Smoke")


public class StartUber {
}
