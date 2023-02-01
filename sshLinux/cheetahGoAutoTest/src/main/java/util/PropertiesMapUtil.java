package util;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;
@Log4j
/**
 * 该类用于读取properties文件
 */
public class PropertiesMapUtil {
    public Properties properties;

    public PropertiesMapUtil(String propFile) {
        properties = new Properties();
        try {
            Reader in = new InputStreamReader(new FileInputStream(propFile), "UTF-8");
            properties.load(in);
            in.close();
        }catch (IOException e){
            log.error("读取对象文件错误!");
            e.printStackTrace();
        }
    }
    public By getLocator(String ElementNameInpropFile) throws Exception {
        //根据变量ElementNameInpropFile,从属性配置文件中读取对应的配置对象
        String locator=properties.getProperty(ElementNameInpropFile);
        //將配置对象中的定位类型存入locatorType变量,将定位表达式的值存入locatorValue变量
        String locatorType=locator.split(">")[0];
        String locatorValue=locator.split(">")[1];
        //输出locatorType的变量值内容判断返回何种定位方式的By对象
        log.error("获取的定位类型:"+locatorType+"\t获取的定位表达式"+locatorValue);
        //根据locatorType的变量值内容判断返回何种定位方式的By对象
        if (locatorType.toLowerCase().equals("id")){
            return By.id(locatorValue);
        }else if(locatorType.toLowerCase().equals("name")){
            return By.name(locatorValue);
        }else if (locatorType.toLowerCase().equals("classname")||locatorType.toLowerCase().equals("class")){
            return By.className(locatorValue);
        }else if(locatorType.toLowerCase().equals("tagname")||locatorType.toLowerCase().equals("tag")){
            return By.tagName(locatorValue);
        }else if (locatorType.toLowerCase().equals("linktext")||locatorType.toLowerCase().equals("link")){
            return By.linkText(locatorValue);
        }else if(locatorType.toLowerCase().equals("partiallinktext")){
            return By.partialLinkText(locatorValue);
        }else if(locatorType.toLowerCase().equals("cssselector")||locatorType.toLowerCase().equals("css")){
            return By.cssSelector(locatorValue);
        }else if(locatorType.toLowerCase().equals("xpath")){
            return By.xpath(locatorValue);
        }else {
            throw new Exception("输入的locator type 未在程序中被定义");
        }
    }
}
