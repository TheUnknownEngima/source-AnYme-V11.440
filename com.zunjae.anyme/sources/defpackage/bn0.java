package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.h;
import defpackage.qi0;
import defpackage.ti0;
import defpackage.yi0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bn0  reason: default package */
public final class bn0 {
    private static final u60 i = new u60("FeatureUsageAnalytics");
    private static final String j = ga0.a();
    private static bn0 k;
    private final ob0 a;
    private final SharedPreferences b;
    private final String c;
    private final Runnable d;
    private final Handler e;
    private long f;
    private Set<vh0> g = new HashSet();
    private Set<vh0> h = new HashSet();

    private bn0(SharedPreferences sharedPreferences, ob0 ob0, String str) {
        vh0 i2;
        this.b = sharedPreferences;
        this.a = ob0;
        this.c = str;
        this.e = new mb0(Looper.getMainLooper());
        this.d = new am0(this);
        String string = this.b.getString("feature_usage_sdk_version", (String) null);
        String string2 = this.b.getString("feature_usage_package_name", (String) null);
        this.g = new HashSet();
        this.h = new HashSet();
        this.f = 0;
        if (!j.equals(string) || !this.c.equals(string2)) {
            HashSet hashSet = new HashSet();
            for (String next : this.b.getAll().keySet()) {
                if (next.startsWith("feature_usage_timestamp_")) {
                    hashSet.add(next);
                }
            }
            hashSet.add("feature_usage_last_report_time");
            d(hashSet);
            this.b.edit().putString("feature_usage_sdk_version", j).putString("feature_usage_package_name", this.c).apply();
            return;
        }
        this.f = this.b.getLong("feature_usage_last_report_time", 0);
        long a2 = a();
        HashSet hashSet2 = new HashSet();
        for (String next2 : this.b.getAll().keySet()) {
            if (next2.startsWith("feature_usage_timestamp_")) {
                long j2 = this.b.getLong(next2, 0);
                if (j2 == 0 || a2 - j2 <= 1209600000) {
                    if (next2.startsWith("feature_usage_timestamp_reported_feature_")) {
                        i2 = i(next2.substring(41));
                        this.h.add(i2);
                    } else if (next2.startsWith("feature_usage_timestamp_detected_feature_")) {
                        i2 = i(next2.substring(41));
                    }
                    this.g.add(i2);
                } else {
                    hashSet2.add(next2);
                }
            }
        }
        d(hashSet2);
        e();
    }

    private static long a() {
        return h.d().c();
    }

    public static synchronized bn0 b(SharedPreferences sharedPreferences, ob0 ob0, String str) {
        bn0 bn0;
        synchronized (bn0.class) {
            if (k == null) {
                k = new bn0(sharedPreferences, ob0, str);
            }
            bn0 = k;
        }
        return bn0;
    }

    public static void c(vh0 vh0) {
        bn0 bn0;
        if (ob0.d && (bn0 = k) != null) {
            bn0.b.edit().putLong(bn0.h(Integer.toString(vh0.zzgj())), a()).apply();
            bn0.g.add(vh0);
            bn0.e();
        }
    }

    private final void d(Set<String> set) {
        if (!set.isEmpty()) {
            SharedPreferences.Editor edit = this.b.edit();
            for (String remove : set) {
                edit.remove(remove);
            }
            edit.apply();
        }
    }

    private final void e() {
        this.e.post(this.d);
    }

    private static String g(String str, String str2) {
        return String.format("%s%s", new Object[]{str, str2});
    }

    private final String h(String str) {
        String g2 = g("feature_usage_timestamp_reported_feature_", str);
        return this.b.contains(g2) ? g2 : g("feature_usage_timestamp_detected_feature_", str);
    }

    private static vh0 i(String str) {
        try {
            return vh0.zzad(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return vh0.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        if (!this.g.isEmpty()) {
            long j2 = this.h.equals(this.g) ? 172800000 : 86400000;
            long a2 = a();
            long j3 = this.f;
            if (j3 == 0 || a2 - j3 >= j2) {
                i.a("Upload the feature usage report.", new Object[0]);
                ti0.a y = ti0.y();
                y.t(j);
                y.s(this.c);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.g);
                qi0.a y2 = qi0.y();
                y2.t(arrayList);
                y2.s((ti0) ((cl0) y.N()));
                yi0.a K = yi0.K();
                K.s((qi0) ((cl0) y2.N()));
                this.a.b((yi0) ((cl0) K.N()), kf0.API_USAGE_REPORT);
                SharedPreferences.Editor edit = this.b.edit();
                if (!this.h.equals(this.g)) {
                    HashSet<vh0> hashSet = new HashSet<>(this.g);
                    this.h = hashSet;
                    for (vh0 zzgj : hashSet) {
                        String num = Integer.toString(zzgj.zzgj());
                        String h2 = h(num);
                        String g2 = g("feature_usage_timestamp_reported_feature_", num);
                        if (!TextUtils.equals(h2, g2)) {
                            long j4 = this.b.getLong(h2, 0);
                            edit.remove(h2);
                            if (j4 != 0) {
                                edit.putLong(g2, j4);
                            }
                        }
                    }
                }
                this.f = a2;
                edit.putLong("feature_usage_last_report_time", a2).apply();
            }
        }
    }
}
