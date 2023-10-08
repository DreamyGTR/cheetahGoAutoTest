package cheetahgo.pageobjects.BusinessManagrmentPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class RIIViolationDetailsObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public RIIViolationDetailsObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //SAP客户名称
    public WebElement sapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.sapCustomerName"));
        return element;
    }
    //广告ID
    public WebElement adID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.adID"));
        return element;
    }
    //开户主体
    public WebElement accountOpeningEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.accountOpeningEntity"));
        return element;
    }
    //Account ID
    public WebElement accountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.accountID"));
        return element;
    }
    //复审结果
    public WebElement reviewResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewResults"));
        return element;
    }
    //广告状态
    public WebElement adStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.adStatus"));
        return element;
    }
    //所属业绩销售
    public WebElement performanceSales() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.performanceSales"));
        return element;
    }
    //所属AM
    public WebElement amName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.amName"));
        return element;
    }
    //所属优化师
    public WebElement optimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.optimizer"));
        return element;
    }
    //上传时间-开始时间
    public WebElement uploadTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadTimeStart"));
        return element;
    }
    //上传时间-结束时间
    public WebElement uploadTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadTimeEnd"));
        return element;
    }
    //通知结果
    public WebElement notifyResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.notifyResults"));
        return element;
    }
    //白名单
    public WebElement whitelist() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.whitelist"));
        return element;
    }
    //关停结果
    public WebElement shutdownResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.shutdownResults"));
        return element;
    }
    //描述
    public WebElement description() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.description"));
        return element;
    }
    //违规类型
    public WebElement violationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.violationType"));
        return element;
    }
    //上传RII广告
    public WebElement uploadRIIAds() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAds"));
        return element;
    }
    //上传RII广告-选择类型-RII
    public WebElement uploadRIIAdsSelectTypeRII() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeRII"));
        return element;
    }
    //上传RII广告-选择类型-LARR
    public WebElement uploadRIIAdsSelectTypeLARR() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeLARR"));
        return element;
    }
    //上传RII广告-选择类型-DRR
    public WebElement uploadRIIAdsSelectTypeDRR() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeDRR"));
        return element;
    }
    //上传RII广告-选择类型-DRR-选择文件-上传文件
    public WebElement uploadRIIAdsSelectTypeDRRUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeDRRUploadFiles"));
        return element;
    }
    //上传RII广告-选择类型-DRR-选择文件-下载模板
    public WebElement uploadRIIAdsSelectTypeDRRDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeDRRDownloadTemple"));
        return element;
    }
    //上传RII广告-选择类型-DRR/LARR-入库日期-开始日期
    public WebElement uploadRIIAdsSelectTypeDRRStorageDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeDRRStorageDateStart"));
        return element;
    }
    //上传RII广告-选择类型-DRR/LARR-入库日期-结束日期
    public WebElement uploadRIIAdsSelectTypeDRRStorageDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeDRRStorageDateEnd"));
        return element;
    }
    //上传RII广告-选择类型-DRR/LARR-审核日期-开始日期
    public WebElement uploadRIIAdsSelectTypeDRRReviewDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeDRRReviewDateStart"));
        return element;
    }
    //上传RII广告-选择类型-DRR/LARR-审核日期-结束日期
    public WebElement uploadRIIAdsSelectTypeDRRReviewDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeDRRReviewDateEnd"));
        return element;
    }
    //上传RII广告-选择类型-RII-上传文件
    public WebElement uploadRIIAdsSelectTypeRIIUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeRIIUploadFiles"));
        return element;
    }
    //上传RII广告-选择类型-RII-下载模板
    public WebElement uploadRIIAdsSelectTypeRIIDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeRIIDownloadTemple"));
        return element;
    }
    //上传RII广告-选择类型-RII-输入要上传的Active广告条数
    public WebElement uploadRIIAdsSelectTypeRIINumbersOfAds() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeRIINumbersOfAds"));
        return element;
    }
    //上传RII广告-选择类型-RII-是否异步上传-是
    public WebElement uploadRIIAdsSelectTypeRIIIsAsynchronouslyYes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeRIIIsAsynchronouslyYes"));
        return element;
    }
    //上传RII广告-选择类型-RII-是否异步上传-否
    public WebElement uploadRIIAdsSelectTypeRIIIsAsynchronouslyNo() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeRIIIsAsynchronouslyNo"));
        return element;
    }
    //上传RII广告-选择类型-RII-确定
    public WebElement uploadRIIAdsSelectTypeRIIISubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeRIIISubmit"));
        return element;
    }
    //上传RII广告-选择类型-RII-取消
    public WebElement uploadRIIAdsSelectTypeRIICancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeRIICancel"));
        return element;
    }
    //上传RII广告-选择类型-LARR-上传文件
    public WebElement uploadRIIAdsSelectTypeLARRUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeLARRUploadFiles"));
        return element;
    }
    //上传RII广告-选择类型-LARR-下载模板
    public WebElement uploadRIIAdsSelectTypeLARRDownloadTemples() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadRIIAdsSelectTypeLARRDownloadTemples"));
        return element;
    }
    //发送通知
    public WebElement sendNotification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.sendNotification"));
        return element;
    }
    //发送通知-选择类型-LARR
    public WebElement sendNotificationLARR() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.sendNotificationLARR"));
        return element;
    }
    //发送通知-选择类型-上传文件
    public WebElement sendNotificationUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.sendNotificationUploadFiles"));
        return element;
    }
    //发送通知-确定
    public WebElement sendNotificationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.sendNotificationSubmit"));
        return element;
    }
    //发送通知-取消
    public WebElement sendNotificationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.sendNotificationCancel"));
        return element;
    }
    //上传白名单
    public WebElement uploadWhitelist() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadWhitelist"));
        return element;
    }
    //上传白名单-选择类型-SAP客户
    public WebElement uploadWhitelistSelectTypeSAPCustomer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadWhitelistSelectTypeSAPCustomer"));
        return element;
    }
    //上传白名单-选择类型-CID
    public WebElement uploadWhitelistSelectTypeCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadWhitelistSelectTypeCID"));
        return element;
    }
    //上传白名单-选择类型-上传文件
    public WebElement uploadWhitelistUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadWhitelistUploadFiles"));
        return element;
    }
    //上传白名单-下载SAP客户模板
    public WebElement uploadWhitelistDownloadSAPCustomerTemplate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadWhitelistDownloadSAPCustomerTemplate"));
        return element;
    }
    //上传白名单-下载CID模板
    public WebElement uploadWhitelistDownloadCIDTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadWhitelistDownloadCIDTemple"));
        return element;
    }
    //上传白名单-确定
    public WebElement uploadWhitelistSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadWhitelistSubmit"));
        return element;
    }
    //上传白名单-取消
    public WebElement uploadWhitelistCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.uploadWhitelistCancel"));
        return element;
    }
    //关联广告
    public WebElement relevantAdvertising() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.relevantAdvertising"));
        return element;
    }
    //预览
    public WebElement preview() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.preview"));
        return element;
    }
    //预览-PC模式
    public WebElement previewPCMode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.previewPCMode"));
        return element;
    }
    //预览-Mobile模式
    public WebElement previewMobileMode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.previewMobileMode"));
        return element;
    }
    //预览-关闭
    public WebElement previewClosed() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.previewClosed"));
        return element;
    }
    //复审
    public WebElement review() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.review"));
        return element;
    }
    //复审-审核结果-未通过
    public WebElement reviewNotPass() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewNotPass"));
        return element;
    }
    //复审-审核结果-通过
    public WebElement reviewPass() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewPass"));
        return element;
    }
    //复审-关闭当前广告-是
    public WebElement reviewCloseCurrentAdYes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewCloseCurrentAdYes"));
        return element;
    }
    //复审-关闭当前广告-否
    public WebElement reviewCloseCurrentAdNo() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewCloseCurrentAdNo"));
        return element;
    }
    //复审-关闭创意ID-是
    public WebElement reviewCloseCreativeIDYes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewCloseCreativeIDYes"));
        return element;
    }
    //复审-关闭创意ID-否
    public WebElement reviewCloseCreativeIDNo() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewCloseCreativeIDNo"));
        return element;
    }
    //复审-备注
    public WebElement reviewRemark() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewRemark"));
        return element;
    }
    //复审-确定
    public WebElement reviewSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewSubmit"));
        return element;
    }
    //复审-取消
    public WebElement reviewCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewCancel"));
        return element;
    }
    //搜索
    public WebElement reviewSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewSearch"));
        return element;
    }
    //下载
    public WebElement reviewDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.riiViolationDetails.reviewDownload"));
        return element;
    }
}