package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstagramPage extends Common{

    // Page sayfalari o web sayfasinda kullanilacak locate'ler
    // ve varsa login islemi gibi basit method'lar icin kullanilir






    @FindBy(xpath="//*[@type=\"text\"]")
    public WebElement nameBox;

    @FindBy(xpath="(//*[@type=\"text\"])[3]")
    public WebElement userNameBox;

    @FindBy(xpath="//*[@type=\"password\"]")
    public WebElement passwordBox;

    @FindBy(xpath="(//*[@type=\"text\"])[1]")
    public WebElement emailBox;


    @FindBy(xpath="(//*[@type=\"text\"])[2]")
    public WebElement nameSurnameBox;




}
