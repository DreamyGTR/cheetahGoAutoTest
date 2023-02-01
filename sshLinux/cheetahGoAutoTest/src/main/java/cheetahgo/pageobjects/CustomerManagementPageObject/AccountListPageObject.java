package cheetahgo.pageobjects.CustomerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.customerManagement.customerManagement.CustomerTypeSelect"));
        return element;
    }
    //客户等级下拉筛选框
    //所属销售下拉筛选框
    //所属AM下拉筛选框
    //所属优化师下拉筛选框
    //SAP Code下拉筛选框

}
