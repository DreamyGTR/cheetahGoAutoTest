package cheetahgo.pageobjects.DataReportPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class FBBalanceReportObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public FBBalanceReportObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //FB账户余额-客户名称
    public WebElement fbAccountBalanceCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.fbAccountBalanceCustomerName"));
        return element;
    }
    //FB账户余额-Account ID
    public WebElement fbAccountBalanceAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.fbAccountBalanceAccountID"));
        return element;
    }
    //FB账户余额-客户类型
    public WebElement fbAccountBalanceCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.fbAccountBalanceCustomerType"));
        return element;
    }
    //FB账户余额-所属销售
    public WebElement fbAccountBalanceSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.fbAccountBalanceSalesName"));
        return element;
    }
    //FB账户余额-所属AM
    public WebElement fbAccountBalanceAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.fbAccountBalanceAMName"));
        return element;
    }
    //FB账户余额-所属优化师
    public WebElement fbAccountBalanceOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.fbAccountBalanceOptimizer"));
        return element;
    }
    //FB账户余额-开户主体
    public WebElement fbAccountBalanceEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.fbAccountBalanceEntity"));
        return element;
    }
    //FB账户余额-搜索
    public WebElement fbAccountBalanceSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.fbAccountBalanceSearch"));
        return element;
    }
    //FB账户余额-下载
    public WebElement fbAccountBalanceDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.fbAccountBalanceDownload"));
        return element;
    }
    //客户余额-客户名称
    public WebElement customerBalanceCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.customerBalanceCustomerName"));
        return element;
    }
    //客户余额-客户类型
    public WebElement customerBalanceCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.customerBalanceCustomerType"));
        return element;
    }
    //客户余额-所属销售
    public WebElement customerBalanceSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.customerBalanceSalesName"));
        return element;
    }
    //客户余额-所属AM
    public WebElement customerBalanceAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.customerBalanceAMName"));
        return element;
    }
    //客户余额-所属优化师
    public WebElement customerBalanceOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.customerBalanceOptimizer"));
        return element;
    }
    //客户余额-搜索
    public WebElement customerBalanceSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.fbBalanceReport.customerBalanceSearch"));
        return element;
    }
}