package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.abt.a;
import com.google.firebase.abt.c;
import com.google.firebase.installations.g;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.k;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.internal.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e {
    private final c a;
    private final Executor b;
    private final com.google.firebase.remoteconfig.internal.e c;
    private final com.google.firebase.remoteconfig.internal.e d;
    private final com.google.firebase.remoteconfig.internal.e e;
    private final k f;
    private final l g;

    e(Context context, com.google.firebase.c cVar, g gVar, c cVar2, Executor executor, com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.e eVar2, com.google.firebase.remoteconfig.internal.e eVar3, k kVar, l lVar, m mVar) {
        this.a = cVar2;
        this.b = executor;
        this.c = eVar;
        this.d = eVar2;
        this.e = eVar3;
        this.f = kVar;
        this.g = lVar;
    }

    public static e e() {
        return f(com.google.firebase.c.h());
    }

    public static e f(com.google.firebase.c cVar) {
        return ((m) cVar.f(m.class)).e();
    }

    private static boolean i(f fVar, f fVar2) {
        return fVar2 == null || !fVar.e().equals(fVar2.e());
    }

    static /* synthetic */ e81 j(e eVar, e81 e81, e81 e812, e81 e813) {
        if (!e81.q() || e81.m() == null) {
            return h81.e(Boolean.FALSE);
        }
        f fVar = (f) e81.m();
        return (!e812.q() || i(fVar, (f) e812.m())) ? eVar.d.i(fVar).i(eVar.b, b.b(eVar)) : h81.e(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public boolean m(e81<f> e81) {
        if (!e81.q()) {
            return false;
        }
        this.c.b();
        if (e81.m() == null) {
            return true;
        }
        r(e81.m().c());
        return true;
    }

    private e81<Void> o(Map<String, String> map) {
        try {
            f.b f2 = f.f();
            f2.b(map);
            return this.e.i(f2.a()).r(a.b());
        } catch (JSONException unused) {
            return h81.e(null);
        }
    }

    static List<Map<String, String>> q(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public e81<Boolean> b() {
        e81<f> c2 = this.c.c();
        e81<f> c3 = this.d.c();
        return h81.i(c2, c3).k(this.b, c.b(this, c2, c3));
    }

    public e81<Void> c(long j) {
        return this.f.d(j).r(d.b());
    }

    public boolean d(String str) {
        return this.g.a(str);
    }

    public long g(String str) {
        return this.g.c(str);
    }

    public String h(String str) {
        return this.g.e(str);
    }

    public e81<Void> n(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            boolean z = value instanceof byte[];
            String str = (String) next.getKey();
            if (z) {
                hashMap.put(str, new String((byte[]) value));
            } else {
                hashMap.put(str, value.toString());
            }
        }
        return o(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.d.c();
        this.e.c();
        this.c.c();
    }

    /* access modifiers changed from: package-private */
    public void r(JSONArray jSONArray) {
        if (this.a != null) {
            try {
                this.a.k(q(jSONArray));
            } catch (a | JSONException unused) {
            }
        }
    }
}
