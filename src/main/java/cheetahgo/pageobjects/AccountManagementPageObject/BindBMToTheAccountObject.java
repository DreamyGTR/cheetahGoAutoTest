package cheetahgo.pageobjects.AccountManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class BindBMToTheAccountObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public BindBMToTheAccountObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //账户-平台-广告账户ID
    public WebElement accountPlatformAdAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformAdAccountID"));
        return element;
    }
    //账户-平台-商户平台ID
    public WebElement accountPlatformMerchantPlatformID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformMerchantPlatformID"));
        return element;
    }
    //账户-平台-账户权限
    public WebElement accountPlatformAccountPermissions() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformAccountPermissions"));
        return element;
    }
    //账户-平台-新增关联
    public WebElement accountPlatformAddAssociation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformAddAssociation"));
        return element;
    }
    //账户-平台-新增关联-广告账户ID
    public WebElement accountPlatformAddAssociationAdAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformAddAssociationAdAccountID"));
        return element;
    }
    //账户-平台-新增关联-商户平台ID
    public WebElement accountPlatformAddAssociationMerchantPlatformID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformAddAssociationMerchantPlatformID"));
        return element;
    }
    //账户-平台-新增关联-账户权限
    public WebElement accountPlatformAddAssociationAccountPermissions() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformAddAssociationAccountPermissions"));
        return element;
    }
    //账户-平台-新增关联-确定
    public WebElement accountPlatformAddAssociationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformAddAssociationSubmit"));
        return element;
    }
    //账户-平台-新增关联-取消
    public WebElement accountPlatformAddAssociationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformAddAssociationCancel"));
        return element;
    }
    //账户-平台-批量导入关联
    public WebElement accountPlatformBatchImportAssociations() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformBatchImportAssociations"));
        return element;
    }
    //账户-平台-批量导入关联-上传文件
    public WebElement accountPlatformBatchImportAssociationsUploadFile() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformBatchImportAssociationsUploadFile"));
        return element;
    }
    //账户-平台-批量导入关联-下载模板
    public WebElement accountPlatformBatchImportAssociationsDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformBatchImportAssociationsDownloadTemple"));
        return element;
    }
    //账户-平台-批量导入关联-确认
    public WebElement accountPlatformBatchImportAssociationsSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformBatchImportAssociationsSubmit"));
        return element;
    }
    //账户-平台-批量导入关联-取消
    public WebElement accountPlatformBatchImportAssociationsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformBatchImportAssociationsCancel"));
        return element;
    }
    //账户-平台-查看广告账户权限ID
    public WebElement accountPlataccountPlatformViewAdAccountPermissionIDformBatchImportAssociationsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformViewAdAccountPermissionID"));
        return element;
    }
    //账户-平台-查看广告账户权限ID-关闭
    public WebElement accountPlatformViewAdAccountPermissionIDClose() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformViewAdAccountPermissionIDClose"));
        return element;
    }
    //账户-平台-搜索
    public WebElement accountPlatformSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.accountPlatformSearch"));
        return element;
    }
    //操作日志-广告账户ID
    public WebElement operationLogAdAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.operationLogAdAccountID"));
        return element;
    }
    //操作日志-商户平台ID
    public WebElement operationLogMerchantPlatformID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.operationLogMerchantPlatformID"));
        return element;
    }
    //操作日志-操作人姓名
    public WebElement operationLogOperatorName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.operationLogOperatorName"));
        return element;
    }
    //操作日志-操作结果
    public WebElement operationLogOperationResult() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.operationLogOperationResult"));
        return element;
    }
    //操作日志-操作日期-开始
    public WebElement operationLogOperationDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.operationLogOperationDateStart"));
        return element;
    }
    //操作日志-操作日期-结束
    public WebElement operationLogOperationDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.operationLogOperationDateEnd"));
        return element;
    }
    //操作日志-下载
    public WebElement operationLogDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.operationLogDownload"));
        return element;
    }
    //操作日志-搜索
    public WebElement operationLogSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.bindBMToTheAccount.operationLogSearch"));
        return element;
    }
}