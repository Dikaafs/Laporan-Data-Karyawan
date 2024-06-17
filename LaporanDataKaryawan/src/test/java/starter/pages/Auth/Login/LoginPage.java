package starter.pages.Auth.Login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By LoginTitle(){
        return By.xpath("/html/body/div[1]/div[1]/div/div/div/a/img");
    }
    private By NIK(){
        return By.xpath("/html/body/div[1]/div[1]/div/div/div/form/div[1]/input");
    }
    private By Password(){
        return By.xpath("/html/body/div[1]/div[1]/div/div/div/form/div[2]/div[2]/input");
    }
    private By SignButton(){
        return By.xpath("/html/body/div[1]/div[1]/div/div/div/form/button");
    }

    @Step
    public boolean validateOnTheLoginPage(){
        return $(LoginTitle()).isDisplayed();
    }
    @Step
    public void EnterNIK(String nik){
        $(NIK()).type(nik);
    }
    @Step
    public void EnterPassword(String password){
        $(Password()).type(password);
    }
    @Step
    public void clickSignButton(){
        $(SignButton()).click();
    }
}
