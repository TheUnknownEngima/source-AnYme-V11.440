package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* renamed from: od  reason: default package */
public interface od {

    /* renamed from: od$a */
    public interface a {
        Bitmap a(int i, int i2, Bitmap.Config config);

        int[] b(int i);

        void c(Bitmap bitmap);

        void d(byte[] bArr);

        byte[] e(int i);

        void f(int[] iArr);
    }

    Bitmap a();

    void b();

    int c();

    void clear();

    int d();

    void e(Bitmap.Config config);

    void f();

    int g();

    ByteBuffer getData();

    int h();
}
