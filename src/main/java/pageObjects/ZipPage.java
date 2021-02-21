package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZipPage extends BasePage {
    public ZipPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement zipcode;

    public void sendKeysZipCode (String a){
        zipcode.sendKeys(a);
    }

    @FindBy (xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private  WebElement continueBtn;

    public void clickContinueBtn(){
        continueBtn.click();
    }
}
