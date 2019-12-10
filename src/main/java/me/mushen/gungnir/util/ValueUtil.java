package me.mushen.gungnir.util;

/**
 * @Desc 值不为空转换
 * @Author Mushen
 * @Create 2019-01-09
 */
public abstract class ValueUtil {
    /**
     * 为空时, 返回默认值
     * @param value
     * @param def
     * @return
     */
    public static boolean nullToDefault(Boolean value, boolean def) {
        return value == null ? def : value;
    }

    /**
     * 为空时, 返回默认值
     * @param value
     * @param def
     * @return
     */
    public static byte nullToDefault(Byte value, byte def) {
        return value == null ? def : value;
    }

    /**
     * 为空时, 返回默认值
     * @param value
     * @param def
     * @return
     */
    public static short nullToDefault(Short value, short def) {
        return value == null ? def : value;
    }

    /**
     * 为空时, 返回默认值
     * @param value
     * @param def
     * @return
     */
    public static char nullToDefault(Character value, char def) {
        return value == null ? def : value;
    }

    /**
     * 为空时, 返回默认值
     * @param value
     * @param def
     * @return
     */
    public static int nullToDefault(Integer value, int def) {
        return value == null ? def : value;
    }

    /**
     * 为空时, 返回默认值
     * @param value
     * @param def
     * @return
     */
    public static long nullToDefault(Long value, long def) {
        return value == null ? def : value;
    }

    /**
     * 为空时, 返回默认值
     * @param value
     * @param def
     * @return
     */
    public static float nullToDefault(Float value, float def) {
        return value == null ? def : value;
    }


    /**
     * 为空时, 返回默认值
     * @param value
     * @param def
     * @return
     */
    public static double nullToDefault(Double value, double def) {
        return value == null ? def : value;
    }

    /**
     * 为空时, 返回默认值
     * @param value
     * @param def
     * @return
     */
    public static <T> T nullToDefault(T value, T def) {
        return value == null ? def : value;
    }
}
