package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class CustomerRechargeManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public CustomerRechargeManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //客户充值-SAP客户名称
    public WebElement sapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.SAPCustomerName"));
        return element;
    }

    //客户充值-客户类别
    public WebElement customerCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.CustomerCategory"));
        return element;
    }

    //客户充值-客户类型
    public WebElement customerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.CustomerType"));
        return element;
    }
    //客户充值-所属销售
    public WebElement salesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.SalesName"));
        return element;
    }

    //客户充值-所属AM
    public WebElement amName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.AMName"));
        return element;
    }
    //客户充值-客户充值状态
    public WebElement customerRechargeStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.CustomerRechargeStatus"));
        return element;
    }
    //客户充值-额度使用比例前输入框
    public WebElement quotaUsageRatioForward() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.QuotaUsageRatioForward"));
        return element;
    }
    //客户充值-额度使用比例后输入框
    public WebElement quotaUsageRatioBack() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.QuotaUsageRatioBack"));
        return element;
    }
    //客户充值-总额度前输入框
    public WebElement totalAmountForward() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.TotalAmountForward"));
        return element;
    }
    //客户充值-总额度后输入框
    public WebElement totalAmountBack() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.TotalAmountBack"));
        return element;
    }
    //客户充值-更新时间（开始日期）
    public WebElement updateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.UpdateTimeStart"));
        return element;
    }
    //客户充值-更新时间（结束日期）
    public WebElement updateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.UpdateTimeEnd"));
        return element;
    }
    //客户充值-搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.Search"));
        return element;
    }
    //客户充值-重置
    public WebElement reset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.Reset"));
        return element;
    }
    //客户充值-上传充值系数
    public WebElement uploadRechargeCoefficient() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.UploadRechargeCoefficient"));
        return element;
    }
    //客户充值-上传充值系数-点击上传
    public WebElement clickUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.ClickUpload"));
        return element;
    }
    //客户充值-上传充值系数-下载模板
    public WebElement downloadTemplate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.DownloadTemplate"));
        return element;
    }
    //客户充值-上传充值系数-取消
    public WebElement cancleButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.CancleButton"));
        return element;
    }
    //客户充值-上传充值系数-确定
    public WebElement sureButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.SureButton"));
        return element;
    }
    //客户充值-上传充值系数-关闭
    public WebElement closeButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.CloseButton"));
        return element;
    }
    //客户充值-下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.Download"));
        return element;
    }
    //操作日志-操作流水号
    public WebElement operationSerialNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.OperationSerialNumber"));
        return element;
    }
    //操作日志-SAP客户名称
    public WebElement operationLogSapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.SAPCustomerName"));
        return element;
    }
    //操作日志-客户类别
    public WebElement operationLogCustomerCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.CustomerCategory"));
        return element;
    }
    //操作日志-操作类型
    public WebElement operationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.OperationType"));
        return element;
    }
    //操作日志-操作状态
    public WebElement operationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.OperationStatus"));
        return element;
    }
    //操作日志-操作人
    public WebElement operator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.Operator"));
        return element;
    }
    //操作日志-操作时间（开始日期）
    public WebElement operationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.OperationTimeStart"));
        return element;
    }
    //操作日志-操作时间（结束日期）
    public WebElement operationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.OperationTimeEnd"));
        return element;
    }
    //操作日志-搜索
    public WebElement operationLogSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.Search"));
        return element;
    }
    //操作日志-重置
    public WebElement operationLogReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.Reset"));
        return element;
    }
    //操作日志-下载
    public WebElement operationLogDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerRechargeManagement.Download"));
        return element;
    }
}
