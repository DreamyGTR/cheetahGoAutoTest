package cheetahgo.pageobjects.AccountManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class VirtualTransferBillObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public VirtualTransferBillObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //From-CID
    public WebElement fromCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.virtualTransferBill.fromCID"));
        return element;
    }
    //From-CID状态
    public WebElement fromCIDStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.virtualTransferBill.fromCIDStatus"));
        return element;
    }
    //From-CID客户名称
    public WebElement fromCIDCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.virtualTransferBill.fromCIDCustomerName"));
        return element;
    }
    //To-CID
    public WebElement toCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.virtualTransferBill.toCID"));
        return element;
    }
    //To-CID客户名称
    public WebElement toCIDCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.virtualTransferBill.toCIDCustomerName"));
        return element;
    }
    //转账日期-开始
    public WebElement transferDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.virtualTransferBill.transferDateStart"));
        return element;
    }
    //转账日期-结束
    public WebElement transferDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.virtualTransferBill.transferDateEnd"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.virtualTransferBill.search"));
        return element;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.virtualTransferBill.download"));
        return element;
    }
}