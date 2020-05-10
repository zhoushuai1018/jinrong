package com.bw.config;

/* *
 *������AlipayConfig
 *���ܣ�����������
 *��ϸ�������ʻ��й���Ϣ������·��
 *�޸����ڣ�2017-04-05
 *˵����
 *���´���ֻ��Ϊ�˷����̻����Զ��ṩ���������룬�̻����Ը����Լ���վ����Ҫ�����ռ����ĵ���д,����һ��Ҫʹ�øô��롣
 *�ô������ѧϰ���о�֧�����ӿ�ʹ�ã�ֻ���ṩһ���ο���
 */

public class AlipayConfig {
	
//�����������������������������������Ļ�����Ϣ������������������������������

	// Ӧ��ID,����APPID���տ��˺ż�������APPID��Ӧ֧�����˺�
	public static String app_id = "2016102300747402";
	
	// �̻�˽Կ������PKCS8��ʽRSA2˽Կ
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCqT15zircVSrVXbg4t3HpJbSTeb9mAQLvyTJ8jSA/o44JwHLJqnTUuYk9qBgnd2QKeT4BPxurZ+Ti4EcQrJNbW12Qa4TlEkRq3HCA2VTbWCp1kDbh5CjUPzWDLIx0Au2HxKN2vKJxB5cch4ovq0UKVzAgk2Z1s+B5jfyd6CGWmbrJ8zFPCctZNdw3rIzRsmKFfJMvWZvmFKofMAQiPF7bUSL78+pFQ4zm87zbNLCuZ2UU25DVCSu3gsECkWDxa8zla7R35CeYDSNS21/kYTx6SKqGlqxgi1ZmH/R+C9F7CvA307mF4to1ydt9zMfOo7exlknf/Fge3Yxbr0URH7jy/AgMBAAECggEBAIEHqNN44MSs2T7oDq4IQE2o9ynfK7XTVZF5I4gjbIpQ893kn/fOKyB9MxVshcUiSK2QJfJLDlseSi6Kp0jYnDwg66LByBV+qfLYyD7hyK3ZVO0cyApMBW93dkHw1GRdkxKWl33BEsGKSJgPf1nkOMIs1m60wGRyhvNyvoHiIsE4GFJmYPk/JdBYDRzMmqrwuwgtYGDn9/PJW4LWuP+C7QNMD1XzxlnBkIPNbhzRU+kKAgPkxdjp+1s/v/GlVlFU3GPuoo17DgydHu4V5CJJzgCWXnqHVEOPP1B78phH0yJXXstXHahZ+uRcajxBMVDvUWn7A9XDoLRqKRCdP+S2AkECgYEA1wriaDoUAI776rBhngGda9Eg1Y5rI3jQOylfsAgGmWHCQPnakQNz46G46rry4quqw6uvabD5W+0ZTFCc10S2P/KaVwynqDe5h1DvtdOmARhAskpLh9TtzGvJVN00SEWZN+GfNRgXQruwiyKGiNRxBqMj/2nP3lJ6+F1ZoTkfqDkCgYEAyr9nMM8hEoDuRXXQK9Ex1K5ptzknU6WZeQ6vo4YeWkZ9EwcMTdwWn2/CMocUYrfet+sSGPA/6jwLdgAt8C3LZDu9gv0kdKfNhqHq5CGCEsKhaCT1hg9l5jskNHc2DrkjPitI236hoE9pwez/vSXylXxpkupUDJp+FguZWpOc3LcCgYEA0wvEniP5w36QsIkAlPDizZDGF7EZZwvH2XhGh92olFoEKn7MSivITexHLl/hxiJSiozxr9nXMKfmfyZSd1bhQqtXW/14gbiG5c3CJIIeVs61mAUgUaPg6hIS2q3qBNABin1tIc+N7JmFr1doD9vnPWtZBe+T6Y6rTxtWvsrwTckCgYEAoUJHsxyr82m1Gm4wWwmSltT6pI7C5tcKEK1LqcadEbSK+r1aXfs1yy46ybGC11njvWktBcThMU781qgh4ayq31hczXjGrDpjUDgs+bJlIMLJWmo7FpvcsphLnadLyb4bd/E5i8tWholjVqlIZ4ttPNStq/rRSwz+SE6FdPN/ilUCgYB92LLUjSVbMWakU6yXHCFTQEWuUGJ7qlAKHD1zsPZQAXCwnoAX+1nF6CLlwgstkbTKKMjpCL2dcv+FdKPkTT7AZAetcbM68m1LTUj//BmTx3UvpDvGRl3M13W1HkjaKIETweMmNs1yOT6zHc5gT2KQc5DDRNlhhsIOL43tbTtPjQ==";
	
	// ֧������Կ,�鿴��ַ��https://openhome.alipay.com/platform/keyManage.htm ��ӦAPPID�µ�֧������Կ��
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1jcIFWNF3eohHNyQLOMSiIHlMhgnmLEgj745TfE+VF5F91FWrP5zmklYy566U8X/KGScc9T0vd/c0quXmFw2zrcSCL/qOVDxHHNG+YLYf5laoPbe4yBc8q9wthGtMmJwR7Ui8sn0pRMJ0p4gOQ6LbMAtSZIIfm6O7jbz8lzFviRDIVAFrUUCg2QCuB28+NUZTkyauF/v2IYmNf3ZfMX5NmkhaVOgfuydT69LVuellRjFx1WcGjMSd4/tsFo4IXsE+Q/1tbI5DgEbxTVJw6KHlcPuCtYEeuaweEEvnF2vezmUy/3vDRh1kVaW3v6+LCvv6OrK9ZbsuHeWmTNzzK+m1QIDAQAB";

	// �������첽֪ͨҳ��·��  ��http://��ʽ������·�������ܼ�?id=123�����Զ����������������������������
	public static String notify_url = "http://localhost:8081/success.html";

	// ҳ����תͬ��֪ͨҳ��·�� ��http://��ʽ������·�������ܼ�?id=123�����Զ����������������������������
	public static String return_url = "http://localhost:8081/success.html";

	// ǩ����ʽ
	public static String sign_type = "RSA2";
	
	// �ַ������ʽ
	public static String charset = "utf-8";
	
	// ֧��������
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// ֧��������
	public static String log_path = "C:\\";



}

