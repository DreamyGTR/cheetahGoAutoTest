package cheetahgo.pageobjects.AccountManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class FBPixelManagementObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public FBPixelManagementObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //Pixel-CID管理-Pixel ID
    public WebElement pixelCIDManagementPixelID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementPixelID"));
        return element;
    }
    //Pixel-CID管理-Pixel归属
    public WebElement pixelCIDManagementPixelOwnership() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementPixelOwnership"));
        return element;
    }
    //Pixel-CID管理-Pixel Name
    public WebElement pixelCIDManagementPixelName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementPixelName"));
        return element;
    }
    //Pixel-CID管理-绑定CID
    public WebElement pixelCIDManagementBindCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementBindCID"));
        return element;
    }
    //Pixel-CID管理-所属SAP
    public WebElement pixelCIDManagementSAP() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementSAP"));
        return element;
    }
    //Pixel-CID管理-所属销售
    public WebElement pixelCIDManagementSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementSalesName"));
        return element;
    }
    //Pixel-CID管理-所属AM
    public WebElement pixelCIDManagementAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementAMName"));
        return element;
    }
    //Pixel-CID管理-所属优化师
    public WebElement pixelCIDManagementOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementOptimizer"));
        return element;
    }
    //Pixel-CID管理-更新时间-开始
    public WebElement pixelCIDManagementUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementUpdateTimeStart"));
        return element;
    }
    //Pixel-CID管理-更新时间-结束
    public WebElement pixelCIDManagementUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementUpdateTimeEnd"));
        return element;
    }
    //Pixel-CID管理-新增绑定
    public WebElement pixelCIDManagementAddNewBinding() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementAddNewBinding"));
        return element;
    }
    //Pixel-CID管理-新增绑定-输入绑定信息
    public WebElement pixelCIDManagementAddNewBindingEnterBindingInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementAddNewBindingEnterBindingInformation"));
        return element;
    }
    //Pixel-CID管理-新增绑定-绑定
    public WebElement pixelCIDManagementAddNewBindingBind() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementAddNewBindingBind"));
        return element;
    }
    //Pixel-CID管理-新增绑定-确认
    public WebElement pixelCIDManagementAddNewBindingSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementAddNewBindingSubmit"));
        return element;
    }
    //Pixel-CID管理-新增绑定-取消
    public WebElement pixelCIDManagementAddNewBindingCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementAddNewBindingCancel"));
        return element;
    }
    //Pixel-CID管理-批量操作
    public WebElement pixelCIDManagementBatchOperation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementBatchOperation"));
        return element;
    }
    //Pixel-CID管理-批量操作-选择文件
    public WebElement pixelCIDManagementBatchOperationUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementBatchOperationUploadFiles"));
        return element;
    }
    //Pixel-CID管理-批量操作-下载模板
    public WebElement pixelCIDManagementBatchOperationDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementBatchOperationDownloadTemple"));
        return element;
    }
    //Pixel-CID管理-批量操作-确认
    public WebElement pixelCIDManagementBatchOperationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementBatchOperationSubmit"));
        return element;
    }
    //Pixel-CID管理-批量操作-取消
    public WebElement pixelCIDManagementBatchOperationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementBatchOperationCancel"));
        return element;
    }
    //Pixel-CID管理-批量解绑
    public WebElement pixelCIDManagementBatchUnbinding() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementBatchUnbinding"));
        return element;
    }
    //Pixel-CID管理-搜索
    public WebElement pixelCIDManagementSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementSearch"));
        return element;
    }
    //Pixel-CID管理-下载
    public WebElement pixelCIDManagementDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDManagementDownload"));
        return element;
    }
    //Pixel-CID操作记录-操作流水号
    public WebElement pixelCIDOperationRecordOperationSerialNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordOperationSerialNumber"));
        return element;
    }
    //Pixel-CID操作记录-操作类型
    public WebElement pixelCIDOperationRecordOperationType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordOperationType"));
        return element;
    }
    //Pixel-CID操作记录-Pixel ID
    public WebElement pixelCIDOperationRecordPixelID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordPixelID"));
        return element;
    }
    //Pixel-CID操作记录-Pixel归属
    public WebElement pixelCIDOperationRecordPixelOwnership() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordPixelOwnership"));
        return element;
    }
    //Pixel-CID操作记录-绑定CID
    public WebElement pixelCIDOperationRecordBindCID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordBindCID"));
        return element;
    }
    //Pixel-CID操作记录-所属SAP
    public WebElement pixelCIDOperationRecordSAP() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordSAP"));
        return element;
    }
    //Pixel-CID操作记录-所属销售
    public WebElement pixelCIDOperationRecordSalesName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordSalesName"));
        return element;
    }
    //Pixel-CID操作记录-所属AM
    public WebElement pixelCIDOperationRecordAMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordAMName"));
        return element;
    }
    //Pixel-CID操作记录-所属优化师
    public WebElement pixelCIDOperationRecordOptimizer() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordOptimizer"));
        return element;
    }
    //Pixel-CID操作记录-操作结果
    public WebElement pixelCIDOperationRecordOperationResult() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordOperationResult"));
        return element;
    }
    //Pixel-CID操作记录-操作人
    public WebElement pixelCIDOperationRecordOperator() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordOperator"));
        return element;
    }
    //Pixel-CID操作记录-操作时间-开始
    public WebElement pixelCIDOperationRecordOperationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordOperationTimeStart"));
        return element;
    }
    //Pixel-CID操作记录-操作时间-结束
    public WebElement pixelCIDOperationRecordOperationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordOperationTimeEnd"));
        return element;
    }
    //Pixel-CID操作记录-搜索
    public WebElement pixelCIDOperationRecordSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordSearch"));
        return element;
    }
    //Pixel-CID操作记录-下载
    public WebElement pixelCIDOperationRecordDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelCIDOperationRecordDownload"));
        return element;
    }
    //Pixel-BM管理-pixel ID
    public WebElement pixelBMManagementPixelID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelBMManagementPixelID"));
        return element;
    }
    //Pixel-BM管理-pixel Name
    public WebElement pixelBMManagementPixelName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelBMManagementPixelName"));
        return element;
    }
    //Pixel-BM管理-pixel归属
    public WebElement pixelBMManagementPixelOwnership() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelBMManagementPixelOwnership"));
        return element;
    }
    //Pixel-BM管理-分享BM ID
    public WebElement pixelBMManagementShareBMID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelBMManagementShareBMID"));
        return element;
    }
    //Pixel-BM管理-分享BM Name
    public WebElement pixelBMManagementShareBMName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelBMManagementShareBMName"));
        return element;
    }
    //Pixel-BM管理-更新时间-开始
    public WebElement pixelBMManagementUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelBMManagementUpdateTimeStart"));
        return element;
    }
    //Pixel-BM管理-更新时间-结束
    public WebElement pixelBMManagementUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelBMManagementUpdateTimeEnd"));
        return element;
    }
    //Pixel-BM管理-搜索
    public WebElement pixelBMManagementSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelBMManagementSearch"));
        return element;
    }
    //Pixel-BM管理-下载
    public WebElement pixelBMManagementDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.fbPixelManagement.pixelBMManagementDownload"));
        return element;
    }
}