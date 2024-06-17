package starter.stepdefinition.PengalihanFaskesAnak;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.pages.Auth.Login.LoginPage;
import starter.pages.DashBoard.DashboardPage;
import starter.pages.Pengajuan.PengalihanFaskesAnakPage;

public class PengalihanFaskesAnak extends PageObject {
    @Steps
    PengalihanFaskesAnakPage pengalihanFaskesAnakPage;
    @Steps
    DashboardPage dashboardPage;

    @And("user diarahkan ke form faskes")
    public void directedToFormFaskesAnak(){
        Assertions.assertTrue(pengalihanFaskesAnakPage.ValidateOnFormFaskesAnak());
    }
    @And("user memilih pengalihan faskes anak")
    public void memilihPengalihanFaskes(){
        pengalihanFaskesAnakPage.InputJenisFaskes();
    }
    @And("user click ubah data")
    public void clickUbahData(){
        pengalihanFaskesAnakPage.ClickUbahData();
    }
    @And("user memilih salah satu nama anak untuk dilakukan pencabutan hak faskes ketika status faskes tertanggung telkom")
    public void pencabutanFaskes(){
        pengalihanFaskesAnakPage.InputNamaAnakPencabutan();
    }
    @And("user click selanjutnya")
    public void clickSelanjutnya(){
        pengalihanFaskesAnakPage.clickSelanjutnya();
    }
    @And("user memilih salah satu nama anak untuk dilakukan pemberian hak faskes ketika status faskes tidak tertanggung dan usia kurang lebih 21th")
    public void pemberianFaskes(){
        pengalihanFaskesAnakPage.InputNamaAnakPemberian();
    }
    @And("user upload surat pernyataan rt rw")
    public void UploadPernyataanRTRW(){
        pengalihanFaskesAnakPage.uploadPernyataanRTRW();
    }
    @And("user upload surat keterangan masih bersekolah")
    public void UploadKeteranganMasihBersekolah(){
        pengalihanFaskesAnakPage.uploadKeteranganBersekolah();
    }
    @And("user click lanjutkan")
    public void clickLanjutkan2(){
        pengalihanFaskesAnakPage.ClickLanjutkan2();
    }
    @And("user upload surat pernyataan pengalihan faskes anak")
    public void uploadPernyataanPengalihan(){
        pengalihanFaskesAnakPage.uploadSuratPengalihan();
    }
    @And("user click simpan")
    public void clickSimpanPengalihan(){
        pengalihanFaskesAnakPage.clickSimpanPengalihanButton();
    }
    @And("user click kirim")
    public void kirimPengalihan(){
        pengalihanFaskesAnakPage.clickKirimPengalihanButton();
    }
    @And("user menyetujui pernyataan")
    public void menyetujuiPernyataan(){
        pengalihanFaskesAnakPage.ClickMenyetujuiCheckBox();
    }
    @And("user click kirim pengajuan")
    public void KirimPengajuanButton(){
        pengalihanFaskesAnakPage.clickKirimPengajuan();
    }
    @Then("pengajuan pengalihan faskes anak berhasil tersubmit")
    public void pengalihanBerhasilDisubmit(){
        pengalihanFaskesAnakPage.validatePengajuanBerhasilDisubmit();
    }

    //Pengalihan Faskes Negative case 1
    @Then("warning message bahwa saya tidak dapat melakukan pengajuan pengalihan faskes anak jika anak terhitung masih dibawah 3 berhasil muncul")
    public void warningMessageDisplayed(){
        Assertions.assertTrue(pengalihanFaskesAnakPage.ValidateWarningMessageDisplayed());
    }
    //Pengalihan Faskes status pengajuan
    @And("user click halaman pengajuan")
    public void clickHalamanPengajuan(){
        dashboardPage.ClickPengajuanPage();
    }
    @And("user skip welcome pop up")
    public void userSkipPopUp(){
        dashboardPage.clickPopUp();
    }
    @And("user click section laporan data karyawan")
    public void clickSectionLaporanDataKaryawan(){
        dashboardPage.ClickLaporanDataKaryawan();
    }
    @And("user click sub section pengalihan fasilitas kesehatan")
    public void clickSubSectionPengalihanFaskes(){
        dashboardPage.subsectionPengalihanFaskes();
    }
    @Then("progress pengajuan pengalihan fasilitas kesehatan berhasil ditampilkan")
    public void progressPengajuanPengalihanFaskes(){
        dashboardPage.progressStatusPengajuanFaskes();
    }
    // Pengalihan Faskes Anak ke 2 kali
    @And("user memilih salah satu nama anak ke 2 untuk dilakukan pencabutan hak faskes")
    public void memilihNamaAnakPencabutanKe2Kali(){
        pengalihanFaskesAnakPage.InputNamaPencabutanFaskesKe2();
    }
    @And("user memilih salah satu nama anak ke 2 untuk dilakukan pemberian hak faskes")
    public void memilihNamaPemberianKe2Kali(){
        pengalihanFaskesAnakPage.InputNamaPemberianFaskesKe2();
    }
    // Pengalihan Faskes Anak Ke 3 kali
    @Then("warning message bahwa saya sudah melakukan 2 kali transaksi pengalihan faskes anak berhasil muncul")
    public void WarningMessageForSubmit3times(){
        pengalihanFaskesAnakPage.ValidateWarningMessageSubmitted3times();
    }
    // Pencabutan Hak faskes dengan status tanggungan faskes tidak ditanggung
    @And("user memilih salah satu nama anak untuk dilakukan pencabutan hak faskes ketika status faskes tidak ditanggung")
    public void NamaAnakStatusTanggunganFaskesTidakTertanggung(){
        pengalihanFaskesAnakPage.StatusFaskesTidakDitanggung();
    }
    @Then("nama anak yang tidak tertanggung dan akan dilakukan pencabutan hak faskes menjadi disable")
    public void NamaAnakTidakTertanggungDisable(){

    }
    //Pemberian hak faskes untuk anak disable
    @And("user memilih salah satu nama anak untuk dilakukan pemberian hak faskes ketika status faskes tidak tertanggung dan usia kurang lebih 21th dan dibawah 25th")
    public void DisableNamaPemberianHakFaskesAnak(){

    }
    @Then("nama anak tidak dapat digunakan untuk pemberian faskes")
    public void NamaAnakDisableUntukPemberianFaskes(){

    }
}
