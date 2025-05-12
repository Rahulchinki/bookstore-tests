package com.demoqa.bookstore.pages;

import com.demoqa.bookstore.utils.Log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksHomePage {
    private WebDriver driver;

    public BooksHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login")
    private WebElement loginButton;

    @FindBy(xpath="//li/span[./text()='Book Store']")
    private WebElement bookStoreMenu;


    public void clickLoginButton() {
        try{
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", loginButton);
            loginButton.click();
           }
        catch (Exception e) {
            Log.error("unable to click on login button: " + e.getMessage());
            throw e;
        }
    }

    public void iClickOnBookStoreMenu() {
        try {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", bookStoreMenu);
            bookStoreMenu.click();
            Log.info("Clicked on Book Store Menu");
        } catch (Exception e) {
            Log.error("unable to click on book store linkn: " + e.getMessage());
            throw e;
        }
    }
}