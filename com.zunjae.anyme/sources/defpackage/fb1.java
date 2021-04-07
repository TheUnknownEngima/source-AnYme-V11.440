package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import com.google.firebase.analytics.connector.internal.b;
import com.google.firebase.analytics.connector.internal.d;
import com.google.firebase.c;
import defpackage.eb1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: fb1  reason: default package */
public class fb1 implements eb1 {
    private static volatile eb1 c;
    private final f71 a;
    final Map<String, Object> b = new ConcurrentHashMap();

    /* renamed from: fb1$a */
    class a implements eb1.a {
        a(fb1 fb1, String str) {
        }
    }

    private fb1(f71 f71) {
        r.j(f71);
        this.a = f71;
    }

    public static eb1 h(c cVar, Context context, rh1 rh1) {
        r.j(cVar);
        r.j(context);
        r.j(rh1);
        r.j(context.getApplicationContext());
        if (c == null) {
            synchronized (fb1.class) {
                if (c == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.q()) {
                        rh1.b(com.google.firebase.a.class, hb1.e, gb1.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.p());
                    }
                    c = new fb1(uq0.b(context, (String) null, (String) null, (String) null, bundle).e());
                }
            }
        }
        return c;
    }

    static final /* synthetic */ void i(oh1 oh1) {
        boolean z = ((com.google.firebase.a) oh1.a()).a;
        synchronized (fb1.class) {
            ((fb1) c).a.i(z);
        }
    }

    private final boolean j(String str) {
        return !str.isEmpty() && this.b.containsKey(str) && this.b.get(str) != null;
    }

    public Map<String, Object> a(boolean z) {
        return this.a.d((String) null, (String) null, z);
    }

    public void b(eb1.c cVar) {
        if (com.google.firebase.analytics.connector.internal.c.b(cVar)) {
            this.a.g(com.google.firebase.analytics.connector.internal.c.g(cVar));
        }
    }

    public void c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.c.c(str) && com.google.firebase.analytics.connector.internal.c.d(str2, bundle) && com.google.firebase.analytics.connector.internal.c.f(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.c.h(str, str2, bundle);
            this.a.e(str, str2, bundle);
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.c.d(str2, bundle)) {
            this.a.a(str, str2, bundle);
        }
    }

    public int d(String str) {
        return this.a.c(str);
    }

    public List<eb1.c> e(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle a2 : this.a.b(str, str2)) {
            arrayList.add(com.google.firebase.analytics.connector.internal.c.a(a2));
        }
        return arrayList;
    }

    public void f(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.c.c(str) && com.google.firebase.analytics.connector.internal.c.e(str, str2)) {
            this.a.h(str, str2, obj);
        }
    }

    public eb1.a g(String str, eb1.b bVar) {
        r.j(bVar);
        if (!com.google.firebase.analytics.connector.internal.c.c(str) || j(str)) {
            return null;
        }
        f71 f71 = this.a;
        Object bVar2 = "fiam".equals(str) ? new b(f71, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new d(f71, bVar) : null;
        if (bVar2 == null) {
            return null;
        }
        this.b.put(str, bVar2);
        return new a(this, str);
    }
}
