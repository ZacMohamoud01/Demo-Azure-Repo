package dvsa.cvs.StepDefs;

import dvsa.cvs.pageObjects.HomePage;
import io.cucumber.java8.En;

public class firstSteps implements En {

    public HomePage homePage;

    public firstSteps(){

        homePage = new HomePage();


        Given("I load the google homepage", () -> {
            homePage.goTo();
        });





    }

}
