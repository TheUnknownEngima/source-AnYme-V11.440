package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;

/* renamed from: j71  reason: default package */
public final class j71 extends m80 implements j {
    public static final Parcelable.Creator<j71> CREATOR = new i71();
    private final int e;
    private int f;
    private Intent g;

    public j71() {
        this(0, (Intent) null);
    }

    j71(int i, int i2, Intent intent) {
        this.e = i;
        this.f = i2;
        this.g = intent;
    }

    private j71(int i, Intent intent) {
        this(2, 0, (Intent) null);
    }

    public final Status g() {
        return this.f == 0 ? Status.i : Status.l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.l(parcel, 2, this.f);
        o80.r(parcel, 3, this.g, i, false);
        o80.b(parcel, a);
    }
}
