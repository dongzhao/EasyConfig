package dzhao.common.config.api;

import java.lang.reflect.Field;

public interface ConfigReader {

    static boolean DEFAULT_BOOLEAN = false;
    static byte DEFAULT_BYTE = 0;
    static short DEFAULT_SHORT = 0;
    static int DEFAULT_INT = 0;
    static long DEFAULT_LONG = 0L;
    static float DEFAULT_FLOAT = 0.0f;
    static double DEFAULT_DOUBLE = 0.0d;
    static double DEFAULT_CHAR = '\u0000';
    static String DEFAULT_STR = null;

    Object getValue(String key, Field field);
}
