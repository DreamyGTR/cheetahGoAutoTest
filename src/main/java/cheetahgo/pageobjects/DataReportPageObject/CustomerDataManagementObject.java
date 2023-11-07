package cheetahgo.pageobjects.DataReportPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class CustomerDataManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public CustomerDataManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //FB概览报表-SAP客户
    public WebElement fbOverviewReportSAPCustomer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbOverviewReportSAPCustomer"));
        return element;
    }
    //FB概览报表-开户主体
    public WebElement fbOverviewReportEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbOverviewReportEntity"));
        return element;
    }
    //FB概览报表-广告账户
    public WebElement fbOverviewReportAdvertisingAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbOverviewReportAdvertisingAccount"));
        return element;
    }
    //FB概览报表-广告目标
    public WebElement fbOverviewReportAdvertisingObjectives() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbOverviewReportAdvertisingObjectives"));
        return element;
    }
    //FB概览报表-日期-开始
    public WebElement fbOverviewReportDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbOverviewReportDateStart"));
        return element;
    }
    //FB概览报表-日期-结束
    public WebElement fbOverviewReportDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbOverviewReportDateEnd"));
        return element;
    }
    //FB概览报表-归因期
    public WebElement fbOverviewReportAttributionPeriod() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbOverviewReportAttributionPeriod"));
        return element;
    }
    //FB概览报表-重置
    public WebElement fbOverviewReportReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbOverviewReportReset"));
        return element;
    }
    //FB概览报表-搜索
    public WebElement fbOverviewReportSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbOverviewReportSearch"));
        return element;
    }
    //FB详细数据-客户名称
    public WebElement fbDetailedDataCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataCustomerName"));
        return element;
    }
    //FB详细数据-广告层级
    public WebElement fbDetailedDataAdHierarchy() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataAdHierarchy"));
        return element;
    }
    //FB详细数据-层级数据
    public WebElement fbDetailedDataHierarchicalData() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataHierarchicalData"));
        return element;
    }
    //FB详细数据-归因期
    public WebElement fbDetailedDataAttributionPeriod() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataAttributionPeriod"));
        return element;
    }
    //FB详细数据-预算优化
    public WebElement fbDetailedDataBudgetOptimization() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataBudgetOptimization"));
        return element;
    }
    //FB详细数据-自动应用广告
    public WebElement fbDetailedDataAutomaticallyApplyAds() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataAutomaticallyApplyAds"));
        return element;
    }
    //FB详细数据-营销目标
    public WebElement fbDetailedDataMarketingObjectives() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataMarketingObjectives"));
        return element;
    }
    //FB详细数据-出价策略
    public WebElement fbDetailedDataBidStrategy() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataBidStrategy"));
        return element;
    }
    //FB详细数据-购买类型
    public WebElement fbDetailedDataPurchaseType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataPurchaseType"));
        return element;
    }
    //FB详细数据-优化目标
    public WebElement fbDetailedDataOptimizeTarget() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataOptimizeTarget"));
        return element;
    }
    //FB详细数据-计费事件
    public WebElement fbDetailedDataBillingEvent() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataBillingEvent"));
        return element;
    }
    //FB详细数据-应用类别
    public WebElement fbDetailedDataApplicationCategories() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataApplicationCategories"));
        return element;
    }
    //FB详细数据-二级应用类别
    public WebElement fbDetailedDataSecondaryApplicationCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataSecondaryApplicationCategory"));
        return element;
    }
    //FB详细数据-重置
    public WebElement fbDetailedDataReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataReset"));
        return element;
    }
    //FB详细数据-搜索
    public WebElement fbDetailedDataSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataSearch"));
        return element;
    }
    //FB详细数据-下载表格
    public WebElement fbDetailedDataDownloadExcel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataDownloadExcel"));
        return element;
    }
    //FB详细数据-自定义列
    public WebElement fbDetailedDataCustomColumns() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerDateManagement.fbDetailedDataCustomColumns"));
        return element;
    }
}