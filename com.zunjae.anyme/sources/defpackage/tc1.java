package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.installations.g;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: tc1  reason: default package */
public class tc1 implements uc1 {
    private static final Pattern f = Pattern.compile("[^\\p{Alnum}]");
    private static final String g = Pattern.quote("/");
    private final vc1 a;
    private final Context b;
    private final String c;
    private final g d;
    private String e;

    public tc1(Context context, String str, g gVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.b = context;
            this.c = str;
            this.d = gVar;
            this.a = new vc1();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String c2;
        c2 = c(UUID.randomUUID().toString());
        jb1 f2 = jb1.f();
        f2.b("Created new Crashlytics IID: " + c2);
        sharedPreferences.edit().putString("crashlytics.installation.id", c2).putString("firebase.installation.id", str).apply();
        return c2;
    }

    private static String c(String str) {
        if (str == null) {
            return null;
        }
        return f.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    private synchronized void i(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        jb1 f2 = jb1.f();
        f2.b("Migrating legacy Crashlytics IID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", str2).apply();
        sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
    }

    private String j(String str) {
        return str.replaceAll(g, "");
    }

    public synchronized String a() {
        String str;
        String b2;
        if (this.e != null) {
            return this.e;
        }
        SharedPreferences t = dc1.t(this.b);
        e81<String> f2 = this.d.f();
        String string = t.getString("firebase.installation.id", (String) null);
        try {
            str = (String) gd1.a(f2);
        } catch (Exception e2) {
            jb1.f().c("Failed to retrieve installation id", e2);
            str = string != null ? string : null;
        }
        if (string == null) {
            SharedPreferences o = dc1.o(this.b);
            String string2 = o.getString("crashlytics.installation.id", (String) null);
            jb1 f3 = jb1.f();
            f3.b("No cached FID; legacy id is " + string2);
            if (string2 == null) {
                this.e = b(str, t);
            } else {
                this.e = string2;
                i(string2, str, t, o);
            }
            return this.e;
        }
        if (string.equals(str)) {
            this.e = t.getString("crashlytics.installation.id", (String) null);
            jb1 f4 = jb1.f();
            f4.b("Found matching FID, using Crashlytics IID: " + this.e);
            if (this.e == null) {
                b2 = b(str, t);
            }
            return this.e;
        }
        b2 = b(str, t);
        this.e = b2;
        return this.e;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.a.a(this.b);
    }

    public String f() {
        return String.format(Locale.US, "%s/%s", new Object[]{j(Build.MANUFACTURER), j(Build.MODEL)});
    }

    public String g() {
        return j(Build.VERSION.INCREMENTAL);
    }

    public String h() {
        return j(Build.VERSION.RELEASE);
    }
}
