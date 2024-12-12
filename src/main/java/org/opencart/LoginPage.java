package org.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

   private WebDriver driver;
   public LoginPage(WebDriver driver){
       this.driver =driver;
   }

    private By username = By.id("input-email");
    private By password = By.name("password");
    private By loginButton = By.xpath("//input[@type='submit']");
    private By forgotLink = By.linkText("Forgotten Password");
    private By errorMessagec = By.xpath("//div[contains(@class,'alert-danger')]");

    private By logout = By.partialLinkText("Logout");

    public boolean islogoutDisplayed(){
        return driver.findElement(logout).isDisplayed();
    }

    public void enterUsername(String user){

        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void login(){
        driver.findElement(loginButton).submit();
    }

    public void clickForgotpwd(){
        driver.findElement(forgotLink).click();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessagec).getText();
    }
    public String getForgotPwdPageUrl(){
        String forgotPwdPageUrl = driver.getCurrentUrl();
        return forgotPwdPageUrl;
    }

    public void getUrl(){

    }
}
