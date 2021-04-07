package defpackage;

import java.io.Closeable;

/* renamed from: o6  reason: default package */
public interface o6 extends Closeable {
    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindString(int i, String str);
}
