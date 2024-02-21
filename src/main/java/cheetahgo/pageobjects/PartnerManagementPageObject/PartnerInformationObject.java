package cheetahgo.pageobjects.PartnerManagementPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class PartnerInformationObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public PartnerInformationObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //合伙人名称
    public WebElement partnerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.partnerName"));
        return element;
    }
    //合伙人类型
    public WebElement partnerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.partnerType"));
        return element;
    }
    //合伙人手机号
    public WebElement partnerCellphone() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.partnerCellphone"));
        return element;
    }
    //是否上传资料
    public WebElement whetherToUploadData() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.whetherToUploadData"));
        return element;
    }
    //经办人
    public WebElement manager() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.manager"));
        return element;
    }
    //身份证号
    public WebElement idNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.idNumber"));
        return element;
    }
    //统一社会信用代码
    public WebElement unifiedSocialCreditCode() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.unifiedSocialCreditCode"));
        return element;
    }
    //银行卡号
    public WebElement bankCardNumber() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.bankCardNumber"));
        return element;
    }
    //适用媒体
    public WebElement applicableMedia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.applicableMedia"));
        return element;
    }
    //猎豹对接人
    public WebElement cheetahButtMan() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.cheetahButtMan"));
        return element;
    }
    //注册时间-开始
    public WebElement registrationTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.registrationTimeStart"));
        return element;
    }
    //注册时间-结束
    public WebElement registrationTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.registrationTimeEnd"));
        return element;
    }
    //更新时间-开始
    public WebElement updateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.updateTimeStart"));
        return element;
    }
    //更新时间-结束
    public WebElement updateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.updateTimeEnd"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.search"));
        return element;
    }
    //下载
    public WebElement download() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.download"));
        return element;
    }
    //下载操作日志
    public WebElement downloadOperationLog() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.downloadOperationLog"));
        return element;
    }
    //查看资料
    public WebElement checkingData() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.checkingData"));
        return element;
    }
    //编辑信息
    public WebElement editInformation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editInformation"));
        return element;
    }
    //编辑信息-合伙人名称
    public WebElement editInformationPartnerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editInformationPartnerName"));
        return element;
    }
    //编辑信息-经办人
    public WebElement editInformationManager() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editInformationManager"));
        return element;
    }
    //编辑信息-合伙人类型
    public WebElement editInformationPartnerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editInformationPartnerType"));
        return element;
    }
    //编辑信息-适用媒体
    public WebElement editInformationApplicableMedia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editInformationApplicableMedia"));
        return element;
    }
    //编辑信息-确定
    public WebElement editInformationSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editInformationSubmit"));
        return element;
    }
    //编辑信息-取消
    public WebElement editInformationCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editInformationCancel"));
        return element;
    }
    //编辑代理规则
    public WebElement editProxyRules() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editProxyRules"));
        return element;
    }
    //编辑代理规则-新客户注册当
    public WebElement editProxyRulesNewCustomerRegistration() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editProxyRulesNewCustomerRegistration"));
        return element;
    }
    //编辑代理规则-广告账单-最小值
    public WebElement editProxyRulesAdvertisingBillMin() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editProxyRulesAdvertisingBillMin"));
        return element;
    }
    //编辑代理规则-广告账单-最大值
    public WebElement editProxyRulesAdvertisingBillMax() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editProxyRulesAdvertisingBillMax"));
        return element;
    }
    //编辑代理规则-返现金额
    public WebElement editProxyRulesCashBackAmount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editProxyRulesCashBackAmount"));
        return element;
    }
    //编辑代理规则-确定
    public WebElement editProxyRulesSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editProxyRulesSubmit"));
        return element;
    }
    //编辑代理规则-取消
    public WebElement editProxyRulesCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.editProxyRulesCancel"));
        return element;
    }
    //转移对接人
    public WebElement transferDockingPerson() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.transferDockingPerson"));
        return element;
    }
    //转移对接人-在职员工
    public WebElement transferDockingPersonEmployee() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.transferDockingPersonEmployee"));
        return element;
    }
    //转移对接人-确定
    public WebElement transferDockingPersonSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.transferDockingPersonSubmit"));
        return element;
    }
    //转移对接人-取消
    public WebElement transferDockingPersonCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.partnerManagement.partnerInformation.transferDockingPersonCancel"));
        return element;
    }
}