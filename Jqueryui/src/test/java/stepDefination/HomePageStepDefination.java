package stepDefination;

import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import testHomePage.TestHomePage;

public class HomePageStepDefination extends TestHomePage {


    @Given("I am in jqueryui.com")
    public void i_am_in_jqueryui_com() {
        System.setProperty("Webdriver.chrome.driver","BrowserDriver/Windows/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://jqueryui.com/");
    }
    @Given("I am Clicking on Demos")
    public void i_am_Clicking_on_Demos() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        SetclickHomePageDemo();
    }


}
