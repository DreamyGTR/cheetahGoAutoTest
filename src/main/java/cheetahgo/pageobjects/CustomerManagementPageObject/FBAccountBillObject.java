package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class FBAccountBillObject{
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public FBAccountBillObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //SAP客户名称
    public WebElement sapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.SAPCustomerName"));
        return element;
    }
    //所属销售
    public WebElement salesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.SalesName"));
        return element;
    }
    //所属AM
    public WebElement amName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.AMName"));
        return element;
    }
    //Account ID
    public WebElement accountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.AccountID"));
        return element;
    }
    //账单类型
    public WebElement accountType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.AccountType"));
        return element;
    }
    //账单月份
    public WebElement billMonth() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.BillMonth"));
        return element;
    }
    //仅显示信息不完整账单勾选框
    public WebElement onlyDisplaysIncompleteInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.OnlyDisplaysIncompleteInformation"));
        return element;
    }
    //上传账单
    public WebElement uploadBill() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.UploadBill"));
        return element;
    }
    //上传账单-上传文件
    public WebElement uploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.UploadFiles"));
        return element;
    }
    //上传账单-输入Invoice ID
    public WebElement enterInvoiceID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.EnterInvoiceID"));
        return element;
    }
    //上传账单-输入账单金额
    public WebElement enterBillAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.EnterBillAmount"));
        return element;
    }
    //上传账单-选择归属的CID
    public WebElement selectAttributedCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.SelectAttributedCID"));
        return element;
    }
    //上传账单-选择账单月份
    public WebElement selectBillingMonth() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.SelectBillingMonth"));
        return element;
    }
    //上传账单-确定
    public WebElement uploadBillSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.UploadBillSubmit"));
        return element;
    }
    //上传账单-取消
    public WebElement uploadBillCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.UploadBillCancel"));
        return element;
    }
    //确认月份账单
    public WebElement confirmMonthlyBill() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.ConfirmMonthlyBill"));
        return element;
    }
    //下载完整账单
    public WebElement downloadFullBill() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.DownloadFullBill"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.FBAccountBill.Search"));
        return element;
    }
}
