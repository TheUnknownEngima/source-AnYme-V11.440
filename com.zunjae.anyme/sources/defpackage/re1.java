package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* renamed from: re1  reason: default package */
public final class re1 {
    public static byte[] a(File file, Context context) {
        if (file == null || !file.exists()) {
            return new byte[0];
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            try {
                byte[] a = new qe1(context, new ue1()).a(bufferedReader2);
                dc1.f(bufferedReader2);
                return a;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                dc1.f(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dc1.f(bufferedReader);
            throw th;
        }
    }
}
