package com.ctl.it.qa.passweb.tests.PasswebRegression;

import com.ctl.it.qa.passweb.tools.steps.SalesDraftToSalesFinal.DealSummarySteps;
import com.ctl.it.qa.passweb.tools.steps.SalesDraftToSalesFinal.PassErrorCheckSteps;
import com.ctl.it.qa.passweb.tools.steps.SalesDraftToSalesFinal.PasswebHomeSteps;
import com.ctl.it.qa.passweb.tools.steps.SalesDraftToSalesFinal.ProductConfigurationSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TC07_CheckForErrorCheckForAllProducts {
	
	@Steps
	PasswebHomeSteps passWebHomeSteps;
	
	@Steps
	ProductConfigurationSteps productConfigurationSteps;
	
	@Steps
	PassErrorCheckSteps passErrorCheckSteps;
	
	@Steps
	DealSummarySteps dealSummarySteps;
	
	
	@When("^I am checking the errors and correcting it$")
	public void i_am_checking_the_errors_and_correcting_it() throws Throwable {
		
	   passErrorCheckSteps.dealWithErrorsSales();
	    
	}
	
	@Then("^All errrors should be removed$")
	public void all_errors_should_be_removed()
	{
		passErrorCheckSteps.refreshErrors();
	}
	
	@When("^I submitting the NSP to POM$")
	public void i_am_submitting_the_NSP_to_POM()
	{
		passWebHomeSteps.submitToPom("Submit");
	}
	
	@Then("^NSP status should be changed to Sales Final$")
	public void NSP_status_should_be_changed_to_Sales_Final()
	{
		passWebHomeSteps.checkNSPStatus();
	}
	
	@When("^I logout from the PASS and close the browser$")
	public void i_logout_from_the_PASS_and_close_the_browser()
	{
		passWebHomeSteps.logOut();
		passWebHomeSteps.closeBrowser();
		
	}

	@Then("^errors should be gone$")
	public void errors_should_be_gone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //
	}

}
