package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.t;

/* renamed from: s71  reason: default package */
public final class s71 extends m80 {
    public static final Parcelable.Creator<s71> CREATOR = new r71();
    private final int e;
    private final b f;
    private final t g;

    public s71(int i) {
        this(new b(8, (PendingIntent) null), (t) null);
    }

    s71(int i, b bVar, t tVar) {
        this.e = i;
        this.f = bVar;
        this.g = tVar;
    }

    private s71(b bVar, t tVar) {
        this(1, bVar, (t) null);
    }

    public final b i() {
        return this.f;
    }

    public final t j() {
        return this.g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.r(parcel, 2, this.f, i, false);
        o80.r(parcel, 3, this.g, i, false);
        o80.b(parcel, a);
    }
}
