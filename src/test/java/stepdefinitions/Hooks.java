package stepdefinitions;



import com.demoqa.bookstore.utils.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.demoqa.bookstore.utils.WebDriverFactory;

public class Hooks {

    private final TestContext context;

     public Hooks(TestContext context) {
         this.context = context;
     }




    @Before
    public void setUp() {
        WebDriver driver = WebDriverFactory.getDriver();
        context.setDriver(driver);

    }

    @After
    public void tearDown() {
        WebDriver driver = context.getDriver();
        if (driver != null) {
            driver.quit();
        }
    }


}
