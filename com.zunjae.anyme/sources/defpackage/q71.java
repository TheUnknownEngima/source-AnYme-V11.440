package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;

/* renamed from: q71  reason: default package */
public final class q71 extends m80 {
    public static final Parcelable.Creator<q71> CREATOR = new p71();
    private final int e;
    private final s f;

    q71(int i, s sVar) {
        this.e = i;
        this.f = sVar;
    }

    public q71(s sVar) {
        this(1, sVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.r(parcel, 2, this.f, i, false);
        o80.b(parcel, a);
    }
}
