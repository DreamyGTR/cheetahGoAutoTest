package cheetahgo.pageobjects.WorkOrderSystemPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class RiskManagementAndControlObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public RiskManagementAndControlObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //开户主体-开户主体
    public WebElement entityName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityName"));
        return element;
    }
    //开户主体-主体类型
    public WebElement entityType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityType"));
        return element;
    }
    //开户主体-客户名称
    public WebElement entityCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityCustomerName"));
        return element;
    }
    //开户主体-客户类型
    public WebElement entityCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityCustomerType"));
        return element;
    }
    //开户主体-所属销售
    public WebElement entitySalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entitySalesName"));
        return element;
    }
    //开户主体-所属AM
    public WebElement entityAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityAMName"));
        return element;
    }
    //开户主体-风险类型
    public WebElement entityRiskType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityRiskType"));
        return element;
    }
    //开户主体-风险等级
    public WebElement entityRiskLevel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityRiskLevel"));
        return element;
    }
    //开户主体-状态
    public WebElement entityStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityStatus"));
        return element;
    }
    //开户主体-创建人
    public WebElement entityFounder() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityFounder"));
        return element;
    }
    //开户主体-创建时间-开始
    public WebElement entityCreateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityCreateTimeStart"));
        return element;
    }
    //开户主体-创建时间-结束
    public WebElement entityCreateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityCreateTimeEnd"));
        return element;
    }
    //开户主体-更新时间-开始
    public WebElement entityUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityUpdateTimeStart"));
        return element;
    }
    //开户主体-更新时间-结束
    public WebElement entityUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityUpdateTimeEnd"));
        return element;
    }
    //开户主体-搜索
    public WebElement entitySearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entitySearch"));
        return element;
    }
    //开户主体-重置
    public WebElement entityReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityReset"));
        return element;
    }
    //开户主体-批量上传
    public WebElement entityBatchUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityBatchUpload"));
        return element;
    }
    //开户主体-批量上传-选择类型-风险主体
    public WebElement entityBatchUploadRiskSubject() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityBatchUploadRiskSubject"));
        return element;
    }
    //开户主体-批量上传-选择类型-直客主体
    public WebElement entityBatchUploadDirectSubject() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityBatchUploadDirectSubject"));
        return element;
    }
    //开户主体-批量上传-选择文件-点击上传
    public WebElement entityBatchUploadClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityBatchUploadClickToUpload"));
        return element;
    }
    //开户主体-批量上传-选择文件-下载模板
    public WebElement entityBatchUploadDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityBatchUploadDownloadTemple"));
        return element;
    }
    //开户主体-批量上传-确认
    public WebElement entityBatchUploadSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityBatchUploadSubmit"));
        return element;
    }
    //开户主体-批量上传-取消
    public WebElement entityBatchUploadCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityBatchUploadCancel"));
        return element;
    }
    //开户主体-下载
    public WebElement entityDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityDownload"));
        return element;
    }
    //开户主体-编辑
    public WebElement entityEdit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityEdit"));
        return element;
    }
    //开户主体-编辑-SAP客户名称
    public WebElement entityEditSAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityEditSAPCustomerName"));
        return element;
    }
    //开户主体-编辑-备注
    public WebElement entityEditRemark() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityEditRemark"));
        return element;
    }
    //开户主体-编辑-确认
    public WebElement entityEditSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityEditSubmit"));
        return element;
    }
    //开户主体-编辑-取消
    public WebElement entityEditCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityEditCancel"));
        return element;
    }
    //开户主体-停用
    public WebElement entityDisable() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.entityDisable"));
        return element;
    }
    //SAP客户-客户名称
    public WebElement sapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerName"));
        return element;
    }
    //SAP客户-客户类型
    public WebElement sapCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerType"));
        return element;
    }
    //SAP客户-所属销售
    public WebElement sapCustomerSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerSalesName"));
        return element;
    }
    //SAP客户-所属AM
    public WebElement sapCustomerAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerAMName"));
        return element;
    }
    //SAP客户-状态
    public WebElement sapCustomerStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerStatus"));
        return element;
    }
    //SAP客户-创建人
    public WebElement sapCustomerFounder() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerFounder"));
        return element;
    }
    //SAP客户-创建时间-开始
    public WebElement sapCustomerCreateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerCreateTimeStart"));
        return element;
    }
    //SAP客户-创建时间-结束
    public WebElement sapCustomerCreateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerCreateTimeEnd"));
        return element;
    }
    //SAP客户-更新时间-开始
    public WebElement sapCustomerUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerUpdateTimeStart"));
        return element;
    }
    //SAP客户-更新时间-结束
    public WebElement sapCustomerUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerUpdateTimeEnd"));
        return element;
    }
    //SAP客户-搜索
    public WebElement sapCustomerSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerSearch"));
        return element;
    }
    //SAP客户-重置
    public WebElement sapCustomerReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerReset"));
        return element;
    }
    //SAP客户-批量上传
    public WebElement sapCustomerBatchUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerBatchUpload"));
        return element;
    }
    //SAP客户-批量上传-点击上传
    public WebElement sapCustomerBatchUploadClickToUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerBatchUploadClickToUpload"));
        return element;
    }
    //SAP客户-批量上传-下载模板
    public WebElement sapCustomerBatchUploadDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerBatchUploadDownloadTemple"));
        return element;
    }
    //SAP客户-批量上传-确认
    public WebElement sapCustomerBatchUploadSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerBatchUploadSubmit"));
        return element;
    }
    //SAP客户-批量上传-取消
    public WebElement sapCustomerBatchUploadCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerBatchUploadCancel"));
        return element;
    }
    //SAP客户-下载
    public WebElement sapCustomerBatchUploadDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerBatchUploadDownload"));
        return element;
    }
    //SAP客户-停用
    public WebElement sapCustomerBatchUploadDisable() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.riskManagementAndControl.sapCustomerBatchUploadDisable"));
        return element;
    }
}