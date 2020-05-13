package dvsa.cvs.StepDefs;

import io.cucumber.java8.En;

public class Hooks implements En{

    public Hooks() {

        Before(() -> {
            System.out.println("THIS IS BEFORE");
        });
//
//        After(() -> {

//        });







    }

}
