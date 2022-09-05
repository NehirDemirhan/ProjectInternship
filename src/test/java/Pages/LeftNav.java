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




    WebElement myElement;
    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "humanResources" : myElement=humanResources; break;
            case "setupThree" : myElement=setupThree; break;
            case "positions" : myElement=positions; break;

        }

        clickFunction(myElement);
    }

}
