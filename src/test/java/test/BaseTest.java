package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    @BeforeClass
    public void init() {
        Configuration.browser = "chrome";
        Configuration.timeout = 5000;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverRunner.setWebDriver(driver);
        getWebDriver().manage().window().maximize();
    }

    @AfterClass
    public void quit() {
        getWebDriver().quit();
    }
}
