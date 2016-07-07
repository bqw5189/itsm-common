package com.itsm.platform.common.util;

/**
 * 数组元素类型转换工具.
 */
public class ArrayConverter {

    /**
     * 将一个Long数组转换为long数组.
     *
     * @param in Long数组
     * @return long数组
     */
    public static long[] covertLongArray(Long[] in) {
        if (in == null) {
            return null;
        } else if (in.length == 0) {
            return new long[0];
        } else {
            long[] result = new long[in.length];
            for (int i = 0; i < in.length; i++) {
                try {
                    result[i] = in[i];
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }

    /**
     * 将long数组转换成Long数组.
     *
     * @param in long数组
     * @return Long数组
     */
    public static Long[] covertPrimitiveLongArray(long[] in) {
        if (in == null) {
            return null;
        } else if (in.length == 0) {
            return new Long[0];
        } else {
            Long[] result = new Long[in.length];
            for (int i = 0; i < in.length; i++) {
                result[i] = Long.valueOf(in[i]);
            }
            return result;
        }
    }

    public static final int[] covertIntegerArray(Integer[] in) {
        if (in == null) {
            return null;
        } else if (in.length == 0) {
            return new int[0];
        } else {
            int[] result = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                try {
                    result[i] = in[i];
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }

}
