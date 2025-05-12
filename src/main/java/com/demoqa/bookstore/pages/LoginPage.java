package com.demoqa.bookstore.pages;

import com.demoqa.bookstore.utils.Log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage {
    private final WebDriverWait wait;
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as needed

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userName")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login")
    private WebElement loginButton;




    public void login(String username, String password) {
        try {
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            //JavascriptExecutor js = (JavascriptExecutor) driver;
          //  js.executeScript("arguments[0].scrollIntoView({block: 'center'});", loginButton);
           loginButton.click();
            Log.info("Login attempted with username: " + username);
        } catch (Exception e) {
            Log.error("Error during login: " + e.getMessage());
            throw e;
        }
    }


}
