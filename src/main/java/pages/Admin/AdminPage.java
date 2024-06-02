package pages.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

    public WebDriver driver;
    public String element;

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
//    By disabilityDrop = By.xpath("//div[@id='mat-select-value-19']");
    By disability = By.xpath("//mat-select[@id='mat-select-18']");

    By dashboard = By.xpath("//div[@class='oxd-topbar-header']");
    By saveButton = By.xpath("//span[normalize-space()='Save']");

    public AdminPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement getSignInForm(){
        element = driver.findElement(signInForm).getText();
        return driver.findElement(signInForm);
    }
    public WebElement getUsername(){
        return driver.findElement(username);

    }
    public WebElement getPassword(){
        return driver.findElement(password);
    }
    public WebElement getSignInButton(){
        return driver.findElement(signInButton);

    }
    public WebElement getAdminDashboard(){
        element = driver.findElement(adminDashboard).getText();
        return driver.findElement(adminDashboard);
    }
    public WebElement getAdmin(){
        return driver.findElement(admin);
    }


    public WebElement getDashboard(){
        element = driver.findElement(dashboard).getText();
        return driver.findElement(dashboard);

    }
    public WebElement getStakeholder(){
        return driver.findElement(stakeholderManagement);

    }
    public WebElement getStakeholderInfo(){
        element = driver.findElement(stakeholderInfo).getText();
        return driver.findElement(stakeholderInfo);

    }
    public WebElement getPlusButton(){
        element = driver.findElement(plusButton).getText();
        return driver.findElement(plusButton);

    }
    public WebElement getWorkingAreaDrop(){
        return driver.findElement(workingAreadrop);
    }
    public WebElement getCountryOffice(){
        return driver.findElement(countryOffice);

    }
    public WebElement getMRegion(){
        return driver.findElement(mRegion);

    }
    public WebElement getMagburaka(){
        return driver.findElement(magburaka);

    }
    public WebElement getMasingbi(){
        return driver.findElement(masingbi);

    }
    public WebElement getTarma(){
        return driver.findElement(tarma);

    }
    public WebElement getNextButton(){
        return driver.findElement(next);

    }
    public WebElement getStakeholderName(){
        return driver.findElement(stakeholderName);

    }
    public WebElement getGenderDrop(){
         return driver.findElement(genderDrop);

    }
    public WebElement getGender(){
        return driver.findElement(gender);
    }
    public WebElement getStakeholderType(){
        return driver.findElement(stakeholderType);

    }
    public WebElement getStakeHolder(){
        return driver.findElement(stakeholder);

    }
    public WebElement getMobileNo(){
        return driver.findElement(mobile);

    }
    public WebElement getDesignationDrop(){
        return driver.findElement(designationDrop);

    }
    public void getDesignation(){
        Select select = new Select(driver.findElement(designationDrop));
        select.selectByIndex(0);

    }
    public void getDisability(){
       Select select = new Select(driver.findElement(disability));
       select.selectByIndex(1);
    }
    public WebElement getSaveButton(){
       return driver.findElement(saveButton);
    }
}
