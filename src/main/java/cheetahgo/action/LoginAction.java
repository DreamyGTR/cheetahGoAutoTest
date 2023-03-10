package cheetahgo.action;

import cheetahgo.constant.Constants;
import cheetahgo.pageobjects.LoginPageObject;
import org.openqa.selenium.WebDriver;
import util.WaitUtil;

/**
 * 内部运营平台-登录页面
 */
public class LoginAction {

    public static void executeLogin(WebDriver webDriver, String userName, String passWord) throws Exception {
        webDriver.get(Constants.Url);
        LoginPageObject loginPage=new LoginPageObject(webDriver);
        loginPage.userName().sendKeys(userName);
        WaitUtil.sleep(1000);
        loginPage.passWord().sendKeys(passWord);
        WaitUtil.sleep(1000);
        loginPage.submitButton().click();
        WaitUtil.sleep(1000);
    }
}
