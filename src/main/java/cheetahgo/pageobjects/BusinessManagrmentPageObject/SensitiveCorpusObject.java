package cheetahgo.pageobjects.BusinessManagrmentPageObject;

import cheetahgo.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.PropertiesMapUtil;

public class SensitiveCorpusObject {
    private WebElement element = null;
    private PropertiesMapUtil objectMap = new PropertiesMapUtil(Constants.CooperativeManagement);
    private WebDriver webDriver;

    public SensitiveCorpusObject(WebDriver webDriver) throws Exception {
        this.webDriver = webDriver;
    }
    //敏感词库-词组分类
    public WebElement sensitiveLexiconPhraseClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconPhraseClassification"));
        return element;
    }
    //敏感词库-适用媒体
    public WebElement sensitiveLexiconApplicableMedia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconApplicableMedia"));
        return element;
    }
    //敏感词库-状态
    public WebElement sensitiveLexiconStatus() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconStatus"));
        return element;
    }
    //敏感词库-创建人
    public WebElement sensitiveLexiconFounder() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconFounder"));
        return element;
    }
    //敏感词库-词组
    public WebElement sensitiveLexiconPhrase() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconPhrase"));
        return element;
    }
    //敏感词库-创建时间-开始
    public WebElement sensitiveLexiconCreateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconCreateTimeStart"));
        return element;
    }
    //敏感词库-创建时间-结束
    public WebElement sensitiveLexiconCreateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconCreateTimeEnd"));
        return element;
    }
    //敏感词库-更新时间-开始
    public WebElement sensitiveLexiconUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconUpdateTimeStart"));
        return element;
    }
    //敏感词库-更新时间-结束
    public WebElement sensitiveLexiconUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconUpdateTimeEnd"));
        return element;
    }
    //敏感词库-搜索
    public WebElement sensitiveLexiconSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconSearch"));
        return element;
    }
    //敏感词库-重置
    public WebElement sensitiveLexiconReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconReset"));
        return element;
    }
    //敏感词库-上传文件-选择文件-点击上传文件
    public WebElement sensitiveLexiconUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconUploadFiles"));
        return element;
    }
    //敏感词库-上传文件-选择文件-下载模板
    public WebElement sensitiveLexiconDownloadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconDownloadFiles"));
        return element;
    }
    //敏感词库-上传文件-确认
    public WebElement sensitiveLexiconSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconSubmit"));
        return element;
    }
    //敏感词库-上传文件-关闭
    public WebElement sensitiveLexiconCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconCancel"));
        return element;
    }
    //敏感词库-创建分类
    public WebElement sensitiveLexiconCreateCategories() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconCreateCategories"));
        return element;
    }
    //敏感词库-创建分类-词组分类
    public WebElement sensitiveLexiconCreateCategoriesPhraseClassification() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconCreateCategoriesPhraseClassification"));
        return element;
    }
    //敏感词库-创建分类-适用媒体
    public WebElement sensitiveLexiconCreateCategoriesApplicableMedia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconCreateCategoriesApplicableMedia"));
        return element;
    }
    //敏感词库-创建分类-词组
    public WebElement sensitiveLexiconCreateCategoriesPhrase() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconCreateCategoriesPhrase"));
        return element;
    }
    //敏感词库-创建分类-保存
    public WebElement sensitiveLexiconCreateCategoriesSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveLexiconCreateCategoriesSubmit"));
        return element;
    }
    //敏感网址-敏感网址
    public WebElement sensitiveURL() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURL"));
        return element;
    }
    //敏感网址-适用媒体
    public WebElement sensitiveURLApplicableMedia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLApplicableMedia"));
        return element;
    }
    //敏感网址-状态
    public WebElement sensitiveURLApplicableMedia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLApplicableMedia"));
        return element;
    }
    //敏感网址-来源
    public WebElement sensitiveURLSource() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLSource"));
        return element;
    }
    //敏感网址-创建人
    public WebElement sensitiveURLFounder() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLFounder"));
        return element;
    }
    //敏感网址-创建时间-开始
    public WebElement sensitiveURLCreateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLCreateTimeStart"));
        return element;
    }
    //敏感网址-创建时间-结束
    public WebElement sensitiveURLCreateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLCreateTimeEnd"));
        return element;
    }
    //敏感网址-更新时间-开始
    public WebElement sensitiveURLUpdateTimeStart() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLUpdateTimeStart"));
        return element;
    }
    //敏感网址-更新时间-结束
    public WebElement sensitiveURLUpdateTimeEnd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLUpdateTimeEnd"));
        return element;
    }
    //敏感网址-搜索
    public WebElement sensitiveURLSearch() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLSearch"));
        return element;
    }
    //敏感网址-重置
    public WebElement sensitiveURLReset() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLReset"));
        return element;
    }
    //敏感网址-上传文件
    public WebElement sensitiveURLUploadFiles() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLUploadFiles"));
        return element;
    }
    //敏感网址-上传文件-选择文件-点击上传文件
    public WebElement sensitiveURLSelectFilesUpload() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLSelectFilesUpload"));
        return element;
    }
    //敏感网址-上传文件-选择文件-下载模板
    public WebElement sensitiveURLSelectFilesDownloadTemple() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLSelectFilesDownloadTemple"));
        return element;
    }
    //敏感网址-上传文件-确定
    public WebElement sensitiveURLUploadFilesSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLUploadFilesSubmit"));
        return element;
    }
    //敏感网址-上传文件-关闭
    public WebElement sensitiveURLUploadFilesCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLUploadFilesCancel"));
        return element;
    }
    //敏感网址-新增网址
    public WebElement sensitiveURLNew() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLNew"));
        return element;
    }
    //敏感网址-新增网址-适用媒体
    public WebElement sensitiveURLNewApplicableMedia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLNewApplicableMedia"));
        return element;
    }
    //敏感网址-新增网址-敏感网址
    public WebElement sensitiveURLNewSensitiveUEL() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLNewSensitiveUEL"));
        return element;
    }
    //敏感网址-新增网址-增加一条
    public WebElement sensitiveURLNewAdd() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLNewAdd"));
        return element;
    }
    //敏感网址-新增网址-确认
    public WebElement sensitiveURLNewSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLNewSubmit"));
        return element;
    }
    //敏感网址-新增网址-关闭
    public WebElement sensitiveURLNewCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLNewCancel"));
        return element;
    }
    //敏感网址-下载表格
    public WebElement sensitiveURLDownloadExcel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLDownloadExcel"));
        return element;
    }
    //敏感网址-启用
    public WebElement sensitiveURLEnable() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLEnable"));
        return element;
    }
    //敏感网址-停用
    public WebElement sensitiveURLDisable() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLDisable"));
        return element;
    }
    //敏感网址-编辑
    public WebElement sensitiveURLEdit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLEdit"));
        return element;
    }
    //敏感网址-编辑-适用媒体
    public WebElement sensitiveURLEditApplicableMedia() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLEditApplicableMedia"));
        return element;
    }
    //敏感网址-编辑-敏感网址
    public WebElement sensitiveURLEditSensitiveURL() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLEditSensitiveURL"));
        return element;
    }
    //敏感网址-编辑-确认
    public WebElement sensitiveURLEditSubmit() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLEditSubmit"));
        return element;
    }
    //敏感网址-编辑-关闭
    public WebElement sensitiveURLEditCancel() throws Exception {
        element = webDriver.findElement(objectMap.getLocator("cheetahGo.businessManagement.sensitiveCorpus.sensitiveURLEditCancel"));
        return element;
    }
}