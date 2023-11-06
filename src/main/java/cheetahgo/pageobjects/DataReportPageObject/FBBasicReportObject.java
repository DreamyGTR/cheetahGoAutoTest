package cheetahgo.pageobjects.DataReportPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class FBBasicReportObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public FBBasicReportObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //基础报表-Account ID
    public WebElement basicReportAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportAccountID"));
        return element;
    }
    //基础报表-层级
    public WebElement basicReportHierarchy() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportHierarchy"));
        return element;
    }
    //基础报表-时间-开始
    public WebElement basicReportTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportTimeStart"));
        return element;
    }
    //基础报表-时间-结束
    public WebElement basicReportTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportTimeEnd"));
        return element;
    }
    //基础报表-细分数据-查询维度
    public WebElement basicReportQueryDimensions() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensions"));
        return element;
    }
    //基础报表-细分数据-查询维度-年龄
    public WebElement basicReportQueryDimensionsAge() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsAge"));
        return element;
    }
    //基础报表-细分数据-查询维度-设备
    public WebElement basicReportQueryDimensionsDevice() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsDevice"));
        return element;
    }
    //基础报表-细分数据-查询维度-国家
    public WebElement basicReportQueryDimensionsCountry() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsCountry"));
        return element;
    }
    //基础报表-细分数据-查询维度-性别
    public WebElement basicReportQueryDimensionsSex() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsSex"));
        return element;
    }
    //基础报表-细分数据-查询维度-平台
    public WebElement basicReportQueryDimensionsPlatform() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsPlatform"));
        return element;
    }
    //基础报表-细分数据-查询维度-设备平台
    public WebElement basicReportQueryDimensionsDevicePlatform() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsDevicePlatform"));
        return element;
    }
    //基础报表-细分数据-查询维度-Account_currency
    public WebElement basicReportQueryDimensionsAccountCurrency() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsAccountCurrency"));
        return element;
    }
    //基础报表-细分数据-查询维度-CPC
    public WebElement basicReportQueryDimensionsCPC() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsCPC"));
        return element;
    }
    //基础报表-细分数据-查询维度-Cost_per_result
    public WebElement basicReportQueryDimensionsCostPerResult() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsCostPerResult"));
        return element;
    }
    //基础报表-细分数据-查询维度-CTR
    public WebElement basicReportQueryDimensionsCTR() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsCTR"));
        return element;
    }
    //基础报表-细分数据-查询维度-Amount_spent
    public WebElement basicReportQueryDimensionsAmountSpent() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsAmountSpent"));
        return element;
    }
    //基础报表-细分数据-查询维度-CPP（Cost per 1,000 People Reached)
    public WebElement basicReportQueryDimensionsCPP() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsCPP"));
        return element;
    }
    //基础报表-细分数据-查询维度-Frequency
    public WebElement basicReportQueryDimensionsFrequency() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsFrequency"));
        return element;
    }
    //基础报表-细分数据-查询维度-确定
    public WebElement basicReportQueryDimensionsSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsSubmit"));
        return element;
    }
    //基础报表-细分数据-查询维度-取消
    public WebElement basicReportQueryDimensionsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsCancel"));
        return element;
    }
    //基础报表-搜索
    public WebElement basicReportQueryDimensionsSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsSearch"));
        return element;
    }
    //基础报表-下载
    public WebElement basicReportQueryDimensionsDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBasicReport.basicReportQueryDimensionsDownload"));
        return element;
    }

}