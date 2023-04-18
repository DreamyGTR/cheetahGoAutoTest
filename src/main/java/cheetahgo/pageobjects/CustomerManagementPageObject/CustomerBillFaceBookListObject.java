package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;


/**
 * 内部运营平台-客户管理-账户列表-FaceBook列表元素封装
 */
public class CustomerBillFaceBookListObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.AccountListPageProperties);
    private WebDriver webDriver;

    public CustomerBillFaceBookListObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }


    //Account ID
    public WebElement accountIDSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.accountIDSelect"));
        return element;
    }

    //客户类型
    public WebElement customerTypeSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.customerTypeSelect"));
        return element;
    }

    //注册时间
    public WebElement registrationTimeSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.registrationTimeSelect"));
        return element;
    }

    //客户 ID
    public WebElement customerIDInput() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.customerIDInput"));
        return element;
    }

    //新老客
    public WebElement newOldCustomersSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.newOldCustomersSelect"));
        return element;
    }

    //客户名称
    public WebElement customerNameSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.customerNameSelect"));
        return element;
    }

    //冻结状态
    public WebElement frozenStateSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.frozenStateSelect"));
        return element;
    }

    //开户主体
    public WebElement accountOpeningEntitySelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.accountOpeningEntitySelect"));
        return element;
    }

    //VB
    public WebElement VBSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.VBSelect"));
        return element;
    }

    //新增账户
    public WebElement addAccountButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.addAccountButton"));
        return element;
    }

    //账户导入
    public WebElement accountImportButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.accountImportButton"));
        return element;
    }

    //批量冻结
    public WebElement batchFreezeButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.batchFreezeButton"));
        return element;
    }

    //批量修改新老客
    public WebElement batchModifyNewAndOldCustomersButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.batchModifyNewAndOldCustomersButton"));
        return element;
    }

    //批量修改客户名称
    public WebElement batchModifyCustomerNamesButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.batchModifyCustomerNamesButton"));
        return element;
    }

    //下载
    public WebElement downLoadButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.searchButton"));
        return element;
    }

    //搜索
    public WebElement searchButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.downLoadButton"));
        return element;
    }

    //编辑按钮
    public WebElement editButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerBillFaceBook.editButton"));
        return element;
    }

}
