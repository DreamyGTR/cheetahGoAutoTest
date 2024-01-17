package cheetahgo.pageobjects.AccountManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class TTAccountAuthorizationBindingObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public TTAccountAuthorizationBindingObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //TT账户授权-Account ID
    public WebElement ttAccountAuthorizationAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationAccountID"));
        return element;
    }
    //TT账户授权-账户状态
    public WebElement ttAccountAuthorizationAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationAccountStatus"));
        return element;
    }
    //TT账户授权-BC ID
    public WebElement ttAccountAuthorizationBCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationBCID"));
        return element;
    }
    //TT账户授权-BC名称
    public WebElement ttAccountAuthorizationBCName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationBCName"));
        return element;
    }
    //TT账户授权-SAP客户名称
    public WebElement ttAccountAuthorizationSAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationSAPCustomerName"));
        return element;
    }
    //TT账户授权-客户类型
    public WebElement ttAccountAuthorizationCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationCustomerType"));
        return element;
    }
    //TT账户授权-所属销售
    public WebElement ttAccountAuthorizationSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationSalesName"));
        return element;
    }
    //TT账户授权-所属优化师
    public WebElement ttAccountAuthorizationOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationOptimizer"));
        return element;
    }
    //TT账户授权-绑定人员
    public WebElement ttAccountAuthorizationBindingPeople() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationBindingPeople"));
        return element;
    }
    //TT账户授权-账户权限
    public WebElement ttAccountAuthorizationAccountPermissions() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationAccountPermissions"));
        return element;
    }
    //TT账户授权-更新时间-开始
    public WebElement ttAccountAuthorizationUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationUpdateTimeStart"));
        return element;
    }
    //TT账户授权-更新时间-结束
    public WebElement ttAccountAuthorizationUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationUpdateTimeEnd"));
        return element;
    }
    //TT账户授权-搜索
    public WebElement ttAccountAuthorizationSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationSearch"));
        return element;
    }
    //TT账户授权-重置
    public WebElement ttAccountAuthorizationReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationReset"));
        return element;
    }
    //TT账户授权-新增绑定
    public WebElement ttAccountAuthorizationAddNewBinding() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationAddNewBinding"));
        return element;
    }
    //TT账户授权-新增绑定-Account ID
    public WebElement ttAccountAuthorizationAddNewBindingAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationAddNewBindingAccountID"));
        return element;
    }
    //TT账户授权-新增绑定-TT账户
    public WebElement ttAccountAuthorizationAddNewBindingTTAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationAddNewBindingTTAccount"));
        return element;
    }
    //TT账户授权-新增绑定-确认
    public WebElement ttAccountAuthorizationAddNewBindingSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationAddNewBindingSubmit"));
        return element;
    }
    //TT账户授权-新增绑定-关闭
    public WebElement ttAccountAuthorizationAddNewBindingCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationAddNewBindingCancel"));
        return element;
    }
    //TT账户授权-批量操作
    public WebElement ttAccountAuthorizationBatchOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationBatchOperation"));
        return element;
    }
    //TT账户授权-批量操作-选择文件
    public WebElement ttAccountAuthorizationBatchOperationUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationBatchOperationUploadFiles"));
        return element;
    }
    //TT账户授权-批量操作-下载模板
    public WebElement ttAccountAuthorizationBatchOperationDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationBatchOperationDownloadTemple"));
        return element;
    }
    //TT账户授权-批量操作-确认
    public WebElement ttAccountAuthorizationBatchOperationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationBatchOperationSubmit"));
        return element;
    }
    //TT账户授权-批量操作-关闭
    public WebElement ttAccountAuthorizationBatchOperationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationBatchOperationCancel"));
        return element;
    }
    //TT账户授权-下载
    public WebElement ttAccountAuthorizationBatchOperationDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationBatchOperationDownload"));
        return element;
    }
    //TT账户授权-解绑
    public WebElement ttAccountAuthorizationUnbind() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.ttAccountAuthorizationUnbind"));
        return element;
    }
    //操作日志-操作流水号
    public WebElement operationLogOperationSerialNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogOperationSerialNumber"));
        return element;
    }
    //操作日志-Account ID
    public WebElement operationLogAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogAccountID"));
        return element;
    }
    //操作日志-账户权限
    public WebElement operationLogAccountPermission() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogAccountPermission"));
        return element;
    }
    //操作日志-绑定人员
    public WebElement operationLogBindingPeople() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogBindingPeople"));
        return element;
    }
    //操作日志-操作类型
    public WebElement operationLogOperationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogOperationType"));
        return element;
    }
    //操作日志-操作状态
    public WebElement operationLogOperationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogOperationStatus"));
        return element;
    }
    //操作日志-操作人
    public WebElement operationLogOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogOperator"));
        return element;
    }
    //操作日志-操作时间-开始
    public WebElement operationLogOperationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogOperationTimeStart"));
        return element;
    }
    //操作日志-操作时间-结束
    public WebElement operationLogOperationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogOperationTimeEnd"));
        return element;
    }
    //操作日志-搜索
    public WebElement operationLogSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogSearch"));
        return element;
    }
    //操作日志-重置
    public WebElement operationLogReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogReset"));
        return element;
    }
    //操作日志-下载
    public WebElement operationLogDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.ttAccountAuthorizationBinding.operationLogDownload"));
        return element;
    }
}