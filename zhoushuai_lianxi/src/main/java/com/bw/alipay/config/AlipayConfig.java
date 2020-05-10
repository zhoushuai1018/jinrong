package com.bw.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016102300747237";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDJlwrJb4VrbKUP8i6brsDULkVSnHCXvxlCXt+nvk8l+Jhd0RLwAdnxbVV5f9cWlmMElwxtlTY2ymzCc6/eJl0B2biM18h25WGHf8BbkCl6gwsrMQfTIS95rl65zpxPovlj6pl97gUQIhfRcTxbrw9V+HkYHLWWJg9sECQNrJ6sZbgwMvT5daqPEsTTf/BYJ2myLY6w/tfDShjUqR/8s2WZBJqgS3wC49qfrckJFpTPFWrr+R6JiAhQn97kKZWOlGjFV7TBzoaB00JT8nmMUYu686mIRTGCuzvaAkWDIRvSFyowTNgWgL/tTGzWufdYxY9mSIhp+NmCCRl4Xo4HPOz7AgMBAAECggEBAItXcAlUoLBkZKPlDvpljLwdT6WOpPT/DoKl+YqFLUhd0VPn1GM5pGAQ5ugYyZ+/S6o8jkagwNyWhx7RwFqZwegpijswXExyuTtjvp6Lw1//fJTaS0JQyfQd5zQf8EPLrv61hmtZPv6r0jLfRo1JMByIp4tXLN0gacCUV5dsHjGi0sSk3LOPgVgNTP0Ipph1+ktXnMPT+sjlZy3OoA0DePuyOiEmsNU0UusTY4OjGWJgcluTrNx3kBMY3pbA50UmZtuFKRzVnLoUWrQ8V2Ou9yixskGHYGDJ80SGdYQv5/rI2iyB24Wu34eb3b3vCoaMyhIakuOkSAjh/ZeNaRfoRWECgYEA9zhYUPhnw8TzzHBlL4Lua9s2yi8uBxOjRmy7cIilnm7gDzVTzafkjo58OFJrxB+QolKp81AH5dqm0b/WtoqaQ+ybspeIphxikuHJ9jAbs8KtwL7/Qu+ZEkuZ+pevg7319UvC81e986kY3l9C1TRGs5pr2RyEB7wvHUWHUJ+aqyUCgYEA0L/XYMCVhopiCHIsNM/oQQlW4gJ0qbunXS6Afk/6qmSxnHclmlnK68YcHwoKsv9CHiKwqT7yJoPBqO/K+19+p0+c/bNg7P0oacZA83rqwcBMcrPsyksCw4yW2Nz9vkQAiYSDVoSbkla32uf3HpWoyX4ezGHrHMqzOfgNGoSgzZ8CgYBGRsgkTFkC98vuQ80f0nKASpKqqvrEnDp/3Iz0EoQyI4aiDCDEh4ObWrnJMPTdjbOJ0UHqnsd/+cYOPiCFR6VOxcYE4LrBrbP/2RuWVlqpoR/PePwLRR0YbFFbQR9treRrVJwYnMqsp1cgb6gJ/5BRogYic868fCxQf+FVc+l92QKBgCsE/hvgVHBPoHhhHx8bIaAVjqQxIV3BYHJhnPVrAhuPeNLn8wXmL117jFwRM7dDx5pyR7n5UOoDCSwJjulS+sT8MTxPdVAhs+xogQYsdKjNOnQBBHGEF+O423WBxYEqfnnYp0BzP6Re3rDsUQ8qhIhRx4MTQuLCG0F9DyZB4um9AoGBAMuibwZ4Oi0qGv0EJ+CqiqpC7e24MKymSh0uGfNf8R53DPpkEPLIJXEoB15fW0W4UbLltiFmnJEH4w28rDmYuPTbNugDuwX2OUo4X/VK/qH6XAQ0+GZaaKd7NjTy5nHg7CN/us4vrt9lm1AD8pSWVHtxWCeL5z8K+crHnZ7Qsh6h";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyZcKyW+Fa2ylD/Ium67A1C5FUpxwl78ZQl7fp75PJfiYXdES8AHZ8W1VeX/XFpZjBJcMbZU2NspswnOv3iZdAdm4jNfIduVhh3/AW5ApeoMLKzEH0yEvea5euc6cT6L5Y+qZfe4FECIX0XE8W68PVfh5GBy1liYPbBAkDayerGW4MDL0+XWqjxLE03/wWCdpsi2OsP7Xw0oY1Kkf/LNlmQSaoEt8AuPan63JCRaUzxVq6/keiYgIUJ/e5CmVjpRoxVe0wc6GgdNCU/J5jFGLuvOpiEUxgrs72gJFgyEb0hcqMEzYFoC/7Uxs1rn3WMWPZkiIafjZggkZeF6OBzzs+wIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8081/notify_url";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8081/return_url";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

