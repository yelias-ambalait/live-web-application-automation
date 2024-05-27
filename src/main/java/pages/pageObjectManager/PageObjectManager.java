package pages.pageObjectManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Admin.AdminPage;

public class PageObjectManager {
    public static WebDriver driver;

    public AdminPage adminPage;



    public  PageObjectManager(WebDriver driver){

        this.driver = driver;

    }

    public AdminPage getAdminPage(){
        adminPage = new AdminPage(driver);
        return adminPage;
    }


    public static WebElement hoverToElement(WebElement element) {
        Actions action = new Actions(driver);
        WebElement we = element;
        action.moveToElement(we).perform();
        return we;
    }

    public static void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }


}
