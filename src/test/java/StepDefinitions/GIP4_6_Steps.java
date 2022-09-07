package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class GIP4_6_Steps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    @And("Click on  Subject the element in the left Nav")
    public void clickOnSubjectTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            ln.findAndClick(listElement.get(i));
    }
    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndClick(listElement.get(i));
    }
    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }
    @And("Success message should be display")
    public void successMessageShouldBeDisplay() {
        dc.findAndContainsText("successMessage", "successfully");
    }
}
