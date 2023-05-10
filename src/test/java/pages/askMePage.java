package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class askMePage {

    // Page sayfalari o web sayfasinda kullanilacak locate'ler
    // ve varsa login islemi gibi basit method'lar icin kullanilir



    @FindBy(xpath="//input[@aria-label=\"Search\"]")
    public WebElement askMeAramaKutusu;



}
