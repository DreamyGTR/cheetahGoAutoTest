package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class CooperativeManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public CooperativeManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //联合搜索
    public WebElement FederatedSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.FederatedSearch"));
        return element;
    }

    //SAP客户名称
    public WebElement SAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.SAPCustomerName"));
        return element;
    }

    //所属销售
    public WebElement Sales() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.Sales"));
        return element;
    }

    //所属AM
    public WebElement AM() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.AM"));
        return element;
    }

    //所属优化师
    public WebElement Optimist() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.Optimist"));
        return element;
    }

    //客户类别
    public WebElement CustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.CustomerType"));
        return element;
    }

    //合作开始时间
    public WebElement CooperationStartTime() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.CooperationStartTime"));
        return element;
    }

    //新增合作记录
    public WebElement AddCollaborationRecord() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.AddCollaborationRecord"));
        return element;
    }

    //批量导入
    public WebElement BatchImport() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.BatchImport"));
        return element;
    }

    //搜索
    public WebElement Search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.Search"));
        return element;
    }

    //下载操作日志
    public WebElement DownloadOperationLog() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.DownloadOperationLog"));
        return element;
    }

    //下载
    public WebElement Download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.Download"));
        return element;
    }

    //编辑合作记录
    public WebElement EditCollaborationRecord() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.EditCollaborationRecord"));
        return element;
    }
}
