package com.demoqa.bookstore.pages;

import com.demoqa.bookstore.utils.Log;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage {

    private WebDriver driver;
    private final WebDriverWait wait;
    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    @FindBy(id = "submit")
    private WebElement logoutButton;

    @FindBy(id="userName-value")
    private WebElement username;


    public void logout() {
        logoutButton.click();
    }

    public void verifyUserIsOnProfilePage() {

        wait.until(ExpectedConditions.visibilityOf(logoutButton));
        try { String url = driver.getCurrentUrl();
            Assert.isTrue(url.contains("profile"), "User is not on Profile Page");
            Log.info("User is on Profile Page");
        } catch (Exception e) {

            Log.error("Profile page is not loaded " + e.getMessage());
            throw e;
        }
    }

    public void verifyLoginName(String sUsername) {
        try{
             Assert.isTrue(username.getText().equalsIgnoreCase(sUsername), "username is not correct");
              Log.info("Username is correct");
        }catch(Exception e){
            Log.error("username is not correct  " + e.getMessage());
            throw e;
        }
    }
}
