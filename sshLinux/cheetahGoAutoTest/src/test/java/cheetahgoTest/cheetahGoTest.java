package cheetahgoTest;

import cheetahgo.action.CustomerManagementAction.AccountAction;
import cheetahgo.action.CustomerManagementAction.CustomerManagementAction;
import cheetahgo.action.LoginAction;
import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.WaitUtil;

import java.util.concurrent.TimeUnit;

/**
 * 该类用于UI自动化测试
 */
public class cheetahGoTest {

    public WebDriver webDriver;

    @BeforeMethod
    public void beforeMethod() throws Exception {
        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        webDriver=new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginAction.executeLogin(webDriver, Constants.UserName,Constants.PassWord);
        WaitUtil.sleep(3000);
    }
    @Test(suiteName = "cheetahGo",groups = "login")
    public void testLogin() throws Exception {
        AccountAction.openCustomerManagement(webDriver);
        Assert.assertTrue(webDriver.getPageSource().contains("10555"));
    }
    @AfterMethod
    public void afterMethod(){
        webDriver.quit();
    }
}
