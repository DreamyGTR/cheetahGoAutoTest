package cheetahgo.pageobjects.AccountManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class ModifyAccountObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public ModifyAccountObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //Facebook-Account ID
    public WebElement facebookAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookAccountID"));
        return element;
    }
    //Facebook-账户状态
    public WebElement facebookAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookAccountStatus"));
        return element;
    }
    //Facebook-是否冻结
    public WebElement facebookWhetherFreeze() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookWhetherFreeze"));
        return element;
    }
    //Facebook-客户名称
    public WebElement facebookCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookCustomerName"));
        return element;
    }
    //Facebook-客户类别
    public WebElement facebookCustomerCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookCustomerCategory"));
        return element;
    }
    //Facebook-所属销售
    public WebElement facebookSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookSalesName"));
        return element;
    }
    //Facebook-所属AM
    public WebElement facebookAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookAMName"));
        return element;
    }
    //Facebook-批量充值扣减
    public WebElement facebookBatchRechargeDeduction() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchRechargeDeduction"));
        return element;
    }
    //Facebook-批量充值扣减-选择文件-点击上传
    public WebElement facebookBatchRechargeClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchRechargeClickToUpload"));
        return element;
    }
    //Facebook-批量充值扣减-下载模板
    public WebElement facebookBatchRechargeDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchRechargeDownloadTemple"));
        return element;
    }
    //Facebook-批量充值扣减-确认
    public WebElement facebookBatchRechargeSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchRechargeSubmit"));
        return element;
    }
    //Facebook-批量充值扣减-取消
    public WebElement facebookBatchRechargeCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchRechargeCancel"));
        return element;
    }
    //Facebook-批量修改账户名称
    public WebElement facebookBatchModifyAccountNames() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchModifyAccountNames"));
        return element;
    }
    //Facebook-批量修改账户名称-选择文件-点击上传
    public WebElement facebookBatchModifyAccountNamesClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchModifyAccountNamesClickToUpload"));
        return element;
    }
    //Facebook-批量修改账户名称-下载模板
    public WebElement facebookBatchModifyAccountNamesDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchModifyAccountNamesDownloadTemple"));
        return element;
    }
    //Facebook-批量修改账户名称-确认
    public WebElement facebookBatchModifyAccountNamesSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchModifyAccountNamesSubmit"));
        return element;
    }
    //Facebook-批量修改账户名称-取消
    public WebElement facebookBatchModifyAccountNamesCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchModifyAccountNamesCancel"));
        return element;
    }
    //Facebook-批量修改花费上限
    public WebElement facebookBatchModifySpendingLimit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchModifySpendingLimit"));
        return element;
    }
    //Facebook-批量修改花费上限-选择文件-点击上传
    public WebElement facebookBatchModifySpendingLimitClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchModifySpendingLimitClickToUpload"));
        return element;
    }
    //Facebook-批量修改花费上限-下载模板
    public WebElement facebookBatchModifySpendingLimitDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchModifySpendingLimitDownloadTemple"));
        return element;
    }
    //Facebook-批量修改花费上限-确认
    public WebElement facebookBatchModifySpendingLimitSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchModifySpendingLimitSubmit"));
        return element;
    }
    //Facebook-批量修改花费上限-取消
    public WebElement facebookBatchModifySpendingLimitCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchModifySpendingLimitCancel"));
        return element;
    }
    //Facebook-批量清零
    public WebElement facebookBatchClear() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchClear"));
        return element;
    }
    //Facebook-批量清零-选择文件-点击上传
    public WebElement facebookBatchClearClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchClearClickToUpload"));
        return element;
    }
    //Facebook-批量清零-选择文件-下载模板
    public WebElement facebookBatchClearDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchClearDownloadTemple"));
        return element;
    }
    //Facebook-批量清零-确认
    public WebElement facebookBatchClearSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchClearSubmit"));
        return element;
    }
    //Facebook-批量清零-取消
    public WebElement facebookBatchClearCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchClearCancel"));
        return element;
    }
    //Facebook-批量编辑封户取款金额
    public WebElement facebookBatchEditingAccountClosingAndWithdrawalAmounts() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchEditingAccountClosingAndWithdrawalAmounts"));
        return element;
    }
    //Facebook-批量编辑封户取款金额-选择文件-点击上传
    public WebElement facebookBatchEditingAccountClosingAndWithdrawalAmountsClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchEditingAccountClosingAndWithdrawalAmountsClickToUpload"));
        return element;
    }
    //Facebook-批量编辑封户取款金额-下载模板
    public WebElement facebookBatchEditingAccountClosingAndWithdrawalAmountsDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchEditingAccountClosingAndWithdrawalAmountsDownloadTemple"));
        return element;
    }
    //Facebook-批量编辑封户取款金额-确认
    public WebElement facebookBatchEditingAccountClosingAndWithdrawalAmountsSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchEditingAccountClosingAndWithdrawalAmountsSubmit"));
        return element;
    }
    //Facebook-批量编辑封户取款金额-取消
    public WebElement facebookBatchEditingAccountClosingAndWithdrawalAmountsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchEditingAccountClosingAndWithdrawalAmountsCancel"));
        return element;
    }
    //Facebook-批量查询
    public WebElement facebookBatchQuery() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchQuery"));
        return element;
    }
    //Facebook-批量查询-选择文件-点击上传
    public WebElement facebookBatchQueryClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchQueryClickToUpload"));
        return element;
    }
    //Facebook-批量查询-下载模板
    public WebElement facebookBatchQueryDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchQueryDownloadTemple"));
        return element;
    }
    //Facebook-批量查询-确认
    public WebElement facebookBatchQuerySubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchQuerySubmit"));
        return element;
    }
    //Facebook-批量查询-取消
    public WebElement facebookBatchQueryCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookBatchQueryCancel"));
        return element;
    }
    //Facebook-搜索
    public WebElement facebookSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookSearch"));
        return element;
    }
    //Facebook-下载
    public WebElement facebookDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookDownload"));
        return element;
    }
    //Facebook-更新
    public WebElement facebookUpdate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookUpdate"));
        return element;
    }
    //Facebook-编辑
    public WebElement facebookEdit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookEdit"));
        return element;
    }
    //Facebook-充值/减款
    public WebElement facebookRechargeOrReduction() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookRechargeOrReduction"));
        return element;
    }
    //Facebook-重置为0
    public WebElement facebookResetToZero() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookResetToZero"));
        return element;
    }
    //Facebook-账户清零
    public WebElement facebookAccountReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookAccountReset"));
        return element;
    }
    //FB操作日志（新）-操作流水号
    public WebElement facebookOperationLogOperationSerialNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperationSerialNumber"));
        return element;
    }
    //FB操作日志（新）-订单编号
    public WebElement facebookOperationLogOperationOrderNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperationOrderNumber"));
        return element;
    }
    //FB操作日志（新）-客户名称
    public WebElement facebookOperationLogOperationCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperationCustomerName"));
        return element;
    }
    //FB操作日志（新）-客户类别
    public WebElement facebookOperationLogOperationCustomerCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperationCustomerCategory"));
        return element;
    }
    //FB操作日志（新）-支付方式
    public WebElement facebookOperationLogOperationPaymentMethod() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperationPaymentMethod"));
        return element;
    }
    //FB操作日志（新）-Account ID
    public WebElement facebookOperationLogOperationAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperationAccountID"));
        return element;
    }
    //FB操作日志（新）-操作类型
    public WebElement facebookOperationLogOperationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperationType"));
        return element;
    }
    //FB操作日志（新）-操作人
    public WebElement facebookOperationLogOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperator"));
        return element;
    }
    //FB操作日志（新）-操作状态
    public WebElement facebookOperationLogOperationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperationStatus"));
        return element;
    }
    //FB操作日志（新）-操作平台
    public WebElement facebookOperationLogOperationPlatform() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperationPlatform"));
        return element;
    }
    //FB操作日志（新）-操作时间-开始
    public WebElement facebookOperationLogOperationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperationTimeStart"));
        return element;
    }
    //FB操作日志（新）-操作时间-结束
    public WebElement facebookOperationLogOperationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogOperationTimeEnd"));
        return element;
    }
    //FB操作日志（新）-搜索
    public WebElement facebookOperationLogSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogSearch"));
        return element;
    }
    //FB操作日志（新）-下载
    public WebElement facebookOperationLogDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogDownload"));
        return element;
    }
    //FB操作日志（新）-重置
    public WebElement facebookOperationLogReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.facebookOperationLogReset"));
        return element;
    }
    //封户取款重置记录-CID
    public WebElement accountClosureWithdrawalResetRecordCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetRecordCID"));
        return element;
    }
    //封户取款重置记录-SAP客户名称
    public WebElement accountClosureWithdrawalResetRecordSAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetRecordSAPCustomerName"));
        return element;
    }
    //封户取款重置记录-客户类别
    public WebElement accountClosureWithdrawalResetRecordCustomerCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetRecordCustomerCategory"));
        return element;
    }
    //封户取款重置记录-所属销售
    public WebElement accountClosureWithdrawalResetRecordSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetRecordSalesName"));
        return element;
    }
    //封户取款重置记录-所属AM
    public WebElement accountClosureWithdrawalResetRecordAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetRecordAMName"));
        return element;
    }
    //封户取款重置记录-CID解封时间-开始
    public WebElement accountClosureWithdrawalResetCIDUnblockingTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetCIDUnblockingTimeStart"));
        return element;
    }
    //封户取款重置记录-CID解封时间-结束
    public WebElement accountClosureWithdrawalResetCIDUnblockingTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetCIDUnblockingTimeEnd"));
        return element;
    }
    //封户取款重置记录-批量查询
    public WebElement accountClosureWithdrawalResetBatchQuery() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetBatchQuery"));
        return element;
    }
    //封户取款重置记录-批量查询-选择文件-点击上传
    public WebElement accountClosureWithdrawalBatchQueryResetBatchQueryClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalBatchQueryResetBatchQueryClickToUpload"));
        return element;
    }
    //封户取款重置记录-批量查询-下载模板
    public WebElement accountClosureWithdrawalResetBatchQueryDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetBatchQueryDownloadTemple"));
        return element;
    }
    //封户取款重置记录-批量查询-确认
    public WebElement accountClosureWithdrawalResetBatchQuerySubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetBatchQuerySubmit"));
        return element;
    }
    //封户取款重置记录-批量查询-取消
    public WebElement accountClosureWithdrawalResetBatchQueryCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetBatchQueryCancel"));
        return element;
    }
    //封户取款重置记录-搜索
    public WebElement accountClosureWithdrawalResetSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetSearch"));
        return element;
    }
    //封户取款重置记录-下载
    public WebElement accountClosureWithdrawalResetDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.accountClosureWithdrawalResetDownload"));
        return element;
    }
    //TikTok-BC名称
    public WebElement tikTokBCName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBCName"));
        return element;
    }
    //TikTok-Account ID
    public WebElement tikTokAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokAccountID"));
        return element;
    }
    //TikTok-账户状态
    public WebElement tikTokAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokAccountStatus"));
        return element;
    }
    //TikTok-账户名称
    public WebElement tikTokAccountName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokAccountName"));
        return element;
    }
    //TikTok-客户名称
    public WebElement tikTokCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokCustomerName"));
        return element;
    }
    //TikTok-客户类型
    public WebElement tikTokCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokCustomerType"));
        return element;
    }
    //TikTok-客户类别
    public WebElement tikTokCustomerCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokCustomerCategory"));
        return element;
    }
    //TikTok-开户主体
    public WebElement tikTokEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokEntity"));
        return element;
    }
    //TikTok-所属销售
    public WebElement tikTokSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokSalesName"));
        return element;
    }
    //TikTok-所属AM
    public WebElement tikTokAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokAMName"));
        return element;
    }
    //TikTok-批量充值扣减
    public WebElement tikTokBatchRechargeDeduction() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchRechargeDeduction"));
        return element;
    }
    //TikTok-批量充值扣减-选择文件-点击上传
    public WebElement tikTokBatchRechargeDeductionClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchRechargeDeductionClickToUpload"));
        return element;
    }
    //TikTok-批量充值扣减-下载模板
    public WebElement tikTokBatchRechargeDeductionDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchRechargeDeductionDownloadTemple"));
        return element;
    }
    //TikTok-批量充值扣减-确认
    public WebElement tikTokBatchRechargeDeductionSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchRechargeDeductionSubmit"));
        return element;
    }
    //TikTok-批量充值扣减-取消
    public WebElement tikTokBatchRechargeDeductionCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchRechargeDeductionCancel"));
        return element;
    }
    //TikTok-批量修改账户名称
    public WebElement tikTokBatchModifyAccountNames() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchModifyAccountNames"));
        return element;
    }
    //TikTok-批量修改账户名称-选择文件-点击上传
    public WebElement tikTokBatchModifyAccountNamesClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchModifyAccountNamesClickToUpload"));
        return element;
    }
    //TikTok-批量修改账户名称-下载模板
    public WebElement tikTokBatchModifyAccountNamesDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchModifyAccountNamesDownloadTemple"));
        return element;
    }
    //TikTok-批量修改账户名称-确认
    public WebElement tikTokBatchModifyAccountNamesSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchModifyAccountNamesSubmit"));
        return element;
    }
    //TikTok-批量修改账户名称-取消
    public WebElement tikTokBatchModifyAccountNamesCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchModifyAccountNamesCancel"));
        return element;
    }
    //TikTok-批量清零
    public WebElement tikTokBatchClear() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchClear"));
        return element;
    }
    //TikTok-批量清零-选择文件-点击上传
    public WebElement tikTokBatchClearClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchClearClickToUpload"));
        return element;
    }
    //TikTok-批量清零-下载模板
    public WebElement tikTokBatchClearDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchClearDownloadTemple"));
        return element;
    }
    //TikTok-批量清零-确认
    public WebElement tikTokBatchClearSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchClearSubmit"));
        return element;
    }
    //TikTok-批量清零-取消
    public WebElement tikTokBatchClearCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchClearCancel"));
        return element;
    }
    //TikTok-批量查询
    public WebElement tikTokBatchQuery() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchQuery"));
        return element;
    }
    //TikTok-批量查询-选择文件-点击上传
    public WebElement tikTokBatchQueryClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchQueryClickToUpload"));
        return element;
    }
    //TikTok-批量查询-下载模板
    public WebElement tikTokBatchQueryDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchQueryDownloadTemple"));
        return element;
    }
    //TikTok-批量查询-确认
    public WebElement tikTokBatchQuerySubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchQuerySubmit"));
        return element;
    }
    //TikTok-批量查询-取消
    public WebElement tikTokBatchQueryCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokBatchQueryCancel"));
        return element;
    }
    //TikTok-搜索
    public WebElement tikTokSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokSearch"));
        return element;
    }
    //TikTok-下载
    public WebElement tikTokDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokDownload"));
        return element;
    }
    //TikTok-更新
    public WebElement tikTokUpdate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokUpdate"));
        return element;
    }
    //TikTok-充值
    public WebElement tikTokRecharge() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokRecharge"));
        return element;
    }
    //TikTok-扣减
    public WebElement tikTokDeduction() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.tikTokDeduction"));
        return element;
    }
    //TT操作日志-客户名称
    public WebElement ttOperationLogCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.ttOperationLogCustomerName"));
        return element;
    }
    //TT操作日志-Account ID
    public WebElement ttOperationLogAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.ttOperationLogAccountID"));
        return element;
    }
    //TT操作日志-操作类型
    public WebElement ttOperationLogOperationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.ttOperationLogOperationType"));
        return element;
    }
    //TT操作日志-操作指标
    public WebElement ttOperationLogOperationIndicators() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.ttOperationLogOperationIndicators"));
        return element;
    }
    //TT操作日志-操作状态
    public WebElement ttOperationLogOperationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.ttOperationLogOperationStatus"));
        return element;
    }
    //TT操作日志-操作人
    public WebElement ttOperationLogOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.ttOperationLogOperator"));
        return element;
    }
    //TT操作日志-操作日期-开始
    public WebElement ttOperationLogOperationDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.ttOperationLogOperationDateStart"));
        return element;
    }
    //TT操作日志-操作日期-结束
    public WebElement ttOperationLogOperationDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.ttOperationLogOperationDateEnd"));
        return element;
    }
    //TT操作日志-搜索
    public WebElement ttOperationLogSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.ttOperationLogSearch"));
        return element;
    }
    //TT操作日志-下载
    public WebElement ttOperationLogDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.ttOperationLogDownload"));
        return element;
    }
    //LinkedIn-Account ID
    public WebElement linkedInAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInAccountID"));
        return element;
    }
    //LinkedIn-账户状态
    public WebElement linkedInAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInAccountStatus"));
        return element;
    }
    //LinkedIn-开户主体
    public WebElement linkedInEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInEntity"));
        return element;
    }
    //LinkedIn-客户名称
    public WebElement linkedInCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInCustomerName"));
        return element;
    }
    //LinkedIn-客户类别
    public WebElement linkedInCustomerCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInCustomerCategory"));
        return element;
    }
    //LinkedIn-所属销售
    public WebElement linkedInSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInSalesName"));
        return element;
    }
    //LinkedIn-所属AM
    public WebElement linkedInAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInAMName"));
        return element;
    }
    //LinkedIn-所属优化师
    public WebElement linkedInOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInOptimizer"));
        return element;
    }
    //LinkedIn-创建时间-开始
    public WebElement linkedInCreateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInCreateTimeStart"));
        return element;
    }
    //LinkedIn-创建时间-结束
    public WebElement linkedInCreateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInCreateTimeEnd"));
        return element;
    }
    //LinkedIn-搜索
    public WebElement linkedInSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInSearch"));
        return element;
    }
    //LinkedIn-重置
    public WebElement linkedInReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInReset"));
        return element;
    }
    //LinkedIn-上传账户
    public WebElement linkedInUploadAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInUploadAccount"));
        return element;
    }
    //LinkedIn-上传账户-选择文件-点击上传
    public WebElement linkedInUploadAccountClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInUploadAccountClickToUpload"));
        return element;
    }
    //LinkedIn-上传账户-下载模板
    public WebElement linkedInUploadAccountDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInUploadAccountDownloadTemple"));
        return element;
    }
    //LinkedIn-上传账户-确认
    public WebElement linkedInUploadAccountSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInUploadAccountSubmit"));
        return element;
    }
    //LinkedIn-上传账户-关闭
    public WebElement linkedInUploadAccountCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInUploadAccountCancel"));
        return element;
    }
    //LinkedIn-批量调整预算
    public WebElement linkedInBatchAdjustBudget() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInBatchAdjustBudget"));
        return element;
    }
    //LinkedIn-批量调整预算-选择文件-点击文件上传
    public WebElement linkedInBatchAdjustBudgetClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInBatchAdjustBudgetClickToUpload"));
        return element;
    }
    //LinkedIn-批量调整预算-下载模板
    public WebElement linkedInBatchAdjustBudgetDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInBatchAdjustBudgetDownloadTemple"));
        return element;
    }
    //LinkedIn-批量调整预算-确认
    public WebElement linkedInBatchAdjustBudgetSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInBatchAdjustBudgetSubmit"));
        return element;
    }
    //LinkedIn-批量调整预算-关闭
    public WebElement linkedInBatchAdjustBudgetCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInBatchAdjustBudgetCancel"));
        return element;
    }
    //LinkedIn-下载
    public WebElement linkedInBatchAdjustBudgetDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInBatchAdjustBudgetDownload"));
        return element;
    }
    //LinkedIn-调整预算
    public WebElement linkedInAdjustBudget() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInAdjustBudget"));
        return element;
    }
    //LinkedIn-调整预算-调整后
    public WebElement linkedInAdjustBudgetAfter() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInAdjustBudgetAfter"));
        return element;
    }
    //LinkedIn-调整预算-确认
    public WebElement linkedInAdjustBudgetSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInAdjustBudgetSubmit"));
        return element;
    }
    //LinkedIn-调整预算-关闭
    public WebElement linkedInAdjustBudgetCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInAdjustBudgetCancel"));
        return element;
    }
    //LinkedIn-绑定客户
    public WebElement linkedInBindCustomers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInBindCustomers"));
        return element;
    }
    //LinkedIn-绑定客户-选择客户
    public WebElement linkedInBindCustomersSelectCustomer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInBindCustomersSelectCustomer"));
        return element;
    }
    //LinkedIn-绑定客户-确认
    public WebElement linkedInBindCustomersSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInBindCustomersSubmit"));
        return element;
    }
    //LinkedIn-绑定客户-关闭
    public WebElement linkedInBindCustomersCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.linkedInBindCustomersCancel"));
        return element;
    }
    //LI操作日志-操作流水号
    public WebElement liOperationLogOperationSerialNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.liOperationLogOperationSerialNumber"));
        return element;
    }
    //LI操作日志-Account ID
    public WebElement liOperationLogAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.liOperationLogAccountID"));
        return element;
    }
    //LI操作日志-客户名称
    public WebElement liOperationLogCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.liOperationLogCustomerName"));
        return element;
    }
    //LI操作日志-操作类型
    public WebElement liOperationLogOperationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.liOperationLogOperationType"));
        return element;
    }
    //LI操作日志-操作状态
    public WebElement liOperationLogOperationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.liOperationLogOperationStatus"));
        return element;
    }
    //LI操作日志-操作人
    public WebElement liOperationLogOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.liOperationLogOperator"));
        return element;
    }
    //LI操作日志-创建时间-开始
    public WebElement liOperationLogCreateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.liOperationLogCreateTimeStart"));
        return element;
    }
    //LI操作日志-创建时间-结束
    public WebElement liOperationLogCreateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.liOperationLogCreateTimeEnd"));
        return element;
    }
    //LI操作日志-搜索
    public WebElement liOperationLogSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.liOperationLogSearch"));
        return element;
    }
    //LI操作日志-重置
    public WebElement liOperationLogReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.liOperationLogReset"));
        return element;
    }
    //LI操作日志-下载
    public WebElement liOperationLogDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.modifyAccount.liOperationLogDownload"));
        return element;
    }
}