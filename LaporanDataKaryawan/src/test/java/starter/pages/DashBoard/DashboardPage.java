package starter.pages.DashBoard;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
    private By Dashboard(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/div");
    }
    private By WelcomePopUP(){
        return By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div[3]/small/small");
    }

    private By Pengajuan(){
        return By.xpath("/html/body/div/div[1]/div[1]/div[3]/ul/li[7]/a/span");
    }
    private By LaporanDataKaryawan(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[2]/a");
    }
    private By SubSectionPengalihanFaskes(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/h2/button");
    }
    private By TrackingProgressPengajuanPengalihanFaskes(){
        return By.xpath("/html/body/div/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/div/div/div/div/table");
    }

    @Step
    public boolean validateOnTheDashboardPage(){
        waitForRenderedElementsToBePresent(Dashboard());
        return $(Dashboard()).isDisplayed();
    }
    @Step
    public void clickPopUp(){
        $(WelcomePopUP()).click();
    }
    @Step
    public void ClickPengajuanPage(){
        $(Pengajuan()).click();
    }
    @Step
    public void ClickLaporanDataKaryawan(){
        $(LaporanDataKaryawan()).click();
    }
    @Step
    public void subsectionPengalihanFaskes(){
        $(SubSectionPengalihanFaskes()).click();
    }
    @Step
    public void progressStatusPengajuanFaskes(){
        $(TrackingProgressPengajuanPengalihanFaskes()).isDisplayed();
    }
}
