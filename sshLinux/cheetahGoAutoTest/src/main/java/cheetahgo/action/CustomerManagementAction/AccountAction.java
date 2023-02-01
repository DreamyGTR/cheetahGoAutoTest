package cheetahgo.action.CustomerManagementAction;

import cheetahgo.pageobjects.CustomerManagementPageObject.AccountListPageObject;
import cheetahgo.pageobjects.CustomerManagementPageObject.CustomerManagementPageObject;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.SeleniumUtil;
import util.WaitUtil;

/**
 * 内部运营平台-客户管理-账户列表页面
 */
@Log4j
public class AccountAction {
    public static void openCustomerManagement(WebDriver webDriver) throws Exception {
        CustomerManagementPageObject customerManagementPageObject = new CustomerManagementPageObject(webDriver);
        AccountListPageObject accountListPageObject = new AccountListPageObject(webDriver);
        customerManagementPageObject.customerManagement().click();
        WaitUtil.sleep(1000);
        accountListPageObject.customerId().sendKeys("10555");
        WaitUtil.sleep(1000);
        accountListPageObject.selectButton().click();
        WaitUtil.sleep(2000);
        Assert.assertTrue(webDriver.getPageSource().contains("10555"));
        accountListPageObject.customerId().clear();
        WaitUtil.sleep(2000);
        accountListPageObject.customerNameSelect().click();
        SeleniumUtil.choiceSelect(webDriver, "ant-select-dropdown-menu-item", "作废-萨提尼尔（香港）有限公司");
        WaitUtil.sleep(1000);
        Assert.assertTrue(webDriver.getPageSource().contains("作废-萨提尼尔（香港）有限公司"));
        WaitUtil.sleep(2000);
        accountListPageObject.selectButton().click();
        SeleniumUtil.actionMoveClickRelease(webDriver,"/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[2]/div/div[2]/div/span/div/div/span/i");
        accountListPageObject.customerTypeSelect().click();
        SeleniumUtil.choiceSelect(webDriver, "ant-select-dropdown-menu-item", "渠道");
        accountListPageObject.selectButton().click();
        WaitUtil.sleep(2000);
        accountListPageObject.customerTypeSelect().click();
        SeleniumUtil.choiceSelect(webDriver, "ant-select-dropdown-menu-item", "全部");
        accountListPageObject.selectButton().click();
        WaitUtil.sleep(3000);

    }
}
