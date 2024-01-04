package cheetahgo.pageobjects.AccountManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class FBAccountBindingCIDObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public FBAccountBindingCIDObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //CID-FB账号-广告账户ID
    public WebElement cidFBAccountAdAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountAdAccountID"));
        return element;
    }
    //CID-FB账号-账户状态
    public WebElement cidFBAccountAdAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountAdAccountStatus"));
        return element;
    }
    //CID-FB账号-SAP客户名称
    public WebElement cidFBAccountSAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountSAPCustomerName"));
        return element;
    }
    //CID-FB账号-客户类型
    public WebElement cidFBAccountSAPCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountSAPCustomerType"));
        return element;
    }
    //CID-FB账号-所属销售
    public WebElement cidFBAccountSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountSalesName"));
        return element;
    }
    //CID-FB账号-所属优化师
    public WebElement cidFBAccountOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountOptimizer"));
        return element;
    }
    //CID-FB账号-绑定人员
    public WebElement cidFBAccountBindingUser() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountBindingUser"));
        return element;
    }
    //CID-FB账号-绑定账号
    public WebElement cidFBAccountBindingAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountBindingAccount"));
        return element;
    }
    //CID-FB账号-绑定权限
    public WebElement cidFBAccountBindPermissions() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountBindPermissions"));
        return element;
    }
    //CID-FB账号-更新时间-开始
    public WebElement cidFBAccountUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountUpdateTimeStart"));
        return element;
    }
    //CID-FB账号-更新时间-结束
    public WebElement cidFBAccountUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountUpdateTimeEnd"));
        return element;
    }
    //CID-FB账号-新增绑定
    public WebElement cidFBAccountAddNewBinding() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountAddNewBinding"));
        return element;
    }
    //CID-FB账号-新增绑定-广告账户ID
    public WebElement cidFBAccountAddNewBindingAdAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountAddNewBindingAdAccountID"));
        return element;
    }
    //CID-FB账号-新增绑定-FB账号
    public WebElement cidFBAccountAddNewBindingFBAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountAddNewBindingFBAccount"));
        return element;
    }
    //CID-FB账号-新增绑定-FB账号右侧“+”号
    public WebElement cidFBAccountAddNewBindingAddFBAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountAddNewBindingAddFBAccount"));
        return element;
    }
    //CID-FB账号-新增绑定-确认
    public WebElement cidFBAccountAddNewBindingSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountAddNewBindingSubmit"));
        return element;
    }
    //CID-FB账号-新增绑定-取消
    public WebElement cidFBAccountAddNewBindingCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountAddNewBindingCancel"));
        return element;
    }
    //CID-FB账号-批量操作
    public WebElement cidFBAccountBatchOperations() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountBatchOperations"));
        return element;
    }
    //CID-FB账号-批量操作-选择文件
    public WebElement cidFBAccountBatchOperationsUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountBatchOperationsUploadFiles"));
        return element;
    }
    //CID-FB账号-批量操作-下载模板
    public WebElement cidFBAccountBatchOperationsDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountBatchOperationsDownloadTemple"));
        return element;
    }
    //CID-FB账号-搜索
    public WebElement cidFBAccountSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.cidFBAccountSearch"));
        return element;
    }
    //操作日志-广告账户ID
    public WebElement operationLogAdAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogAdAccountID"));
        return element;
    }
    //操作日志-账户状态
    public WebElement operationLogAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogAccountStatus"));
        return element;
    }
    //操作日志-SAP客户名称
    public WebElement operationLogSAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogSAPCustomerName"));
        return element;
    }
    //操作日志-客户类型
    public WebElement operationLogCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogCustomerType"));
        return element;
    }
    //操作日志-所属销售
    public WebElement operationLogSaleName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogSaleName"));
        return element;
    }
    //操作日志-所属优化师
    public WebElement operationLogOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogOptimizer"));
        return element;
    }
    //操作日志-绑定人员
    public WebElement operationLogBindingUser() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogBindingUser"));
        return element;
    }
    //操作日志-操作人
    public WebElement operationLogOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogOperator"));
        return element;
    }
    //操作日志-操作结果
    public WebElement operationLogOperationResult() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogOperationResult"));
        return element;
    }
    //操作日志-操作类型
    public WebElement operationLogOperationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogOperationType"));
        return element;
    }
    //操作日志-操作来源
    public WebElement operationLogOperationSource() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogOperationSource"));
        return element;
    }
    //操作日志-操作时间-开始
    public WebElement operationLogOperationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogOperationTimeStart"));
        return element;
    }
    //操作日志-操作时间-结束
    public WebElement operationLogOperationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogOperationTimeEnd"));
        return element;
    }
    //操作日志-搜索
    public WebElement operationLogSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbAccountBindCID.operationLogSearch"));
        return element;
    }
}