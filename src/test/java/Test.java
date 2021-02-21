
import pageObjects.BaseTest;
import steps.SignUpSteps;

public class Test extends BaseTest {

    SignUpSteps singup = new SignUpSteps();

@org.junit.Test
    public void signUp() throws Exception{

        singup.navigateToSignUpForm();
        singup.enterZipCode();
        singup.enterMainData();
        singup.TextAssert();
    }
}
