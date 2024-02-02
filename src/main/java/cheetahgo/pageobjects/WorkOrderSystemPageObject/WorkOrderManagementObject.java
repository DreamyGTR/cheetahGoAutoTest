package cheetahgo.pageobjects.WorkOrderSystemPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class WorkOrderManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public WorkOrderManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //客户列表-客户名称
    public WebElement customerListCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListCustomerName"));
        return element;
    }
    //客户列表-客户类型
    public WebElement customerListCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListCustomerType"));
        return element;
    }
    //客户列表-所属销售
    public WebElement customerListSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListSalesName"));
        return element;
    }
    //客户列表-所属AM
    public WebElement customerListAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListAMName"));
        return element;
    }
    //客户列表-所属开户
    public WebElement customerListAccountOpening() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListAccountOpening"));
        return element;
    }
    //客户列表-OE工单确认
    public WebElement customerListOEWorkOrderConform() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListOEWorkOrderConform"));
        return element;
    }
    //客户列表-创建时间-开始
    public WebElement customerListCreateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListCreateTimeStart"));
        return element;
    }
    //客户列表-创建时间-结束
    public WebElement customerListCreateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListCreateTimeEnd"));
        return element;
    }
    //客户列表-更新时间-开始
    public WebElement customerListUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListUpdateTimeStart"));
        return element;
    }
    //客户列表-更新时间-结束
    public WebElement customerListUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListUpdateTimeEnd"));
        return element;
    }
    //客户列表-搜索
    public WebElement customerListSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListSearch"));
        return element;
    }
    //客户列表-重置
    public WebElement customerListReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListReset"));
        return element;
    }
    //客户列表-批量上传
    public WebElement customerListBatchUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListBatchUpload"));
        return element;
    }
    //客户列表-批量上传-选择文件
    public WebElement customerListBatchUploadSelectFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListBatchUploadSelectFiles"));
        return element;
    }
    //客户列表-批量上传-下载模板
    public WebElement customerListBatchUploadDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListBatchUploadDownloadTemple"));
        return element;
    }
    //客户列表-批量上传-确认
    public WebElement customerListBatchUploadSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListBatchUploadSubmit"));
        return element;
    }
    //客户列表-批量上传-关闭
    public WebElement customerListBatchUploadCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListBatchUploadCancel"));
        return element;
    }
    //客户列表-下载
    public WebElement customerListDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListDownload"));
        return element;
    }
    //客户列表-绑定开户
    public WebElement customerListBindAccountOpening() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListBindAccountOpening"));
        return element;
    }
    //客户列表-绑定开户-开户1
    public WebElement customerListBindAccountOpeningAccountOpeningFirst() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListBindAccountOpeningAccountOpeningFirst"));
        return element;
    }
    //客户列表-绑定开户-开户2
    public WebElement customerListBindAccountOpeningAccountOpeningSecond() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListBindAccountOpeningAccountOpeningSecond"));
        return element;
    }
    //客户列表-绑定开户-确认
    public WebElement customerListBindAccountOpeningSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListBindAccountOpeningSubmit"));
        return element;
    }
    //客户列表-绑定开户-关闭
    public WebElement customerListBindAccountOpeningCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.customerListBindAccountOpeningCancel"));
        return element;
    }
    //分配设置-开户
    public WebElement distributionSettings() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettings"));
        return element;
    }
    //分配设置-分配状态
    public WebElement distributionSettingsDistributionStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsDistributionStatus"));
        return element;
    }
    //分配设置-更新时间-开始
    public WebElement distributionSettingsUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsUpdateTimeStart"));
        return element;
    }
    //分配设置-更新时间-结束
    public WebElement distributionSettingsUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsUpdateTimeEnd"));
        return element;
    }
    //分配设置-搜索
    public WebElement distributionSettingsSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsSearch"));
        return element;
    }
    //分配设置-重置
    public WebElement distributionSettingsReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsReset"));
        return element;
    }
    //分配设置-分配设置
    public WebElement distributionSettingsButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsButton"));
        return element;
    }
    //分配设置-分配设置-自动分配工单类型-OE
    public WebElement distributionSettingsButtonAutomaticallyAssignWorkOrderTypesOE() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsButtonAutomaticallyAssignWorkOrderTypesOE"));
        return element;
    }
    //分配设置-分配设置-自动分配工单类型-AAC
    public WebElement distributionSettingsButtonAutomaticallyAssignWorkOrderTypesAAC() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsButtonAutomaticallyAssignWorkOrderTypesAAC"));
        return element;
    }
    //分配设置-分配设置-按单量分配状态
    public WebElement distributionSettingsButtonStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsButtonStatus"));
        return element;
    }
    //分配设置-分配设置-OE预计耗时
    public WebElement distributionSettingsButtonOEExpectedTime() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsButtonOEExpectedTime"));
        return element;
    }
    //分配设置-分配设置-AAC预计耗时
    public WebElement distributionSettingsButtonAACExpectedTime() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsButtonAACExpectedTime"));
        return element;
    }
    //分配设置-分配设置-按预计耗时分配状态
    public WebElement distributionSettingsButtonSwitchStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsButtonSwitchStatus"));
        return element;
    }
    //分配设置-分配设置-确认
    public WebElement distributionSettingsButtonSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsButtonSubmit"));
        return element;
    }
    //分配设置-分配设置-关闭
    public WebElement distributionSettingsButtonCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsButtonCancel"));
        return element;
    }
    //分配设置-下载
    public WebElement distributionSettingsDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsDownload"));
        return element;
    }
    //分配设置-自动分配
    public WebElement distributionSettingsAutomaticAllocation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsAutomaticAllocation"));
        return element;
    }
    //分配设置-自动分配-自动分配开关
    public WebElement distributionSettingsAutomaticAllocationSwitchStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsAutomaticAllocationSwitchStatus"));
        return element;
    }
    //分配设置-自动分配-确认
    public WebElement distributionSettingsAutomaticAllocationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsAutomaticAllocationSubmit"));
        return element;
    }
    //分配设置-自动分配-关闭
    public WebElement distributionSettingsAutomaticAllocationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.distributionSettingsAutomaticAllocationCancel"));
        return element;
    }
    //工单配置操作日志-操作流水号
    public WebElement workOrderConfigurationOperationLogOperationSerialNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogOperationSerialNumber"));
        return element;
    }
    //工单配置操作日志-客户名称
    public WebElement workOrderConfigurationOperationLogCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogCustomerName"));
        return element;
    }
    //工单配置操作日志-所属开户
    public WebElement workOrderConfigurationOperationLogAccountOpening() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogAccountOpening"));
        return element;
    }
    //工单配置操作日志-操作类型
    public WebElement workOrderConfigurationOperationLogOperationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogOperationType"));
        return element;
    }
    //工单配置操作日志-操作状态
    public WebElement workOrderConfigurationOperationLogOperationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogOperationStatus"));
        return element;
    }
    //工单配置操作日志-操作平台
    public WebElement workOrderConfigurationOperationLogOperationPlatform() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogOperationPlatform"));
        return element;
    }
    //工单配置操作日志-操作人
    public WebElement workOrderConfigurationOperationLogOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogOperator"));
        return element;
    }
    //工单配置操作日志-操作时间-开始
    public WebElement workOrderConfigurationOperationLogOperationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogOperationTimeStart"));
        return element;
    }
    //工单配置操作日志-操作时间-结束
    public WebElement workOrderConfigurationOperationLogOperationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogOperationTimeEnd"));
        return element;
    }
    //工单配置操作日志-搜索
    public WebElement workOrderConfigurationOperationLogSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogSearch"));
        return element;
    }
    //工单配置操作日志-重置
    public WebElement workOrderConfigurationOperationLogReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogReset"));
        return element;
    }
    //工单配置操作日志-下载
    public WebElement workOrderConfigurationOperationLogDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderConfigurationOperationLogDownload"));
        return element;
    }
    //工单分配操作日志-操作流水号
    public WebElement workOrderAssignmentOperationLogOperationSerialNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogOperationSerialNumber"));
        return element;
    }
    //工单分配操作日志-工单ID
    public WebElement workOrderAssignmentOperationLogWorkOrderID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogWorkOrderID"));
        return element;
    }
    //工单分配操作日志-开户类型
    public WebElement workOrderAssignmentOperationLogAccountOpeningType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogAccountOpeningType"));
        return element;
    }
    //工单分配操作日志-客户名称
    public WebElement workOrderAssignmentOperationLogCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogCustomerName"));
        return element;
    }
    //工单分配操作日志-分配方式
    public WebElement workOrderAssignmentOperationLogAllocation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogAllocation"));
        return element;
    }
    //工单分配操作日志-所属开户
    public WebElement workOrderAssignmentOperationLogAccountOpening() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogAccountOpening"));
        return element;
    }
    //工单分配操作日志-操作状态
    public WebElement workOrderAssignmentOperationLogOperationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogOperationStatus"));
        return element;
    }
    //工单分配操作日志-操作人
    public WebElement workOrderAssignmentOperationLogOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogOperator"));
        return element;
    }
    //工单分配操作日志-操作时间-开始
    public WebElement workOrderAssignmentOperationLogOperationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogOperationTimeStart"));
        return element;
    }
    //工单分配操作日志-操作时间-结束
    public WebElement workOrderAssignmentOperationLogOperationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogOperationTimeEnd"));
        return element;
    }
    //工单分配操作日志-搜索
    public WebElement workOrderAssignmentOperationLogSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogSearch"));
        return element;
    }
    //工单分配操作日志-重置
    public WebElement workOrderAssignmentOperationLogReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogReset"));
        return element;
    }
    //工单分配操作日志-下载
    public WebElement workOrderAssignmentOperationLogDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.workOrderManagement.workOrderAssignmentOperationLogDownload"));
        return element;
    }
}