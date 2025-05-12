package stepdefinitions;

import com.demoqa.bookstore.pages.BooksHomePage;
import com.demoqa.bookstore.pages.LoginPage;
import com.demoqa.bookstore.utils.Log;
import com.demoqa.bookstore.utils.TestContext;
import com.demoqa.bookstore.utils.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    private WebDriver driver;
    private BooksHomePage booksHomePage;

    public HomePageSteps(TestContext context) {
        this.driver = context.getDriver();
        this.booksHomePage = new BooksHomePage(driver);
    }




    @Given("I am on Books Home Page")
    public void iAmOnBooksHomePage() {

        driver.manage().window().maximize();
            driver.get("https://demoqa.com/login");


            Log.info("Navigated to Home page");

    }



    @When("I click on Login button on Home Page")
    public void iClickOnLoginButtonOnHomePage() {
        booksHomePage.clickLoginButton();


    }

    @Then("I click on Book store menu")
    public void iClickOnBookStoreMenu() {
        booksHomePage.iClickOnBookStoreMenu();
    }
}
