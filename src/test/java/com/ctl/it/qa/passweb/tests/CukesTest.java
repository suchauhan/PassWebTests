package com.ctl.it.qa.passweb.tests;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.ctl.it.qa.staf.Environment;
import com.ctl.it.qa.staf.STAFEnvironment;
import com.ctl.it.qa.staf.TestEnvironment;

import cucumber.api.CucumberOptions;

@TestEnvironment(Environment.E2E)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/PassWebFeatures", tags={"@PilotRegression"})
public class CukesTest { 
	
	@BeforeClass
	public static void setEnvironment() {
		STAFEnvironment.registerEnvironment(CukesTest.class);
	}
	
}
