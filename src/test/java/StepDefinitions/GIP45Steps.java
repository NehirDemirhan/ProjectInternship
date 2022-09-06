package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class GIP45Steps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            ln.findAndClick(listElement.get(i));
    }

    @And("Click on the element in the Dialog content")
    public void clickOnTheElementInTheDialogContent(DataTable elements) {
        List<String> listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndClick(listElement.get(i));
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage", "successfully");
    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.searchAndDelete(listElement.get(i));
        }
    }



}
