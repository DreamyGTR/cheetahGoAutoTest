package cheetahgo.pageobjects.AccountManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class FBAccountLimitManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public FBAccountLimitManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //账户额度-所属销售
    public WebElement accountLimitSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitSalesName"));
        return element;
    }
    //账户额度-销售类型
    public WebElement accountLimitSalesType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitSalesType"));
        return element;
    }
    //账户额度-更新时间-开始
    public WebElement accountLimitUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitUpdateTimeStart"));
        return element;
    }
    //账户额度-更新时间-结束
    public WebElement accountLimitUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitUpdateTimeEnd"));
        return element;
    }
    //账户额度-批量分配
    public WebElement accountLimitBulkAllocation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitBulkAllocation"));
        return element;
    }
    //账户额度-复选框
    public WebElement accountLimitCheckBox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitCheckBox"));
        return element;
    }
    //账户额度-批量分配-操作
    public WebElement accountLimitBulkAllocationOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitBulkAllocationOperation"));
        return element;
    }
    //账户额度-批量分配-确认
    public WebElement accountLimitBulkAllocationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitBulkAllocationSubmit"));
        return element;
    }
    //账户额度-批量分配-取消
    public WebElement accountLimitBulkAllocationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitBulkAllocationCancel"));
        return element;
    }
    //账户额度-搜索
    public WebElement accountLimitSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitSearch"));
        return element;
    }
    //账户额度-下载
    public WebElement accountLimitDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitDownload"));
        return element;
    }
    //账户额度-下载分配日志
    public WebElement accountLimitDownloadAllocationLog() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitDownloadAllocationLog"));
        return element;
    }
    //账户额度-分配
    public WebElement accountLimitDistribute() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitDistribute"));
        return element;
    }
    //账户额度-分配-操作
    public WebElement accountLimitDistributeOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitDistributeOperation"));
        return element;
    }
    //账户额度-分配-确认
    public WebElement accountLimitDistributeSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitDistributeSubmit"));
        return element;
    }
    //账户额度-分配-取消
    public WebElement accountLimitDistributeCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitDistributeCancel"));
        return element;
    }
    //账户额度-调整
    public WebElement accountLimitAdjustment() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitAdjustment"));
        return element;
    }
    //账户额度-调整-增加/减少
    public WebElement accountLimitAdjustAddOrReduce() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitAdjustAddOrReduce"));
        return element;
    }
    //账户额度-调整-操作
    public WebElement accountLimitAdjustOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitAdjustOperation"));
        return element;
    }
    //账户额度-调整-确认
    public WebElement accountLimitAdjustSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitAdjustSubmit"));
        return element;
    }
    //账户额度-调整-取消
    public WebElement accountLimitAdjustCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountLimitAdjustCancel"));
        return element;
    }
    //账户统计-客户名称
    public WebElement accountStatisticsCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountStatisticsCustomerName"));
        return element;
    }
    //账户统计-客户类型
    public WebElement accountStatisticsCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountStatisticsCustomerType"));
        return element;
    }
    //账户统计-所属销售
    public WebElement accountStatisticsSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountStatisticsSalesName"));
        return element;
    }
    //账户统计-所属AM
    public WebElement accountStatisticsAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountStatisticsAMName"));
        return element;
    }
    //账户统计-使用率-最小值
    public WebElement accountStatisticsUsageRateMin() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountStatisticsUsageRateMin"));
        return element;
    }
    //账户统计-使用率-最大值
    public WebElement accountStatisticsUsageRateMax() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountStatisticsUsageRateMax"));
        return element;
    }
    //账户统计-开户时间-开始
    public WebElement accountStatisticsAccountOpeningTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountStatisticsAccountOpeningTimeStart"));
        return element;
    }
    //账户统计-开户时间-结束
    public WebElement accountStatisticsAccountOpeningTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountStatisticsAccountOpeningTimeEnd"));
        return element;
    }
    //账户统计-搜索
    public WebElement accountStatisticsAccountSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountStatisticsAccountSearch"));
        return element;
    }
    //账户统计-下载
    public WebElement accountStatisticsAccountDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.accountStatisticsAccountDownload"));
        return element;
    }
    //操作日志-操作流水号
    public WebElement operationLogOperationSerialNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.operationLogOperationSerialNumber"));
        return element;
    }
    //操作日志-销售
    public WebElement operationLogSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.operationLogSalesName"));
        return element;
    }
    //操作日志-客户名称
    public WebElement operationLogCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.operationLogCustomerName"));
        return element;
    }
    //操作日志-操作类型
    public WebElement operationLogOperationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.operationLogOperationType"));
        return element;
    }
    //操作日志-操作状态
    public WebElement operationLogOperationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.operationLogOperationStatus"));
        return element;
    }
    //操作日志-操作人
    public WebElement operationLogOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.operationLogOperator"));
        return element;
    }
    //操作日志-操作时间-开始
    public WebElement operationLogOperationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.operationLogOperationTimeStart"));
        return element;
    }
    //操作日志-操作时间-结束
    public WebElement operationLogOperationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.operationLogOperationTimeEnd"));
        return element;
    }
    //操作日志-搜索
    public WebElement operationLogSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.operationLogSearch"));
        return element;
    }
    //操作日志-重置
    public WebElement operationLogReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountLimitManagement.operationLogReset"));
        return element;
    }
}