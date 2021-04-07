package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: rg1  reason: default package */
public class rg1 extends wb1 implements sg1 {
    private jb1 f;

    public rg1(String str, String str2, xe1 xe1) {
        this(str, str2, xe1, ve1.GET, jb1.f());
    }

    rg1(String str, String str2, xe1 xe1, ve1 ve1, jb1 jb1) {
        super(str, str2, xe1, ve1);
        this.f = jb1;
    }

    private we1 g(we1 we1, og1 og1) {
        h(we1, "X-CRASHLYTICS-GOOGLE-APP-ID", og1.a);
        h(we1, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        h(we1, "X-CRASHLYTICS-API-CLIENT-VERSION", ic1.i());
        h(we1, "Accept", "application/json");
        h(we1, "X-CRASHLYTICS-DEVICE-MODEL", og1.b);
        h(we1, "X-CRASHLYTICS-OS-BUILD-VERSION", og1.c);
        h(we1, "X-CRASHLYTICS-OS-DISPLAY-VERSION", og1.d);
        h(we1, "X-CRASHLYTICS-INSTALLATION-ID", og1.e.a());
        return we1;
    }

    private void h(we1 we1, String str, String str2) {
        if (str2 != null) {
            we1.d(str, str2);
        }
    }

    private JSONObject i(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            jb1 jb1 = this.f;
            jb1.c("Failed to parse settings JSON from " + e(), e);
            jb1 jb12 = this.f;
            jb12.b("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> j(og1 og1) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", og1.h);
        hashMap.put("display_version", og1.g);
        hashMap.put("source", Integer.toString(og1.i));
        String str = og1.f;
        if (!dc1.D(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject a(og1 og1, boolean z) {
        if (z) {
            try {
                Map<String, String> j = j(og1);
                we1 d = d(j);
                g(d, og1);
                jb1 jb1 = this.f;
                jb1.b("Requesting settings from " + e());
                jb1 jb12 = this.f;
                jb12.b("Settings query params were: " + j);
                ye1 b = d.b();
                jb1 jb13 = this.f;
                jb13.b("Settings request ID: " + b.d("X-REQUEST-ID"));
                return k(b);
            } catch (IOException e) {
                this.f.e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject k(ye1 ye1) {
        int b = ye1.b();
        jb1 jb1 = this.f;
        jb1.b("Settings result was: " + b);
        if (l(b)) {
            return i(ye1.a());
        }
        jb1 jb12 = this.f;
        jb12.d("Failed to retrieve settings from " + e());
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }
}
