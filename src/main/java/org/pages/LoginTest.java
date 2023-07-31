package org.pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {


        try {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get(" https://staging.mazaady.com/login");
            driver.manage().window().maximize();

            LoginPage loginPage = new LoginPage(driver);
            AddProductPage addProductPage = new AddProductPage(driver);

            loginPage.enterEmail("tester@task.com");
            loginPage.enterPassword("11111111");
            loginPage.clickLoginButton();

            addProductPage.clickAddProductButton();
            addProductPage.clickAuctionTypeRadioButton();
            addProductPage.clickStep1Button();
            Thread.sleep(3000);
            addProductPage.clickAuctionTypeStep2RadioButton();
            addProductPage.enterAuctionName("asdasd");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
