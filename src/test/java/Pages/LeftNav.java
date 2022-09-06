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

    //my
    @FindBy(xpath="//span[text()='Education']")
    private WebElement educationb;

    @FindBy(xpath="(//span[text()='Setup'])[4]")
    private WebElement setupfourb;

    @FindBy(xpath="//span[text()='Subject Categories']")
    private WebElement subjectCategoriesb;








    WebElement myElement;
    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "humanResources" : myElement=humanResources; break;
            case "setupThree" : myElement=setupThree; break;
            case "positions" : myElement=positions; break;
            case "educationb" : myElement=educationb; break;
            case "setupfourb" : myElement=setupfourb; break;
            case "subjectCategoriesb" : myElement=subjectCategoriesb; break;

        }

        clickFunction(myElement);
    }

}
