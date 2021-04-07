package defpackage;

import android.app.ActivityManager;
import java.util.List;
import java.util.Map;

/* renamed from: lf1  reason: default package */
public class lf1 {
    private static final if1 a = if1.c("0");
    private static final if1 b = if1.c("Unity");

    private static void A(kf1 kf1, if1 if1) {
        if (if1 != null) {
            kf1.Z(6, 2);
            kf1.T(h(if1));
            kf1.E(1, if1);
        }
    }

    public static void B(kf1 kf1, String str, String str2, boolean z) {
        if1 c = if1.c(str);
        if1 c2 = if1.c(str2);
        kf1.Z(8, 2);
        kf1.T(m(c, c2, z));
        kf1.G(1, 3);
        kf1.E(2, c);
        kf1.E(3, c2);
        kf1.B(4, z);
    }

    public static void C(kf1 kf1, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        if1 c = if1.c(str);
        if1 o = o(str2);
        if1 o2 = o(str3);
        int e = kf1.e(1, c) + 0;
        if (str2 != null) {
            e += kf1.e(2, o);
        }
        if (str3 != null) {
            e += kf1.e(3, o2);
        }
        kf1.Z(6, 2);
        kf1.T(e);
        kf1.E(1, c);
        if (str2 != null) {
            kf1.E(2, o);
        }
        if (str3 != null) {
            kf1.E(3, o2);
        }
    }

    private static void D(kf1 kf1, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        kf1.Z(1, 2);
        kf1.T(n(thread, stackTraceElementArr, i, z));
        kf1.E(1, if1.c(thread.getName()));
        kf1.c0(2, i);
        for (StackTraceElement q : stackTraceElementArr) {
            q(kf1, 3, q, z);
        }
    }

    private static int a(if1 if1, if1 if12) {
        int u = kf1.u(1, 0) + 0 + kf1.u(2, 0) + kf1.e(3, if1);
        return if12 != null ? u + kf1.e(4, if12) : u;
    }

    private static int b(String str, String str2) {
        int e = kf1.e(1, if1.c(str));
        if (str2 == null) {
            str2 = "";
        }
        return e + kf1.e(2, if1.c(str2));
    }

    private static int c(yg1 yg1, int i, int i2) {
        int i3 = 0;
        int e = kf1.e(1, if1.c(yg1.b)) + 0;
        String str = yg1.a;
        if (str != null) {
            e += kf1.e(3, if1.c(str));
        }
        for (StackTraceElement i4 : yg1.c) {
            int i5 = i(i4, true);
            e += kf1.r(4) + kf1.l(i5) + i5;
        }
        yg1 yg12 = yg1.d;
        if (yg12 == null) {
            return e;
        }
        if (i < i2) {
            int c = c(yg12, i + 1, i2);
            return e + kf1.r(6) + kf1.l(c) + c;
        }
        while (yg12 != null) {
            yg12 = yg12.d;
            i3++;
        }
        return e + kf1.s(7, i3);
    }

    private static int d() {
        return kf1.e(1, a) + 0 + kf1.e(2, a) + kf1.u(3, 0);
    }

