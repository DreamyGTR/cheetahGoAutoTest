package cheetahgo.pageobjects.AccountManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class PrepaidRechargeObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public PrepaidRechargeObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //钱包充值扣款-客户名称
    public WebElement walletRechargeAndDeductionCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerName"));
        return element;
    }
    //钱包充值扣款-客户类别
    public WebElement walletRechargeAndDeductionCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerType"));
        return element;
    }
    //钱包充值扣款-所属销售
    public WebElement walletRechargeAndDeductionSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSalesName"));
        return element;
    }
    //钱包充值扣款-所属AM
    public WebElement walletRechargeAndDeductionAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAMName"));
        return element;
    }
    //钱包充值扣款-超额充值
    public WebElement walletRechargeAndDeductionOvercharge() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionOvercharge"));
        return element;
    }
    //钱包充值扣款-设置子钱包扣款顺序
    public WebElement walletRechargeAndDeductionSetSubWalletDeductionSequence() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSetSubWalletDeductionSequence"));
        return element;
    }
    //钱包充值扣款-设置子钱包扣款顺序-1
    public WebElement walletRechargeAndDeductionSetSubWalletDeductionSequenceOne() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSetSubWalletDeductionSequenceOne"));
        return element;
    }
    //钱包充值扣款-设置子钱包扣款顺序-2
    public WebElement walletRechargeAndDeductionSetSubWalletDeductionSequenceTwo() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSetSubWalletDeductionSequenceTwo"));
        return element;
    }
    //钱包充值扣款-设置子钱包扣款顺序-3
    public WebElement walletRechargeAndDeductionSetSubWalletDeductionSequenceThree() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSetSubWalletDeductionSequenceThree"));
        return element;
    }
    //钱包充值扣款-设置子钱包扣款顺序-4
    public WebElement walletRechargeAndDeductionSetSubWalletDeductionSequenceFour() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSetSubWalletDeductionSequenceFour"));
        return element;
    }
    //钱包充值扣款-设置子钱包扣款顺序-5
    public WebElement walletRechargeAndDeductionSetSubWalletDeductionSequenceFive() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSetSubWalletDeductionSequenceFive"));
        return element;
    }
    //钱包充值扣款-设置子钱包扣款顺序-确认
    public WebElement walletRechargeAndDeductionSetSubWalletDeductionSequenceSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSetSubWalletDeductionSequenceSubmit"));
        return element;
    }
    //钱包充值扣款-设置子钱包扣款顺序-取消
    public WebElement walletRechargeAndDeductionSetSubWalletDeductionSequenceCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSetSubWalletDeductionSequenceCancel"));
        return element;
    }
    //钱包充值扣款-批量充值
    public WebElement walletRechargeAndDeductionBatchRecharge() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchRecharge"));
        return element;
    }
    //钱包充值扣款-批量充值-点击上传
    public WebElement walletRechargeAndDeductionBatchRechargeClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchRechargeClickToUpload"));
        return element;
    }
    //钱包充值扣款-批量充值-下载模板
    public WebElement walletRechargeAndDeductionBatchRechargeDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchRechargeDownloadTemple"));
        return element;
    }
    //钱包充值扣款-批量充值-确认
    public WebElement walletRechargeAndDeductionBatchRechargeSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchRechargeSubmit"));
        return element;
    }
    //钱包充值扣款-批量充值-取消
    public WebElement walletRechargeAndDeductionBatchRechargeCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchRechargeCancel"));
        return element;
    }
    //钱包充值扣款-批量清零
    public WebElement walletRechargeAndDeductionBatchClear() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchClear"));
        return element;
    }
    //钱包充值扣款-批量清零-点击上传
    public WebElement walletRechargeAndDeductionBatchClearClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchClearClickToUpload"));
        return element;
    }
    //钱包充值扣款-批量清零-下载模板
    public WebElement walletRechargeAndDeductionBatchClearDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchClearDownloadTemple"));
        return element;
    }
    //钱包充值扣款-批量清零-确认
    public WebElement walletRechargeAndDeductionBatchClearSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchClearSubmit"));
        return element;
    }
    //钱包充值扣款-批量清零-取消
    public WebElement walletRechargeAndDeductionBatchClearCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchClearCancel"));
        return element;
    }
    //钱包充值扣款-批量封户取款
    public WebElement walletRechargeAndDeductionBatchAccountClosureAndWithdrawal() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchAccountClosureAndWithdrawal"));
        return element;
    }
    //钱包充值扣款-批量封户取款-点击上传
    public WebElement walletRechargeAndDeductionBatchAccountClosureAndWithdrawalClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchAccountClosureAndWithdrawalClickToUpload"));
        return element;
    }
    //钱包充值扣款-批量封户取款-下载模板
    public WebElement walletRechargeAndDeductionBatchAccountClosureAndWithdrawalDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchAccountClosureAndWithdrawalDownloadTemple"));
        return element;
    }
    //钱包充值扣款-批量封户取款-确认
    public WebElement walletRechargeAndDeductionBatchAccountClosureAndWithdrawalSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchAccountClosureAndWithdrawalSubmit"));
        return element;
    }
    //钱包充值扣款-批量封户取款-取消
    public WebElement walletRechargeAndDeductionBatchAccountClosureAndWithdrawalCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchAccountClosureAndWithdrawalCancel"));
        return element;
    }
    //钱包充值扣款-上传超额充值名单
    public WebElement walletRechargeAndDeductionUploadExcessRechargeList() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionUploadExcessRechargeList"));
        return element;
    }
    //钱包充值扣款-上传超额充值名单-点击上传
    public WebElement walletRechargeAndDeductionUploadExcessRechargeListClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionUploadExcessRechargeListClickToUpload"));
        return element;
    }
    //钱包充值扣款-上传超额充值名单-下载模板
    public WebElement walletRechargeAndDeductionUploadExcessRechargeListDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionUploadExcessRechargeListDownloadTemple"));
        return element;
    }
    //钱包充值扣款-上传超额充值名单-确认
    public WebElement walletRechargeAndDeductionUploadExcessRechargeListSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionUploadExcessRechargeListSubmit"));
        return element;
    }
    //钱包充值扣款-上传超额充值名单-取消
    public WebElement walletRechargeAndDeductionUploadExcessRechargeListCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionUploadExcessRechargeListCancel"));
        return element;
    }
    //钱包充值扣款-批量重置
    public WebElement walletRechargeAndDeductionBatchReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchReset"));
        return element;
    }
    //钱包充值扣款-批量重置-上传文件
    public WebElement walletRechargeAndDeductionBatchResetClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchResetClickToUpload"));
        return element;
    }
    //钱包充值扣款-批量重置-下载模板
    public WebElement walletRechargeAndDeductionBatchResetDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchResetDownloadTemple"));
        return element;
    }
    //钱包充值扣款-批量重置-确认
    public WebElement walletRechargeAndDeductionBatchResetSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchResetSubmit"));
        return element;
    }
    //钱包充值扣款-批量重置-取消
    public WebElement walletRechargeAndDeductionBatchResetCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionBatchResetCancel"));
        return element;
    }
    //钱包充值扣款-搜索
    public WebElement walletRechargeAndDeductionSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSearch"));
        return element;
    }
    //钱包充值扣款-下载
    public WebElement walletRechargeAndDeductionDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionDownload"));
        return element;
    }
    //钱包充值扣款-账户充值
    public WebElement walletRechargeAndDeductionAccountRecharge() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRecharge"));
        return element;
    }
    //钱包充值扣款-账户充值-默认扣款顺序
    public WebElement walletRechargeAndDeductionAccountRechargeDefaultDeductionOrder() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeDefaultDeductionOrder"));
        return element;
    }
    //钱包充值扣款-账户充值-自助支付
    public WebElement walletRechargeAndDeductionAccountRechargeSelfServicePayment() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeSelfServicePayment"));
        return element;
    }
    //钱包充值扣款-账户充值-对公到款
    public WebElement walletRechargeAndDeductionAccountRechargePaymentReceivedFromBusiness() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargePaymentReceivedFromBusiness"));
        return element;
    }
    //钱包充值扣款-账户充值-返点
    public WebElement walletRechargeAndDeductionAccountRechargeRebate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeRebate"));
        return element;
    }
    //钱包充值扣款-账户充值-活跃账户取款
    public WebElement walletRechargeAndDeductionAccountRechargeActiveAccountWithdrawals() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeActiveAccountWithdrawals"));
        return element;
    }
    //钱包充值扣款-账户充值-被封账户取款
    public WebElement walletRechargeAndDeductionAccountRechargeWithdrawalFromBlockedAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeWithdrawalFromBlockedAccount"));
        return element;
    }
    //钱包充值扣款-账户充值-输入充值信息-批量上传
    public WebElement walletRechargeAndDeductionAccountRechargeBulkUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeBulkUpload"));
        return element;
    }
    //钱包充值扣款-账户充值-输入充值信息-下载模板
    public WebElement walletRechargeAndDeductionAccountRechargeDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeDownloadTemple"));
        return element;
    }
    //钱包充值扣款-账户充值-输入框选择账户
    public WebElement walletRechargeAndDeductionAccountRechargeSelectAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeSelectAccount"));
        return element;
    }
    //钱包充值扣款-账户充值-输入框充值金额
    public WebElement walletRechargeAndDeductionAccountRechargeInputRechargeAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeInputRechargeAmount"));
        return element;
    }
    //钱包充值扣款-账户充值-+
    public WebElement walletRechargeAndDeductionAccountRechargeAdd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeAdd"));
        return element;
    }
    //钱包充值扣款-账户充值-确认
    public WebElement walletRechargeAndDeductionAccountRechargeSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeSubmit"));
        return element;
    }
    //钱包充值扣款-账户充值-取消
    public WebElement walletRechargeAndDeductionAccountRechargeCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountRechargeCancel"));
        return element;
    }
    //钱包充值扣款-账户减款
    public WebElement walletRechargeAndDeductionAccountReduction() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountReduction"));
        return element;
    }
    //钱包充值扣款-账户减款-转出账户
    public WebElement walletRechargeAndDeductionAccountReductionTransferOutAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountReductionTransferOutAccount"));
        return element;
    }
    //钱包充值扣款-账户减款-转出类型-转入广告账户
    public WebElement walletRechargeAndDeductionAccountReductionTransferToAdvertisingAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountReductionTransferToAdvertisingAccount"));
        return element;
    }
    //钱包充值扣款-账户减款-转出类型-转入钱包
    public WebElement walletRechargeAndDeductionAccountReductionTransferToWallet() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountReductionTransferToWallet"));
        return element;
    }
    //钱包充值扣款-账户减款-转账金额
    public WebElement walletRechargeAndDeductionAccountReductionTransferAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountReductionTransferAmount"));
        return element;
    }
    //钱包充值扣款-账户减款-确认
    public WebElement walletRechargeAndDeductionAccountReductionSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountReductionSubmit"));
        return element;
    }
    //钱包充值扣款-账户减款-取消
    public WebElement walletRechargeAndDeductionAccountReductionCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountReductionCancel"));
        return element;
    }
    //钱包充值扣款-封户取款
    public WebElement walletRechargeAndDeductionAccountClosureAndWithdrawal() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountClosureAndWithdrawal"));
        return element;
    }
    //钱包充值扣款-封户取款-选择账户
    public WebElement walletRechargeAndDeductionAccountClosureAndWithdrawalSelectAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountClosureAndWithdrawalSelectAccount"));
        return element;
    }
    //钱包充值扣款-封户取款-转账金额
    public WebElement walletRechargeAndDeductionAccountClosureAndWithdrawalTransferAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountClosureAndWithdrawalTransferAmount"));
        return element;
    }
    //钱包充值扣款-封户取款-确认
    public WebElement walletRechargeAndDeductionAccountClosureAndWithdrawalSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountClosureAndWithdrawalSubmit"));
        return element;
    }
    //钱包充值扣款-封户取款-取消
    public WebElement walletRechargeAndDeductionAccountClosureAndWithdrawalCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountClosureAndWithdrawalCancel"));
        return element;
    }
    //钱包充值扣款-账户重置
    public WebElement walletRechargeAndDeductionAccountReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountReset"));
        return element;
    }
    //钱包充值扣款-账户重置-批量上传
    public WebElement walletRechargeAndDeductionAccountResetBulkUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountResetBulkUpload"));
        return element;
    }
    //钱包充值扣款-账户重置-下载模板
    public WebElement walletRechargeAndDeductionAccountResetDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountResetDownloadTemple"));
        return element;
    }
    //钱包充值扣款-账户重置-选择账户下拉框
    public WebElement walletRechargeAndDeductionAccountResetSelectAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountResetSelectAccount"));
        return element;
    }
    //钱包充值扣款-账户重置-确认
    public WebElement walletRechargeAndDeductionAccountResetSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountResetSubmit"));
        return element;
    }
    //钱包充值扣款-账户重置-取消
    public WebElement walletRechargeAndDeductionAccountResetCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionAccountResetCancel"));
        return element;
    }
    //钱包充值扣款-查看明细
    public WebElement walletRechargeAndDeductionViewDetails() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionViewDetails"));
        return element;
    }
    //钱包充值扣款-子钱包设置
    public WebElement walletRechargeAndDeductionSubWalletSettings() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSubWalletSettings"));
        return element;
    }
    //钱包充值扣款-子钱包设置-对公到款开关
    public WebElement walletRechargeAndDeductionSubWalletSettingsPaymentReceivedFromBusiness() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSubWalletSettingsPaymentReceivedFromBusiness"));
        return element;
    }
    //钱包充值扣款-子钱包设置-返点开关
    public WebElement walletRechargeAndDeductionSubWalletSettingsRebate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSubWalletSettingsRebate"));
        return element;
    }
    //钱包充值扣款-子钱包设置-自助支付
    public WebElement walletRechargeAndDeductionSubWalletSettingsSelfServicePayment() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSubWalletSettingsSelfServicePayment"));
        return element;
    }
    //钱包充值扣款-子钱包设置-活跃账户取款
    public WebElement walletRechargeAndDeductionSubWalletSettingsActiveAccountWithdrawals() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSubWalletSettingsActiveAccountWithdrawals"));
        return element;
    }
    //钱包充值扣款-子钱包设置-被封账户取款
    public WebElement walletRechargeAndDeductionSubWalletSettingsWithdrawalFromBlockedAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSubWalletSettingsWithdrawalFromBlockedAccount"));
        return element;
    }
    //钱包充值扣款-子钱包设置-确认
    public WebElement walletRechargeAndDeductionSubWalletSettingsSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSubWalletSettingsSubmit"));
        return element;
    }
    //钱包充值扣款-子钱包设置-取消
    public WebElement walletRechargeAndDeductionSubWalletSettingsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionSubWalletSettingsCancel"));
        return element;
    }
    //钱包充值扣款-客户扣款
    public WebElement walletRechargeAndDeductionCustomerDeduction() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeduction"));
        return element;
    }
    //钱包充值扣款-客户扣款-交易类型-跨SAP转款
    public WebElement walletRechargeAndDeductionCustomerDeductionTransferMoneyAcrossSAP() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionTransferMoneyAcrossSAP"));
        return element;
    }
    //钱包充值扣款-客户扣款-交易类型-跨媒体转款
    public WebElement walletRechargeAndDeductionCustomerDeductionCrossMediaTransfers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionCrossMediaTransfers"));
        return element;
    }
    //钱包充值扣款-客户扣款-交易类型-不合作退款
    public WebElement walletRechargeAndDeductionCustomerDeductionRefundForNonCooperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionRefundForNonCooperation"));
        return element;
    }
    //钱包充值扣款-客户扣款-交易类型-超额充值扣款
    public WebElement walletRechargeAndDeductionCustomerDeductionDeductionForExcessRecharge() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionDeductionForExcessRecharge"));
        return element;
    }
    //钱包充值扣款-客户扣款-交易类型-水单充值抵扣
    public WebElement walletRechargeAndDeductionCustomerDeductionWaterBillRechargeAndDeduction() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionWaterBillRechargeAndDeduction"));
        return element;
    }
    //钱包充值扣款-客户扣款-对公到款输入金额
    public WebElement walletRechargeAndDeductionCustomerDeductionAmountForCorporatePayment() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionAmountForCorporatePayment"));
        return element;
    }
    //钱包充值扣款-客户扣款-返点输入金额
    public WebElement walletRechargeAndDeductionCustomerDeductionAmountForRebate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionAmountForRebate"));
        return element;
    }
    //钱包充值扣款-客户扣款-自助支付输入金额
    public WebElement walletRechargeAndDeductionCustomerDeductionAmountForSelfServicePayment() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionAmountForSelfServicePayment"));
        return element;
    }
    //钱包充值扣款-客户扣款-活跃账户取款输入金额
    public WebElement walletRechargeAndDeductionCustomerDeductionAmountForActiveAccountWithdrawals() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionAmountForActiveAccountWithdrawals"));
        return element;
    }
    //钱包充值扣款-客户扣款-被封账户取款
    public WebElement walletRechargeAndDeductionCustomerDeductionAmountForBlockedAccountWithdrawals() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionAmountForBlockedAccountWithdrawals"));
        return element;
    }
    //钱包充值扣款-客户扣款-备注
    public WebElement walletRechargeAndDeductionCustomerDeductionDescription() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionDescription"));
        return element;
    }
    //钱包充值扣款-客户扣款-确认
    public WebElement walletRechargeAndDeductionCustomerDeductionSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionSubmit"));
        return element;
    }
    //钱包充值扣款-客户扣款-取消
    public WebElement walletRechargeAndDeductionCustomerDeductionCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletRechargeAndDeductionCustomerDeductionCancel"));
        return element;
    }
    //钱包明细-客户名称
    public WebElement walletDetailsCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsCustomerName"));
        return element;
    }
    //钱包明细-客户类别
    public WebElement walletDetailsCustomerCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsCustomerCategory"));
        return element;
    }
    //钱包明细-所属销售
    public WebElement walletDetailsSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsSalesName"));
        return element;
    }
    //钱包明细-所属AM
    public WebElement walletDetailsAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsAMName"));
        return element;
    }
    //钱包明细-订单编号
    public WebElement walletDetailsOrderNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsOrderNumber"));
        return element;
    }
    //钱包明细-操作流水号
    public WebElement walletDetailsOperationSerialNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsOperationSerialNumber"));
        return element;
    }
    //钱包明细-子钱包类型
    public WebElement walletDetailsSubWalletType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsSubWalletType"));
        return element;
    }
    //钱包明细-交易类型
    public WebElement walletDetailsTransactionType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsTransactionType"));
        return element;
    }
    //钱包明细-Account ID
    public WebElement walletDetailsAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsAccountID"));
        return element;
    }
    //钱包明细-操作人
    public WebElement walletDetailsOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsOperator"));
        return element;
    }
    //钱包明细-操作平台
    public WebElement walletDetailsOperatingPlatform() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsOperatingPlatform"));
        return element;
    }
    //钱包明细-交易时间-开始
    public WebElement walletDetailsTransactionHourStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsTransactionHourStart"));
        return element;
    }
    //钱包明细-交易时间-结束
    public WebElement walletDetailsTransactionHourEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsTransactionHourEnd"));
        return element;
    }
    //钱包明细-搜索
    public WebElement walletDetailsSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsSearch"));
        return element;
    }
    //钱包明细-下载
    public WebElement walletDetailsDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsDownloadh"));
        return element;
    }
    //钱包明细-重置
    public WebElement walletDetailsReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.walletDetailsReset"));
        return element;
    }
    //钱包明细-客户名称
    public WebElement rechargeAtHospitalityCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityCustomerName"));
        return element;
    }
    //钱包明细-所属AM
    public WebElement rechargeAtHospitalityAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityAMName"));
        return element;
    }
    //到款待充值-到款Description
    public WebElement rechargeAtHospitalityPaymentDescription() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityPaymentDescription"));
        return element;
    }
    //到款待充值-认领时间-开始
    public WebElement rechargeAtHospitalityClaimTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityClaimTimeStart"));
        return element;
    }
    //到款待充值-认领时间-结束
    public WebElement rechargeAtHospitalityClaimTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityClaimTimeEnd"));
        return element;
    }
    //到款待充值-到款ID
    public WebElement rechargeAtHospitalityPaymentID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityPaymentID"));
        return element;
    }
    //到款待充值-水单充值
    public WebElement rechargeAtHospitalityWaterBillRecharge() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityWaterBillRecharge"));
        return element;
    }
    //到款待充值-水单充值-选择SAP客户
    public WebElement rechargeAtHospitalityWaterBillRechargeSelectSAPCustomer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityWaterBillRechargeSelectSAPCustomer"));
        return element;
    }
    //到款待充值-水单充值-输入充值金额
    public WebElement rechargeAtHospitalityWaterBillRechargeEnterRechargeAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityWaterBillRechargeEnterRechargeAmount"));
        return element;
    }
    //到款待充值-水单充值-提交充值
    public WebElement rechargeAtHospitalityWaterBillRechargeSubmitRecharge() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityWaterBillRechargeSubmitRecharge"));
        return element;
    }
    //到款待充值-水单充值-取消
    public WebElement rechargeAtHospitalityWaterBillRechargeCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityWaterBillRechargeCancel"));
        return element;
    }
    //到款待充值-预付实消充值
    public WebElement rechargeAtHospitalityPrepaidRecharge() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityPrepaidRecharge"));
        return element;
    }
    //到款待充值-预付实消充值-选择SAP客户
    public WebElement rechargeAtHospitalityPrepaidRechargeSelectSAPCustomer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityPrepaidRechargeSelectSAPCustomer"));
        return element;
    }
    //到款待充值-预付实消充值-输入充值信息-批量上传
    public WebElement rechargeAtHospitalityPrepaidRechargeBatchUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityPrepaidRechargeBatchUpload"));
        return element;
    }
    //到款待充值-预付实消充值-输入充值信息-下载模板
    public WebElement rechargeAtHospitalityPrepaidRechargeDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityPrepaidRechargeDownloadTemple"));
        return element;
    }
    //到款待充值-预付实消充值-选择账户下拉框
    public WebElement rechargeAtHospitalityPrepaidRechargeSelectAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityPrepaidRechargeSelectAccount"));
        return element;
    }
    //到款待充值-预付实消充值-充值金额
    public WebElement rechargeAtHospitalityPrepaidRechargeRechargeAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityPrepaidRechargeRechargeAmount"));
        return element;
    }
    //到款待充值-预付实消充值-提交充值
    public WebElement rechargeAtHospitalityPrepaidRechargeSubmitRecharge() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityPrepaidRechargeSubmitRecharge"));
        return element;
    }
    //到款待充值-预付实消充值-取消
    public WebElement rechargeAtHospitalityPrepaidRechargeCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityPrepaidRechargeCancel"));
        return element;
    }
    //到款待充值-钱包初始值
    public WebElement rechargeAtHospitalityWalletInitialValue() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityWalletInitialValue"));
        return element;
    }
    //到款待充值-钱包初始值-选择文件-点击上传
    public WebElement rechargeAtHospitalityWalletInitialValueClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityWalletInitialValueClickToUpload"));
        return element;
    }
    //到款待充值-钱包初始值-下载模板
    public WebElement rechargeAtHospitalityWalletInitialValueDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityWalletInitialValueDownloadTemple"));
        return element;
    }
    //到款待充值-钱包初始值-确认
    public WebElement rechargeAtHospitalityWalletInitialValueSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityWalletInitialValueSubmit"));
        return element;
    }
    //到款待充值-钱包初始值-取消
    public WebElement rechargeAtHospitalityWalletInitialValueCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityWalletInitialValueCancel"));
        return element;
    }
    //到款待充值-搜索
    public WebElement rechargeAtHospitalitySearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalitySearch"));
        return element;
    }
    //到款待充值-下载
    public WebElement rechargeAtHospitalityDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeAtHospitalityDownload"));
        return element;
    }
    //到款充值记录-客户名称
    public WebElement rechargeRecordCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordCustomerName"));
        return element;
    }
    //到款充值记录-Account ID
    public WebElement rechargeRecordAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordAccountID"));
        return element;
    }
    //到款充值记录-操作人
    public WebElement rechargeRecordOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordOperator"));
        return element;
    }
    //到款充值记录-所属销售
    public WebElement rechargeRecordSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordSalesName"));
        return element;
    }
    //到款充值记录-充值状态
    public WebElement rechargeRecordRechargeStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordRechargeStatus"));
        return element;
    }
    //到款充值记录-到款Description
    public WebElement rechargeRecordPaymentDescription() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordPaymentDescription"));
        return element;
    }
    //到款充值记录-操作时间-开始
    public WebElement rechargeRecordOperationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordOperationTimeStart"));
        return element;
    }
    //到款充值记录-操作时间-结束
    public WebElement rechargeRecordOperationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordOperationTimeEnd"));
        return element;
    }
    //到款充值记录-充值类型
    public WebElement rechargeRecordOperationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordOperationType"));
        return element;
    }
    //到款充值记录-客户类别
    public WebElement rechargeRecordOperationCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordOperationCategory"));
        return element;
    }
    //到款充值记录-搜索
    public WebElement rechargeRecordSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordSearch"));
        return element;
    }
    //到款充值记录-下载
    public WebElement rechargeRecordDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.rechargeRecordDownload"));
        return element;
    }
    //自助支付记录-客户ID
    public WebElement selfServicePaymentRecordCustomerID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordCustomerID"));
        return element;
    }
    //到款充值记录-客户名称
    public WebElement selfServicePaymentRecordCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordCustomerName"));
        return element;
    }
    //自助支付记录-客户类别
    public WebElement selfServicePaymentRecordCustomerCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordCustomerCategory"));
        return element;
    }
    //自助支付记录-所属销售
    public WebElement selfServicePaymentRecordSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordSalesName"));
        return element;
    }
    //自助支付记录-所属AM
    public WebElement selfServicePaymentRecordAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordAMName"));
        return element;
    }
    //自助支付记录-订单号
    public WebElement selfServicePaymentRecordOrderNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordOrderNumber"));
        return element;
    }
    //自助支付记录-订单类型
    public WebElement selfServicePaymentRecordOrderType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordOrderType"));
        return element;
    }
    //自助支付记录-广告账户
    public WebElement selfServicePaymentRecordAdAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordAdAccount"));
        return element;
    }
    //自助支付记录-支付方式
    public WebElement selfServicePaymentRecordPaymentMethod() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordPaymentMethod"));
        return element;
    }
    //自助支付记录-订单状态
    public WebElement selfServicePaymentRecordOrderStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordOrderStatus"));
        return element;
    }
    //自助支付记录-日期-开始
    public WebElement selfServicePaymentRecordDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordDateStart"));
        return element;
    }
    //自助支付记录-日期-结束
    public WebElement selfServicePaymentRecordDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordDateEnd"));
        return element;
    }
    //自助支付记录-搜索
    public WebElement selfServicePaymentRecordSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordSearch"));
        return element;
    }
    //自助支付记录-下载
    public WebElement selfServicePaymentRecordDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.prepaidRecharge.selfServicePaymentRecordDownload"));
        return element;
    }
}