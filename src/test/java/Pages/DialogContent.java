package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;

    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashBoard;

    @FindBy(xpath="(//ms-add-button[contains(@tooltip,'TITLE.ADD')])//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    private WebElement successMessage;


    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    //my
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInputb;

    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,\"FIELD.NAME\")]//input")
    private WebElement searchInputb;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement searchButtonb;

    @FindBy(css = "svg[data-icon=\"trash-can\"]")
    private WebElement deleteButtonb;





    WebElement myElement;
    public void findAndSend(String strElement, String value)
    {
        switch (strElement){
            case "username" : myElement=username; break;
            case "password" : myElement=password; break;
            case "nameInput" : myElement=nameInput; break;
            case "shortNameInput" : myElement=shortNameInput; break;
            case "codeInputb" : myElement=codeInputb; break;
            case "searchInput" : myElement=searchInput; break;
            case "searchInputb" : myElement=searchInputb; break;
        }

        sendKeysFunction(myElement, value);

    }
    public void findAndClick(String strElement)
    {

        switch (strElement){

            case "acceptCookies" : myElement=acceptCookies; break;
            case "loginButton" : myElement=loginButton; break;
            case "addButton" : myElement=addButton; break;
            case "saveButton" : myElement=saveButton; break;
            case "searchButton" : myElement=searchButton; break;
            case "searchButtonb" : myElement=searchButtonb; break;
            case "editButton" : myElement=editButton; break;
            case "deleteButtonb" : myElement=deleteButtonb; break;
            case "deleteButton" : myElement=deleteButton; break;
            case "deleteDialogBtn" : myElement=deleteDialogBtn; break;




        }

        clickFunction(myElement);

    }
    public void findAndContainsText(String strElement, String text)
    {
        switch (strElement){
            case "dashboard" : myElement=dashBoard; break;
            case "successMessage" : myElement=successMessage; break;
        }

        verifyContainsText(myElement,text);

    }
    public void searchAndDelete(String searchText) {
        findAndSend("searchInput", searchText);
        findAndClick("searchButton");

        waitUntilLoading();

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");

    }



}
