package stepdefinitions;

import com.demoqa.bookstore.pages.ProfilePage;
import com.demoqa.bookstore.utils.TestContext;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class ProfilePageSteps {
    private WebDriver driver ;
    private ProfilePage profilePage ;

    public ProfilePageSteps(TestContext context) {
        this.driver = context.getDriver();
        this.profilePage = new ProfilePage(driver);
    }

    @Then("I should be logged out")
    public void iShouldBeLoggedOut() {
        profilePage.logout();
    }

    @Then("I should be redirected to the profile page")
    public void iShouldBeRedirectedToTheProfilePage() throws InterruptedException {

        profilePage.verifyUserIsOnProfilePage();
    }

    @Then("I verify that I am logged in with {string}")
    public void iVerifyThatIAmLoggedInWith(String sUsername) {

        profilePage.verifyLoginName(sUsername);

    }
}
