package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.b;

/* renamed from: n71  reason: default package */
public abstract class n71 extends i90 implements k71 {
    public n71() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            G2((b) k90.a(parcel, b.CREATOR), (j71) k90.a(parcel, j71.CREATOR));
        } else if (i == 4) {
            w1((Status) k90.a(parcel, Status.CREATOR));
        } else if (i == 6) {
            K1((Status) k90.a(parcel, Status.CREATOR));
        } else if (i == 7) {
            Q((Status) k90.a(parcel, Status.CREATOR), (GoogleSignInAccount) k90.a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            D0((s71) k90.a(parcel, s71.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
