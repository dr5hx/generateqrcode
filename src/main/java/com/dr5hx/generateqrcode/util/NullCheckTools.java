package com.dr5hx.generateqrcode.util;

public class NullCheckTools {
    public static boolean checkObjectIsNotNull(Object o) {
        if (o != null) {
            Class<?> className = o.getClass();
            String name = className.getName();
            if (name.equals("java.lang.String")) {
                if (o == null || o.equals("")||o.equals("null")||o.equals("NULL")) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }

    }
}
