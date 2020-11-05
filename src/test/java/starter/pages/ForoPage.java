package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForoPage extends PageObject {
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/table/tbody[8]/tr[1]/td[2]/a")
    private WebElement underc0deSection;

    public void underc0deSection(){(underc0deSection).isDisplayed();}
}
