package cheetahgo.pageobjects.WorkOrderSystemPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class RoleManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public RoleManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //媒体
    public WebElement media() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.media"));
        return element;
    }
    //角色
    public WebElement role() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.role"));
        return element;
    }
    //角色Leader
    public WebElement roleLeader() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.roleLeader"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.search"));
        return element;
    }
    //重置
    public WebElement reset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.reset"));
        return element;
    }
    //新增角色
    public WebElement addRole() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.addRole"));
        return element;
    }
    //新增角色-媒体
    public WebElement addRoleMedia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.addRoleMedia"));
        return element;
    }
    //新增角色-角色名称
    public WebElement addRoleName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.addRoleName"));
        return element;
    }
    //新增角色-角色Leader
    public WebElement addRoleLeader() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.addRoleLeader"));
        return element;
    }
    //新增角色-确定
    public WebElement addRoleSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.addRoleSubmit"));
        return element;
    }
    //新增角色-取消
    public WebElement addRoleCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.addRoleCancel"));
        return element;
    }
    //编辑
    public WebElement edit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.edit"));
        return element;
    }
    //编辑-角色名称
    public WebElement editRoleName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.editRoleName"));
        return element;
    }
    //编辑-角色Leader
    public WebElement editRoleLeader() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.editRoleLeader"));
        return element;
    }
    //编辑-确定
    public WebElement editSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.editSubmit"));
        return element;
    }
    //编辑-取消
    public WebElement editCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.editCancel"));
        return element;
    }
    //详情
    public WebElement detail() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.roleManagement.detail"));
        return element;
    }
}