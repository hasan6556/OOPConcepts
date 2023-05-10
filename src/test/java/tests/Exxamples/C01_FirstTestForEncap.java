package tests.Exxamples;

import OOPClasses.Informations;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.askMePage;
import pages.AmazonPage;
import utilities.Driver;

public class C01_FirstTestForEncap {

    Informations informations=new Informations();
    AmazonPage amazonPage=new AmazonPage();

    askMePage askMePage=new askMePage();

    @Test
    public void test01(){
        //Encapsulation kullanımına örnek olarak

        informations.setUrl("https://www.amazon.com");
        Driver.get().get(informations.getUrl());
        //Assertion by Encapsulation
        informations.setLink("https://www.amazon.com/");
        String actualUrl=Driver.get().getCurrentUrl();
        Assert.assertEquals(informations.getLink(),actualUrl);
        //Searching by Encapsulation
        informations.setTextForSearchBox("Nutella");
        amazonPage.amazonAramaKutusu.sendKeys(informations.getTextForSearchBox() + Keys.ENTER);
        Driver.closeDriver();
    }

    @Test
    public void test02(){
        //Encapsulation kullanımına örnek olarak

        informations.setUrl("https://www.ask.com/");
        Driver.get().get(informations.getUrl());
        //Assertion by Encapsulation
        informations.setLink("https://www.ask.com/");
        String actualUrl=Driver.get().getCurrentUrl();
        Assert.assertEquals(informations.getLink(),actualUrl);
        //Searching by Encapsulation
        informations.setTextForSearchBox("Java");
        askMePage.askMeAramaKutusu.sendKeys(informations.getTextForSearchBox() + Keys.ENTER);
        Driver.closeDriver();
    }

}
