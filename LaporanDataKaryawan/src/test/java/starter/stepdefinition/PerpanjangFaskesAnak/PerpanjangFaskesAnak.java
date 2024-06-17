package starter.stepdefinition.PerpanjangFaskesAnak;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.Pengajuan.PerpanjangFaskesAnakPage;

public class PerpanjangFaskesAnak {
    @Steps
    PerpanjangFaskesAnakPage perpanjangFaskesAnakPage;

    @And("user memilih perpanjangan faskes anak")
    public void memilihPerpanjangFaskesAnak(){
        perpanjangFaskesAnakPage.PilihPerpanjangFaskes();
    }
    @And("user menginput nama anak yang memiliki tanggungan kesehatan dan ingin diperpanjang")
    public void inputNamaAnakPerpanjangFaskes(){
        perpanjangFaskesAnakPage.InputNamaAnakPerpanjangFaskes();
    }
    @And("Mandatory lain auto terinput")
    public void MandatoryAutoFill(){
       Assertions.assertTrue(perpanjangFaskesAnakPage.ValidateMandatoryAutoFill());
    }
    @And("user upload surat pernyataan rt rw untuk perpanjang faskes")
    public void uploadSuratRtRwPerpanjangFaskes(){
        perpanjangFaskesAnakPage.UploadRtRwPerpanjangFaskes();
    }
    @And("user upload surat keterangan masih bersekolah untuk perpanjang faskes")
    public void uploadKeteranganSekolahPerpanjangFaskes(){
        perpanjangFaskesAnakPage.UploadKeteranganBersekolahPerpanjangFaskes();
    }
    @And("user click Checkbox perpanjang faskes")
    public void clickCheckboxPerpanjangFaskes(){
        perpanjangFaskesAnakPage.clickCheckboxPerpanjangFaskes();
    }
    @And("user click kirim pengajuan perpanjang faskes")
    public void KirimPengajuanPerpanjangFaskes(){
        perpanjangFaskesAnakPage.clickKirimPengajuanPerpanjangFaskes();
    }
    @Then("pengajuan perpanjang faskes anak berhasil disubmit")
    public void PerpanjangFaskesBerhasilSubmit(){
        Assertions.assertTrue(perpanjangFaskesAnakPage.ValidatePerpanjangFaskesSubmitted());
    }
    //Input nama anak tidak terdaftar pada diarium
    @And("user menginput nama anak yang belum terdaftar pada diarium")
    public void NamaAnakTidakTerdataPadaDiarium(){
        perpanjangFaskesAnakPage.InputNamaAnakTidakTerdataDiarium();
    }
    @Then("pesan opsi tidak tersedia berhasil ditampilkan")
    public void opsiPilihanTidakTersedia(){

    }
    //User mencoba mengubah mandatory pada form perpanjang faskes
    @And("user mencoba untuk mengubah mandatory tanggal lahir pada form pengajuan perpanjang faskes anak")
    public void MandatoryDisabled(){
        perpanjangFaskesAnakPage.ValidateMandatoryDisabled();
    }
    @Then("data yang ada pada mandatory tidak dapat diubah")
    public void DataMandatoryTidakDapatDiubah(){

    }
    //Status pengajuan Perpanjang Faskes
    @And("user click sub section perpanjang fasilitas kesehatan")
    public void clickSubSectionPerpanjangFaskes(){
        perpanjangFaskesAnakPage.clickSubSectionPerpanjangFaskes();
    }
    @Then("progress pengajuan perpanjang fasilitas kesehatan berhasil ditampilkan")
    public void progressPengajuanPerpanjangFaskes(){
        perpanjangFaskesAnakPage.ValidateStatusProgressPerpanjangFaskes();
    }
    //Perpanjang Faskes anak berusia 25th lebih
    @And("user menginput nama anak yang sudah terdaftar pada diarium dengan usia lebih dari 25th")
    public void inputNamaAnakBerusia25thLebih(){
        perpanjangFaskesAnakPage.InputNamaAnak25thLebih();
    }
    @Then("nama anak diatas 25th menjadi disable")
    public void NamaAnak25thMenjadiDisable(){

    }

    //Perpanjang faskes anak yang tidak memiliki tanggungan faskes
    @And("user menginput nama anak yang tidak tertanggung fasilitas kesehatan")
    public void NamaAnakYangTidakTertanggungFaskes(){
        perpanjangFaskesAnakPage.InputNamaAnakTidakTertanggungFaskes();
    }
    @Then("nama anak yang tidak memiliki tanggungan faskes menjadi disable")
    public void NamaAnakDisable(){
    }
}
