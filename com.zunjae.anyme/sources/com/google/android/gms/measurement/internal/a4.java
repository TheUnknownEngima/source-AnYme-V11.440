package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class a4 extends d6 {
    private static final AtomicReference<String[]> c = new AtomicReference<>();
    private static final AtomicReference<String[]> d = new AtomicReference<>();
    private static final AtomicReference<String[]> e = new AtomicReference<>();

    a4(h5 h5Var) {
        super(h5Var);
    }

    private final boolean A() {
        return this.a.J() && this.a.h().B(3);
    }

    private static String w(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        r.j(strArr);
        r.j(strArr2);
        r.j(atomicReference);
        r.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (fa.B0(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    private final String x(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            String t = bundle instanceof Bundle ? t(bundle) : String.valueOf(bundle);
            if (t != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(t);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String t(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!A()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(y(str));
            sb.append("=");
            if (!i31.a() || !j().s(u.y0)) {
                sb.append(bundle.get(str));
            } else {
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? x(new Object[]{obj}) : obj instanceof Object[] ? x((Object[]) obj) : obj instanceof ArrayList ? x(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String u(s sVar) {
        String str = null;
        if (sVar == null) {
            return null;
        }
        if (!A()) {
            return sVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(sVar.g);
        sb.append(",name=");
        sb.append(v(sVar.e));
        sb.append(",params=");
        n nVar = sVar.f;
        if (nVar != null) {
            str = !A() ? nVar.toString() : t(nVar.l());
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String v(String str) {
        if (str == null) {
            return null;
        }
        return !A() ? str : w(str, e6.c, e6.a, c);
    }

    /* access modifiers changed from: protected */
    public final String y(String str) {
        if (str == null) {
            return null;
        }
        return !A() ? str : w(str, i6.b, i6.a, d);
    }

    /* access modifiers changed from: protected */
    public final String z(String str) {
        if (str == null) {
            return null;
        }
        if (!A()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return w(str, h6.b, h6.a, e);
        }
        return "experiment_id" + "(" + str + ")";
    }
}
