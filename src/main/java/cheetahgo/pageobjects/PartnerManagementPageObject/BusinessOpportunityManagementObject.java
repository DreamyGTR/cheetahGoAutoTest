package cheetahgo.pageobjects.PartnerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class BusinessOpportunityManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public BusinessOpportunityManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //客户名称
    public WebElement customerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.customerName"));
        return element;
    }
    //合伙人名称
    public WebElement partnerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.partnerName"));
        return element;
    }
    //合伙人类型
    public WebElement partnerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.partnerType"));
        return element;
    }
    //所属销售
    public WebElement salesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.salesName"));
        return element;
    }
    //来源
    public WebElement source() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.source"));
        return element;
    }
    //商机状态
    public WebElement opportunityStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.opportunityStatus"));
        return element;
    }
    //注册时间-开始
    public WebElement registerTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.registerTimeStart"));
        return element;
    }
    //注册时间-结束
    public WebElement registerTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.registerTimeEnd"));
        return element;
    }
    //更新时间-开始
    public WebElement updateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.updateTimeStart"));
        return element;
    }
    //更新时间-结束
    public WebElement updateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.updateTimeEnd"));
        return element;
    }
    //上传商机
    public WebElement uploadOpportunities() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.uploadOpportunities"));
        return element;
    }
    //上传商机-上传文件
    public WebElement uploadOpportunitiesUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.uploadOpportunitiesUploadFiles"));
        return element;
    }
    //上传商机-下载模板
    public WebElement uploadOpportunitiesDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.uploadOpportunitiesDownloadTemple"));
        return element;
    }
    //上传商机-确定
    public WebElement uploadOpportunitiesSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.uploadOpportunitiesSubmit"));
        return element;
    }
    //上传商机-取消
    public WebElement uploadOpportunitiesCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.uploadOpportunitiesCancel"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.search"));
        return element;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.download"));
        return element;
    }
    //下载操作日志
    public WebElement downloadOperationLog() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.downloadOperationLog"));
        return element;
    }
    //分配
    public WebElement distribute() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.distribute"));
        return element;
    }
    //分配-所属销售
    public WebElement distributeSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.distributeSalesName"));
        return element;
    }
    //分配-确定
    public WebElement distributeSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.distributeSubmit"));
        return element;
    }
    //分配-取消
    public WebElement distributeCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.distributeCancel"));
        return element;
    }
    //无效
    public WebElement invalid() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.invalid"));
        return element;
    }
    //无效-备注
    public WebElement invalidNote() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.invalidNote"));
        return element;
    }
    //无效-确定
    public WebElement invalidSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.invalidSubmit"));
        return element;
    }
    //无效-取消
    public WebElement invalidCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.invalidCancel"));
        return element;
    }
    //编辑客户
    public WebElement editCustomer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.editCustomer"));
        return element;
    }
    //编辑客户-客户名称
    public WebElement editCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.editCustomerName"));
        return element;
    }
    //编辑客户-确定
    public WebElement editCustomerSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.editCustomerSubmit"));
        return element;
    }
    //编辑客户-取消
    public WebElement editCustomerCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.businessOpportunityManagement.editCustomerCancel"));
        return element;
    }
}