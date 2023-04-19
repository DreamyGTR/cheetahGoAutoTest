package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

/**
 * 内部运营平台-客户管理页面元素封装
 */
public class CustomerManagementPageObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CustomerManagementPageProperties);
    private WebDriver webDriver;

    public CustomerManagementPageObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //客户管理一级菜单
    public WebElement customerManagement() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement"));
        return element;
    }

    //客户列表二级菜单
    public WebElement customerList() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList"));
        return element;
    }

    //账户列表二级菜单
    public WebElement accountList() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountList"));
        return element;
    }

    //账户列表-账户列表-FaceBook列表
    public WebElement customerBillFaceBookList() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBookList"));
        return element;
    }

    //账户列表-账户列表-TikTok列表
    public WebElement customerBillTikTokList() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillTikTokList"));
        return element;
    }

    //合作管理二级菜单
    public WebElement cooperativeManagement() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.cooperativeManagement"));
        return element;
    }

    //客户账单二级菜单
    public WebElement customerBill() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBill"));
        return element;
    }

    //账户账单二级菜单
    public WebElement accountStatement() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountStatement"));
        return element;
    }

    //到款管理二级菜单
    public WebElement collectionManagement() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.collectionManagement"));
        return element;
    }

    //借款管理二级菜单
    public WebElement loanManagement() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.loanManagement"));
        return element;
    }

    //超期管理二级菜单
    public WebElement overdueManagement() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.overdueManagement"));
        return element;
    }

    //返点管理二级菜单
    public WebElement rebateManagement() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.rebateManagement"));
        return element;
    }

    //应收和额度统计二级菜单
    public WebElement accountsReceivableAndQuotaStatistics() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountsReceivableAndQuotaStatistics"));
        return element;
    }
}
