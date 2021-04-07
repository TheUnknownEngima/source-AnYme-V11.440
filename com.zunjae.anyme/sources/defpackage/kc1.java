package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import defpackage.ge1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: kc1  reason: default package */
public class kc1 {
    private static final String e = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"17.2.1"});
    private static final Map<String, Integer> f;
    private final Context a;
    private final tc1 b;
    private final xb1 c;
    private final xg1 d;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("armeabi", 5);
        f.put("armeabi-v7a", 6);
        f.put("arm64-v8a", 9);
        f.put("x86", 0);
        f.put("x86_64", 1);
    }

    public kc1(Context context, tc1 tc1, xb1 xb1, xg1 xg1) {
        this.a = context;
        this.b = tc1;
        this.c = xb1;
        this.d = xg1;
    }

    private ge1.a a() {
        ge1.a b2 = ge1.b();
        b2.h("17.2.1");
        b2.d(this.c.a);
        b2.e(this.b.a());
        b2.b(this.c.e);
        b2.c(this.c.f);
        b2.g(4);
        return b2;
    }

    private static int d() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    private ge1.d.C0116d.a.b.C0118a e() {
        ge1.d.C0116d.a.b.C0118a.C0119a a2 = ge1.d.C0116d.a.b.C0118a.a();
        a2.b(0);
        a2.d(0);
        a2.c(this.c.d);
        a2.e(this.c.b);
        return a2.a();
    }

    private he1<ge1.d.C0116d.a.b.C0118a> f() {
        return he1.c(e());
    }

    private ge1.d.C0116d.a g(int i, yg1 yg1, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo k = dc1.k(this.c.d, this.a);
        if (k != null) {
            bool = Boolean.valueOf(k.importance != 100);
        } else {
            bool = null;
        }
        ge1.d.C0116d.a.C0117a a2 = ge1.d.C0116d.a.a();
        a2.b(bool);
        a2.e(i);
        a2.d(k(yg1, thread, i2, i3, z));
        return a2.a();
    }

    private ge1.d.C0116d.c h(int i) {
        ac1 a2 = ac1.a(this.a);
        Float b2 = a2.b();
        Double valueOf = b2 != null ? Double.valueOf(b2.doubleValue()) : null;
        int c2 = a2.c();
        boolean q = dc1.q(this.a);
        long v = dc1.v() - dc1.a(this.a);
        long b3 = dc1.b(Environment.getDataDirectory().getPath());
        ge1.d.C0116d.c.a a3 = ge1.d.C0116d.c.a();
        a3.b(valueOf);
        a3.c(c2);
        a3.f(q);
        a3.e(i);
        a3.g(v);
        a3.d(b3);
        return a3.a();
    }

    private ge1.d.C0116d.a.b.c i(yg1 yg1, int i, int i2) {
        return j(yg1, i, i2, 0);
    }

    private ge1.d.C0116d.a.b.c j(yg1 yg1, int i, int i2, int i3) {
        String str = yg1.b;
        String str2 = yg1.a;
        StackTraceElement[] stackTraceElementArr = yg1.c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        yg1 yg12 = yg1.d;
        if (i3 >= i2) {
            yg1 yg13 = yg12;
            while (yg13 != null) {
                yg13 = yg13.d;
                i4++;
            }
        }
        ge1.d.C0116d.a.b.c.C0121a a2 = ge1.d.C0116d.a.b.c.a();
        a2.f(str);
        a2.e(str2);
        a2.c(he1.a(m(stackTraceElementArr, i)));
        a2.d(i4);
        if (yg12 != null && i4 == 0) {
            a2.b(j(yg12, i, i2, i3 + 1));
        }
        return a2.a();
    }

    private ge1.d.C0116d.a.b k(yg1 yg1, Thread thread, int i, int i2, boolean z) {
        ge1.d.C0116d.a.b.C0120b a2 = ge1.d.C0116d.a.b.a();
        a2.e(u(yg1, thread, i, z));
        a2.c(i(yg1, i, i2));
        a2.d(r());
        a2.b(f());
        return a2.a();
    }

    private ge1.d.C0116d.a.b.e.C0125b l(StackTraceElement stackTraceElement, ge1.d.C0116d.a.b.e.C0125b.C0126a aVar) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = (long) stackTraceElement.getLineNumber();
        }
        aVar.e(max);
        aVar.f(str);
        aVar.b(fileName);
        aVar.d(j);
        return aVar.a();
    }

    private he1<ge1.d.C0116d.a.b.e.C0125b> m(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement l : stackTraceElementArr) {
            ge1.d.C0116d.a.b.e.C0125b.C0126a a2 = ge1.d.C0116d.a.b.e.C0125b.a();
            a2.c(i);
            arrayList.add(l(l, a2));
        }
        return he1.a(arrayList);
    }

    private ge1.d.a n() {
        ge1.d.a.C0115a a2 = ge1.d.a.a();
        a2.c(this.b.d());
        a2.e(this.c.e);
        a2.b(this.c.f);
        a2.d(this.b.a());
        return a2.a();
    }

    private ge1.d o(String str, long j) {
        ge1.d.b a2 = ge1.d.a();
        a2.l(j);
        a2.i(str);
        a2.g(e);
        a2.b(n());
        a2.k(q());
        a2.d(p());
        a2.h(3);
        return a2.a();
    }

    private ge1.d.c p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int d2 = d();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long v = dc1.v();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean C = dc1.C(this.a);
        int n = dc1.n(this.a);
        String str = Build.MANUFACTURER;
        String str2 = Build.PRODUCT;
        ge1.d.c.a a2 = ge1.d.c.a();
        a2.b(d2);
        a2.f(Build.MODEL);
        a2.c(availableProcessors);
        a2.h(v);
        a2.d(blockCount);
        a2.i(C);
        a2.j(n);
        a2.e(str);
        a2.g(str2);
        return a2.a();
    }

    private ge1.d.e q() {
        ge1.d.e.a a2 = ge1.d.e.a();
        a2.d(3);
        a2.e(Build.VERSION.RELEASE);
        a2.b(Build.VERSION.CODENAME);
        a2.c(dc1.E(this.a));
        return a2.a();
    }

    private ge1.d.C0116d.a.b.C0122d r() {
        ge1.d.C0116d.a.b.C0122d.C0123a a2 = ge1.d.C0116d.a.b.C0122d.a();
        a2.d("0");
        a2.c("0");
        a2.b(0);
        return a2.a();
    }

    private ge1.d.C0116d.a.b.e s(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return t(thread, stackTraceElementArr, 0);
    }

    private ge1.d.C0116d.a.b.e t(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        ge1.d.C0116d.a.b.e.C0124a a2 = ge1.d.C0116d.a.b.e.a();
        a2.d(thread.getName());
        a2.c(i);
        a2.b(he1.a(m(stackTraceElementArr, i)));
        return a2.a();
    }

    private he1<ge1.d.C0116d.a.b.e> u(yg1 yg1, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(t(thread, yg1.c, i));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(s(thread2, this.d.a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return he1.a(arrayList);
    }

    public ge1.d.C0116d b(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        yg1 yg1 = new yg1(th, this.d);
        ge1.d.C0116d.b a2 = ge1.d.C0116d.a();
        String str2 = str;
        a2.f(str);
        long j2 = j;
        a2.e(j);
        a2.b(g(i3, yg1, thread, i, i2, z));
        a2.c(h(i3));
        return a2.a();
    }

    public ge1 c(String str, long j) {
        ge1.a a2 = a();
        a2.i(o(str, j));
        return a2.a();
    }
}
