package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import defpackage.qs0;
import defpackage.ss0;
import defpackage.us0;
import defpackage.ys0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class ba extends u9 {
    ba(x9 x9Var) {
        super(x9Var);
    }

    private static String D(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List<Long> E(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    private static List<ss0> G(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                ss0.a e0 = ss0.e0();
                for (String str : bundle.keySet()) {
                    ss0.a e02 = ss0.e0();
                    e02.C(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        e02.y(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        e02.G((String) obj);
                    } else if (obj instanceof Double) {
                        e02.x(((Double) obj).doubleValue());
                    }
                    e0.A(e02);
                }
                if (e0.I() > 0) {
                    arrayList.add((ss0) ((sy0) e0.k()));
                }
            }
        }
        return arrayList;
    }

    private static void K(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private final void L(StringBuilder sb, int i, as0 as0) {
        if (as0 != null) {
            K(sb, i);
            sb.append("filter {\n");
            if (as0.H()) {
                O(sb, i, "complement", Boolean.valueOf(as0.I()));
            }
            if (as0.K()) {
                O(sb, i, "param_name", d().y(as0.L()));
            }
            if (as0.C()) {
                int i2 = i + 1;
                ds0 D = as0.D();
                if (D != null) {
                    K(sb, i2);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (D.A()) {
                        O(sb, i2, "match_type", D.B().name());
                    }
                    if (D.C()) {
                        O(sb, i2, "expression", D.D());
                    }
                    if (D.F()) {
                        O(sb, i2, "case_sensitive", Boolean.valueOf(D.G()));
                    }
                    if (D.I() > 0) {
                        K(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : D.H()) {
                            K(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    K(sb, i2);
                    sb.append("}\n");
                }
            }
            if (as0.F()) {
                M(sb, i + 1, "number_filter", as0.G());
            }
            K(sb, i);
            sb.append("}\n");
        }
    }

    private static void M(StringBuilder sb, int i, String str, bs0 bs0) {
        if (bs0 != null) {
            K(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (bs0.A()) {
                O(sb, i, "comparison_type", bs0.B().name());
            }
            if (bs0.C()) {
                O(sb, i, "match_as_float", Boolean.valueOf(bs0.D()));
            }
            if (bs0.F()) {
                O(sb, i, "comparison_value", bs0.G());
            }
            if (bs0.H()) {
                O(sb, i, "min_comparison_value", bs0.I());
            }
            if (bs0.K()) {
                O(sb, i, "max_comparison_value", bs0.L());
            }
            K(sb, i);
            sb.append("}\n");
        }
    }

    private static void N(StringBuilder sb, int i, String str, ws0 ws0, String str2) {
        if (ws0 != null) {
            K(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (ws0.R() != 0) {
                K(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long next : ws0.O()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (ws0.H() != 0) {
                K(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long next2 : ws0.B()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (ws0.X() != 0) {
                K(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (ps0 next3 : ws0.V()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.F() ? Integer.valueOf(next3.G()) : null);
                    sb.append(":");
                    sb.append(next3.H() ? Long.valueOf(next3.I()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (ws0.Z() != 0) {
                K(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (xs0 next4 : ws0.Y()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.F() ? Integer.valueOf(next4.G()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : next4.I()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            K(sb, 3);
            sb.append("}\n");
        }
    }

    private static void O(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            K(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    private final void P(StringBuilder sb, int i, List<ss0> list) {
        if (list != null) {
            int i2 = i + 1;
            for (ss0 next : list) {
                if (next != null) {
                    K(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (!i31.a() || !j().s(u.y0)) {
                        O(sb, i2, "name", d().y(next.N()));
                        O(sb, i2, "string_value", next.T());
                        O(sb, i2, "int_value", next.W() ? Long.valueOf(next.X()) : null);
                        if (next.a0()) {
                            d = Double.valueOf(next.b0());
                        }
                        O(sb, i2, "double_value", d);
                    } else {
                        O(sb, i2, "name", next.M() ? d().y(next.N()) : null);
                        O(sb, i2, "string_value", next.S() ? next.T() : null);
                        O(sb, i2, "int_value", next.W() ? Long.valueOf(next.X()) : null);
                        if (next.a0()) {
                            d = Double.valueOf(next.b0());
                        }
                        O(sb, i2, "double_value", d);
                        if (next.d0() > 0) {
                            P(sb, i2, next.c0());
                        }
                    }
                    K(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    static boolean R(s sVar, la laVar) {
        r.j(sVar);
        r.j(laVar);
        return !TextUtils.isEmpty(laVar.f) || !TextUtils.isEmpty(laVar.v);
    }

    static boolean S(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean T(List<Long> list, int i) {
        if (i >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
    }

    static int u(us0.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.f0(); i++) {
            if (str.equals(aVar.c0(i).Q())) {
                return i;
            }
        }
        return -1;
    }

    static ss0 y(qs0 qs0, String str) {
        for (ss0 next : qs0.B()) {
            if (next.N().equals(str)) {
                return next;
            }
        }
        return null;
    }

    static <Builder extends e01> Builder z(Builder builder, byte[] bArr) {
        fy0 c = fy0.c();
        if (c != null) {
            builder.E(bArr, c);
            return builder;
        }
        builder.J(bArr);
        return builder;
    }

    /* access modifiers changed from: package-private */
    public final String A(zr0 zr0) {
        if (zr0 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zr0.G()) {
            O(sb, 0, "filter_id", Integer.valueOf(zr0.H()));
        }
        O(sb, 0, "event_name", d().v(zr0.I()));
        String D = D(zr0.O(), zr0.P(), zr0.R());
        if (!D.isEmpty()) {
            O(sb, 0, "filter_type", D);
        }
        if (zr0.M()) {
            M(sb, 1, "event_count_filter", zr0.N());
        }
        if (zr0.L() > 0) {
            sb.append("  filters {\n");
            for (as0 L : zr0.K()) {
                L(sb, 2, L);
            }
        }
        K(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String B(cs0 cs0) {
        if (cs0 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (cs0.C()) {
            O(sb, 0, "filter_id", Integer.valueOf(cs0.D()));
        }
        O(sb, 0, "property_name", d().z(cs0.F()));
        String D = D(cs0.H(), cs0.I(), cs0.L());
        if (!D.isEmpty()) {
            O(sb, 0, "filter_type", D);
        }
        L(sb, 1, cs0.G());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String C(ts0 ts0) {
        if (ts0 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (us0 next : ts0.B()) {
            if (next != null) {
                K(sb, 1);
                sb.append("bundle {\n");
                if (next.V()) {
                    O(sb, 1, "protocol_version", Integer.valueOf(next.w0()));
                }
                O(sb, 1, "platform", next.K2());
                if (next.V2()) {
                    O(sb, 1, "gmp_version", Long.valueOf(next.W()));
                }
                if (next.X()) {
                    O(sb, 1, "uploading_gmp_version", Long.valueOf(next.Y()));
                }
                if (next.J0()) {
                    O(sb, 1, "dynamite_version", Long.valueOf(next.K0()));
                }
                if (next.q0()) {
                    O(sb, 1, "config_version", Long.valueOf(next.r0()));
                }
                O(sb, 1, "gmp_app_id", next.i0());
                O(sb, 1, "admob_app_id", next.I0());
                O(sb, 1, "app_id", next.T2());
                O(sb, 1, "app_version", next.U2());
                if (next.n0()) {
                    O(sb, 1, "app_version_major", Integer.valueOf(next.o0()));
                }
                O(sb, 1, "firebase_instance_id", next.m0());
                if (next.d0()) {
                    O(sb, 1, "dev_cert_hash", Long.valueOf(next.e0()));
                }
                O(sb, 1, "app_store", next.S2());
                if (next.S1()) {
                    O(sb, 1, "upload_timestamp_millis", Long.valueOf(next.T1()));
                }
                if (next.g2()) {
                    O(sb, 1, "start_timestamp_millis", Long.valueOf(next.h2()));
                }
                if (next.s2()) {
                    O(sb, 1, "end_timestamp_millis", Long.valueOf(next.t2()));
                }
                if (next.A2()) {
                    O(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.B2()));
                }
                if (next.G2()) {
                    O(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.H2()));
                }
                O(sb, 1, "app_instance_id", next.c0());
                O(sb, 1, "resettable_device_id", next.Z());
                O(sb, 1, "device_id", next.p0());
                O(sb, 1, "ds_id", next.u0());
                if (next.a0()) {
                    O(sb, 1, "limited_ad_tracking", Boolean.valueOf(next.b0()));
                }
                O(sb, 1, "os_version", next.N2());
                O(sb, 1, "device_model", next.O2());
                O(sb, 1, "user_default_language", next.P2());
                if (next.Q2()) {
                    O(sb, 1, "time_zone_offset_minutes", Integer.valueOf(next.R2()));
                }
                if (next.f0()) {
                    O(sb, 1, "bundle_sequential_index", Integer.valueOf(next.g0()));
                }
                if (next.j0()) {
                    O(sb, 1, "service_upload", Boolean.valueOf(next.k0()));
                }
                O(sb, 1, "health_monitor", next.h0());
                if (!j().s(u.G0) && next.s0() && next.t0() != 0) {
                    O(sb, 1, "android_id", Long.valueOf(next.t0()));
                }
                if (next.v0()) {
                    O(sb, 1, "retry_counter", Integer.valueOf(next.H0()));
                }
                if (next.M0()) {
                    O(sb, 1, "consent_signals", next.N0());
                }
                List<ys0> v1 = next.v1();
                if (v1 != null) {
                    for (ys0 next2 : v1) {
                        if (next2 != null) {
                            K(sb, 2);
                            sb.append("user_property {\n");
                            Double d = null;
                            O(sb, 2, "set_timestamp_millis", next2.I() ? Long.valueOf(next2.K()) : null);
                            O(sb, 2, "name", d().z(next2.Q()));
                            O(sb, 2, "string_value", next2.T());
                            O(sb, 2, "int_value", next2.U() ? Long.valueOf(next2.V()) : null);
                            if (next2.W()) {
                                d = Double.valueOf(next2.X());
                            }
                            O(sb, 2, "double_value", d);
                            K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<os0> l0 = next.l0();
                String T2 = next.T2();
                if (l0 != null) {
                    for (os0 next3 : l0) {
                        if (next3 != null) {
                            K(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.H()) {
                                O(sb, 2, "audience_id", Integer.valueOf(next3.I()));
                            }
                            if (next3.P()) {
                                O(sb, 2, "new_audience", Boolean.valueOf(next3.Q()));
                            }
                            N(sb, 2, "current_data", next3.M(), T2);
                            if (next3.N()) {
                                N(sb, 2, "previous_data", next3.O(), T2);
                            }
                            K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<qs0> U0 = next.U0();
                if (U0 != null) {
                    for (qs0 next4 : U0) {
                        if (next4 != null) {
                            K(sb, 2);
                            sb.append("event {\n");
                            O(sb, 2, "name", d().v(next4.U()));
                            if (next4.V()) {
                                O(sb, 2, "timestamp_millis", Long.valueOf(next4.W()));
                            }
                            if (next4.X()) {
                                O(sb, 2, "previous_timestamp_millis", Long.valueOf(next4.Y()));
                            }
                            if (next4.Z()) {
                                O(sb, 2, "count", Integer.valueOf(next4.a0()));
                            }
                            if (next4.Q() != 0) {
                                P(sb, 2, next4.B());
                            }
                            K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                K(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final List<Long> F(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                h().H().b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    h().H().c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    public final void H(qs0.a aVar, String str, Object obj) {
        List<ss0> H = aVar.H();
        int i = 0;
        while (true) {
            if (i >= H.size()) {
                i = -1;
                break;
            } else if (str.equals(H.get(i).N())) {
                break;
            } else {
                i++;
            }
        }
        ss0.a e0 = ss0.e0();
        e0.C(str);
        if (obj instanceof Long) {
            e0.y(((Long) obj).longValue());
        } else if (obj instanceof String) {
            e0.G((String) obj);
        } else if (obj instanceof Double) {
            e0.x(((Double) obj).doubleValue());
        } else if (i31.a() && j().s(u.A0) && (obj instanceof Bundle[])) {
            e0.B(G((Bundle[]) obj));
        }
        if (i >= 0) {
            aVar.w(i, e0);
        } else {
            aVar.A(e0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void I(ss0.a aVar, Object obj) {
        r.j(obj);
        aVar.w();
        aVar.D();
        aVar.H();
        aVar.K();
        if (obj instanceof String) {
            aVar.G((String) obj);
        } else if (obj instanceof Long) {
            aVar.y(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.x(((Double) obj).doubleValue());
        } else if (!i31.a() || !j().s(u.A0) || !(obj instanceof Bundle[])) {
            h().E().b("Ignoring invalid (type) event param value", obj);
        } else {
            aVar.B(G((Bundle[]) obj));
        }
    }

    /* access modifiers changed from: package-private */
    public final void J(ys0.a aVar, Object obj) {
        r.j(obj);
        aVar.w();
        aVar.B();
        aVar.G();
        if (obj instanceof String) {
            aVar.D((String) obj);
        } else if (obj instanceof Long) {
            aVar.C(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.x(((Double) obj).doubleValue());
        } else {
            h().E().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean Q(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(l().c() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    public final Object U(qs0 qs0, String str) {
        ss0 y = y(qs0, str);
        if (y == null) {
            return null;
        }
        if (y.S()) {
            return y.T();
        }
        if (y.W()) {
            return Long.valueOf(y.X());
        }
        if (y.a0()) {
            return Double.valueOf(y.b0());
        }
        if (!i31.a() || !j().s(u.A0) || y.d0() <= 0) {
            return null;
        }
        List<ss0> c0 = y.c0();
        ArrayList arrayList = new ArrayList();
        for (ss0 next : c0) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (ss0 next2 : next.c0()) {
                    if (next2.S()) {
                        bundle.putString(next2.N(), next2.T());
                    } else if (next2.W()) {
                        bundle.putLong(next2.N(), next2.X());
                    } else if (next2.a0()) {
                        bundle.putDouble(next2.N(), next2.b0());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* access modifiers changed from: package-private */
    public final byte[] V(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            h().E().b("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] W(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            h().E().b("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public final List<Integer> X() {
        Map<String, String> c = u.c(this.b.n());
        if (c == null || c.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = u.P.a(null).intValue();
        Iterator<Map.Entry<String, String>> it = c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            h().H().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    h().H().b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long v(byte[] bArr) {
        r.j(bArr);
        g().b();
        MessageDigest J0 = fa.J0();
        if (J0 != null) {
            return fa.z(J0.digest(bArr));
        }
        h().E().a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        h().E().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T w(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.c4 r5 = r4.h()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.e4 r5 = r5.E()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ba.w(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    public final qs0 x(l lVar) {
        qs0.a b0 = qs0.b0();
        b0.L(lVar.e);
        Iterator<String> it = lVar.f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            ss0.a e0 = ss0.e0();
            e0.C(next);
            I(e0, lVar.f.k(next));
            b0.A(e0);
        }
        return (qs0) ((sy0) b0.k());
    }
}
