package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.view.Display;
import androidx.mediarouter.R$string;
import androidx.mediarouter.media.b;
import androidx.mediarouter.media.d;
import androidx.mediarouter.media.e;
import androidx.mediarouter.media.h;
import androidx.mediarouter.media.j;
import androidx.mediarouter.media.k;
import androidx.mediarouter.media.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

abstract class r extends d {

    private static class a extends d {
        public a(Context context, f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        public void O(b.C0040b bVar, b.a aVar) {
            super.O(bVar, aVar);
            aVar.f(i.a(bVar.a));
        }
    }

    static class b extends r implements j.a, j.g {
        private static final ArrayList<IntentFilter> u;
        private static final ArrayList<IntentFilter> v;
        private final f i;
        protected final Object j;
        protected final Object k;
        protected final Object l;
        protected final Object m;
        protected int n;
        protected boolean o;
        protected boolean p;
        protected final ArrayList<C0040b> q = new ArrayList<>();
        protected final ArrayList<c> r = new ArrayList<>();
        private j.e s;
        private j.c t;

        protected static final class a extends d.e {
            private final Object a;

            public a(Object obj) {
                this.a = obj;
            }

            public void g(int i) {
                j.d.i(this.a, i);
            }

            public void j(int i) {
                j.d.j(this.a, i);
            }
        }

        /* renamed from: androidx.mediarouter.media.r$b$b  reason: collision with other inner class name */
        protected static final class C0040b {
            public final Object a;
            public final String b;
            public b c;

            public C0040b(Object obj, String str) {
                this.a = obj;
                this.b = str;
            }
        }

        protected static final class c {
            public final h.f a;
            public final Object b;

            public c(h.f fVar, Object obj) {
                this.a = fVar;
                this.b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            u = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            v = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, f fVar) {
            super(context);
            this.i = fVar;
            this.j = j.g(context);
            this.k = G();
            this.l = H();
            this.m = j.d(this.j, context.getResources().getString(R$string.mr_user_route_category_name), false);
            T();
        }

        private boolean E(Object obj) {
            if (N(obj) != null || I(obj) >= 0) {
                return false;
            }
            C0040b bVar = new C0040b(obj, F(obj));
            S(bVar);
            this.q.add(bVar);
            return true;
        }

        private String F(Object obj) {
            String format = L() == obj ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", new Object[]{Integer.valueOf(M(obj).hashCode())});
            if (J(format) < 0) {
                return format;
            }
            int i2 = 2;
            while (true) {
                String format2 = String.format(Locale.US, "%s_%d", new Object[]{format, Integer.valueOf(i2)});
                if (J(format2) < 0) {
                    return format2;
                }
                i2++;
            }
        }

        private void T() {
            R();
            boolean z = false;
            for (Object E : j.h(this.j)) {
                z |= E(E);
            }
            if (z) {
                P();
            }
        }

        public void A(h.f fVar) {
            if (fVar.s() != this) {
                Object e = j.e(this.j, this.m);
                c cVar = new c(fVar, e);
                j.d.k(e, cVar);
                j.f.f(e, this.l);
                U(cVar);
                this.r.add(cVar);
                j.b(this.j, e);
                return;
            }
            int I = I(j.i(this.j, 8388611));
            if (I >= 0 && this.q.get(I).b.equals(fVar.f())) {
                fVar.J();
            }
        }

        public void B(h.f fVar) {
            int K;
            if (fVar.s() != this && (K = K(fVar)) >= 0) {
                U(this.r.get(K));
            }
        }

        public void C(h.f fVar) {
            int K;
            if (fVar.s() != this && (K = K(fVar)) >= 0) {
                c remove = this.r.remove(K);
                j.d.k(remove.b, (Object) null);
                j.f.f(remove.b, (Object) null);
                j.k(this.j, remove.b);
            }
        }

        public void D(h.f fVar) {
            Object obj;
            if (fVar.D()) {
                if (fVar.s() != this) {
                    int K = K(fVar);
                    if (K >= 0) {
                        obj = this.r.get(K).b;
                    } else {
                        return;
                    }
                } else {
                    int J = J(fVar.f());
                    if (J >= 0) {
                        obj = this.q.get(J).a;
                    } else {
                        return;
                    }
                }
                Q(obj);
            }
        }

        /* access modifiers changed from: protected */
        public Object G() {
            return j.c(this);
        }

        /* access modifiers changed from: protected */
        public Object H() {
            return j.f(this);
        }

