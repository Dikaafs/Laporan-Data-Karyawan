package starter.stepdefinition.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.Auth.Login.LoginPage;
import starter.pages.DashBoard.DashboardPage;

public class Login {

    @Steps
    LoginPage loginPage;

    @Steps
    DashboardPage dashboardPage;

    @Given("user berada di halaman login")
    public void beradaDiHalamanLogin(){
        loginPage.openUrl("https://diarium-hijau-dev.apps.kpaasjtn1.telkom.co.id/app/request/faskes/create");
        loginPage.validateOnTheLoginPage();
    }
    @When("user memasukan NIK")
    public void inputNIK(){
        loginPage.EnterNIK("xyz");
    }
    @And("user memasukan password")
    public void inputPassword(){
        loginPage.EnterPassword("fortestonly");
    }
    @And("user click sign button")
    public void clickSignButton(){
        loginPage.clickSignButton();
    }
    @And("user diarahkan ke dashboard page")
    public void directToDashboardPage(){
        Assertions.assertTrue(dashboardPage.validateOnTheDashboardPage());
    }
}
