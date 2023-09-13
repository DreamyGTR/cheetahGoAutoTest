package cheetahgo.action.CustomerManagementAction;

import org.json.JSONObject;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class TestRsa {
    public static void main(String[] args) throws Exception {
//        // 已经创建好的公钥字符串
//        String publicKeyString = "-----BEGIN PUBLIC KEY-----\n" +
//                "MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA36Q2w38liUZG09Ym0vZa\n" +
//                "Cjj5PsG0xrpfYEPbx6owjL230xR6hC1UJUbzETiuS8lf9lYAKSoeatQdaFNaRziV\n" +
//                "1069iMtcU5MgdyHjH57UVYbzFdA0qhVvi8ZMrjsIurghSOjnh2InzZu9wdeqiolq\n" +
//                "OfNZ4T/KA0Hy+XR0U/SQnCmlO8ieNFypiVa7o0ZFe2D6RZmgTE+H0WwPkCH8pAO7\n" +
//                "Fr4v50bfcbf4U4FVnJIeZYr8R31dSoAF+vJOkLXcG19RJg4PcwFU9aWH1RH4PudO\n" +
//                "Qz95DO5AooFVfj+eFYe48aIqP0y6mjiQVHGuSRTO6xdjt8YR+GAdhQ4TX+u5Hcqx\n" +
//                "T0Uj`7nRf+K+H1xdDr8BzHszTcRMJldBmx1mQtIp6lKuhmx1b1DBeZA8RbFb04zjP\n" +
//                "davEEDe2bUQgg8rKHbT8rT6z4u3jkfw5IEA1jAf9O3yts+sJA70yL/+NmD+9/lZg\n" +
//                "eiefrbLYMRqGiXJf1LisxDdESWgXfRefUw3Tp6ZzmQSfmB+9Kwa8ckS3Qs4nAAJS\n" +
//                "tspCv8MBT60F2X2TnYd9e3sOdDg2f3kAMyPPTAXBhg8R7/SXqDsjlFbfpF4b3bOb\n" +
//                "m9+l9L3XlUJuKS8LHEuKrEbF3fNiyUwil4xFeKaZkeUad7ENszYcQMA12jdBcbl0\n" +
//                "zuX1svB21rK0p1fjE+dMirMCAwEAAQ==\n" +
//                "-----END PUBLIC KEY-----";
//
        //
        String publicKeyString = "-----BEGIN PUBLIC KEY-----\n" +
                "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDYPHcPmr2hrJMNwVblt2j3uxHH\n" +
                "qA/4rS5bhj0y2ffO4XlDFL5NLSVQ8fAG/pMFxcacmsMTg6Ngx6B1FNqNEAOX5pqr\n" +
                "cD8JERJukfqBrE2IG8s43frkbDEuooJi/xFZoanJZBj0tf7JVqc4C+dRMoLvCchs\n" +
                "/ROoW3K+g0Oe79E7EQIDAQAB\n" +
                "-----END PUBLIC KEY-----";
        // 要加密的数据
//        JSONObject data = new JSONObject();
//        data.put("cellphone", "13031011537");
//        data.put("password", "45665478zty1");
        String data = "123";
        // 去除公钥字符串中的头部和尾部信息
        publicKeyString = publicKeyString.replace("-----BEGIN PUBLIC KEY-----", "");
        publicKeyString = publicKeyString.replace("-----END PUBLIC KEY-----", "");
        publicKeyString = publicKeyString.replaceAll("\\s+", "");

        // 解码公钥字符串为字节数组
        byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyString);

        // 创建公钥对象
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(keySpec);

        // 使用公钥进行加密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());

        // 将加密结果进行Base64编码
        String encryptedData = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("Encrypted data: " + encryptedData);


        // 已经创建好的私钥字符串
        String privateKeyString = "-----BEGIN PRIVATE KEY-----\n" +
                "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBANg8dw+avaGskw3B\n" +
                "VuW3aPe7EceoD/itLluGPTLZ987heUMUvk0tJVDx8Ab+kwXFxpyawxODo2DHoHUU\n" +
                "2o0QA5fmmqtwPwkREm6R+oGsTYgbyzjd+uRsMS6igmL/EVmhqclkGPS1/slWpzgL\n" +
                "51Eygu8JyGz9E6hbcr6DQ57v0TsRAgMBAAECgYEAltnX1bMGB/v0uuveS3OgbvK6\n" +
                "fKbqPXnTlVYY65jUICd8CSg3em+8ULP312lR9/z5idcNsFdtat7ZOdTKgw5g8hcQ\n" +
                "/aqqZqh4pm4agNDKhdTYnlDhTH6cXBAHc1+ZyQNohxZItsOEja+WHWiDbOSnn5RO\n" +
                "2jMLyDnIpbMcEa7uNgECQQD0hyx9dHU74ztLD4V89JOeSnolfEfoRfXjVrEyS9bZ\n" +
                "mPD1cl7jaw57Qu/YaeAN4pD3CsxG7ogN62kQOOcb5zoJAkEA4mGAUQnR216wQqg/\n" +
                "W6zc16NO/rv+kh0nB0UeYwchl+c3q/myBPPDKmNEwngUxs06TiWam9ys4Z0yQ8Yc\n" +
                "a1HayQJAF9iCvy03LYLoSlaWJuxW5O3QYY1wGbeQ1f2jRAtfRVMD1Hu1wymyfNS3\n" +
                "PPx+K/x3NJAqAZTLUcguM7XI29C9uQJBAMKnU85awzf9k1G9mb0aRkqlAafHvn2k\n" +
                "04pMxHQiDaCwEA6wBYJ8l7Q650TQPA01Ko1HiEm81mqo4C+miYk+OQECQQDNMflS\n" +
                "QsIIR9oDD+BSobWs1vnPihA9aB7lh8CnK9JzeLrgPk4dl7vDUGqxeykCddzpMsel\n" +
                "xo8b5pCFk9HerswZ\n" +
                "-----END PRIVATE KEY-----";
        // 去除私钥字符串中的头部和尾部信息
        privateKeyString = privateKeyString.replace("-----BEGIN PRIVATE KEY-----", "");
        privateKeyString = privateKeyString.replace("-----END PRIVATE KEY-----", "");
        privateKeyString = privateKeyString.replaceAll("\\s+", "");

// 将私钥字符串解码为字节数组
        byte[] privateKeyBytes = Base64.getDecoder().decode(privateKeyString);

// 使用 PKCS8EncodedKeySpec 将私钥字节数组转换为 PrivateKey 对象
        PKCS8EncodedKeySpec keySpec1 = new PKCS8EncodedKeySpec(privateKeyBytes);
        KeyFactory keyFactory1 = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory1.generatePrivate(keySpec1);

// 使用私钥解密数据
        Cipher cipher1 = Cipher.getInstance("RSA");
        cipher1.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedData = cipher.doFinal(encryptedBytes);
        String decryptedText = new String(decryptedData);
        System.out.println("Decrypted text: " + decryptedText);
    }
}


