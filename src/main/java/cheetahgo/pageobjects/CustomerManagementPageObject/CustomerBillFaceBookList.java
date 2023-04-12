package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

/**
 * 内部运营平台-客户管理-账户列表-FaceBook列表元素封装
 */
public class CustomerBillFaceBookList {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.AccountListPageProperties);
    private WebDriver webDriver;

    public CustomerBillFaceBookList(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //Account ID
    public WebElement accountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //客户类型
    public WebElement customerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //注册时间
    public WebElement registrationTime() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //客户 ID
    public WebElement customerID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //新老客
    public WebElement newOldCustomers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //客户名称
    public WebElement customerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //冻结状态
    public WebElement frozenState() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //开户主体
    public WebElement accountOpeningEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //VB
    public WebElement VB() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //新增账户
    public WebElement addAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //账户导入
    public WebElement accountImport() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //批量冻结
    public WebElement batchFreeze() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //批量修改新老客
    public WebElement batchModifyNewAndOldCustomers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //批量修改客户名称
    public WebElement batchModifyCustomerNames() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //下载
    public WebElement downLoadButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //搜索
    public WebElement searchButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }
    //新增账户

    //账户导入
    //批量冻结
    //批量修改新老客
    //批量修改客户名称
    //下载
    //编辑
}
