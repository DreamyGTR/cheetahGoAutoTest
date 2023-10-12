package cheetahgo.pageobjects.BusinessManagrmentPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class TikTokAdReviewObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public TikTokAdReviewObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //审核概览-按CID查看-Account ID
    public WebElement overviewByCIDAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDAccountID"));
        return element;
    }
    //审核概览-按CID查看-BC ID
    public WebElement overviewByCIDBCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDBCID"));
        return element;
    }
    //审核概览-按CID查看-BC名称
    public WebElement overviewByCIDBCName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDBCName"));
        return element;
    }
    //审核概览-按CID查看-客户名称
    public WebElement overviewByCIDCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDCustomerName"));
        return element;
    }
    //审核概览-按CID查看-客户类型
    public WebElement overviewByCIDCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDCustomerType"));
        return element;
    }
    //审核概览-按CID查看-开户主体
    public WebElement overviewByCIDEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDEntity"));
        return element;
    }
    //审核概览-按CID查看-所属优化
    public WebElement overviewByCIDOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDOptimizer"));
        return element;
    }
    //审核概览-按CID查看-所属销售
    public WebElement overviewByCIDSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDSalesName"));
        return element;
    }
    //审核概览-按CID查看-所属AM
    public WebElement overviewByCIDAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDAMName"));
        return element;
    }
    //审核概览-按CID查看-入库时间-开始
    public WebElement overviewByCIDStorageTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDStorageTimeStart"));
        return element;
    }
    //审核概览-按CID查看-入库时间-结束
    public WebElement overviewByCIDStorageTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDStorageTimeEnd"));
        return element;
    }
    //审核概览-按CID查看-搜索
    public WebElement overviewByCIDSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDSearch"));
        return element;
    }
    //审核概览-按CID查看-下载
    public WebElement overviewByCIDDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDDownload"));
        return element;
    }
    //审核概览-按CID查看-重置
    public WebElement overviewByCIDReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByCIDReset"));
        return element;
    }
    //审核概览-按SAP查看-SAP客户名称
    public WebElement overviewBySAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewBySAPCustomerName"));
        return element;
    }
    //审核概览-按SAP查看-客户类型
    public WebElement overviewBySAPCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewBySAPCustomerType"));
        return element;
    }
    //审核概览-按SAP查看-所属优化
    public WebElement overviewBySAPOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewBySAPOptimizer"));
        return element;
    }
    //审核概览-按SAP查看-所属销售
    public WebElement overviewBySAPSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewBySAPSalesName"));
        return element;
    }
    //审核概览-按SAP查看-所属AM
    public WebElement overviewBySAPAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewBySAPAMName"));
        return element;
    }
    //审核概览-按SAP查看-入库时间-开始
    public WebElement overviewBySAPAStorageTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewBySAPAStorageTimeStart"));
        return element;
    }
    //审核概览-按SAP查看-入库时间-结束
    public WebElement overviewBySAPAStorageTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewBySAPAStorageTimeEnd"));
        return element;
    }
    //审核概览-按SAP查看-搜索
    public WebElement overviewBySAPASearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewBySAPASearch"));
        return element;
    }
    //审核概览-按SAP查看-下载
    public WebElement overviewBySAPADownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewBySAPADownload"));
        return element;
    }
    //审核概览-按SAP查看-重置
    public WebElement overviewBySAPAReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewBySAPAReset"));
        return element;
    }
    //审核概览-按新开户主体查看-新开户主体
    public WebElement overviewByEntityNew() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntityNew"));
        return element;
    }
    //审核概览-按新开户主体查看-Account ID
    public WebElement overviewByEntityAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntityAccountID"));
        return element;
    }
    //审核概览-按新开户主体查看-BC ID
    public WebElement overviewByEntityBCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntityBCID"));
        return element;
    }
    //审核概览-按新开户主体查看-客户名称
    public WebElement overviewByEntityCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntityCustomerName"));
        return element;
    }
    //审核概览-按新开户主体查看-客户类型
    public WebElement overviewByEntityCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntityCustomerType"));
        return element;
    }
    //审核概览-按新开户主体查看-所属优化
    public WebElement overviewByEntityOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntityOptimizer"));
        return element;
    }
    //审核概览-按新开户主体查看-所属销售
    public WebElement overviewByEntitySalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntitySalesName"));
        return element;
    }
    //审核概览-按新开户主体查看-所属AM
    public WebElement overviewByEntityAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntityAMName"));
        return element;
    }
    //审核概览-按新开户主体查看-首次创建广告时间-开始
    public WebElement overviewByEntityFirstCreateAdTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntityFirstCreateAdTimeStart"));
        return element;
    }
    //审核概览-按新开户主体查看-首次创建广告时间-结束
    public WebElement overviewByEntityFirstCreateAdTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntityFirstCreateAdTimeEnd"));
        return element;
    }
    //审核概览-按新开户主体查看-搜索
    public WebElement overviewByEntitySearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntitySearch"));
        return element;
    }
    //审核概览-按新开户主体查看-下载
    public WebElement overviewByEntityDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntityDownload"));
        return element;
    }
    //审核概览-按新开户主体查看-重置
    public WebElement overviewByEntityReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.overviewByEntityReset"));
        return element;
    }
    //待审核-客户名称
    public WebElement pendingReviewCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewCustomerName"));
        return element;
    }
    //待审核-客户类型
    public WebElement pendingReviewCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewCustomerType"));
        return element;
    }
    //待审核-开户主体
    public WebElement pendingReviewEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewEntity"));
        return element;
    }
    //待审核-BC ID
    public WebElement pendingReviewBCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewBCID"));
        return element;
    }
    //待审核-Account ID
    public WebElement pendingReviewAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewAccountID"));
        return element;
    }
    //待审核-广告组ID
    public WebElement pendingReviewAdGroupID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewAdGroupID"));
        return element;
    }
    //待审核-广告ID
    public WebElement pendingReviewAdID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewAdID"));
        return element;
    }
    //待审核-广告操作状态
    public WebElement pendingReviewAdOperationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewAdOperationStatus"));
        return element;
    }
    //待审核-账户状态
    public WebElement pendingReviewAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewAccountStatus"));
        return element;
    }
    //待审核-TT审核建议
    public WebElement pendingReviewTTReviewSuggestions() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewTTReviewSuggestions"));
        return element;
    }
    //待审核-敏感词组分类
    public WebElement pendingReviewSensitivePhraseClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewSensitivePhraseClassification"));
        return element;
    }
    //待审核-敏感词组
    public WebElement pendingReviewSensitivePhrase() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewSensitivePhrase"));
        return element;
    }
    //待审核-敏感网址
    public WebElement pendingReviewSensitiveURL() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewSensitiveURL"));
        return element;
    }
    //待审核-更新日期-开始
    public WebElement pendingReviewUpdatedStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewUpdatedStart"));
        return element;
    }
    //待审核-更新日期-结束
    public WebElement pendingReviewUpdatedEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewUpdatedEnd"));
        return element;
    }
    //待审核-全选框
    public WebElement pendingReviewSelectAllBox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewSelectAllBox"));
        return element;
    }
    //待审核-反选框
    public WebElement pendingReviewInverseCheckBox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewInverseCheckBox"));
        return element;
    }
    //待审核-审核广告勾选框
    public WebElement pendingReviewCheckBox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewCheckBox"));
        return element;
    }
    //待审核-批量挑出提醒
    public WebElement pendingReviewPickReminder() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewPickReminder"));
        return element;
    }
    //待审核-批量通过审核
    public WebElement pendingReviewApproved() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewApproved"));
        return element;
    }
    //待审核-批量忽略
    public WebElement pendingReviewNeglect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewNeglect"));
        return element;
    }
    //待审核-批量取消忽略
    public WebElement pendingReviewCancelNeglect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewCancelNeglect"));
        return element;
    }
    //待审核-过滤已忽略
    public WebElement pendingReviewFilterIgnored() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewFilterIgnored"));
        return element;
    }
    //待审核-已忽略
    public WebElement pendingReviewIgnored() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewIgnored"));
        return element;
    }
    //待审核-搜索
    public WebElement pendingReviewSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewSearch"));
        return element;
    }
    //待审核-单个挑出提醒
    public WebElement pendingReviewSinglePickReminder() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewSinglePickReminder"));
        return element;
    }
    //待审核-单个通过审核
    public WebElement pendingReviewSingleApproved() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewSingleApproved"));
        return element;
    }
    //待审核-查看翻译
    public WebElement pendingReviewViewTranslation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewViewTranslation"));
        return element;
    }
    //待审核-单个忽略
    public WebElement pendingReviewViewSingleIgnored() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.pendingReviewViewSingleIgnored"));
        return element;
    }
    //历史审核-BC ID
    public WebElement historicalReviewBCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewBCID"));
        return element;
    }
    //历史审核-BC名称
    public WebElement historicalReviewBCName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewBCName"));
        return element;
    }
    //历史审核-Account ID
    public WebElement historicalReviewAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewAccountID"));
        return element;
    }
    //历史审核-广告组ID
    public WebElement historicalReviewAdGroupID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewAdGroupID"));
        return element;
    }
    //历史审核-广告ID
    public WebElement historicalReviewAdID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewAdID"));
        return element;
    }
    //历史审核-客户名称
    public WebElement historicalReviewCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewCustomerName"));
        return element;
    }
    //历史审核-客户类型
    public WebElement historicalReviewCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewCustomerType"));
        return element;
    }
    //历史审核-开户主体
    public WebElement historicalReviewEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewEntity"));
        return element;
    }
    //历史审核-所属优化
    public WebElement historicalReviewOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewOptimizer"));
        return element;
    }
    //历史审核-所属销售
    public WebElement historicalReviewSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewSalesName"));
        return element;
    }
    //历史审核-所属AM
    public WebElement historicalReviewAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewAMName"));
        return element;
    }
    //历史审核-审核人
    public WebElement historicalReviewReviewer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewReviewer"));
        return element;
    }
    //历史审核-审核结果
    public WebElement historicalReviewReviewResult() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewReviewResult"));
        return element;
    }
    //历史审核-敏感词组分类
    public WebElement historicalReviewSensitivePhraseClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewSensitivePhraseClassification"));
        return element;
    }
    //历史审核-敏感网址
    public WebElement historicalReviewSensitiveURL() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewSensitiveURL"));
        return element;
    }
    //历史审核-违规级别
    public WebElement historicalReviewViolationLevel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewViolationLevel"));
        return element;
    }
    //历史审核-入库日期-开始
    public WebElement historicalReviewStorageDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewStorageDateStart"));
        return element;
    }
    //历史审核-入库日期-结束
    public WebElement historicalReviewStorageDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewStorageDateEnd"));
        return element;
    }
    //历史审核-审核日期-开始
    public WebElement historicalReviewReviewDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewReviewDateStart"));
        return element;
    }
    //历史审核-审核日期-结束
    public WebElement historicalReviewReviewDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewReviewDateEnd"));
        return element;
    }
    //历史审核-列表勾选框
    public WebElement historicalReviewCheckbox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewCheckbox"));
        return element;
    }
    //历史审核-批量操作
    public WebElement historicalReviewBatchOperations() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewBatchOperations"));
        return element;
    }
    //历史审核-搜索
    public WebElement historicalReviewSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewSearch"));
        return element;
    }
    //历史审核-下载
    public WebElement historicalReviewDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewDownload"));
        return element;
    }
    //历史审核-重置
    public WebElement historicalReviewReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewReset"));
        return element;
    }
    //历史审核-预览
    public WebElement historicalReviewPreview() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.tikTokAdReview.historicalReviewPreview"));
        return element;
    }
}