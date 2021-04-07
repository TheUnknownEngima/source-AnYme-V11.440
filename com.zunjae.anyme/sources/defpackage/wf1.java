package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: wf1  reason: default package */
public class wf1 extends wb1 implements uf1 {
    private final String f;

    public wf1(String str, String str2, xe1 xe1, String str3) {
        super(str, str2, xe1, ve1.POST);
        this.f = str3;
    }

    private we1 g(we1 we1, String str) {
        we1.d("User-Agent", "Crashlytics Android SDK/" + ic1.i());
        we1.d("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        we1.d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f);
        we1.d("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        return we1;
    }

    private we1 h(we1 we1, String str, rf1 rf1) {
        String name;
        String str2;
        if (str != null) {
            we1.g("org_id", str);
        }
        we1.g("report_id", rf1.c());
        for (File file : rf1.e()) {
            if (file.getName().equals("minidump")) {
                name = file.getName();
                str2 = "minidump_file";
            } else if (file.getName().equals("metadata")) {
                name = file.getName();
                str2 = "crash_meta_file";
            } else if (file.getName().equals("binaryImages")) {
                name = file.getName();
                str2 = "binary_images_file";
            } else if (file.getName().equals("session")) {
                name = file.getName();
                str2 = "session_meta_file";
            } else if (file.getName().equals("app")) {
                name = file.getName();
                str2 = "app_meta_file";
            } else if (file.getName().equals("device")) {
                name = file.getName();
                str2 = "device_meta_file";
            } else if (file.getName().equals("os")) {
                name = file.getName();
                str2 = "os_meta_file";
            } else if (file.getName().equals("user")) {
                name = file.getName();
                str2 = "user_meta_file";
            } else if (file.getName().equals("logs")) {
                name = file.getName();
                str2 = "logs_file";
            } else if (file.getName().equals("keys")) {
                name = file.getName();
                str2 = "keys_file";
            }
            we1.h(str2, name, "application/octet-stream", file);
        }
        return we1;
    }

    public boolean b(pf1 pf1, boolean z) {
        if (z) {
            we1 c = c();
            g(c, pf1.b);
            h(c, pf1.a, pf1.c);
            jb1 f2 = jb1.f();
            f2.b("Sending report to: " + e());
            try {
                int b = c.b().b();
                jb1 f3 = jb1.f();
                f3.b("Result was: " + b);
                return zc1.a(b) == 0;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
