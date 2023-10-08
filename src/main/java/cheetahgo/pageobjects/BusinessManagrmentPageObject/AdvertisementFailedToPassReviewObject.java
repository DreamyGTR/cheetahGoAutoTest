package cheetahgo.pageobjects.BusinessManagrmentPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class AdvertisementFailedToPassReviewObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public AdvertisementFailedToPassReviewObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //审核未通过广告-Account ID
    public WebElement reviewFailedAdAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdAccountID"));
        return element;
    }
    //审核未通过广告-是否白名单
    public WebElement reviewFailedAdIsWhitelist() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdIsWhitelist"));
        return element;
    }
    //审核未通过广告-SAP客户名称
    public WebElement reviewFailedAdSAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdSAPCustomerName"));
        return element;
    }
    //审核未通过广告-开户主体
    public WebElement reviewFailedAdEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdEntity"));
        return element;
    }
    //审核未通过广告-客户类型
    public WebElement reviewFailedAdCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdCustomerType"));
        return element;
    }
    //审核未通过广告-所属销售
    public WebElement reviewFailedAdSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdSalesName"));
        return element;
    }
    //审核未通过广告-所属优化师
    public WebElement reviewFailedAdOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdOptimizer"));
        return element;
    }
    //审核未通过广告-审核人
    public WebElement reviewFailedAdReviewer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdReviewer"));
        return element;
    }
    //审核未通过广告-广告ID
    public WebElement reviewFailedAdID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdID"));
        return element;
    }
    //审核未通过广告-创意ID
    public WebElement reviewFailedAdCreativeID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdCreativeID"));
        return element;
    }
    //审核未通过广告-未通过原因
    public WebElement reviewFailedAdReasonForFailure() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdReasonForFailure"));
        return element;
    }
    //审核未通过广告-审核日期-开始日期
    public WebElement reviewFailedAdReviewDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdReviewDateStart"));
        return element;
    }
    //审核未通过广告-审核日期-结束日期
    public WebElement reviewFailedAdReviewDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdReviewDateEnd"));
        return element;
    }
    //审核未通过广告-搜索
    public WebElement reviewFailedAdSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.reviewFailedAdSearch"));
        return element;
    }
    //过滤名单-Account ID
    public WebElement filterListAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListAccountID"));
        return element;
    }
    //过滤名单-SAP客户名称
    public WebElement filterListSAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListSAPCustomerName"));
        return element;
    }
    //过滤名单-所属优化师
    public WebElement filterListOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListOptimizer"));
        return element;
    }
    //过滤名单-添加白名单
    public WebElement filterListAddWhitelist() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListAddWhitelist"));
        return element;
    }
    //过滤名单-添加白名单-选择SAP客户
    public WebElement filterListAddWhitelistSelectSAPCustomer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListAddWhitelistSelectSAPCustomer"));
        return element;
    }
    //过滤名单-添加白名单-选择全部CID
    public WebElement filterListAddWhitelistSelectAllCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListAddWhitelistSelectAllCID"));
        return element;
    }
    //过滤名单-添加白名单-完成
    public WebElement filterListAddWhitelistSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListAddWhitelistSubmit"));
        return element;
    }
    //过滤名单-批量编辑白名单
    public WebElement filterListBatchEditWhitelist() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListBatchEditWhitelist"));
        return element;
    }
    //过滤名单-批量移除
    public WebElement filterListBatchEditWhitelistBatchRemoval() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListBatchEditWhitelistBatchRemoval"));
        return element;
    }
    //过滤名单-批量编辑白名单-选择文件-批量上传
    public WebElement filterListBatchEditWhitelistBulkUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListBatchEditWhitelistBulkUpload"));
        return element;
    }
    //过滤名单-批量编辑白名单-选择文件-下载模板
    public WebElement filterListBatchEditWhitelistDownloadTemplate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListBatchEditWhitelistDownloadTemplate"));
        return element;
    }
    //过滤名单-批量编辑白名单-选择文件-取消
    public WebElement filterListBatchEditWhitelistCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListBatchEditWhitelistCancel"));
        return element;
    }
    //过滤名单-搜索
    public WebElement filterListSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListSearch"));
        return element;
    }
    //过滤名单-移除
    public WebElement filterListRemoval() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListRemoval"));
        return element;
    }
    //过滤名单-勾选框
    public WebElement filterListCheckBox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.filterListCheckBox"));
        return element;
    }
    //操作记录-Account ID
    public WebElement operationRecordAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.operationRecordAccountID"));
        return element;
    }
    //操作记录-SAP客户名称
    public WebElement operationRecordSAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.operationRecordSAPCustomerName"));
        return element;
    }
    //操作记录-所属优化师
    public WebElement operationRecordOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.operationRecordOptimizer"));
        return element;
    }
    //操作记录-操作人
    public WebElement operationRecordOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.operationRecordOperator"));
        return element;
    }
    //操作记录-操作类型
    public WebElement operationRecordOperateType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.operationRecordOperateType"));
        return element;
    }
    //操作记录-操作时间-开始时间
    public WebElement operationRecordOperateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.operationRecordOperateTimeStart"));
        return element;
    }
    //操作记录-操作时间-结束时间
    public WebElement operationRecordOperateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.operationRecordOperateTimeEnd"));
        return element;
    }
    //操作记录-搜索
    public WebElement operationRecordSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.advertisementFailedToPassReview.operationRecordSearch"));
        return element;
    }
}