package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

import java.util.List;

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

    //SAP Code下拉筛选框
    public WebElement SAPCodeInput() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.SAPCodeSelect"));
        return element;
    }

    //新增客户功能按钮
    public WebElement addCustomerButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.addCustomerButton"));
        return element;
    }

    //新增客户客户名称文本框

    //新增客户SAPCode文本框
    //新增客户客户类型下拉框
    //新增客户客户等级下拉框
    //新增客户销售下拉框
    //新增客户AM下拉框
    //新增客户优化师下拉框

    //分配销售功能按钮
    public WebElement distributeSalesButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeSalesButton"));
        return element;
    }

    //分配AM功能按钮
    public WebElement distributeAMButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeAMButton"));
        return element;
    }
    //分配优化师功能按钮
    public WebElement distributeOptimistButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.distributeOptimistButton"));
        return element;
    }
    //绑定SAP Code功能按钮
    public WebElement bindingSAPCodeButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.bindingSAPCodeButton"));
        return element;
    }

    //下载按钮
    public WebElement downLoadButtonButton() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.downLoadButton"));
        return element;
    }


}
