package cheetahgo.pageobjects.WorkOrderSystemPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class EmployeeManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public EmployeeManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //员工名称
    public WebElement employeeName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.employeeName"));
        return element;
    }
    //角色名称
    public WebElement roleName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.roleName"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.search"));
        return element;
    }
    //批量修改员工
    public WebElement batchModifyEmployee() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.batchModifyEmployee"));
        return element;
    }
    //批量修改员工-角色名称
    public WebElement batchModifyEmployeeRoleName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.batchModifyEmployeeRoleName"));
        return element;
    }
    //批量修改员工-关联员工勾选框
    public WebElement batchModifyEmployeeAssociatedEmployeesCheckbox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.batchModifyEmployeeAssociatedEmployeesCheckbox"));
        return element;
    }
    //批量修改员工-确认
    public WebElement batchModifyEmployeeSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.batchModifyEmployeeSubmit"));
        return element;
    }
    //批量修改员工-取消
    public WebElement batchModifyEmployeeCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.batchModifyEmployeeCancel"));
        return element;
    }
    //解除绑定
    public WebElement unbind() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.unbind"));
        return element;
    }
    //解除绑定-取消
    public WebElement unbindCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.unbindCancel"));
        return element;
    }
    //解除绑定-确定
    public WebElement unbindSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.unbindSubmit"));
        return element;
    }
    //更改绑定
    public WebElement changeBind() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.changeBind"));
        return element;
    }
    //更改绑定-角色名称
    public WebElement changeBindRoleName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.changeBindRoleName"));
        return element;
    }
    //更改绑定-关联员工
    public WebElement changeBindAssociatedEmployees() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.changeBindAssociatedEmployees"));
        return element;
    }
    //更改绑定-确定
    public WebElement changeBindSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.changeBindSubmit"));
        return element;
    }
    //更改绑定-取消
    public WebElement changeBindCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.workOrderSystem.employeeManagement.changeBindCancel"));
        return element;
    }
}