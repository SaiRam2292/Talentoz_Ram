package StepDefinition;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver;
    LoginPage lp;
    WebDriverWait wait;

    @Given("I am on the Talent oz login page")
    public void i_am_on_the_talent_oz_login_page() throws InterruptedException {
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            driver.get("https://solugenix.talentoz.com/Weblogin.aspx");
            lp = new LoginPage(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("I enter the username as {string} and password as {string}")
    public void i_enter_the_username_as_and_password_as(String username, String password) throws InterruptedException {
        System.out.println("Entering Username and Password...");

        lp.enterUsername(username);
        lp.enterPassword(password);
    }

    @And("I click on the Signin button")
    public void i_click_on_the_Signin_button() throws InterruptedException {
        System.out.println("Clicking on signin button...");
        wait.until(ExpectedConditions.elementToBeClickable(lp.getSigninButtonLocator()));
        lp.clicksiginin();
    }

    @Then("I should be navigated to the Talent oz home page")
    public void i_should_be_navigated_to_the_talent_oz_home_page() throws InterruptedException {
        wait.until(ExpectedConditions.urlContains("Home.aspx"));
        String expectedUrl = "https://solugenix.talentoz.com/Home.aspx";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));
    }

    @Then("I click on the check-in button")
    public void i_click_on_the_check_in_button() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(lp.getCheckinLocator()));
        lp.clickCheckin();

    }
}