package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import com.qaclickacademy.base.TestBase;
import com.qaclickacademy.pageobjects.HomePage;
import com.qaclickacademy.pageobjects.LoginPage;
import com.qaclickacademy.pageobjects.PortalPage;

@RunWith(Cucumber.class)
public class LoginStepDefinitions extends TestBase {
	
	HomePage hp;
	LoginPage lp;
	PortalPage pp;

    @Given("^Registered user navigated to login page$")
    public void registered_user_navigated_to_login_page() throws Throwable {
        
    	initialization();
    	hp = new HomePage();
    	lp = new LoginPage();
    	pp = new PortalPage();
    	driver.get(prop.getProperty("url"));
    	hp.clickLoginLink();
    	
    }

    @When("^Registered user enters \"([^\"]*)\" and \"([^\"]*)\" and click log in$")
    public void registered_user_enters_something_and_something_and_click_log_in(String email, String password) throws Throwable {
        
    	lp.loginWithCredentials(email, password);
    }

    @Then("^Registered user logged in successfully$")
    public void registered_user_logged_in_successfully() throws Throwable {
        
    	pp.loginValidation();
    }

    @Then("^Close the browser$")
    public void close_the_browser() throws Throwable {
        
    	driver.close();
    }
    
    
//==================Scenario Outline Invalid Login================\\
    

    @When("^Registered user enters (.+) and (.+) and clicks login$")
    public void registered_user_enters_and_and_clicks_login(String email, String password) throws Throwable {
        lp.loginWithCredentials(email, password);
    }

    @Then("^Registered user receives login error message$")
    public void registered_user_receives_login_error_message() throws Throwable {
        lp.validateLoginErrorText();
    }

    
    
    
    
    
    
    
    
    
    

}