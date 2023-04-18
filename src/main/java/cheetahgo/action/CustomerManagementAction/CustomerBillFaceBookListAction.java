package cheetahgo.action.CustomerManagementAction;


import cheetahgo.pageobjects.CustomerManagementPageObject.CustomerBillFaceBookListObject;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

/**
 * 内部运营平台-客户管理-账户列表页面场景自动化测试
 */
public class CustomerBillFaceBookListAction {

    public static void openCustomerBillFaceBookList(WebDriver webDriver, SoftAssert softAssert) throws Exception {
        CustomerBillFaceBookListObject customerBillFaceBookListObject=new CustomerBillFaceBookListObject(webDriver);

    }
}
