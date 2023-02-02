package cheetahgo.action.CustomerManagementAction;

import cheetahgo.pageobjects.CustomerManagementPageObject.AccountListPageObject;
import cheetahgo.pageobjects.CustomerManagementPageObject.CustomerManagementPageObject;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.LogUtil;
import util.SeleniumUtil;
import util.WaitUtil;

/**
 * 内部运营平台-客户管理-账户列表页面
 */
@Log4j
public class AccountAction {
    public static void CustomerManagementSelectAction(WebDriver webDriver) throws Exception {
        CustomerManagementPageObject customerManagementPageObject = new CustomerManagementPageObject(webDriver);
        AccountListPageObject accountListPageObject = new AccountListPageObject(webDriver);
        customerManagementPageObject.customerManagement().click();
        LogUtil.info("=============================自动化测试开始===========================");
        WaitUtil.sleep(1000);
        accountListPageObject.customerId().sendKeys("10555");
        LogUtil.info("客户ID文本框输入10555");
        WaitUtil.sleep(1000);
        accountListPageObject.selectButton().click();
        LogUtil.info("点击搜索按钮");
        Assert.assertTrue(webDriver.getPageSource().contains("10555"));
        accountListPageObject.customerId().clear();
        LogUtil.info("清除输入文本框");
        WaitUtil.sleep(2000);
        LogUtil.info("单击客户名称下拉框");
        SeleniumUtil.choiceSelect(accountListPageObject.customerNameSelect(), webDriver, "ant-select-dropdown-menu-item", "作废-萨提尼尔（香港）有限公司");
        LogUtil.info("下拉框选择:作废-萨提尼尔（香港）有限公司");
        WaitUtil.sleep(1000);
        Assert.assertTrue(webDriver.getPageSource().contains("作废-萨提尼尔（香港）有限公司"));
        accountListPageObject.selectButton().click();
        LogUtil.info("单击搜索按钮");
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[2]/div/div[2]/div/span/div/div/span/i");
        LogUtil.info("点击客户类型下拉列表");
        SeleniumUtil.choiceSelect(accountListPageObject.customerTypeSelect(), webDriver, "ant-select-dropdown-menu-item", "渠道");
        LogUtil.info("选择渠道");
        accountListPageObject.selectButton().click();
        LogUtil.info("点击搜索按钮");
        SeleniumUtil.choiceSelect(accountListPageObject.customerTypeSelect(),webDriver, "ant-select-dropdown-menu-item", "全部");
        LogUtil.info("点击搜索按钮");
        LogUtil.info("点击客户等级下拉框");
        WaitUtil.sleep(1000);
        SeleniumUtil.choiceSelect(accountListPageObject.customerLevelSelect(),webDriver, "ant-select-dropdown-menu-item", "Tier1 战略");
        LogUtil.info("选择Tier1 战略");
        WaitUtil.sleep(1000);
        accountListPageObject.selectButton().click();
        LogUtil.info("点击搜索");
        WaitUtil.sleep(1000);
        SeleniumUtil.choiceSelect(accountListPageObject.customerLevelSelect(),webDriver, "ant-select-dropdown-menu-item", "全部");
        accountListPageObject.selectButton().click();
        WaitUtil.sleep(2000);
        SeleniumUtil.choiceSelect(accountListPageObject.customerSalesSelect(),webDriver, "ant-select-dropdown-menu-item", "尤嘉维 <youjiawei@cmcm.com>");
        WaitUtil.sleep(1000);
        accountListPageObject.selectButton().click();
        WaitUtil.sleep(1000);
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[5]/div/div[2]/div/span/div/div/span[1]/i");
        WaitUtil.sleep(2000);
        SeleniumUtil.choiceSelect(accountListPageObject.customerAMSelect(),webDriver, "ant-select-dropdown-menu-item", "种馨<chongxin@cmcm.com>");
        WaitUtil.sleep(1000);
        accountListPageObject.selectButton().click();
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[6]/div/div[2]/div/span/div/div/span[1]/i");
        WaitUtil.sleep(2000);
        SeleniumUtil.choiceSelect(accountListPageObject.customerOptimistSelect(),webDriver, "ant-select-dropdown-menu-item", "刘旭达<liuxuda@cmcm.com>");
        WaitUtil.sleep(1000);
        accountListPageObject.selectButton().click();
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[7]/div/div[2]/div/span/div/div/span[1]/i");
        accountListPageObject.SAPCodeInput().sendKeys("22007865");
        WaitUtil.sleep(1000);
        accountListPageObject.selectButton().click();
        WaitUtil.sleep(1000);
        accountListPageObject.SAPCodeInput().clear();
        WaitUtil.sleep(3000);
    }
}
