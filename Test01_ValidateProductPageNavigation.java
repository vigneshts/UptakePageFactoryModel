package Tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import org.testng.annotations.AfterTest;

import PageFactory.UptakeHomePage;

import PageFactory.ProductsPage;

public class Test01_ValidateProductPageNavigation {

    WebDriver driver;

    private String homeURL = "https://www.uptake.com";

    UptakeHomePage uptakeHomePage = new UptakeHomePage(driver);

    ProductsPage productsPage = new ProductsPage(driver);

    

    @BeforeTest

    public void setup(){

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        uptakeHomePage.navigateToHomePage(homeURL);

    }

    @Test(priority=0)

    public void validateProductPageNavigation(){

        uptakeHomePage.navigateToAnyHeaderPage(“Products");
            productsPage.validateProductsPage();

        }

        @AfterTest
        public void tearDown(){
            driver.close();
            driver.quit();
        }



    }