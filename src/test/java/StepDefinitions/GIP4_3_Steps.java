package StepDefinitions;

import Pages.FormContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class GIP4_3_Steps {

    FormContent fc=new FormContent();

    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            fc.findAndClick(listElement.get(i));
        }
    }

    @And("Click the TAB key")
    public void clickTheEscKey() {
        Actions aksiyonlar = new Actions(GWD.getDriver());
        aksiyonlar.click().keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
    }
}
