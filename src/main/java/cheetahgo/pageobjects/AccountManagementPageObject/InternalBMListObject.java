package cheetahgo.pageobjects.AccountManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class InternalBMListObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public InternalBMListObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //From-CID
    public WebElement bmPlatformID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.bmPlatformID"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.search"));
        return element;
    }
    //新增内部BM
    public WebElement addInternalBM() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.addInternalBM"));
        return element;
    }
    //新增内部BM-商务平台ID
    public WebElement addInternalBMPlatformID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.addInternalBMPlatformID"));
        return element;
    }
    //新增内部BM-所属客户类型
    public WebElement addInternalBMCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.addInternalBMCustomerType"));
        return element;
    }
    //新增内部BM-平台描述
    public WebElement addInternalBMPlatformDescription() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.addInternalBMPlatformDescription"));
        return element;
    }
    //新增内部BM-确定
    public WebElement addInternalBMSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.addInternalBMSubmit"));
        return element;
    }
    //新增内部BM-取消
    public WebElement addInternalBMCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.addInternalBMCancel"));
        return element;
    }
    //编辑
    public WebElement edit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.edit"));
        return element;
    }
    //编辑-所属客户类型
    public WebElement editCustomerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.editCustomerType"));
        return element;
    }
    //编辑-平台描述
    public WebElement editPlatformDescription() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.editPlatformDescription"));
        return element;
    }
    //编辑-确定
    public WebElement editSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.editSubmit"));
        return element;
    }
    //编辑-取消
    public WebElement editCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.editCancel"));
        return element;
    }
    //删除
    public WebElement delete() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.delete"));
        return element;
    }
    //删除-取消
    public WebElement deleteCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.deleteCancel"));
        return element;
    }
    //删除-确定
    public WebElement deleteSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.internalBMList.deleteSubmit"));
        return element;
    }
}