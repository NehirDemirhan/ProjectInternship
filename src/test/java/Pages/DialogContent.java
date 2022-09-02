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


    @FindBy(xpath="//div[contains(text(),'successfully')]")
    private WebElement successMessage;






    WebElement myElement;
    public void findAndSend(String strElement, String value)
    {


        switch (strElement){
            case "username" : myElement=username; break;
            case "password" : myElement=password; break;

        }

        sendKeysFunction(myElement, value);

    }
    public void findAndClick(String strElement)
    {
        switch (strElement){
            case "acceptCookies" : myElement=acceptCookies; break;
            case "loginButton" : myElement=loginButton; break;
            case "addButton" : myElement=addButton; break;
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
        findAndSend("searchInput", searchText);//arama kutucuguna kelimeyi yaz
        findAndClick("searchButton");//arama butonuna bas

        waitUntilLoading();

        findAndClick("deleteButton");//silme butonuna bas
        findAndClick("deleteDialogBtn");//dialogtaki silme butonuna bas

    }

}
