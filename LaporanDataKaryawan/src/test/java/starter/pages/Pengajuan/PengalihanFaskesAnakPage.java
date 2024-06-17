package starter.pages.Pengajuan;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PengalihanFaskesAnakPage extends PageObject {
    private By pengalihanFaskesAnakPage(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div/div/div/div/div/div/div[1]");
    }
    private By JenisFaskes(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div/div/div/div/div/div/div[1]/div[2]/input");
    }
    private By UbahDataButton(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[1]/div/div/div[2]/button");
    }
    private By NamaAnakPencabutan(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/input");
    }
    private By selanjutnyaButton(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[2]/button");
    }
    private By NamaAnakPemberian(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/input");
    }
    private By UploadPernyataanRtRw(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div[5]/div[1]/div/div[1]/div/input[1]");
    }
    private By UploadKeteranganBersekolah(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div[5]/div[2]/div/div[1]/div/input[1]");
    }
    private By clickLanjutkan2(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[2]/button[2]");
    }
    private By SuratPengalihan(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div/div/div/div[1]/div/input[1]");
    }
    private By SimpanPengalihan(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[2]/button[2]");
    }
    private By KirimPengalihan(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[1]/div/div/div[2]/button[1]");
    }
    private By MenyetujuiCheckBox(){
        return By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div/div/input");
    }
    private By KirimPengajuan(){
        return By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/button[2]");
    }
    private By PengajuanFaskesBerhasilSubmit(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[2]/a");
    }
    //Pengajuan Faskes Anak ke2kali
    private By PencabutanFaskesAnakKe2(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/input");
    }
    private By PemberianFaskesAnakKe2(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div[2]/form/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/input");
    }
    @Step
    public boolean ValidateOnFormFaskesAnak(){
        waitForRenderedElementsToBePresent(pengalihanFaskesAnakPage());
        return $(pengalihanFaskesAnakPage()).isDisplayed();
    }
    @Step
    public void InputJenisFaskes(){
        $(JenisFaskes()).typeAndEnter("Pengalihan Faskes Anak");
    }
    @Step
    public void ClickUbahData(){
        waitForRenderedElementsToBePresent(UbahDataButton());
        $(UbahDataButton()).click();
    }
    @Step
    public void InputNamaAnakPencabutan(){
        $(NamaAnakPencabutan()).typeAndEnter("Ahmad Naufal");
    }
    @Step
    public void clickSelanjutnya(){
        $(selanjutnyaButton()).click();
    }
    @Step
    public void InputNamaAnakPemberian(){
        waitForRenderedElementsToBePresent(NamaAnakPemberian());
        $(NamaAnakPemberian()).typeAndEnter("Putri Nadia Zahra");
    }
    @Step
    public void uploadPernyataanRTRW(){
        WebElement uploadElement = $(UploadPernyataanRtRw());
        uploadElement.sendKeys("C:/Users/yudika/Pernyataan rt rw sample.pdf");
    }
    @Step
    public void uploadKeteranganBersekolah(){
        WebElement uploadElement = $(UploadKeteranganBersekolah());
        uploadElement.sendKeys("C:/Users/yudika/Surat Keterangan Bersekolah sample.pdf");
    }
    @Step
    public void ClickLanjutkan2(){
        $(clickLanjutkan2()).click();
    }
    @Step
    public void uploadSuratPengalihan(){
        WebElement uploadElement = $(SuratPengalihan());
        uploadElement.sendKeys("C:/Users/yudika/Surat Keterangan Bersekolah sample.pdf");
    }
    @Step
    public void clickSimpanPengalihanButton(){
        $(SimpanPengalihan()).click();
    }
    @Step
    public void clickKirimPengalihanButton(){
        $(KirimPengalihan()).click();
    }
    @Step
    public void ClickMenyetujuiCheckBox(){
        $(MenyetujuiCheckBox()).click();
    }
    @Step
    public void clickKirimPengajuan(){
        $(KirimPengajuan()).click();
    }
    @Step
    public void validatePengajuanBerhasilDisubmit(){
        $(PengajuanFaskesBerhasilSubmit()).click();
    }
    //Pengalihan Faskes Anak Ke 2 kali
    @Step
    public void InputNamaPencabutanFaskesKe2(){
        $(PencabutanFaskesAnakKe2()).typeAndEnter("Ahmad Naufal");
    }
    @Step
    public void InputNamaPemberianFaskesKe2(){
        $(PemberianFaskesAnakKe2()).typeAndEnter("Putri Nadia Zahra");
    }
    
    // Pencabutan hak faskes dengan status faskes tidak tertanggung
    @Step
    public void StatusFaskesTidakDitanggung(){
        $(NamaAnakPencabutan()).typeAndEnter("Ahmad ").isDisabled();
    }
    //Object for Negative case
    private By warningMessage(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/img");
    }
    @Step
    public Boolean ValidateWarningMessageDisplayed(){
        return $(warningMessage()).isDisplayed();
    }

    private By submittedFor3Times(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/div/span");
    }
    @Step
    public Boolean ValidateWarningMessageSubmitted3times(){
        waitForRenderedElementsToBePresent(submittedFor3Times());
        return $(submittedFor3Times()).isDisplayed();
    }
}
