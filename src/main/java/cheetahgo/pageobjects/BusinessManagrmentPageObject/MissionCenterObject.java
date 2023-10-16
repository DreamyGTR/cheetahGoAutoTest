package cheetahgo.pageobjects.BusinessManagrmentPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class MissionCenterObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public MissionCenterObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //任务列表-任务
    public WebElement missionListTask() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListTask"));
        return element;
    }
    //任务列表-负责人
    public WebElement missionListPrincipal() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListPrincipal"));
        return element;
    }
    //任务列表-优先级
    public WebElement missionListPriority() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListPriority"));
        return element;
    }
    //任务列表-推广产品
    public WebElement missionListPromotingProducts() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListPromotingProducts"));
        return element;
    }
    //任务列表-任务状态
    public WebElement missionListTaskStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListTaskStatus"));
        return element;
    }
    //任务列表-创建时间-开始
    public WebElement missionListCreateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListCreateTimeStart"));
        return element;
    }
    //任务列表-创建时间-结束
    public WebElement missionListCreateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListCreateTimeEnd"));
        return element;
    }
    //任务列表-搜索
    public WebElement missionListSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListSearch"));
        return element;
    }
    //任务列表-重置
    public WebElement missionListReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListReset"));
        return element;
    }
    //任务列表-详情
    public WebElement missionListDetails() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListDetails"));
        return element;
    }
    //任务列表-编辑
    public WebElement missionListEdit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEdit"));
        return element;
    }
    //任务列表-任务详情-编辑任务
    public WebElement missionDetailEditTask() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTask"));
        return element;
    }
    //任务列表-任务详情-编辑任务-任务名称
    public WebElement missionDetailEditTaskName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskName"));
        return element;
    }
    //任务列表-任务详情-编辑任务-负责人
    public WebElement missionDetailEditTaskPrincipal() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskPrincipal"));
        return element;
    }
    //任务列表-任务详情-编辑任务-优先级
    public WebElement missionDetailEditTaskPriority() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskPriority"));
        return element;
    }
    //任务列表-任务详情-编辑任务-执行时间-开始
    public WebElement missionDetailEditTaskExecutionTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskExecutionTimeStart"));
        return element;
    }
    //任务列表-任务详情-编辑任务-执行时间-结束
    public WebElement missionDetailEditTaskExecutionTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskExecutionTimeEnd"));
        return element;
    }
    //任务列表-任务详情-编辑任务-推广平台
    public WebElement missionDetailEditTaskMarketingPlatform() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskMarketingPlatform"));
        return element;
    }
    //任务列表-任务详情-编辑任务-推广地区
    public WebElement missionDetailEditTaskMarketingArea() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskMarketingArea"));
        return element;
    }
    //任务列表-任务详情-编辑任务-网红个数
    public WebElement missionDetailEditTaskKolNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskKolNumber"));
        return element;
    }
    //任务列表-任务详情-编辑任务-客户预算
    public WebElement missionDetailEditTaskClientBudget() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskClientBudget"));
        return element;
    }
    //任务列表-任务详情-编辑任务-对接客户
    public WebElement missionDetailEditTaskConnectCustomers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskConnectCustomers"));
        return element;
    }
    //任务列表-任务详情-编辑任务-推广产品
    public WebElement missionDetailEditTaskPromotingProducts() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskPromotingProducts"));
        return element;
    }
    //任务列表-任务详情-编辑任务-有无样品-有
    public WebElement missionDetailEditTaskAnySampleYes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskAnySampleYes"));
        return element;
    }
    //任务列表-任务详情-编辑任务-有无样品-无
    public WebElement missionDetailEditTaskAnySampleNo() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskAnySampleNo"));
        return element;
    }
    //任务列表-任务详情-编辑任务-推广产品图片
    public WebElement missionDetailEditTaskPromoteProductImages() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskPromoteProductImages"));
        return element;
    }
    //任务列表-任务详情-编辑任务-推广产品链接
    public WebElement missionDetailEditTaskPromoteProductLinks() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskPromoteProductLinks"));
        return element;
    }
    //任务列表-任务详情-编辑任务-推广产品落地页
    public WebElement missionDetailEditTaskPromoteProductLandingPage() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskPromoteProductLandingPage"));
        return element;
    }
    //任务列表-任务详情-编辑任务-任务描述
    public WebElement missionDetailEditTaskMissionDetails() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskMissionDetails"));
        return element;
    }
    //任务列表-任务详情-编辑任务-附件-上传文件
    public WebElement missionDetailEditTaskUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskUploadFiles"));
        return element;
    }
    //任务列表-任务详情-编辑任务-确认
    public WebElement missionDetailEditTaskSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskSubmit"));
        return element;
    }
    //任务列表-任务详情-编辑任务-关闭
    public WebElement missionDetailEditTaskCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditTaskCancel"));
        return element;
    }
    //任务列表-任务详情-子任务列表-子任务
    public WebElement missionDetailSubtasks() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailSubtasks"));
        return element;
    }
    //任务列表-任务详情-子任务列表-执行人
    public WebElement missionDetailExecutor() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailExecutor"));
        return element;
    }
    //任务列表-任务详情-子任务列表-搜索
    public WebElement missionDetailSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailSearch"));
        return element;
    }
    //任务列表-任务详情-子任务列表-重置
    public WebElement missionDetailReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailReset"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务
    public WebElement missionDetailCreateSubtasks() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailCreateSubtasks"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-编辑信息-子任务
    public WebElement missionDetailEditInformationSubtasks() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditInformationSubtasks"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-编辑信息-执行人
    public WebElement missionDetailEditInformationExecutor() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditInformationExecutor"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-编辑信息-关联网红
    public WebElement missionDetailEditInformationAssociatedPg() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditInformationAssociatedPg"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-编辑信息-联系方式
    public WebElement missionDetailEditInformationContactInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditInformationContactInformation"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-编辑信息-项目合作状态
    public WebElement missionDetailEditInformationProjectCooperationStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditInformationProjectCooperationStatus"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-编辑信息-物流单号
    public WebElement missionDetailEditInformationShipmentNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditInformationShipmentNumber"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-编辑信息-增加一条
    public WebElement missionDetailEditInformationAdd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditInformationAdd"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-编辑信息-上线链接
    public WebElement missionDetailEditInformationOnlineLink() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditInformationOnlineLink"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-编辑信息-备注
    public WebElement missionDetailEditInformationNote() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditInformationNote"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-编辑信息-确认
    public WebElement missionDetailEditInformationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditInformationSubmit"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-编辑信息-取消
    public WebElement missionDetailEditInformationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailEditInformationCancel"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-批量创建子任务-点击上传文件
    public WebElement missionDetailBatchUploadSubtasksUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailBatchUploadSubtasksUploadFiles"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-批量创建子任务-下载模板
    public WebElement missionDetailBatchUploadSubtasksDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailBatchUploadSubtasksDownloadTemple"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-批量创建子任务-确认
    public WebElement missionDetailBatchUploadSubtasksSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailBatchUploadSubtasksSubmit"));
        return element;
    }
    //任务列表-任务详情-子任务列表-创建子任务-批量创建子任务-关闭
    public WebElement missionDetailBatchUploadSubtasksCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionDetailBatchUploadSubtasksCancel"));
        return element;
    }
    //任务列表-编辑
    public WebElement taskListEdit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.taskListEdit"));
        return element;
    }
    //任务列表-编辑任务-任务名称
    public WebElement missionListEditTaskName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskName"));
        return element;
    }
    //任务列表-编辑任务-负责人
    public WebElement missionListEditTaskPrincipal() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskPrincipal"));
        return element;
    }
    //任务列表-编辑任务-任务状态
    public WebElement missionListEditTaskPriority() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskPriority"));
        return element;
    }
    //任务列表-编辑任务-执行时间-开始
    public WebElement missionListEditTaskExecutionTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskExecutionTimeStart"));
        return element;
    }
    //任务列表-编辑任务-执行时间-结束
    public WebElement missionListEditTaskExecutionTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskExecutionTimeEnd"));
        return element;
    }
    //任务列表-编辑任务-推广平台
    public WebElement missionListEditTaskMarketingPlatform() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskMarketingPlatform"));
        return element;
    }
    //任务列表-编辑任务-推广地区
    public WebElement missionListEditTaskMarketingArea() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskMarketingArea"));
        return element;
    }
    //任务列表-编辑任务-网红个数
    public WebElement missionListEditTaskPgNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskPgNumber"));
        return element;
    }
    //任务列表-编辑任务-客户预算
    public WebElement missionListEditTaskClientBudget() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskClientBudget"));
        return element;
    }
    //任务列表-编辑任务-对接客户
    public WebElement missionListEditTaskConnectCustomers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskConnectCustomers"));
        return element;
    }
    //任务列表-编辑任务-推广产品
    public WebElement missionListEditTaskPromotingProducts() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskPromotingProducts"));
        return element;
    }
    //任务列表-编辑任务-有无样品-有
    public WebElement missionListEditTaskSampleYes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskSampleYes"));
        return element;
    }
    //任务列表-编辑任务-有无样品-无
    public WebElement missionListEditTaskSampleNo() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskSampleNo"));
        return element;
    }
    //任务列表-编辑任务-推广产品图片
    public WebElement missionListEditTaskPromoteProductImages() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskPromoteProductImages"));
        return element;
    }
    //任务列表-编辑任务-推广产品链接
    public WebElement missionListEditTaskPromoteProductLink() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskPromoteProductLink"));
        return element;
    }
    //任务列表-编辑任务-推广产品落地页
    public WebElement missionListEditTaskPromoteProductLandingPage() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskPromoteProductLandingPage"));
        return element;
    }
    //任务列表-编辑任务-任务描述
    public WebElement missionListEditTaskDescription() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskDescription"));
        return element;
    }
    //任务列表-编辑任务-附件-上传文件
    public WebElement missionListEditTaskUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskUploadFiles"));
        return element;
    }
    //任务列表-编辑任务-确认
    public WebElement missionListEditTaskSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskSubmit"));
        return element;
    }
    //任务列表-编辑任务-关闭
    public WebElement missionListEditTaskCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskCancel"));
        return element;
    }
    //任务列表-编辑任务-完成
    public WebElement missionListEditTaskFinished() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskFinished"));
        return element;
    }
    //任务列表-编辑任务-删除
    public WebElement missionListEditTaskDelete() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.missionListEditTaskDelete"));
        return element;
    }
    //我的任务-任务
    public WebElement myTaskMission() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskMission"));
        return element;
    }
    //我的任务-负责人
    public WebElement myTaskPrincipal() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskPrincipal"));
        return element;
    }
    //我的任务-优先级
    public WebElement myTaskPriority() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskPriority"));
        return element;
    }
    //我的任务-对接客户
    public WebElement myTaskConnectCustomers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskConnectCustomers"));
        return element;
    }
    //我的任务-推广产品
    public WebElement myTaskPromotingProducts() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskPromotingProducts"));
        return element;
    }
    //我的任务-任务状态
    public WebElement myTaskStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskStatus"));
        return element;
    }
    //我的任务-创建时间-开始日期
    public WebElement myTaskCreateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskCreateTimeStart"));
        return element;
    }
    //我的任务-创建时间-结束日期
    public WebElement myTaskCreateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskCreateTimeEnd"));
        return element;
    }
    //我的任务-搜索
    public WebElement myTaskSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskSearch"));
        return element;
    }
    //我的任务-重置
    public WebElement myTaskReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskReset"));
        return element;
    }
    //我的任务-下载表格
    public WebElement myTaskDownloadExcel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskDownloadExcel"));
        return element;
    }
    //我的任务-详情
    public WebElement myTaskDetail() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskDetail"));
        return element;
    }
    //我的任务-编辑
    public WebElement myTaskEdit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskEdit"));
        return element;
    }
    //我的任务-完成
    public WebElement myTaskFinished() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskFinished"));
        return element;
    }
    //我的任务-删除
    public WebElement myTaskDelete() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myTaskDelete"));
        return element;
    }
    //我的任务-写邮件
    public WebElement myEmailWrite() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailWrite"));
        return element;
    }
    //我的任务-写邮件-收件人
    public WebElement myEmailWriteRecipient() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailWriteRecipient"));
        return element;
    }
    //我的任务-写邮件-抄送
    public WebElement myEmailWriteCC() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailWriteCC"));
        return element;
    }
    //我的任务-写邮件-主题
    public WebElement myEmailWriteTheme() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailWriteTheme"));
        return element;
    }
    //我的任务-写邮件-发件人
    public WebElement myEmailWriteSender() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailWriteSender"));
        return element;
    }
    //我的任务-写邮件-正文
    public WebElement myEmailWriteText() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailWriteText"));
        return element;
    }
    //我的任务-写邮件-上传附件
    public WebElement myEmailWriteUploadAttachment() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailWriteUploadAttachment"));
        return element;
    }
    //我的任务-写邮件-发送
    public WebElement myEmailWriteSend() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailWriteSend"));
        return element;
    }
    //我的邮件-收件箱
    public WebElement myEmailInbox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailInbox"));
        return element;
    }
    //我的邮件-发件箱
    public WebElement myEmailOutbox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailOutbox"));
        return element;
    }
    //我的邮件-邮件主题
    public WebElement myEmailSubject() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailSubject"));
        return element;
    }
    //我的邮件-发件人
    public WebElement myEmailSender() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailSender"));
        return element;
    }
    //我的邮件-收件人
    public WebElement myEmailRecipient() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailRecipient"));
        return element;
    }
    //我的邮件-状态
    public WebElement myEmailStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailStatus"));
        return element;
    }
    //我的邮件-发送时间-开始
    public WebElement myEmailSendTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailSendTimeStart"));
        return element;
    }
    //我的邮件-发送时间-结束
    public WebElement myEmailSendTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailSendTimeEnd"));
        return element;
    }
    //我的邮件-搜索
    public WebElement myEmailSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailSearch"));
        return element;
    }
    //我的邮件-重置
    public WebElement myEmailReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailReset"));
        return element;
    }
    //我的邮件-详情
    public WebElement myEmailDetail() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailDetail"));
        return element;
    }
    //我的邮件-删除
    public WebElement myEmailDelete() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.missionCenter.myEmailDelete"));
        return element;
    }
}