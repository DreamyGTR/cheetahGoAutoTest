package cheetahgo.pageobjects.DataReportPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class FBMaterialReportObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public FBMaterialReportObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //Account ID
    public WebElement accountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbMaterialReport.accountID"));
        return element;
    }
    //日期-开始
    public WebElement dateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbMaterialReport.dateStart"));
        return element;
    }
    //日期-结束
    public WebElement dateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbMaterialReport.dateEnd"));
        return element;
    }
    //维度
    public WebElement dimensions() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbMaterialReport.dimensions"));
        return element;
    }
    //维度-日
    public WebElement dimensionsDay() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbMaterialReport.dimensionsDay"));
        return element;
    }
    //维度-周
    public WebElement dimensionsWeek() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbMaterialReport.dimensionsWeek"));
        return element;
    }
    //维度-国家
    public WebElement dimensionsCountry() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbMaterialReport.dimensionsCountry"));
        return element;
    }
    //维度-确定
    public WebElement dimensionsSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbMaterialReport.dimensionsSubmit"));
        return element;
    }
    //维度-取消
    public WebElement dimensionsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbMaterialReport.dimensionsCancel"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbMaterialReport.search"));
        return element;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbMaterialReport.download"));
        return element;
    }
}