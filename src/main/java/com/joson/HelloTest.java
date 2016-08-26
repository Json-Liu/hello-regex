package com.joson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloTest {

    public static void main(String[] args) {
       /* RegexHelper regexHelper = new RegexHelper();
        String number = "756289901@123.com";
        System.out.println(regexHelper.isEmail(number));*/
        String regex = "[0-1][0-9]:[0-2][0-9]:[0-5][0-9]";
        try{
            System.out.println(Pattern.matches(regex, ""));
        }catch(Throwable e){
            e.printStackTrace();
        }
    }

}
