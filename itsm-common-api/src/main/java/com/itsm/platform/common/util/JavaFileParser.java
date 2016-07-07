package com.itsm.platform.common.util;

import java.net.URL;

public class JavaFileParser {

    public static String JBossDeployPath() {
        return new JavaFileParser().getCurrentConfPath();
    }

    //目前只有报表在用
    public static String JBossServerInstancePath() {
        return new JavaFileParser().getCurrentServerInstancePath();
    }

    public static String JBossHome() {
        return new JavaFileParser().getJBossHomePath();
    }

    private String getCurrentConfPath() {
        String path = null;
        try {
            URL url = this.getClass().getResource("/");
            path = url.toString();
            path = path.replaceAll("%20", " ");
            path = path.replaceAll("file:/", "");// / windows
            path = path.replaceAll("file:", ""); // linux,unix
            int index = path.indexOf("conf");
            if (index == -1) {
                index = path.indexOf("tmp");
            }
            path = path.substring(0, index);
            path = path + "deploy/";
            path = path.trim();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }

    private String getCurrentServerInstancePath() {
        String path = null;
        try {
            URL url = this.getClass().getResource("/");
            path = url.toString();
            path = path.replaceAll("%20", " ");
            path = path.replaceAll("file:/", "");// / windows
            path = path.replaceAll("file:", ""); // linux,unix
            int index = path.indexOf("conf");
            if (index == -1) {
                index = path.indexOf("tmp");
            }
            path = path.substring(0, index);
            path = path.trim();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }

    private String getJBossHomePath() {
        String path = null;
        try {
            URL url = this.getClass().getResource("/");
            path = url.toString();
            path = path.replaceAll("%20", " ");
            path = path.replaceAll("file:/", "");// / windows
            path = path.replaceAll("file:", ""); // linux,unix
            int index = path.indexOf("conf");
            path = path.substring(0, index - 1);
            path = path.trim();
            int endIndex = path.lastIndexOf("/");
            path = path.substring(0, endIndex);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }

}
