package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
    public static void sleep(long millisecond){
        try{
            //线程休眠,millisecond参数定义的是毫秒数
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //显示等待页面元素出现的封装方法,参数未页面元素的XPath定位字符串
    public static void waitWebElement(WebDriver driver, String xpathExpression){
        WebDriverWait wait=new WebDriverWait(driver,10);
        //调用ExpectedConditions的presenceOfElementLocated方法判断页面元素是否出现
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathExpression)));
    }
}
