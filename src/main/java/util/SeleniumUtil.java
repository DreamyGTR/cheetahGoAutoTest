package util;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.springframework.util.FileCopyUtils;
import org.testng.asserts.SoftAssert;

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
        WaitUtil.sleep(500);
        List<WebElement> elements = webDriver.findElements(By.className(elementsName));
        for (WebElement e : elements
        ) {
            if (e.getText().equals(text)) {
                e.click();
                break;
            }
        }
        WaitUtil.sleep(500);
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
        WaitUtil.sleep(500);
        Actions action = new Actions(webDriver);
        WebElement element = webDriver.findElement(By.xpath(elementsName));
        action.moveToElement(element).perform();
        action.clickAndHold().perform();
        action.release().perform();
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
    public static void takeTakesScreenshot(WebDriver driver) {
        try {
            //生成日期对象
            Date date = new Date();
            //调用DateUtil类中的方法,生成截图所在的文件夹的名称
            String picDir = "d:\\seleniumLog-" + String.valueOf(DateUtil.getYear(date)) + "-"
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

    /**
     * 该方法为断言敏感数据
     *
     * @param softAssert 软断言对象
     * @param webDriver  浏览器驱动对象
     * @param str        断言字符串对象
     * @param path       断言div位置xpath路径
     * @throws AssertionError
     * @throws InterruptedException
     */
    public static void softAssertSensitiveContainsPageSource(SoftAssert softAssert, WebDriver webDriver, String str, String path) throws AssertionError, InterruptedException {
        Thread.sleep(500);
        WebElement element = webDriver.findElement(By.xpath(path));
        String str1;
        if (str.length() > 4) {
            str1 = str.substring(0, 2);
            String str2 = str.substring(str.length() - 2);
            LogUtil.info("断言页面是否包括脱敏数据前两位: " + str1 + ",后两位: " + str2);
            int n = 5;
            if (element.getText().contains(str1) && element.getText().contains(str2)) {
                LogUtil.info("断言: " + str + " 成功!");
                softAssert.assertTrue(true);
            } else {
                LogUtil.info("页面未找到" + str + "断言失败!");
                SeleniumUtil.takeTakesScreenshot(webDriver);
                softAssert.assertTrue(false);
            }
        } else {
            str1 = str.substring(0, str.length() - 1);
            LogUtil.info("断言页面是否包括脱敏数据," + str + "因为字符串长度较短,仅截取前" + (str.length() - 1) + "位!");
            if (element.getText().contains(str1)) {
                LogUtil.info("断言: " + str + " 成功!");
                softAssert.assertTrue(true);
            } else {
                LogUtil.info("页面未找到" + str + "断言失败!");
                SeleniumUtil.takeTakesScreenshot(webDriver);
                softAssert.assertTrue(false);
            }
        }
    }

    /**
     * 根据字符串下标截取后进行断言
     *
     * @param softAssert 软断言对象
     * @param webDriver  web驱动
     * @param str        断言字符串
     * @param beginIndex 字符串开始下标
     * @param endIndex   字符串结束下标
     * @param path       断言div位置
     * @throws InterruptedException
     */
    public static void softAssertContainsPageSourceByIndex(SoftAssert softAssert, WebDriver webDriver, String str, int beginIndex, int endIndex, String path) throws InterruptedException {
        Thread.sleep(500);
        String subString = str.substring(beginIndex, endIndex);
        WebElement element = webDriver.findElement(By.xpath(path));
        LogUtil.info("断言页面是否: " + subString);
        if (element.getText().contains(subString)) {
            LogUtil.info("断言: " + str + " 成功!");
            softAssert.assertTrue(true);
        } else {
            LogUtil.info("页面未找到" + subString + "断言失败!");
            SeleniumUtil.takeTakesScreenshot(webDriver);
            softAssert.assertTrue(false);
        }
    }

    /**
     * 直接断言字符串
     *
     * @param softAssert
     * @param webDriver
     * @param str
     * @param path
     * @throws InterruptedException
     */
    public static void softAssertContainsPageSource(SoftAssert softAssert, WebDriver webDriver, String str, String path) throws InterruptedException {
        Thread.sleep(500);
        if (path != null) {
            WebElement element = webDriver.findElement(By.xpath(path));
            LogUtil.info("断言页面是否包含: " + str);
            if (element.getText().contains(str)) {
                LogUtil.info("断言: " + str + " 成功!");
                softAssert.assertTrue(true);
            } else {
                LogUtil.info("页面未找到" + str + "断言失败!");
                SeleniumUtil.takeTakesScreenshot(webDriver);
                softAssert.assertTrue(false);
            }
        } else {
            LogUtil.info("断言页面是否包含: " + str);
            if (webDriver.getPageSource().contains(str)) {
                LogUtil.info("断言: " + str + " 成功!");
                softAssert.assertTrue(true);
            } else {
                LogUtil.info("页面未找到" + str + "断言失败!");
                SeleniumUtil.takeTakesScreenshot(webDriver);
                softAssert.assertTrue(false);
            }
        }

    }

    /**
     * 日期选择器选择日期
     *
     * @param datePickersBeginPath
     * @param datePickersEndPath
     * @param beginDate
     * @param endDate
     * @throws InterruptedException
     */
    public static void datePickersSendKeys(WebElement datePickersBeginPath, WebElement datePickersEndPath, String beginDate, String endDate) throws Exception {
        Thread.sleep(500);
        datePickersBeginPath.sendKeys(beginDate);
        datePickersEndPath.sendKeys(endDate);
    }

    public static void main(String[] args) {

    }

    /**
     * 断言日期筛选器方法
     *
     * @param softAssert
     * @param webDriver
     * @param beginDate
     * @param endDate
     * @throws InterruptedException
     */
    public static void softAssertDatePickersResult(SoftAssert softAssert, WebDriver webDriver, String beginDate, String endDate) throws InterruptedException {
        if (webDriver.getPageSource().contains(beginDate) && webDriver.getPageSource().contains(endDate)) {
            LogUtil.info("日期断言成功,页面包含: " + beginDate + "-" + endDate + "之间的日期!");
            softAssert.assertTrue(true);
        } else {
            softAssert.assertTrue(false);
            LogUtil.info("日期断言失败,页面不包含: " + beginDate + "-" + endDate + "之间的日期!");
            SeleniumUtil.takeTakesScreenshot(webDriver);

        }
    }


    public static String choiceHandle(WebDriver webDriver, String str) {
        String originalHandle = webDriver.getWindowHandle();
        for (String handle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(handle);
            if (webDriver.getTitle().equals(str)) {

            }
        }
        return originalHandle;
    }
}
























