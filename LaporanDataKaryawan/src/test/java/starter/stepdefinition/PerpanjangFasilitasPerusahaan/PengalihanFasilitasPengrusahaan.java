package starter.stepdefinition.PerpanjangFasilitasPerusahaan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.Pengajuan.PengalihanFasilitasPerusahaanPage;

public class PengalihanFasilitasPengrusahaan {
    @Steps
    PengalihanFasilitasPerusahaanPage pengalihanFasilitasPerusahaanPage;

    @And("user diarahkan ke halaman form pengajuan fasilitas perusahaan")
    public void diarahkanKeFormPengajuanFasilitasPerusahaan(){
        pengalihanFasilitasPerusahaanPage.ValidasiBeradaPadaFormPengalihanFasilitasPerusahaan();
    }
    @And("form pengalihan fasilitas perusahaan auto menginput nama dan nik pasutri telkom")
    public void formAlihFasilitasPerusahaanAutoFill(){
        pengalihanFasilitasPerusahaanPage.PasutriTelkomAutoFill();
    }
    @And("user click submit")
    public void clickSubmit(){
        pengalihanFasilitasPerusahaanPage.clickSubmitAlihPerusahaan();
    }
    @And("user click Checkbox")
    public void clickCheckBox(){
        pengalihanFasilitasPerusahaanPage.clickCheckboxAlihFasilitasPerusahaan();
    }
    @And("user click kirim pengajuan alih fasilitas perusahaan")
    public void clickKirimPengajuanAlihFasilitasPerusahaan(){
        pengalihanFasilitasPerusahaanPage.clickKirimAlihFasilitasPerusahaan();
    }
    @Then("laporan pengajuan pengalihan fasilitas perusahaan berhasil disubmit")
    public void FormPengalihanFasilitasPerusahaanBerhasilSubmit(){
        pengalihanFasilitasPerusahaanPage.validateAlihPerusahaanSubmitted();
    }

    //Pengalihan Fasilitas Perusahaan status pengajuan
    @And("user click sub section alih fasilitas perusahaan")
    public void clickSubSectionAlihFasilitasPerusahaan(){
        pengalihanFasilitasPerusahaanPage.clickSubSectionAlihFasilitasPerusahaan();
    }
    @Then("progress pengajuan pengalihan fasilitas perusahaan berhasil ditampilkan")
    public void statusPengajuanAlihFasilitas(){
        pengalihanFasilitasPerusahaanPage.StatusPengajuanAlihFasilitasPerusahaan();
    }
    //Pengalihan Fasilitas Perusahaan Pasutri Non Telkom
    @Then("warning message jika karyawan bukan pasutri telkom berhasil ditampilkan")
    public void warningMessagePasutriNonTelkom(){
        pengalihanFasilitasPerusahaanPage.ValidateWarningMessageNonTelkom();
    }
}
