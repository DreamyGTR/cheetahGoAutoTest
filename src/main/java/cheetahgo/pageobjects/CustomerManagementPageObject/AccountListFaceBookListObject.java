package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;


/**
 * 内部运营平台-客户管理-账户列表-FaceBook列表元素封装
 */
public class AccountListFaceBookListObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CustomerBillFaceBookList);
    private WebDriver webDriver;

    public AccountListFaceBookListObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //Account ID
    public WebElement accountIDSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.accountIDSelect"));
        return element;
    }

    //客户类型
    public WebElement customerTypeSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.customerTypeSelect"));
        return element;
    }

    //注册时间
    public WebElement registrationTimeSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.registrationTimeSelect"));
        return element;
    }

    //客户 ID
    public WebElement customerIDInput() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.customerIDInput"));
        return element;
    }

    //新老客
    public WebElement newOldCustomersSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.newOldCustomersSelect"));
        return element;
    }

    //客户名称
    public WebElement customerNameSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.customerNameSelect"));
        return element;
    }

    //冻结状态
    public WebElement frozenStateSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.frozenStateSelect"));
        return element;
    }

    //开户主体
    public WebElement accountOpeningEntitySelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.accountOpeningEntitySelect"));
        return element;
    }

    //VB
    public WebElement VBSelect() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.VBSelect"));
        return element;
    }

    //新增账户
    public WebElement addAccountButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.addAccountButton"));
        return element;
    }

    //账户导入
    public WebElement accountImportButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.accountImportButton"));
        return element;
    }

    //批量冻结
    public WebElement batchFreezeButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.batchFreezeButton"));
        return element;
    }

    //批量修改新老客
    public WebElement batchModifyNewAndOldCustomersButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.batchModifyNewAndOldCustomersButton"));
        return element;
    }

    //批量修改客户名称
    public WebElement batchModifyCustomerNamesButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.batchModifyCustomerNamesButton"));
        return element;
    }

    //下载
    public WebElement downLoadButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.downLoadButton"));
        return element;
    }

    //搜索
    public WebElement searchButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.searchButton"));
        return element;
    }

    //编辑按钮
    public WebElement editButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.accountListFaceBookList.editButton"));
        return element;
    }

}
