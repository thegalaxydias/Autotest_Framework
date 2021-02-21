package steps;

import org.junit.Assert;
import pageObjects.BaseTest;
import pageObjects.MainPage;
import pageObjects.ZipPage;
import pageObjects.SignUpPage;

public class SignUpSteps extends BaseTest {

    MainPage mainPage   = new MainPage(getDriver());
    ZipPage zipPage = new ZipPage(getDriver());
    SignUpPage signUpPage = new SignUpPage(getDriver());

    public void navigateToSignUpForm()
    {
        mainPage.clickEnterBtn();
        mainPage.clickSignUpBtn();
    }

    public void enterZipCode(){
        zipPage.sendKeysZipCode("11111");
        zipPage.clickContinueBtn();
    }

    public  void enterMainData(){
        signUpPage.FirstName("test");
        signUpPage.LastName("testovich");
        signUpPage.Email("test@gmail.com");
        signUpPage.Password("11111");
        signUpPage.ConfirmPassword("11111");
        signUpPage.RegisterBtn();

    }

public void TextAssert(){
     signUpPage.TextAssert();
}

}
