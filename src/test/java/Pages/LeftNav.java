package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Human Resources'])[1]")
    private WebElement humanResources;

    @FindBy(xpath="(//span[text()='Setup'])[3]")
    private WebElement setupThree;

    @FindBy(xpath="(//span[text()='Positions'])[1]")
    private WebElement positions;

    @FindBy(xpath="(//span[contains(text(),'Setup')])[1]")
    private WebElement setupOne;

    @FindBy(xpath="(//span[contains(text(),'Parameters')])[1]")
    private WebElement parameters;

    @FindBy(xpath="(//span[contains(text(),'Bank Accounts')])[1]")
    private WebElement bankAccounts;

    //my
    @FindBy(xpath="//span[text()='Education']")
    private WebElement educationb;

    @FindBy(xpath="(//span[text()='Setup'])[4]")
    private WebElement setupfourb;

    @FindBy(xpath="//span[text()='Subject Categories']")
    private WebElement subjectCategoriesb;

    @FindBy(xpath="(//span[contains(text(),'Document Types')])[1]")
    private WebElement documentTypes;

    @FindBy(xpath="//span[contains(text(),'Grade Levels')]")
    private WebElement gradeLevels;

    @FindBy(css = "[class='nav-link-title ng-tns-c249-18 ng-star-inserted']")
    private WebElement setup;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ATTESTATION.TITLE.ADD')]")
    private WebElement addButtonn;
    @FindBy(xpath="//span[text()='Attestations']")
    private WebElement attestations;



    WebElement myElement;
    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "humanResources" : myElement=humanResources; break;
            case "setupThree" : myElement=setupThree; break;
            case "positions" : myElement=positions; break;
            case "setupOne" : myElement=setupOne; break;
            case "parameters" : myElement=parameters; break;
            case "bankAccounts" : myElement=bankAccounts; break;
            case "educationb" : myElement=educationb; break;
            case "setupfourb" : myElement=setupfourb; break;
            case "subjectCategoriesb" : myElement=subjectCategoriesb; break;
            case "documentTypes" : myElement=documentTypes; break;
            case "gradeLevels" : myElement=gradeLevels; break;
            case "setup" : myElement=setup; break;
            case "attestations" : myElement=attestations; break;
            case "addButtonn" : myElement=addButtonn; break;
        }

        clickFunction(myElement);
    }

}
