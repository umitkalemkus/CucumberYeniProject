package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExaminionPage {

    @FindBy(xpath = "//input[@id=':r9:']")
    private WebElement email;




    @FindBy(xpath = "//input[@id='auth-login-v2-password']")
    private WebElement password;



    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginButton;






}
