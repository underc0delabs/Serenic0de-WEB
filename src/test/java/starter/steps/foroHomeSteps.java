package starter.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.pages.ForoPage;
import starter.pages.HomePage;

public class foroHomeSteps {

    @Steps
    NavigateTo navigateTo;

    @Steps
    HomePage homePage;
    ForoPage foroPage;

    @Given("Que estoy en la web de Underc0de")
    public void underc0deHome() {
        navigateTo.underc0dePage();
    }

    @When("Ingreso al foro")
    public void foroButton() {
        homePage.clickForoButton();
    }

    @When("Verifico que exista la seccion \"(.*)\"")
    public void foroHome(String term) {
        foroPage.underc0deSection();
    }

}
