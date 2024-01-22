package cheetahgo.pageobjects.WorkOrderSystemPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class AccountOpeningPendingWorkOrderObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public AccountOpeningPendingWorkOrderObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //Facebook-客户名称
    public WebElement facebookCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookCustomerName"));
        return element;
    }
    //Facebook-工单ID
    public WebElement facebookWorkOrderID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookWorkOrderID"));
        return element;
    }
    //Facebook-所属AM
    public WebElement facebookAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookAMName"));
        return element;
    }
    //Facebook-开户类型
    public WebElement facebookAccountOpeningType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookAccountOpeningType"));
        return element;
    }
    //Facebook-当前节点
    public WebElement facebookCurrentNode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookCurrentNode"));
        return element;
    }
    //Facebook-Request ID
    public WebElement facebookRequestID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookRequestID"));
        return element;
    }
    //Facebook-OE参考编号
    public WebElement facebookOETokenID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookOETokenID"));
        return element;
    }
    //Facebook-营业执照名称
    public WebElement facebookBusinessLicenseName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBusinessLicenseName"));
        return element;
    }
    //Facebook-加急
    public WebElement facebookUrgent() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookUrgent"));
        return element;
    }
    //Facebook-分配开户
    public WebElement facebookDistributeOpeningAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookDistributeOpeningAccount"));
        return element;
    }
    //Facebook-申请时间-开始
    public WebElement facebookApplicationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookApplicationTimeStart"));
        return element;
    }
    //Facebook-申请时间-结束
    public WebElement facebookApplicationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookApplicationTimeEnd"));
        return element;
    }
    //Facebook-批量分配
    public WebElement facebookBatchAttribute() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBatchAttribute"));
        return element;
    }
    //Facebook-勾选框
    public WebElement facebookCheckbox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookCheckbox"));
        return element;
    }
    //Facebook-批量分配-分配开户
    public WebElement facebookBatchAttributeOpeningAccountUser() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBatchAttributeOpeningAccountUser"));
        return element;
    }
    //Facebook-批量分配-确认
    public WebElement facebookBatchAttributeSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBatchAttributeSubmit"));
        return element;
    }
    //Facebook-批量分配-关闭
    public WebElement facebookBatchAttributeCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBatchAttributeCancel"));
        return element;
    }
    //Facebook-批量操作
    public WebElement facebookBatchOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBatchOperation"));
        return element;
    }
    //Facebook-批量操作-通过
    public WebElement facebookBatchOperationApprove() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBatchOperationApprove"));
        return element;
    }
    //Facebook-批量操作-拒绝
    public WebElement facebookBatchOperationReject() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBatchOperationReject"));
        return element;
    }
    //Facebook-批量操作-审批意见
    public WebElement facebookBatchOperationApprovalComments() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBatchOperationApprovalComments"));
        return element;
    }
    //Facebook-批量操作-内容备注
    public WebElement facebookBatchOperationContentNotes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBatchOperationContentNotes"));
        return element;
    }
    //Facebook-批量操作-确认
    public WebElement facebookBatchOperationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBatchOperationSubmit"));
        return element;
    }
    //Facebook-批量操作-关闭
    public WebElement facebookBatchOperationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookBatchOperationCancel"));
        return element;
    }
    //Facebook-搜索
    public WebElement facebookSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookSearch"));
        return element;
    }
    //Facebook-下载
    public WebElement facebookDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookDownload"));
        return element;
    }
    //Facebook-重置
    public WebElement facebookReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookReset"));
        return element;
    }
    //Facebook-办理
    public WebElement facebookHandle() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookHandle"));
        return element;
    }
    //Facebook-办理-通过
    public WebElement facebookHandleApproval() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookHandleApproval"));
        return element;
    }
    //Facebook-办理-拒绝
    public WebElement facebookHandleReject() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookHandleReject"));
        return element;
    }
    //Facebook-办理-媒体拒绝
    public WebElement facebookHandleMediaRejection() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookHandleMediaRejection"));
        return element;
    }
    //Facebook-办理-返回修改
    public WebElement facebookHandleReturnToModification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookHandleReturnToModification"));
        return element;
    }
    //Facebook-办理-媒体返回修改
    public WebElement facebookHandleMediaReturnToModification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookHandleMediaReturnToModification"));
        return element;
    }
    //Facebook-办理-取消
    public WebElement facebookHandleMediaReturnToModificationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookHandleMediaReturnToModificationCancel"));
        return element;
    }
    //Facebook-详情
    public WebElement facebookDetails() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookDetails"));
        return element;
    }
    //Facebook-分配
    public WebElement facebookAttribution() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookAttribution"));
        return element;
    }
    //Facebook-分配-分配开户
    public WebElement facebookAttributionOpeningUser() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookAttributionOpeningUser"));
        return element;
    }
    //Facebook-分配-确认
    public WebElement facebookAttributionSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookAttributionSubmit"));
        return element;
    }
    //Facebook-分配-关闭
    public WebElement facebookAttributionCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.facebookAttributionCancel"));
        return element;
    }
    //TikTok-工单ID
    public WebElement tikTokWorkOrderID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.tikTokWorkOrderID"));
        return element;
    }
    //TikTok-营业执照名称
    public WebElement tikTokBusinessLicenseName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.tikTokBusinessLicenseName"));
        return element;
    }
    //TikTok-当前节点
    public WebElement tikTokCurrentNode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.tikTokCurrentNode"));
        return element;
    }
    //TikTok-加急
    public WebElement tikTokUrgent() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.tikTokUrgent"));
        return element;
    }
    //TikTok-申请时间-开始
    public WebElement tikTokApplicationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.tikTokApplicationTimeStart"));
        return element;
    }
    //TikTok-申请时间-结束
    public WebElement tikTokApplicationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.tikTokApplicationTimeEnd"));
        return element;
    }
    //TikTok-搜索
    public WebElement tikTokSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.tikTokSearch"));
        return element;
    }
    //TikTok-下载
    public WebElement tikTokDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.tikTokDownload"));
        return element;
    }
    //TikTok-重置
    public WebElement tikTokReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.accountOpeningPendingWorkOrder.tikTokReset"));
        return element;
    }
}