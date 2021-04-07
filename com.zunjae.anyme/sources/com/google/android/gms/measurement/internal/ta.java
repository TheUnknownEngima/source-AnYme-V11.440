package com.google.android.gms.measurement.internal;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.r;
import defpackage.ds0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

abstract class ta {
    String a;
    int b;
    Boolean c;
    Boolean d;
    Long e;
    Long f;

    ta(String str, int i) {
        this.a = str;
        this.b = i;
    }

    static Boolean b(double d2, bs0 bs0) {
        try {
            return h(new BigDecimal(d2), bs0, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j, bs0 bs0) {
        try {
            return h(new BigDecimal(j), bs0, Utils.DOUBLE_EPSILON);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    static Boolean e(String str, bs0 bs0) {
        if (!ba.S(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), bs0, Utils.DOUBLE_EPSILON);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, ds0.b bVar, boolean z, String str2, List<String> list, String str3, c4 c4Var) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (bVar == ds0.b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && bVar != ds0.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (pa.a[bVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c4Var != null) {
                        c4Var.H().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    static Boolean g(String str, ds0 ds0, c4 c4Var) {
        List<String> list;
        r.j(ds0);
        if (str == null || !ds0.A() || ds0.B() == ds0.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (ds0.B() == ds0.b.IN_LIST) {
            if (ds0.I() == 0) {
                return null;
            }
        } else if (!ds0.C()) {
            return null;
        }
        ds0.b B = ds0.B();
        boolean G = ds0.G();
        String D = (G || B == ds0.b.REGEXP || B == ds0.b.IN_LIST) ? ds0.D() : ds0.D().toUpperCase(Locale.ENGLISH);
        if (ds0.I() == 0) {
            list = null;
        } else {
            List<String> H = ds0.H();
            if (!G) {
                ArrayList arrayList = new ArrayList(H.size());
                for (String upperCase : H) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                H = Collections.unmodifiableList(arrayList);
            }
            list = H;
        }
        return f(str, B, G, D, list, B == ds0.b.REGEXP ? D : null, c4Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r2 != null) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean h(java.math.BigDecimal r9, defpackage.bs0 r10, double r11) {
        /*
            com.google.android.gms.common.internal.r.j(r10)
            boolean r0 = r10.A()
            r1 = 0
            if (r0 == 0) goto L_0x010f
            bs0$a r0 = r10.B()
            bs0$a r2 = defpackage.bs0.a.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x010f
        L_0x0014:
            bs0$a r0 = r10.B()
            bs0$a r2 = defpackage.bs0.a.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r10.H()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r10.K()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r10.F()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            bs0$a r0 = r10.B()
            bs0$a r2 = r10.B()
            bs0$a r3 = defpackage.bs0.a.BETWEEN
            if (r2 != r3) goto L_0x0067
            java.lang.String r2 = r10.I()
            boolean r2 = com.google.android.gms.measurement.internal.ba.S(r2)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r10.L()
            boolean r2 = com.google.android.gms.measurement.internal.ba.S(r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r3 = r10.I()     // Catch:{ NumberFormatException -> 0x0066 }
            r2.<init>(r3)     // Catch:{ NumberFormatException -> 0x0066 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r10 = r10.L()     // Catch:{ NumberFormatException -> 0x0066 }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x0066 }
            r10 = r2
            r2 = r1
            goto L_0x007d
        L_0x0066:
            return r1
        L_0x0067:
            java.lang.String r2 = r10.G()
            boolean r2 = com.google.android.gms.measurement.internal.ba.S(r2)
            if (r2 != 0) goto L_0x0072
            return r1
        L_0x0072:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x010f }
            java.lang.String r10 = r10.G()     // Catch:{ NumberFormatException -> 0x010f }
            r2.<init>(r10)     // Catch:{ NumberFormatException -> 0x010f }
            r10 = r1
            r3 = r10
        L_0x007d:
            bs0$a r4 = defpackage.bs0.a.BETWEEN
            if (r0 != r4) goto L_0x0084
            if (r10 != 0) goto L_0x0086
            return r1
        L_0x0084:
            if (r2 == 0) goto L_0x010f
        L_0x0086:
            int[] r4 = com.google.android.gms.measurement.internal.pa.b
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = -1
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L_0x0103
            r7 = 2
            if (r0 == r7) goto L_0x00f7
            r8 = 3
            if (r0 == r8) goto L_0x00af
            r11 = 4
            if (r0 == r11) goto L_0x009d
            goto L_0x010f
        L_0x009d:
            int r10 = r9.compareTo(r10)
            if (r10 == r4) goto L_0x00aa
            int r9 = r9.compareTo(r3)
            if (r9 == r6) goto L_0x00aa
            r5 = 1
        L_0x00aa:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00af:
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00eb
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r2.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 != r6) goto L_0x00e6
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r2.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 != r4) goto L_0x00e6
            r5 = 1
        L_0x00e6:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00eb:
            int r9 = r9.compareTo(r2)
            if (r9 != 0) goto L_0x00f2
            r5 = 1
        L_0x00f2:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00f7:
            int r9 = r9.compareTo(r2)
            if (r9 != r6) goto L_0x00fe
            r5 = 1
        L_0x00fe:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0103:
            int r9 = r9.compareTo(r2)
            if (r9 != r4) goto L_0x010a
            r5 = 1
        L_0x010a:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x010f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ta.h(java.math.BigDecimal, bs0, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    /* access modifiers changed from: package-private */
    public abstract boolean j();
}
