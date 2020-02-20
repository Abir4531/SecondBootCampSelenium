package testHomePage;

import homePage.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

public static void getInItElements(){
    PageFactory.initElements(driver,HomePage.class);
}
@Test(priority = 1)
    public static void testHomePageDemo() throws InterruptedException {
    getInItElements();
    sleepFor(2);
    SetclickHomePageDemo();
    sleepFor(2);
}
@Test(priority = 2)
    public static void testHomePageSearchbar() throws InterruptedException {
    getInItElements();
    sleepFor(2);
    SetClickHomeSearchBar();sleepFor(2);
    SetClickHomeSearchButton();sleepFor(2);

    }



}






