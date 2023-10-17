package cheetahgo.pageobjects.DataReportPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class FBDetailedReportObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public FBDetailedReportObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //详细报表-客户名称
    public WebElement detailReportCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportCustomerName"));
        return element;
    }
    //详细报表-日期-开始
    public WebElement detailReportDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDateStart"));
        return element;
    }
    //详细报表-日期-结束
    public WebElement detailReportDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDateEnd"));
        return element;
    }
    //详细报表-归因窗口
    public WebElement detailReportAttributionWindow() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportAttributionWindow"));
        return element;
    }
    //详细报表-维度
    public WebElement detailReportDimensions() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensions"));
        return element;
    }
    //详细报表-维度-Day
    public WebElement detailReportDimensionsDay() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensionsDay"));
        return element;
    }
    //详细报表-维度-Month
    public WebElement detailReportDimensionsMonth() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensionsMonth"));
        return element;
    }
    //详细报表-维度-Week
    public WebElement detailReportDimensionsWeek() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensionsWeek"));
        return element;
    }
    //详细报表-维度-Campaign ID
    public WebElement detailReportDimensionsCampaignID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensionsCampaignID"));
        return element;
    }
    //详细报表-维度-Campaign Name
    public WebElement detailReportDimensionsCampaignName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensionsCampaignName"));
        return element;
    }
    //详细报表-维度-Country
    public WebElement detailReportDimensionsCountry() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensionsCountry"));
        return element;
    }
    //详细报表-维度-Platform
    public WebElement detailReportDimensionsPlatform() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensionsPlatform"));
        return element;
    }
    //详细报表-维度-Device Platform
    public WebElement detailReportDimensionsDevicePlatform() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensionsDevicePlatform"));
        return element;
    }
    //详细报表-维度-Placement
    public WebElement detailReportDimensionsPlacement() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensionsPlacement"));
        return element;
    }
    //详细报表-维度-确定
    public WebElement detailReportDimensionsSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensionsSubmit"));
        return element;
    }
    //详细报表-维度-取消
    public WebElement detailReportDimensionsCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDimensionsCancel"));
        return element;
    }
    //详细报表-指标
    public WebElement detailReportIndex() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndex"));
        return element;
    }
    //详细报表-指标-Amount Spent
    public WebElement detailReportIndexAmountSpent() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndexAmountSpent"));
        return element;
    }
    //详细报表-指标-Impressions
    public WebElement detailReportIndexImpressions() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndexImpressions"));
        return element;
    }
    //详细报表-指标-Reach
    public WebElement detailReportIndexReach() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndexReach"));
        return element;
    }
    //详细报表-指标-Link Clicks
    public WebElement detailReportIndexLinkClicks() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndexLinkClicks"));
        return element;
    }
    //详细报表-指标-Website Purchases
    public WebElement detailReportIndexWebsitePurchases() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndexWebsitePurchases"));
        return element;
    }
    //详细报表-指标-Mobile App Purchases
    public WebElement detailReportIndexMobileAppPurchases() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndexMobileAppPurchases"));
        return element;
    }
    //详细报表-指标-Website Purchases Conversion
    public WebElement detailReportIndexWebsitePurchasesConversion() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndexWebsitePurchasesConversion"));
        return element;
    }
    //详细报表-指标-Mobile App Purchases Conversion
    public WebElement detailReportIndexMobileAppPurchasesConversion() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndexMobileAppPurchasesConversion"));
        return element;
    }
    //详细报表-指标-Objective
    public WebElement detailReportIndexObjective() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndexObjective"));
        return element;
    }
    //详细报表-指标-取消
    public WebElement detailReportIndexCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndexCancel"));
        return element;
    }
    //详细报表-指标-确定
    public WebElement detailReportIndexSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportIndexSubmit"));
        return element;
    }
    //详细报表-搜索
    public WebElement detailReportSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportSearch"));
        return element;
    }
    //详细报表-下载
    public WebElement detailReportDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.fbDetailedReport.detailReportDownload"));
        return element;
    }

}