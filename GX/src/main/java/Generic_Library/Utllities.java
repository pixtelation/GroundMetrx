package Generic_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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


   
    
}
