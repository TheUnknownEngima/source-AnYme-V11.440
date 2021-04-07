package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

public class q {
    private final Bundle a;

    public q(Bundle bundle) {
        if (bundle != null) {
            this.a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    private static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static boolean t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(v("gcm.n.e")));
    }

    private static boolean u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    private static String v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    private String w(String str) {
        if (!this.a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v = v(str);
            if (this.a.containsKey(v)) {
                return v;
            }
        }
        return str;
    }

    private static String z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String p = p(str);
        return "1".equals(p) || Boolean.parseBoolean(p);
    }

    public Integer b(String str) {
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            String z = z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 38 + String.valueOf(p).length());
            sb.append("Couldn't parse value of ");
            sb.append(z);
            sb.append("(");
            sb.append(p);
            sb.append(") into an int");
            sb.toString();
            return null;
        }
    }

    public JSONArray c(String str) {
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            String z = z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 50 + String.valueOf(p).length());
            sb.append("Malformed JSON for key ");
            sb.append(z);
            sb.append(": ");
            sb.append(p);
            sb.append(", falling back to default");
            sb.toString();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public int[] e() {
        JSONArray c = c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String valueOf = String.valueOf(c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
            sb.append("LightSettings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting LightSettings");
            sb.toString();
            return null;
        } catch (IllegalArgumentException e) {
            String valueOf2 = String.valueOf(c);
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 60 + String.valueOf(message).length());
            sb2.append("LightSettings is invalid: ");
            sb2.append(valueOf2);
            sb2.append(". ");
            sb2.append(message);
            sb2.append(". Skipping setting LightSettings");
            sb2.toString();
            return null;
        }
    }

    public Uri f() {
        String p = p("gcm.n.link_android");
        if (TextUtils.isEmpty(p)) {
            p = p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    public Object[] g(String str) {
        String valueOf = String.valueOf(str);
        JSONArray c = c("_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    public String h(String str) {
        String valueOf = String.valueOf(str);
        return p("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    public String i(Resources resources, String str, String str2) {
        StringBuilder sb;
        String h = h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, "string", str);
        if (identifier == 0) {
            String valueOf = String.valueOf(str2);
            String z = z("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
            sb = new StringBuilder(String.valueOf(z).length() + 49 + String.valueOf(str2).length());
            sb.append(z);
            sb.append(" resource not found: ");
            sb.append(str2);
        } else {
            Object[] g = g(str2);
            if (g == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, g);
            } catch (MissingFormatArgumentException unused) {
                String z2 = z(str2);
                String arrays = Arrays.toString(g);
                sb = new StringBuilder(String.valueOf(z2).length() + 58 + String.valueOf(arrays).length());
                sb.append("Missing format argument for ");
                sb.append(z2);
                sb.append(": ");
                sb.append(arrays);
            }
        }
        sb.append(" Default value will be used.");
        sb.toString();
        return null;
    }

    public Long j(String str) {
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            String z = z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 38 + String.valueOf(p).length());
            sb.append("Couldn't parse value of ");
            sb.append(z);
            sb.append("(");
            sb.append(p);
            sb.append(") into a long");
            sb.toString();
            return null;
        }
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    /* access modifiers changed from: package-private */
    public Integer l() {
        Integer b = b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
        sb.append("notificationCount is invalid: ");
        sb.append(valueOf);
        sb.append(". Skipping setting notificationCount.");
        sb.toString();
        return null;
    }

    /* access modifiers changed from: package-private */
    public Integer m() {
        Integer b = b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
        sb.append("notificationPriority is invalid ");
        sb.append(valueOf);
        sb.append(". Skipping setting notificationPriority.");
        sb.toString();
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p = p(str2);
        return !TextUtils.isEmpty(p) ? p : i(resources, str, str2);
    }

    public String o() {
        String p = p("gcm.n.sound2");
        return TextUtils.isEmpty(p) ? p("gcm.n.sound") : p;
    }

    public String p(String str) {
        return this.a.getString(w(str));
    }

    public long[] q() {
        JSONArray c = c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting vibrateTimings.");
            sb.toString();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public Integer r() {
        Integer b = b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("visibility is invalid: ");
        sb.append(valueOf);
        sb.append(". Skipping setting visibility.");
        sb.toString();
        return null;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
