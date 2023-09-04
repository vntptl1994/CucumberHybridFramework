package com.qa.tutorialninjha;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Amitkumar Patel\\OneDrive\\Desktop\\Naveen Mathur Sessions\\CucumberConcepts\\src\\main\\resources",
        glue= {"com/qa/tutorialninjha/Steps"})
public class TestRunner {
}
