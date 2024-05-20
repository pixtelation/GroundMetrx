package Pom_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class REPORTS_POM {
 

    public REPORTS_POM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    // Linehaul Xpath
    @FindBy (xpath ="//a[normalize-space()='Reports']") private WebElement reports;
    @FindBy (xpath = "//input[@id='search_bar']") private WebElement searchBar;
    @FindBy (xpath = "//div[@class='input-group']//button") private WebElement searchButton;
    @FindBy (xpath = "//a[@href='/reports/ivmr']//div[@class='inn-content']") private WebElement ivmrReport;
    @FindBy (xpath = "//h4[normalize-space()='AVR Daily Pickup (Daily Totals)']") private WebElement avrDailyPickup;
    @FindBy (xpath = "//a[@href='/leg-estimation']//div[@class='inn-content']") private WebElement legEstimation;
    @FindBy (xpath = "//a[@href='/linehaul-payroll-automation']//div[@class='inn-content']") private WebElement linehaulPayrollAutoamtion;
    @FindBy (linkText = "Line Haul Profitability Report") private WebElement linehaulProfitReport;
    @FindBy (linkText = "IVMR Bulk Report") private WebElement ivmrBulkReport;
    @FindBy (linkText = "Line Haul Settlement Estimator") private WebElement lineHaulSettlementEstimator;
    @FindBy (xpath = "//a[@href='/settlement-no-revenue']//div[@class='inn-content']") private WebElement settlementNoRevenue;
    @FindBy (xpath = "//a[@href='/reports/linehaul-payroll']//div[@class='inn-content']") private WebElement linehaulPayroll;
    @FindBy (xpath = "//h4[normalize-space()='Line Haul Activity Summary']") private WebElement linehaulActivitySummary;

    // P&D xpath
}
