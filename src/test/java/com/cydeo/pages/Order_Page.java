package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Order_Page extends BasePage{

    public Order_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//select[@name='product']")
    public WebElement productDropdown;

    @FindBy(name = "quantity")
    public WebElement inputQuantity;

    @FindBy(name = "name")
    public WebElement inputName;

    @FindBy(name = "street")
    public WebElement inputStreet;

    @FindBy(name = "city")
    public WebElement inputCity;

    @FindBy(name = "state")
    public WebElement inputState;

    @FindBy(name = "zip")
    public WebElement inputZip;

    @FindBy(name = "card")
    public List<WebElement> cardType;

    @FindBy(name = "cardNo")
    public WebElement cardNumber;

    @FindBy(name = "cardExp")
    public WebElement cardExp;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;











}
