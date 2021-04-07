package defpackage;

import android.content.SharedPreferences;
import defpackage.yi0;
import java.util.UUID;

/* renamed from: ob0  reason: default package */
public final class ob0 {
    public static boolean d = true;
    private final zm<yi0> a;
    private final String b;
    private final int c;

    private ob0(SharedPreferences sharedPreferences, zm<yi0> zmVar, long j) {
        this.a = zmVar;
        String string = sharedPreferences.getString("client_sender_id", (String) null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("client_sender_id", string).apply();
        }
        this.b = string;
        this.c = j == 0 ? fc0.a : fc0.b;
    }

    public static ob0 a(SharedPreferences sharedPreferences, zm<yi0> zmVar, long j) {
        return new ob0(sharedPreferences, zmVar, j);
    }

    public final void b(yi0 yi0, kf0 kf0) {
        yi0.a u = yi0.u(yi0);
        u.v(this.b);
        yi0 yi02 = (yi0) ((cl0) u.N());
        int i = hd0.a[this.c - 1];
        this.a.a(i != 1 ? i != 2 ? null : wm.d(kf0.zzgj(), yi02) : wm.e(kf0.zzgj(), yi02));
    }
}
