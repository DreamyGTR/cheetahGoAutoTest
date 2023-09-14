package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class LoanManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public LoanManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //SAP客户名称
    public WebElement sapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.SAPCustomerName"));
        return element;
    }
    //借款日期（开始）
    public WebElement borrowingDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.BorrowingDateStart"));
        return element;
    }
    //借款日期（结束）
    public WebElement borrowingDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.BorrowingDateEnd"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.Search"));
        return element;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.Download"));
        return element;
    }
    //新增借款
    public WebElement newBorrowing() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.NewBorrowing"));
        return element;
    }
    //新增借款-SAP客户名称
    public WebElement newBorrowingSapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.NewBorrowingSapCustomerName"));
        return element;
    }
    //新增借款-借款金额
    public WebElement newBorrowingLoanAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.NewBorrowingLoanAmount"));
        return element;
    }
    //新增借款-借款日期
    public WebElement newBorrowingLoanDate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.NewBorrowingLoanDate"));
        return element;
    }
    //新增借款-是否检查额度-是
    public WebElement newBorrowingCheckTheAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.NewBorrowingCheckTheAmount"));
        return element;
    }
    //新增借款-是否检查额度-否
    public WebElement newBorrowingNotCheckTheAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.NewBorrowingNotCheckTheAmount"));
        return element;
    }
    //新增借款-备注
    public WebElement newBorrowingNote() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.NewBorrowingNote"));
        return element;
    }
    //新增借款-确定
    public WebElement newBorrowingSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.NewBorrowingSubmit"));
        return element;
    }
    //新增借款-取消
    public WebElement newBorrowingCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.NewBorrowingCancel"));
        return element;
    }
    //批量导入
    public WebElement batchImport() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.BatchImport"));
        return element;
    }
    //批量导入-上传文件
    public WebElement batchImportUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.BatchImportUploadFiles"));
        return element;
    }
    //批量导入-下载模板
    public WebElement batchImportDownloadTemplate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.BatchImportDownloadTemplate"));
        return element;
    }
    //批量导入-确定
    public WebElement batchImportSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.BatchImportSubmit"));
        return element;
    }
    //批量导入-取消
    public WebElement batchImportCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.LoanManagement.BatchImportCancel"));
        return element;
    }
}
