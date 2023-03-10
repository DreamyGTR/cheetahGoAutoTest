package cheetahgoTest;

import cheetahgo.action.CustomerManagementAction.AccountAction;
import cheetahgo.action.LoginAction;
import cheetahgo.constant.Constants;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.LogUtil;
import util.WaitUtil;

import java.util.concurrent.TimeUnit;

/**
 * 该类用于UI自动化测试
 */
public class cheetahGoTest {

    public WebDriver webDriver;

    @BeforeMethod
    public void beforeMethod() throws Exception {
        DOMConfigurator.configure("log4j.xml");
        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        webDriver=new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginAction.executeLogin(webDriver, Constants.UserName,Constants.PassWord);
        WaitUtil.sleep(3000);
    }
//    @Test(groups = "CustomerManagement")
//    public void testSelect() throws Exception {
//        AccountAction.CustomerManagementSelectAction(webDriver);
//    }
    @Test(groups = "CustomerManagement")
    public void addCustomer() throws Exception {
        AccountAction.CustomerManagementAddCustomerMessageAction(webDriver);
    }
    @AfterMethod
    public void afterMethod(){
        LogUtil.info("=============================自动化测试结束===========================");
        webDriver.quit();
    }
}
