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
    public static void choiceSelect(WebDriver webDriver,String elementsName,String text){
        List<WebElement> elements = webDriver.findElements(By.className(elementsName));
        for (WebElement e:elements
        ){
            if (e.getText().equals(text)){
                e.click();
                break;
            }
        }
    }
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
}
