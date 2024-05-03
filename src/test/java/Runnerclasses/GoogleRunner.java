package Runnerclasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\chand\\eclipse-workspace\\BDDCucumber\\src\\test\\resources\\Featurefile\\Google.feature",glue="Stepdef")

public class GoogleRunner {
	

}
