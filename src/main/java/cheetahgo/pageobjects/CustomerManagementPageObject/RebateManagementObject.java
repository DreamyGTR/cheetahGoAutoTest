package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class RebateManagementObject{
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public RebateManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //SAP客户名称
    public WebElement sapCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.SAPCustomerName"));
        return element;
    }
    //所属销售
    public WebElement salesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.SalesName"));
        return element;
    }
    //年
    public WebElement year() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.Year"));
        return element;
    }
    //季度
    public WebElement quarter() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.Quarter"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.Search"));
        return element;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.Download"));
        return element;
    }
    //编辑
    public WebElement edit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.Edit"));
        return element;
    }
    //抵扣
    public WebElement deduction() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.Deduction"));
        return element;
    }
    //重新计算返点
    public WebElement recalculateRebates() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.RecalculateRebates"));
        return element;
    }
    //编辑返点-总返点金额输入框
    public WebElement totalRebateAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.TotalRebateAmount"));
        return element;
    }
    //编辑返点-抵扣账单
    public WebElement deductBill() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.DeductBill"));
        return element;
    }
    //编辑返点-返点充值
    public WebElement rebateRecharge() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.RebateRecharge"));
        return element;
    }
    //编辑返点-返点充值-返点充值金额输入框
    public WebElement rebateRechargeAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.RebateRechargeAmount"));
        return element;
    }
    //编辑返点-确定
    public WebElement editRebatesSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.EditRebatesSubmit"));
        return element;
    }
    //编辑返点-取消
    public WebElement editRebatesCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.EditRebatesCancel"));
        return element;
    }
    //编辑返点-抵扣账单-抵扣月份
    public WebElement deductionMonth() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.DeductionMonth"));
        return element;
    }
    //编辑返点-抵扣账单-抵扣相应金额
    public WebElement deductCorrespondingAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.DeductCorrespondingAmount"));
        return element;
    }
    //确认重新计算返点-确定
    public WebElement submit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.Submit"));
        return element;
    }
    //确认重新计算返点-取消
    public WebElement cancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.RebateManagement.Cancel"));
        return element;
    }
}
