package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.j;
import com.google.android.gms.cast.w0;

/* renamed from: a70  reason: default package */
public final class a70 extends fa0 implements b70 {
    a70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void W0(boolean z, double d, boolean z2) {
        Parcel p3 = p3();
        cb0.a(p3, z);
        p3.writeDouble(d);
        cb0.a(p3, z2);
        s3(8, p3);
    }

    public final void X0(String str) {
        Parcel p3 = p3();
        p3.writeString(str);
        s3(12, p3);
    }

    public final void d() {
        s3(1, p3());
    }

    public final void d0(String str, String str2, w0 w0Var) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        cb0.d(p3, w0Var);
        s3(14, p3);
    }

    public final void f0(String str, String str2, long j) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        p3.writeLong(j);
        s3(9, p3);
    }

    public final void g() {
        s3(17, p3());
    }

    public final void g3(String str, j jVar) {
        Parcel p3 = p3();
        p3.writeString(str);
        cb0.d(p3, jVar);
        s3(13, p3);
    }

    public final void h0(String str, String str2, long j, String str3) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        p3.writeLong(j);
        p3.writeString(str3);
        s3(15, p3);
    }

    public final void h1(d70 d70) {
        Parcel p3 = p3();
        cb0.c(p3, d70);
        s3(18, p3);
    }

    public final void l(String str) {
        Parcel p3 = p3();
        p3.writeString(str);
        s3(5, p3);
    }

    public final void m1() {
        s3(19, p3());
    }

    public final void v2(String str) {
        Parcel p3 = p3();
        p3.writeString(str);
        s3(11, p3);
    }
}
