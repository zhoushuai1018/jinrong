package com.bw.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.bw.config.AlipayConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("order")
@RestController
public class OrderController {


    @RequestMapping("/zhifu")
    public String alipay(String money) throws AlipayApiException {
        //��ó�ʼ����AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //�����������
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //�̻������ţ��̻���վ����ϵͳ��Ψһ�����ţ�����


            String out_trade_no = UUID.randomUUID().toString().replaceAll("-","");
            //���������
            String total_amount = money;
            //�������ƣ�����
            String subject = "���˴�";
            //��Ʒ�������ɿ�
            String body = "���";




        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //�����BizContent����������ѡ����������������Զ��峬ʱʱ�����timeout_express������˵��
        //alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
        //		+ "\"total_amount\":\""+ total_amount +"\","
        //		+ "\"subject\":\""+ subject +"\","
        //		+ "\"body\":\""+ body +"\","
        //		+ "\"timeout_express\":\"10m\","
        //		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //��������ɲ��ġ�������վ֧����API�ĵ�-alipay.trade.page.pay-����������½�

        //����
        String result = alipayClient.pageExecute(alipayRequest).getBody();



        //���

        return result;
    }
}
