package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class CustomerBillObject{
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public CustomerBillObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //SAP客户名称
    public WebElement sapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.SAPCustomerName"));
        return element;
    }
    //客户类别
    public WebElement customerCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.CustomerCategory"));
        return element;
    }
    //所属销售
    public WebElement salesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.SalesName"));
        return element;
    }
    //所属AM
    public WebElement amName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.AMName"));
        return element;
    }
    //月份-开始月份
    public WebElement monthStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.MonthStart"));
        return element;
    }
    //月份-结束月份
    public WebElement monthEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.MonthEnd"));
        return element;
    }
    //是否全部回款
    public WebElement isRefund() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.IsRefund"));
        return element;
    }
    //应回款日-开始日期
    public WebElement paymentDueDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.PaymentDueDateStart"));
        return element;
    }
    //应回款日-结束日期
    public WebElement paymentDueDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.PaymentDueDateEnd"));
        return element;
    }
    //账单状态
    public WebElement billStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.BillStatus"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.Search"));
        return element;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CustomerBill.Download"));
        return element;
    }
}
