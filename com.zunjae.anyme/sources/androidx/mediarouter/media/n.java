package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.mediarouter.media.d;
import androidx.mediarouter.media.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class n extends d implements ServiceConnection {
    static final boolean p = Log.isLoggable("MediaRouteProviderProxy", 3);
    private final ComponentName i;
    final c j;
    private final ArrayList<b> k = new ArrayList<>();
    private boolean l;
    private boolean m;
    private a n;
    private boolean o;

    private final class a implements IBinder.DeathRecipient {
        private final Messenger a;
        private final d b;
        private final Messenger c;
        private int d = 1;
        private int e = 1;
        private int f;
        private int g;
        private final SparseArray<h.c> h = new SparseArray<>();

        /* renamed from: androidx.mediarouter.media.n$a$a  reason: collision with other inner class name */
        class C0038a implements Runnable {
            C0038a() {
            }

            public void run() {
                a.this.e();
            }
        }

        class b implements Runnable {
            b() {
            }

            public void run() {
                a aVar = a.this;
                n.this.I(aVar);
            }
        }

        public a(Messenger messenger) {
            this.a = messenger;
            this.b = new d(this);
            this.c = new Messenger(this.b);
        }

        private boolean s(int i2, int i3, int i4, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i2;
            obtain.arg1 = i3;
            obtain.arg2 = i4;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.c;
            try {
                this.a.send(obtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException unused2) {
                return false;
            }
        }

        public void a(int i2, String str) {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i3 = this.d;
            this.d = i3 + 1;
            s(12, i3, i2, (Object) null, bundle);
        }

        public int b(String str, h.c cVar) {
            int i2 = this.e;
            this.e = i2 + 1;
            int i3 = this.d;
            this.d = i3 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            s(11, i3, i2, (Object) null, bundle);
            this.h.put(i3, cVar);
            return i2;
        }

        public void binderDied() {
            n.this.j.post(new b());
        }

        public int c(String str, String str2) {
            int i2 = this.e;
            this.e = i2 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i3 = this.d;
            this.d = i3 + 1;
            s(3, i3, i2, (Object) null, bundle);
            return i2;
        }

        public void d() {
            s(2, 0, 0, (Object) null, (Bundle) null);
            this.b.a();
            this.a.getBinder().unlinkToDeath(this, 0);
            n.this.j.post(new C0038a());
        }

        /* access modifiers changed from: package-private */
        public void e() {
            int size = this.h.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.h.valueAt(i2).a((String) null, (Bundle) null);
            }
            this.h.clear();
        }

        public boolean f(int i2, String str, Bundle bundle) {
            h.c cVar = this.h.get(i2);
            if (cVar == null) {
                return false;
            }
            this.h.remove(i2);
            cVar.a(str, bundle);
            return true;
        }

        public boolean g(int i2, Bundle bundle) {
            h.c cVar = this.h.get(i2);
            if (cVar == null) {
                return false;
            }
            this.h.remove(i2);
            cVar.b(bundle);
            return true;
        }

        public boolean h(Bundle bundle) {
            if (this.f == 0) {
                return false;
            }
            n.this.H(this, e.b(bundle));
            return true;
        }

        public void i(int i2, Bundle bundle) {
            h.c cVar = this.h.get(i2);
            if (bundle == null || !bundle.containsKey("routeId")) {
                cVar.a("DynamicGroupRouteController is created without valid route id.", bundle);
                return;
            }
            this.h.remove(i2);
            cVar.b(bundle);
        }

        public boolean j(int i2, Bundle bundle) {
            if (this.f == 0) {
                return false;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("dynamicRoutes");
            ArrayList arrayList = new ArrayList();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(d.b.c.a((Bundle) it.next()));
            }
            n.this.M(this, i2, arrayList);
            return true;
        }

        public boolean k(int i2) {
            if (i2 == this.g) {
                this.g = 0;
                n.this.J(this, "Registration failed");
            }
            h.c cVar = this.h.get(i2);
            if (cVar == null) {
                return true;
            }
            this.h.remove(i2);
            cVar.a((String) null, (Bundle) null);
            return true;
        }

        public boolean l(int i2) {
            return true;
        }

        public boolean m(int i2, int i3, Bundle bundle) {
            if (this.f != 0 || i2 != this.g || i3 < 1) {
                return false;
            }
            this.g = 0;
            this.f = i3;
            n.this.H(this, e.b(bundle));
            n.this.K(this);
            return true;
        }

        public boolean n() {
            int i2 = this.d;
            this.d = i2 + 1;
            this.g = i2;
            if (!s(1, i2, 3, (Object) null, (Bundle) null)) {
                return false;
            }
            try {
                this.a.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public void o(int i2) {
            int i3 = this.d;
            this.d = i3 + 1;
            s(4, i3, i2, (Object) null, (Bundle) null);
        }

        public void p(int i2, String str) {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i3 = this.d;
            this.d = i3 + 1;
            s(13, i3, i2, (Object) null, bundle);
        }

        public void q(int i2) {
            int i3 = this.d;
            this.d = i3 + 1;
            s(5, i3, i2, (Object) null, (Bundle) null);
        }

        public boolean r(int i2, Intent intent, h.c cVar) {
            int i3 = this.d;
            this.d = i3 + 1;
            if (!s(9, i3, i2, intent, (Bundle) null)) {
                return false;
            }
            if (cVar == null) {
                return true;
            }
            this.h.put(i3, cVar);
            return true;
        }

        public void t(c cVar) {
            int i2 = this.d;
            this.d = i2 + 1;
            s(10, i2, 0, cVar != null ? cVar.a() : null, (Bundle) null);
        }

        public void u(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i3);
            int i4 = this.d;
            this.d = i4 + 1;
            s(7, i4, i2, (Object) null, bundle);
        }

        public void v(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i3);
            int i4 = this.d;
            this.d = i4 + 1;
            s(6, i4, i2, (Object) null, bundle);
        }

        public void w(int i2, List<String> list) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList(list));
            int i3 = this.d;
            this.d = i3 + 1;
            s(14, i3, i2, (Object) null, bundle);
        }

        public void x(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i3);
            int i4 = this.d;
            this.d = i4 + 1;
            s(8, i4, i2, (Object) null, bundle);
        }
    }

    interface b {
        int a();

        void b();

        void c(a aVar);
    }

    private static final class c extends Handler {
        c() {
        }
    }

    private static final class d extends Handler {
        private final WeakReference<a> a;

        public d(a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        private boolean b(a aVar, int i, int i2, int i3, Object obj, Bundle bundle) {
            switch (i) {
                case 0:
                    aVar.k(i2);
                    return true;
                case 1:
                    aVar.l(i2);
                    return true;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m(i2, i3, (Bundle) obj);
                    }
                    return false;
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.g(i2, (Bundle) obj);
                    }
                    return false;
                case 4:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return false;
                    }
                    return aVar.f(i2, bundle == null ? null : bundle.getString("error"), (Bundle) obj);
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.h((Bundle) obj);
                    }
                    return false;
                case 6:
                    if (!(obj instanceof Bundle)) {
                        return false;
                    }
                    aVar.i(i2, (Bundle) obj);
                    return false;
                case 7:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.j(i3, (Bundle) obj);
                    }
                    return false;
                default:
                    return false;
            }
        }

        public void a() {
            this.a.clear();
        }

        public void handleMessage(Message message) {
            a aVar = (a) this.a.get();
            if (aVar != null) {
                if (!b(aVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) && n.p) {
                    "Unhandled message from server: " + message;
                }
            }
        }
    }

    private final class e extends d.b implements b {
        private final String e;
        String f;
        String g;
        private boolean h;
        private int i = -1;
        private int j;
        private a k;
        private int l = -1;

        class a extends h.c {
            a() {
            }

            public void a(String str, Bundle bundle) {
                "Error: " + str + ", data: " + bundle;
            }

            public void b(Bundle bundle) {
                e.this.f = bundle.getString("groupableTitle");
                e.this.g = bundle.getString("transferableTitle");
            }
        }

        e(String str) {
            this.e = str;
        }

        public int a() {
            return this.l;
        }

        public void b() {
            a aVar = this.k;
            if (aVar != null) {
                aVar.o(this.l);
                this.k = null;
                this.l = 0;
            }
        }

        public void c(a aVar) {
            a aVar2 = new a();
            this.k = aVar;
            int b = aVar.b(this.e, aVar2);
            this.l = b;
            if (this.h) {
                aVar.q(b);
                int i2 = this.i;
                if (i2 >= 0) {
                    aVar.u(this.l, i2);
                    this.i = -1;
                }
                int i3 = this.j;
                if (i3 != 0) {
                    aVar.x(this.l, i3);
                    this.j = 0;
                }
            }
        }

        public boolean d(Intent intent, h.c cVar) {
            a aVar = this.k;
            if (aVar != null) {
                return aVar.r(this.l, intent, cVar);
            }
            return false;
        }

        public void e() {
            n.this.L(this);
        }

        public void f() {
            this.h = true;
            a aVar = this.k;
            if (aVar != null) {
                aVar.q(this.l);
            }
        }

        public void g(int i2) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.u(this.l, i2);
                return;
            }
            this.i = i2;
            this.j = 0;
        }

        public void h() {
            i(0);
        }

        public void i(int i2) {
            this.h = false;
            a aVar = this.k;
            if (aVar != null) {
                aVar.v(this.l, i2);
            }
        }

        public void j(int i2) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.x(this.l, i2);
            } else {
                this.j += i2;
            }
        }

        public String k() {
            return this.f;
        }

        public String l() {
            return this.g;
        }

        public void n(String str) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.a(this.l, str);
            }
        }

        public void o(String str) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.p(this.l, str);
            }
        }

        public void p(List<String> list) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.w(this.l, list);
            }
        }

        /* access modifiers changed from: package-private */
        public void r(List<d.b.c> list) {
            m(list);
        }
    }

    private final class f extends d.e implements b {
        private final String a;
        private final String b;
        private boolean c;
        private int d = -1;
        private int e;
        private a f;
        private int g;

        f(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public int a() {
            return this.g;
        }

        public void b() {
            a aVar = this.f;
            if (aVar != null) {
                aVar.o(this.g);
                this.f = null;
                this.g = 0;
            }
        }

        public void c(a aVar) {
            this.f = aVar;
            int c2 = aVar.c(this.a, this.b);
            this.g = c2;
            if (this.c) {
                aVar.q(c2);
                int i = this.d;
                if (i >= 0) {
                    aVar.u(this.g, i);
                    this.d = -1;
                }
                int i2 = this.e;
                if (i2 != 0) {
                    aVar.x(this.g, i2);
                    this.e = 0;
                }
            }
        }

        public boolean d(Intent intent, h.c cVar) {
            a aVar = this.f;
            if (aVar != null) {
                return aVar.r(this.g, intent, cVar);
            }
            return false;
        }

        public void e() {
            n.this.L(this);
        }

        public void f() {
            this.c = true;
            a aVar = this.f;
            if (aVar != null) {
                aVar.q(this.g);
            }
        }

        public void g(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.u(this.g, i);
                return;
            }
            this.d = i;
            this.e = 0;
        }

        public void h() {
            i(0);
        }

        public void i(int i) {
            this.c = false;
            a aVar = this.f;
            if (aVar != null) {
                aVar.v(this.g, i);
            }
        }

        public void j(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.x(this.g, i);
            } else {
                this.e += i;
            }
        }
    }

    public n(Context context, ComponentName componentName) {
        super(context, new d.C0035d(componentName));
        this.i = componentName;
        this.j = new c();
    }

    private void A() {
        if (!this.m) {
            if (p) {
                this + ": Binding";
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.i);
            try {
                boolean bindService = n().bindService(intent, this, 1);
                this.m = bindService;
                if (!bindService && p) {
                    this + ": Bind failed";
                }
            } catch (SecurityException unused) {
                if (p) {
                    this + ": Bind failed";
                }
            }
        }
    }

    private d.b B(String str) {
        e o2 = o();
        if (o2 == null) {
            return null;
        }
        List<b> c2 = o2.c();
        int size = c2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (c2.get(i2).m().equals(str)) {
                e eVar = new e(str);
                this.k.add(eVar);
                if (this.o) {
                    eVar.c(this.n);
                }
                S();
                return eVar;
            }
        }
        return null;
    }

    private d.e C(String str, String str2) {
        e o2 = o();
        if (o2 == null) {
            return null;
        }
        List<b> c2 = o2.c();
        int size = c2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (c2.get(i2).m().equals(str)) {
                f fVar = new f(str, str2);
                this.k.add(fVar);
                if (this.o) {
                    fVar.c(this.n);
                }
                S();
                return fVar;
            }
        }
        return null;
    }

    private void D() {
        int size = this.k.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.k.get(i2).b();
        }
    }

    private void E() {
        if (this.n != null) {
            x((e) null);
            this.o = false;
            D();
            this.n.d();
            this.n = null;
        }
    }

    private b F(int i2) {
        Iterator<b> it = this.k.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.a() == i2) {
                return next;
            }
        }
        return null;
    }

    private boolean O() {
        if (this.l) {
            return p() != null || !this.k.isEmpty();
        }
        return false;
    }

    private void R() {
        if (this.m) {
            if (p) {
                this + ": Unbinding";
            }
            this.m = false;
            E();
            try {
                n().unbindService(this);
            } catch (IllegalArgumentException unused) {
                this + ": unbindService failed";
            }
        }
    }

    private void S() {
        if (O()) {
            A();
        } else {
            R();
        }
    }

    private void z() {
        int size = this.k.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.k.get(i2).c(this.n);
        }
    }

    public boolean G(String str, String str2) {
        return this.i.getPackageName().equals(str) && this.i.getClassName().equals(str2);
    }

    /* access modifiers changed from: package-private */
    public void H(a aVar, e eVar) {
        if (this.n == aVar) {
            if (p) {
                this + ": Descriptor changed, descriptor=" + eVar;
            }
            x(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(a aVar) {
        if (this.n == aVar) {
            if (p) {
                this + ": Service connection died";
            }
            E();
        }
    }

    /* access modifiers changed from: package-private */
    public void J(a aVar, String str) {
        if (this.n == aVar) {
            if (p) {
                this + ": Service connection error - " + str;
            }
            R();
        }
    }

    /* access modifiers changed from: package-private */
    public void K(a aVar) {
        if (this.n == aVar) {
            this.o = true;
            z();
            c p2 = p();
            if (p2 != null) {
                this.n.t(p2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void L(b bVar) {
        this.k.remove(bVar);
        bVar.b();
        S();
    }

    /* access modifiers changed from: package-private */
    public void M(a aVar, int i2, List<d.b.c> list) {
        if (this.n == aVar) {
            if (p) {
                this + ": DynamicRouteDescriptors changed, descriptors=" + list;
            }
            b F = F(i2);
            if (F instanceof e) {
                ((e) F).r(list);
            }
        }
    }

    public void N() {
        if (this.n == null && O()) {
            R();
            A();
        }
    }

    public void P() {
        if (!this.l) {
            if (p) {
                this + ": Starting";
            }
            this.l = true;
            S();
        }
    }

    public void Q() {
        if (this.l) {
            if (p) {
                this + ": Stopping";
            }
            this.l = false;
            S();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        StringBuilder sb;
        if (p) {
            this + ": Connected";
        }
        if (this.m) {
            E();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (f.a(messenger)) {
                a aVar = new a(messenger);
                if (aVar.n()) {
                    this.n = aVar;
                    return;
                } else if (p) {
                    sb = new StringBuilder();
                    sb.append(this);
                    str = ": Registration failed";
                } else {
                    return;
                }
            } else {
                sb = new StringBuilder();
                sb.append(this);
                str = ": Service returned invalid messenger binder";
            }
            sb.append(str);
            sb.toString();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (p) {
            this + ": Service disconnected";
        }
        E();
    }

    public d.b s(String str) {
        if (str != null) {
            return B(str);
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public d.e t(String str) {
        if (str != null) {
            return C(str, (String) null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public String toString() {
        return "Service connection " + this.i.flattenToShortString();
    }

    public d.e u(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return C(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public void v(c cVar) {
        if (this.o) {
            this.n.t(cVar);
        }
        S();
    }
}
