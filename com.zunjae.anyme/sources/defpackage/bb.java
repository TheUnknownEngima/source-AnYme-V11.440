package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bb  reason: default package */
public class bb implements ab<String> {
    private SharedPreferences a;

    public bb(Context context) {
        this.a = context.getSharedPreferences("bugfender.device.key", 0);
    }

    private SharedPreferences.Editor l() {
        return this.a.edit();
    }

    private boolean m(String str, Boolean bool) {
        return !q() && r(x(str)) == bool.booleanValue();
    }

    private boolean n(String str, Float f) {
        return s(x(str)).equals(f);
    }

    private boolean o(String str, Integer num) {
        return u(x(str)).equals(num);
    }

    private boolean p(String str, String str2) {
        return v(x(str)).equalsIgnoreCase(str2);
    }

    private boolean q() {
        boolean z = this.a.getBoolean("first.time.boolean.key", true);
        if (z) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putBoolean("first.time.boolean.key", false);
            edit.commit();
        }
        return z;
    }

    private boolean t() {
        boolean z = this.a.getBoolean("resend.keys.boolean.key", true);
        if (z) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putBoolean("resend.keys.boolean.key", false);
            edit.apply();
        }
        return z;
    }

    private boolean w(String str) {
        return str.contains(".copy");
    }

    private String x(String str) {
        return str + ".copy";
    }

    private boolean y(String str) {
        return str.equalsIgnoreCase("first.time.boolean.key") || str.equalsIgnoreCase("resend.keys.boolean.key");
    }

    public Map<String, ?> a() {
        return e(false);
    }

    public boolean c(String str) {
        SharedPreferences.Editor l = l();
        l.remove(str);
        return l.commit();
    }

    public Map<String, ?> e(boolean z) {
        HashMap hashMap = new HashMap();
        Map<String, ?> all = this.a.getAll();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (String next : all.keySet()) {
            Object obj = all.get(next);
            if (y(next)) {
                hashMap2.put(next, obj);
            } else if (w(next)) {
                hashMap3.put(next.replace(".copy", ""), obj);
            } else {
                hashMap.put(next, obj);
            }
        }
        if (z || t()) {
            hashMap.putAll(hashMap3);
        }
        return hashMap;
    }

    /* renamed from: h */
    public boolean d(String str, Boolean bool) {
        if (m(str, bool)) {
            return true;
        }
        SharedPreferences.Editor l = l();
        l.putBoolean(str, bool.booleanValue());
        l.putBoolean(x(str), bool.booleanValue());
        return l.commit();
    }

    /* renamed from: i */
    public boolean f(String str, Float f) {
        if (n(str, f)) {
            return true;
        }
        SharedPreferences.Editor l = l();
        l.putFloat(str, f.floatValue());
        l.putFloat(x(str), f.floatValue());
        return l.commit();
    }

    /* renamed from: j */
    public boolean g(String str, Integer num) {
        if (o(str, num)) {
            return true;
        }
        SharedPreferences.Editor l = l();
        l.putInt(str, num.intValue());
        l.putInt(x(str), num.intValue());
        return l.commit();
    }

    /* renamed from: k */
    public boolean b(String str, String str2) {
        if (p(str, str2)) {
            return true;
        }
        SharedPreferences.Editor l = l();
        l.putString(str, str2);
        l.putString(x(str), str2);
        return l.commit();
    }

    public boolean r(String str) {
        return this.a.getBoolean(str, false);
    }

    public Float s(String str) {
        return Float.valueOf(this.a.getFloat(str, -1.0f));
    }

    public Integer u(String str) {
        return Integer.valueOf(this.a.getInt(str, -1));
    }

    public String v(String str) {
        return this.a.getString(str, "");
    }
}
