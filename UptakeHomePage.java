package Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

public class UptakeHomePage {

WebDriver driver;

@FindBy(xpath="//*[@class='l-site-header__brand']/a/svg")
WebElement homepageLogo;

@FindBy(className ="site-nav__item is-activeproducts")
WebElement productHeaderLink;

@FindBy(className ="site-nav__item is-activeindustries")
WebElement industriesHeaderLink;

@FindBy(className ="site-nav__item is-activeabout")
WebElement aboutHeaderLink;

@FindBy(className ="site-nav__item is-activeexpertise")
WebElement expertiseHeaderLink;

@FindBy(className ="site-nav__item is-activeblog")
WebElement newsHeaderLink;

@FindBy(className ="site-nav__item is-activecareers")
WebElement careersHeaderLink;

@FindBy(className ="site-nav__item is-activecontact")
WebElement contactHeaderLink;



public UptakeHomePage(WebDriver driver){
    this.driver = driver;
//This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}


//Method to navigate to Uptake homepage

public void navigateToHomePage(String url){
    driver.get(url);
    Assert.assertTrue(homepageLogo.isDisplayed(),”HomePage is displayed”);
}


//Method to navigate to one of the header links

public void navigateToAnyHeaderPage(String pageName){
    boolean linkFound=false;

    switch(expression) {

        case “Products” :
        productHeaderLink.click();

        case “Industries” :
        industriesHeaderLink.click();

        case “About” :
        aboutHeaderLink.click();

        case “Expertise” :
        expertiseHeaderLink.click();

        case “News&Insights” :
        newsHeaderLink.click();

        case “Careers” :
        careersHeaderLink.click();

        case “Contact” :
        contactHeaderLink.click();

        default :
        Assert.assertTrue(linkFound,”Link not found”)

    }
}
}