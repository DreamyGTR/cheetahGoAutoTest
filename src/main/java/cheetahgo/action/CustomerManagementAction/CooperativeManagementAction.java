package cheetahgo.action.CustomerManagementAction;

import cheetahgo.pageobjects.CustomerManagementPageObject.CooperativeManagementObject;
import cheetahgo.pageobjects.CustomerManagementPageObject.CustomerManagementPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import util.SeleniumUtil;

public class CooperativeManagementAction {

    /**
     * 进入客户管理-合作管理
     *
     * @param webDriver
     * @param softAssert
     * @return
     * @throws Exception
     */
    public static CooperativeManagementObject openCooperativeManagement(WebDriver webDriver, SoftAssert softAssert) throws Exception {
        CooperativeManagementObject cooperativeManagementObject = new CooperativeManagementObject(webDriver);
        CustomerManagementPageObject customerManagementPageObject = new CustomerManagementPageObject(webDriver);
        customerManagementPageObject.customerManagement().click();
        Thread.sleep(500);
        customerManagementPageObject.cooperativeManagement().click();
        Thread.sleep(1000);
        return cooperativeManagementObject;
    }

    /**
     * 内部运营平台-合作管理-筛选器自动化测试
     *
     * @param softAssert
     * @param webDriver
     * @throws Exception
     */
    public static void selectAction(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        CooperativeManagementObject cooperativeManagementObject = openCooperativeManagement(webDriver, softAssert);
        WebDriverWait wait = new WebDriverWait(webDriver, 10); // 等待10秒
        //联合搜索下拉框
        SeleniumUtil.choiceSelect(cooperativeManagementObject.federatedSearch(), webDriver, "ant-select-dropdown-menu-item", "Jollychic Ec Limited");
        cooperativeManagementObject.search().click();
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[1]/div/div[2]/div/span/div/div/span[1]/i");


        //SAP客户名称下拉框
        SeleniumUtil.choiceSelect(cooperativeManagementObject.sAPCustomerName(), webDriver, "ant-select-dropdown-menu-item", "《环球时报》社有限公司");
        cooperativeManagementObject.search().click();
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[2]/div/div[2]/div/span/div/div/span[1]/i");

        //所属销售下拉框
        SeleniumUtil.choiceSelect(cooperativeManagementObject.sales(), webDriver, "ant-select-dropdown-menu-item", "李薇薇 <liweiwei@cmcm.com>");
        Thread.sleep(1000);
        cooperativeManagementObject.search().click();
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[3]/div/div[2]/div/span/div/div/span[1]/i");

        //所属AM下拉框
        SeleniumUtil.choiceSelect(cooperativeManagementObject.aM(), webDriver, "ant-select-dropdown-menu-item", "梁贤<liangxian@cmcm.com>");
        cooperativeManagementObject.search().click();
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[4]/div/div[2]/div/span/div/div/span[1]/i");

        //所属优化师下拉框
        SeleniumUtil.choiceSelect(cooperativeManagementObject.optimist(), webDriver, "ant-select-dropdown-menu-item", "杜涵<duhan@cmcm.com>");
        cooperativeManagementObject.search().click();
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[5]/div/div[2]/div/span/div/div/span[1]/i");

        //客户类别下拉框
        SeleniumUtil.choiceSelect(cooperativeManagementObject.customerType(), webDriver, "ant-select-dropdown-menu-item", "预付充值");
        webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/form/div/div[6]/div/div[1]/label")).click();
        wait.until(ExpectedConditions.visibilityOf(cooperativeManagementObject.search()));
        cooperativeManagementObject.search().click();

        //合作开始时间选择器
        cooperativeManagementObject.cooperationStartTime().click();
        Thread.sleep(1000);
        SeleniumUtil.datePickersSendKeys(cooperativeManagementObject.cooperationStartTimeBegin(), cooperativeManagementObject.cooperationStartTimeEnd(), "2022-06-08", "2022-08-08");
        cooperativeManagementObject.search().click();

        Thread.sleep(3000);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 2, 3, 3,3,3,3};
        int err=0;
        for (int i = 0; i < arr.length; i++) {
            err=err^arr[i];
        }
        System.out.println(err);

    }

    /**
     * 内部运营平台-合作管理-新增合作记录自动化测试
     *
     * @param softAssert
     * @param webDriver
     */
    public static void addCollaborationRecordAction(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        CooperativeManagementObject cooperativeManagementObject = openCooperativeManagement(webDriver, softAssert);
        cooperativeManagementObject.addCollaborationRecord().click();
        Thread.sleep(1000);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.zIndex='999'", cooperativeManagementObject.sAPName());
        // 在弹出框页面进行操作
        SeleniumUtil.choiceSelect(cooperativeManagementObject.sAPName(), webDriver, "ant-select-dropdown-menu-item", "广州棒谷网络科技有限公司");
        SeleniumUtil.choiceSelect(cooperativeManagementObject.customerType(), webDriver, "ant-select-dropdown-menu-item", "后付实消");
        cooperativeManagementObject.totalAmount().sendKeys("100");
        SeleniumUtil.choiceSelect(cooperativeManagementObject.accountingPeriodType(), webDriver, "ant-select-dropdown-menu-item", "充值");
        cooperativeManagementObject.accountPeriod().sendKeys("10");
        cooperativeManagementObject.contractTaxRateInRMB().sendKeys("100");
        cooperativeManagementObject.sAPFormerName_Principal1().sendKeys("测试SAP曾用名");
        Thread.sleep(3000);

    }
}

