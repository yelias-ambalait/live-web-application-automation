import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WebTest {
    public static void main(String[] args) {
        WebDriver driver;

        By signInForm = By.xpath("//div[normalize-space()='Sign in']");
        By username = By.id("email");
        By password = By.id("password");
        By signInButton = By.xpath("(//span[normalize-space()='Sign in'])[2]");

        By admin = By.className("module-name");
        By adminDashboard = By.className("module");
        By  stakeholderManagement  = By.xpath("//span[@class='ng-tns-c67-6']");
        By  stakeholderInfo  = By.xpath("//span[normalize-space()='Stakeholder Information']");
        By  plusButton  = By.xpath("//mat-icon[normalize-space()='add']");
        By  workingAreadrop  = By.xpath("//div[@id='mat-select-value-9']");
        By  countryOffice  = By.xpath("//mat-icon[normalize-space()='chevron_right']");
        By  mRegion  = By.xpath("//mat-tree-node[2]//button[1]//span[1]//mat-icon[1]");
        By  magburaka  = By.xpath("//mat-tree-node[3]//button[1]//span[1]//mat-icon[1]");
        By  masingbi  = By.xpath("//mat-tree-node[4]//button[1]//span[1]//mat-icon[1]");
        By  tarma  = By.xpath("(//span[@class='leaf-node'])[1]");
        By  next  = By.xpath("//span[normalize-space()='Next']");
        By  stakeholderName  = By.xpath("//input[@id='mat-input-5']");
        By  genderDrop  = By.xpath("//div[@id='mat-select-value-13']");
        By  gender  = By.xpath("(//span[normalize-space()='Male'])[7]");
        By  stakeholderType  = By.xpath("//div[@id='mat-select-value-15']");
        By  stakeholder  = By.xpath("(//span[@class='mat-option-text'])[1]");
        By  mobile  = By.xpath("//input[@id='mat-input-7']");
        By designationDrop = By.xpath("//div[@id='mat-select-value-17']");
        By designation = By.xpath("(//div[@class='ng-star-inserted'])[4]");
        By disabilityDrop = By.xpath("//div[@id='mat-select-value-19']");
        By disability = By.xpath("(//span[@class='mat-option-text'])[2]");

        By dashboard = By.xpath("//div[@class='oxd-topbar-header']");
        By saveButton = By.xpath("//span[normalize-space()='Save']");

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();

        String url = "https://binsight.streamstech.com/";
        driver.get(url);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(signInForm));
        driver.findElement(signInForm).isDisplayed();
        String result = driver.findElement(signInForm).getText();
        System.out.println("Form Details: \n" + result);

        WebElement email = driver.findElement(username);
        email.sendKeys("qa");

        WebElement pass = driver.findElement(password);
        pass.sendKeys("123");

        WebElement login = driver.findElement(signInButton);
        login.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(admin));
        driver.findElement(admin).isDisplayed();
        driver.findElement(admin).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for( String windowHandle : allWindows ){
            if(!windowHandle.equals(originalWindow)){
                driver.switchTo().window(windowHandle);
            }
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(stakeholderManagement));
        driver.findElement(stakeholderManagement).isDisplayed();
        driver.findElement(stakeholderManagement).click();

        driver.findElement(stakeholderInfo).isDisplayed();
        driver.findElement(stakeholderInfo).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(plusButton));
        driver.findElement(plusButton).isDisplayed();
        driver.findElement(plusButton).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(workingAreadrop));
        driver.findElement(workingAreadrop).isDisplayed();
        driver.findElement(workingAreadrop).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(countryOffice));
        driver.findElement(countryOffice).isDisplayed();
        driver.findElement(countryOffice).click();

        driver.findElement(mRegion).isDisplayed();
        driver.findElement(mRegion).click();

        driver.findElement(magburaka).isDisplayed();
        driver.findElement(magburaka).click();

        driver.findElement(masingbi).isDisplayed();
        driver.findElement(masingbi).click();

        driver.findElement(tarma).isDisplayed();
        driver.findElement(tarma).click();

        driver.findElement(next).isDisplayed();
        driver.findElement(next).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(stakeholderName));
        driver.findElement(stakeholderName).isDisplayed();
        driver.findElement(stakeholderName).sendKeys("John Smith");

        driver.findElement(genderDrop).isDisplayed();
        driver.findElement(genderDrop).click();

        driver.findElement(gender).isDisplayed();
        driver.findElement(gender).click();

        driver.findElement(stakeholderType).isDisplayed();
        driver.findElement(stakeholderType).click();

        driver.findElement(stakeholder).isDisplayed();
        driver.findElement(stakeholder).click();

        driver.findElement(mobile).isDisplayed();
        driver.findElement(mobile).sendKeys("01478959565");


        driver.findElement(designationDrop).click();
        driver.findElement(designation).click();

        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", driver.findElement(disabilityDrop));
        wait.until(ExpectedConditions.presenceOfElementLocated(disabilityDrop));
        driver.findElement(disabilityDrop).isDisplayed();
        driver.findElement(disabilityDrop).click();
        driver.findElement(disability).isDisplayed();
        driver.findElement(disability).click();


//        driver.quit();


    }
}
