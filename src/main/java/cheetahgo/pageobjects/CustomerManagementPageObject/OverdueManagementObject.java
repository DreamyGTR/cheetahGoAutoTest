package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class OverdueManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public OverdueManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //SAP客户名称
    public WebElement sapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.OverdueManagement.SAPCustomerName"));
        return element;
    }
    //账单月份
    public WebElement billMonth() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.OverdueManagement.BillMonth"));
        return element;
    }
    //账单月份-选择8月
    public WebElement BillMonthAugust() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.OverdueManagement.BillMonthAugust"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.OverdueManagement.Search"));
        return element;
    }
}
