package stepdefinitions;

import com.demoqa.bookstore.pages.BookSearchPage;
import com.demoqa.bookstore.pages.BooksHomePage;
import com.demoqa.bookstore.utils.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class BookSearchPageSteps {

    private WebDriver driver;
    private BookSearchPage bookSearchPage;


    public BookSearchPageSteps(TestContext context) {
        this.driver = context.getDriver();
        this.bookSearchPage = new BookSearchPage(driver);
    }



    @Then("I am on Book search page")
    public void iAmOnBookSearchPage() {
        bookSearchPage.isBookSearchPageLoaded();
    }

    @When("I search for {string}")
    public void iSearchFor(String bookName) {
        bookSearchPage.searchBook(bookName);
    }

    @Then("I should see {string} in the search results")
    public void iShouldSeeInTheSearchResults(String bookName) {
        bookSearchPage.searchedBookFound(bookName);
    }

    @Then("I should see not  {string} in the search results")
    public void iShouldSeeNotInTheSearchResults(String bookName) {
        bookSearchPage.searchedNotBookFound(bookName);

    }
}
