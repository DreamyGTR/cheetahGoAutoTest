package cheetahgo.pageobjects.BusinessManagrmentPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class TikTokViolationDetailsObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public TikTokViolationDetailsObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //违规广告-客户名称
    public WebElement illegalAdvertisingCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingCustomerName"));
        return element;
    }
    //违规广告-客户类型
    public WebElement illegalAdvertisingCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingCustomerType"));
        return element;
    }
    //违规广告-开户主体
    public WebElement illegalAdvertisingEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingEntity"));
        return element;
    }
    //违规广告-Account ID
    public WebElement illegalAdvertisingAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingAccountID"));
        return element;
    }
    //违规广告-广告系列ID
    public WebElement illegalAdvertisingCampaignID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingCampaignID"));
        return element;
    }
    //违规广告-广告组ID
    public WebElement illegalAdvertisingAdGroupID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingAdGroupID"));
        return element;
    }
    //违规广告-广告ID
    public WebElement illegalAdvertisingAdID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingAdID"));
        return element;
    }
    //违规广告-BC ID
    public WebElement illegalAdvertisingBCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingBCID"));
        return element;
    }
    //违规广告-BC名称
    public WebElement illegalAdvertisingBCName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingBCName"));
        return element;
    }
    //违规广告-广告状态
    public WebElement illegalAdvertisingAdStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingAdStatus"));
        return element;
    }
    //违规广告-广告操作状态
    public WebElement illegalAdvertisingAdOperationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingAdOperationStatus"));
        return element;
    }
    //违规广告-违规级别
    public WebElement illegalAdvertisingViolationLevel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingViolationLevel"));
        return element;
    }
    //违规广告-所属销售
    public WebElement illegalAdvertisingSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingSalesName"));
        return element;
    }
    //违规广告-所属AM
    public WebElement illegalAdvertisingAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingAMName"));
        return element;
    }
    //违规广告-所属优化
    public WebElement illegalAdvertisingOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingOptimizer"));
        return element;
    }
    //违规广告-关停结果
    public WebElement illegalAdvertisingShutdownResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingShutdownResults"));
        return element;
    }
    //违规广告-删除结果
    public WebElement illegalAdvertisingDeleteResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingDeleteResults"));
        return element;
    }
    //违规广告-通知结果
    public WebElement illegalAdvertisingNotifyResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingNotifyResults"));
        return element;
    }
    //违规广告-复审人
    public WebElement illegalAdvertisingReviewer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingReviewer"));
        return element;
    }
    //违规广告-程序化广告
    public WebElement illegalAdvertisingProgrammaticAdvertising() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingProgrammaticAdvertising"));
        return element;
    }
    //违规广告-复审备注
    public WebElement illegalAdvertisingReviewNotes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingReviewNotes"));
        return element;
    }
    //违规广告-上传时间-开始
    public WebElement illegalAdvertisingUploadTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingUploadTimeStart"));
        return element;
    }
    //违规广告-上传时间-结束
    public WebElement illegalAdvertisingUploadTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingUploadTimeEnd"));
        return element;
    }
    //违规广告-上传文件
    public WebElement illegalAdvertisingUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingUploadFiles"));
        return element;
    }
    //违规广告-上传文件-选择类型-上传违规广告ID
    public WebElement illegalAdvertisingUploadIllegalAdvertisingID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingUploadIllegalAdvertisingID"));
        return element;
    }
    //违规广告-上传文件-选择类型-批量操作违规广告
    public WebElement illegalAdvertisingBatchOperationIllegalAds() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingBatchOperationIllegalAds"));
        return element;
    }
    //违规广告-上传文件-上传违规广告ID-选择文件-点击上传
    public WebElement illegalAdvertisingIllegalIDUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingIllegalIDUploadFiles"));
        return element;
    }
    //违规广告-上传文件-上传违规广告ID-选择文件-下载模板
    public WebElement illegalAdvertisingIllegalIDDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingIllegalIDDownloadTemple"));
        return element;
    }
    //违规广告-上传文件-批量操作违规广告-选择文件-下载模板
    public WebElement illegalAdvertisingIllegalADDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingIllegalADDownloadTemple"));
        return element;
    }
    //违规广告-上传文件-确定
    public WebElement illegalAdvertisingSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingSubmit"));
        return element;
    }
    //违规广告-上传文件-取消
    public WebElement illegalAdvertisingCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingCancel"));
        return element;
    }
    //违规广告-列表勾选框
    public WebElement illegalAdvertisingCheckbox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingCheckbox"));
        return element;
    }
    //违规广告-批量复审
    public WebElement illegalAdvertisingBatchReview() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingBatchReview"));
        return element;
    }
    //违规广告-批量操作
    public WebElement illegalAdvertisingBatchOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingBatchOperation"));
        return element;
    }
    //违规广告-搜索
    public WebElement illegalAdvertisingSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingSearch"));
        return element;
    }
    //违规广告-下载
    public WebElement illegalAdvertisingDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingDownload"));
        return element;
    }
    //违规广告-变更记录
    public WebElement illegalAdvertisingChangeLog() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingChangeLog"));
        return element;
    }
    //违规广告-操作-预览
    public WebElement illegalAdvertisingPreview() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingPreview"));
        return element;
    }
    //违规广告-操作-预览-复制
    public WebElement illegalAdvertisingPreviewCopy() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingPreviewCopy"));
        return element;
    }
    //违规广告-操作-预览-查看翻译
    public WebElement illegalAdvertisingPreviewViewTranslation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingPreviewViewTranslation"));
        return element;
    }
    //违规广告-操作-预览-取消
    public WebElement illegalAdvertisingPreviewCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingPreviewCancel"));
        return element;
    }
    //违规广告-操作-复审
    public WebElement illegalAdvertisingReview() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingReview"));
        return element;
    }
    //违规广告-操作-复审-审核结果-未通过
    public WebElement illegalAdvertisingReviewNotPass() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingReviewNotPass"));
        return element;
    }
    //违规广告-操作-复审-审核结果-通过
    public WebElement illegalAdvertisingReviewPass() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingReviewPass"));
        return element;
    }
    //违规广告-操作-复审-备注
    public WebElement illegalAdvertisingReviewNote() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingReviewNote"));
        return element;
    }
    //违规广告-操作-复审-确定
    public WebElement illegalAdvertisingReviewSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingReviewSubmit"));
        return element;
    }
    //违规广告-操作-复审-取消
    public WebElement illegalAdvertisingReviewCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingReviewCancel"));
        return element;
    }
    //违规广告-操作
    public WebElement illegalAdvertisingOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingOperation"));
        return element;
    }
    //违规广告-操作-关停删除操作-关停当前广告系列
    public WebElement illegalAdvertisingShutDownCurrentCampaign() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingShutDownCurrentCampaign"));
        return element;
    }
    //违规广告-操作-关停删除操作-删除当前广告系列
    public WebElement illegalAdvertisingDeleteCurrentCampaign() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingDeleteCurrentCampaign"));
        return element;
    }
    //违规广告-操作-关停删除操作-关停当前广告组
    public WebElement illegalAdvertisingCloseCurrentAdGroup() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingCloseCurrentAdGroup"));
        return element;
    }
    //违规广告-操作-关停删除操作-删除当前广告组
    public WebElement illegalAdvertisingDeleteCurrentAdGroup() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingDeleteCurrentAdGroup"));
        return element;
    }
    //违规广告-操作-关停删除操作-关停当前广告
    public WebElement illegalAdvertisingCloseCurrentAd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingCloseCurrentAd"));
        return element;
    }
    //违规广告-操作-关停删除操作-删除当前广告
    public WebElement illegalAdvertisingDeleteCurrentAd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingDeleteCurrentAd"));
        return element;
    }
    //违规广告-操作-备注
    public WebElement illegalAdvertisingOperationNote() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingOperationNote"));
        return element;
    }
    //违规广告-操作-确定
    public WebElement illegalAdvertisingOperationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingOperationSubmit"));
        return element;
    }
    //违规广告-操作-取消
    public WebElement illegalAdvertisingOperationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.illegalAdvertisingOperationCancel"));
        return element;
    }
    //违规账户-客户名称
    public WebElement violatingAccountCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountCustomerName"));
        return element;
    }
    //违规账户-客户类型
    public WebElement violatingAccountCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountCustomerType"));
        return element;
    }
    //违规账户-开户主体
    public WebElement violatingAccountEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountEntity"));
        return element;
    }
    //违规账户-Account ID
    public WebElement violatingAccountAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountAccountID"));
        return element;
    }
    //违规账户-广告系列ID
    public WebElement violatingAccountCampaignID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountCampaignID"));
        return element;
    }
    //违规账户-广告组ID
    public WebElement violatingAccountAdGroupID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountAdGroupID"));
        return element;
    }
    //违规账户-BC ID
    public WebElement violatingAccountBCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBCID"));
        return element;
    }
    //违规账户-BC名称
    public WebElement violatingAccountBCName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBCName"));
        return element;
    }
    //违规账户-所属销售
    public WebElement violatingAccountSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountSalesName"));
        return element;
    }
    //违规账户-所属AM
    public WebElement violatingAccountAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountAMName"));
        return element;
    }
    //违规账户-所属优化
    public WebElement violatingAccountOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountOptimizer"));
        return element;
    }
    //违规账户-关停结果
    public WebElement violatingAccountShutdownResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountShutdownResults"));
        return element;
    }
    //违规账户-删除结果
    public WebElement violatingAccountDeleteResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountDeleteResults"));
        return element;
    }
    //违规账户-通知结果
    public WebElement violatingAccountNotityResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountNotityResults"));
        return element;
    }
    //违规账户-复审结果
    public WebElement violatingAccountReviewResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewResults"));
        return element;
    }
    //违规账户-复审人
    public WebElement violatingAccountReviewer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewer"));
        return element;
    }
    //违规账户-复审备注
    public WebElement violatingAccountReviewNotes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewNotes"));
        return element;
    }
    //违规账户-上传时间-开始日期
    public WebElement violatingAccountUploadTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountUploadTimeStart"));
        return element;
    }
    //违规账户-上传时间-结束日期
    public WebElement violatingAccountUploadTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountUploadTimeEnd"));
        return element;
    }
    //违规账户-上传文件
    public WebElement violatingAccountUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountUploadFiles"));
        return element;
    }
    //违规账户-上传文件-选择类型-上传违规账户ID
    public WebElement violatingAccountUploadIllegalAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountUploadIllegalAccountID"));
        return element;
    }
    //违规账户-上传文件-选择类型-批量操作违规账户
    public WebElement violatingAccountBatchOperationIllegalAccounts() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBatchOperationIllegalAccounts"));
        return element;
    }
    //违规账户-上传文件-上传违规账户ID-选择文件-点击上传
    public WebElement violatingAccountSelectUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountSelectUploadFiles"));
        return element;
    }
    //违规账户-上传文件-上传违规账户ID-选择文件-下载模板
    public WebElement violatingAccountSelectDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountSelectDownloadTemple"));
        return element;
    }
    //违规账户-上传文件-批量操作违规账户-选择文件-点击上传
    public WebElement violatingAccountBachUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBachUploadFiles"));
        return element;
    }
    //违规账户-上传文件-批量操作违规账户-选择文件-下载模板
    public WebElement violatingAccountBachDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBachDownloadTemple"));
        return element;
    }
    //违规账户-上传文件-确定
    public WebElement violatingAccountUploadFileSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountUploadFileSubmit"));
        return element;
    }
    //违规账户-上传文件-取消
    public WebElement violatingAccountUploadFileCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountUploadFileCancel"));
        return element;
    }
    //违规账户-列表勾选框
    public WebElement violatingAccountCheckbox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountCheckbox"));
        return element;
    }
    //违规账户-批量复审
    public WebElement violatingAccountBatchReview() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBatchReview"));
        return element;
    }
    //违规账户-批量复审-审核结果-未通过
    public WebElement violatingAccountReviewResultsNotPass() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewResultsNotPass"));
        return element;
    }
    //违规账户-批量复审-审核结果-通过
    public WebElement violatingAccountReviewResultsPass() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewResultsPass"));
        return element;
    }
    //违规账户-批量复审-备注
    public WebElement violatingAccountReviewResultsNote() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewResultsNote"));
        return element;
    }
    //违规账户-批量复审-确定
    public WebElement violatingAccountReviewResultsSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewResultsSubmit"));
        return element;
    }
    //违规账户-批量复审-取消
    public WebElement violatingAccountReviewResultsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewResultsCancel"));
        return element;
    }
    //违规账户-批量操作
    public WebElement violatingAccountBatchOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBatchOperation"));
        return element;
    }
    //违规账户-批量操作-关停删除操作-不操作
    public WebElement violatingAccountBatchOperationNoOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBatchOperationNoOperation"));
        return element;
    }
    //违规账户-批量操作-关停删除操作-关停当前广告系列
    public WebElement violatingAccountBatchOperationShutDownCurrentCampaign() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBatchOperationShutDownCurrentCampaign"));
        return element;
    }
    //违规账户-批量操作-关停删除操作-删除当前广告系列
    public WebElement violatingAccountBatchOperationDeleteCurrentCampaign() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBatchOperationDeleteCurrentCampaign"));
        return element;
    }
    //违规账户-批量操作-备注
    public WebElement violatingAccountBatchOperationNote() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBatchOperationNote"));
        return element;
    }
    //违规账户-批量操作-确定
    public WebElement violatingAccountBatchOperationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBatchOperationSubmit"));
        return element;
    }
    //违规账户-批量操作-取消
    public WebElement violatingAccountBatchOperationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountBatchOperationCancel"));
        return element;
    }
    //违规账户-搜索
    public WebElement violatingAccountSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountSearch"));
        return element;
    }
    //违规账户-下载
    public WebElement violatingAccountDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountDownload"));
        return element;
    }
    //违规账户-关联广告系列
    public WebElement violatingAccountAssociatedCampaigns() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountAssociatedCampaigns"));
        return element;
    }
    //违规账户-关联广告系列-关闭
    public WebElement violatingAccountAssociatedCampaignsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountAssociatedCampaignsCancel"));
        return element;
    }
    //违规账户-关联广告组
    public WebElement violatingAccountAssociatedAdGroups() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountAssociatedAdGroups"));
        return element;
    }
    //违规账户-关联广告组-关闭
    public WebElement violatingAccountAssociatedAdGroupsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountAssociatedAdGroupsCancel"));
        return element;
    }
    //违规账户-复审
    public WebElement violatingAccountReview() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReview"));
        return element;
    }
    //违规账户-复审-审核结果-未通过
    public WebElement violatingAccountReviewNotPass() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewNotPass"));
        return element;
    }
    //违规账户-复审-审核结果-通过
    public WebElement violatingAccountReviewPass() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewPass"));
        return element;
    }
    //违规账户-复审-备注
    public WebElement violatingAccountReviewNote() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewNote"));
        return element;
    }
    //违规账户-复审-确定
    public WebElement violatingAccountReviewSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewSubmit"));
        return element;
    }
    //违规账户-复审-取消
    public WebElement violatingAccountReviewCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountReviewCancel"));
        return element;
    }
    //违规账户-操作
    public WebElement violatingAccountOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountOperation"));
        return element;
    }
    //违规账户-操作-关停删除操作-不操作
    public WebElement violatingAccountOperationNoOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountOperationNoOperation"));
        return element;
    }
    //违规账户-操作-关停删除操作-关停当前广告系列
    public WebElement violatingAccountOperationShutDownCurrentCampaign() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountOperationShutDownCurrentCampaign"));
        return element;
    }
    //违规账户-操作-关停删除操作-删除当前广告系列
    public WebElement violatingAccountOperationDeleteCurrentCampaign() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountOperationShutDownCurrentCampaign"));
        return element;
    }
    //违规账户-操作-备注
    public WebElement violatingAccountOperationNote() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountOperationNote"));
        return element;
    }
    //违规账户-操作-确定
    public WebElement violatingAccountOperationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountOperationSubmit"));
        return element;
    }
    //违规账户-操作-取消
    public WebElement violatingAccountOperationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokViolationDetails.violatingAccountOperationCancel"));
        return element;
    }
}