package starter.pages.Pengajuan;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PerpanjangFaskesAnakPage extends PageObject {
    private By PerpanjangFaskes(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[1]/div/div/div/div/div/div/div[1]/div[2]/input");
    }
    private By NamaAnakPerpanjangFaskes(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/input");
    }
    private By MandatoryAutoFill(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div[1]/div[2]/div/input");
    }
    private By perpanjangSubmitted(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[2]/a");
    }
    private By MandatoryDisabled(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div[2]/div[2]/div/div/input");
    }
    private By SubSectionPerpanjangFaskes(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/h2/button");
    }
    private By StatusProgressPerpanjangFaskes(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[5]");
    }
    private By UploadRTRWPerpanjangFaskes(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div/div[1]/div/div[1]/div/input[1]");
    }
    private By KeteranganBersekolahPerpanjangFaskes(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div/div[2]/div/div[1]/div/input[1]");
    }
    private By CheckboxPerpanjangFaskes(){
        return By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div/div/input");
    }
    private By KirimPengajuanPerpanjangFaskes(){
        return By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/button[2]");
    }
    public void PilihPerpanjangFaskes(){
        $(PerpanjangFaskes()).typeAndEnter("Perpanjangan & Update Faskes");
    }
    public void InputNamaAnakPerpanjangFaskes(){
        $(NamaAnakPerpanjangFaskes()).typeAndEnter("Putri Nadia Zahra");
    }
    public void InputNamaAnakTidakTerdataDiarium(){
        $(NamaAnakPerpanjangFaskes()).typeAndEnter("Renaldi junior");
    }
    public void InputNamaAnak25thLebih(){
        $(NamaAnakPerpanjangFaskes()).typeAndEnter("Ahmad Naufal");
    }
    public void clickSubSectionPerpanjangFaskes(){
        $(SubSectionPerpanjangFaskes()).click();
    }
    public void UploadRtRwPerpanjangFaskes(){
        WebElement uploadElement = $(UploadRTRWPerpanjangFaskes());
        uploadElement.sendKeys("C:/Users/yudika/Pernyataan rt rw sample.pdf");
    }
    public void UploadKeteranganBersekolahPerpanjangFaskes(){
        WebElement uploadElement = $(KeteranganBersekolahPerpanjangFaskes());
        uploadElement.sendKeys("C:/Users/yudika/Surat Keterangan Bersekolah sample.pdf");
    }
    public void clickCheckboxPerpanjangFaskes(){
        $(CheckboxPerpanjangFaskes()).click();
    }
    public void clickKirimPengajuanPerpanjangFaskes(){
        $(KirimPengajuanPerpanjangFaskes()).click();
    }
    public Boolean ValidateMandatoryAutoFill(){
        return $(MandatoryAutoFill()).isDisplayed();
    }
    public Boolean ValidatePerpanjangFaskesSubmitted(){
        return $(perpanjangSubmitted()).isDisplayed();
    }
    public Boolean ValidateMandatoryDisabled(){
        return $(MandatoryDisabled()).isDisabled();
    }
    public Boolean ValidateStatusProgressPerpanjangFaskes(){
        return $(StatusProgressPerpanjangFaskes()).isDisplayed();
    }
    public void InputNamaAnakTidakTertanggungFaskes(){
        $(NamaAnakPerpanjangFaskes()).typeAndEnter("Ahmad Naufal").isDisabled();
    }
}
