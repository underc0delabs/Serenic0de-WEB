package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {

    @FindBy(className = "btn")
    private WebElement foroButton;

    public void clickForoButton(){
        foroButton.click();
    }

}

