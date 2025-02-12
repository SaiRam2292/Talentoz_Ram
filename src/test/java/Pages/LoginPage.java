package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.pagefactory.ByAll;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy (id = "txt_name")
    WebElement username;
    @FindBy (id = "txt_pass")
    WebElement password;
    @FindBy (id = "btn_submit")
    WebElement signinButton;
    @FindBy (id = "div_Wid_DTR_Chk_btn_chIn_div_DshWdgtCon_4032")
    WebElement checkin;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

//    // Locators
//    private By username = By.id("txt_name");
//    private By password = By.id("txt_pass");
//    private By signinButton = By.id("btn_submit");
//    private By checkin = By.id("div_Wid_DTR_Chk_btn_chIn_div_DshWdgtCon_4032");

    // Getter methods for locators
    public WebElement getUsernameLocator() {
        return username;
    }

    public WebElement getPasswordLocator() {
        return password;
    }

    public WebElement getSigninButtonLocator() {
        return signinButton;
    }

    public WebElement getCheckinLocator() {
        return checkin;
    }

    // Actions
    public void enterUsername(String user) {
        username.sendKeys(user);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clicksiginin() {
        signinButton.click();
    }

    public void clickCheckin() {
        checkin.click();
    }
}