package cheetahgo.pageobjects.WorkOrderSystemPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class WorkOrderOverviewObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public WorkOrderOverviewObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //媒体类型
    public WebElement mediaType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.mediaType"));
        return element;
    }
    //工单类型
    public WebElement workOrderType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.workOrderType"));
        return element;
    }
    //客户名称
    public WebElement customerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.customerName"));
        return element;
    }
    //客户类型
    public WebElement customerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.customerType"));
        return element;
    }
    //所属销售
    public WebElement salesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.salesName"));
        return element;
    }
    //所属AM
    public WebElement amName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.amName"));
        return element;
    }
    //工单ID
    public WebElement jobID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.jobID"));
        return element;
    }
    //工单状态
    public WebElement jobStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.jobStatus"));
        return element;
    }
    //当前节点
    public WebElement currentNode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.currentNode"));
        return element;
    }
    //申请时间-开始
    public WebElement applicationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.applicationTimeStart"));
        return element;
    }
    //申请时间-结束
    public WebElement applicationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.applicationTimeEnd"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.search"));
        return element;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.download"));
        return element;
    }
    //重置
    public WebElement reset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.reset"));
        return element;
    }
    //详情
    public WebElement detail() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderOverview.detail"));
        return element;
    }


}