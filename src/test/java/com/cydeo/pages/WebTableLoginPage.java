package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;


    /**
     * No parameters.
     * When we call this method, it will directly login using
     *
     * Username: Test
     * Password: Tester
     */
    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));
        username.sendKeys("Test");  //can be with this. but does not have to
        this.password.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will accept two arguments and login.
     * @param username
     * @param password
     */
    public void login(String username, String password){
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();
    }

    /**
     * This method will log in using credentials from
     * configuration.properties
     */
    public void loginWithConfig(){
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        username.sendKeys(ConfigurationReader.getProperty("webTableUsername"));
        password.sendKeys(ConfigurationReader.getProperty("webTablePassword"));
        loginButton.click();
    }




}
