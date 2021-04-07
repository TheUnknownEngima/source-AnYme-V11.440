package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.iid.t;

public class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();
    Messenger e;
    t f;

    class a implements Parcelable.Creator<i> {
        a() {
        }

        /* renamed from: a */
        public i createFromParcel(Parcel parcel) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                return new i(readStrongBinder);
            }
            return null;
        }

        /* renamed from: b */
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    public static final class b extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            boolean t = FirebaseInstanceId.t();
            return i.class;
        }
    }

    public i(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.e = new Messenger(iBinder);
        } else {
            this.f = new t.a(iBinder);
        }
    }

    public IBinder a() {
        Messenger messenger = this.e;
        return messenger != null ? messenger.getBinder() : this.f.asBinder();
    }

    public void b(Message message) {
        Messenger messenger = this.e;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f.p0(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((i) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.e;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f.asBinder());
    }
}
