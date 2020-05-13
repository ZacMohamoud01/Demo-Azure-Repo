package dvsa.cvs.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {

    final By searchField = By.id("sted");
    final By somethingElse = By.cssSelector("sted");

    String URL = "https://google.com";


    public HomePage() {
        super();
    }

    public void goTo(){
        visit(URL);
    }





}
