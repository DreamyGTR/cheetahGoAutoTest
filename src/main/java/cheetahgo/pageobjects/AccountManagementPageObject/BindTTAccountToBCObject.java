package cheetahgo.pageobjects.AccountManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class BindTTAccountToBCObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public BindTTAccountToBCObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //账户-BC-Account ID
    public WebElement accountBCAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCAccountID"));
        return element;
    }
    //账户-BC-账户名称
    public WebElement accountBCAccountName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCAccountName"));
        return element;
    }
    //账户-BC-BC ID
    public WebElement accountBCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCID"));
        return element;
    }
    //账户-BC-BC名称
    public WebElement accountBCName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCName"));
        return element;
    }
    //账户-BC-账户权限
    public WebElement accountBCAccountPermission() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCAccountPermission"));
        return element;
    }
    //账户-BC-更新时间-开始
    public WebElement accountBCUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCUpdateTimeStart"));
        return element;
    }
    //账户-BC-更新时间-结束
    public WebElement accountBCUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCUpdateTimeEnd"));
        return element;
    }
    //账户-BC-新增绑定
    public WebElement accountBCAddNewBind() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCAddNewBind"));
        return element;
    }
    //账户-BC-新增绑定-Account ID
    public WebElement accountBCAddNewBindAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCAddNewBindAccountID"));
        return element;
    }
    //账户-BC-新增绑定-BC ID
    public WebElement accountBCAddNewBindBCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCAddNewBindBCID"));
        return element;
    }
    //账户-BC-新增绑定-账户权限
    public WebElement accountBCAddNewBindAccountPermission() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCAddNewBindAccountPermission"));
        return element;
    }
    //账户-BC-新增绑定-确认
    public WebElement accountBCAddNewBindSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCAddNewBindSubmit"));
        return element;
    }
    //账户-BC-新增绑定-取消
    public WebElement accountBCAddNewBindCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCAddNewBindCancel"));
        return element;
    }
    //账户-BC-批量绑定
    public WebElement accountBCBatchBind() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCBatchBind"));
        return element;
    }
    //账户-BC-批量绑定-选择文件
    public WebElement accountBCBatchBindUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCBatchBindUploadFiles"));
        return element;
    }
    //账户-BC-批量绑定-下载模板
    public WebElement accountBCBatchBindDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCBatchBindDownloadTemple"));
        return element;
    }
    //账户-BC-批量绑定-确认
    public WebElement accountBCBatchBindSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCBatchBindSubmit"));
        return element;
    }
    //账户-BC-批量绑定-取消
    public WebElement accountBCBatchBindCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCBatchBindCancel"));
        return element;
    }
    //账户-BC-搜索
    public WebElement accountBCSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCSearch"));
        return element;
    }
    //账户-BC-下载
    public WebElement accountBCDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCDownload"));
        return element;
    }
    //账户-BC-重置
    public WebElement accountBCReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCReset"));
        return element;
    }
    //账户-BC-解绑
    public WebElement accountBCUnbind() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCUnbind"));
        return element;
    }
    //账户-BC-确定
    public WebElement accountBCUnbindSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCUnbindSubmit"));
        return element;
    }
    //账户-BC-取消
    public WebElement accountBCUnbindCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.accountBCUnbindCancel"));
        return element;
    }
    //操作日志-操作流水号
    public WebElement operationLogOperationSerialNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogOperationSerialNumber"));
        return element;
    }
    //操作日志-Account ID
    public WebElement operationLogAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogAccountID"));
        return element;
    }
    //操作日志-账户名称
    public WebElement operationLogAccountName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogAccountName"));
        return element;
    }
    //操作日志-BC ID
    public WebElement operationLogBCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogBCID"));
        return element;
    }
    //操作日志-BC名称
    public WebElement operationLogBCName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogBCName"));
        return element;
    }
    //操作日志-账户权限
    public WebElement operationLogAccountPermission() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogAccountPermission"));
        return element;
    }
    //操作日志-操作类型
    public WebElement operationLogOperationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogOperationType"));
        return element;
    }
    //操作日志-操作状态
    public WebElement operationLogOperationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogOperationStatus"));
        return element;
    }
    //操作日志-操作时间-开始
    public WebElement operationLogOperationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogOperationTimeStart"));
        return element;
    }
    //操作日志-操作时间-结束
    public WebElement operationLogOperationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogOperationTimeEnd"));
        return element;
    }
    //操作日志-搜索
    public WebElement operationLogSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogSearch"));
        return element;
    }
    //操作日志-下载
    public WebElement operationLogDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogDownload"));
        return element;
    }
    //操作日志-重置
    public WebElement operationLogReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindTTAccountToBC.operationLogReset"));
        return element;
    }
}