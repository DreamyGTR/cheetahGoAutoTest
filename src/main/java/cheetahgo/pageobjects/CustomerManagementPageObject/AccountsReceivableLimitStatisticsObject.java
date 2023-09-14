package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class AccountsReceivableLimitStatisticsObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.AccountsReceivableLimitStatistics);
    private WebDriver webDriver;

    public AccountsReceivableLimitStatisticsObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //SAP客户名称
    public WebElement sapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.SAPCustomerName"));
        return element;
    }

    //所属销售
    public WebElement salesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.SalesName"));
        return element;
    }

    //所属AM
    public WebElement amName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.AMName"));
        return element;
    }

    //客户类别
    public WebElement customerCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.CustomerCategory"));
        return element;
    }

    //额度使用比例
    public WebElement quotaUsageRatio() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.QuotaUsageRatio"));
        return element;
    }

    //是否超期
    public WebElement isOverdue() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.IsOverdue"));
        return element;
    }

    //自动停消耗
    public WebElement automaticStopConsumption() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.AutomaticStopConsumption"));
        return element;
    }

    //新增记录
    public WebElement addRecord() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.AddRecord"));
        return element;
    }

    //批量导入
    public WebElement batchImport() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.BatchImport"));
        return element;
    }

    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.Download"));
        return element;
    }

    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.Search"));
        return element;
    }

    //编辑
    public WebElement edit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.Edit"));
        return element;
    }

    //重新计算应收
    public WebElement recalculateReceive() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.AccountsReceivableLimitStatistics.properties.RecalculateReceive"));
        return element;
    }
}
