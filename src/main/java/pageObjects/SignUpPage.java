package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SignUpPage extends BasePage{

    public SignUpPage(WebDriver driver){

        super(driver);
    }



    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
    private WebElement firtsname;

    public void FirstName(String a){
        firtsname.sendKeys(a);
    }

    @FindBy (xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement lastname;

    public void LastName (String a){
        lastname.sendKeys(a);
    }

    @FindBy (xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement email;

    public void Email (String a){
        email.sendKeys(a);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
    private WebElement password;

    public void Password (String a){
        password.sendKeys(a);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
    private WebElement confirmpassword;

    public void ConfirmPassword (String a){
        confirmpassword.sendKeys(a);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
    private WebElement registerBtn;

    public void RegisterBtn (){
        registerBtn.click();
    }


    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span")
    private WebElement text;

    public void  TextAssert (){
        Assert.assertEquals("Account is created!", text.getText());
    }

}







