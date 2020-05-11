package com.bw.util;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {


    /**
     *   MD5 可逆加密算法
     * @param input  输入的密码
     * @param salt   盐  uuid
     * @return
     * */
    public static String input2db(String input,String salt){

        return DigestUtils.md5Hex(input+salt);
    }

    public static void main(String[] args) {

        String input = "123";
        String salt = UUIDUtil.uuid();
        System.out.println(salt);
        System.out.println(input2db(input,salt));

    }

}
