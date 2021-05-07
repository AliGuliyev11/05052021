package com.code;

public class StringSplit {
    public static void main(String[] args) {

        System.out.println(specialSplit("Salam lar  weferg,   ,  ? hgeruighrui iohruig  ! igheuih  . t ? "));
    }

    public static String specialSplit(String text) {
        var strArr = text.split("[\\s,.!?]+");
        String result = String.join(",", strArr);
        return result;
    }
}
