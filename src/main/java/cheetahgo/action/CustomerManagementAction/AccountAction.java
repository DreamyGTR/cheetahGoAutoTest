package cheetahgo.action.CustomerManagementAction;

import cheetahgo.constant.Constants;
import cheetahgo.pageobjects.CustomerManagementPageObject.AccountListPageObject;
import cheetahgo.pageobjects.CustomerManagementPageObject.CustomerManagementPageObject;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import util.LogUtil;
import util.SeleniumUtil;
import util.WaitUtil;

/**
 * 内部运营平台-客户管理-账户列表页面场景自动化测试
 */
@Log4j
public class AccountAction {

    /**
     * 封装打开客户管理-客户列表页面操作步骤
     *
     * @param softAssert 软断言对象
     * @param webDriver  浏览器驱动对象
     * @throws Exception
     */
    public static AccountListPageObject openCustomerManagementAndCustomerList(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        CustomerManagementPageObject customerManagementPageObject = new CustomerManagementPageObject(webDriver);
        AccountListPageObject accountListPageObject = new AccountListPageObject(webDriver);
        customerManagementPageObject.customerManagement().click();
        return accountListPageObject;
    }

    /**
     * 客户管理-账户列表-客户列表筛选器功能UI自动化场景测试
     *
     * @param webDriver
     * @throws Exception
     */
    public static void customerManagementCustomerListSelectAction(SoftAssert softAssert, WebDriver webDriver) throws Exception {

        LogUtil.info("========内部运营平台-客户管理-客户列表筛选器自动化测试开始=======");
        WaitUtil.sleep(1000);
        AccountListPageObject accountListPageObject = openCustomerManagementAndCustomerList(softAssert, webDriver);
        //验证客户ID文本框
        LogUtil.info("客户ID文本框输入" + Constants.CustomerId);
        accountListPageObject.customerId().sendKeys(Constants.CustomerId);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.softAssertSensitiveContainsPageSource(softAssert, webDriver, Constants.CustomerId, Constants.AssertCustomerManagementListSelect);
        LogUtil.info("清除文本框内容");
        accountListPageObject.customerId().clear();
        WaitUtil.sleep(500);

        //验证联合搜索下拉框
        LogUtil.info("联合搜索下拉框选择" + Constants.UniteSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.uniteSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.UniteSelect);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.softAssertSensitiveContainsPageSource(softAssert, webDriver, Constants.UniteSelect, Constants.AssertCustomerManagementListSelect);
        LogUtil.info("恢复联合验证下拉框数据");

        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[2]/div/div[2]/div/span/div/div/span[1]");
        WaitUtil.sleep(500);

        //验证SAP客户名称下拉框
        LogUtil.info("SAP客户名称下拉框选择" + Constants.CustomerSAPNameSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerNameSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerSAPNameSelect);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.softAssertSensitiveContainsPageSource(softAssert, webDriver, Constants.CustomerSAPNameSelect, Constants.AssertCustomerManagementListSelect);
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
        SeleniumUtil.softAssertSensitiveContainsPageSource(softAssert, webDriver, Constants.CustomerTypeSelect, Constants.AssertCustomerManagementListSelect);
        LogUtil.info("恢复客户类型下拉框默认值");
        SeleniumUtil.choiceSelect(accountListPageObject.customerTypeSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.defaultSelect);

        //验证客户等级下拉框
        LogUtil.info("客户等级下拉框选择" + Constants.CustomerLevelSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerLevelSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerLevelSelect);
        LogUtil.info("点击搜索");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.softAssertSensitiveContainsPageSource(softAssert, webDriver, Constants.CustomerLevelSelect, Constants.AssertCustomerManagementListSelect);
        LogUtil.info("恢复客户等级下拉框默认值");
        SeleniumUtil.choiceSelect(accountListPageObject.customerLevelSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.defaultSelect);

        //验证所属销售下拉框
        LogUtil.info("所属销售下拉框选择: " + Constants.CustomerSalesSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerSalesSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerSalesSelect);
        LogUtil.info("点击搜索");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.softAssertContainsPageSourceByIndex(softAssert, webDriver, Constants.CustomerSalesSelect, 0, 2, Constants.AssertCustomerManagementListSelect);
        LogUtil.info("所属销售下拉框恢复默认值:");
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[6]/div/div[2]/div/span/div/div/span[1]");

        //验证所属AM下拉框
        LogUtil.info("所属AM下拉框选择:" + Constants.CustomerAMSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerAMSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerAMSelect);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.softAssertContainsPageSourceByIndex(softAssert, webDriver, Constants.CustomerAMSelect, 0, 1, Constants.AssertCustomerManagementListSelect);
        LogUtil.info("所属AM下拉框选择恢复默认值");
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[7]/div/div[2]/div/span/div/div/span[1]");

        //所属优化师下拉框
        LogUtil.info("所属优化师下拉框选择:" + Constants.CustomerOptimistSelect);
        SeleniumUtil.choiceSelect(accountListPageObject.customerOptimistSelect(), webDriver, "ant-select-dropdown-menu-item", Constants.CustomerOptimistSelect);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.softAssertContainsPageSourceByIndex(softAssert, webDriver, Constants.CustomerOptimistSelect, 0, 1, Constants.AssertCustomerManagementListSelect);
        LogUtil.info("所属优化师下拉框选择恢复默认值");
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[8]/div/div[2]/div/span/div/div/span[1]");

        //SAP Code文本框
        LogUtil.info("SAP Code文本框输入:" + Constants.SAPCodeInput);
        accountListPageObject.SAPCodeInput().sendKeys(Constants.SAPCodeInput);
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        LogUtil.info("调用assertContainsPageSource自定义断言方法");
        SeleniumUtil.softAssertSensitiveContainsPageSource(softAssert, webDriver, Constants.SAPCodeInput, Constants.AssertCustomerManagementListSelect);
        LogUtil.info("清除SAP Code文本框");
        accountListPageObject.SAPCodeInput().clear();
        Thread.sleep(2000);

        //日期选择器
        LogUtil.info("点击日期选择器");
        accountListPageObject.createDatePickers().click();
        LogUtil.info("日期选择器输入日期时间: ");
        SeleniumUtil.datePickersSendKeys(accountListPageObject.datePickersBegin(), accountListPageObject.datePickersEnd(), "2023-03-23", "2023-03-23");
        LogUtil.info("点击搜索按钮");
        accountListPageObject.selectButton().click();
        SeleniumUtil.softAssertDatePickersResult(softAssert, webDriver, "2023-03-23", "2023-03-23");
        Thread.sleep(3000);
    }

