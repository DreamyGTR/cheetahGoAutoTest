package cheetahgo.pageobjects.BusinessManagrmentPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class CreativeReviewObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public CreativeReviewObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //审核概览-按CID查看-Account ID
    public WebElement viewByCIDAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDAccountID"));
        return element;
    }
    //审核概览-按CID查看-SAP客户名称
    public WebElement viewByCIDSAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDSAPCustomerName"));
        return element;
    }
    //审核概览-按CID查看-业绩客户类型
    public WebElement viewByCIDPerformanceCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDPerformanceCustomerType"));
        return element;
    }
    //审核概览-按CID查看-所属业绩销售
    public WebElement viewByCIDPerformancePerformanceSales() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDPerformancePerformanceSales"));
        return element;
    }
    //审核概览-按CID查看-所属AM
    public WebElement viewByCIDAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDAMName"));
        return element;
    }
    //审核概览-按CID查看-所属优化师
    public WebElement viewByCIDOptimizerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDOptimizerName"));
        return element;
    }
    //审核概览-按CID查看-开户主体
    public WebElement viewByCIDAccountOpeningEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDAccountOpeningEntity"));
        return element;
    }
    //审核概览-按CID查看-消耗范围-最小值
    public WebElement viewByCIDConsumptionRangeMin() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDConsumptionRangeMin"));
        return element;
    }
    //审核概览-按CID查看-消耗范围-最大值
    public WebElement viewByCIDConsumptionRangeMax() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDConsumptionRangeMax"));
        return element;
    }
    //审核概览-按CID查看-入库日期-开始日期
    public WebElement viewByCIDStorageDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDStorageDateStart"));
        return element;
    }
    //审核概览-按CID查看-入库日期-结束日期
    public WebElement viewByCIDStorageDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDStorageDateEnd"));
        return element;
    }
    //审核概览-按CID查看-搜索
    public WebElement viewByCIDSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDSearch"));
        return element;
    }
    //审核概览-按CID查看-下载
    public WebElement viewByCIDDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByCIDDownload"));
        return element;
    }
    //审核概览-按SAP查看-SAP客户名称
    public WebElement viewBySAPCustomeName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewBySAPCustomerName"));
        return element;
    }
    //审核概览-按SAP查看-客户类型
    public WebElement viewBySAPCustomeType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewBySAPCustomerType"));
        return element;
    }
    //审核概览-按SAP查看-所属业绩销售
    public WebElement viewBySAPPerformanceSales() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewBySAPPerformanceSales"));
        return element;
    }
    //审核概览-按SAP查看-所属AM
    public WebElement viewBySAPAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewBySAPAMName"));
        return element;
    }
    //审核概览-按SAP查看-所属优化师
    public WebElement viewBySAPOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewBySAPOptimizer"));
        return element;
    }
    //审核概览-按SAP查看-消耗范围-最小值
    public WebElement viewBySAPConsumptionRangeMin() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewBySAPConsumptionRangeMin"));
        return element;
    }
    //审核概览-按SAP查看-消耗范围-最大值
    public WebElement viewBySAPConsumptionRangeMax() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewBySAPConsumptionRangeMax"));
        return element;
    }
    //审核概览-按SAP查看-入库日期-开始日期
    public WebElement viewBySAPStorageDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewBySAPStorageDateStart"));
        return element;
    }
    //审核概览-按SAP查看-入库日期-结束日期
    public WebElement viewBySAPStorageDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewBySAPStorageDateEnd"));
        return element;
    }
    //审核概览-按SAP查看-搜索
    public WebElement viewBySAPSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewBySAPSearch"));
        return element;
    }
    //审核概览-按SAP查看-下载
    public WebElement viewBySAPDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewBySAPDownload"));
        return element;
    }
    //审核概览-按新开户主体查看-新开户主体
    public WebElement viewByNewEntityNewEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntityNewEntity"));
        return element;
    }
    //审核概览-按新开户主体查看-Account ID
    public WebElement viewByNewEntityAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntityAccountID"));
        return element;
    }
    //审核概览-按新开户主体查看-客户类型
    public WebElement viewByNewEntityCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntityCustomerType="));
        return element;
    }
    //审核概览-按新开户主体查看-所属业绩销售
    public WebElement viewByNewEntityPerfomanceSales() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntityPerfomanceSales"));
        return element;
    }
    //审核概览-按新开户主体查看-所属AM
    public WebElement viewByNewEntityAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntityAMName"));
        return element;
    }
    //审核概览-按新开户主体查看-所属优化师
    public WebElement viewByNewEntityOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntityOptimizer"));
        return element;
    }
    //审核概览-按新开户主体查看-SAP客户名称
    public WebElement viewByNewEntitySAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntitySAPCustomerName"));
        return element;
    }
    //审核概览-按新开户主体查看-消耗范围-最小值
    public WebElement viewByNewEntityConsumptionRangeMin() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntityConsumptionRangeMin"));
        return element;
    }
    //审核概览-按新开户主体查看-消耗范围-最大值
    public WebElement viewByNewEntityConsumptionRangeMax() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntityConsumptionRangeMax"));
        return element;
    }
    //审核概览-按新开户主体查看-首次创建广告日期-开始日期
    public WebElement viewByNewEntityFirstCreateDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntityFirstCreateDateStart"));
        return element;
    }
    //审核概览-按新开户主体查看-首次创建广告日期-结束日期
    public WebElement viewByNewEntityFirstCreateDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntityFirstCreateDateEnd"));
        return element;
    }
    //审核概览-按新开户主体查看-搜索
    public WebElement viewByNewEntitySearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntitySearch"));
        return element;
    }
    //审核概览-按新开户主体查看-下载
    public WebElement viewByNewEntityDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.viewByNewEntityDownload"));
        return element;
    }
    //待审核-客户类型
    public WebElement pendingReviewCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewCustomerType"));
        return element;
    }
    //待审核-业绩客户类型
    public WebElement pendingReviewPerformanceCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewPerformanceCustomerType"));
        return element;
    }
    //待审核-客户名称
    public WebElement pendingReviewCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewCustomerName"));
        return element;
    }
    //待审核-开户主体
    public WebElement pendingReviewNewEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewNewEntity"));
        return element;
    }
    //待审核-Account ID
    public WebElement pendingReviewAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewAccountID"));
        return element;
    }
    //待审核-广告ID
    public WebElement pendingReviewAdID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewAdID"));
        return element;
    }
    //待审核-创意ID
    public WebElement pendingReviewAdCreativeID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewAdCreativeID"));
        return element;
    }
    //待审核-账户安全
    public WebElement pendingReviewAccountSecurity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewAccountSecurity"));
        return element;
    }
    //待审核-FB风险等级
    public WebElement pendingReviewFBRiskLevel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewFBRiskLevel"));
        return element;
    }
    //待审核-CM风险等级
    public WebElement pendingReviewCMRiskLevel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewCMRiskLevel"));
        return element;
    }
    //待审核-广告状态
    public WebElement pendingReviewADStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewADStatus"));
        return element;
    }
    //待审核-创意状态
    public WebElement pendingReviewADCreativeStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewADCreativeStatus"));
        return element;
    }
    //待审核-敏感词组分类
    public WebElement pendingReviewSensitivePhraseClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewSensitivePhraseClassification"));
        return element;
    }
    //待审核-敏感词组
    public WebElement pendingReviewSensitivePhrase() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewSensitivePhrase"));
        return element;
    }
    //待审核-敏感网址
    public WebElement pendingReviewSensitiveURL() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewSensitiveURL"));
        return element;
    }
    //待审核-账户状态
    public WebElement pendingReviewAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewAccountStatus"));
        return element;
    }
    //待审核-账户余额
    public WebElement pendingReviewAccountBalance() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewAccountBalance"));
        return element;
    }
    //待审核-更新日期-开始日期
    public WebElement pendingReviewUpdatedStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewUpdatedStart"));
        return element;
    }
    //待审核-更新日期-结束日期
    public WebElement pendingReviewUpdatedEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewUpdatedEnd"));
        return element;
    }
    //待审核-全选
    public WebElement pendingReviewSelectAll() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewSelectAll"));
        return element;
    }
    //待审核-反选
    public WebElement pendingReviewCounterElection() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewCounterElection"));
        return element;
    }
    //待审核-挑出提醒
    public WebElement pendingReviewPickReminder() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewPickReminder"));
        return element;
    }
    //待审核-通过审核
    public WebElement pendingReviewApproved() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewApproved"));
        return element;
    }
    //待审核-忽略
    public WebElement pendingReviewNeglect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewNeglect"));
        return element;
    }
    //待审核-取消忽略
    public WebElement pendingReviewCancelNeglect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewCancelNeglect"));
        return element;
    }
    //待审核-外部模式
    public WebElement pendingReviewExternalMode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewExternalMode"));
        return element;
    }
    //待审核-已忽略
    public WebElement pendingReviewIgnored() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewIgnored"));
        return element;
    }
    //待审核-过滤已忽略
    public WebElement pendingReviewFilterIgnored() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewFilterIgnored"));
        return element;
    }
    //待审核-PC模式
    public WebElement pendingReviewPCmode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewPCmode"));
        return element;
    }
    //待审核-搜索
    public WebElement pendingReviewSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.pendingReviewSearch"));
        return element;
    }
    //历史审核-创意-客户类型
    public WebElement historicalReviewCreativeCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.HistoricalReviewCreativeCustomerType"));
        return element;
    }
    //历史审核-创意-客户名称
    public WebElement historicalReviewCreativeCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.HistoricalReviewCreativeCustomerName"));
        return element;
    }
    //历史审核-创意-Account ID
    public WebElement historicalReviewCreativeCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.HistoricalReviewCreativeCustomerName"));
        return element;
    }
    //历史审核-创意-创意ID
    public WebElement historicalReviewCreativeCreativeID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeCreativeID"));
        return element;
    }
    //历史审核-创意-销售
    public WebElement historicalReviewCreativeSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeSalesName"));
        return element;
    }
    //历史审核-创意-审核人
    public WebElement historicalReviewCreativeReviewer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeReviewer"));
        return element;
    }
    //历史审核-创意-审核结果
    public WebElement historicalReviewCreativeAuditResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeAuditResults"));
        return element;
    }
    //历史审核-创意-描述
    public WebElement historicalReviewCreativeDescription() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeDescription"));
        return element;
    }
    //历史审核-创意-开户主体
    public WebElement historicalReviewCreativeEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeEntity"));
        return element;
    }
    //历史审核-创意-消耗范围-最小值
    public WebElement historicalReviewCreativeConsumptionRangeMin() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeConsumptionRangeMin"));
        return element;
    }
    //历史审核-创意-消耗范围-最大值
    public WebElement historicalReviewCreativeConsumptionRangeMax() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeConsumptionRangeMax"));
        return element;
    }
    //历史审核-创意-敏感词组分类
    public WebElement historicalReviewCreativeSensitivePhraseClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeSensitivePhraseClassification"));
        return element;
    }
    //历史审核-创意-敏感网址
    public WebElement historicalReviewCreativeSensitiveURL() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeSensitiveURL"));
        return element;
    }
    //历史审核-创意-入库日期-开始日期
    public WebElement historicalReviewCreativeStorageDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeStorageDateStart"));
        return element;
    }
    //历史审核-创意-入库日期-结束日期
    public WebElement historicalReviewCreativeStorageDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeStorageDateEnd"));
        return element;
    }
    //历史审核-创意-审核日期-开始日期
    public WebElement historicalReviewCreativeReviewDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeReviewDateStart"));
        return element;
    }
    //历史审核-创意-审核日期-结束日期
    public WebElement historicalReviewCreativeReviewDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeReviewDateEnd"));
        return element;
    }
    //历史审核-创意-搜索
    public WebElement historicalReviewCreativeSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeSearch"));
        return element;
    }
    //历史审核-创意-下载
    public WebElement historicalReviewCreativeDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewCreativeDownload"));
        return element;
    }
    //历史审核-广告-客户类型
    public WebElement historicalReviewAdCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdCustomerType"));
        return element;
    }
    //历史审核-广告-客户名称
    public WebElement historicalReviewAdCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdCustomerName"));
        return element;
    }
    //历史审核-广告-Account ID
    public WebElement historicalReviewAdAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdAccountID"));
        return element;
    }
    //历史审核-广告-创意ID
    public WebElement historicalReviewAdCreativeID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdCreativeID"));
        return element;
    }
    //历史审核-广告-广告ID
    public WebElement historicalReviewAdID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdID"));
        return element;
    }
    //历史审核-广告-广告状态
    public WebElement historicalReviewAdStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdStatus"));
        return element;
    }
    //历史审核-广告-销售
    public WebElement historicalReviewAdSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdSalesName"));
        return element;
    }
    //历史审核-广告-审核人
    public WebElement historicalReviewAdReviewer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdReviewer"));
        return element;
    }
    //历史审核-广告-审核结果
    public WebElement historicalReviewAdAuditResults() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdAuditResults"));
        return element;
    }
    //历史审核-广告-描述
    public WebElement historicalReviewAdDescription() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdDescription"));
        return element;
    }
    //历史审核-广告-开户主体
    public WebElement historicalReviewAdEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdEntity"));
        return element;
    }
    //历史审核-广告-审核日期-开始日期
    public WebElement historicalReviewAdReviewDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdReviewDateStart"));
        return element;
    }
    //历史审核-广告-审核日期-结束日期
    public WebElement historicalReviewAdReviewDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdReviewDateEnd"));
        return element;
    }
    //历史审核-广告-搜索
    public WebElement historicalReviewAdDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.creativeReview.historicalReviewAdDownload"));
        return element;
    }
}