package Pom_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_POM {
    @FindBy(xpath ="//A[normalize-space(.)='Log in']" )
    private WebElement login_btn;
    @FindBy(xpath ="//input[@placeholder='Enter your username']")
    private WebElement username;
    @FindBy(xpath ="//input[@placeholder='Enter password']" )
    private WebElement password;
    @FindBy(xpath ="//INPUT[contains(@class,'form-check-input')]" )
    private WebElement remember;
    @FindBy(xpath ="//button[@class='btn full-btn']")
    private WebElement sign_btn;
    @FindBy(xpath ="//A[normalize-space(.)='Forgot password?']")
    private WebElement forgot_pswd;
    @FindBy(xpath ="//INPUT[contains(@class,'form-control')]")
    private WebElement fp_email;
    @FindBy(xpath ="//BUTTON[normalize-space(.)='Proceed']")
    private WebElement proceed_btn;


    public Signin_POM(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickLoginBtn(){
        login_btn.click();
    }
    public void setUsername(String e){
        username.sendKeys(e);
    }
    public void setPassword(String p){
        password.sendKeys(p);
    }
    public void clickRemember(){
        remember.click();
    }
    public void clickSign(){
        sign_btn.click();
    }
    public void clickForgotPswd(){
        forgot_pswd.click();
    }
    public void setFp_email(String f){
        fp_email.sendKeys(f);
    }
    public void clickProceedBtn(){
        proceed_btn.click();
    }

}
