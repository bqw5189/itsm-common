package com.itsm.platform.common.util;

import java.io.UnsupportedEncodingException;

public class EncodingToolKit {
    public final static String[] encodings
            = {"GB2312", "ISO-8859-1", "UTF-8", "GBK"};
    public final static String defaultEncoding = "UTF-8";

    public final static String getEncodedString(String str) {

        if (encodings != null && encodings.length > 0) {
            for (int i = 0; i < encodings.length; i++) {
                String encode = encodings[i];
                if (encode != null) {
                    String encodedString = null;
                    try {
                        encodedString = new String(str.getBytes(encode), encode);
                        if (str.equals(encodedString)) {
                            return encodedString;
                        }
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }

                }
            }
        }

        return str;
    }

    public final static String getEncodingType(String str) {
        if (encodings != null && encodings.length > 0) {
            for (int i = 0; i < encodings.length; i++) {
                String encode = encodings[i];
                try {
                    if (str.equals(new String(str.getBytes(encode), encode))) {
                        return encode;
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }

        }

        return defaultEncoding;
    }

    public final static boolean isGB2312(char c) {
        Character ch = new Character(c);
        String sCh = ch.toString();
        try {
            byte[] bb = sCh.getBytes("gb2312");
            if (bb.length > 1) {
                return true;
            }
        } catch (UnsupportedEncodingException ex) {
            return false;
        }
        return false;

    }

    /**
     * 将字符串编码格式转成GB2312
     *
     * @param str
     * @return
     */
    public final static String TranEncodeTOGB(String str) {
        try {
            String strEncode = getEncodingType(str);
            String temp = new String(str.getBytes(strEncode), "GB2312");
            return temp;
        } catch (java.io.IOException ex) {
            return null;
        }
    }

    public static void main(String[] args) {
        String str = TranEncodeTOGB("44:3a:5c:20:4c:61:62:65:6c:3a:d0:c2:bc:d3:be:ed:20:20:53:65:72:69:61:6c:20:4e:75:6d:62:65:72:20:35:34:62:38:65:65:37:35");
        System.out.println(str);
    }

}
