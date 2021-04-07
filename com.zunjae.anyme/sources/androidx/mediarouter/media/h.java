package androidx.mediarouter.media;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.g;
import androidx.mediarouter.media.d;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.o;
import androidx.mediarouter.media.p;
import androidx.mediarouter.media.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

public final class h {
    static final boolean c = Log.isLoggable("MediaRouter", 3);
    static d d;
    final Context a;
    final ArrayList<b> b = new ArrayList<>();

    public static abstract class a {
        public void a(h hVar, e eVar) {
        }

        public void b(h hVar, e eVar) {
        }

        public void c(h hVar, e eVar) {
        }

        public void d(h hVar, f fVar) {
        }

        public void e(h hVar, f fVar) {
        }

        public void f(h hVar, f fVar) {
        }

        public void g(h hVar, f fVar) {
        }

        public void h(h hVar, f fVar) {
        }

        public void i(h hVar, f fVar) {
        }

        public void j(h hVar, f fVar, int i) {
            i(hVar, fVar);
        }

        public void k(h hVar, f fVar) {
        }
    }

    private static final class b {
        public final h a;
        public final a b;
        public g c = g.c;
        public int d;

        public b(h hVar, a aVar) {
            this.a = hVar;
            this.b = aVar;
        }

        public boolean a(f fVar) {
            return (this.d & 2) != 0 || fVar.F(this.c);
        }
    }

    public static abstract class c {
        public void a(String str, Bundle bundle) {
        }

        public void b(Bundle bundle) {
        }
    }

    private static final class d implements r.f, o.c {
        final Context a;
        final ArrayList<WeakReference<h>> b = new ArrayList<>();
        private final ArrayList<f> c = new ArrayList<>();
        private final Map<q3<String, String>, String> d = new HashMap();
        private final ArrayList<e> e = new ArrayList<>();
        private final ArrayList<f> f = new ArrayList<>();
        final p.c g = new p.c();
        private final e h = new e();
        final c i = new c();
        final r j;
        private final boolean k;
        private o l;
        private f m;
        private f n;
        f o;
        d.e p;
        private final Map<String, d.e> q = new HashMap();
        private c r;
        private C0036d s;
        MediaSessionCompat t;
        private MediaSessionCompat u;
        private MediaSessionCompat.j v = new a();
        d.b.C0034d w = new b();

        class a implements MediaSessionCompat.j {
            a() {
            }

            public void a() {
                MediaSessionCompat mediaSessionCompat = d.this.t;
                if (mediaSessionCompat == null) {
                    return;
                }
                if (mediaSessionCompat.g()) {
                    d dVar = d.this;
                    dVar.e(dVar.t.d());
                    return;
                }
                d dVar2 = d.this;
                dVar2.w(dVar2.t.d());
            }
        }

        class b implements d.b.C0034d {
            b() {
            }

            public void a(d.b bVar, Collection<d.b.c> collection) {
                d dVar = d.this;
                if (bVar == dVar.p) {
                    dVar.o.O(collection);
                }
            }
        }

        private final class c extends Handler {
            private final ArrayList<b> a = new ArrayList<>();

            c() {
            }

            private void a(b bVar, int i, Object obj, int i2) {
                h hVar = bVar.a;
                a aVar = bVar.b;
                int i3 = 65280 & i;
                if (i3 == 256) {
                    f fVar = (f) obj;
                    if (bVar.a(fVar)) {
                        switch (i) {
                            case 257:
                                aVar.d(hVar, fVar);
                                return;
                            case 258:
                                aVar.g(hVar, fVar);
                                return;
                            case 259:
                                aVar.e(hVar, fVar);
                                return;
                            case 260:
                                aVar.k(hVar, fVar);
                                return;
                            case 261:
                                aVar.f(hVar, fVar);
                                return;
                            case 262:
                                aVar.h(hVar, fVar);
                                return;
                            case 263:
                                aVar.j(hVar, fVar, i2);
                                return;
                            default:
                                return;
                        }
                    }
                } else if (i3 == 512) {
                    e eVar = (e) obj;
                    switch (i) {
                        case 513:
                            aVar.a(hVar, eVar);
                            return;
                        case 514:
                            aVar.c(hVar, eVar);
                            return;
                        case 515:
                            aVar.b(hVar, eVar);
                            return;
                        default:
                            return;
                    }
                }
            }

            private void d(int i, Object obj) {
                if (i != 262) {
                    switch (i) {
                        case 257:
                            d.this.j.A((f) obj);
                            return;
                        case 258:
                            d.this.j.C((f) obj);
                            return;
                        case 259:
                            d.this.j.B((f) obj);
                            return;
                        default:
                            return;
                    }
                } else {
                    d.this.j.D((f) obj);
                }
            }

