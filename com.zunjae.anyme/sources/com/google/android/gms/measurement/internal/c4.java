package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.r;

public final class c4 extends d6 {
    /* access modifiers changed from: private */
    public char c = 0;
    /* access modifiers changed from: private */
    public long d = -1;
    private String e;
    private final e4 f = new e4(this, 6, false, false);
    private final e4 g = new e4(this, 6, true, false);
    private final e4 h = new e4(this, 6, false, true);
    private final e4 i = new e4(this, 5, false, false);
    private final e4 j = new e4(this, 5, true, false);
    private final e4 k = new e4(this, 5, false, true);
    private final e4 l = new e4(this, 4, false, false);
    private final e4 m = new e4(this, 3, false, false);
    private final e4 n = new e4(this, 2, false, false);

    c4(h5 h5Var) {
        super(h5Var);
    }

    private static String D(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    private final String O() {
        String str;
        synchronized (this) {
            if (this.e == null) {
                this.e = this.a.M() != null ? this.a.M() : "FA";
            }
            str = this.e;
        }
        return str;
    }

    protected static Object w(String str) {
        if (str == null) {
            return null;
        }
        return new d4(str);
    }

    private static String x(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof d4 ? ((d4) obj).a : z ? "-" : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String D = D(h5.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && D(className).equals(D)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i2++;
            }
            return sb2.toString();
        }
    }

    static String y(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String x = x(z, obj);
        String x2 = x(z, obj2);
        String x3 = x(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(x)) {
            sb.append(str2);
            sb.append(x);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(x2)) {
            sb.append(str2);
            sb.append(x2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(x3)) {
            sb.append(str3);
            sb.append(x3);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void A(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && B(i2)) {
            z(i2, y(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            r.j(str);
            a5 E = this.a.E();
            if (E == null) {
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!E.s()) {
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i2 < 0) {
                    i2 = 0;
                }
                E.y(new b4(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
                return;
            }
            z(6, str2);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i2) {
        return Log.isLoggable(O(), i2);
    }

    public final e4 E() {
        return this.f;
    }

    public final e4 F() {
        return this.g;
    }

    public final e4 G() {
        return this.h;
    }

    public final e4 H() {
        return this.i;
    }

    public final e4 I() {
        return this.j;
    }

    public final e4 J() {
        return this.k;
    }

    public final e4 K() {
        return this.l;
    }

    public final e4 L() {
        return this.m;
    }

    public final e4 M() {
        return this.n;
    }

    public final String N() {
        Pair<String, Long> a = i().d.a();
        if (a == null || a == p4.D) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void z(int i2, String str) {
        Log.println(i2, O(), str);
    }
}
