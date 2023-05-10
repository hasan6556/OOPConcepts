package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class Common extends Driver {


    public Common() {

        PageFactory.initElements(driver,this);
    }


}

