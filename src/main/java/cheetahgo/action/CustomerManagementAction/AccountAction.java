package cheetahgo.action.CustomerManagementAction;

import cheetahgo.constant.Constants;
import cheetahgo.mapper.CheetahgoCustomerContactMapper;
import cheetahgo.pageobjects.CustomerManagementPageObject.AccountListPageObject;
import cheetahgo.pageobjects.CustomerManagementPageObject.CustomerManagementPageObject;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import util.LogUtil;
import util.SeleniumUtil;
import util.WaitUtil;

/**
 * 内部运营平台-客户管理-账户列表页面场景自动化测试
 */
@Log4j
public class AccountAction {
    /**
     * 客户管理-客户列表筛选器功能UI自动化场景测试
     *
     * @param webDriver
     * @throws Exception
     */
    public static void CustomerManagementSelectAction(WebDriver webDriver) throws Exception {
        CustomerManagementPageObject customerManagementPageObject = new CustomerManagementPageObject(webDriver);
        AccountListPageObject accountListPageObject = new AccountListPageObject(webDriver);
        customerManagementPageObject.customerManagement().click();
        LogUtil.info("========内部运营平台-客户管理-客户列表筛选器自动化测试开始=======");
        WaitUtil.sleep(1000);
        //验证客户ID文本框
        LogUtil.info("客户ID文本框输入" + Constants.CustomerId);
        accountListPageObject.customerId().sendKeys(Constants.CustomerId);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.assertSensitiveContainsPageSource(webDriver, Constants.CustomerId);
        LogUtil.info("清除文本框内容");
        accountListPageObject.customerId().clear();
        WaitUtil.sleep(500);

        //验证联合搜索下拉框
        LogUtil.info("联合搜索下拉框选择" + Constants.UniteSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.uniteSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.UniteSelect);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.assertSensitiveContainsPageSource(webDriver, Constants.UniteSelect);
        LogUtil.info("恢复联合验证下拉框数据");

        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[2]/div/div[2]/div/span/div/div/span[1]");
        WaitUtil.sleep(500);

        //验证SAP客户名称下拉框
        LogUtil.info("SAP客户名称下拉框选择" + Constants.CustomerSAPNameSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerNameSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerSAPNameSelect);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.assertSensitiveContainsPageSource(webDriver, Constants.CustomerSAPNameSelect);
        LogUtil.info("恢复SAP客户名称下拉框默认值");
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[3]/div/div[2]/div/span/div/div/span[1]");
        Thread.sleep(500);

        //验证客户类型下拉框
        LogUtil.info("客户类型下拉框选择" + Constants.CustomerTypeSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerTypeSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerTypeSelect);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        Thread.sleep(1000);
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.assertContainsPageSource(webDriver, Constants.CustomerTypeSelect);
        LogUtil.info("恢复客户类型下拉框默认值");
        SeleniumUtil.choiceSelect(accountListPageObject.customerTypeSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.defaultSelect);

        //验证客户等级下拉框
        LogUtil.info("客户等级下拉框选择" + Constants.CustomerLevelSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerLevelSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerLevelSelect);
        LogUtil.info("点击搜索");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.assertContainsPageSource(webDriver, Constants.CustomerLevelSelect);
        LogUtil.info("恢复客户等级下拉框默认值");
        SeleniumUtil.choiceSelect(accountListPageObject.customerLevelSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.defaultSelect);

        //验证所属销售下拉框
        LogUtil.info("所属销售下拉框选择: " + Constants.CustomerSalesSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerSalesSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerSalesSelect);
        LogUtil.info("点击搜索");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.assertContainsPageSourceByIndex(webDriver, Constants.CustomerSalesSelect, 0, 2);
        LogUtil.info("所属销售下拉框恢复默认值:");
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[6]/div/div[2]/div/span/div/div/span[1]");

        //验证所属AM下拉框
        LogUtil.info("所属AM下拉框选择:" + Constants.CustomerAMSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerAMSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerAMSelect);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.assertContainsPageSourceByIndex(webDriver, Constants.CustomerAMSelect, 0, 1);
        LogUtil.info("所属AM下拉框选择恢复默认值");
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[7]/div/div[2]/div/span/div/div/span[1]");

        //所属优化师下拉框
        LogUtil.info("所属优化师下拉框选择:" + Constants.CustomerOptimistSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerOptimistSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerOptimistSelect);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.assertContainsPageSourceByIndex(webDriver, Constants.CustomerOptimistSelect, 0, 1);
        LogUtil.info("所属优化师下拉框选择恢复默认值");
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[8]/div/div[2]/div/span/div/div/span[1]");

        //SAP Code文本框
        LogUtil.info("SAP Code文本框输入:" + Constants.SAPCodeInput);
        accountListPageObject.SAPCodeInput().sendKeys(Constants.SAPCodeInput);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.assertContainsPageSource(webDriver, Constants.SAPCodeInput);
        LogUtil.info("清除SAP Code文本框");
        accountListPageObject.SAPCodeInput().clear();
        Thread.sleep(2000);
    }

