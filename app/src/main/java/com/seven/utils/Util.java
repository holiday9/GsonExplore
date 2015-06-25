package com.seven.utils;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Created by htyuan on 15-6-24.
 */
public class Util {
    public static String getFileStringFromAssert(Context ctx, String fileName) throws IOException {
        byte[] values = getFileStreamFromAssert(ctx, fileName);

        return new String(values, Charset.defaultCharset());
    }
    public static byte[] getFileStreamFromAssert(Context ctx, String fileName) throws IOException {
        AssetManager am = ctx.getAssets();
        InputStream is = am.open(fileName);
        int size = is.available();
        byte[] buffer = new byte[size];
        is.read(buffer);
        is.close();

        return buffer;
    }

}
