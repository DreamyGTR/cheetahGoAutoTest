package cheetahgo.pageobjects;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

/**
 * 内部运营平台-登录页面元素封装
 */
public class LoginPageObject {
    private WebElement element=null;
    private PropertiesMapUtil objectMap=new PropertiesMapUtil(Constants.LoginPageProperties);
    private WebDriver webDriver;


    public LoginPageObject(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    //登录用户名
    public WebElement userName() throws Exception {
        element=webDriver.findElement(objectMap.getLocator("cheetahGo.login.email"));
        return element;
    }
    //登录密码
    public WebElement passWord () throws Exception {
        element=webDriver.findElement(objectMap.getLocator("cheetahGo.login.password"));
        return element;
    }
    //登录按钮
    public WebElement submitButton () throws Exception {
        element=webDriver.findElement(objectMap.getLocator("cheetahGo.login.submitButton"));
        return element;
    }
}
