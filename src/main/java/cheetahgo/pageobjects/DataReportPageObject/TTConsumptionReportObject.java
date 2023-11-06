package cheetahgo.pageobjects.DataReportPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class TTConsumptionReportObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public TTConsumptionReportObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //客户消耗报表-客户名称
    public WebElement customerConsumptionReportCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportCustomerName"));
        return element;
    }
    //客户消耗报表-开户主体
    public WebElement customerConsumptionReportEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportEntity"));
        return element;
    }
    //客户消耗报表-Account ID
    public WebElement customerConsumptionReportAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportAccountID"));
        return element;
    }
    //客户消耗报表-客户类型
    public WebElement customerConsumptionReportCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportCustomerType"));
        return element;
    }
    //客户消耗报表-BC ID
    public WebElement customerConsumptionReportBCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportBCID"));
        return element;
    }
    //客户消耗报表-BC名称
    public WebElement customerConsumptionReportBCName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportBCName"));
        return element;
    }
    //客户消耗报表-所属销售
    public WebElement customerConsumptionReportSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportSalesName"));
        return element;
    }
    //客户消耗报表-所属AM
    public WebElement customerConsumptionReportAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportAMName"));
        return element;
    }
    //客户消耗报表-所属优化师
    public WebElement customerConsumptionReportOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportOptimizer"));
        return element;
    }
    //客户消耗报表-日期-开始
    public WebElement customerConsumptionReportDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDateStart"));
        return element;
    }
    //客户消耗报表-日期-结束
    public WebElement customerConsumptionReportDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDateEnd"));
        return element;
    }
    //客户消耗报表-维度
    public WebElement customerConsumptionReportDimensions() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDimensions"));
        return element;
    }
    //客户消耗报表-维度-客户名称
    public WebElement customerConsumptionReportDimensionsCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDimensionsCustomerName"));
        return element;
    }
    //客户消耗报表-维度-客户类型
    public WebElement customerConsumptionReportDimensionsCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDimensionsCustomerType"));
        return element;
    }
    //客户消耗报表-维度-客户等级
    public WebElement customerConsumptionReportDimensionsCustomerLevel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDimensionsCustomerLevel"));
        return element;
    }
    //客户消耗报表-维度-开户主体
    public WebElement customerConsumptionReportDimensionsEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDimensionsEntity"));
        return element;
    }
    //客户消耗报表-维度-账户ID
    public WebElement customerConsumptionReportDimensionsAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDimensionsAccountID"));
        return element;
    }
    //客户消耗报表-维度-账户名称
    public WebElement customerConsumptionReportDimensionsAccountName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDimensionsAccountName"));
        return element;
    }
    //客户消耗报表-维度-账户状态
    public WebElement customerConsumptionReportDimensionsAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDimensionsAccountStatus"));
        return element;
    }
    //客户消耗报表-维度-确定
    public WebElement customerConsumptionReportDimensionsSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDimensionsSubmit"));
        return element;
    }
    //客户消耗报表-维度-取消
    public WebElement customerConsumptionReportDimensionsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDimensionsCancel"));
        return element;
    }
    //客户消耗报表-指标
    public WebElement customerConsumptionReportIndex() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportIndex"));
        return element;
    }
    //客户消耗报表-重置
    public WebElement customerConsumptionReportReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportReset"));
        return element;
    }
    //客户消耗报表-搜索
    public WebElement customerConsumptionReportSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportSearch"));
        return element;
    }
    //客户消耗报表-下载
    public WebElement customerConsumptionReportDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.customerConsumptionReportDownload"));
        return element;
    }
    //其他消耗报表-所属销售
    public WebElement otherConsumptionReportSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.otherConsumptionReportSalesName"));
        return element;
    }
    //其他消耗报表-所属AM
    public WebElement otherConsumptionReportAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.otherConsumptionReportAMName"));
        return element;
    }
    //其他消耗报表-所属优化师
    public WebElement otherConsumptionReportOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.otherConsumptionReportOptimizer"));
        return element;
    }
    //其他消耗报表-日期-开始
    public WebElement otherConsumptionReportDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.otherConsumptionReportDateStart"));
        return element;
    }
    //其他消耗报表-日期-结束
    public WebElement otherConsumptionReportDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.otherConsumptionReportDateEnd"));
        return element;
    }
    //其他消耗报表-指标
    public WebElement otherConsumptionReportIndex() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.otherConsumptionReportIndex"));
        return element;
    }
    //其他消耗报表-重置
    public WebElement otherConsumptionReportReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.otherConsumptionReportReset"));
        return element;
    }
    //其他消耗报表-搜索
    public WebElement otherConsumptionReportSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.otherConsumptionReportSearch"));
        return element;
    }
    //其他消耗报表-下载
    public WebElement otherConsumptionReportDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.ttConsumptionReport.otherConsumptionReportDownload"));
        return element;
    }
}