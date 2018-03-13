package regex.whatis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WhatIs {
    public static void main(String[] args) {
        System.out.println("vachok@ru".matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z]{2,6}\\b"));

        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("email ? vachok@ru");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println(" ");
    }
}

// https://goo.gl/FWnSF2


