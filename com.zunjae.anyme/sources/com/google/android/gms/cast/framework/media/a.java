package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.h;

public class a extends m80 {
    public static final Parcelable.Creator<a> CREATOR = new k();
    private static final u60 k = new u60("CastMediaOptions");
    private final String e;
    private final String f;
    private final w g;
    private final h h;
    private final boolean i;
    private final boolean j;

    /* renamed from: com.google.android.gms.cast.framework.media.a$a  reason: collision with other inner class name */
    public static final class C0085a {
        private String a = "com.google.android.gms.cast.framework.media.MediaIntentReceiver";
        private String b;
        private c c;
        private h d = new h.a().a();
        private boolean e = true;

        public final a a() {
            c cVar = this.c;
            return new a(this.a, this.b, cVar == null ? null : cVar.c().asBinder(), this.d, false, this.e);
        }
    }

    a(String str, String str2, IBinder iBinder, h hVar, boolean z, boolean z2) {
        w wVar;
        this.e = str;
        this.f = str2;
        if (iBinder == null) {
            wVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            wVar = queryLocalInterface instanceof w ? (w) queryLocalInterface : new e0(iBinder);
        }
        this.g = wVar;
        this.h = hVar;
        this.i = z;
        this.j = z2;
    }

    public String i() {
        return this.f;
    }

    public c j() {
        w wVar = this.g;
        if (wVar == null) {
            return null;
        }
        try {
            return (c) x80.r3(wVar.V());
        } catch (RemoteException e2) {
            k.b(e2, "Unable to call %s on %s.", "getWrappedClientObject", w.class.getSimpleName());
            return null;
        }
    }

    public String k() {
        return this.e;
    }

    public boolean l() {
        return this.j;
    }

    public h m() {
        return this.h;
    }

    public final boolean n() {
        return this.i;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.s(parcel, 2, k(), false);
        o80.s(parcel, 3, i(), false);
        w wVar = this.g;
        o80.k(parcel, 4, wVar == null ? null : wVar.asBinder(), false);
        o80.r(parcel, 5, m(), i2, false);
        o80.c(parcel, 6, this.i);
        o80.c(parcel, 7, l());
        o80.b(parcel, a);
    }
}
