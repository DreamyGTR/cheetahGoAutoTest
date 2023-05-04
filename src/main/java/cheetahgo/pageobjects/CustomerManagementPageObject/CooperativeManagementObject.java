package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class CooperativeManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public CooperativeManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //联合搜索
    public WebElement federatedSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.FederatedSearch"));
        return element;
    }

    //SAP客户名称
    public WebElement sAPCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.SAPCustomerName"));
        return element;
    }

    //所属销售
    public WebElement sales() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.Sales"));
        return element;
    }

    //所属AM
    public WebElement aM() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.AM"));
        return element;
    }

    //所属优化师
    public WebElement optimist() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.Optimist"));
        return element;
    }

    //客户类别
    public WebElement customerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.CustomerType"));
        return element;
    }

    //合作开始时间
    public WebElement cooperationStartTime() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.CooperationStartTime"));
        return element;
    }

    //合作开始时间开始时间
    public WebElement cooperationStartTimeBegin() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.CooperationStartTimeBegin"));
        return element;
    }

    //合作开始时间结束时间
    public WebElement cooperationStartTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.CooperationStartTimeEnd"));
        return element;
    }

    //新增合作记录
    public WebElement addCollaborationRecord() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.AddCollaborationRecord"));
        return element;
    }

    //新增合作记录弹窗页面元素封装
    //SAP名称
    public WebElement sAPName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.SAPName"));
        return element;
    }

    //客户类别
    public WebElement cooperativeCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.CooperativeCustomerType"));
        return element;
    }

    //总额度(USD)
    public WebElement totalAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.TotalAmount"));
        return element;
    }

    //账期类型
    public WebElement accountingPeriodType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.AccountingPeriodType"));
        return element;
    }

    //账期(天)
    public WebElement accountPeriod() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.AccountPeriod"));
        return element;
    }

    //人民币合同税率
    public WebElement contractTaxRateInRMB() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.ContractTaxRateInRMB"));
        return element;
    }

    //SAP曾用名-委托方1
    public WebElement sAPFormerName_Principal1() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.SAPFormerName_Principal1"));
        return element;
    }

    //合同有效期
    public WebElement durationOfContract() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.DurationOfContract"));
        return element;
    }

    //老客返点
    public WebElement regularCustomerRebates() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.RegularCustomerRebates"));
        return element;
    }

    //老客返点至
    public WebElement regularCustomerRebatesTo() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.RegularCustomerRebatesTo"));
        return element;
    }

    //老客返点比例为
    public WebElement regularCustomerRebateRatio() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.RegularCustomerRebateRatio"));
        return element;
    }

    //一键复制老客返点
    public WebElement copyRepeatCustomerRebates() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.CopyRepeatCustomerRebates"));
        return element;
    }

    //超期扣点
    public WebElement lateDeduction() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.LateDeduction"));
        return element;
    }

    //超期扣点比例
    public WebElement percentageOfOverdueDeductionPoints() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.PercentageOfOverdueDeductionPoints"));
        return element;
    }

    //超期扣点比例为：
    public WebElement percentageOfOverdueDeductionPointsIs() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.PercentageOfOverdueDeductionPointsIs"));
        return element;
    }

    //超期扣点备注:
    public WebElement overdueDeductionRemarks() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.OverdueDeductionRemarks"));
        return element;
    }

    //合作备注
    public WebElement collaborationNotes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.CollaborationNotes"));
        return element;
    }

    //确定按钮
    public WebElement okButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.OkButton"));
        return element;
    }

    //取消按钮
    public WebElement cancelButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.CancelButton"));
        return element;
    }


    //批量导入
    public WebElement batchImport() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.BatchImport"));
        return element;
    }

    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.Search"));
        return element;
    }

    //下载操作日志
    public WebElement downloadOperationLog() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.DownloadOperationLog"));
        return element;
    }

    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.Download"));
        return element;
    }

    //编辑合作记录
    public WebElement editCollaborationRecord() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.CooperativeManagement.EditCollaborationRecord"));
        return element;
    }
}
