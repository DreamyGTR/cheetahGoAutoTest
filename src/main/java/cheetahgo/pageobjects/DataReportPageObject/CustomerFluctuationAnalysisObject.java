package cheetahgo.pageobjects.DataReportPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class CustomerFluctuationAnalysisObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public CustomerFluctuationAnalysisObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //客户名称
    public WebElement customerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerFluctuationAnalysis.customerName"));
        return element;
    }
    //时间维度-日
    public WebElement timeDimensionDay() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerFluctuationAnalysis.timeDimensionDay"));
        return element;
    }
    //时间维度-周
    public WebElement timeDimensionWeek() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerFluctuationAnalysis.timeDimensionWeek"));
        return element;
    }
    //时间维度-月
    public WebElement timeDimensionMonth() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerFluctuationAnalysis.timeDimensionMonth"));
        return element;
    }
    //时间维度-季
    public WebElement timeDimensionSeason() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerFluctuationAnalysis.timeDimensionSeason"));
        return element;
    }
    //日期-开始
    public WebElement dateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerFluctuationAnalysis.dateStart"));
        return element;
    }
    //日期-结束
    public WebElement dateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerFluctuationAnalysis.dateEnd"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerFluctuationAnalysis.search"));
        return element;
    }
    //下载完整报表
    public WebElement downloadFullReport() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.dateReport.customerFluctuationAnalysis.downloadFullReport"));
        return element;
    }
}