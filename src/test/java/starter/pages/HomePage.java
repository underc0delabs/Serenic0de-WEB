package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.PageObject;



public class HomePage extends PageObject {

    @FindBy(className = "btn")
    private WebElement foroButton;

    public void clickForoButton(){
       foroButton.click();
    }

}

