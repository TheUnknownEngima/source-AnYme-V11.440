package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.framework.a0;
import com.google.android.gms.cast.framework.b;
import com.google.android.gms.cast.framework.d0;
import com.google.android.gms.cast.framework.g0;
import com.google.android.gms.cast.framework.k;
import com.google.android.gms.cast.framework.media.internal.f;
import com.google.android.gms.cast.framework.media.internal.j;
import com.google.android.gms.cast.framework.v;
import com.google.android.gms.cast.framework.x;
import java.util.Map;

/* renamed from: u90  reason: default package */
public final class u90 extends fa0 implements v90 {
    u90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    public final g0 P0(String str, String str2, k kVar) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        cb0.c(p3, kVar);
        Parcel q3 = q3(2, p3);
        g0 q32 = g0.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }

    public final x Q0(w80 w80, b bVar, x90 x90, Map map) {
        Parcel p3 = p3();
        cb0.c(p3, w80);
        cb0.d(p3, bVar);
        cb0.c(p3, x90);
        p3.writeMap(map);
        Parcel q3 = q3(1, p3);
        x q32 = x.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }

    public final d0 Z1(w80 w80, w80 w802, w80 w803) {
        Parcel p3 = p3();
        cb0.c(p3, w80);
        cb0.c(p3, w802);
        cb0.c(p3, w803);
        Parcel q3 = q3(5, p3);
        d0 q32 = d0.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }

    public final a0 g1(b bVar, w80 w80, v vVar) {
        Parcel p3 = p3();
        cb0.d(p3, bVar);
        cb0.c(p3, w80);
        cb0.c(p3, vVar);
        Parcel q3 = q3(3, p3);
        a0 q32 = a0.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }

    public final f k3(w80 w80, j jVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        Parcel p3 = p3();
        cb0.c(p3, w80);
        cb0.c(p3, jVar);
        p3.writeInt(i);
        p3.writeInt(i2);
        cb0.a(p3, z);
        p3.writeLong(2097152);
        p3.writeInt(5);
        p3.writeInt(333);
        p3.writeInt(10000);
        Parcel q3 = q3(6, p3);
        f q32 = f.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }
}
