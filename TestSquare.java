package com.cg.calculators;

import static org.testng.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSquare {
	
	Calculator calc;
    int res, errorcode;
    @Given("^Create the Calculator Object$")
    public void create_the_Calculator_Object()
 {
      calc= new Calculator();
    }

    @When("^Use given Valid (\\d+) to findSquare method$")
    public void use_given_Valid_to_findSquare_method(int arg1) 
 {
      res=calc.findSquare(arg1);
    }

    @Then("^method should return correct(\\d+)$")
    public void method_should_return_correct(int arg1) 
 {
       assertEquals(res, arg1);
    }
    @When("^use given valid (\\d+) to findSquare\\(\\)$")
    public void use_given_valid_to_findSquare(int arg1) 
 {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Then("^method should return correct Square$")
    public void method_should_return_correct_Square() 
{
        // Write code here that turns the phrase above into concrete actions
       
    }
}
