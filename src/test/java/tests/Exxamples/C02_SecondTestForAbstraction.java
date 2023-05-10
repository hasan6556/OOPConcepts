package tests.Exxamples;

import OOPClasses.Informations;
import pages.InstagramLogin;
import pages.InstagramSingUp;
import org.testng.annotations.Test;
import pages.InstagramPage;
import utilities.Driver;

import static utilities.Driver.get;

public class C02_SecondTestForAbstraction {

    InstagramLogin instagramLogin=new InstagramLogin();
    InstagramSingUp instagramSingUp=new InstagramSingUp();
    Informations informations=new Informations();

    InstagramPage instagramPage=new InstagramPage();




    @Test
    public void test01(){
        informations.setUrl("https://www.instagram.com/");
        Driver.get().get(informations.getUrl());
        instagramLogin.setUserName("examplePerson_1233");
        instagramPage.nameBox.sendKeys(instagramLogin.getUserName());
        instagramLogin.setPassword("q1w2eq3q3eq");
        instagramPage.passwordBox.sendKeys(instagramLogin.getPassword());
        //Driver.quitDriver();
    }

    @Test
    public void test02(){
        informations.setUrl("https://www.instagram.com/accounts/emailsignup/");
        get().get(informations.getUrl());

        instagramSingUp.setEmail("examplemail@gmail.com");
        instagramPage.emailBox.sendKeys(instagramSingUp.getEmail());

        instagramSingUp.setNameSurname("Example User");
        instagramPage.nameSurnameBox.sendKeys(instagramSingUp.getNameSurname());

        instagramSingUp.setUserName("Example_User");
        instagramPage.userNameBox.sendKeys(instagramSingUp.getUserName());

        instagramSingUp.setPassword("qasksjnsnsjss");
        instagramPage.passwordBox.sendKeys(instagramSingUp.getPassword());
        //Driver.quitDriver();
    }
}
