package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

/**
 * 内部运营平台客户管理-客户列表二级菜单页面元素封装类
 */
public class CustomerListObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CustomerAccountListProperties);
    private WebDriver webDriver;

    public CustomerListObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //客户ID下拉文本框
    public WebElement customerId() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.customerId"));
        return element;
    }

    //搜索按钮
    public WebElement selectButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.selectButton"));
        return element;
    }

    //联合搜索下拉列表
    public WebElement uniteSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.uniteSelect"));
        return element;
    }

    //SAP客户名称下拉筛选框
    public WebElement customerNameSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.customerNameSelect"));
        return element;
    }

    //客户类型下拉筛选框
    public WebElement customerTypeSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.customerTypeSelect"));
        return element;
    }

    //客户等级下拉筛选框
    public WebElement customerLevelSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.customerLevelSelect"));
        return element;
    }

    //所属销售下拉筛选框
    public WebElement customerSalesSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.customerSalesSelect"));
        return element;
    }

    //所属AM下拉筛选框
    public WebElement customerAMSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.customerAMSelect"));
        return element;
    }

    //所属优化师下拉筛选框
    public WebElement customerOptimistSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.customerOptimistSelect"));
        return element;
    }

    //SAP Code文本框
    public WebElement SAPCodeInput() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.SAPCodeInput"));
        return element;
    }

    //日期选择器
    public WebElement createDatePickers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.createDatePickers"));
        return element;
    }

    //日期筛选器开始时间
    public WebElement datePickersBegin() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.datePickersBegin"));
        return element;
    }
    //日期选择器结束时间

    public WebElement datePickersEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.datePickersEnd"));
        return element;
    }

    //新增客户功能按钮
    public WebElement addCustomerButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerButton"));
        return element;
    }

    //新增客户客户名称文本框
    public WebElement addCustomerNameInput() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerNameInput"));
        return element;
    }

    //新增客户SAPCode文本框
    public WebElement addCustomerSAPCodeInput() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerSAPCodeInput"));
        return element;
    }

    //新增客户客户类型下拉框
    public WebElement addCustomerTypeSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerTypeSelect"));
        return element;
    }

    //新增客户客户等级下拉框
    public WebElement addCustomerLevelSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerLevelSelect"));
        return element;
    }

    //新增客户销售下拉框
    public WebElement addCustomerSalesSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerSalesSelect"));
        return element;
    }

    //新增客户AM下拉框
    public WebElement addCustomerAMSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerAMSelect"));
        return element;
    }

    //新增客户优化师下拉框
    public WebElement addCustomerOptimistSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerOptimistSelect"));
        return element;
    }

    //新增客户确认按钮
    public WebElement addCustomerConfirmButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerConfirmButton"));
        return element;
    }

    //新增客户联系人姓名
    public WebElement addCustomerContactName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerContactName"));
        return element;
    }

    //新增客户联系人手机号
    public WebElement addCustomerContactPhone() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerContactPhone"));
        return element;
    }

    //新增客户联系人Email
    public WebElement addCustomerContactEmail() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerContactEmail"));
        return element;
    }

    //新增客户上一步按钮
    public WebElement addCustomerBackButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerBackButton"));
        return element;
    }

    //新增客户确认按钮
    public WebElement addCustomerContactConfirmButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.addCustomerContactConfirmButton"));
        return element;
    }

    //分配销售功能按钮
    public WebElement distributeSalesButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.distributeSalesButton"));
        return element;
    }

    //分配销售下拉框
    public WebElement distributeSalesSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.distributeSalesSelect"));
        return element;
    }

    //分配销售确定按钮
    public WebElement distributeSalesDetermine() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.distributeSalesDetermine"));
        return element;
    }

    //分配销售取消按钮
    public WebElement distributeSalesCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.distributeSalesCancel"));
        return element;
    }

    //列表数据单选
    public WebElement ListDataRadio() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.ListDataRadio"));
        return element;
    }


    //分配AM功能按钮
    public WebElement distributeAMButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.distributeAMButton"));
        return element;
    }

    //分配AM下拉框
    public WebElement distributeAMSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.distributeAMSelect"));
        return element;
    }

    //分配AM确定按钮
    public WebElement distributeAMDetermine() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.distributeAMDetermine"));
        return element;
    }

    //分配AM取消按钮
    public WebElement distributeAMCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.distributeAMCancel"));
        return element;
    }

    //分配优化师功能按钮
    public WebElement distributeOptimistButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.distributeOptimistButton"));
        return element;
    }

    //分配优化师下拉框
    public WebElement distributeOptimistSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeOptimistSelect"));
        return element;
    }

    //分配优化师确定按钮
    public WebElement distributeOptimistDetermine() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.distributeOptimistDetermine"));
        return element;
    }

    //分配优化师取消按钮
    public WebElement distributeOptimistCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.distributeOptimistCancel"));
        return element;
    }

    //绑定SAP Code功能按钮
    public WebElement bindingSAPCodeButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.bindingSAPCodeButton"));
        return element;
    }

    //下载按钮
    public WebElement downLoadButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.downLoadButton"));
        return element;
    }

    //查看财务信息
    public WebElement selectFinancialInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.selectFinancialInformation"));
        return element;
    }

    //查看财务信息弹窗关闭按钮
    public WebElement selectFinancialInformationCloseButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.selectFinancialInformationCloseButton"));
        return element;
    }

    //查看联系人信息
    public WebElement selectContactInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.selectContactInformation"));
        return element;
    }

    //查看联系人信息弹窗关闭按钮
    public WebElement selectContactInformationCloseButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.selectContactInformationCloseButton"));
        return element;
    }

    //编辑客户信息
    public WebElement editCustomerInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editCustomerInformation"));
        return element;
    }

    //编辑客户信息下一步确认按钮
    public WebElement editCustomerInformationDefineNextStep() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editCustomerInformationDefineNextStep"));
        return element;
    }

    //编辑客户信息确认按钮
    public WebElement editCustomerInformationDefine() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editCustomerInformationDefine"));
        return element;
    }

    //编辑财务信息
    public WebElement editFinancialInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editFinancialInformation"));
        return element;
    }

    //编辑财务信息确认按钮
    public WebElement editFinancialInformationDetermineButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editFinancialInformationDetermineButton"));
        return element;
    }

    //编辑财务信息发票抬头(签约主体文本框)
    public WebElement editFinancialInformationInvoiceHeader() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editFinancialInformationInvoiceHeader"));
        return element;
    }

    //编辑财务信息媒体文本框
    public WebElement editFinancialInformationInvoiceHeaderMedia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editFinancialInformationInvoiceHeaderMedia"));
        return element;
    }

    //编辑财务信息发票项目文本框
    public WebElement editFinancialInformationInvoiceItem() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editFinancialInformationInvoiceItem"));
        return element;
    }

    //编辑财务信息Account No文本框
    public WebElement editFinancialInformationAccountNo() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editFinancialInformationAccountNo"));
        return element;
    }

    //编辑联系人信息
    public WebElement editContactInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editContactInformation"));
        return element;
    }

    //编辑联系人信息-姓名
    public WebElement editContactInformationName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editContactInformationName"));
        return element;
    }

    //编辑联系人信息-手机号
    public WebElement editContactInformationPhone() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editContactInformationPhone"));
        return element;
    }

    //编辑联系人信息-Email
    public WebElement editContactInformationEmail() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editContactInformationEmail"));
        return element;
    }

    //编辑联系人信息-Email
    public WebElement editContactInformationConfirmButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.editContactInformationConfirmButton"));
        return element;
    }

    //客户列表单选框
    public WebElement customerListChoice() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.customerListChoice"));
        return element;
    }

    //客户列表更新时间链接
    public WebElement updateTimeLink() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerList.updateTimeLink"));
        return element;
    }

}
