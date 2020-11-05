package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    @FindBy(className = "btn")
    private WebElement foroButton;

    public void clickForoButton(){
        foroButton.click();
    }

}

