package defpackage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.d;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: e  reason: default package */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    final boolean e = false;
    final Handler f = null;
    d g;

    /* renamed from: e$a */
    static class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i) {
            return new e[i];
        }
    }

    /* renamed from: e$b */
    class b extends d.a {
        b() {
        }

        public void m3(int i, Bundle bundle) {
            e eVar = e.this;
            Handler handler = eVar.f;
            if (handler != null) {
                handler.post(new c(i, bundle));
            } else {
                eVar.a(i, bundle);
            }
        }
    }

    /* renamed from: e$c */
    class c implements Runnable {
        final int e;
        final Bundle f;

        c(int i, Bundle bundle) {
            this.e = i;
            this.f = bundle;
        }

        public void run() {
            e.this.a(this.e, this.f);
        }
    }

    e(Parcel parcel) {
        this.g = d.a.p3(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i, Bundle bundle) {
    }

    public void b(int i, Bundle bundle) {
        if (this.e) {
            Handler handler = this.f;
            if (handler != null) {
                handler.post(new c(i, bundle));
            } else {
                a(i, bundle);
            }
        } else {
            d dVar = this.g;
            if (dVar != null) {
                try {
                    dVar.m3(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.g == null) {
                this.g = new b();
            }
            parcel.writeStrongBinder(this.g.asBinder());
        }
    }
}
