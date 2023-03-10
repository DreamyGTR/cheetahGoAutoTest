package cheetahgo.action.CustomerManagementAction;

import cheetahgo.pageobjects.CustomerManagementPageObject.CustomerManagementPageObject;
import org.openqa.selenium.WebDriver;
import util.WaitUtil;

/**
 * 内部运营平台-客户管理页面
 */
public class CustomerManagementAction {
    public static void openCustomerManagement(WebDriver webDriver) throws Exception {
        CustomerManagementPageObject customerManagementPageObject=new CustomerManagementPageObject(webDriver);
        customerManagementPageObject.customerManagement().click();
        customerManagementPageObject.customerList().click();
        customerManagementPageObject.customerBill().click();
        customerManagementPageObject.collectionManagement().click();
        WaitUtil.sleep(5000);
    }
}
