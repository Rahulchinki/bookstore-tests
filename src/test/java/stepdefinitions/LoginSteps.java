package stepdefinitions;

import com.demoqa.bookstore.pages.LoginPage;
import com.demoqa.bookstore.utils.Log;
import com.demoqa.bookstore.utils.TestContext;
import com.demoqa.bookstore.utils.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;




public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

public LoginSteps(TestContext  context ) {
    this.driver = context.getDriver();
    this.loginPage = new LoginPage(driver);
}
    
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {



        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        Log.info("Navigated to login page");
    }

    @When("I enter username {string} and password {string}")
    public void iEnterUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
    }



}
