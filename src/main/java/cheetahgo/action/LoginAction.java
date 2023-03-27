package cheetahgo.action;

import cheetahgo.constant.Constants;
import cheetahgo.pageobjects.LoginPageObject;
import org.bson.json.JsonObject;
import org.json.JSONObject;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.LogUtil;
import util.WaitUtil;

/**
 * 内部运营平台-登录页面
 */
public class LoginAction {

    public static void executeLogin(WebDriver webDriver, String userName, String passWord) throws Exception {
        webDriver.get(Constants.Url);
        LoginPageObject loginPage = new LoginPageObject(webDriver);
        loginPage.userName().sendKeys(userName);
        WaitUtil.sleep(1000);
        loginPage.passWord().sendKeys(passWord);
        WaitUtil.sleep(1000);
        loginPage.submitButton().click();
//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        Object response = js.executeScript("return window.performance.getEntries()[0].response;");
//        Map<String, Object> responseMap = (Map<String, Object>) response;
//        LogUtil.info(String.valueOf(responseMap.size()));
//        // 登录成功后，获取 Token 并添加到请求头中
//        String authToken = "";
//        WebDriverWait wait = new WebDriverWait(webDriver, 10);
//        wait.until(ExpectedConditions.urlMatches("http://uxcosr-cheetahgo-1252921383.cos-website.ap-beijing.myqcloud.com/test/#/home/index"));
//        String responseBody = webDriver.findElement(By.tagName("body")).getText();
//        JSONObject responseJson = new JSONObject(responseBody);
//        authToken = responseJson.getString("Authorization");
//        // 在后续请求中添加 Token
//        HttpURLConnection connection = (HttpURLConnection) new URL("https://example.com/api/resource").openConnection();
//        connection.setRequestMethod("GET");
//        connection.setRequestProperty("Authorization", "Bearer " + authToken);
//        connection.connect();
//        int responseCode = connection.getResponseCode();
//        // 验证请求是否成功
//        if (responseCode == HttpURLConnection.HTTP_OK) {
//            // 在响应中处理数据
//        } else {
//            // 处理请求失败的情况
//        }
        WaitUtil.sleep(2000);
    }
}
