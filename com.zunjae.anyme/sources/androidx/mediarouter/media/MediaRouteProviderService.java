package androidx.mediarouter.media;

import android.app.Service;
import android.content.Intent;
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
import androidx.mediarouter.media.e;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class MediaRouteProviderService extends Service {
    static final boolean l = Log.isLoggable("MediaRouteProviderSrv", 3);
    private final ArrayList<b> e = new ArrayList<>();
    private final e f = new e(this);
    private final Messenger g = new Messenger(this.f);
    final c h = new c();
    private final d i = new d();
    d j;
    private c k;

    class a extends h.c {
        final /* synthetic */ b a;
        final /* synthetic */ int b;
        final /* synthetic */ Intent c;
        final /* synthetic */ Messenger d;
        final /* synthetic */ int e;

        a(b bVar, int i, Intent intent, Messenger messenger, int i2) {
            this.a = bVar;
            this.b = i;
            this.c = intent;
            this.d = messenger;
            this.e = i2;
        }

        public void a(String str, Bundle bundle) {
            if (MediaRouteProviderService.l) {
                this.a + ": Route control request failed, controllerId=" + this.b + ", intent=" + this.c + ", error=" + str + ", data=" + bundle;
            }
            if (MediaRouteProviderService.this.b(this.d) < 0) {
                return;
            }
            if (str != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("error", str);
                MediaRouteProviderService.x(this.d, 4, this.e, 0, bundle, bundle2);
                return;
            }
            MediaRouteProviderService.x(this.d, 4, this.e, 0, bundle, (Bundle) null);
        }

        public void b(Bundle bundle) {
            if (MediaRouteProviderService.l) {
                this.a + ": Route control request succeeded, controllerId=" + this.b + ", intent=" + this.c + ", data=" + bundle;
            }
            if (MediaRouteProviderService.this.b(this.d) >= 0) {
                MediaRouteProviderService.x(this.d, 3, this.e, 0, bundle, (Bundle) null);
            }
        }
    }

    private final class b implements IBinder.DeathRecipient {
        public final Messenger a;
        public final int b;
        public c c;
        private final SparseArray<d.e> d = new SparseArray<>();
        final d.b.C0034d e = new a();

        class a implements d.b.C0034d {
            a() {
            }

            public void a(d.b bVar, Collection<d.b.c> collection) {
                b.this.h(bVar, collection);
            }
        }

        public b(Messenger messenger, int i) {
            this.a = messenger;
            this.b = i;
        }

        public Bundle a(String str, int i) {
            if (this.d.indexOfKey(i) >= 0) {
                return null;
            }
            d.b s = MediaRouteProviderService.this.j.s(str);
            s.q(androidx.core.content.a.i(MediaRouteProviderService.this.getApplicationContext()), this.e);
            if (s == null) {
                return null;
            }
            this.d.put(i, s);
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("groupableTitle", s.k());
            bundle.putString("transferableTitle", s.l());
            return bundle;
        }

        public boolean b(String str, String str2, int i) {
            if (this.d.indexOfKey(i) >= 0) {
                return false;
            }
            d.e t = str2 == null ? MediaRouteProviderService.this.j.t(str) : MediaRouteProviderService.this.j.u(str, str2);
            if (t == null) {
                return false;
            }
            this.d.put(i, t);
            return true;
        }

        public void binderDied() {
            MediaRouteProviderService.this.h.obtainMessage(1, this.a).sendToTarget();
        }

        public void c() {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                this.d.valueAt(i).e();
            }
            this.d.clear();
            this.a.getBinder().unlinkToDeath(this, 0);
            i((c) null);
        }

        public d.e d(int i) {
            return this.d.get(i);
        }

        public boolean e(Messenger messenger) {
            return this.a.getBinder() == messenger.getBinder();
        }

        public boolean f() {
            try {
                this.a.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public boolean g(int i) {
            d.e eVar = this.d.get(i);
            if (eVar == null) {
                return false;
            }
            this.d.remove(i);
            eVar.e();
            return true;
        }

        /* access modifiers changed from: package-private */
        public void h(d.b bVar, Collection<d.b.c> collection) {
            int indexOfValue = this.d.indexOfValue(bVar);
            if (indexOfValue < 0) {
                "Ignoring unknown dynamic group route controller: " + bVar;
                return;
            }
            int keyAt = this.d.keyAt(indexOfValue);
            ArrayList arrayList = new ArrayList();
            for (d.b.c g : collection) {
                arrayList.add(g.g());
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("dynamicRoutes", arrayList);
            MediaRouteProviderService.x(this.a, 7, 0, keyAt, bundle, (Bundle) null);
        }

        public boolean i(c cVar) {
            if (p3.a(this.c, cVar)) {
                return false;
            }
            this.c = cVar;
            return MediaRouteProviderService.this.y();
        }

        public String toString() {
            return MediaRouteProviderService.d(this.a);
        }
    }

    private final class c extends Handler {
        c() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                MediaRouteProviderService.this.f((Messenger) message.obj);
            }
        }
    }

    private final class d extends d.a {
        d() {
        }

        public void a(d dVar, e eVar) {
            MediaRouteProviderService.this.u(eVar);
        }
    }

    private static final class e extends Handler {
        private final WeakReference<MediaRouteProviderService> a;

        public e(MediaRouteProviderService mediaRouteProviderService) {
            this.a = new WeakReference<>(mediaRouteProviderService);
        }

        private boolean a(int i, Messenger messenger, int i2, int i3, Object obj, Bundle bundle) {
            MediaRouteProviderService mediaRouteProviderService = (MediaRouteProviderService) this.a.get();
            int i4 = 0;
            if (mediaRouteProviderService != null) {
                switch (i) {
                    case 1:
                        return mediaRouteProviderService.j(messenger, i2, i3);
                    case 2:
                        return mediaRouteProviderService.q(messenger, i2);
                    case 3:
                        String string = bundle.getString("routeId");
                        String string2 = bundle.getString("routeGroupId");
                        if (string != null) {
                            return mediaRouteProviderService.i(messenger, i2, i3, string, string2);
                        }
                        break;
                    case 4:
                        return mediaRouteProviderService.k(messenger, i2, i3);
                    case 5:
                        return mediaRouteProviderService.n(messenger, i2, i3);
                    case 6:
                        if (bundle != null) {
                            i4 = bundle.getInt("unselectReason", 0);
                        }
                        return mediaRouteProviderService.r(messenger, i2, i3, i4);
                    case 7:
                        int i5 = bundle.getInt("volume", -1);
                        if (i5 >= 0) {
                            return mediaRouteProviderService.p(messenger, i2, i3, i5);
                        }
                        break;
                    case 8:
                        int i6 = bundle.getInt("volume", 0);
                        if (i6 != 0) {
                            return mediaRouteProviderService.t(messenger, i2, i3, i6);
                        }
                        break;
                    case 9:
                        if (obj instanceof Intent) {
                            return mediaRouteProviderService.m(messenger, i2, i3, (Intent) obj);
                        }
                        break;
                    case 10:
                        if (obj == null || (obj instanceof Bundle)) {
                            c c = c.c((Bundle) obj);
                            if (c == null || !c.f()) {
                                c = null;
                            }
                            return mediaRouteProviderService.o(messenger, i2, c);
                        }
                    case 11:
                        String string3 = bundle.getString("memberRouteId");
                        if (string3 != null) {
                            return mediaRouteProviderService.g(messenger, i2, i3, string3);
                        }
                        break;
                    case 12:
                        String string4 = bundle.getString("memberRouteId");
                        if (string4 != null) {
                            return mediaRouteProviderService.e(messenger, i2, i3, string4);
                        }
                        break;
                    case 13:
                        String string5 = bundle.getString("memberRouteId");
                        if (string5 != null) {
                            return mediaRouteProviderService.l(messenger, i2, i3, string5);
                        }
                        break;
                    case 14:
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("memberRouteIds");
                        if (stringArrayList != null) {
                            return mediaRouteProviderService.s(messenger, i2, i3, stringArrayList);
                        }
                        break;
                }
            }
            return false;
        }

        public void handleMessage(Message message) {
            Messenger messenger = message.replyTo;
            if (f.a(messenger)) {
                int i = message.what;
                int i2 = message.arg1;
                int i3 = message.arg2;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                if (!a(i, messenger, i2, i3, obj, peekData)) {
                    if (MediaRouteProviderService.l) {
                        MediaRouteProviderService.d(messenger) + ": Message failed, what=" + i + ", requestId=" + i2 + ", arg=" + i3 + ", obj=" + obj + ", data=" + peekData;
                    }
                    MediaRouteProviderService.v(messenger, i2);
                    return;
                }
                return;
            }
            boolean z = MediaRouteProviderService.l;
        }
    }

    static Bundle a(e eVar, int i2) {
        if (eVar == null) {
            return null;
        }
        e.a aVar = new e.a(eVar);
        aVar.c((Collection<b>) null);
        for (b next : eVar.c()) {
            if (i2 >= next.o() && i2 <= next.n()) {
                aVar.a(next);
            }
        }
        return aVar.b().a();
    }

    private b c(Messenger messenger) {
        int b2 = b(messenger);
        if (b2 >= 0) {
            return this.e.get(b2);
        }
        return null;
    }

    static String d(Messenger messenger) {
        return "Client connection " + messenger.getBinder().toString();
    }

    static void v(Messenger messenger, int i2) {
        if (i2 != 0) {
            x(messenger, 0, i2, 0, (Object) null, (Bundle) null);
        }
    }

    private static void w(Messenger messenger, int i2) {
        if (i2 != 0) {
            x(messenger, 1, i2, 0, (Object) null, (Bundle) null);
        }
    }

    static void x(Messenger messenger, int i2, int i3, int i4, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i2;
        obtain.arg1 = i3;
        obtain.arg2 = i4;
        obtain.obj = obj;
        obtain.setData(bundle);
        try {
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException unused2) {
            "Could not send message to " + d(messenger);
        }
    }

    /* access modifiers changed from: package-private */
    public int b(Messenger messenger) {
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.e.get(i2).e(messenger)) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean e(Messenger messenger, int i2, int i3, String str) {
        b c2 = c(messenger);
        if (c2 == null) {
            return false;
        }
        d.e d2 = c2.d(i3);
        if (!(d2 instanceof d.b)) {
            return false;
        }
        ((d.b) d2).n(str);
        if (l) {
            c2 + ": Added a member route, controllerId=" + i3 + ", memberId=" + str;
        }
        w(messenger, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void f(Messenger messenger) {
        int b2 = b(messenger);
        if (b2 >= 0) {
            b remove = this.e.remove(b2);
            if (l) {
                remove + ": Binder died";
            }
            remove.c();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean g(Messenger messenger, int i2, int i3, String str) {
        Bundle a2;
        b c2 = c(messenger);
        if (c2 == null || (a2 = c2.a(str, i3)) == null) {
            return false;
        }
        if (l) {
            c2 + ": Route controller created, controllerId=" + i3 + ", initialMemberRouteId=" + str;
        }
        x(messenger, 6, i2, 2, a2, (Bundle) null);
        return true;
    }

    public abstract d h();

    /* access modifiers changed from: package-private */
    public boolean i(Messenger messenger, int i2, int i3, String str, String str2) {
        b c2 = c(messenger);
        if (c2 == null || !c2.b(str, str2, i3)) {
            return false;
        }
        if (l) {
            c2 + ": Route controller created, controllerId=" + i3 + ", routeId=" + str + ", routeGroupId=" + str2;
        }
        w(messenger, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean j(Messenger messenger, int i2, int i3) {
        if (i3 < 1 || b(messenger) >= 0) {
            return false;
        }
        b bVar = new b(messenger, i3);
        if (!bVar.f()) {
            return false;
        }
        this.e.add(bVar);
        if (l) {
            bVar + ": Registered, version=" + i3;
        }
        if (i2 != 0) {
            x(messenger, 2, i2, 2, a(this.j.o(), bVar.b), (Bundle) null);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean k(Messenger messenger, int i2, int i3) {
        b c2 = c(messenger);
        if (c2 == null || !c2.g(i3)) {
            return false;
        }
        if (l) {
            c2 + ": Route controller released, controllerId=" + i3;
        }
        w(messenger, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean l(Messenger messenger, int i2, int i3, String str) {
        b c2 = c(messenger);
        if (c2 == null) {
            return false;
        }
        d.e d2 = c2.d(i3);
        if (!(d2 instanceof d.b)) {
            return false;
        }
        ((d.b) d2).o(str);
        if (l) {
            c2 + ": Removed a member route, controllerId=" + i3 + ", memberId=" + str;
        }
        w(messenger, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m(Messenger messenger, int i2, int i3, Intent intent) {
        d.e d2;
        b c2 = c(messenger);
        if (c2 == null || (d2 = c2.d(i3)) == null) {
            return false;
        }
        a aVar = null;
        if (i2 != 0) {
            aVar = new a(c2, i3, intent, messenger, i2);
        }
        if (!d2.d(intent, aVar)) {
            return false;
        }
        if (!l) {
            return true;
        }
        c2 + ": Route control request delivered, controllerId=" + i3 + ", intent=" + intent;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean n(Messenger messenger, int i2, int i3) {
        d.e d2;
        b c2 = c(messenger);
        if (c2 == null || (d2 = c2.d(i3)) == null) {
            return false;
        }
        d2.f();
        if (l) {
            c2 + ": Route selected, controllerId=" + i3;
        }
        w(messenger, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean o(Messenger messenger, int i2, c cVar) {
        b c2 = c(messenger);
        if (c2 == null) {
            return false;
        }
        boolean i3 = c2.i(cVar);
        if (l) {
            c2 + ": Set discovery request, request=" + cVar + ", actuallyChanged=" + i3 + ", compositeDiscoveryRequest=" + this.k;
        }
        w(messenger, i2);
        return true;
    }

    public IBinder onBind(Intent intent) {
        d h2;
        if (!intent.getAction().equals("android.media.MediaRouteProviderService")) {
            return null;
        }
        if (this.j == null && (h2 = h()) != null) {
            String b2 = h2.r().b();
            if (b2.equals(getPackageName())) {
                this.j = h2;
                h2.w(this.i);
            } else {
                throw new IllegalStateException("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: " + b2 + ".  Service package name: " + getPackageName() + ".");
            }
        }
        if (this.j != null) {
            return this.g.getBinder();
        }
        return null;
    }

    public boolean onUnbind(Intent intent) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.w((d.a) null);
        }
        return super.onUnbind(intent);
    }

    /* access modifiers changed from: package-private */
    public boolean p(Messenger messenger, int i2, int i3, int i4) {
        d.e d2;
        b c2 = c(messenger);
        if (c2 == null || (d2 = c2.d(i3)) == null) {
            return false;
        }
        d2.g(i4);
        if (l) {
            c2 + ": Route volume changed, controllerId=" + i3 + ", volume=" + i4;
        }
        w(messenger, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean q(Messenger messenger, int i2) {
        int b2 = b(messenger);
        if (b2 < 0) {
            return false;
        }
        b remove = this.e.remove(b2);
        if (l) {
            remove + ": Unregistered";
        }
        remove.c();
        w(messenger, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean r(Messenger messenger, int i2, int i3, int i4) {
        d.e d2;
        b c2 = c(messenger);
        if (c2 == null || (d2 = c2.d(i3)) == null) {
            return false;
        }
        d2.i(i4);
        if (l) {
            c2 + ": Route unselected, controllerId=" + i3;
        }
        w(messenger, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean s(Messenger messenger, int i2, int i3, List<String> list) {
        b c2 = c(messenger);
        if (c2 == null) {
            return false;
        }
        d.e d2 = c2.d(i3);
        if (!(d2 instanceof d.b)) {
            return false;
        }
        ((d.b) d2).p(list);
        if (l) {
            c2 + ": Updated list of member routes, controllerId=" + i3 + ", memberIds=" + list;
        }
        w(messenger, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean t(Messenger messenger, int i2, int i3, int i4) {
        d.e d2;
        b c2 = c(messenger);
        if (c2 == null || (d2 = c2.d(i3)) == null) {
            return false;
        }
        d2.j(i4);
        if (l) {
            c2 + ": Route volume updated, controllerId=" + i3 + ", delta=" + i4;
        }
        w(messenger, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void u(e eVar) {
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.e.get(i2);
            x(bVar.a, 5, 0, 0, a(eVar, bVar.b), (Bundle) null);
            if (l) {
                bVar + ": Sent descriptor change event, descriptor=" + eVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        int size = this.e.size();
        g.a aVar = null;
        c cVar = null;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            c cVar2 = this.e.get(i2).c;
            if (cVar2 != null && (!cVar2.d().f() || cVar2.e())) {
                z |= cVar2.e();
                if (cVar == null) {
                    cVar = cVar2;
                } else {
                    if (aVar == null) {
                        aVar = new g.a(cVar.d());
                    }
                    aVar.c(cVar2.d());
                }
            }
        }
        if (aVar != null) {
            cVar = new c(aVar.d(), z);
        }
        if (p3.a(this.k, cVar)) {
            return false;
        }
        this.k = cVar;
        this.j.y(cVar);
        return true;
    }
}