            public void b(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            public void c(int i, Object obj, int i2) {
                Message obtainMessage = obtainMessage(i, obj);
                obtainMessage.arg1 = i2;
                obtainMessage.sendToTarget();
            }

            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                if (i == 259 && d.this.q().l().equals(((f) obj).l())) {
                    d.this.L(true);
                }
                d(i, obj);
                try {
                    int size = d.this.b.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        h hVar = (h) d.this.b.get(size).get();
                        if (hVar == null) {
                            d.this.b.remove(size);
                        } else {
                            this.a.addAll(hVar.b);
                        }
                    }
                    int size2 = this.a.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        a(this.a.get(i3), i, obj, i2);
                    }
                } finally {
                    this.a.clear();
                }
            }
        }

        /* renamed from: androidx.mediarouter.media.h$d$d  reason: collision with other inner class name */
        private final class C0036d {
            private final MediaSessionCompat a;
            private int b;
            private int c;
            private g d;

            /* renamed from: androidx.mediarouter.media.h$d$d$a */
            class a extends g {

                /* renamed from: androidx.mediarouter.media.h$d$d$a$a  reason: collision with other inner class name */
                class C0037a implements Runnable {
                    final /* synthetic */ int e;

                    C0037a(int i) {
                        this.e = i;
                    }

                    public void run() {
                        f fVar = d.this.o;
                        if (fVar != null) {
                            fVar.H(this.e);
                        }
                    }
                }

                /* renamed from: androidx.mediarouter.media.h$d$d$a$b */
                class b implements Runnable {
                    final /* synthetic */ int e;

                    b(int i) {
                        this.e = i;
                    }

                    public void run() {
                        f fVar = d.this.o;
                        if (fVar != null) {
                            fVar.I(this.e);
                        }
                    }
                }

                a(int i, int i2, int i3) {
                    super(i, i2, i3);
                }

                public void e(int i) {
                    d.this.i.post(new b(i));
                }

                public void f(int i) {
                    d.this.i.post(new C0037a(i));
                }
            }

            C0036d(MediaSessionCompat mediaSessionCompat) {
                this.a = mediaSessionCompat;
            }

            public void a() {
                MediaSessionCompat mediaSessionCompat = this.a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.o(d.this.g.d);
                    this.d = null;
                }
            }

            public void b(int i, int i2, int i3) {
                if (this.a != null) {
                    g gVar = this.d;
                    if (gVar != null && i == this.b && i2 == this.c) {
                        gVar.h(i3);
                        return;
                    }
                    a aVar = new a(i, i2, i3);
                    this.d = aVar;
                    this.a.p(aVar);
                }
            }

            public MediaSessionCompat.Token c() {
                MediaSessionCompat mediaSessionCompat = this.a;
                if (mediaSessionCompat != null) {
                    return mediaSessionCompat.e();
                }
                return null;
            }
        }

        private final class e extends d.a {
            e() {
            }

            public void a(d dVar, e eVar) {
                d.this.J(dVar, eVar);
            }
        }

        private final class f implements p.d {
            private final p a;
            private boolean b;

            public f(Object obj) {
                p b2 = p.b(d.this.a, obj);
                this.a = b2;
                b2.d(this);
                e();
            }

            public void a(int i) {
                f fVar;
                if (!this.b && (fVar = d.this.o) != null) {
                    fVar.H(i);
                }
            }

            public void b(int i) {
                f fVar;
                if (!this.b && (fVar = d.this.o) != null) {
                    fVar.I(i);
                }
            }

            public void c() {
                this.b = true;
                this.a.d((p.d) null);
            }

            public Object d() {
                return this.a.a();
            }

            public void e() {
                this.a.c(d.this.g);
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        d(Context context) {
            this.a = context;
            u2.a(context);
            this.k = androidx.core.app.b.a((ActivityManager) context.getSystemService("activity"));
            this.j = r.z(context, this);
        }

        private void D(C0036d dVar) {
            C0036d dVar2 = this.s;
            if (dVar2 != null) {
                dVar2.a();
            }
            this.s = dVar;
            if (dVar != null) {
                H();
            }
        }

        private void E(f fVar, int i2) {
            d.b bVar;
            String str;
            StringBuilder sb;
            if (h.d == null || (this.n != null && fVar.w())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb2 = new StringBuilder();
                for (int i3 = 3; i3 < stackTrace.length; i3++) {
                    StackTraceElement stackTraceElement = stackTrace[i3];
                    sb2.append(stackTraceElement.getClassName());
                    sb2.append(".");
                    sb2.append(stackTraceElement.getMethodName());
                    sb2.append(":");
                    sb2.append(stackTraceElement.getLineNumber());
                    sb2.append("  ");
                }
                if (h.d == null) {
                    sb = new StringBuilder();
                    str = "setSelectedRouteInternal is called while sGlobal is null: pkgName=";
                } else {
                    sb = new StringBuilder();
                    str = "Default route is selected while a BT route is available: pkgName=";
                }
                sb.append(str);
                sb.append(this.a.getPackageName());
                sb.append(", callers=");
                sb.append(sb2.toString());
                sb.toString();
            }
            f fVar2 = this.o;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    if (h.c) {
                        "Route unselected: " + this.o + " reason: " + i2;
                    }
                    this.i.c(263, this.o, i2);
                    d.e eVar = this.p;
                    if (eVar != null) {
                        eVar.i(i2);
                        this.p.e();
                        this.p = null;
                    }
                    if (!this.q.isEmpty()) {
                        for (d.e next : this.q.values()) {
                            next.i(i2);
                            next.e();
                        }
                        this.q.clear();
                    }
                }
                if (fVar.r().g()) {
                    d.b s2 = fVar.s().s(fVar.b);
                    s2.q(androidx.core.content.a.i(this.a), this.w);
                    bVar = s2;
                } else {
                    bVar = fVar.s().t(fVar.b);
                }
                this.p = bVar;
                this.o = fVar;
                d.e eVar2 = this.p;
                if (eVar2 != null) {
                    eVar2.f();
                }
                if (h.c) {
                    "Route selected: " + this.o;
                }
                this.i.b(262, this.o);
                if (this.o.z()) {
                    List<f> m2 = this.o.m();
                    this.q.clear();
                    for (f next2 : m2) {
                        d.e u2 = next2.s().u(next2.b, this.o.b);
                        u2.f();
                        this.q.put(next2.c, u2);
                    }
                }
                H();
            }
        }

        private void H() {
            C0036d dVar;
            f fVar = this.o;
            if (fVar != null) {
                this.g.a = fVar.t();
                this.g.b = this.o.v();
                this.g.c = this.o.u();
                this.g.d = this.o.o();
                this.g.e = this.o.p();
                int size = this.f.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    this.f.get(i3).e();
                }
                if (this.s == null) {
                    return;
                }
                if (this.o == l() || this.o == k()) {
                    dVar = this.s;
                } else {
                    if (this.g.c == 1) {
                        i2 = 2;
                    }
                    C0036d dVar2 = this.s;
                    p.c cVar = this.g;
                    dVar2.b(i2, cVar.b, cVar.a);
                    return;
                }
            } else {
                dVar = this.s;
                if (dVar == null) {
                    return;
                }
            }
            dVar.a();
        }

        private void I(e eVar, e eVar2) {
            boolean z;
            String str;
            StringBuilder sb;
            if (eVar.h(eVar2)) {
                int i2 = 0;
                if (eVar2 == null || (!eVar2.d() && eVar2 != this.j.o())) {
                    "Ignoring invalid provider descriptor: " + eVar2;
                    z = false;
                } else {
                    List<b> c2 = eVar2.c();
                    ArrayList<q3> arrayList = new ArrayList<>();
                    ArrayList<q3> arrayList2 = new ArrayList<>();
                    z = false;
                    for (b next : c2) {
                        if (next == null || !next.z()) {
                            sb = new StringBuilder();
                            str = "Ignoring invalid system route descriptor: ";
                        } else {
                            String m2 = next.m();
                            int b2 = eVar.b(m2);
                            if (b2 < 0) {
                                f fVar = new f(eVar, m2, f(eVar, m2));
                                int i3 = i2 + 1;
                                eVar.b.add(i2, fVar);
                                this.c.add(fVar);
                                if (next.k().size() > 0) {
                                    arrayList.add(new q3(fVar, next));
                                } else {
                                    fVar.G(next);
                                    if (h.c) {
                                        "Route added: " + fVar;
                                    }
                                    this.i.b(257, fVar);
                                }
                                i2 = i3;
                            } else if (b2 < i2) {
                                sb = new StringBuilder();
                                str = "Ignoring route descriptor with duplicate id: ";
                            } else {
                                f fVar2 = eVar.b.get(b2);
                                int i4 = i2 + 1;
                                Collections.swap(eVar.b, b2, i2);
                                if (next.k().size() > 0) {
                                    arrayList2.add(new q3(fVar2, next));
                                } else if (K(fVar2, next) != 0 && fVar2 == this.o) {
                                    i2 = i4;
                                    z = true;
                                }
                                i2 = i4;
                            }
                        }
                        sb.append(str);
                        sb.append(next);
                        sb.toString();
                    }
                    for (q3 q3Var : arrayList) {
                        f fVar3 = (f) q3Var.a;
                        fVar3.G((b) q3Var.b);
                        if (h.c) {
                            "Route added: " + fVar3;
                        }
                        this.i.b(257, fVar3);
                    }
                    for (q3 q3Var2 : arrayList2) {
                        f fVar4 = (f) q3Var2.a;
                        if (K(fVar4, (b) q3Var2.b) != 0 && fVar4 == this.o) {
                            z = true;
                        }
                    }
                }
                for (int size = eVar.b.size() - 1; size >= i2; size--) {
                    f fVar5 = eVar.b.get(size);
                    fVar5.G((b) null);
                    this.c.remove(fVar5);
                }
                L(z);
                for (int size2 = eVar.b.size() - 1; size2 >= i2; size2--) {
                    f remove = eVar.b.remove(size2);
                    if (h.c) {
                        "Route removed: " + remove;
                    }
                    this.i.b(258, remove);
                }
                if (h.c) {
                    "Provider changed: " + eVar;
                }
                this.i.b(515, eVar);
            }
        }

        private int K(f fVar, b bVar) {
            int G = fVar.G(bVar);
            if (G != 0) {
                if ((G & 1) != 0) {
                    if (h.c) {
                        "Route changed: " + fVar;
                    }
                    this.i.b(259, fVar);
                }
                if ((G & 2) != 0) {
                    if (h.c) {
                        "Route volume changed: " + fVar;
                    }
                    this.i.b(260, fVar);
                }
                if ((G & 4) != 0) {
                    if (h.c) {
                        "Route presentation display changed: " + fVar;
                    }
                    this.i.b(261, fVar);
                }
            }
            return G;
        }

        private e h(d dVar) {
            int size = this.e.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.e.get(i2).a == dVar) {
                    return this.e.get(i2);
                }
            }
            return null;
        }

        private int i(Object obj) {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f.get(i2).d() == obj) {
                    return i2;
                }
            }
            return -1;
        }

        private int j(String str) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.c.get(i2).c.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        private boolean t(f fVar) {
            return fVar.s() == this.j && fVar.b.equals("DEFAULT_ROUTE");
        }

        private boolean u(f fVar) {
            return fVar.s() == this.j && fVar.M("android.media.intent.category.LIVE_AUDIO") && !fVar.M("android.media.intent.category.LIVE_VIDEO");
        }

        /* access modifiers changed from: package-private */
        public void A(f fVar, int i2) {
            StringBuilder sb;
            String str;
            if (!this.c.contains(fVar)) {
                sb = new StringBuilder();
                str = "Ignoring attempt to select removed route: ";
            } else if (!fVar.g) {
                sb = new StringBuilder();
                str = "Ignoring attempt to select disabled route: ";
            } else {
                E(fVar, i2);
                return;
            }
            sb.append(str);
            sb.append(fVar);
            sb.toString();
        }

        public void B(f fVar, Intent intent, c cVar) {
            d.e eVar;
            if ((fVar != this.o || (eVar = this.p) == null || !eVar.d(intent, cVar)) && cVar != null) {
                cVar.a((String) null, (Bundle) null);
            }
        }

        public void C(MediaSessionCompat mediaSessionCompat) {
            this.u = mediaSessionCompat;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                D(mediaSessionCompat != null ? new C0036d(mediaSessionCompat) : null);
            } else if (i2 >= 14) {
                MediaSessionCompat mediaSessionCompat2 = this.t;
                if (mediaSessionCompat2 != null) {
                    w(mediaSessionCompat2.d());
                    this.t.i(this.v);
                }
                this.t = mediaSessionCompat;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.a(this.v);
                    if (mediaSessionCompat.g()) {
                        e(mediaSessionCompat.d());
                    }
                }
            }
        }

        public void F() {
            b(this.j);
            o oVar = new o(this.a, this);
            this.l = oVar;
            oVar.c();
        }

        public void G() {
            g.a aVar = new g.a();
            int size = this.b.size();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                h hVar = (h) this.b.get(size).get();
                if (hVar == null) {
                    this.b.remove(size);
                } else {
                    int size2 = hVar.b.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        b bVar = hVar.b.get(i2);
                        aVar.c(bVar.c);
                        if ((bVar.d & 1) != 0) {
                            z = true;
                            z2 = true;
                        }
                        if ((bVar.d & 4) != 0 && !this.k) {
                            z = true;
                        }
                        if ((bVar.d & 8) != 0) {
                            z = true;
                        }
                    }
                }
            }
            g d2 = z ? aVar.d() : g.c;
            c cVar = this.r;
            if (cVar == null || !cVar.d().equals(d2) || this.r.e() != z2) {
                if (!d2.f() || z2) {
                    this.r = new c(d2, z2);
                } else if (this.r != null) {
                    this.r = null;
                } else {
                    return;
                }
                if (h.c) {
                    "Updated discovery request: " + this.r;
                }
                if (z && !z2) {
                    boolean z3 = this.k;
                }
                int size3 = this.e.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.e.get(i3).a.y(this.r);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void J(d dVar, e eVar) {
            e h2 = h(dVar);
            if (h2 != null) {
                I(h2, eVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void L(boolean z) {
            f fVar = this.m;
            if (fVar != null && !fVar.C()) {
                "Clearing the default route because it is no longer selectable: " + this.m;
                this.m = null;
            }
            if (this.m == null && !this.c.isEmpty()) {
                Iterator<f> it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    if (t(next) && next.C()) {
                        this.m = next;
                        "Found default route: " + this.m;
                        break;
                    }
                }
            }
            f fVar2 = this.n;
            if (fVar2 != null && !fVar2.C()) {
                "Clearing the bluetooth route because it is no longer selectable: " + this.n;
                this.n = null;
            }
            if (this.n == null && !this.c.isEmpty()) {
                Iterator<f> it2 = this.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    f next2 = it2.next();
                    if (u(next2) && next2.C()) {
                        this.n = next2;
                        "Found bluetooth route: " + this.n;
                        break;
                    }
                }
            }
            f fVar3 = this.o;
            if (fVar3 == null || !fVar3.y()) {
                "Unselecting the current route because it is no longer selectable: " + this.o;
                E(g(), 0);
            } else if (z) {
                if (this.o.z()) {
                    List<f> m2 = this.o.m();
                    HashSet hashSet = new HashSet();
                    for (f fVar4 : m2) {
                        hashSet.add(fVar4.c);
                    }
                    Iterator<Map.Entry<String, d.e>> it3 = this.q.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry next3 = it3.next();
                        if (!hashSet.contains(next3.getKey())) {
                            d.e eVar = (d.e) next3.getValue();
                            eVar.h();
                            eVar.e();
                            it3.remove();
                        }
                    }
                    for (f next4 : m2) {
                        if (!this.q.containsKey(next4.c)) {
                            d.e u2 = next4.s().u(next4.b, this.o.b);
                            u2.f();
                            this.q.put(next4.c, u2);
                        }
                    }
                }
                H();
            }
        }

        public void a(String str) {
            f a2;
            this.i.removeMessages(262);
            e h2 = h(this.j);
            if (h2 != null && (a2 = h2.a(str)) != null) {
                a2.J();
            }
        }

        public void b(d dVar) {
            if (h(dVar) == null) {
                e eVar = new e(dVar);
                this.e.add(eVar);
                if (h.c) {
                    "Provider added: " + eVar;
                }
                this.i.b(513, eVar);
                I(eVar, dVar.o());
                dVar.w(this.h);
                dVar.y(this.r);
            }
        }

        public void c(d dVar) {
            e h2 = h(dVar);
            if (h2 != null) {
                dVar.w((d.a) null);
                dVar.y((c) null);
                I(h2, (e) null);
                if (h.c) {
                    "Provider removed: " + h2;
                }
                this.i.b(514, h2);
                this.e.remove(h2);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(f fVar) {
            if (this.o.i() == null || !(this.p instanceof d.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            f.a i2 = fVar.i();
            if (this.o.m().contains(fVar) || i2 == null || !i2.b()) {
                "Ignoring attemp to add a non-groupable route to dynamic group : " + fVar;
                return;
            }
            ((d.b) this.p).n(fVar.f());
        }

        public void e(Object obj) {
            if (i(obj) < 0) {
                this.f.add(new f(obj));
            }
        }

        /* access modifiers changed from: package-private */
        public String f(e eVar, String str) {
            String flattenToShortString = eVar.c().flattenToShortString();
            String str2 = flattenToShortString + ":" + str;
            if (j(str2) < 0) {
                this.d.put(new q3(flattenToShortString, str), str2);
                return str2;
            }
            "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route";
            int i2 = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", new Object[]{str2, Integer.valueOf(i2)});
                if (j(format) < 0) {
                    this.d.put(new q3(flattenToShortString, str), format);
                    return format;
                }
                i2++;
            }
        }

        /* access modifiers changed from: package-private */
        public f g() {
            Iterator<f> it = this.c.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next != this.m && u(next) && next.C()) {
                    return next;
                }
            }
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public f k() {
            return this.n;
        }

        /* access modifiers changed from: package-private */
        public f l() {
            f fVar = this.m;
            if (fVar != null) {
                return fVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        public MediaSessionCompat.Token m() {
            C0036d dVar = this.s;
            if (dVar != null) {
                return dVar.c();
            }
            MediaSessionCompat mediaSessionCompat = this.u;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.e();
            }
            return null;
        }

        public f n(String str) {
            Iterator<f> it = this.c.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next.c.equals(str)) {
                    return next;
                }
            }
            return null;
        }

        public h o(Context context) {
            int size = this.b.size();
            while (true) {
                size--;
                if (size >= 0) {
                    h hVar = (h) this.b.get(size).get();
                    if (hVar == null) {
                        this.b.remove(size);
                    } else if (hVar.a == context) {
                        return hVar;
                    }
                } else {
                    h hVar2 = new h(context);
                    this.b.add(new WeakReference(hVar2));
                    return hVar2;
                }
            }
        }

        public List<f> p() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public f q() {
            f fVar = this.o;
            if (fVar != null) {
                return fVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        /* access modifiers changed from: package-private */
        public String r(e eVar, String str) {
            return this.d.get(new q3(eVar.c().flattenToShortString(), str));
        }

        public boolean s(g gVar, int i2) {
            if (gVar.f()) {
                return false;
            }
            if ((i2 & 2) == 0 && this.k) {
                return true;
            }
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar = this.c.get(i3);
                if (((i2 & 1) == 0 || !fVar.x()) && fVar.F(gVar)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void v(f fVar) {
            if (this.o.i() == null || !(this.p instanceof d.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            f.a i2 = fVar.i();
            if (!this.o.m().contains(fVar) || i2 == null || !i2.d()) {
                "Ignoring attempt to remove a non-unselectable member route : " + fVar;
            } else if (this.o.m().size() > 1) {
                ((d.b) this.p).o(fVar.f());
            }
        }

        public void w(Object obj) {
            int i2 = i(obj);
            if (i2 >= 0) {
                this.f.remove(i2).c();
            }
        }

        public void x(f fVar, int i2) {
            d.e eVar;
            d.e eVar2;
            if (fVar == this.o && (eVar2 = this.p) != null) {
                eVar2.g(i2);
            } else if (!this.q.isEmpty() && (eVar = this.q.get(fVar.c)) != null) {
                eVar.g(i2);
            }
        }

        public void y(f fVar, int i2) {
            d.e eVar;
            if (fVar == this.o && (eVar = this.p) != null) {
                eVar.j(i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void z(f fVar) {
            A(fVar, 3);
        }
    }

    public static final class e {
        final d a;
        final List<f> b = new ArrayList();
        private final d.C0035d c;
        private e d;

        e(d dVar) {
            this.a = dVar;
            this.c = dVar.r();
        }

        /* access modifiers changed from: package-private */
        public f a(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (this.b.get(i).b.equals(str)) {
                    return this.b.get(i);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int b(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (this.b.get(i).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public ComponentName c() {
            return this.c.a();
        }

        public String d() {
            return this.c.b();
        }

        public d e() {
            h.d();
            return this.a;
        }

        public List<f> f() {
            h.d();
            return Collections.unmodifiableList(this.b);
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            e eVar = this.d;
            return eVar != null && eVar.e();
        }

        /* access modifiers changed from: package-private */
        public boolean h(e eVar) {
            if (this.d == eVar) {
                return false;
            }
            this.d = eVar;
            return true;
        }

        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + d() + " }";
        }
    }

    public static class f {
        private final e a;
        final String b;
        final String c;
        private String d;
        private String e;
        private Uri f;
        boolean g;
        private int h;
        private boolean i;
        private final ArrayList<IntentFilter> j = new ArrayList<>();
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q = -1;
        private Bundle r;
        private IntentSender s;
        b t;
        d.b.c u;
        private a v;
        private List<f> w = new ArrayList();

        public class a {
            public a() {
            }

            public int a() {
                d.b.c cVar = f.this.u;
                if (cVar != null) {
                    return cVar.c();
                }
                return 1;
            }

            public boolean b() {
                d.b.c cVar = f.this.u;
                return cVar != null && cVar.d();
            }

            public boolean c() {
                d.b.c cVar = f.this.u;
                return cVar != null && cVar.e();
            }

            public boolean d() {
                d.b.c cVar = f.this.u;
                return cVar == null || cVar.f();
            }
        }

        f(e eVar, String str, String str2) {
            this.a = eVar;
            this.b = str;
            this.c = str2;
        }

        private boolean A(IntentFilter intentFilter, IntentFilter intentFilter2) {
            int countActions;
            if (intentFilter == intentFilter2) {
                return true;
            }
            if (intentFilter == null || intentFilter2 == null || (countActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                return false;
            }
            for (int i2 = 0; i2 < countActions; i2++) {
                if (!intentFilter.getAction(i2).equals(intentFilter2.getAction(i2))) {
                    return false;
                }
            }
            int countCategories = intentFilter.countCategories();
            if (countCategories != intentFilter2.countCategories()) {
                return false;
            }
            for (int i3 = 0; i3 < countCategories; i3++) {
                if (!intentFilter.getCategory(i3).equals(intentFilter2.getCategory(i3))) {
                    return false;
                }
            }
            return true;
        }

        private boolean B(List<IntentFilter> list, List<IntentFilter> list2) {
            if (list == list2) {
                return true;
            }
            if (list == null || list2 == null) {
                return false;
            }
            ListIterator<IntentFilter> listIterator = list.listIterator();
            ListIterator<IntentFilter> listIterator2 = list2.listIterator();
            while (listIterator.hasNext() && listIterator2.hasNext()) {
                if (!A(listIterator.next(), listIterator2.next())) {
                    return false;
                }
            }
            return !listIterator.hasNext() && !listIterator2.hasNext();
        }

        private static boolean E(f fVar) {
            return TextUtils.equals(fVar.s().r().b(), "android");
        }

        /* access modifiers changed from: package-private */
        public boolean C() {
            return this.t != null && this.g;
        }

        public boolean D() {
            h.d();
            return h.d.q() == this;
        }

        public boolean F(g gVar) {
            if (gVar != null) {
                h.d();
                return gVar.h(this.j);
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        /* access modifiers changed from: package-private */
        public int G(b bVar) {
            if (this.t != bVar) {
                return N(bVar);
            }
            return 0;
        }

        public void H(int i2) {
            h.d();
            h.d.x(this, Math.min(this.p, Math.max(0, i2)));
        }

        public void I(int i2) {
            h.d();
            if (i2 != 0) {
                h.d.y(this, i2);
            }
        }

        public void J() {
            h.d();
            h.d.z(this);
        }

        public void K(Intent intent, c cVar) {
            if (intent != null) {
                h.d();
                h.d.B(this, intent, cVar);
                return;
            }
            throw new IllegalArgumentException("intent must not be null");
        }

        public boolean L(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            } else if (str2 != null) {
                h.d();
                int size = this.j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    IntentFilter intentFilter = this.j.get(i2);
                    if (intentFilter.hasCategory(str) && intentFilter.hasAction(str2)) {
                        return true;
                    }
                }
                return false;
            } else {
                throw new IllegalArgumentException("action must not be null");
            }
        }

        public boolean M(String str) {
            if (str != null) {
                h.d();
                int size = this.j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.j.get(i2).hasCategory(str)) {
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("category must not be null");
        }

        /* access modifiers changed from: package-private */
        public int N(b bVar) {
            int i2;
            this.t = bVar;
            boolean z = false;
            if (bVar == null) {
                return 0;
            }
            if (!p3.a(this.d, bVar.p())) {
                this.d = bVar.p();
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!p3.a(this.e, bVar.h())) {
                this.e = bVar.h();
                i2 |= 1;
            }
            if (!p3.a(this.f, bVar.l())) {
                this.f = bVar.l();
                i2 |= 1;
            }
            if (this.g != bVar.y()) {
                this.g = bVar.y();
                i2 |= 1;
            }
            if (this.h != bVar.f()) {
                this.h = bVar.f();
                i2 |= 1;
            }
            if (!B(this.j, bVar.g())) {
                this.j.clear();
                this.j.addAll(bVar.g());
                i2 |= 1;
            }
            if (this.k != bVar.r()) {
                this.k = bVar.r();
                i2 |= 1;
            }
            if (this.l != bVar.q()) {
                this.l = bVar.q();
                i2 |= 1;
            }
            if (this.m != bVar.i()) {
                this.m = bVar.i();
                i2 |= 1;
            }
            if (this.n != bVar.v()) {
                this.n = bVar.v();
                i2 |= 3;
            }
            if (this.o != bVar.u()) {
                this.o = bVar.u();
                i2 |= 3;
            }
            if (this.p != bVar.w()) {
                this.p = bVar.w();
                i2 |= 3;
            }
            if (this.q != bVar.s()) {
                this.q = bVar.s();
                i2 |= 5;
            }
            if (!p3.a(this.r, bVar.j())) {
                this.r = bVar.j();
                i2 |= 1;
            }
            if (!p3.a(this.s, bVar.t())) {
                this.s = bVar.t();
                i2 |= 1;
            }
            if (this.i != bVar.b()) {
                this.i = bVar.b();
                i2 |= 5;
            }
            List<String> k2 = bVar.k();
            ArrayList arrayList = new ArrayList();
            if (k2.size() != this.w.size()) {
                z = true;
            }
            for (String r2 : k2) {
                f n2 = h.d.n(h.d.r(r(), r2));
                if (n2 != null) {
                    arrayList.add(n2);
                    if (!z && !this.w.contains(n2)) {
                        z = true;
                    }
                }
            }
            if (!z) {
                return i2;
            }
            this.w = arrayList;
            return i2 | 1;
        }

        /* access modifiers changed from: package-private */
        public void O(Collection<d.b.c> collection) {
            this.w.clear();
            for (d.b.c next : collection) {
                f b2 = b(next);
                if (b2 != null) {
                    b2.u = next;
                    if (next.c() == 2 || next.c() == 3) {
                        this.w.add(b2);
                    }
                }
            }
            h.d.i.b(259, this);
        }

        public boolean a() {
            return this.i;
        }

        /* access modifiers changed from: package-private */
        public f b(d.b.c cVar) {
            return r().a(cVar.b().m());
        }

        public int c() {
            return this.h;
        }

        public List<IntentFilter> d() {
            return this.j;
        }

        public String e() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public String f() {
            return this.b;
        }

        public int g() {
            return this.m;
        }

        public d.b h() {
            d.e eVar = h.d.p;
            if (eVar instanceof d.b) {
                return (d.b) eVar;
            }
            return null;
        }

        public a i() {
            if (this.v == null && this.u != null) {
                this.v = new a();
            }
            return this.v;
        }

        public Bundle j() {
            return this.r;
        }

        public Uri k() {
            return this.f;
        }

        public String l() {
            return this.c;
        }

        public List<f> m() {
            return Collections.unmodifiableList(this.w);
        }

        public String n() {
            return this.d;
        }

        public int o() {
            return this.l;
        }

        public int p() {
            return this.k;
        }

        public int q() {
            return this.q;
        }

        public e r() {
            return this.a;
        }

        public d s() {
            return this.a.e();
        }

        public int t() {
            return this.o;
        }

        public String toString() {
            StringBuilder sb;
            if (z()) {
                sb = new StringBuilder(super.toString());
                sb.append('[');
                int size = this.w.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.w.get(i2));
                }
                sb.append(']');
            } else {
                sb = new StringBuilder();
                sb.append("MediaRouter.RouteInfo{ uniqueId=");
                sb.append(this.c);
                sb.append(", name=");
                sb.append(this.d);
                sb.append(", description=");
                sb.append(this.e);
                sb.append(", iconUri=");
                sb.append(this.f);
                sb.append(", enabled=");
                sb.append(this.g);
                sb.append(", connectionState=");
                sb.append(this.h);
                sb.append(", canDisconnect=");
                sb.append(this.i);
                sb.append(", playbackType=");
                sb.append(this.k);
                sb.append(", playbackStream=");
                sb.append(this.l);
                sb.append(", deviceType=");
                sb.append(this.m);
                sb.append(", volumeHandling=");
                sb.append(this.n);
                sb.append(", volume=");
                sb.append(this.o);
                sb.append(", volumeMax=");
                sb.append(this.p);
                sb.append(", presentationDisplayId=");
                sb.append(this.q);
                sb.append(", extras=");
                sb.append(this.r);
                sb.append(", settingsIntent=");
                sb.append(this.s);
                sb.append(", providerPackageName=");
                sb.append(this.a.d());
                sb.append(" }");
            }
            return sb.toString();
        }

        public int u() {
            return this.n;
        }

        public int v() {
            return this.p;
        }

        public boolean w() {
            h.d();
            return h.d.l() == this;
        }

        public boolean x() {
            if (w() || this.m == 3) {
                return true;
            }
            return E(this) && M("android.media.intent.category.LIVE_AUDIO") && !M("android.media.intent.category.LIVE_VIDEO");
        }

        public boolean y() {
            return this.g;
        }

        public boolean z() {
            return m().size() >= 1;
        }
    }

    h(Context context) {
        this.a = context;
    }

    static void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    private int e(a aVar) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (this.b.get(i).b == aVar) {
                return i;
            }
        }
        return -1;
    }

    public static h g(Context context) {
        if (context != null) {
            d();
            if (d == null) {
                d dVar = new d(context.getApplicationContext());
                d = dVar;
                dVar.F();
            }
            return d.o(context);
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public void a(g gVar, a aVar) {
        b(gVar, aVar, 0);
    }

    public void b(g gVar, a aVar, int i) {
        b bVar;
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (aVar != null) {
            d();
            if (c) {
                "addCallback: selector=" + gVar + ", callback=" + aVar + ", flags=" + Integer.toHexString(i);
            }
            int e2 = e(aVar);
            if (e2 < 0) {
                bVar = new b(this, aVar);
                this.b.add(bVar);
            } else {
                bVar = this.b.get(e2);
            }
            boolean z = false;
            int i2 = bVar.d;
            boolean z2 = true;
            if (((~i2) & i) != 0) {
                bVar.d = i2 | i;
                z = true;
            }
            if (!bVar.c.b(gVar)) {
                g.a aVar2 = new g.a(bVar.c);
                aVar2.c(gVar);
                bVar.c = aVar2.d();
            } else {
                z2 = z;
            }
            if (z2) {
                d.G();
            }
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    public void c(f fVar) {
        d();
        d.d(fVar);
    }

    public f f() {
        d();
        return d.l();
    }

    public MediaSessionCompat.Token h() {
        return d.m();
    }

    public List<f> i() {
        d();
        return d.p();
    }

    public f j() {
        d();
        return d.q();
    }

    public boolean k(g gVar, int i) {
        if (gVar != null) {
            d();
            return d.s(gVar, i);
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public void l(a aVar) {
        if (aVar != null) {
            d();
            if (c) {
                "removeCallback: callback=" + aVar;
            }
            int e2 = e(aVar);
            if (e2 >= 0) {
                this.b.remove(e2);
                d.G();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void m(f fVar) {
        d();
        d.v(fVar);
    }

    public void n(f fVar) {
        if (fVar != null) {
            d();
            if (c) {
                "selectRoute: " + fVar;
            }
            d.z(fVar);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }

    public void o(MediaSessionCompat mediaSessionCompat) {
        if (c) {
            "addMediaSessionCompat: " + mediaSessionCompat;
        }
        d.C(mediaSessionCompat);
    }

    public void p(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        d();
        f g = d.g();
        if (d.q() != g) {
            d.A(g, i);
            return;
        }
        d dVar = d;
        dVar.A(dVar.l(), i);
    }
}
