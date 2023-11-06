package cheetahgo.pageobjects.DataReportPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class FBConsumptionReportObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public FBConsumptionReportObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //客户消耗报表-客户名称
    public WebElement customerConsumptionReportCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.CustomerConsumptionReportCustomerName"));
        return element;
    }
    //客户消耗报表-开户主体
    public WebElement customerConsumptionReportEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportEntity"));
        return element;
    }
    //客户消耗报表-Account ID
    public WebElement customerConsumptionReportAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportAccountID"));
        return element;
    }
    //客户消耗报表-客户类型
    public WebElement customerConsumptionReportCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportCustomerType"));
        return element;
    }
    //客户消耗报表-所属销售
    public WebElement customerConsumptionReportSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportSalesName"));
        return element;
    }
    //客户消耗报表-所属AM
    public WebElement customerConsumptionReportAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportAMName"));
        return element;
    }
    //客户消耗报表-所属优化师
    public WebElement customerConsumptionReportOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportOptimizer"));
        return element;
    }
    //客户消耗报表-日期-开始
    public WebElement customerConsumptionReportDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDateStart"));
        return element;
    }
    //客户消耗报表-日期-结束
    public WebElement customerConsumptionReportDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDateEnd"));
        return element;
    }
    //客户消耗报表-业绩客户类型
    public WebElement customerConsumptionReportPerformanceCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportPerformanceCustomerType"));
        return element;
    }
    //客户消耗报表-维度
    public WebElement customerConsumptionReportDimensions() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionse"));
        return element;
    }
    //客户消耗报表-维度-客户名称
    public WebElement customerConsumptionReportDimensionsCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionsCustomerName"));
        return element;
    }
    //客户消耗报表-维度-客户类型
    public WebElement customerConsumptionReportDimensionsCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionsCustomerType"));
        return element;
    }
    //客户消耗报表-维度-客户等级
    public WebElement customerConsumptionReportDimensionsCustomerLevel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionsCustomerLevel"));
        return element;
    }
    //客户消耗报表-维度-业绩客户类型
    public WebElement customerConsumptionReportDimensionsPerformanceCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionsPerformanceCustomerType"));
        return element;
    }
    //客户消耗报表-维度-开户主体
    public WebElement customerConsumptionReportDimensionsEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionsEntity"));
        return element;
    }
    //客户消耗报表-维度-最终主体
    public WebElement customerConsumptionReportDimensionsFinalSubject() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionsFinalSubject"));
        return element;
    }
    //客户消耗报表-维度-账户ID
    public WebElement customerConsumptionReportDimensionsAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionsAccountID"));
        return element;
    }
    //客户消耗报表-维度-账户名称
    public WebElement customerConsumptionReportDimensionsAccountName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionsAccountName"));
        return element;
    }
    //客户消耗报表-维度-账户状态
    public WebElement customerConsumptionReportDimensionsAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionsAccountStatus"));
        return element;
    }
    //客户消耗报表-维度-确定
    public WebElement customerConsumptionReportDimensionsSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionsSubmit"));
        return element;
    }
    //客户消耗报表-维度-取消
    public WebElement customerConsumptionReportDimensionsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDimensionsCancel"));
        return element;
    }
    //客户消耗报表-指标
    public WebElement customerConsumptionReportIndex() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportIndexl"));
        return element;
    }
    //客户消耗报表-搜索
    public WebElement customerConsumptionReportSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportSearch"));
        return element;
    }
    //客户消耗报表-下载
    public WebElement customerConsumptionReportDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.customerConsumptionReportDownload"));
        return element;
    }
    //其他消耗报表-所属销售
    public WebElement OtherConsumptionReportsSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.otherConsumptionReportsSalesName"));
        return element;
    }
    //其他消耗报表-所属AM
    public WebElement otherConsumptionReportsAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.otherConsumptionReportsAMName"));
        return element;
    }
    //其他消耗报表-所属优化师
    public WebElement otherConsumptionReportsOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.otherConsumptionReportsOptimizer"));
        return element;
    }
    //其他消耗报表-日期-开始
    public WebElement otherConsumptionReportsDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.otherConsumptionReportsDateStart"));
        return element;
    }
    //其他消耗报表-日期-结束
    public WebElement otherConsumptionReportsDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.otherConsumptionReportsDateEnd"));
        return element;
    }
    //其他消耗报表-指标
    public WebElement otherConsumptionReportsIndex() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.otherConsumptionReportsIndex"));
        return element;
    }
    //其他消耗报表-搜索
    public WebElement otherConsumptionReportsSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.otherConsumptionReportsSearch"));
        return element;
    }
    //其他消耗报表-下载
    public WebElement otherConsumptionReportsDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbConsumptionReport.otherConsumptionReportsDownload"));
        return element;
    }
}