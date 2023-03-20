package util;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class SeleniumUtil {
    /**
     * 选择下拉框内的元素
     *
     * @param webDriver    web驱动
     * @param elementsName 下拉框位置
     * @param text         下拉框value值
     */
    public static void choiceSelect(WebElement element, WebDriver webDriver, String elementsName, String text) {
        element.click();
        WaitUtil.sleep(1000);
        List<WebElement> elements = webDriver.findElements(By.className(elementsName));
        for (WebElement e : elements
        ) {
            if (e.getText().equals(text)) {
                e.click();
                break;
            }
        }
    }

    /**
     * 选择下拉框内的元素
     *
     * @param webDriver    web驱动
     * @param elementsName 下拉框位置
     * @param index        下拉框列表下标
     */
    public static void choiceSelect(WebElement element, WebDriver webDriver, String elementsName, int index) {
        element.click();
        WaitUtil.sleep(2000);
        List<WebElement> elements = webDriver.findElements(By.className(elementsName));
        elements.get(index).click();
    }

    /**
     * 模拟鼠标点击事件
     *
     * @param webDriver
     * @param elementsName
     */
    public static void actionMoveClickRelease(WebDriver webDriver, String elementsName) {
        Actions action = new Actions(webDriver);
        WebElement element = webDriver.findElement(By.xpath(elementsName));
        action.moveToElement(element).perform();
        WaitUtil.sleep(1000);
        action.clickAndHold().perform();
        WaitUtil.sleep(1000);
        action.release().perform();
        WaitUtil.sleep(1000);
    }

    /**
     * 模拟鼠标点击事件(重写)
     *
     * @param webDriver
     * @param elementsName
     */
    public static void actionMoveClickRelease(WebDriver webDriver, WebElement elementsName) {
        Actions action = new Actions(webDriver);
        action.moveToElement(elementsName).perform();
        action.clickAndHold().perform();
        action.release().perform();
        WaitUtil.sleep(500);
    }

    /**
     * 该方法为解决外层DIV遮盖元素导致无法输入参数的问题
     *
     * @param webDriver
     * @param webElement
     * @param str
     */
    public static void coverDivInputSendKeys(WebDriver webDriver, WebElement webElement, String str) {
        actionMoveClickRelease(webDriver, webElement);
        KeyBoardUtil.setAndctrlVClipboarData(str);
    }

    /**
     * 截图方法,该方法调用了实践类和文件操作类的静态方法,用来一时间格式生成目录名称和截图文件名称
     */
    public void takeTakesScreenshot(WebDriver driver) {
        try {
            //生成日期对象
            Date date = new Date();
            //调用DateUtil类中的方法,生成截图所在的文件夹的名称
            String picDir = "d:\\" + String.valueOf(DateUtil.getYear(date)) + "-"
                    + String.valueOf(DateUtil.getMonth(date) + "-" + String.valueOf(DateUtil.getDay(date)));
            if (!new File(picDir).exists()) {
                FileUtil.createDir(picDir);
            }
            //调用DateUtil类中的方法,生成截图文件名称
            String filePath = picDir + "\\" + String.valueOf(DateUtil.getHour(new Date())) + "-" + String.valueOf(DateUtil.getMinute(new
                    Date())) + "-" + String.valueOf(DateUtil.getSecond(new Date())) + ".png";
            //进行截图,并将文件内容保持存在srcFile对象中
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //将截图文件内容写入到磁盘中,生成截图文件
            FileCopyUtils.copy(srcFile, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
