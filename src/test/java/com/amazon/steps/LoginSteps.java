package com.amazon.steps;

import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.utils.DriverManager;
import com.amazon.utils.TestUtil;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class LoginSteps {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        TestUtil.initExtentReport();
        DriverManager.initDriver();
        driver = DriverManager.getDriver();
        TestUtil.test = TestUtil.extent.createTest("Amazon Login Test");
    }

    @Given("I open the Amazon India homepage")
    public void i_open_amazon_homepage() {
        driver.get("https://www.amazon.in/");
        homePage = new HomePage(driver);
        TestUtil.test.log(Status.INFO, "Opened Amazon India homepage");
    }

    @When("I click on Sign in")
    public void i_click_sign_in() {
        homePage.clickSignIn();
        loginPage = new LoginPage(driver);
        TestUtil.test.log(Status.INFO, "Clicked on Sign in");
    }

    @Then("I should see the sign-in page")
    public void i_should_see_sign_in_page() {
        boolean isSignIn = loginPage.isAt();
        if (isSignIn) {
            TestUtil.test.log(Status.PASS, "Sign-in page is displayed");
        } else {
            TestUtil.test.log(Status.FAIL, "Sign-in page is NOT displayed");
        }
        Assert.assertTrue("Not on sign-in page", isSignIn);
    }

    @When("I enter mobile number or email {string}")
    public void i_enter_mobile_number_or_email(String mobileOrEmail) {
        loginPage.enterMobileNumberOrEmail(mobileOrEmail);
        TestUtil.test.log(Status.INFO, "Entered mobile number or email: " + mobileOrEmail);
    }

    @When("I click the Continue button")
    public void i_click_continue_button() {
        loginPage.clickContinueButton();
        TestUtil.test.log(Status.INFO, "Clicked Continue button");
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);
        TestUtil.test.log(Status.INFO, "Entered password");
    }

    @When("I click the Sign In button")
    public void i_click_sign_in_button() {
        loginPage.clickSignInButton();
        TestUtil.test.log(Status.INFO, "Clicked Sign In button");
    }

    @Then("I should see the password field")
    public void i_should_see_password_field() {
        boolean isPasswordFieldVisible = loginPage.isSignInPageVisible();
        if (isPasswordFieldVisible) {
            TestUtil.test.log(Status.PASS, "Sign-in page with password field is displayed");
        } else {
            TestUtil.test.log(Status.FAIL, "Sign-in page with password field is NOT displayed");
        }
        Assert.assertTrue("Password field not visible", isPasswordFieldVisible);
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
        TestUtil.flushExtentReport();
    }
}
