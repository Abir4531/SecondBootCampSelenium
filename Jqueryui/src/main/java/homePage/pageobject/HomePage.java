package homePage.pageobject;

import homePage.webelement.HomePageWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends HomePageWebElement {

    @FindBy(how = How.XPATH, using = HomePageWebElement.HomePageDemo)
    public static WebElement HomePageDem;

    public static WebElement getHomePageDemo() {
        return HomePageDem;
    }
    public static void SetclickHomePageDemo() {
        //waitUntilVisible((By) HomePageDem);
        getHomePageDemo().click();
        scrollUpDown(500);   }


    @FindBy(xpath = WebElementSearchBar)
    public static WebElement searchBar;
    public static WebElement getSearchBar() {
        return searchBar; }
    public static void SetClickHomeSearchBar() {
        getSearchBar().sendKeys("jungle Book movie");
      //  scrollUpDown(500);
    }

    @FindBy(xpath = WebElementSearchButton)
    public static WebElement searchButton;
    public static WebElement getSearchButton() {
        return searchButton; }
    public static void SetClickHomeSearchButton() {
        getSearchButton().click();

    }


}












