package com.joson;

import java.util.regex.Pattern;

public class RegexHelper {
    /**
     * 从LINUX路径获取文件名
     */
    public String getFileNameFromLinux(String linuxPath) {
        String result = "";
        if(linuxPath == null || linuxPath.equals("")){
            return result;
        }
        String regex = "^.*/";
        result = linuxPath.replaceFirst(regex, "");
        return result;
    }
    /**
     * 从WINDOWS路径获取文件名
     * @param winPath WINDOWS路径
     * @return
     */
    public String getFileNameFromWindows(String winPath) {
        String result = "";
        if(winPath == null || winPath.equals("")){
            return result;
        }
        String regex = "^.*\\\\";
        result = winPath.replaceFirst(regex, "");
        return result;
    }
    /**
     * 判定给定的字符串是否为数字串
     * @param str 
     * @return true 是数字串 false 不是
     */
    public boolean isNumber(String str){
        boolean result = false;
        String regex = "^[0-9]+$";
        try{
            result = Pattern.matches(regex, str.trim());
        }catch(Throwable e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 是否为长度等于 n 的数字串
     * @param str 待判定字符串
     * @param n 数字串长度 必须 >=0
     * @return true: 符合要求  false：不符合要求
     */
    public boolean isNumberAndLen(String str,int n){
        boolean result = false;
        if( n < 0 ){
            return result;
        }
        String regex = "^\\d{%d}";
        regex = String.format(regex, n);
        try{
            result = Pattern.matches(regex, str.trim());
        }catch(Throwable e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 长度大于等于 n 的数字串
     * @param str 待判定字符串
     * @param n 数字串长度 必须 >=0
     * @return true: 符合要求  false：不符合要求
     */
    public boolean isNumberMoreLen(String str,int n){
        boolean result = false;
        if( n < 0 ){
            return result;
        }
        String regex = "^\\d{%d,}$";
        regex = String.format(regex, n);
        try{
            result = Pattern.matches(regex, str.trim());
        }catch(Throwable e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 非 0 开头的数字串     ^[\u4e00-\u9fa5]{0,}$
     * @param str 待判定字符串
     * @return true: 符合要求  false：不符合要求
     */
    public boolean isNumberNotStartWithZero(String str){
        boolean result = false;
        String regex = "^[1-9][0-9]*$";
        try{
            result = Pattern.matches(regex, str.trim());
        }catch(Throwable e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 纯汉字 字符串
     * @param str 待判定字符串
     * @return true:符合要求  false:不符合要求
     */
    public boolean isChinaStr (String str){
        boolean result = false;
        String regex = "^[\u4e00-\u9fa5]{1,}$";
        try{
            result = Pattern.matches(regex, str.trim());
        }catch(Throwable e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 由数字，字母、下划线组成
     * @param str 待判定字符串
     * @return true:符合要求  false:不符合要求
     */
    public boolean isLetterAndNum (String str){
        boolean result = false;
        String regex = "\\w+$";
        try{
            result = Pattern.matches(regex, str.trim());
        }catch(Throwable e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * Email地址判定
     * @param str 待判定字符
     * @return true :符合要求  false:不符合要求
     */
    public boolean isEmail (String str){
        boolean result = false;
        String regex = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        try{
            result = Pattern.matches(regex, str.trim());
        }catch(Throwable e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 域名判定
     * @param str 待判定字符
     * @return true :符合要求  false:不符合要求
     */
    public boolean isRegionName (String str){
        boolean result = false;
        String regex = "[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(/.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+/.?";
        try{
            result = Pattern.matches(regex, str.trim());
        }catch(Throwable e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * Http Url判定
     * @param str 待判定字符
     * @return true :符合要求  false:不符合要求
     */
    public boolean isHttpUrl (String str){
        boolean result = false;
        String regex = "^http://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$";
        try{
            result = Pattern.matches(regex, str.trim());
        }catch(Throwable e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 手机号判定
     * @param str 待判定字符
     * @return true :符合要求  false:不符合要求
     */
    public boolean isPhoneNumber (String str){
        boolean result = false;
        String regex = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
        try{
            result = Pattern.matches(regex, str.trim());
        }catch(Throwable e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 身份证判定
     * @param str 待判定字符
     * @return true :符合要求  false:不符合要求
     */
    public boolean isIDCardNum (String str){
        boolean result = false;
        String regex = "^\\d{15}|\\d{18}$";
        try{
            result = Pattern.matches(regex, str.trim());
        }catch(Throwable e){
            e.printStackTrace();
        }
        return result;
    }
}
