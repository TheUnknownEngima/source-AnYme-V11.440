package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.i;

/* renamed from: e60  reason: default package */
public final class e60 {
    private SharedPreferences a;

    public e60(Context context) {
        try {
            Context c = i.c(context);
            this.a = c == null ? null : c.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable unused) {
            this.a = null;
        }
    }

    public final boolean a(String str, boolean z) {
        try {
            if (this.a == null) {
                return false;
            }
            return this.a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final float b(String str, float f) {
        try {
            return this.a == null ? Utils.FLOAT_EPSILON : this.a.getFloat(str, Utils.FLOAT_EPSILON);
        } catch (Throwable unused) {
            return Utils.FLOAT_EPSILON;
        }
    }

    /* access modifiers changed from: package-private */
    public final String c(String str, String str2) {
        try {
            return this.a == null ? str2 : this.a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
