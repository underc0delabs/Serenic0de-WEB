package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    Underc0dePage underc0depage;

    @Step("Que estoy en la web de Underc0de")
    public void underc0dePage() {
        underc0depage.open();
    }
}
