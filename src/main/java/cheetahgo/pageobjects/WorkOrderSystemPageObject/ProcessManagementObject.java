package cheetahgo.pageobjects.WorkOrderSystemPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class ProcessManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public ProcessManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //媒体
    public WebElement media() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.media"));
        return element;
    }
    //流程类型
    public WebElement processType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.processType"));
        return element;
    }
    //流程名称
    public WebElement processName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.processName"));
        return element;
    }
    //流程状态
    public WebElement processStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.processStatus"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.search"));
        return element;
    }
    //重置
    public WebElement reset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.reset"));
        return element;
    }
    //新增流程
    public WebElement addProcess() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcess"));
        return element;
    }
    //新增流程-媒体类型
    public WebElement addProcessMediaType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessMediaType"));
        return element;
    }
    //新增流程-所属AM
    public WebElement addProcessAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessAMName"));
        return element;
    }
    //新增流程-流程名称
    public WebElement addProcessName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessName"));
        return element;
    }
    //新增流程-流程类型
    public WebElement addProcessType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessType"));
        return element;
    }
    //新增流程-流程状态-开启
    public WebElement addProcessStatusOpen() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessStatusOpen"));
        return element;
    }
    //新增流程-流程状态-关闭
    public WebElement addProcessStatusClose() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessStatusClose"));
        return element;
    }
    //新增流程-节点1-节点名称
    public WebElement addProcessNodeFirstNodeName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessNodeFirstNodeName"));
        return element;
    }
    //新增流程-节点1-角色类型
    public WebElement addProcessNodeFirstRoleType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessNodeFirstRoleType"));
        return element;
    }
    //新增流程-增加节点
    public WebElement addProcessNodeFirstAddNode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessNodeFirstAddNode"));
        return element;
    }
    //新增流程-节点2-节点名称
    public WebElement addProcessNodeSecondNodeName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessNodeSecondNodeName"));
        return element;
    }
    //新增流程-节点2-角色类型
    public WebElement addProcessNodeSecondRoleType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessNodeSecondRoleType"));
        return element;
    }
    //新增流程-节点2-角色
    public WebElement addProcessNodeSecondRole() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessNodeSecondRole"));
        return element;
    }
    //新增流程-节点2-关联用户
    public WebElement addProcessNodeSecondAssociatedUsers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessNodeSecondAssociatedUsers"));
        return element;
    }
    //新增流程-相关操作-同意
    public WebElement addProcessNodeSecondApprove() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessNodeSecondApprove"));
        return element;
    }
    //新增流程-相关操作-拒绝
    public WebElement addProcessNodeSecondReject() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessNodeSecondReject"));
        return element;
    }
    //新增流程-相关操作-返回修改
    public WebElement addProcessNodeSecondReturnToModification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessNodeSecondReturnToModification"));
        return element;
    }
    //新增流程-相关操作-Request ID
    public WebElement addProcessNodeSecondRequestID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessNodeSecondRequestID"));
        return element;
    }
    //新增流程-确定
    public WebElement addProcessSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessSubmit"));
        return element;
    }
    //新增流程-取消
    public WebElement addProcessCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.addProcessCancel"));
        return element;
    }
    //开启按钮
    public WebElement openButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.openButton"));
        return element;
    }
    //关闭按钮
    public WebElement closeButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.processManagement.closeButton"));
        return element;
    }

}