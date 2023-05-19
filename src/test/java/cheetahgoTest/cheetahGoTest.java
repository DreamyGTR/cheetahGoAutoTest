package cheetahgoTest;

import cheetahgo.action.CustomerManagementAction.CooperativeManagementAction;
import cheetahgo.action.LoginAction;
import cheetahgo.cheetahGoAutoTestApplication;
import cheetahgo.constant.Constants;
import cheetahgo.mapper.CheetahgoCustomerContactMapper;
import cheetahgo.mapper.CheetahgoCustomerCooperateClientMapper;
import cheetahgo.mapper.CheetahgoCustomerMapper;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import util.LogUtil;
import util.WaitUtil;

import java.util.concurrent.TimeUnit;

/**
 * 该类用于UI自动化测试
 */
@SpringBootTest(classes = cheetahGoAutoTestApplication.class)
public class cheetahGoTest extends AbstractTestNGSpringContextTests {
    public WebDriver webDriver;
    @Autowired
    CheetahgoCustomerCooperateClientMapper mapper;
    @Autowired
    CheetahgoCustomerMapper ccmMapper;
    @Autowired
    CheetahgoCustomerContactMapper cccmMapper;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() throws Exception {
        System.setProperty("java.awt.headless", "false");
        DOMConfigurator.configure("log4j.xml");
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        LogUtil.info("打开浏览器");
        webDriver.manage().window().maximize();
        LogUtil.info("浏览器窗口最大化");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginAction.executeLogin(webDriver, Constants.UserName, Constants.PassWord);
        WaitUtil.sleep(3000);
    }
//
//    @Test(groups = "CustomerManagement")
//    public void testSelect() throws Exception {
//        SoftAssert softAssert = new SoftAssert();
//        CustomerAccountListAction.customerManagementCustomerListSelectAction(softAssert, webDriver);
//        softAssert.assertAll();
//    }
//
//    @Test(groups = "CustomerManagement")
//    public void addCustomer() throws Exception {
//        SoftAssert softAssert = new SoftAssert();
//        CustomerAccountListAction.customerManagementCustomerListAddCustomerMessageAction(softAssert, webDriver);
//        try {
//            softAssert.assertTrue(webDriver.getPageSource().contains("新增成功"));
//            softAssert.assertAll();
//            if (ccmMapper.selectByName(Constants.TestCustomerName).size() > 0) {
//                LogUtil.info("新增客户信息成功!");
//                if (ccmMapper.deleteByName(Constants.TestCustomerName) > 0 && cccmMapper.delByCellphone(Constants.TestCustomerPhone) > 0) {
//                    LogUtil.info("自动化测试垃圾数据已清除!");
//                } else {
//                    LogUtil.info("清除垃圾数据失败!");
//                    softAssert.assertTrue(false);
//                }
//            } else {
//                LogUtil.info("数据库原因,新增客户信息失败!");
//                softAssert.assertTrue(false);
//            }
//        } catch (AssertionError error) {
//            LogUtil.info("新增客户失败请查看日志截图!");
//            SeleniumUtil.takeTakesScreenshot(webDriver);
//            softAssert.assertTrue(false);
//        }
//        softAssert.assertAll();
//    }

    @Test(groups = "CustomerManagement")
    public void distributeSales() throws Exception {
        SoftAssert softAssert = new SoftAssert();
        CooperativeManagementAction.addCollaborationRecordAction(softAssert, webDriver);
        softAssert.assertAll();
    }

    @AfterTest()
    public void addCustomerAfterTest() {

    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        LogUtil.info("关闭浏览器");
        webDriver.quit();
        LogUtil.info("=============================自动化测试结束===========================");
        LogUtil.info("\\r\\n");
        LogUtil.info("");
    }
}
