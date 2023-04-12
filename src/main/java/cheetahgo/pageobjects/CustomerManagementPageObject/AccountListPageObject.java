package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

/**
 * 内部运营平台客户管理-账号列表二级菜单页面元素封装类
 */
public class AccountListPageObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.AccountListPageProperties);
    private WebDriver webDriver;

    public AccountListPageObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //客户ID下拉文本框
    public WebElement customerId() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerId"));
        return element;
    }

    //搜索按钮
    public WebElement selectButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.selectButton"));
        return element;
    }

    //联合搜索下拉列表
    public WebElement uniteSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.uniteSelect"));
        return element;
    }

    //SAP客户名称下拉筛选框
    public WebElement customerNameSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerNameSelect"));
        return element;
    }

    //客户类型下拉筛选框
    public WebElement customerTypeSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerTypeSelect"));
        return element;
    }

    //客户等级下拉筛选框
    public WebElement customerLevelSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerLevelSelect"));
        return element;
    }

    //所属销售下拉筛选框
    public WebElement customerSalesSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerSalesSelect"));
        return element;
    }

    //所属AM下拉筛选框
    public WebElement customerAMSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerAMSelect"));
        return element;
    }

    //所属优化师下拉筛选框
    public WebElement customerOptimistSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerOptimistSelect"));
        return element;
    }

    //SAP Code文本框
    public WebElement SAPCodeInput() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.SAPCodeInput"));
        return element;
    }

    //日期选择器
    public WebElement createDatePickers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.createDatePickers"));
        return element;
    }

    //日期筛选器开始时间
    public WebElement datePickersBegin() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.datePickersBegin"));
        return element;
    }
    //日期选择器结束时间

    public WebElement datePickersEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.datePickersEnd"));
        return element;
    }

    //新增客户功能按钮
    public WebElement addCustomerButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerButton"));
        return element;
    }

    //新增客户客户名称文本框
    public WebElement addCustomerNameInput() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerNameInput"));
        return element;
    }

    //新增客户SAPCode文本框
    public WebElement addCustomerSAPCodeInput() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerSAPCodeInput"));
        return element;
    }

    //新增客户客户类型下拉框
    public WebElement addCustomerTypeSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerTypeSelect"));
        return element;
    }

    //新增客户客户等级下拉框
    public WebElement addCustomerLevelSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerLevelSelect"));
        return element;
    }

    //新增客户销售下拉框
    public WebElement addCustomerSalesSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerSalesSelect"));
        return element;
    }

    //新增客户AM下拉框
    public WebElement addCustomerAMSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerAMSelect"));
        return element;
    }

    //新增客户优化师下拉框
    public WebElement addCustomerOptimistSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerOptimistSelect"));
        return element;
    }

    //新增客户确认按钮
    public WebElement addCustomerConfirmButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerConfirmButton"));
        return element;
    }

    //新增客户联系人姓名
    public WebElement addCustomerContactName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerContactName"));
        return element;
    }

    //新增客户联系人手机号
    public WebElement addCustomerContactPhone() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerContactPhone"));
        return element;
    }

    //新增客户联系人Email
    public WebElement addCustomerContactEmail() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerContactEmail"));
        return element;
    }

    //新增客户上一步按钮
    public WebElement addCustomerBackButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerBackButton"));
        return element;
    }

    //新增客户确认按钮
    public WebElement addCustomerContactConfirmButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerContactConfirmButton"));
        return element;
    }

    //分配销售功能按钮
    public WebElement distributeSalesButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeSalesButton"));
        return element;
    }

    //分配销售下拉框
    public WebElement distributeSalesSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeSalesSelect"));
        return element;
    }

    //分配销售确定按钮
    public WebElement distributeSalesDetermine() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeSalesDetermine"));
        return element;
    }

    //分配销售取消按钮
    public WebElement distributeSalesCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeSalesCancel"));
        return element;
    }

    //列表数据单选
    public WebElement ListDataRadio() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.ListDataRadio"));
        return element;
    }


    //分配AM功能按钮
    public WebElement distributeAMButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeAMButton"));
        return element;
    }

    //分配AM下拉框
    public WebElement distributeAMSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeAMSelect"));
        return element;
    }

    //分配AM确定按钮
    public WebElement distributeAMDetermine() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeAMDetermine"));
        return element;
    }

    //分配AM取消按钮
    public WebElement distributeAMCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeAMCancel"));
        return element;
    }

    //分配优化师功能按钮
    public WebElement distributeOptimistButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeOptimistButton"));
        return element;
    }

    //分配优化师下拉框
    public WebElement distributeOptimistSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeOptimistSelect"));
        return element;
    }

    //分配优化师确定按钮
    public WebElement distributeOptimistDetermine() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeOptimistDetermine"));
        return element;
    }

    //分配优化师取消按钮
    public WebElement distributeOptimistCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeOptimistCancel"));
        return element;
    }

    //绑定SAP Code功能按钮
    public WebElement bindingSAPCodeButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.bindingSAPCodeButton"));
        return element;
    }

    //下载按钮
    public WebElement downLoadButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.downLoadButton"));
        return element;
    }

    //查看财务信息
    public WebElement selectFinancialInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.selectFinancialInformation"));
        return element;
    }

    //查看财务信息弹窗关闭按钮
    public WebElement selectFinancialInformationCloseButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.selectFinancialInformationCloseButton"));
        return element;
    }

    //查看联系人信息
    public WebElement selectContactInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.selectContactInformation"));
        return element;
    }

    //查看联系人信息弹窗关闭按钮
    public WebElement selectContactInformationCloseButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.selectContactInformationCloseButton"));
        return element;
    }

    //编辑客户信息
    public WebElement editCustomerInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editCustomerInformation"));
        return element;
    }

    //编辑客户信息下一步确认按钮
    public WebElement editCustomerInformationDefineNextStep() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editCustomerInformationDefineNextStep"));
        return element;
    }

    //编辑客户信息确认按钮
    public WebElement editCustomerInformationDefine() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editCustomerInformationDefine"));
        return element;
    }

    //编辑财务信息
    public WebElement editFinancialInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editFinancialInformation"));
        return element;
    }

    //编辑财务信息确认按钮
    public WebElement editFinancialInformationDetermineButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editFinancialInformationDetermineButton"));
        return element;
    }

    //编辑财务信息发票抬头(签约主体文本框)
    public WebElement editFinancialInformationInvoiceHeader() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editFinancialInformationInvoiceHeader"));
        return element;
    }

    //编辑财务信息媒体文本框
    public WebElement editFinancialInformationInvoiceHeaderMedia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editFinancialInformationInvoiceHeaderMedia"));
        return element;
    }

    //编辑财务信息发票项目文本框
    public WebElement editFinancialInformationInvoiceItem() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editFinancialInformationInvoiceItem"));
        return element;
    }

    //编辑财务信息Account No文本框
    public WebElement editFinancialInformationAccountNo() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editFinancialInformationAccountNo"));
        return element;
    }

    //编辑联系人信息
    public WebElement editContactInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editContactInformation"));
        return element;
    }

    //编辑联系人信息-姓名
    public WebElement editContactInformationName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editContactInformationName"));
        return element;
    }

    //编辑联系人信息-手机号
    public WebElement editContactInformationPhone() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editContactInformationPhone"));
        return element;
    }

    //编辑联系人信息-Email
    public WebElement editContactInformationEmail() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editContactInformationEmail"));
        return element;
    }

    //编辑联系人信息-Email
    public WebElement editContactInformationConfirmButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.editContactInformationConfirmButton"));
        return element;
    }

    //客户列表单选框
    public WebElement customerListChoice() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.customerListChoice"));
        return element;
    }

    //客户列表更新时间链接
    public WebElement updateTimeLink() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.updateTimeLink"));
        return element;
    }

}
