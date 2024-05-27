package stepDefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Admin.AdminPage;
import utils.ContextSetup;

import java.time.Duration;
import java.util.Set;

public class Steps {

    public WebDriver driver;
    ContextSetup contextSetup;
    AdminPage adminPage;

    public Steps(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.adminPage = contextSetup.pageObjectManager.getAdminPage();
        this.driver = adminPage.driver;
    }

    @Given("Signin form is displayed")
    public void SignInForm() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(adminPage.getSignInForm()));
        Assert.assertTrue(adminPage.getSignInForm().isDisplayed());
    }
    @When("enter username and password")
    public void ValidCredentials() {

        Assert.assertTrue(adminPage.getUsername().isDisplayed());
        adminPage.getUsername().sendKeys("qa");

        Assert.assertTrue(adminPage.getPassword().isDisplayed());
        adminPage.getPassword().sendKeys("123");

    }
    @When("Click on the Signin button")
    public void SignInButton() {

        Assert.assertTrue(adminPage.getSignInButton().isDisplayed());
        adminPage.getSignInButton().click();

    }
    @Then("Admin dashboard is displayed")
    public void AdminDashboard() {

        Assert.assertTrue(adminPage.getAdminDashboard().isDisplayed());
//        Assert.assertEquals(adminPage.getAdminDashboard().getText(), adminPage.element);
//        System.out.println(adminPage.element);

    }
    @When("Click on the Admin")
    public void ClickAdmin() {
        Assert.assertTrue(adminPage.getAdmin().isDisplayed());
        adminPage.getAdmin().click();

    }

    @Then("Check that the user dashboard is displayed")
    public void check_that_the_user_dashboard_is_displayed() {
        Assert.assertTrue(adminPage.getDashboard().isDisplayed());
        Assert.assertEquals(adminPage.getDashboard().getText(), adminPage.element);
        System.out.println(adminPage.element);

    }

    @Then("Check that Stakeholder management option is available")
    public void checkThatStakeholderManagementOptionIsAvailable() {

        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));


        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
//        Assert.assertTrue(adminPage.getStakeholder().isDisplayed());
    }

    @When("Click on the Stakeholder Management")
    public void clickOnTheStakeholderManagement() {
        adminPage.getStakeholder().click();
    }

    @Then("check that Stakeholder info is displayed")
    public void checkThatStakeholderInfoIsDisplayed() {
        Assert.assertTrue(adminPage.getStakeholderInfo().isDisplayed());
    }

    @When("Click on the Stakeholder info")
    public void clickOnTheStakeholderInfo() {
        adminPage.getStakeholderInfo().click();
    }

    @And("Click on the plus button")
    public void clickOnThePlusButton() {
        adminPage.getPlusButton().click();
    }

    @And("Select working area to tarma")
    public void selectWorkingAreaToTarma() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(adminPage.getWorkingAreaDrop()));
        adminPage.getWorkingAreaDrop().click();
        adminPage.getCountryOffice().click();
        adminPage.getMRegion().click();
        adminPage.getMRegion().click();
        adminPage.getMagburaka().click();
        adminPage.getMasingbi().click();
        adminPage.getTarma().click();


    }

    @And("Click on the next button")
    public void clickOnTheNextButton() {
        adminPage.getNextButton().click();

    }

    @And("enter stakeholder name")
    public void enterStakeholderName() {
        Assert.assertTrue(adminPage.getStakeholderName().isDisplayed());
        adminPage.getStakeholderName().sendKeys("John Doe");

    }

    @And("Select gender and stakeholder type")
    public void selectGenderAndStakeholderType() {
       adminPage.getGenderDrop().click();
       adminPage.getGender().click();
       adminPage.getStakeholderType().click();
       adminPage.getStakeHolder().click();


    }

    @And("enter mobile no")
    public void enterMobileNo() {
        Assert.assertTrue(adminPage.getMobileNo().isDisplayed());
        adminPage.getMobileNo().sendKeys("01785965324");
    }

    @And("select designation and disability")
    public void selectDesignationAndDisablility() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", adminPage.getDesignationDrop());
//        adminPage.getDesignationDrop().click();
        adminPage.getDesignation();

//        adminPage.getDisabilityDrop().click();
        adminPage.getDisability();

    }

    @And("Click on the Save button")
    public void clickOnTheSaveButton() {
        Assert.assertTrue(adminPage.getSaveButton().isDisplayed());
        adminPage.getSaveButton().click();
    }
}
