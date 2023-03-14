package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SeleniumUtil {
    /**
     * 选择下拉框内的元素
     * @param webDriver web驱动
     * @param elementsName 下拉框位置
     * @param text 下拉框value值
     */
    public static void choiceSelect(WebElement element,WebDriver webDriver,String elementsName,String text){
        element.click();
        WaitUtil.sleep(1000);
        List<WebElement> elements = webDriver.findElements(By.className(elementsName));
        for (WebElement e:elements
        ){
            if (e.getText().equals(text)){
                e.click();
                break;
            }
        }
    }

    /**
     * 选择下拉框内的元素
     * @param webDriver web驱动
     * @param elementsName 下拉框位置
     * @param index 下拉框列表下标
     */
    public static void choiceSelect(WebElement element,WebDriver webDriver,String elementsName,int index){
        element.click();
        WaitUtil.sleep(2000);
        List<WebElement> elements = webDriver.findElements(By.className(elementsName));
        elements.get(index).click();
    }

    /**
     * 模拟鼠标点击事件
     * @param webDriver
     * @param elementsName
     */
    public static void actionMoveClickRelease(WebDriver webDriver,String elementsName){
        Actions action = new Actions(webDriver);
        WebElement element=webDriver.findElement(By.xpath(elementsName));
        action.moveToElement(element).perform();
        WaitUtil.sleep(1000);
        action.clickAndHold().perform();
        WaitUtil.sleep(1000);
        action.release().perform();
        WaitUtil.sleep(1000);
    }

    /**
     * 模拟鼠标点击事件(重写)
     * @param webDriver
     * @param elementsName
     */
    public static void actionMoveClickRelease(WebDriver webDriver,WebElement elementsName){
        Actions action = new Actions(webDriver);
        action.moveToElement(elementsName).perform();
        action.clickAndHold().perform();
        action.release().perform();
        WaitUtil.sleep(500);
    }
}
