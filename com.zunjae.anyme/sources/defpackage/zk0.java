package defpackage;

import android.content.SharedPreferences;

/* renamed from: zk0  reason: default package */
public final class zk0 {
    private static final u60 f = new u60("ApplicationAnalyticsSession");
    public static long g = System.currentTimeMillis();
    public String a;
    public String b;
    public long c = g;
    public int d = 1;
    public String e;

    private zk0() {
    }

    public static zk0 a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        zk0 zk0 = new zk0();
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        zk0.a = sharedPreferences.getString("application_id", "");
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        zk0.b = sharedPreferences.getString("receiver_metrics_id", "");
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        zk0.c = sharedPreferences.getLong("analytics_session_id", 0);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        zk0.d = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            return null;
        }
        zk0.e = sharedPreferences.getString("receiver_session_id", "");
        return zk0;
    }

    public static zk0 c() {
        zk0 zk0 = new zk0();
        g++;
        return zk0;
    }

    public final void b(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            f.a("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("application_id", this.a);
            edit.putString("receiver_metrics_id", this.b);
            edit.putLong("analytics_session_id", this.c);
            edit.putInt("event_sequence_number", this.d);
            edit.putString("receiver_session_id", this.e);
            edit.apply();
        }
    }
}
