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
import java.util.List;

public class BookSearchPage {

    private WebDriver driver;
    private final WebDriverWait wait;


    public BookSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @FindBy(id = "searchBox")
    private WebElement searchField;

    @FindBy(id = "submit")
    private WebElement logoutButton;


    @FindBy(xpath="//div[@class='rt-td']")
    private List<WebElement> bookList;

    @FindBy(xpath ="//a[contains(text(), 'Git Pocket Guide')]")
    private WebElement searchedBook;

    public void isBookSearchPageLoaded() {
        try {  wait.until(ExpectedConditions.visibilityOf(logoutButton));

            String url = driver.getCurrentUrl();
            Assert.isTrue(url.contains("books"), "User is not on Book search page");
            Log.info("User is on Book search  Page");
        } catch (Exception e) {

            Log.error("book Search  page is not loaded " + e.getMessage());
            throw e;
        }


    }

    public void searchBook(String bookName) {
        try{
        searchField.sendKeys(bookName);
        Log.info("Search for book " + bookName);
        }catch (Exception e) {
            Log.error("unable to find search field " + e.getMessage());
            throw e;
        }
        }

    public void searchedBookFound(String bookName) {
        try{
            Assert.isTrue(FindBook(bookName), "Searched book is not found");
        }catch (Exception e) {

            throw e;
        }
    }



    public void searchedNotBookFound(String bookName) { try{
        Assert.isTrue(!(FindBook(bookName)), "Searched book is not found");
    }catch (Exception e) {

        throw e;
    }
    }

    private boolean FindBook(String bookName){
        for (WebElement book : bookList) {
            if (book.getText().contains(bookName)) {
                return true;
            }
        }
        return false;
    }



}

