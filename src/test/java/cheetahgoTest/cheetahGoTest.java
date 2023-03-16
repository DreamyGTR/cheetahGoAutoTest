package cheetahgoTest;

import cheetahgo.action.CustomerManagementAction.AccountAction;
import cheetahgo.action.LoginAction;
import cheetahgo.cheetahGoAutoTestApplication;
import cheetahgo.constant.Constants;
import cheetahgo.mapper.CheetahgoCustomerCooperateClientMapper;
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

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() throws Exception {
        System.setProperty("java.awt.headless", "false");
        DOMConfigurator.configure("log4j.xml");
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginAction.executeLogin(webDriver, Constants.UserName, Constants.PassWord);
        WaitUtil.sleep(3000);
    }
    @Test(groups = "CustomerManagement")
    public void testSelect() throws Exception {
        AccountAction.CustomerManagementSelectAction(webDriver);
    }

    @Test(groups = "CustomerManagement")
    public void addCustomer() throws Exception {
        AccountAction.CustomerManagementAddCustomerMessageAction(webDriver);
        mapper.selectAll().forEach(System.out::println);
    }

    @AfterTest()
    public void addCustomerAfterTest() {

    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        LogUtil.info("=============================自动化测试结束===========================");
        webDriver.quit();
    }
}
