package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.m;
import defpackage.ej1;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class o {
    private static final Charset d = Charset.forName("UTF-8");
    static final ThreadLocal<DateFormat> e = new a();
    private final Context a;
    private final String b;
    private final SharedPreferences c;

    class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        }
    }

    private static class b {
        private f a;
        private f b;
        private f c;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* access modifiers changed from: private */
        public f g() {
            return this.b;
        }

        /* access modifiers changed from: private */
        public f h() {
            return this.c;
        }

        /* access modifiers changed from: private */
        public f i() {
            return this.a;
        }

        /* access modifiers changed from: private */
        public void j(f fVar) {
            this.b = fVar;
        }

        /* access modifiers changed from: private */
        public void k(f fVar) {
            this.c = fVar;
        }

        /* access modifiers changed from: private */
        public void l(f fVar) {
            this.a = fVar;
        }
    }

    public o(Context context, String str) {
        this.a = context;
        this.b = str;
        this.c = context.getSharedPreferences("com.google.firebase.remoteconfig_legacy_settings", 0);
    }

    private Map<String, f> a(ri1 ri1) {
        HashMap hashMap = new HashMap();
        Date date = new Date(ri1.L());
        JSONArray d2 = d(ri1.J());
        for (ti1 next : ri1.K()) {
            String J = next.J();
            if (J.startsWith("configns:")) {
                J = J.substring(9);
            }
            f.b f = f.f();
            f.b(b(next.I()));
            f.e(date);
            if (J.equals("firebase")) {
                f.d(d2);
            }
            try {
                hashMap.put(J, f.a());
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    private Map<String, String> b(List<si1> list) {
        HashMap hashMap = new HashMap();
        for (si1 next : list) {
            hashMap.put(next.I(), next.J().y(d));
        }
        return hashMap;
    }

    private JSONObject c(s02 s02) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("experimentId", s02.I());
        jSONObject.put("variantId", s02.N());
        jSONObject.put("experimentStartTime", e.get().format(new Date(s02.J())));
        jSONObject.put("triggerEvent", s02.L());
        jSONObject.put("triggerTimeoutMillis", s02.M());
        jSONObject.put("timeToLiveMillis", s02.K());
        return jSONObject;
    }

    private JSONArray d(List<ej1> list) {
        JSONArray jSONArray = new JSONArray();
        for (ej1 e2 : list) {
            s02 e3 = e(e2);
            if (e3 != null) {
                try {
                    jSONArray.put(c(e3));
                } catch (JSONException unused) {
                }
            }
        }
        return jSONArray;
    }

    private s02 e(ej1 ej1) {
        try {
            ej1.f m = ej1.iterator();
            int size = ej1.size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = ((Byte) m.next()).byteValue();
            }
            return s02.O(bArr);
        } catch (yj1 unused) {
            return null;
        }
    }

    private Map<String, b> g() {
        ui1 h = h();
        HashMap hashMap = new HashMap();
        if (h == null) {
            return hashMap;
        }
        Map<String, f> a2 = a(h.I());
        Map<String, f> a3 = a(h.K());
        Map<String, f> a4 = a(h.J());
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(a2.keySet());
        hashSet.addAll(a3.keySet());
        hashSet.addAll(a4.keySet());
        for (String str : hashSet) {
            b bVar = new b((a) null);
            if (a2.containsKey(str)) {
                bVar.j(a2.get(str));
            }
            if (a3.containsKey(str)) {
                bVar.l(a3.get(str));
            }
            if (a4.containsKey(str)) {
                bVar.k(a4.get(str));
            }
            hashMap.put(str, bVar);
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x001e A[SYNTHETIC, Splitter:B:17:0x001e] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0025 A[SYNTHETIC, Splitter:B:25:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x002c A[SYNTHETIC, Splitter:B:33:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.ui1 h() {
        /*
            r4 = this;
            android.content.Context r0 = r4.a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "persisted_config"
            java.io.FileInputStream r0 = r0.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x0029, IOException -> 0x0022, all -> 0x0018 }
            ui1 r1 = defpackage.ui1.L(r0)     // Catch:{ FileNotFoundException -> 0x002a, IOException -> 0x0023, all -> 0x0016 }
            if (r0 == 0) goto L_0x0015
            r0.close()     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            return r1
        L_0x0016:
            r1 = move-exception
            goto L_0x001c
        L_0x0018:
            r0 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            throw r1
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0028
            r0.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            return r1
        L_0x0029:
            r0 = r1
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.o.h():ui1");
    }

    private void i(Map<String, b> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            b bVar = (b) next.getValue();
            e f = f(str, "fetch");
            e f2 = f(str, "activate");
            e f3 = f(str, "defaults");
            if (bVar.i() != null) {
                f.i(bVar.i());
            }
            if (bVar.g() != null) {
                f2.i(bVar.g());
            }
            if (bVar.h() != null) {
                f3.i(bVar.h());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public e f(String str, String str2) {
        return m.c(this.a, this.b, str, str2);
    }

    public boolean j() {
        if (!this.c.getBoolean("save_legacy_configs", true)) {
            return false;
        }
        i(g());
        this.c.edit().putBoolean("save_legacy_configs", false).commit();
        return true;
    }
}
