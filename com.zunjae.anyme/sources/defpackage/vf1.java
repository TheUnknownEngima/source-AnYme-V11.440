package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: vf1  reason: default package */
public class vf1 extends wb1 implements uf1 {
    private final String f;

    public vf1(String str, String str2, xe1 xe1, String str3) {
        this(str, str2, xe1, ve1.POST, str3);
    }

    vf1(String str, String str2, xe1 xe1, ve1 ve1, String str3) {
        super(str, str2, xe1, ve1);
        this.f = str3;
    }

    private we1 g(we1 we1, pf1 pf1) {
        we1.d("X-CRASHLYTICS-GOOGLE-APP-ID", pf1.b);
        we1.d("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        we1.d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f);
        for (Map.Entry<String, String> e : pf1.c.f().entrySet()) {
            we1.e(e);
        }
        return we1;
    }

    private we1 h(we1 we1, rf1 rf1) {
        we1.g("report[identifier]", rf1.c());
        if (rf1.e().length == 1) {
            jb1.f().b("Adding single file " + rf1.h() + " to report " + rf1.c());
            we1.h("report[file]", rf1.h(), "application/octet-stream", rf1.g());
            return we1;
        }
        int i = 0;
        for (File file : rf1.e()) {
            jb1.f().b("Adding file " + file.getName() + " to report " + rf1.c());
            StringBuilder sb = new StringBuilder();
            sb.append("report[file");
            sb.append(i);
            sb.append("]");
            we1.h(sb.toString(), file.getName(), "application/octet-stream", file);
            i++;
        }
        return we1;
    }

    public boolean b(pf1 pf1, boolean z) {
        if (z) {
            we1 c = c();
            g(c, pf1);
            h(c, pf1.c);
            jb1 f2 = jb1.f();
            f2.b("Sending report to: " + e());
            try {
                ye1 b = c.b();
                int b2 = b.b();
                jb1 f3 = jb1.f();
                f3.b("Create report request ID: " + b.d("X-REQUEST-ID"));
                jb1 f4 = jb1.f();
                f4.b("Result was: " + b2);
                return zc1.a(b2) == 0;
            } catch (IOException e) {
                jb1.f().e("Create report HTTP request failed.", e);
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
