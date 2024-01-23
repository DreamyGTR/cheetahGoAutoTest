package cheetahgo.pageobjects.WorkOrderSystemPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class PendingWorkOrderObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public PendingWorkOrderObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //媒体类型
    public WebElement mediaType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.pendingWorkOrder.mediaType"));
        return element;
    }
    //工单类型
    public WebElement workOrderType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.pendingWorkOrder.workOrderType"));
        return element;
    }
    //客户名称
    public WebElement customerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.pendingWorkOrder.customerName"));
        return element;
    }
    //工单ID
    public WebElement workOrderID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.pendingWorkOrder.workOrderID"));
        return element;
    }
    //当前节点
    public WebElement currentNode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.pendingWorkOrder.currentNode"));
        return element;
    }
    //申请时间-开始
    public WebElement applicationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.pendingWorkOrder.applicationTimeStart"));
        return element;
    }
    //申请时间-结束
    public WebElement applicationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.pendingWorkOrder.applicationTimeEnd"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.pendingWorkOrder.search"));
        return element;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.pendingWorkOrder.download"));
        return element;
    }
    //重置
    public WebElement reset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.pendingWorkOrder.reset"));
        return element;
    }

}