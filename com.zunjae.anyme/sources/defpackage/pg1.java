package defpackage;

import java.io.IOException;

/* renamed from: pg1  reason: default package */
abstract class pg1 extends wb1 {
    private final String f;

    public pg1(String str, String str2, xe1 xe1, ve1 ve1, String str3) {
        super(str, str2, xe1, ve1);
        this.f = str3;
    }

    private we1 g(we1 we1, ig1 ig1) {
        we1.d("X-CRASHLYTICS-ORG-ID", ig1.a);
        we1.d("X-CRASHLYTICS-GOOGLE-APP-ID", ig1.b);
        we1.d("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        we1.d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f);
        return we1;
    }

    private we1 h(we1 we1, ig1 ig1) {
        we1.g("org_id", ig1.a);
        we1.g("app[identifier]", ig1.c);
        we1.g("app[name]", ig1.g);
        we1.g("app[display_version]", ig1.d);
        we1.g("app[build_version]", ig1.e);
        we1.g("app[source]", Integer.toString(ig1.h));
        we1.g("app[minimum_sdk_version]", ig1.i);
        we1.g("app[built_sdk_version]", ig1.j);
        if (!dc1.D(ig1.f)) {
            we1.g("app[instance_identifier]", ig1.f);
        }
        return we1;
    }

    public boolean i(ig1 ig1, boolean z) {
        if (z) {
            we1 c = c();
            g(c, ig1);
            h(c, ig1);
            jb1 f2 = jb1.f();
            f2.b("Sending app info to " + e());
            try {
                ye1 b = c.b();
                int b2 = b.b();
                String str = "POST".equalsIgnoreCase(c.f()) ? "Create" : "Update";
                jb1 f3 = jb1.f();
                f3.b(str + " app request ID: " + b.d("X-REQUEST-ID"));
                jb1 f4 = jb1.f();
                f4.b("Result was " + b2);
                return zc1.a(b2) == 0;
            } catch (IOException e) {
                jb1.f().e("HTTP request failed.", e);
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
