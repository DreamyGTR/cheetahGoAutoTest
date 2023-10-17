package cheetahgo.pageobjects.DataReportPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class DetailedReportTwoObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public DetailedReportTwoObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //详细报表-客户名称
    public WebElement dimensionsAndMetrics() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetrics"));
        return element;
    }
    //详细报表-维度和指标-维度-日
    public WebElement dimensionsAndMetricsDay() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsDay"));
        return element;
    }
    //详细报表-维度和指标-维度-客户类型
    public WebElement dimensionsAndMetricsCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsCustomerType"));
        return element;
    }
    //详细报表-维度和指标-维度-客户名称
    public WebElement dimensionsAndMetricsCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsCustomerName"));
        return element;
    }
    //详细报表-维度和指标-维度-广告账户名称
    public WebElement dimensionsAndMetricsAccountName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsAccountName"));
        return element;
    }
    //详细报表-维度和指标-维度-广告系列名称
    public WebElement dimensionsAndMetricsCampaignName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsCampaignName"));
        return element;
    }
    //详细报表-维度和指标-维度-广告组名称
    public WebElement dimensionsAndMetricsAdGroupName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsAdGroupName"));
        return element;
    }
    //详细报表-维度和指标-维度-国家
    public WebElement dimensionsAndMetricsCountry() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsCountry"));
        return element;
    }
    //详细报表-维度和指标-维度-平台&版位&设备
    public WebElement dimensionsAndMetricsPlatform() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsPlatform"));
        return element;
    }
    //详细报表-维度和指标-维度-月
    public WebElement dimensionsAndMetricsMonth() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsMonth"));
        return element;
    }
    //详细报表-维度和指标-维度-客户ID
    public WebElement dimensionsAndMetricsCustomerID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsCustomerID"));
        return element;
    }
    //详细报表-维度和指标-维度-广告账户ID
    public WebElement dimensionsAndMetricsAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsAccountID"));
        return element;
    }
    //详细报表-维度和指标-维度-广告系列ID
    public WebElement dimensionsAndMetricsCampaignID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsCampaignID"));
        return element;
    }
    //详细报表-维度和指标-维度-广告组ID
    public WebElement dimensionsAndMetricsAdGroupID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsAdGroupID"));
        return element;
    }
    //详细报表-维度和指标-维度-性别&年龄
    public WebElement dimensionsAndMetricsSex() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSex"));
        return element;
    }
    //详细报表-维度和指标-指标-花费
    public WebElement dimensionsAndMetricsCost() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsCost"));
        return element;
    }
    //详细报表-维度和指标-指标-点击量
    public WebElement dimensionsAndMetricsClicks() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsClicks"));
        return element;
    }
    //详细报表-维度和指标-指标-覆盖人数
    public WebElement dimensionsAndMetricsNumberOfPeopleCovered() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsNumberOfPeopleCovered"));
        return element;
    }
    //详细报表-维度和指标-指标-移动加入购物车次数
    public WebElement dimensionsAndMetricsMobileAddToCartTimes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsMobileAddToCartTimes"));
        return element;
    }
    //详细报表-维度和指标-指标-移动购物次数
    public WebElement dimensionsAndMetricsNumberOfMobilePurchases() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsNumberOfMobilePurchases"));
        return element;
    }
    //详细报表-维度和指标-指标-移动购物价值（USD）
    public WebElement dimensionsAndMetricsMobileShoppingValue() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsMobileShoppingValue"));
        return element;
    }
    //详细报表-维度和指标-指标-CPM(USD)
    public WebElement dimensionsAndMetricsCPM() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsCPM"));
        return element;
    }
    //详细报表-维度和指标-指标-CTR
    public WebElement dimensionsAndMetricsCTR() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsCTR"));
        return element;
    }
    //详细报表-维度和指标-指标-曝光量
    public WebElement dimensionsAndMetricsImpression() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsImpression"));
        return element;
    }
    //详细报表-维度和指标-指标-链接点击量
    public WebElement dimensionsAndMetricsLinkClicks() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsLinkClicks"));
        return element;
    }
    //详细报表-维度和指标-指标-网站加入购物车次数
    public WebElement dimensionsAndMetricsWebsiteAddedToShoppingCart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsWebsiteAddedToShoppingCart"));
        return element;
    }
    //详细报表-维度和指标-指标-网站购物次数
    public WebElement dimensionsAndMetricsWebsiteShoppingTimes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsWebsiteShoppingTimes"));
        return element;
    }
    //详细报表-维度和指标-指标-网站购物价值（USD）
    public WebElement dimensionsAndMetricsWebsiteShoppingValue() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsWebsiteShoppingValue"));
        return element;
    }
    //详细报表-维度和指标-指标-移动安装量
    public WebElement dimensionsAndMetricsMobileInstalls() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsMobileInstalls"));
        return element;
    }
    //详细报表-维度和指标-指标-CPC(USD)
    public WebElement dimensionsAndMetricsCPC() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsCPC"));
        return element;
    }
    //详细报表-维度和指标-指标-确认
    public WebElement dimensionsAndMetricsSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSubmit"));
        return element;
    }
    //详细报表-维度和指标-指标-取消
    public WebElement dimensionsAndMetricsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsCancel"));
        return element;
    }
    //详细报表-搜索条件
    public WebElement dimensionsAndMetricsSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearch"));
        return element;
    }
    //详细报表-搜索条件-客户名称-等于/不等于
    public WebElement dimensionsAndMetricsSearchCustomerNameEqual() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearchCustomerNameEqual"));
        return element;
    }
    //详细报表-搜索条件-客户名称-选择客户名称
    public WebElement dimensionsAndMetricsSearchSelectCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearchSelectCustomerName"));
        return element;
    }
    //详细报表-搜索条件-账户ID-等于/不等于
    public WebElement dimensionsAndMetricsSearchSelectAccountIDEqual() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearchSelectAccountIDEqual"));
        return element;
    }
    //详细报表-搜索条件-账户ID-输入ID
    public WebElement dimensionsAndMetricsSearchSelectAccountIDEnterID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearchSelectAccountIDEnterID"));
        return element;
    }
    //详细报表-搜索条件-广告系列ID-等于/不等于
    public WebElement dimensionsAndMetricsSearchSelectCampaignIDEqual() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearchSelectCampaignIDEqual"));
        return element;
    }
    //详细报表-搜索条件-广告系列ID-输入ID
    public WebElement dimensionsAndMetricsSearchSelectCampaignIDEnterID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearchSelectCampaignIDEnterID"));
        return element;
    }
    //详细报表-搜索条件-广告组ID-等于/不等于
    public WebElement dimensionsAndMetricsSearchSelectAdGroupIDEqual() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearchSelectAdGroupIDEqual"));
        return element;
    }
    //详细报表-搜索条件-广告组ID-等于/不等于
    public WebElement dimensionsAndMetricsSearchSelectAdGroupIDEqual() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearchSelectAdGroupIDEqual"));
        return element;
    }
    //详细报表-搜索条件-广告组ID-输入ID
    public WebElement dimensionsAndMetricsSearchSelectAdGroupIDEnterID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearchSelectAdGroupIDEnterID"));
        return element;
    }
    //详细报表-搜索条件-确认
    public WebElement dimensionsAndMetricsSearchSelectAdGroupIDSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearchSelectAdGroupIDSubmit"));
        return element;
    }
    //详细报表-搜索条件-取消
    public WebElement dimensionsAndMetricsSearchSelectAdGroupIDCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsSearchSelectAdGroupIDCancel"));
        return element;
    }
    //详细报表-统计周期-开始
    public WebElement dimensionsAndMetricsStatisticalPeriodStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsStatisticalPeriodStart"));
        return element;
    }
    //详细报表-统计周期-结束
    public WebElement dimensionsAndMetricsStatisticalPeriodEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsStatisticalPeriodEnd"));
        return element;
    }
    //详细报表-归因窗口
    public WebElement dimensionsAndMetricsAttributionWindow() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.dimensionsAndMetricsAttributionWindow"));
        return element;
    }
    //详细报表-搜索
    public WebElement Search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.Search"));
        return element;
    }
    //详细报表-下载
    public WebElement Download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReportTwo.Download"));
        return element;
    }
}