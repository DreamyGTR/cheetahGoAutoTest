package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class PaymentManagementObject{
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public PaymentManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //SAP客户名称
    public WebElement sapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.SAPCustomerName"));
        return element;
    }
    //所属销售
    public WebElement salesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.SalesName"));
        return element;
    }
    //所属AM
    public WebElement amName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.AMName"));
        return element;
    }
    //所属AM
    public WebElement description() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.Description"));
        return element;
    }
    //水单状态
    public WebElement billStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.BillStatus"));
        return element;
    }
    //到账时间区间(开始)
    public WebElement receiptTimeIntervalStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.ReceiptTimeIntervalStart"));
        return element;
    }
    //到账时间区间(结束)
    public WebElement receiptTimeIntervalEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.ReceiptTimeIntervalEnd"));
        return element;
    }
    //账户分类
    public WebElement accountClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.AccountClassification"));
        return element;
    }
    //类型
    public WebElement paymenttype() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.Type"));
        return element;
    }
    //搜索金额（起始值）
    public WebElement searchAmountStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.SearchAmountStart"));
        return element;
    }
    //搜索金额（结束值）
    public WebElement searchAmountEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.SearchAmountEnd"));
        return element;
    }
    //到款ID
    public WebElement paymentID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.PaymentID"));
        return element;
    }
    //设置汇率
    public WebElement setExchangeRate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.SetExchangeRate"));
        return element;
    }
    //设置汇率-选择类型-当日汇率
    public WebElement exchangeRateOfTheDay() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.ExchangeRateOfTheDay"));
        return element;
    }
    //设置汇率-选择类型-月均汇率
    public WebElement averageMonthlyExchangeRate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.AverageMonthlyExchangeRate"));
        return element;
    }
    //设置汇率-选择日期
    public WebElement selectDate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.SelectDate"));
        return element;
    }
    //设置汇率-汇率
    public WebElement ExchangeRate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.SelectDate"));
        return element;
    }
    //设置汇率-下载历史汇率
    public WebElement downloadHistoricalExchangeRates() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.DownloadHistoricalExchangeRates"));
        return element;
    }
    //设置汇率-确定
    public WebElement settingRateSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.SettingRateSubmit"));
        return element;
    }
    //设置汇率-取消
    public WebElement settingRateCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.SettingRateCancel"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.Search"));
        return element;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.Download"));
        return element;
    }
    //批量导入
    public WebElement batchImport() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.BatchImport"));
        return element;
    }
    //批量导入-上传文件
    public WebElement uploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.UploadFiles"));
        return element;
    }
    //批量导入-下载模板
    public WebElement downloadTemplate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.DownloadTemplate"));
        return element;
    }
    //批量导入-确定
    public WebElement batchImportSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.BatchImportSubmit"));
        return element;
    }
    //批量导入-取消
    public WebElement batchImportCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.BatchImportCancel"));
        return element;
    }
    //新增到款
    public WebElement addNewPayment() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.AddNewPayment"));
        return element;
    }
    //新增到款-到款日期
    public WebElement paymentDate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.PaymentDate"));
        return element;
    }
    //新增到款-账户分类
    public WebElement newPaymentAccountClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.NewPaymentAccountClassification"));
        return element;
    }
    //新增到款-Description
    public WebElement newPaymentDescription() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.NewPaymentDescription"));
        return element;
    }
    //新增到款-到款金额
    public WebElement amountReceived() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.AmountReceived"));
        return element;
    }
    //新增到款-财务收款金额（美元）
    public WebElement financialReceiptAmountDollar() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.FinancialReceiptAmountDollar"));
        return element;
    }
    //新增到款-财务收款金额（人民币）
    public WebElement financialReceiptAmountCNY() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.FinancialReceiptAmountCNY"));
        return element;
    }
    //新增到款-汇率/手续费/交易单号
    public WebElement exchangeRateOrHandlingFeeOrTransactionNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.ExchangeRateOrHandlingFeeOrTransactionNumber"));
        return element;
    }
    //新增到款-净额/手续费/税额/交易单号
    public WebElement netAmountOrHandlingFeeOrTransactionNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.NetAmountOrHandlingFeeOrTransactionNumber"));
        return element;
    }
    //新增到款-取消
    public WebElement addNewPaymentCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.PaymentManagement.AddNewPaymentCancel"));
        return element;
    }
}