    private static int e(yg1 yg1, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, if1 if1, if1 if12) {
        int n = n(thread, stackTraceElementArr, 4, true);
        int r = kf1.r(1) + kf1.l(n) + n + 0;
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int n2 = n(threadArr[i2], list.get(i2), 0, false);
            r += kf1.r(1) + kf1.l(n2) + n2;
        }
        int c = c(yg1, 1, i);
        int d = d();
        int a2 = a(if1, if12);
        return r + kf1.r(2) + kf1.l(c) + c + kf1.r(3) + kf1.l(d) + d + kf1.r(3) + kf1.l(a2) + a2;
    }

    private static int f(yg1 yg1, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, if1 if1, if1 if12, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int e = e(yg1, thread, stackTraceElementArr, threadArr, list, i, if1, if12);
        boolean z = true;
        int r = kf1.r(1) + kf1.l(e) + e + 0;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                int b2 = b((String) next.getKey(), (String) next.getValue());
                r += kf1.r(2) + kf1.l(b2) + b2;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance == 100) {
                z = false;
            }
            r += kf1.a(3, z);
        }
        return r + kf1.s(4, i2);
    }

    private static int g(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + kf1.i(1, f.floatValue());
        }
        return i3 + kf1.n(2, i) + kf1.a(3, z) + kf1.s(4, i2) + kf1.u(5, j) + kf1.u(6, j2);
    }

    private static int h(if1 if1) {
        return kf1.e(1, if1);
    }

    private static int i(StackTraceElement stackTraceElement, boolean z) {
        int i = 0;
        long max = stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0;
        int u = kf1.u(1, max) + 0 + kf1.e(2, if1.c(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            u += kf1.e(3, if1.c(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            u += kf1.u(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return u + kf1.s(5, i);
    }

    private static int j(if1 if1, if1 if12, if1 if13, if1 if14, int i, if1 if15) {
        int e = kf1.e(1, if1) + 0 + kf1.e(2, if12) + kf1.e(3, if13) + kf1.e(6, if14);
        if (if15 != null) {
            e = e + kf1.e(8, b) + kf1.e(9, if15);
        }
        return e + kf1.g(10, i);
    }

    private static int k(int i, if1 if1, int i2, long j, long j2, boolean z, int i3, if1 if12, if1 if13) {
        int i4 = 0;
        int g = kf1.g(3, i) + 0 + (if1 == null ? 0 : kf1.e(4, if1)) + kf1.s(5, i2) + kf1.u(6, j) + kf1.u(7, j2) + kf1.a(10, z) + kf1.s(12, i3) + (if12 == null ? 0 : kf1.e(13, if12));
        if (if13 != null) {
            i4 = kf1.e(14, if13);
        }
        return g + i4;
    }

    private static int l(long j, String str, yg1 yg1, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, if1 if1, if1 if12, Float f, int i3, boolean z, long j2, long j3, if1 if13) {
        long j4 = j;
        int u = kf1.u(1, j) + 0 + kf1.e(2, if1.c(str));
        int f2 = f(yg1, thread, stackTraceElementArr, threadArr, list, i, if1, if12, map, runningAppProcessInfo, i2);
        int g = g(f, i3, z, i2, j2, j3);
        int r = u + kf1.r(3) + kf1.l(f2) + f2 + kf1.r(5) + kf1.l(g) + g;
        if (if13 == null) {
            return r;
        }
        int h = h(if13);
        return r + kf1.r(6) + kf1.l(h) + h;
    }

    private static int m(if1 if1, if1 if12, boolean z) {
        return kf1.g(1, 3) + 0 + kf1.e(2, if1) + kf1.e(3, if12) + kf1.a(4, z);
    }

    private static int n(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int e = kf1.e(1, if1.c(thread.getName())) + kf1.s(2, i);
        for (StackTraceElement i2 : stackTraceElementArr) {
            int i3 = i(i2, z);
            e += kf1.r(3) + kf1.l(i3) + i3;
        }
        return e;
    }

    private static if1 o(String str) {
        if (str == null) {
            return null;
        }
        return if1.c(str);
    }

    public static void p(kf1 kf1, String str, String str2, long j) {
        kf1.E(1, if1.c(str2));
        kf1.E(2, if1.c(str));
        kf1.e0(3, j);
    }

    private static void q(kf1 kf1, int i, StackTraceElement stackTraceElement, boolean z) {
        kf1.Z(i, 2);
        kf1.T(i(stackTraceElement, z));
        int i2 = 0;
        kf1.e0(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0);
        kf1.E(2, if1.c(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            kf1.E(3, if1.c(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            kf1.e0(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i2 = 4;
        }
        kf1.c0(5, i2);
    }

    public static void r(kf1 kf1, String str, String str2, String str3, String str4, int i, String str5) {
        if1 c = if1.c(str);
        if1 c2 = if1.c(str2);
        if1 c3 = if1.c(str3);
        if1 c4 = if1.c(str4);
        if1 c5 = str5 != null ? if1.c(str5) : null;
        kf1.Z(7, 2);
        kf1.T(j(c, c2, c3, c4, i, c5));
        kf1.E(1, c);
        kf1.E(2, c2);
        kf1.E(3, c3);
        kf1.E(6, c4);
        if (c5 != null) {
            kf1.E(8, b);
            kf1.E(9, c5);
        }
        kf1.G(10, i);
    }

    public static void s(kf1 kf1, String str) {
        if1 c = if1.c(str);
        kf1.Z(7, 2);
        int e = kf1.e(2, c);
        kf1.T(kf1.r(5) + kf1.l(e) + e);
        kf1.Z(5, 2);
        kf1.T(e);
        kf1.E(2, c);
    }

    public static void t(kf1 kf1, int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        kf1 kf12 = kf1;
        if1 o = o(str);
        if1 o2 = o(str3);
        if1 o3 = o(str2);
        kf1.Z(9, 2);
        kf1.T(k(i, o, i2, j, j2, z, i3, o3, o2));
        kf1.G(3, i);
        kf1.E(4, o);
        kf1.c0(5, i2);
        kf1.e0(6, j);
        kf1.e0(7, j2);
        kf1.B(10, z);
        kf1.c0(12, i3);
        if (o3 != null) {
            kf1.E(13, o3);
        }
        if (o2 != null) {
            kf1.E(14, o2);
        }
    }

    public static void u(kf1 kf1, long j, String str, yg1 yg1, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, byte[] bArr, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, String str2, String str3, Float f, int i3, boolean z, long j2, long j3) {
        kf1 kf12 = kf1;
        String str4 = str3;
        if1 c = if1.c(str2);
        if1 if1 = null;
        if1 c2 = str4 == null ? null : if1.c(str4.replace("-", ""));
        if (bArr != null) {
            if1 = if1.a(bArr);
        } else {
            jb1.f().b("No log data to include with this event.");
        }
        if1 if12 = if1;
        kf12.Z(10, 2);
        kf12.T(l(j, str, yg1, thread, stackTraceElementArr, threadArr, list, i, map, runningAppProcessInfo, i2, c, c2, f, i3, z, j2, j3, if12));
        kf12.e0(1, j);
        kf12.E(2, if1.c(str));
        v(kf1, yg1, thread, stackTraceElementArr, threadArr, list, i, c, c2, map, runningAppProcessInfo, i2);
        z(kf1, f, i3, z, i2, j2, j3);
        A(kf12, if12);
    }

    private static void v(kf1 kf1, yg1 yg1, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, if1 if1, if1 if12, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        kf1.Z(3, 2);
        kf1.T(f(yg1, thread, stackTraceElementArr, threadArr, list, i, if1, if12, map, runningAppProcessInfo, i2));
        x(kf1, yg1, thread, stackTraceElementArr, threadArr, list, i, if1, if12);
        if (map != null && !map.isEmpty()) {
            w(kf1, map);
        }
        if (runningAppProcessInfo != null) {
            kf1.B(3, runningAppProcessInfo.importance != 100);
        }
        kf1.c0(4, i2);
    }

    private static void w(kf1 kf1, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            kf1.Z(2, 2);
            kf1.T(b((String) next.getKey(), (String) next.getValue()));
            kf1.E(1, if1.c((String) next.getKey()));
            String str = (String) next.getValue();
            if (str == null) {
                str = "";
            }
            kf1.E(2, if1.c(str));
        }
    }

    private static void x(kf1 kf1, yg1 yg1, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, if1 if1, if1 if12) {
        kf1.Z(1, 2);
        kf1.T(e(yg1, thread, stackTraceElementArr, threadArr, list, i, if1, if12));
        D(kf1, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            D(kf1, threadArr[i2], list.get(i2), 0, false);
        }
        y(kf1, yg1, 1, i, 2);
        kf1.Z(3, 2);
        kf1.T(d());
        kf1.E(1, a);
        kf1.E(2, a);
        kf1.e0(3, 0);
        kf1.Z(4, 2);
        kf1.T(a(if1, if12));
        kf1.e0(1, 0);
        kf1.e0(2, 0);
        kf1.E(3, if1);
        if (if12 != null) {
            kf1.E(4, if12);
        }
    }

    private static void y(kf1 kf1, yg1 yg1, int i, int i2, int i3) {
        kf1.Z(i3, 2);
        kf1.T(c(yg1, 1, i2));
        kf1.E(1, if1.c(yg1.b));
        String str = yg1.a;
        if (str != null) {
            kf1.E(3, if1.c(str));
        }
        int i4 = 0;
        for (StackTraceElement q : yg1.c) {
            q(kf1, 4, q, true);
        }
        yg1 yg12 = yg1.d;
        if (yg12 == null) {
            return;
        }
        if (i < i2) {
            y(kf1, yg12, i + 1, i2, 6);
            return;
        }
        while (yg12 != null) {
            yg12 = yg12.d;
            i4++;
        }
        kf1.c0(7, i4);
    }

    private static void z(kf1 kf1, Float f, int i, boolean z, int i2, long j, long j2) {
        kf1.Z(5, 2);
        kf1.T(g(f, i, z, i2, j, j2));
        if (f != null) {
            kf1.I(1, f.floatValue());
        }
        kf1.V(2, i);
        kf1.B(3, z);
        kf1.c0(4, i2);
        kf1.e0(5, j);
        kf1.e0(6, j2);
    }
}
