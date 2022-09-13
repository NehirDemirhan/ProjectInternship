package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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

    @FindBy(css = "ms-masked-text-field[placeholder='BANK_ACCOUNT.TITLE.IBAN'] input")
    private WebElement ibanText;

    @FindBy(id = "mat-select-value-11")
    private WebElement currency;

    @FindBy(xpath = "//span[contains(text(),' TRY ')]")
    private WebElement currencyTRY;

    @FindBy(xpath = "//span[contains(text(),' USD ')]")
    private WebElement currencyUSD;

    @FindBy(css = "ms-text-field[placeholder='GENERAL.FIELD.INTEGRATION_CODE'] input")
    private WebElement integrationCode;

    @FindBy(css = "ms-edit-button[class='ng-star-inserted'] button")
    private List<WebElement> editButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInputb;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,\"FIELD.NAME\")]//input")
    private WebElement searchInputb;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement searchButtonb;

    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']//button")
    private WebElement editButtonb;

    @FindBy(css = "svg[data-icon=\"trash-can\"]")
    private WebElement deleteButtonb;

    @FindBy(xpath = "//mat-form-field[@appearance='outline']//textarea")
    private WebElement description;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']//input")
    private WebElement order;

    @FindBy(xpath = "//td[contains(text(),'yalan')]//following::div/ms-edit-button")
    private WebElement gradeEdit;

    @FindBy(xpath = "//td[contains(text(),'nalan')]//following::div/ms-delete-button")
    private  WebElement gradeDelete;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'DESCRIPTION')]//input)[2]")
    private WebElement description2;

    @FindBy(xpath = "//ms-integer-field[contains(@placeholder,'PRIORITY')]// input")
    private WebElement priority;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,\"DESCRIPTION\")]//input)[1]")
    private WebElement description1;


    @FindBy(xpath = "(//mat-form-field[@style=\"margin-right: 8px;\"])[1]")
    private WebElement school;

    @FindBy(xpath = "//span[text()=\" New Auckland School \"]")
    private WebElement schoolNew;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname=\"capacity\"]//input")
    private WebElement capacity;

    @FindBy(xpath = "(//mat-form-field[@style=\"margin-right: 16px;\"])[2]//div")
    private WebElement locationType;


    @FindBy(xpath = "//span[text()=\" Other \"]")
    private WebElement locationTypeOther;

    @FindBy(xpath = "(//ms-add-button[contains(@tooltip,'BUTTON.ADD')])//button")
    private WebElement addFields;

    @FindBy (xpath = "//input[@id='ms-text-field-0']")
    private WebElement depName;

    @FindBy (xpath = "//input[@id='ms-text-field-1']")
    private WebElement depCode;











    WebElement myElement;
    public void findAndSend(String strElement, String value)
    {
        switch (strElement){
            case "username" : myElement=username; break;
            case "password" : myElement=password; break;
            case "nameInput" : myElement=nameInput; break;
            case "searchInput" : myElement=searchInput; break;
            case "shortNameInput" : myElement=shortNameInput; break;
            case "ibanText" : myElement=ibanText; break;
            case "integrationCode" : myElement=integrationCode; break;
            case "codeInputb" : myElement=codeInputb; break;
            case "searchInputb" : myElement=searchInputb; break;
            case "description" : myElement=description; break;
            case "order" : myElement=order; break;
            case "description2" : myElement=description2; break;
            case "priority" : myElement=priority; break;
            case "description1" : myElement=description1; break;
            case "capacity" : myElement =capacity; break;
            case "depName" :myElement=depName; break;
            case "depCode" :myElement=depCode; break;
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
            case "deleteButton" : myElement=deleteButton; break;
            case "deleteDialogBtn" : myElement=deleteDialogBtn; break;
            case "currency" : myElement=currency; break;
            case "currencyTRY" : myElement=currencyTRY; break;
            case "currencyUSD" : myElement=currencyUSD; break;
            case "editButton" :
                GWD.getWait().until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-edit-button[class='ng-star-inserted'] button"),editButton.size()));
                myElement=editButton.get(0);
                break;
            case "searchButtonb" : myElement=searchButtonb; break;
            case "editButtonb" : myElement=editButtonb; break;
            case "deleteButtonb" : myElement=deleteButtonb; break;
            case "gradeEdit" : myElement=gradeEdit; break;
            case "gradeDelete" : myElement=gradeDelete; break;
            case "school" : myElement =school; break;
            case "schoolNew" : myElement =schoolNew; break;
            case "locationType" : myElement =locationType; break;
            case "locationTypeOther" : myElement =locationTypeOther; break;
            case "addFields" : myElement =addFields; break;
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
        waitUntilLoading(searchButton);
        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");

    }

}
