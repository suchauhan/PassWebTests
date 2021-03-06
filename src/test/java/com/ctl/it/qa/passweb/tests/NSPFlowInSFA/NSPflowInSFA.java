package com.ctl.it.qa.passweb.tests.NSPFlowInSFA;

import static org.hamcrest.MatcherAssert.assertThat;

import javax.sql.CommonDataSource;

import net.thucydides.core.annotations.Steps;

import com.ctl.it.qa.passweb.tools.steps.SalesDraftToSalesFinal.LQCommercialOptySteps;
import com.ctl.it.qa.passweb.tools.steps.SalesDraftToSalesFinal.NSPSteps;
import com.ctl.it.qa.passweb.tools.steps.SalesDraftToSalesFinal.OptySteps;
import com.ctl.it.qa.staf.Page;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NSPflowInSFA {

	
	@Steps
	LQCommercialOptySteps lqCommercialOptySteps;
	@Steps
	OptySteps optySteps;
	@Steps
	NSPSteps nspSteps;

	// ********************** WHEN METHODS **************************
	
	@When("^I create a commercial opportunity$")
	public void i_create_a_commercial_opportunity ()
	{
		lqCommercialOptySteps.creates_default_lq_commercial_opty();
		optySteps.adds_lq_lite_quote_to_opty("IQ Enhanced", "QCC");
	}
	@When("^I create a new NSP$")
	public void i_create_a_new_NSP()
	{
		nspSteps.add_new_NSP();
	}
	
	@When("^I search an existing NSP$")
	public void i_search_an_existing_NSP()
	{
		nspSteps.open_record("Non-Standard Pricing",Page.commonData.getContainer("SFA").getFieldValue("nsp"));
	}
	
	@When("^I search an existing LQ commercial Opportunity$")
	public void i_search_an_existing_lq_commercial_opportunity()
	{
		nspSteps.open_record("Opportunities", "Automation_Regression");
	}
	
	@When("^I move to PASS through SFA$")
	public void I_move_to_PASS_through_SFA()
	{
		nspSteps.moveTOPass();	
	}
	
	@When("^I move back to SFA and get the NSP number$")
	public void i_move_back_to_SFA_and_get_the_NSP_number()
	{
		nspSteps.getNSPnumber();
	}

	
	// ********************** THEN METHODS **************************
	/*@Then("^commercial opty should be created successfully$")
	public void commercial_opty_should_be_created_successfully() throws Throwable {
		assertThat("Opty is not created", lqCommercialOptySteps.is_commercial_opty_created());
	}*/
	
}
