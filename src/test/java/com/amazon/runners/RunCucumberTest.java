package com.amazon.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.amazon.steps"},
        plugin = {
            "pretty",
            "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
            "html:target/cucumber-report.html"
        },
        monochrome = true
)
public class RunCucumberTest {
}
