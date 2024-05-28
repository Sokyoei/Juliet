/**
 * Java String 字符串
 */

package com.ahri;

import java.util.ArrayList;
import java.util.List;

public class Strings {
    public static float bytes2Float(byte[] arr) {
        int accum = 0;
        accum = accum | (arr[0] & 0xff) << 0;
        accum = accum | (arr[1] & 0xff) << 8;
        accum = accum | (arr[2] & 0xff) << 16;
        accum = accum | (arr[3] & 0xff) << 24;
        return Float.intBitsToFloat(accum);
    }

    public static List<Float> byteArrayToFloatList(byte[] bytes) {
        List<Float> d = new ArrayList<>(bytes.length / 8);
        byte[] doubleBuffer = new byte[4];
        for (int j = 0; j < bytes.length; j += 4) {
            System.arraycopy(bytes, j, doubleBuffer, 0, doubleBuffer.length);
            d.add(bytes2Float(doubleBuffer));
        }
        return d;
    }

    public static void main(String[] args) {
        String str = new String("Ahri");
        System.out.println(str);

        byte[] bytes = {0x00, 0x00, (byte) 0xc8, 0x42};
        float f = bytes2Float(bytes);
        System.out.println(f);
    }
}