        /* access modifiers changed from: protected */
        public int I(Object obj) {
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.q.get(i2).a == obj) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public int J(String str) {
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.q.get(i2).b.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public int K(h.f fVar) {
            int size = this.r.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.r.get(i2).a == fVar) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public Object L() {
            if (this.t == null) {
                this.t = new j.c();
            }
            return this.t.a(this.j);
        }

        /* access modifiers changed from: protected */
        public String M(Object obj) {
            CharSequence a2 = j.d.a(obj, n());
            return a2 != null ? a2.toString() : "";
        }

        /* access modifiers changed from: protected */
        public c N(Object obj) {
            Object e = j.d.e(obj);
            if (e instanceof c) {
                return (c) e;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void O(C0040b bVar, b.a aVar) {
            int d = j.d.d(bVar.a);
            if ((d & 1) != 0) {
                aVar.b(u);
            }
            if ((d & 2) != 0) {
                aVar.b(v);
            }
            aVar.k(j.d.c(bVar.a));
            aVar.j(j.d.b(bVar.a));
            aVar.m(j.d.f(bVar.a));
            aVar.o(j.d.h(bVar.a));
            aVar.n(j.d.g(bVar.a));
        }

        /* access modifiers changed from: protected */
        public void P() {
            e.a aVar = new e.a();
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                aVar.a(this.q.get(i2).c);
            }
            x(aVar.b());
        }

        /* access modifiers changed from: protected */
        public void Q(Object obj) {
            if (this.s == null) {
                this.s = new j.e();
            }
            this.s.a(this.j, 8388611, obj);
        }

        /* access modifiers changed from: protected */
        public void R() {
            if (this.p) {
                this.p = false;
                j.j(this.j, this.k);
            }
            int i2 = this.n;
            if (i2 != 0) {
                this.p = true;
                j.a(this.j, i2, this.k);
            }
        }

        /* access modifiers changed from: protected */
        public void S(C0040b bVar) {
            b.a aVar = new b.a(bVar.b, M(bVar.a));
            O(bVar, aVar);
            bVar.c = aVar.c();
        }

        /* access modifiers changed from: protected */
        public void U(c cVar) {
            j.f.a(cVar.b, cVar.a.n());
            j.f.c(cVar.b, cVar.a.p());
            j.f.b(cVar.b, cVar.a.o());
            j.f.e(cVar.b, cVar.a.t());
            j.f.h(cVar.b, cVar.a.v());
            j.f.g(cVar.b, cVar.a.u());
        }

        public void a(Object obj) {
            int I;
            if (N(obj) == null && (I = I(obj)) >= 0) {
                S(this.q.get(I));
                P();
            }
        }

        public void b(int i2, Object obj) {
        }

        public void c(Object obj, int i2) {
            c N = N(obj);
            if (N != null) {
                N.a.I(i2);
            }
        }

        public void d(Object obj) {
            int I;
            if (N(obj) == null && (I = I(obj)) >= 0) {
                this.q.remove(I);
                P();
            }
        }

        public void e(int i2, Object obj) {
            if (obj == j.i(this.j, 8388611)) {
                c N = N(obj);
                if (N != null) {
                    N.a.J();
                    return;
                }
                int I = I(obj);
                if (I >= 0) {
                    this.i.a(this.q.get(I).b);
                }
            }
        }

        public void g(Object obj, Object obj2) {
        }

        public void h(Object obj, Object obj2, int i2) {
        }

        public void i(Object obj) {
            if (E(obj)) {
                P();
            }
        }

        public void j(Object obj, int i2) {
            c N = N(obj);
            if (N != null) {
                N.a.H(i2);
            }
        }

        public void k(Object obj) {
            int I;
            if (N(obj) == null && (I = I(obj)) >= 0) {
                C0040b bVar = this.q.get(I);
                int f = j.d.f(obj);
                if (f != bVar.c.u()) {
                    b.a aVar = new b.a(bVar.c);
                    aVar.m(f);
                    bVar.c = aVar.c();
                    P();
                }
            }
        }

        public d.e t(String str) {
            int J = J(str);
            if (J >= 0) {
                return new a(this.q.get(J).a);
            }
            return null;
        }

        public void v(c cVar) {
            boolean z;
            int i2 = 0;
            if (cVar != null) {
                List<String> e = cVar.d().e();
                int size = e.size();
                int i3 = 0;
                while (i2 < size) {
                    String str = e.get(i2);
                    i3 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i3 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i3 | 2 : i3 | 8388608;
                    i2++;
                }
                z = cVar.e();
                i2 = i3;
            } else {
                z = false;
            }
            if (this.n != i2 || this.o != z) {
                this.n = i2;
                this.o = z;
                T();
            }
        }
    }

    private static class c extends b implements k.b {
        private k.a w;
        private k.d x;

        public c(Context context, f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        public Object G() {
            return k.a(this);
        }

        /* access modifiers changed from: protected */
        public void O(b.C0040b bVar, b.a aVar) {
            super.O(bVar, aVar);
            if (!k.e.b(bVar.a)) {
                aVar.g(false);
            }
            if (V(bVar)) {
                aVar.d(true);
            }
            Display a = k.e.a(bVar.a);
            if (a != null) {
                aVar.l(a.getDisplayId());
            }
        }

        /* access modifiers changed from: protected */
        public void R() {
            super.R();
            if (this.w == null) {
                this.w = new k.a(n(), q());
            }
            this.w.a(this.o ? this.n : 0);
        }

        /* access modifiers changed from: protected */
        public boolean V(b.C0040b bVar) {
            if (this.x == null) {
                this.x = new k.d();
            }
            return this.x.a(bVar.a);
        }

        public void f(Object obj) {
            int I = I(obj);
            if (I >= 0) {
                b.C0040b bVar = this.q.get(I);
                Display a = k.e.a(obj);
                int displayId = a != null ? a.getDisplayId() : -1;
                if (displayId != bVar.c.s()) {
                    b.a aVar = new b.a(bVar.c);
                    aVar.l(displayId);
                    bVar.c = aVar.c();
                    P();
                }
            }
        }
    }

    private static class d extends c {
        public d(Context context, f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        public Object L() {
            return l.b(this.j);
        }

        /* access modifiers changed from: protected */
        public void O(b.C0040b bVar, b.a aVar) {
            super.O(bVar, aVar);
            CharSequence a = l.a.a(bVar.a);
            if (a != null) {
                aVar.e(a.toString());
            }
        }

        /* access modifiers changed from: protected */
        public void Q(Object obj) {
            j.l(this.j, 8388611, obj);
        }

        /* access modifiers changed from: protected */
        public void R() {
            if (this.p) {
                j.j(this.j, this.k);
            }
            this.p = true;
            l.a(this.j, this.n, this.k, this.o | true ? 1 : 0);
        }

        /* access modifiers changed from: protected */
        public void U(b.c cVar) {
            super.U(cVar);
            l.b.a(cVar.b, cVar.a.e());
        }

        /* access modifiers changed from: protected */
        public boolean V(b.C0040b bVar) {
            return l.a.b(bVar.a);
        }
    }

    static class e extends r {
        private static final ArrayList<IntentFilter> l;
        final AudioManager i;
        private final b j;
        int k = -1;

        final class a extends d.e {
            a() {
            }

            public void g(int i) {
                e.this.i.setStreamVolume(3, i, 0);
                e.this.E();
            }

            public void j(int i) {
                int streamVolume = e.this.i.getStreamVolume(3);
                if (Math.min(e.this.i.getStreamMaxVolume(3), Math.max(0, i + streamVolume)) != streamVolume) {
                    e.this.i.setStreamVolume(3, streamVolume, 0);
                }
                e.this.E();
            }
        }

        final class b extends BroadcastReceiver {
            b() {
            }

            public void onReceive(Context context, Intent intent) {
                int intExtra;
                if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1)) >= 0) {
                    e eVar = e.this;
                    if (intExtra != eVar.k) {
                        eVar.E();
                    }
                }
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            intentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            l = arrayList;
            arrayList.add(intentFilter);
        }

        public e(Context context) {
            super(context);
            this.i = (AudioManager) context.getSystemService("audio");
            b bVar = new b();
            this.j = bVar;
            context.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            E();
        }

        /* access modifiers changed from: package-private */
        public void E() {
            Resources resources = n().getResources();
            int streamMaxVolume = this.i.getStreamMaxVolume(3);
            this.k = this.i.getStreamVolume(3);
            b.a aVar = new b.a("DEFAULT_ROUTE", resources.getString(R$string.mr_system_route_name));
            aVar.b(l);
            aVar.j(3);
            aVar.k(0);
            aVar.n(1);
            aVar.o(streamMaxVolume);
            aVar.m(this.k);
            b c = aVar.c();
            e.a aVar2 = new e.a();
            aVar2.a(c);
            x(aVar2.b());
        }

        public d.e t(String str) {
            if (str.equals("DEFAULT_ROUTE")) {
                return new a();
            }
            return null;
        }
    }

    public interface f {
        void a(String str);
    }

    protected r(Context context) {
        super(context, new d.C0035d(new ComponentName("android", r.class.getName())));
    }

    public static r z(Context context, f fVar) {
        int i = Build.VERSION.SDK_INT;
        return i >= 24 ? new a(context, fVar) : i >= 18 ? new d(context, fVar) : i >= 17 ? new c(context, fVar) : i >= 16 ? new b(context, fVar) : new e(context);
    }

    public void A(h.f fVar) {
    }

    public void B(h.f fVar) {
    }

    public void C(h.f fVar) {
    }

    public void D(h.f fVar) {
    }
}
