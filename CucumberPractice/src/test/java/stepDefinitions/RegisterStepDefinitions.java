package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import com.qaclickacademy.base.TestBase;
import com.qaclickacademy.pageobjects.HomePage;
import com.qaclickacademy.pageobjects.RegisterPage;



@RunWith(Cucumber.class)
public class RegisterStepDefinitions extends TestBase {
	
	HomePage hp;
	RegisterPage rp;
	
	
	

    @Given("^New user navigated to register page$")
    public void new_user_navigated_to_register_page() throws Throwable {
        
    	initialization();
    	hp = new HomePage();
    	rp = new RegisterPage();
    	
    	driver.get(prop.getProperty("url"));
    	hp.clickRegisterLink();
    }

    @When("^New user enters Personal Information (.+), (.+), (.+) and clicks sign up$")
    public void new_user_enters_personal_information_and_clicks_sign_up(String fullname, String email, String password) throws Throwable {
       
    	rp.registerWithPersonalInformation(fullname, email, password);
    }

//    @Then("^New user becomes a registered user$")
//    public void new_user_becomes_a_registered_user() throws Throwable {
//        
//    }

  

}