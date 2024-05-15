package Pom_Library.LINE_HAUL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;	


public class Terminals_Spots_POM {

    @FindBy(xpath ="//A[normalize-space(.)='Line Haul']" )
    private WebElement linehaul_btn;
    @FindBy(xpath ="//A[normalize-space(.)='Terminals/Spots']" )
    private WebElement terminalsSpots_btn;
    @FindBy(xpath ="//BUTTON[normalize-space(.)='Terminals']" )
    private WebElement terminals_btn;
    @FindBy(xpath ="//A[normalize-space(.)='Add New Terminal']" )
    private WebElement addNewTerminal_btn;
    @FindBy(xpath ="//INPUT[contains(@class,'form-control numbersOnly')]" )
    private WebElement enterTerminalNumber;
    @FindBy(xpath ="//INPUT[contains(@class,\"form-control\") and normalize-space(@name)=\"terminal_name\"]" )
    private WebElement enterTerminalName;
    @FindBy(xpath ="//INPUT[contains(@class,\"form-control\") and normalize-space(@name)=\"abbreviation\"]" )
    private WebElement enterTerminalAbbreviation;
    @FindBy(xpath ="//INPUT[contains(@class,\"form-control\") and normalize-space(@name)=\"email\"]" )
    private WebElement email_txt;
    @FindBy(xpath ="//INPUT[contains(@class,'form-control phone_number_validation')]" )
    private WebElement phone_txt;
    @FindBy(xpath ="//INPUT[contains(@class,'form-control google_place_autocomplete pac-target-input')]" )
    private WebElement address_txt;
    @FindBy(xpath ="//BUTTON[normalize-space(.)='Add Terminal']" )
    private WebElement addTerminal_btn;
    @FindBy(xpath ="//FORM[@id='terminals_form_submit']/descendant::BUTTON[@aria-label='Close']" )
    private WebElement close_btn;

    public Terminals_Spots_POM(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickLinehaulBtn(){
        linehaul_btn.click();
    }
    public void clickTerminalsSpotsBtn(){
        terminalsSpots_btn.click();
    }
    public void clickTerminalsBtn(){
        terminals_btn.click();
    }
    public void clickAddNewTerminalBtn(){
        addNewTerminal_btn.click();
    }
    public void setTerminalNumber(String e){
        enterTerminalNumber.sendKeys(e);
    }
    public void setTerminalName(String p){
        enterTerminalName.sendKeys(p);
    }
    public void setTerminalAbbreviation(String p){
        enterTerminalAbbreviation.sendKeys(p);
    }
    public void setEmail_txt(String p){
        email_txt.sendKeys(p);
    }
    public void setPhone_txt(String p){
        phone_txt.sendKeys(p);
    }
    public void setAddress_txt(String p) throws Exception{
        address_txt.sendKeys(p);
        Thread.sleep(1000);
        address_txt.sendKeys(Keys.ARROW_DOWN);
        // address_txt.sendKeys(Keys.ENTER);
        // Robot keyboard= new Robot();
        // keyboard.keyPress(KeyEvent.VK_DOWN);
        // keyboard.keyRelease(KeyEvent.VK_DOWN);
        // keyboard.keyPress(KeyEvent.VK_ENTER);
        // keyboard.keyRelease(KeyEvent.VK_ENTER);
      
        
    }
    public void clickAddTerminal_btn(){
        addTerminal_btn.click();
    }
    public void clickClose_btn(){
        close_btn.click();
    }
}
