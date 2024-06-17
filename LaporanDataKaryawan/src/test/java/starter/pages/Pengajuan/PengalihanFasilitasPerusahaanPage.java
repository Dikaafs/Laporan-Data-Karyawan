package starter.pages.Pengajuan;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PengalihanFasilitasPerusahaanPage extends PageObject {
    private By PengalihanFasilitasPerusahaan(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[3]/div/div/div/form/div[4]/div/div/button");
    }
    private By NamaNikPasutriTelkomAutoFill(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[3]/div/div/div/form/div[3]/div[1]/input");
    }
    private By submitAlihPerusahaan(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[3]/div/div/div/form/div[4]/div/div/button");
    }
    private By CheckBoxAlihFasilitasPerusahaan(){
        return By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/input");
    }
    private By kirimPengajuanAlihFasilitasPerusahaan(){
        return By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div[2]/div[2]/button");
    }
    private By AlihPerusahaanSubmitted(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[2]/a");
    }
    // status pengajuan fasilitas perusahaan
    private By subSectionAlihFasilitasPerusahaan(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[3]/h2/button");
    }
    private By statusPengajuanAlihFasilitasPerusahaan(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[3]/h2/button");
    }
    // pengalihan fasilitas perusahaan Pasutri Non Telkom
    private By WarningMessageNonTelkom(){
        return By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div[1]");
    }
    @Step
    public void ValidasiBeradaPadaFormPengalihanFasilitasPerusahaan(){
        waitForRenderedElementsToBePresent(PengalihanFasilitasPerusahaan());
         $(PengalihanFasilitasPerusahaan()).isDisplayed();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void PasutriTelkomAutoFill(){
        $(NamaNikPasutriTelkomAutoFill()).isDisplayed();
    }
    @Step
    public void clickSubmitAlihPerusahaan(){
        $(submitAlihPerusahaan()).click();
    }
    @Step
    public void clickCheckboxAlihFasilitasPerusahaan(){
        $(CheckBoxAlihFasilitasPerusahaan()).click();
    }
    @Step
    public void clickKirimAlihFasilitasPerusahaan(){
        $(kirimPengajuanAlihFasilitasPerusahaan()).click();
    }
    @Step
    public void validateAlihPerusahaanSubmitted(){
        $(AlihPerusahaanSubmitted()).isDisplayed();
    }

    //status pengajuan alih fasilitas perusahaan
    @Step
    public void clickSubSectionAlihFasilitasPerusahaan(){
        $(subSectionAlihFasilitasPerusahaan()).click();
    }
    @Step
    public void StatusPengajuanAlihFasilitasPerusahaan(){
        $(statusPengajuanAlihFasilitasPerusahaan());
    }
    //pengalihan fasilitas perusahaan Pasutri Non Telkom
    public void ValidateWarningMessageNonTelkom(){
        $(WarningMessageNonTelkom()).isDisplayed();
    }
}
