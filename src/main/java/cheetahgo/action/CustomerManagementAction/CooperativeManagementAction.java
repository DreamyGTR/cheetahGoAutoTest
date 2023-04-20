package cheetahgo.action.CustomerManagementAction;

import cheetahgo.pageobjects.CustomerManagementPageObject.AccountListFaceBookListObject;
import cheetahgo.pageobjects.CustomerManagementPageObject.CooperativeManagementObject;
import cheetahgo.pageobjects.CustomerManagementPageObject.CustomerManagementPageObject;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
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

    public static void selectAction(SoftAssert softAssert, WebDriver webDriver) throws Exception {
        CooperativeManagementObject cooperativeManagementObject = openCooperativeManagement(webDriver, softAssert);
        SeleniumUtil.choiceSelect(cooperativeManagementObject.FederatedSearch(), webDriver, "ant-select-dropdown-menu-item", "Jollychic Ec Limited");
        cooperativeManagementObject.Search().click();
        Thread.sleep(2000);

    }
}
