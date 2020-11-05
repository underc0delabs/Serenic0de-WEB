package starter.navigation;

import net.thucydides.core.annotations.Step;
import starter.pages.PageBase;

public class NavigateTo {

    PageBase pageBase;

    @Step("Que estoy en la web de Underc0de")
    public void underc0dePage() {
        pageBase.open();
    }
}