    /**
     * 客户管理-新增客户信息场景UI自动化测试
     *
     * @param webDriver
     * @throws Exception
     */
    public static void CustomerManagementAddCustomerMessageAction(WebDriver webDriver) throws Exception {
        CustomerManagementPageObject customerManagementPageObject = new CustomerManagementPageObject(webDriver);
        AccountListPageObject accountListPageObject = new AccountListPageObject(webDriver);
        customerManagementPageObject.customerManagement().click();
        customerManagementPageObject.customerList().click();
        LogUtil.info("==========内部运营平台客户管理-客户列表-新增客户功能自动化测试开始===========");
        log.info(webDriver.getWindowHandle());
        accountListPageObject.addCustomerButton().click();
        Thread.sleep(1500);
        LogUtil.info("客户名称文本框输入:自动化测试输入客户名称");
        SeleniumUtil.coverDivInputSendKeys(webDriver, accountListPageObject.addCustomerNameInput(), "自动化测试输入客户名称");
        LogUtil.info("SAP Code文本框输入:123456");
        SeleniumUtil.coverDivInputSendKeys(webDriver, accountListPageObject.addCustomerSAPCodeInput(), "123456");
        LogUtil.info("客户类型下拉框选择:直客-游戏");
        SeleniumUtil.choiceSelect(accountListPageObject.addCustomerTypeSelect(), webDriver, "ant-select-dropdown-menu-item", "直客-游戏");
        LogUtil.info("客户等级下拉框选择:Tier3 普通");
        SeleniumUtil.choiceSelect(accountListPageObject.addCustomerLevelSelect(), webDriver, "ant-select-dropdown-menu-item", "Tier3 普通");
        LogUtil.info("销售下拉框选择:李薇薇<liweiwei@cmcm.com>");
        SeleniumUtil.choiceSelect(accountListPageObject.addCustomerSalesSelect(), webDriver, "ant-select-dropdown-menu-item", "李薇薇<liweiwei@cmcm.com>");
        LogUtil.info("AM下拉框选择:韩玮瑶<hanweiyao@cmcm.com>");
        SeleniumUtil.choiceSelect(accountListPageObject.addCustomerAMSelect(), webDriver, "ant-select-dropdown-menu-item", "韩玮瑶<hanweiyao@cmcm.com>");
        LogUtil.info("优化师下拉框选择:刘旭达<liuxuda@cmcm.com>");
        SeleniumUtil.choiceSelect(accountListPageObject.addCustomerOptimistSelect(), webDriver, "ant-select-dropdown-menu-item", "刘旭达<liuxuda@cmcm.com>");
        try {
            LogUtil.info("点击下一步按钮");
            accountListPageObject.addCustomerConfirmButton().click();
            Thread.sleep(1000);
            String pageSource = webDriver.getPageSource();
            LogUtil.info("联系人姓名文本框输入:" + Constants.TestCustomerContactsName);
            SeleniumUtil.coverDivInputSendKeys(webDriver, accountListPageObject.addCustomerContactName(), Constants.TestCustomerContactsName);
        } catch (Exception e) {
            LogUtil.info("点击下一步失败,详情请看日志或截图!" + e.getMessage());
            SeleniumUtil.takeTakesScreenshot(webDriver);
            Assert.assertTrue(false);
        }
        LogUtil.info("联系人手机号文本框输入:" + Constants.TestCustomerPhone);
        SeleniumUtil.coverDivInputSendKeys(webDriver, accountListPageObject.addCustomerContactPhone(), Constants.TestCustomerPhone);
        LogUtil.info("联系人Email文本框输入:" + Constants.TestCustomerEmail);
        SeleniumUtil.coverDivInputSendKeys(webDriver, accountListPageObject.addCustomerContactEmail(), Constants.TestCustomerEmail);
        LogUtil.info("点击确定按钮");
        accountListPageObject.addCustomerContactConfirmButton().click();
        WaitUtil.sleep(2000);
    }
}
