package Generic_Library;

import Pom_Library.Signin_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Launch implements Framework_constants{
    public static WebDriver driver;

    @BeforeClass
    public void open() throws Exception {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

           //Signin
        Signin_POM s=new Signin_POM(driver);
        s.clickLoginBtn();
        s.setUsername("DHL");
        s.setPassword("DHL@123456");
        s.clickRemember();
        s.clickSign();
        String actual_signin =driver.getCurrentUrl();
        Assert.assertEquals(expected_signin,actual_signin);
        Thread.sleep(2000);

    }
    @AfterMethod
    public void screenshot(ITestResult res) throws Exception
    {
        Thread.sleep(2000);
        if (res.getStatus()==res.FAILURE){
            Screenshot.capture(driver);
        }
    }
    @AfterClass

    public void close() throws Exception {
        Thread.sleep(2000);
        driver.close();
    }
}
