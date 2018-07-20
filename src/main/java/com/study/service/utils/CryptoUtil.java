/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * CryptoUtil.java created on Jul 17, 2018 4:03:08 PM by Lyon Lu 
 */
package com.study.service.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date Jul 17, 2018 4:03:08 PM
 *
 * </pre>
 */
public class CryptoUtil
{
    /**
     * Description:
     * 		URL编码
     * @param s
     * @return String      
     * @throws
     */
    public static String urlEncode(String s)
    {
        String encode = null;
        try
        {
            encode = URLEncoder.encode(s,"UTF-8");
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return encode;
    }
    
    /**
     * Description:
     * 		URL解码
     * @param s
     * @return String      
     * @throws
     */
    public static String urlDecode(String s)
    {
        String decode = null;
        try
        {
            decode = URLDecoder.decode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return decode;
    }
    
    /**
     * Description:
     *      MD5加密
     * @param s
     * @return String      
     * @throws
     */
    public static String md5Encode(String s)
    {
        // 16进制
        return DigestUtils.md5Hex(s);
    }
    
    /**
     * Description:
     *      BASE64编码
     * @param s
     * @return String      
     * @throws
     */
    public static String base64Encode(String s)
    {
        Encoder encoder = Base64.getEncoder();
        String encode = null;
        try
        {
            encode = encoder.encodeToString(s.getBytes("UTF-8"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return encode;
    }
    
    /**
     * Description:
     *      BASE64解码
     * @param s
     * @return String      
     * @throws
     */
    public static String base64Decode(String s)
    {
        Decoder decoder = Base64.getDecoder();
        String decode = null;
        try
        {
            decode = new String(decoder.decode(s), "UTF-8");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return decode;
    }
    
    /**
     * Description:
     * 		先进行MD5加密，然后BASE64编码
     * @param s
     * @return
     * @return String      
     * @throws
     */
    public static String md5AndBase64Encode(String s)
    {
        Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(DigestUtils.md5(s));
    }
    
    public static void main(String[] args)
    {
        String md5AndBase64Encode = md5AndBase64Encode("<order></order>123456");
        System.out.println(md5AndBase64Encode);
        String urlEncode = urlEncode(md5AndBase64Encode);
        System.out.println(urlEncode);
        String urlEncode1 = urlEncode("<order></order>");
        System.out.println(urlEncode1);
        String urlDecode = urlDecode(urlEncode1);
        System.out.println(urlDecode);
    }
}
