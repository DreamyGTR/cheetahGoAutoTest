package cheetahgo.pageobjects.BusinessManagrmentPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class ExplosiveMaterialObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public ExplosiveMaterialObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //投放平台-全部
    public WebElement deliveryPlatformAll() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.deliveryPlatformAll"));
        return element;
    }
    //投放平台-Facebook
    public WebElement deliveryPlatformFacebook() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.deliveryPlatformFacebook"));
        return element;
    }
    //投放平台-Instagram
    public WebElement deliveryPlatformInstagram() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.deliveryPlatformInstagram"));
        return element;
    }
    //投放平台-Audience Network
    public WebElement deliveryPlatformAudienceNetwork() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.deliveryPlatformAudienceNetwork"));
        return element;
    }
    //投放平台-Messenger
    public WebElement deliveryPlatformMessenger() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.deliveryPlatformMessenger"));
        return element;
    }
    //成效目标-全部
    public WebElement outcomeGoalsAll() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.outcomeGoalsAll"));
        return element;
    }
    //成效目标-发起消息对话
    public WebElement outcomeGoalsStartMessageConversation() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.outcomeGoalsStartMessageConversation"));
        return element;
    }
    //成效目标-帖文互动
    public WebElement outcomeGoalsPostInteraction() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.outcomeGoalsPostInteraction"));
        return element;
    }
    //成效目标-发起结账
    public WebElement outcomeGoalsInitiateCheckout() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.outcomeGoalsInitiateCheckout"));
        return element;
    }
    //成效目标-链接点击
    public WebElement outcomeGoalsLinkClick() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.outcomeGoalsLinkClick"));
        return element;
    }
    //成效目标-加入购物车
    public WebElement outcomeGoalsAddCart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.outcomeGoalsAddCart"));
        return element;
    }
    //成效目标-主页赞
    public WebElement outcomeGoalsPageLikes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.outcomeGoalsPageLikes"));
        return element;
    }
    //成效目标-视频观看量
    public WebElement outcomeGoalsVideoViews() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.outcomeGoalsVideoViews"));
        return element;
    }
    //成效目标-覆盖人数
    public WebElement outcomeGoalsNumberOfPeopleCovered() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.outcomeGoalsNumberOfPeopleCovered"));
        return element;
    }
    //成效目标-其他
    public WebElement outcomeGoalsOthers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.outcomeGoalsOthers"));
        return element;
    }
    //投放国家/地区-全部
    public WebElement releaseCountryAll() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryAll"));
        return element;
    }
    //投放国家/地区-美国
    public WebElement releaseCountryAmerica() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryAmerica"));
        return element;
    }
    //投放国家/地区-加拿大
    public WebElement releaseCountryCanada() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryCanada"));
        return element;
    }
    //投放国家/地区-英国
    public WebElement releaseCountryUK() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryUK"));
        return element;
    }
    //投放国家/地区-澳大利亚
    public WebElement releaseCountryAustralia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryAustralia"));
        return element;
    }
    //投放国家/地区-德国
    public WebElement releaseCountryGermany() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryGermany"));
        return element;
    }
    //投放国家/地区-法国
    public WebElement releaseCountryFrance() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryFrance"));
        return element;
    }
    //投放国家/地区-意大利
    public WebElement releaseCountryItaly() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryItaly"));
        return element;
    }
    //投放国家/地区-西班牙
    public WebElement releaseCountrySpain() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountrySpain"));
        return element;
    }
    //投放国家/地区-日本
    public WebElement releaseCountryJapan() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryJapan"));
        return element;
    }
    //投放国家/地区-韩国
    public WebElement releaseCountryKorea() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryKorea"));
        return element;
    }
    //投放国家/地区-中国香港
    public WebElement releaseCountryHongKong() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryHongKong"));
        return element;
    }
    //投放国家/地区-中国台湾
    public WebElement releaseCountryTaiWan() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryTaiWan"));
        return element;
    }
    //投放国家/地区-新加坡
    public WebElement releaseCountrySingapore() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountrySingapore"));
        return element;
    }
    //投放国家/地区-马来西亚
    public WebElement releaseCountryMalaysia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryMalaysia"));
        return element;
    }
    //投放国家/地区-泰国
    public WebElement releaseCountryThailand() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryThailand"));
        return element;
    }
    //投放国家/地区-印度
    public WebElement releaseCountryIndia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryIndia"));
        return element;
    }
    //投放国家/地区-印尼
    public WebElement releaseCountryIndonesia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryIndonesia"));
        return element;
    }
    //投放国家/地区-其他
    public WebElement releaseCountryOthers() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.releaseCountryOthers"));
        return element;
    }
    //素材类型-全部
    public WebElement materialTypeAll() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.materialTypeAll"));
        return element;
    }
    //素材类型-图片
    public WebElement materialTypePicture() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.materialTypePicture"));
        return element;
    }
    //素材类型-视频
    public WebElement materialTypeVideo() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.materialTypeVideo"));
        return element;
    }
    //投放类型-全部
    public WebElement deliveryTypeAll() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.deliveryTypeAll"));
        return element;
    }
    //投放类型-非应用类
    public WebElement deliveryTypeNonApplicationClass() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.deliveryTypeNonApplicationClass"));
        return element;
    }
    //投放类型-应用类
    public WebElement deliveryTypeApplicationClass() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.deliveryTypeApplicationClass"));
        return element;
    }
    //客户名称
    public WebElement customerName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.CustomerName"));
        return element;
    }
    //开户主体
    public WebElement accountOpeningEntity() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.accountOpeningEntity"));
        return element;
    }
    //开户主体-当前开户主体-勾选框
    public WebElement accountOpeningEntityCheckbox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.accountOpeningEntityCheckbox"));
        return element;
    }
    //开户主体-完成
    public WebElement accountOpeningEntitySubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.accountOpeningEntitySubmit"));
        return element;
    }
    //广告账户
    public WebElement adAccount() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.adAccount"));
        return element;
    }
    //广告账户-当前广告账户-勾选框
    public WebElement adAccountCheckbox() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.adAccountCheckbox"));
        return element;
    }
    //广告账户-完成
    public WebElement adAccountSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.adAccountSubmit"));
        return element;
    }
    //客户类型
    public WebElement customerType() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.customerType"));
        return element;
    }
    //创意ID
    public WebElement creativeID() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.creativeID"));
        return element;
    }
    //时间-开始
    public WebElement timeSart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.timeSart"));
        return element;
    }
    //时间-结束
    public WebElement timeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.timeEnd"));
        return element;
    }
    //搜索
    public WebElement search() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.search"));
        return element;
    }
    //添加
    public WebElement add() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.explosiveMaterial.add"));
        return element;
    }
}