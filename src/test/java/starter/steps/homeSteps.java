package starter.steps;


import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ForoPage;
import net.thucydides.core.steps.ScenarioSteps;

public class homeSteps extends ScenarioSteps {

    @Steps
    ForoPage foroPage;

    @When("^Verifico que exista la seccion '(.*)'$")
    public void foroHome(String term) {
        foroPage.underc0deSection();
    }

}
