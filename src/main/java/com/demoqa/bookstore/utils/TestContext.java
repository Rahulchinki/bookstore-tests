package com.demoqa.bookstore.utils;


import org.openqa.selenium.WebDriver;

public class TestContext {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
