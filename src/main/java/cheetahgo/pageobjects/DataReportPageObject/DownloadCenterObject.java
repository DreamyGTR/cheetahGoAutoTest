package cheetahgo.pageobjects.DataReportPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class DownloadCenterObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public DownloadCenterObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.downloadCenter.download"));
        return element;
    }
}