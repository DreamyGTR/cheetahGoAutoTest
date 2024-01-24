package cheetahgo.pageobjects.WorkOrderSystemPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class ProcessCorrelationObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public ProcessCorrelationObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //媒体类型
    public WebElement mediaType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.mediaType"));
        return element;
    }
    //客户名称
    public WebElement customerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.customerName"));
        return element;
    }
    //流程类型
    public WebElement processType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.processType"));
        return element;
    }
    //流程名称
    public WebElement processName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.processName"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.search"));
        return element;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.download"));
        return element;
    }
    //重置
    public WebElement reset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.reset"));
        return element;
    }
    //关联客户
    public WebElement associatedCustomers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.associatedCustomers"));
        return element;
    }
    //关联客户-媒体类型
    public WebElement associatedCustomersMediaType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.associatedCustomersMediaType"));
        return element;
    }
    //关联客户-流程类型
    public WebElement associatedCustomersProcessType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.associatedCustomersProcessType"));
        return element;
    }
    //关联客户-流程名称
    public WebElement associatedCustomersProcessName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.associatedCustomersProcessName"));
        return element;
    }
    //关联客户-客户名称
    public WebElement associatedCustomersCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.associatedCustomersCustomerName"));
        return element;
    }
    //关联客户-确定
    public WebElement associatedCustomersSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.associatedCustomersSubmit"));
        return element;
    }
    //关联客户-取消
    public WebElement associatedCustomersCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.associatedCustomersCancel"));
        return element;
    }
    //解除关联
    public WebElement disassociate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.disassociate"));
        return element;
    }
    //解除关联-取消
    public WebElement disassociateCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.disassociateCancel"));
        return element;
    }
    //解除关联-确定
    public WebElement disassociateSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.disassociateSubmit"));
        return element;
    }
    //更改关联
    public WebElement changeAssociation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.changeAssociation"));
        return element;
    }
    //更改关联-流程类型
    public WebElement changeAssociationProcessType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.changeAssociationProcessType"));
        return element;
    }
    //更改关联-流程名称
    public WebElement changeAssociationProcessName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.changeAssociationProcessName"));
        return element;
    }
    //更改关联-确定
    public WebElement changeAssociationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.changeAssociationSubmit"));
        return element;
    }
    //更改关联-取消
    public WebElement changeAssociationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processCorrelation.changeAssociationCancel"));
        return element;
    }

}