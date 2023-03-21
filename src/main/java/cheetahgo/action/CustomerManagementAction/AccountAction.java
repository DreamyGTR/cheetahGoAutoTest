package cheetahgo.action.CustomerManagementAction;

import cheetahgo.constant.Constants;
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
        LogUtil.info("=============================自动化测试开始===========================");
        WaitUtil.sleep(1000);
        LogUtil.info("客户ID文本框输入"+Constants.CustomerId);
        accountListPageObject.customerId().sendKeys(Constants.CustomerId);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        SeleniumUtil.assertContainsPageSource(webDriver,Constants.CustomerId);
        LogUtil.info("清除文本框内容");
        accountListPageObject.customerId().clear();
        WaitUtil.sleep(1000);
        LogUtil.info("联合搜索下拉框选择"+Constants.UniteSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.uniteSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.UniteSelect);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        SeleniumUtil.assertContainsPageSource(webDriver,Constants.UniteSelect);
        SeleniumUtil.actionMoveClickRelease(webDriver,"/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[2]/div/div[2]/div/span/div/div/span[1]");
        WaitUtil.sleep(1000);
        LogUtil.info("SAP客户名称下拉框选择"+Constants.CustomerSAPNameSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerNameSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerSAPNameSelect);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        SeleniumUtil.assertContainsPageSource(webDriver,Constants.CustomerSAPNameSelect);
        Thread.sleep(3000);
        //LogUtil.info("下拉框选择:作废-萨提尼尔（香港）有限公司");
//        WaitUtil.sleep(1000);
//        Assert.assertTrue(webDriver.getPageSource().contains("作废-萨提尼尔（香港）有限公司"));
//        accountListPageObject.selectButton().click();
//        LogUtil.info("单击搜索按钮");
//        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[2]/div/div[2]/div/span/div/div/span/i");
//        LogUtil.info("点击客户类型下拉列表");
//        SeleniumUtil.choiceSelect(accountListPageObject.customerTypeSelect(), webDriver, "ant-select-dropdown-menu-item", "渠道");
//        LogUtil.info("选择渠道");
//        accountListPageObject.selectButton().click();
//        LogUtil.info("点击搜索按钮");
//        SeleniumUtil.choiceSelect(accountListPageObject.customerTypeSelect(), webDriver, "ant-select-dropdown-menu-item", "全部");
//        LogUtil.info("点击搜索按钮");
//        LogUtil.info("点击客户等级下拉框");
//        WaitUtil.sleep(1000);
//        SeleniumUtil.choiceSelect(accountListPageObject.customerLevelSelect(), webDriver, "ant-select-dropdown-menu-item", "Tier1 战略");
//        LogUtil.info("选择Tier1 战略");
//        WaitUtil.sleep(1000);
//        accountListPageObject.selectButton().click();
//        LogUtil.info("点击搜索");
//        WaitUtil.sleep(1000);
//        SeleniumUtil.choiceSelect(accountListPageObject.customerLevelSelect(), webDriver, "ant-select-dropdown-menu-item", "全部");
//        accountListPageObject.selectButton().click();
//        WaitUtil.sleep(2000);
//        SeleniumUtil.choiceSelect(accountListPageObject.customerSalesSelect(), webDriver, "ant-select-dropdown-menu-item", "尤嘉维 <youjiawei@cmcm.com>");
//        WaitUtil.sleep(1000);
//        accountListPageObject.selectButton().click();
//        WaitUtil.sleep(1000);
//        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[5]/div/div[2]/div/span/div/div/span[1]/i");
//        WaitUtil.sleep(2000);
//        SeleniumUtil.choiceSelect(accountListPageObject.customerAMSelect(), webDriver, "ant-select-dropdown-menu-item", "种馨<chongxin@cmcm.com>");
//        WaitUtil.sleep(1000);
//        accountListPageObject.selectButton().click();
//        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[6]/div/div[2]/div/span/div/div/span[1]/i");
//        WaitUtil.sleep(2000);
//        SeleniumUtil.choiceSelect(accountListPageObject.customerOptimistSelect(), webDriver, "ant-select-dropdown-menu-item", "刘旭达<liuxuda@cmcm.com>");
//        WaitUtil.sleep(1000);
//        accountListPageObject.selectButton().click();
//        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[7]/div/div[2]/div/span/div/div/span[1]/i");
//        accountListPageObject.SAPCodeInput().sendKeys("22007865");
//        WaitUtil.sleep(1000);
//        accountListPageObject.selectButton().click();
//        WaitUtil.sleep(1000);
//        accountListPageObject.SAPCodeInput().clear();
//        WaitUtil.sleep(3000);
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

    public static void main(String[] args) {
        String str="123456789";
        String str1="";
        String str2="";
        str1=str.substring(0,2);
        str2=str.substring(str.length()-2);
        System.out.println(str1+str2);
    }
}
