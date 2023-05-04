package cheetahgo.action.CustomerManagementAction;


import cheetahgo.pageobjects.CustomerManagementPageObject.AccountListFaceBookListObject;
import cheetahgo.pageobjects.CustomerManagementPageObject.CustomerManagementPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import util.LogUtil;
import util.SeleniumUtil;

/**
 * 内部运营平台-客户管理-账户列表页面场景自动化测试
 */
public class AccountListFaceBookListAction {

    /**
     * 进入客户管理-账户列表-FaceBook列表页面
     *
     * @param webDriver
     * @param softAssert
     * @return
     * @throws Exception
     */
    public static AccountListFaceBookListObject openCustomerBillFaceBookList(WebDriver webDriver, SoftAssert softAssert) throws Exception {
        AccountListFaceBookListObject accountBillFaceBookListObject = new AccountListFaceBookListObject(webDriver);
        CustomerManagementPageObject customerManagementPageObject = new CustomerManagementPageObject(webDriver);
        customerManagementPageObject.customerManagement().click();
        Thread.sleep(500);
        customerManagementPageObject.customerBill().click();
        Thread.sleep(500);
        customerManagementPageObject.customerBillFaceBookList().click();
        return accountBillFaceBookListObject;
    }

    public static void selectAction(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        AccountListFaceBookListObject customerBillFaceBookListObject = openCustomerBillFaceBookList(webDriver, softAssert);
        LogUtil.info("========内部运营平台-客户管理-账户列表筛选器自动化测试开始=======");
        SeleniumUtil.choiceSelect(customerBillFaceBookListObject.accountIDSelect(), webDriver, "ant-select-dropdown-menu-item", "2714685435422499");
        customerBillFaceBookListObject.searchButton().click();
        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/div/div[3]/div[1]/form/div/div[1]/div/div[2]/div/span/div/div/span/i");
        Thread.sleep(3000);


    }
}
