package cheetahgo.pageobjects.DataReportPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class FBBusinessMarketObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public FBBusinessMarketObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //消耗大盘-日期-开始
    public WebElement dateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBusinessMarket.dateStart"));
        return element;
    }
    //消耗大盘-日期-结束
    public WebElement dateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBusinessMarket.dateEnd"));
        return element;
    }
    //消耗大盘-搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBusinessMarket.Search"));
        return element;
    }
    //违规创意-日期-开始
    public WebElement illegalCreativityDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBusinessMarket.illegalCreativityDateStart"));
        return element;
    }
    //违规创意-日期-结束
    public WebElement illegalCreativityDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBusinessMarket.illegalCreativityDateEnd"));
        return element;
    }
    //违规创意-搜索
    public WebElement illegalCreativitySearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBusinessMarket.illegalCreativitySearch"));
        return element;
    }
    //开户大盘-日期-开始
    public WebElement accountOpeningMarketDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBusinessMarket.accountOpeningMarketDateStart"));
        return element;
    }
    //开户大盘-日期-结束
    public WebElement accountOpeningMarketDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBusinessMarket.accountOpeningMarketDateEnd"));
        return element;
    }
    //开户大盘-搜索
    public WebElement accountOpeningMarketSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBusinessMarket.accountOpeningMarketSearch"));
        return element;
    }
}