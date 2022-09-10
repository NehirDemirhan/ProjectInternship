package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class GIP2_Steps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    @And("We click on the element in the left Nav")
    public void weClickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            ln.findAndClick(listElement.get(i));
    }

    @And("We add new attestations in the Dialog content")
    public void weAddNewAttestationsInTheDialogContent(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            ln.findAndClick(listElement.get(i));

    }

    @And("The user sending the keys in Dialog content")
    public void theUserSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("We click on the element in the Dialog content")
    public void weClickOnTheElementInTheDialogContent(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndClick(listElement.get(i));
    }

    @Then("Success message should be displayed to user")
    public void successMessageShouldBeDisplayedToUser() {
        dc.findAndContainsText("successMessage", "successfully");
    }


    @And("The user delete item from Dialog")
    public void theUserDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.searchAndDelete(listElement.get(i));
        }

    }
}
