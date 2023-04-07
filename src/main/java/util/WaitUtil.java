package util;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class WaitUtil {
    public static void sleep(long millisecond) {
        try {
            //线程休眠,millisecond参数定义的是毫秒数
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //显示等待页面元素出现的封装方法,参数未页面元素的XPath定位字符串
    public static void waitWebElement(WebDriver webDriver, WebElement webElement, SoftAssert softAssert) {
//        // 创建一个显式等待对象，等待10秒钟，每隔500毫秒查找一次元素
//        WebDriverWait wait = new WebDriverWait(webDriver, 10, 500);
//        try {
//            //显式等待判断是否可以从页面获取文字输入框对象,如果可以获取,则执行后续测试逻辑
//            webElement = (new WebDriverWait(webDriver, 10)).until(new ExpectedCondition<WebElement>() {
//                @Override
//                public WebElement apply(WebDriver webDriver) {
//                    return webElement;
//                }
//            });
//        } catch (NoSuchElementException e) {
//            softAssert.assertTrue(false);
//        }
    }
}
