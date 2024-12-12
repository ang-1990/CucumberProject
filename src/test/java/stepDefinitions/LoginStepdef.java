package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginStepdef {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @After
    public void teardown(){
        if(driver!=null){
            driver.quit();
        }

    }

    @Given("I am on opencart login page")
    public void iAmOnOpencartLoginPage() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }

    @Given("I have a entered a valid username and password")
    public void iHaveAEnteredAValidUsernameAndPassword() {
        loginPage.enterUsername("roseanandh91@gmail.com");
        loginPage.enterPassword("Je$u$123");
    }

    @When("I click on login button")
    public void iClickOnLoginButton() {
        loginPage.login();
    }

    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
        Assert.assertTrue(loginPage.islogoutDisplayed(),"User is not logged in successfully");

    }

    @Given("I have entered invalid {string} and {string}")
    public void iHaveEnteredInvalidAnd(String username,String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.login();
    }



    @When("I click on the {string} link")
    public void iClickOnTheLink(String arg0) {
        loginPage.clickForgotpwd();
    }

    @Then("I should be redirected to the password reset page")
    public void iShouldBeRedirectedToThePasswordResetPage() {
        Assert.assertTrue(loginPage.getForgotPwdPageUrl().contains("account/forgotten"),"User is not in the forgot password page");
    }

    @Then("I should see an message {string}")
    public void iShouldSeeAnMessage(String error) {
        Assert.assertTrue(loginPage.getErrorMessage().contains(error),"he user is able to login with invalid creds");
    }
}
