package org.stepdefinition;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature",monochrome=true,strict=true,dryRun=false,glue="org.stepdefinition", plugin="html:target")
public class TestRunner {


}
