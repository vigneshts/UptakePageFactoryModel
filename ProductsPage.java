package Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

public class ProductsPage {

	WebDriver driver;

	private String expectedURL = "https://www.uptake.com/products";


	public ProductsPage(WebDriver driver){
		this.driver = driver;
//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}


//Method to validate Products homepage

	public void validateProductsPage(){
		Assert.assertTrue(driver.getCurrentURL.equalsIgnoreCase(expectedURL), "Products page is NOT displayed");
	}

}

