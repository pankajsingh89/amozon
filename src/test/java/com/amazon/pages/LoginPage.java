package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    @FindBy(css = "input[type='email'], input#ap_email")
    private WebElement emailField;

    @FindBy(css = "input[type='email']")
    private WebElement mobileNumberEmailField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "createAccountSubmit")
    private WebElement createAccountButton;

    @FindBy(xpath = "//a[contains(text(), 'Create your Amazon account')]")
    private WebElement createAccountLink;

    @FindBy(id = "ap_password")
    private WebElement passwordField;

    @FindBy(id = "signInSubmit")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isAt() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOf(emailField));
            return emailField.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickCreateAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(createAccountButton));
            createAccountButton.click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.elementToBeClickable(createAccountLink));
            createAccountLink.click();
        }
    }

    public void enterMobileNumberOrEmail(String mobileOrEmail) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(mobileNumberEmailField));
        mobileNumberEmailField.clear();
        mobileNumberEmailField.sendKeys(mobileOrEmail);
    }

    public void clickContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }

    public boolean isCreateAccountPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOf(emailField));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void enterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
    }

    public boolean isSignInPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOf(passwordField));
            return passwordField.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
