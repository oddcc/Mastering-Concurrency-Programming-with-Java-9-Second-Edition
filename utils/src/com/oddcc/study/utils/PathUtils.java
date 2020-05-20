package com.oddcc.study.utils;

import java.io.File;

public interface PathUtils {
    String OS = System.getProperty("os.name");
    static boolean isWindows() {
        return OS.startsWith("Windows");
    }

    static boolean isUnix() {
        return !OS.startsWith("Windows");
    }

    static File getHome() {
        return new File(System.getProperty("user.home"));
    }
}
