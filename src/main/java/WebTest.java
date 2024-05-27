import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pages.pageObjectManager.PageObjectManager.driver;

public class WebTest {
    public static void main(String[] args) {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "E:\\Projects\\27-05-2024 Download\\live-web-application-automation\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();

        String url = "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account";
        driver.get(url);

        By username = By.id("email");
        By password = By.id("passwd");
        By signin = By.id("SubmitLogin");

        WebElement email = driver.findElement(username);
        email.sendKeys("abcd@test.com");

        WebElement pass = driver.findElement(password);
        pass.sendKeys("12345");

        WebElement login = driver.findElement(signin);
        login.click();

        System.out.println("Logged in successfully");

        driver.quit();


    }
}
