package cheetahgo.pageobjects.WorkOrderSystemPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class OpeningAccountJobOrderOverviewObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public OpeningAccountJobOrderOverviewObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //Facebook-客户名称
    public WebElement facebookCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookCustomerName"));
        return element;
    }
    //Facebook-客户类型
    public WebElement facebookCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookCustomerType"));
        return element;
    }
    //Facebook-所属销售
    public WebElement facebookSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookSalesName"));
        return element;
    }
    //Facebook-所属AM
    public WebElement facebookAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookAMName"));
        return element;
    }
    //Facebook-工单ID
    public WebElement facebookJobOrderID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookJobOrderID"));
        return element;
    }
    //Facebook-工单状态
    public WebElement facebookJobOrderType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookJobOrderType"));
        return element;
    }
    //Facebook-开户类型
    public WebElement facebookOpeningAccountType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookOpeningAccountType"));
        return element;
    }
    //Facebook-Request ID
    public WebElement facebookRequestID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookRequestID"));
        return element;
    }
    //Facebook-账户ID
    public WebElement facebookAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookAccountID"));
        return element;
    }
    //Facebook-当前节点
    public WebElement facebookCurrentNode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookCurrentNode"));
        return element;
    }
    //Facebook-OE参考编号
    public WebElement facebookOETokenID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookOETokenID"));
        return element;
    }
    //Facebook-营业执照名称
    public WebElement facebookBusinessLicenseName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookBusinessLicenseName"));
        return element;
    }
    //Facebook-加急
    public WebElement facebookUrgent() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookUrgent"));
        return element;
    }
    //Facebook-系统更新
    public WebElement facebookSystemUpdate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookSystemUpdate"));
        return element;
    }
    //Facebook-分配开户
    public WebElement facebookAttributeOpeningAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookAttributeOpeningAccount"));
        return element;
    }
    //Facebook-申请时间-开始
    public WebElement facebookApplicationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookApplicationTimeStart"));
        return element;
    }
    //Facebook-申请时间-结束
    public WebElement facebookApplicationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookApplicationTimeEnd"));
        return element;
    }
    //Facebook-搜索
    public WebElement facebookSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookSearch"));
        return element;
    }
    //Facebook-下载
    public WebElement facebookDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookDownload"));
        return element;
    }
    //Facebook-重置
    public WebElement facebookReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookReset"));
        return element;
    }
    //Facebook-详情
    public WebElement facebookDetail() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.facebookDetail"));
        return element;
    }
    //TikTok-客户名称
    public WebElement tikTokCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokCustomerName"));
        return element;
    }
    //TikTok-客户类型
    public WebElement tikTokCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokCustomerType"));
        return element;
    }
    //TikTok-所属销售
    public WebElement tikTokSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokSalesName"));
        return element;
    }
    //TikTok-所属AM
    public WebElement tikTokAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokAMName"));
        return element;
    }
    //TikTok-工单ID
    public WebElement tikTokJobOrderID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokJobOrderID"));
        return element;
    }
    //TikTok-工单状态
    public WebElement tikTokJobOrderStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokJobOrderStatus"));
        return element;
    }
    //TikTok-行业
    public WebElement tikTokIndustry() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokIndustry"));
        return element;
    }
    //TikTok-账户ID
    public WebElement tikTokAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokAccountID"));
        return element;
    }
    //TikTok-当前节点
    public WebElement tikTokCurrentNode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokCurrentNode"));
        return element;
    }
    //TikTok-营业执照名称
    public WebElement tikTokBusinessLicenseName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokBusinessLicenseName"));
        return element;
    }
    //TikTok-加急
    public WebElement tikTokUrgent() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokUrgent"));
        return element;
    }
    //TikTok-申请时间-开始
    public WebElement tikTokApplicationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokApplicationTimeStart"));
        return element;
    }
    //TikTok-申请时间-结束
    public WebElement tikTokApplicationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokApplicationTimeEnd"));
        return element;
    }
    //TikTok-搜索
    public WebElement tikTokSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokSearch"));
        return element;
    }
    //TikTok-下载开户信息
    public WebElement tikTokDownloadAccountOpeningInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokDownloadAccountOpeningInformation"));
        return element;
    }
    //TikTok-下载
    public WebElement tikTokDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokDownload"));
        return element;
    }
    //TikTok-重置
    public WebElement tikTokReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokReset"));
        return element;
    }
    //TikTok-详情
    public WebElement tikTokDetail() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.openingAccountJobOrderOverview.tikTokDetail"));
        return element;
    }
}