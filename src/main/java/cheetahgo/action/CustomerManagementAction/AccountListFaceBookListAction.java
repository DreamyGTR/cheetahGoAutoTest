package cheetahgo.action.CustomerManagementAction;


import cheetahgo.pageobjects.CustomerManagementPageObject.AccountListFaceBookListObject;
import cheetahgo.pageobjects.CustomerManagementPageObject.CustomerManagementPageObject;
import org.bouncycastle.jcajce.provider.asymmetric.RSA;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import util.LogUtil;
import util.SeleniumUtil;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * 内部运营平台-客户管理-账户列表页面场景自动化测试
 */
public class AccountListFaceBookListAction {

    /**
     * 进入客户管理-账户列表-FaceBook列表页面
     *
     * @param webDriver
     * @param softAssert
     * @return
     * @throws Exception
     */
    public static AccountListFaceBookListObject openCustomerBillFaceBookList(WebDriver webDriver, SoftAssert softAssert) throws Exception {
        AccountListFaceBookListObject accountBillFaceBookListObject = new AccountListFaceBookListObject(webDriver);
        CustomerManagementPageObject customerManagementPageObject = new CustomerManagementPageObject(webDriver);
        customerManagementPageObject.customerManagement().click();
        Thread.sleep(500);
        customerManagementPageObject.customerBill().click();
        Thread.sleep(500);
        customerManagementPageObject.customerBillFaceBookList().click();
        return accountBillFaceBookListObject;
    }
//
//    public static void main(String[] args) throws Exception {
//        // 公钥字符串
//        String publicKeyString = "-----BEGIN PUBLIC KEY-----\n" +
//                "MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA36Q2w38liUZG09Ym0vZa\n" +
//                "Cjj5PsG0xrpfYEPbx6owjL230xR6hC1UJUbzETiuS8lf9lYAKSoeatQdaFNaRziV\n" +
//                "1069iMtcU5MgdyHjH57UVYbzFdA0qhVvi8ZMrjsIurghSOjnh2InzZu9wdeqiolq\n" +
//                "OfNZ4T/KA0Hy+XR0U/SQnCmlO8ieNFypiVa7o0ZFe2D6RZmgTE+H0WwPkCH8pAO7\n" +
//                "Fr4v50bfcbf4U4FVnJIeZYr8R31dSoAF+vJOkLXcG19RJg4PcwFU9aWH1RH4PudO\n" +
//                "Qz95DO5AooFVfj+eFYe48aIqP0y6mjiQVHGuSRTO6xdjt8YR+GAdhQ4TX+u5Hcqx\n" +
//                "T0Uj7nRf+K+H1xdDr8BzHszTcRMJldBmx1mQtIp6lKuhmx1b1DBeZA8RbFb04zjP\n" +
//                "davEEDe2bUQgg8rKHbT8rT6z4u3jkfw5IEA1jAf9O3yts+sJA70yL/+NmD+9/lZg\n" +
//                "eiefrbLYMRqGiXJf1LisxDdESWgXfRefUw3Tp6ZzmQSfmB+9Kwa8ckS3Qs4nAAJS\n" +
//                "tspCv8MBT60F2X2TnYd9e3sOdDg2f3kAMyPPTAXBhg8R7/SXqDsjlFbfpF4b3bOb\n" +
//                "m9+l9L3XlUJuKS8LHEuKrEbF3fNiyUwil4xFeKaZkeUad7ENszYcQMA12jdBcbl0\n" +
//                "zuX1svB21rK0p1fjE+dMirMCAwEAAQ==\n" +
//                "-----END PUBLIC KEY-----";
//
//        // 将公钥字符串转换为PublicKey对象
//        PublicKey publicKey = getPublicKeyFromString(publicKeyString);
//
//        // 要加密的原始数据
//        String originalText = "Hello, World!";
//
//        // 使用公钥加密数据
//        byte[] encryptedData = encrypt(publicKey, originalText.getBytes());
//
//        // 输出加密后的数据
//        System.out.println("Encrypted Data: " + new String(encryptedData));
//    }
//
//    // 将公钥字符串转换为PublicKey对象
//    public static PublicKey getPublicKeyFromString(String publicKeyString) throws Exception {
//        publicKeyString = publicKeyString
//                .replace("-----BEGIN PUBLIC KEY-----", "")
//                .replace("-----END PUBLIC KEY-----", "")
//                .replaceAll("\\s", "");
//
//        byte[] publicKeyBytes = java.util.Base64.getDecoder().decode(publicKeyString);
//
//        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
//        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//        return keyFactory.generatePublic(keySpec);
//    }
//
//    // 使用公钥加密数据
//    public static byte[] encrypt(PublicKey publicKey, byte[] data) throws Exception {
//        Cipher cipher = Cipher.getInstance("RSA");
//        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
//        return cipher.doFinal(data);
//    }

//    public static void main(String[] args) throws Exception {
//        // 公钥字符串
//        String publicKeyString = "-----BEGIN PUBLIC KEY-----\n" +
//                "MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA36Q2w38liUZG09Ym0vZa\n" +
//                "Cjj5PsG0xrpfYEPbx6owjL230xR6hC1UJUbzETiuS8lf9lYAKSoeatQdaFNaRziV\n" +
//                "1069iMtcU5MgdyHjH57UVYbzFdA0qhVvi8ZMrjsIurghSOjnh2InzZu9wdeqiolq\n" +
//                "OfNZ4T/KA0Hy+XR0U/SQnCmlO8ieNFypiVa7o0ZFe2D6RZmgTE+H0WwPkCH8pAO7\n" +
//                "Fr4v50bfcbf4U4FVnJIeZYr8R31dSoAF+vJOkLXcG19RJg4PcwFU9aWH1RH4PudO\n" +
//                "Qz95DO5AooFVfj+eFYe48aIqP0y6mjiQVHGuSRTO6xdjt8YR+GAdhQ4TX+u5Hcqx\n" +
//                "T0Uj7nRf+K+H1xdDr8BzHszTcRMJldBmx1mQtIp6lKuhmx1b1DBeZA8RbFb04zjP\n" +
//                "davEEDe2bUQgg8rKHbT8rT6z4u3jkfw5IEA1jAf9O3yts+sJA70yL/+NmD+9/lZg\n" +
//                "eiefrbLYMRqGiXJf1LisxDdESWgXfRefUw3Tp6ZzmQSfmB+9Kwa8ckS3Qs4nAAJS\n" +
//                "tspCv8MBT60F2X2TnYd9e3sOdDg2f3kAMyPPTAXBhg8R7/SXqDsjlFbfpF4b3bOb\n" +
//                "m9+l9L3XlUJuKS8LHEuKrEbF3fNiyUwil4xFeKaZkeUad7ENszYcQMA12jdBcbl0\n" +
//                "zuX1svB21rK0p1fjE+dMirMCAwEAAQ==\n" +
//                "-----END PUBLIC KEY-----";
//
//        // 将公钥字符串转换为PublicKey对象
//        PublicKey publicKey = getPublicKeyFromString(publicKeyString);
//
//        // 要加密的数据
//        String data = "{\"cellphone\":\"18600882590\",\"verify_code\":\"641773\",\"password\":\"q1234567\",\"agreement\":1,\"partner_type\":1,\"other_name\":\"liuhua\",\"h_channel\":\"xxx\",\"r_channel\":\"0lp1G4MK\"}";
//
//        // 使用公钥加密数据
//        byte[] encryptedData = encrypt(publicKey, data.getBytes());
//
//        // 将加密后的数据转换为Base64编码的字符串
//        String encryptedText = Base64.getEncoder().encodeToString(encryptedData);
//
//        // 输出加密后的数据
//        System.out.println("Encrypted Data: " + encryptedText);
//    }
//
//    // 将公钥字符串转换为PublicKey对象
//    public static PublicKey getPublicKeyFromString(String publicKeyString) throws Exception {
//        publicKeyString = publicKeyString
//                .replace("-----BEGIN PUBLIC KEY-----", "")
//                .replace("-----END PUBLIC KEY-----", "")
//                .replaceAll("\\s", "");
//
//        byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyString);
//
//        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
//        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//        return keyFactory.generatePublic(keySpec);
//    }
}

//    public static void selectAction(SoftAssert softAssert, WebDriver webDriver) throws Exception {
//        AccountListFaceBookListObject customerBillFaceBookListObject = openCustomerBillFaceBookList(webDriver, softAssert);
//        LogUtil.info("========内部运营平台-客户管理-账户列表筛选器自动化测试开始=======");
//        SeleniumUtil.choiceSelect(customerBillFaceBookListObject.accountIDSelect(), webDriver, "ant-select-dropdown-menu-item", "2714685435422499");
//        customerBillFaceBookListObject.searchButton().click();
//        SeleniumUtil.actionMoveClickRelease(webDriver, "/html/body/div[2]/div/div[2]/div/section[2]/section/div/section/main/div/div[3]/div[1]/form/div/div[1]/div/div[2]/div/span/div/div/span/i");
//        Thread.sleep(3000);
//    }



