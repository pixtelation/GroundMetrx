package Generic_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utllities {
    static WebDriver driver;


    // For using zoom in & Zoom out function for  Chrome browser
    public static void zoomChrome(String percentage)
    {
        String zoom="document.body.style.zoom = '"+percentage+"%'";
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript(zoom);
    }

    // For used dropdown  select 
   public static WebElement getElement(By locator)
   {
    return driver.findElement(locator);
   }

   public static void selectByVisiableText(By locator , String value)
   {
       Select select= new Select(getElement(locator));
       select.selectByVisibleText(value);
   }

   public static void selectByIndex(By locator, int index)
   {
    Select select = new Select(getElement(locator));
    select.selectByIndex(index);
   }
   public static void selectByDropdownValue(By locator, String value)
   {
    Select select = new Select(getElement(locator));
    select.selectByValue(value);
    
   }

   //Click action
   public void  clickOnWebelement(WebElement element, long waitTimeSwecond)
   {
    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(waitTimeSwecond));
    WebElement elements= null;
    elements=wait.until(ExpectedConditions.elementToBeClickable(elements));
    elements.click();
   }

   //senkeys action

   public void sendKeysOnWebelement(WebElement element, String text)
   {
    element.click();
    element.clear();
    element.sendKeys(text);

   }

   //alert
   public void acceptAlert(WebDriver driver)
   {
    driver.switchTo().alert().accept();
   }
   public void dismissAlert(WebDriver driver)
   {
    driver.switchTo().alert().dismiss();
   }

   //mouseOver Action
   
   public void mouseOverClickElement(WebElement element)
   {
    Actions act= new Actions(driver);
    act.moveToElement(element).click().build().perform();

   }


   
    
}