    /**
     * 客户管理-账户列表信息场景UI自动化测试
     *
     * @param webDriver
     * @throws Exception
     */
    public static void customerManagementCustomerListAddCustomerMessageAction(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        AccountListPageObject accountListPageObject = openCustomerManagementAndCustomerList(softAssert, webDriver);
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
            softAssert.assertTrue(false);
        }

        LogUtil.info("联系人手机号文本框输入:" + Constants.TestCustomerPhone);
        SeleniumUtil.coverDivInputSendKeys(webDriver, accountListPageObject.addCustomerContactPhone(), Constants.TestCustomerPhone);
        LogUtil.info("联系人Email文本框输入:" + Constants.TestCustomerEmail);
        SeleniumUtil.coverDivInputSendKeys(webDriver, accountListPageObject.addCustomerContactEmail(), Constants.TestCustomerEmail);
        LogUtil.info("点击确定按钮");
        accountListPageObject.addCustomerContactConfirmButton().click();
        WaitUtil.sleep(2000);
    }

    /**
     * 客户管理-账户列表场景UI自动化测试
     *
     * @param softAssert
     * @param webDriver
     * @throws Exception
     */
    public static void customerManagementCustomerListDistributeSalesAction(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        AccountListPageObject accountListPageObject = openCustomerManagementAndCustomerList(softAssert, webDriver);
        LogUtil.info("==========内部运营平台客户管理-客户列表-分配销售功能自动化测试开始===========");
        LogUtil.info("点击分配销售按钮");
        accountListPageObject.distributeSalesButton().click();
        Thread.sleep(1000);
        LogUtil.info("多选框必选校验");
        SeleniumUtil.softAssertContainsPageSource(softAssert, webDriver, "请选择要修改的客户", null);
        LogUtil.info("选择列表数据");
        Thread.sleep(500);
        accountListPageObject.ListDataRadio().click();
        LogUtil.info("点击分配销售按钮");
        accountListPageObject.distributeSalesButton().click();
        LogUtil.info("下拉框选择销售: " + "郝燕星<haoyanxing@cmcm.com>");
        SeleniumUtil.choiceSelect(accountListPageObject.distributeSalesSelect(), webDriver, "ant-select-dropdown-menu-item", "郝燕星<haoyanxing@cmcm.com>");
        Thread.sleep(1000);
        LogUtil.info("点击确定按钮");
        accountListPageObject.distributeSalesDetermine().click();
        SeleniumUtil.softAssertContainsPageSource(softAssert, webDriver, "分配成功", null);
        Thread.sleep(1000);
        customerManagementCustomerListDistributeAMAction(softAssert, webDriver);
        customerManagementCustomerListDistributeOptimistAction(softAssert, webDriver);
        customerManagementCustomerListDownLoad(softAssert, webDriver);
    }

    /**
     * 客户管理-账户列表-分配AM场景UI自动化测试
     *
     * @param softAssert
     * @param webDriver
     * @throws Exception
     */
    public static void customerManagementCustomerListDistributeAMAction(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        AccountListPageObject accountListPageObject = openCustomerManagementAndCustomerList(softAssert, webDriver);
        LogUtil.info("==========内部运营平台客户管理-客户列表-分配AM功能自动化测试开始===========");
        LogUtil.info("点击分配AM按钮");
        accountListPageObject.distributeAMButton().click();
        LogUtil.info("多选按钮必填校验");
        SeleniumUtil.softAssertContainsPageSource(softAssert, webDriver, "请选择要修改的客户", null);
        LogUtil.info("选择列表数据");
        Thread.sleep(500);
        accountListPageObject.ListDataRadio().click();
        LogUtil.info("点击分配AM按钮");
        accountListPageObject.distributeAMButton().click();
        LogUtil.info("下拉框选择AM: " + "韩玮瑶<hanweiyao@cmcm.com>");
        SeleniumUtil.choiceSelect(accountListPageObject.distributeSalesSelect(), webDriver, "ant-select-dropdown-menu-item", "韩玮瑶<hanweiyao@cmcm.com>");
        Thread.sleep(1000);
        LogUtil.info("点击确定按钮");
        accountListPageObject.distributeSalesDetermine().click();
        SeleniumUtil.softAssertContainsPageSource(softAssert, webDriver, "分配成功", null);
        Thread.sleep(1000);
    }

    /**
     * 客户管理-账户列表-分配优化师场景UI自动化测试
     *
     * @param softAssert
     * @param webDriver
     */
    public static void customerManagementCustomerListDistributeOptimistAction(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        AccountListPageObject accountListPageObject = openCustomerManagementAndCustomerList(softAssert, webDriver);
        LogUtil.info("==========内部运营平台客户管理-客户列表-配优化师场景UI自动化测试开始===========");
        LogUtil.info("点击分配优化师按钮");
        accountListPageObject.distributeOptimistButton().click();
        LogUtil.info("多选按钮必填校验");
        SeleniumUtil.softAssertContainsPageSource(softAssert, webDriver, "请选择要修改的客户", null);
        LogUtil.info("选择列表数据");
        Thread.sleep(500);
        accountListPageObject.ListDataRadio().click();
        LogUtil.info("点击分配优化师按钮");
        accountListPageObject.distributeOptimistButton().click();
        LogUtil.info("下拉框选择AM: " + "杜涵<duhan@cmcm.com>");
        SeleniumUtil.choiceSelect(accountListPageObject.distributeOptimistSelect(), webDriver, "ant-select-dropdown-menu-item", "杜涵<duhan@cmcm.com>");
        Thread.sleep(1000);
        LogUtil.info("点击确定按钮");
        accountListPageObject.distributeOptimistDetermine().click();
        SeleniumUtil.softAssertContainsPageSource(softAssert, webDriver, "分配成功", null);
        Thread.sleep(1000);
    }

    /**
     * 客户管理-账户列表-绑定SAP CodeUI场景自动化测试
     *
     * @param softAssert
     * @param webDriver
     */
    public static void customerManagementCustomerListBinDingSAPCodeAction(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        AccountListPageObject accountListPageObject = openCustomerManagementAndCustomerList(softAssert, webDriver);

    }

    /**
     * 客户管理-账户列表-下载功能UI场景自动化测试
     *
     * @param softAssert
     * @param webDriver
     */
    public static void customerManagementCustomerListDownLoad(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        AccountListPageObject accountListPageObject = openCustomerManagementAndCustomerList(softAssert, webDriver);
        LogUtil.info("点击下载按钮");
        accountListPageObject.downLoadButton().click();
        Thread.sleep(5000);
    }

    /**
     * 客户管理-账户列表-列表数据操作场景自动化测试
     *
     * @param softAssert
     * @param webDriver
     * @throws Exception
     */
    public static void customerManagementCustomerListLookFinancialInformation(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        AccountListPageObject accountListPageObject = openCustomerManagementAndCustomerList(softAssert, webDriver);
        //查看财务信息
        LogUtil.info("点击查看财务信息");
        accountListPageObject.selectFinancialInformation().click();
        Thread.sleep(500);
        LogUtil.info("关闭财务信息弹窗");
        accountListPageObject.selectFinancialInformationCloseButton().click();
        Thread.sleep(1000);

        //查看联系人信息
        LogUtil.info("点击查看联系人信息");
        accountListPageObject.selectContactInformation().click();
        Thread.sleep(500);
        LogUtil.info("关闭查看联系人信息弹窗");
        accountListPageObject.selectContactInformationCloseButton().click();
        Thread.sleep(1000);

        //编辑客户按钮
        LogUtil.info("点击编辑客户信息按钮");
        accountListPageObject.editCustomerInformation().click();
        Thread.sleep(2000);
        LogUtil.info("点击下一步按钮");
        SeleniumUtil.actionMoveClickRelease(webDriver, accountListPageObject.editCustomerInformationDefineNextStep());
        Thread.sleep(500);
        LogUtil.info("点击确定按钮");
        SeleniumUtil.actionMoveClickRelease(webDriver, accountListPageObject.editCustomerInformationDefine());
        SeleniumUtil.softAssertContainsPageSource(softAssert, webDriver, "编辑成功", null);
        Thread.sleep(2000);

        //编辑财务信息
        LogUtil.info("点击编辑财务信息按钮");
        String originalHandle1 = webDriver.getWindowHandle();
        accountListPageObject.editFinancialInformation().click();
        LogUtil.info("聚焦到编辑财务信息弹窗");
        for (String handle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(handle);
            Thread.sleep(2000);
            LogUtil.info("发票抬头（签约主体）文本框输入: " + Constants.EditFinancialInformationTestData);
            accountListPageObject.editFinancialInformationInvoiceHeader().clear();
            accountListPageObject.editFinancialInformationInvoiceHeader().sendKeys(Constants.EditFinancialInformationTestData);
            LogUtil.info("媒体文本框输入: " + Constants.EditFinancialInformationTestData);
            accountListPageObject.editFinancialInformationInvoiceHeaderMedia().clear();
            accountListPageObject.editFinancialInformationInvoiceHeaderMedia().sendKeys(Constants.EditFinancialInformationTestData);
            LogUtil.info("发票项目文本框输入: " + Constants.EditFinancialInformationTestData);
            accountListPageObject.editFinancialInformationInvoiceItem().clear();
            accountListPageObject.editFinancialInformationInvoiceItem().sendKeys(Constants.EditFinancialInformationTestData);
            LogUtil.info("Account No文本框输入: " + Constants.EditFinancialInformationTestData);
            accountListPageObject.editFinancialInformationAccountNo().clear();
            accountListPageObject.editFinancialInformationAccountNo().sendKeys(Constants.EditFinancialInformationTestData);
            Thread.sleep(2000);
            LogUtil.info("点击确定按钮");
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(accountListPageObject.editFinancialInformationDetermineButton()));
            SeleniumUtil.actionMoveClickRelease(webDriver, accountListPageObject.editFinancialInformationDetermineButton());
            SeleniumUtil.softAssertContainsPageSource(softAssert, webDriver, "编辑成功", null);
        }
        webDriver.switchTo().window(originalHandle1);
        Thread.sleep(2000);
        //编辑联系人信息
        LogUtil.info("点击编辑联系人信息按钮");
        String originalHandle = webDriver.getWindowHandle();
        accountListPageObject.editContactInformation().click();
        LogUtil.info("聚焦到编辑联系人弹窗");
        //切换到弹出框页面并进行操作，操作完成后切回原页面
        for (String handle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(handle);
            // 进行操作
            Thread.sleep(1000);
            LogUtil.info("清除编辑联系人姓名文本框");
            accountListPageObject.editContactInformationName().clear();
            LogUtil.info("联系人姓名文本框输入: 赵天宇");
            accountListPageObject.editContactInformationName().sendKeys("赵天宇");
            LogUtil.info("清除编辑联系人手机号文本框");
            accountListPageObject.editContactInformationPhone().clear();
            LogUtil.info("联系人手机号文本框输入: 13801281641");
            accountListPageObject.editContactInformationPhone().sendKeys("13801281641");
            LogUtil.info("清除编辑联系人Email文本框");
            accountListPageObject.editContactInformationEmail().clear();
            LogUtil.info("联系人Email文本框输入: zhaotianyu@163.com");
            accountListPageObject.editContactInformationEmail().sendKeys("zhaotianyu@163.com");
            LogUtil.info("点击确定按钮");
            SeleniumUtil.actionMoveClickRelease(webDriver, accountListPageObject.editContactInformationConfirmButton());
            LogUtil.info("切换回主页面");
            SeleniumUtil.softAssertContainsPageSource(softAssert, webDriver, "编辑成功", null);
            softAssert.assertAll();
        }
        webDriver.switchTo().window(originalHandle);
    }
}

