package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.a;

/* renamed from: zf1  reason: default package */
public class zf1 {
    private static final pe1 b = new pe1();
    private static final String c = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String d = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final ym<ge1, byte[]> e = yf1.b();
    private final zm<ge1> a;

    zf1(zm<ge1> zmVar, ym<ge1, byte[]> ymVar) {
        this.a = zmVar;
    }

    public static zf1 a(Context context) {
        jo.f(context);
        return new zf1(jo.c().g(new a(c, d)).b("FIREBASE_CRASHLYTICS_REPORT", ge1.class, vm.b("json"), e), e);
    }

    static /* synthetic */ void b(f81 f81, lc1 lc1, Exception exc) {
        if (exc != null) {
            f81.d(exc);
        } else {
            f81.e(lc1);
        }
    }

    private static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public e81<lc1> e(lc1 lc1) {
        ge1 b2 = lc1.b();
        f81 f81 = new f81();
        this.a.b(wm.g(b2), xf1.b(f81, lc1));
        return f81.a();
    }
}
