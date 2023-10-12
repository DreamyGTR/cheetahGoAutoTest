package cheetahgo.pageobjects.BusinessManagrmentPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class KOLCenterObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public KOLCenterObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }

    //KOL-Youtube-基础信息-网红姓名
    public WebElement kolName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolName"));
        return element;
    }
    //KOL-Youtube-基础信息-国家地区
    public WebElement kolCountry() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolCountry"));
        return element;
    }
    //KOL-Youtube-基础信息-语言
    public WebElement kolLanguage() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolLanguage"));
        return element;
    }
    //KOL-Youtube-分类-网红分类
    public WebElement kolClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolClassification"));
        return element;
    }
    //KOL-Youtube-分类-推广分类
    public WebElement kolPromotionCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolPromotionCategory"));
        return element;
    }
    //KOL-Youtube-分类-主题分类
    public WebElement kolTopicClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolTopicClassification"));
        return element;
    }
    //KOL-Youtube-Youtube认证-全部
    public WebElement kolYoutubeCertificationAll() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolYoutubeCertificationAll"));
        return element;
    }
    //KOL-Youtube-Youtube认证-是
    public WebElement kolYoutubeCertificationYes() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolYoutubeCertificationYes"));
        return element;
    }
    //KOL-Youtube-Youtube认证-否
    public WebElement kolYoutubeCertificationNo() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolYoutubeCertificationNo"));
        return element;
    }
    //KOL-Youtube-粉丝数-全部
    public WebElement kolNumberOfFansAll() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolNumberOfFansAll"));
        return element;
    }
    //KOL-Youtube-粉丝数-<1万
    public WebElement kolNumberOfFansLessThanTenThousand() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolNumberOfFansLessThanTenThousand"));
        return element;
    }
    //KOL-Youtube-粉丝数-1-5万
    public WebElement kolNumberOfFansLessThanFiftyThousand() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolNumberOfFansLessThanFiftyThousand"));
        return element;
    }
    //KOL-Youtube-粉丝数-5-10万
    public WebElement kolNumberOfFansLessThanOneHundredThousand() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolNumberOfFansLessThanOneHundredThousand"));
        return element;
    }
    //KOL-Youtube-粉丝数-10-20万
    public WebElement kolNumberOfFansLessThanTwoHundredThousand() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolNumberOfFansLessThanTwoHundredThousand"));
        return element;
    }
    //KOL-Youtube-粉丝数-20万+
    public WebElement kolNumberOfFansMoreThanTwoHundredThousand() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolNumberOfFansMoreThanTwoHundredThousand"));
        return element;
    }
    //KOL-Youtube-粉丝数-粉丝数输入框范围-最小值
    public WebElement kolNumberOfFansMin() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolNumberOfFansMin"));
        return element;
    }
    //KOL-Youtube-粉丝数-粉丝数输入框范围-最大值
    public WebElement kolNumberOfFansMax() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolNumberOfFansMax"));
        return element;
    }
    //KOL-Youtube-上次发布时间-全部
    public WebElement kolLastPublishedTimeAll() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolLastPublishedTimeAll"));
        return element;
    }
    //KOL-Youtube-上次发布时间-近7天
    public WebElement kolLastPublishedTimeLastSevenDays() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolLastPublishedTimeLastSevenDays"));
        return element;
    }
    //KOL-Youtube-上次发布时间-近30天
    public WebElement kolLastPublishedTimeLastThirtyDays() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolLastPublishedTimeLastThirtyDays"));
        return element;
    }
    //KOL-Youtube-上次发布时间-近90天
    public WebElement kolLastPublishedTimeLastNinetyDays() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolLastPublishedTimeLastNinetyDays"));
        return element;
    }
    //KOL-Youtube-上次发布时间-近180天
    public WebElement kolLastPublishedTimeLastOneHundredEightyDays() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolLastPublishedTimeLastOneHundredEightyDays"));
        return element;
    }
    //KOL-Youtube-搜索
    public WebElement kolSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolSearch"));
        return element;
    }
    //KOL-Youtube-重置
    public WebElement kolReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolReset"));
        return element;
    }
    //KOL-Youtube-网红名称
    public WebElement kolMyCollectionKolName() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionKolName"));
        return element;
    }
    //KOL-Youtube-国家地区
    public WebElement kolMyCollectionCountry() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionCountry"));
        return element;
    }
    //KOL-Youtube-语言
    public WebElement kolMyCollectionLanguage() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionLanguage"));
        return element;
    }
    //KOL-Youtube-网红分类
    public WebElement kolMyCollectionKolClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionKolClassification"));
        return element;
    }
    //KOL-Youtube-推广分类
    public WebElement kolMyCollectionPromotionCategory() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionPromotionCategory"));
        return element;
    }
    //KOL-Youtube-主题分类
    public WebElement kolMyCollectionTopicClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionTopicClassification"));
        return element;
    }
    //KOL-Youtube-收藏时间-开始
    public WebElement kolMyCollectionTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionTimeStart"));
        return element;
    }
    //KOL-Youtube-收藏时间-结束
    public WebElement kolMyCollectionTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionTimeEnd"));
        return element;
    }
    //KOL-Youtube-搜索
    public WebElement kolMyCollectionSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionSearch"));
        return element;
    }
    //KOL-Youtube-重置
    public WebElement kolMyCollectionReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionReset"));
        return element;
    }
    //KOL-Youtube-发邮件
    public WebElement kolMyCollectionSendEmail() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionSendEmail"));
        return element;
    }
    //KOL-Youtube-取消收藏
    public WebElement kolMyCollectionCancelFavorites() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionCancelFavorites"));
        return element;
    }
    //KOL-Youtube-绑定任务
    public WebElement kolMyCollectionBindingTasks() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionBindingTasks"));
        return element;
    }
    //KOL-Youtube-绑定任务-主任务
    public WebElement kolMyCollectionBindingTasksMain() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionBindingTasksMain"));
        return element;
    }
    //KOL-Youtube-绑定任务-子任务
    public WebElement kolMyCollectionBindingTasksSubtasks() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionBindingTasksSubtasks"));
        return element;
    }
    //KOL-Youtube-绑定任务-确认
    public WebElement kolMyCollectionBindingTasksSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionBindingTasksSubmit"));
        return element;
    }
    //KOL-Youtube-绑定任务-关闭
    public WebElement kolMyCollectionBindingTasksCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.kolCenter.kolMyCollectionBindingTasksCancel"));
        return element;
    }
}