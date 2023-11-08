package cheetahgo.pageobjects.AccountManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class AccountOverviewObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public AccountOverviewObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //Facebook-Account ID
    public WebElement facebookAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookAccountID"));
        return element;
    }
    //Facebook-账户状态
    public WebElement facebookAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookAccountStatus"));
        return element;
    }
    //Facebook-客户名称
    public WebElement facebookCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookCustomerName"));
        return element;
    }
    //Facebook-禁用原因
    public WebElement facebookReasonForDisabling() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookReasonForDisabling"));
        return element;
    }
    //Facebook-开户时间-开始
    public WebElement facebookAccountOpeningTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookAccountOpeningTimeStart"));
        return element;
    }
    //Facebook-开户时间-结束
    public WebElement facebookAccountOpeningTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookAccountOpeningTimeEnd"));
        return element;
    }
    //Facebook-搜索
    public WebElement facebookSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookSearch"));
        return element;
    }
    //Facebook-下载
    public WebElement facebookDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookDownload"));
        return element;
    }
    //Facebook-批量查询
    public WebElement facebookBatchQuery() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookBatchQuery"));
        return element;
    }
    //Facebook-批量查询-选择文件-点击上传
    public WebElement facebookBatchQuerySelectFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookBatchQuerySelectFiles"));
        return element;
    }
    //Facebook-批量查询-下载模板
    public WebElement facebookBatchQueryDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookBatchQueryDownloadTemple"));
        return element;
    }
    //Facebook-批量查询-确认
    public WebElement facebookBatchQuerySubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookBatchQuerySubmit"));
        return element;
    }
    //Facebook-批量查询-取消
    public WebElement facebookBatchQueryCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.facebookBatchQueryCancel"));
        return element;
    }
    //FB账户状态变更-Account ID
    public WebElement fbStatusChangeAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.fbStatusChangeAccountID"));
        return element;
    }
    //FB账户状态变更-更新前账户状态
    public WebElement fbStatusChangeAccountStatusBeforeUpdate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.fbStatusChangeAccountStatusBeforeUpdate"));
        return element;
    }
    //FB账户状态变更-更新后账户状态
    public WebElement fbStatusChangeAccountStatusAfterUpdate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.fbStatusChangeAccountStatusAfterUpdate"));
        return element;
    }
    //FB账户状态变更-更新日期-开始
    public WebElement fbStatusChangeUpdateDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.fbStatusChangeUpdateDateStart"));
        return element;
    }
    //FB账户状态变更-更新日期-结束
    public WebElement fbStatusChangeUpdateDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.fbStatusChangeUpdateDateEnd"));
        return element;
    }
    //FB账户状态变更-过滤新增cid
    public WebElement fbStatusChangeFilterNewCid() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.fbStatusChangeFilterNewCid"));
        return element;
    }
    //FB账户状态变更-搜索
    public WebElement fbStatusChangeSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.fbStatusChangeSearch"));
        return element;
    }
    //FB账户状态变更-下载
    public WebElement fbStatusChangeDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.fbStatusChangeDownload"));
        return element;
    }
    //TikTok-BC名称
    public WebElement tikTokBCName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.tikTokBCName"));
        return element;
    }
    //TikTok-Account ID
    public WebElement tikTokAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.tikTokAccountID"));
        return element;
    }
    //TikTok-账户状态
    public WebElement tikTokAccountStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.tikTokAccountStatus"));
        return element;
    }
    //TikTok-账户名称
    public WebElement tikTokAccountName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.tikTokAccountName"));
        return element;
    }
    //TikTok-客户名称
    public WebElement tikTokCustomerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.tikTokCustomerName"));
        return element;
    }
    //TikTok-注册时间-开始
    public WebElement tikTokRegistrationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.tikTokRegistrationTimeStart"));
        return element;
    }
    //TikTok-注册时间-结束
    public WebElement tikTokRegistrationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.tikTokRegistrationTimeEnd"));
        return element;
    }
    //TikTok-搜索
    public WebElement tikTokSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.tikTokSearch"));
        return element;
    }
    //TikTok-下载
    public WebElement tikTokDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.tikTokDownload"));
        return element;
    }
    //TT账户状态变更-BC名称
    public WebElement ttStatusChangeBCName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.ttStatusChangeBCName"));
        return element;
    }
    //TT账户状态变更-Account ID
    public WebElement ttStatusChangeAccountID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.ttStatusChangeAccountID"));
        return element;
    }
    //TT账户状态变更-账户名称
    public WebElement ttStatusChangeAccountName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.ttStatusChangeAccountName"));
        return element;
    }
    //TT账户状态变更-更新前账户状态
    public WebElement ttStatusChangeAccountStatusBeforeUpdate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.ttStatusChangeAccountStatusBeforeUpdate"));
        return element;
    }
    //TT账户状态变更-更新后账户状态
    public WebElement ttStatusChangeAccountStatusAfterUpdate() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.ttStatusChangeAccountStatusAfterUpdate"));
        return element;
    }
    //TT账户状态变更-更新日期-开始
    public WebElement ttStatusChangeUpdateDateStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.ttStatusChangeUpdateDateStart"));
        return element;
    }
    //TT账户状态变更-更新日期-结束
    public WebElement ttStatusChangeUpdateDateEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.ttStatusChangeUpdateDateEnd"));
        return element;
    }
    //TT账户状态变更-过滤新增CID
    public WebElement ttStatusChangeFilterNewCid() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.ttStatusChangeFilterNewCid"));
        return element;
    }
    //TT账户状态变更-搜索
    public WebElement ttStatusChangeSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.ttStatusChangeSearch"));
        return element;
    }
    //TT账户状态变更-下载
    public WebElement ttStatusChangeDownload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.accountManagement.accountOverview.ttStatusChangeDownload"));
        return element;
    }
}