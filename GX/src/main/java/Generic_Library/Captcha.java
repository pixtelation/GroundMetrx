package Generic_Library;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Captcha {
    public static void main(String[] args) throws Exception
    {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.irctc.co.in/nget/train-search");
       driver.findElement(By.xpath("//A[normalize-space(.)='LOGIN']")).click();
       WebElement image_element = driver.findElement(By.xpath("//IMG[contains(@class,'captcha-img')]"));
       File src = image_element.getScreenshotAs(OutputType.FILE);
       String path="C:\\Users\\Wadmin\\Pharmulous\\Pharmulous_doctor\\CaptchaImage\\captcha.png";
       FileHandler.copy(src,new File(path));
       Thread.sleep(2000);
       ITesseract image = new Tesseract();
       String str = image.doOCR(new File(path));
       System.out.println("Captcha is");
       System.out.println(str);
       driver.findElement(By.xpath("//INPUT[contains(@class,'payment_tex ng-pristine ng-valid ng-touched')]")).sendKeys(str);
       driver.close();
    }
}
