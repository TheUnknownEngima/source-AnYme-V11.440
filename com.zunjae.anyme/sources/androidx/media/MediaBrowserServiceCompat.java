package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
    static final boolean l = Log.isLoggable("MBServiceCompat", 3);
    private g e;
    final f f = new f("android.media.session.MediaController", -1, -1, (Bundle) null, (p) null);
    final ArrayList<f> g = new ArrayList<>();
    final b0<IBinder, f> h = new b0<>();
    f i;
    final r j = new r();
    MediaSessionCompat.Token k;

    class a extends m<List<MediaBrowserCompat.MediaItem>> {
        final /* synthetic */ f f;
        final /* synthetic */ String g;
        final /* synthetic */ Bundle h;
        final /* synthetic */ Bundle i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f = fVar;
            this.g = str;
            this.h = bundle;
            this.i = bundle2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void d(List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.h.get(this.f.d.asBinder()) == this.f) {
                if ((a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.b(list, this.h);
                }
                try {
                    this.f.d.a(this.g, list, this.h, this.i);
                } catch (RemoteException unused) {
                    "Calling onLoadChildren() failed for id=" + this.g + " package=" + this.f.a;
                }
            } else if (MediaBrowserServiceCompat.l) {
                "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f.a + " id=" + this.g;
            }
        }
    }

    class b extends m<MediaBrowserCompat.MediaItem> {
        final /* synthetic */ defpackage.e f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, defpackage.e eVar) {
            super(obj);
            this.f = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void d(MediaBrowserCompat.MediaItem mediaItem) {
            if ((a() & 2) != 0) {
                this.f.b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f.b(0, bundle);
        }
    }

    class c extends m<List<MediaBrowserCompat.MediaItem>> {
        final /* synthetic */ defpackage.e f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, defpackage.e eVar) {
            super(obj);
            this.f = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void d(List<MediaBrowserCompat.MediaItem> list) {
            if ((a() & 4) != 0 || list == null) {
                this.f.b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f.b(0, bundle);
        }
    }

    class d extends m<Bundle> {
        final /* synthetic */ defpackage.e f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, defpackage.e eVar) {
            super(obj);
            this.f = eVar;
        }

        /* access modifiers changed from: package-private */
        public void c(Bundle bundle) {
            this.f.b(-1, bundle);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void d(Bundle bundle) {
            this.f.b(0, bundle);
        }
    }

    public static final class e {
        /* access modifiers changed from: private */
        public final String a;
        /* access modifiers changed from: private */
        public final Bundle b;

        public e(String str, Bundle bundle) {
            if (str != null) {
                this.a = str;
                this.b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        public Bundle c() {
            return this.b;
        }

        public String d() {
            return this.a;
        }
    }

    private class f implements IBinder.DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final p d;
        public final HashMap<String, List<q3<IBinder, Bundle>>> e = new HashMap<>();
        public e f;

        class a implements Runnable {
            a() {
            }

            public void run() {
                f fVar = f.this;
                MediaBrowserServiceCompat.this.h.remove(fVar.d.asBinder());
            }
        }

        f(String str, int i, int i2, Bundle bundle, p pVar) {
            this.a = str;
            this.b = i;
            this.c = i2;
            new c(str, i, i2);
            this.d = pVar;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.j.post(new a());
        }
    }

    interface g {
        IBinder B(Intent intent);

        void m();
    }

    class h implements g {
        final List<Bundle> a = new ArrayList();
        MediaBrowserService b;
        Messenger c;

        class a extends m<List<MediaBrowserCompat.MediaItem>> {
            final /* synthetic */ n f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, Object obj, n nVar) {
                super(obj);
                this.f = nVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h */
            public void d(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f.b(arrayList);
            }
        }

        class b extends MediaBrowserService {
            b(Context context) {
                attachBaseContext(context);
            }

            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                e a = h.this.a(str, i, bundle == null ? null : new Bundle(bundle));
                if (a == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(a.a, a.b);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                h.this.b(str, new n(result));
            }
        }

        h() {
        }

        public IBinder B(Intent intent) {
            return this.b.onBind(intent);
        }

        public e a(String str, int i, Bundle bundle) {
            int i2;
            Bundle bundle2;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
                i2 = -1;
            } else {
                bundle.remove("extra_client_version");
                this.c = new Messenger(MediaBrowserServiceCompat.this.j);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                androidx.core.app.e.b(bundle2, "extra_messenger", this.c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.k;
                if (token != null) {
                    android.support.v4.media.session.b c2 = token.c();
                    androidx.core.app.e.b(bundle2, "extra_session_binder", c2 == null ? null : c2.asBinder());
                } else {
                    this.a.add(bundle2);
                }
                int i3 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
                i2 = i3;
            }
            f fVar = new f(str, i2, i, bundle, (p) null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.i = fVar;
            e e = mediaBrowserServiceCompat.e(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.i = null;
            if (e == null) {
                return null;
            }
            if (this.c != null) {
                mediaBrowserServiceCompat2.g.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = e.c();
            } else if (e.c() != null) {
                bundle2.putAll(e.c());
            }
            return new e(e.d(), bundle2);
        }

        public void b(String str, n<List<Parcel>> nVar) {
            a aVar = new a(this, str, nVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.i = mediaBrowserServiceCompat.f;
            mediaBrowserServiceCompat.f(str, aVar);
            MediaBrowserServiceCompat.this.i = null;
        }

        public void m() {
            b bVar = new b(MediaBrowserServiceCompat.this);
            this.b = bVar;
            bVar.onCreate();
        }
    }

    class i extends h {

        class a extends m<MediaBrowserCompat.MediaItem> {
            final /* synthetic */ n f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar, Object obj, n nVar) {
                super(obj);
                this.f = nVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h */
            public void d(MediaBrowserCompat.MediaItem mediaItem) {
                n nVar;
                Parcel parcel;
                if (mediaItem == null) {
                    nVar = this.f;
                    parcel = null;
                } else {
                    parcel = Parcel.obtain();
                    mediaItem.writeToParcel(parcel, 0);
                    nVar = this.f;
                }
                nVar.b(parcel);
            }
        }

        class b extends h.b {
            b(Context context) {
                super(context);
            }

            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                i.this.c(str, new n(result));
            }
        }

        i() {
            super();
        }

        public void c(String str, n<Parcel> nVar) {
            a aVar = new a(this, str, nVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.i = mediaBrowserServiceCompat.f;
            mediaBrowserServiceCompat.h(str, aVar);
            MediaBrowserServiceCompat.this.i = null;
        }

        public void m() {
            b bVar = new b(MediaBrowserServiceCompat.this);
            this.b = bVar;
            bVar.onCreate();
        }
    }

    class j extends i {

        class a extends m<List<MediaBrowserCompat.MediaItem>> {
            final /* synthetic */ n f;
            final /* synthetic */ Bundle g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, n nVar, Bundle bundle) {
                super(obj);
                this.f = nVar;
                this.g = bundle;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h */
            public void d(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                n nVar;
                if (list == null) {
                    nVar = this.f;
                    arrayList = null;
                } else {
                    if ((a() & 1) != 0) {
                        list = MediaBrowserServiceCompat.this.b(list, this.g);
                    }
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                    nVar = this.f;
                }
                nVar.b(arrayList);
            }
        }

        class b extends i.b {
            b(Context context) {
                super(context);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                j jVar = j.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.i = mediaBrowserServiceCompat.f;
                jVar.d(str, new n(result), bundle);
                MediaBrowserServiceCompat.this.i = null;
            }
        }

        j() {
            super();
        }

        public void d(String str, n<List<Parcel>> nVar, Bundle bundle) {
            a aVar = new a(str, nVar, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.i = mediaBrowserServiceCompat.f;
            mediaBrowserServiceCompat.g(str, aVar, bundle);
            MediaBrowserServiceCompat.this.i = null;
        }

        public void m() {
            b bVar = new b(MediaBrowserServiceCompat.this);
            this.b = bVar;
            bVar.onCreate();
        }
    }

    class k extends j {
        k(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            super();
        }
    }

    class l implements g {
        private Messenger a;

        l() {
        }

        public IBinder B(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.a.getBinder();
            }
            return null;
        }

        public void m() {
            this.a = new Messenger(MediaBrowserServiceCompat.this.j);
        }
    }

    public static class m<T> {
        private final Object a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;

        m(Object obj) {
            this.a = obj;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.b || this.c || this.d;
        }

        /* access modifiers changed from: package-private */
        public void c(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.a);
        }

        /* access modifiers changed from: package-private */
        public abstract void d(T t);

        public void e(Bundle bundle) {
            if (this.c || this.d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.a);
            }
            this.d = true;
            c(bundle);
        }

        public void f(T t) {
            if (this.c || this.d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.a);
            }
            this.c = true;
            d(t);
        }

        /* access modifiers changed from: package-private */
        public void g(int i) {
            this.e = i;
        }
    }

    static class n<T> {
        MediaBrowserService.Result a;

        n(MediaBrowserService.Result result) {
            this.a = result;
        }

        /* access modifiers changed from: package-private */
        public List<MediaBrowser.MediaItem> a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        public void b(T t) {
            if (t instanceof List) {
                this.a.sendResult(a((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.a.sendResult((Object) null);
            }
        }
    }

    private class o {

        class a implements Runnable {
            final /* synthetic */ p e;
            final /* synthetic */ String f;
            final /* synthetic */ int g;
            final /* synthetic */ int h;
            final /* synthetic */ Bundle i;

            a(p pVar, String str, int i2, int i3, Bundle bundle) {
                this.e = pVar;
                this.f = str;
                this.g = i2;
                this.h = i3;
                this.i = bundle;
            }

            public void run() {
                IBinder asBinder = this.e.asBinder();
                MediaBrowserServiceCompat.this.h.remove(asBinder);
                f fVar = new f(this.f, this.g, this.h, this.i, this.e);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.i = fVar;
                e e2 = mediaBrowserServiceCompat.e(this.f, this.h, this.i);
                fVar.f = e2;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.i = null;
                if (e2 == null) {
                    "No root for client " + this.f + " from service " + a.class.getName();
                    try {
                        this.e.b();
                    } catch (RemoteException unused) {
                        "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f;
                    }
                } else {
                    try {
                        mediaBrowserServiceCompat2.h.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (MediaBrowserServiceCompat.this.k != null) {
                            this.e.c(fVar.f.d(), MediaBrowserServiceCompat.this.k, fVar.f.c());
                        }
                    } catch (RemoteException unused2) {
                        "Calling onConnect() failed. Dropping client. pkg=" + this.f;
                        MediaBrowserServiceCompat.this.h.remove(asBinder);
                    }
                }
            }
        }

        class b implements Runnable {
            final /* synthetic */ p e;

            b(p pVar) {
                this.e = pVar;
            }

            public void run() {
                f remove = MediaBrowserServiceCompat.this.h.remove(this.e.asBinder());
                if (remove != null) {
                    remove.d.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        class c implements Runnable {
            final /* synthetic */ p e;
            final /* synthetic */ String f;
            final /* synthetic */ IBinder g;
            final /* synthetic */ Bundle h;

            c(p pVar, String str, IBinder iBinder, Bundle bundle) {
                this.e = pVar;
                this.f = str;
                this.g = iBinder;
                this.h = bundle;
            }

            public void run() {
                f fVar = MediaBrowserServiceCompat.this.h.get(this.e.asBinder());
                if (fVar == null) {
                    "addSubscription for callback that isn't registered id=" + this.f;
                    return;
                }
                MediaBrowserServiceCompat.this.a(this.f, fVar, this.g, this.h);
            }
        }

        class d implements Runnable {
            final /* synthetic */ p e;
            final /* synthetic */ String f;
            final /* synthetic */ IBinder g;

            d(p pVar, String str, IBinder iBinder) {
                this.e = pVar;
                this.f = str;
                this.g = iBinder;
            }

            public void run() {
                f fVar = MediaBrowserServiceCompat.this.h.get(this.e.asBinder());
                if (fVar == null) {
                    "removeSubscription for callback that isn't registered id=" + this.f;
                } else if (!MediaBrowserServiceCompat.this.p(this.f, fVar, this.g)) {
                    "removeSubscription called for " + this.f + " which is not subscribed";
                }
            }
        }

        class e implements Runnable {
            final /* synthetic */ p e;
            final /* synthetic */ String f;
            final /* synthetic */ defpackage.e g;

            e(p pVar, String str, defpackage.e eVar) {
                this.e = pVar;
                this.f = str;
                this.g = eVar;
            }

            public void run() {
                f fVar = MediaBrowserServiceCompat.this.h.get(this.e.asBinder());
                if (fVar == null) {
                    "getMediaItem for callback that isn't registered id=" + this.f;
                    return;
                }
                MediaBrowserServiceCompat.this.n(this.f, fVar, this.g);
            }
        }

        class f implements Runnable {
            final /* synthetic */ p e;
            final /* synthetic */ int f;
            final /* synthetic */ String g;
            final /* synthetic */ int h;
            final /* synthetic */ Bundle i;

            f(p pVar, int i2, String str, int i3, Bundle bundle) {
                this.e = pVar;
                this.f = i2;
                this.g = str;
                this.h = i3;
                this.i = bundle;
            }

            public void run() {
                IBinder asBinder = this.e.asBinder();
                MediaBrowserServiceCompat.this.h.remove(asBinder);
                Iterator<f> it = MediaBrowserServiceCompat.this.g.iterator();
                f fVar = null;
                while (it.hasNext()) {
                    f next = it.next();
                    if (next.c == this.f) {
                        if (TextUtils.isEmpty(this.g) || this.h <= 0) {
                            fVar = new f(next.a, next.b, next.c, this.i, this.e);
                        }
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = new f(this.g, this.h, this.f, this.i, this.e);
                }
                MediaBrowserServiceCompat.this.h.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        class g implements Runnable {
            final /* synthetic */ p e;

            g(p pVar) {
                this.e = pVar;
            }

            public void run() {
                IBinder asBinder = this.e.asBinder();
                f remove = MediaBrowserServiceCompat.this.h.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        class h implements Runnable {
            final /* synthetic */ p e;
            final /* synthetic */ String f;
            final /* synthetic */ Bundle g;
            final /* synthetic */ defpackage.e h;

            h(p pVar, String str, Bundle bundle, defpackage.e eVar) {
                this.e = pVar;
                this.f = str;
                this.g = bundle;
                this.h = eVar;
            }

            public void run() {
                f fVar = MediaBrowserServiceCompat.this.h.get(this.e.asBinder());
                if (fVar == null) {
                    "search for callback that isn't registered query=" + this.f;
                    return;
                }
                MediaBrowserServiceCompat.this.o(this.f, this.g, fVar, this.h);
            }
        }

        class i implements Runnable {
            final /* synthetic */ p e;
            final /* synthetic */ String f;
            final /* synthetic */ Bundle g;
            final /* synthetic */ defpackage.e h;

            i(p pVar, String str, Bundle bundle, defpackage.e eVar) {
                this.e = pVar;
                this.f = str;
                this.g = bundle;
                this.h = eVar;
            }

            public void run() {
                f fVar = MediaBrowserServiceCompat.this.h.get(this.e.asBinder());
                if (fVar == null) {
                    "sendCustomAction for callback that isn't registered action=" + this.f + ", extras=" + this.g;
                    return;
                }
                MediaBrowserServiceCompat.this.l(this.f, this.g, fVar, this.h);
            }
        }

        o() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, p pVar) {
            MediaBrowserServiceCompat.this.j.a(new c(pVar, str, iBinder, bundle));
        }

        public void b(String str, int i2, int i3, Bundle bundle, p pVar) {
            if (MediaBrowserServiceCompat.this.c(str, i3)) {
                MediaBrowserServiceCompat.this.j.a(new a(pVar, str, i2, i3, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + str);
        }

        public void c(p pVar) {
            MediaBrowserServiceCompat.this.j.a(new b(pVar));
        }

        public void d(String str, defpackage.e eVar, p pVar) {
            if (!TextUtils.isEmpty(str) && eVar != null) {
                MediaBrowserServiceCompat.this.j.a(new e(pVar, str, eVar));
            }
        }

        public void e(p pVar, String str, int i2, int i3, Bundle bundle) {
            MediaBrowserServiceCompat.this.j.a(new f(pVar, i3, str, i2, bundle));
        }

        public void f(String str, IBinder iBinder, p pVar) {
            MediaBrowserServiceCompat.this.j.a(new d(pVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, defpackage.e eVar, p pVar) {
            if (!TextUtils.isEmpty(str) && eVar != null) {
                MediaBrowserServiceCompat.this.j.a(new h(pVar, str, bundle, eVar));
            }
        }

        public void h(String str, Bundle bundle, defpackage.e eVar, p pVar) {
            if (!TextUtils.isEmpty(str) && eVar != null) {
                MediaBrowserServiceCompat.this.j.a(new i(pVar, str, bundle, eVar));
            }
        }

        public void i(p pVar) {
            MediaBrowserServiceCompat.this.j.a(new g(pVar));
        }
    }

    private interface p {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2);

        IBinder asBinder();

        void b();

        void c(String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    private static class q implements p {
        final Messenger a;

        q(Messenger messenger) {
            this.a = messenger;
        }

        private void d(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.a.send(obtain);
        }

        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            d(3, bundle3);
        }

        public IBinder asBinder() {
            return this.a.getBinder();
        }

        public void b() {
            d(2, (Bundle) null);
        }

        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            d(1, bundle2);
        }
    }

    private final class r extends Handler {
        private final o a = new o();

        r() {
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.b(bundle);
                    this.a.b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new q(message.replyTo));
                    return;
                case 2:
                    this.a.c(new q(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.b(bundle2);
                    this.a.a(data.getString("data_media_item_id"), androidx.core.app.e.a(data, "data_callback_token"), bundle2, new q(message.replyTo));
                    return;
                case 4:
                    this.a.f(data.getString("data_media_item_id"), androidx.core.app.e.a(data, "data_callback_token"), new q(message.replyTo));
                    return;
                case 5:
                    this.a.d(data.getString("data_media_item_id"), (defpackage.e) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.b(bundle3);
                    this.a.e(new q(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.a.i(new q(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.b(bundle4);
                    this.a.g(data.getString("data_search_query"), bundle4, (defpackage.e) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.b(bundle5);
                    this.a.h(data.getString("data_custom_action"), bundle5, (defpackage.e) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    return;
                default:
                    "Unhandled message: " + message + "\n  Service version: " + 2 + "\n  Client version: " + message.arg1;
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid <= 0) {
                if (!data.containsKey("data_calling_pid")) {
                    callingPid = -1;
                }
                return super.sendMessageAtTime(message, j);
            }
            data.putInt("data_calling_pid", callingPid);
            return super.sendMessageAtTime(message, j);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<q3> list = fVar.e.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (q3 q3Var : list) {
            if (iBinder == q3Var.a && b.a(bundle, (Bundle) q3Var.b)) {
                return;
            }
        }
        list.add(new q3(iBinder, bundle));
        fVar.e.put(str, list);
        m(str, fVar, bundle, (Bundle) null);
        j(str, bundle);
    }

    /* access modifiers changed from: package-private */
    public List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int i5 = i4 + i3;
        if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
            return Collections.emptyList();
        }
        if (i5 > list.size()) {
            i5 = list.size();
        }
        return list.subList(i4, i5);
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i2)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void d(String str, Bundle bundle, m<Bundle> mVar) {
        mVar.e((Bundle) null);
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract e e(String str, int i2, Bundle bundle);

    public abstract void f(String str, m<List<MediaBrowserCompat.MediaItem>> mVar);

    public void g(String str, m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        mVar.g(1);
        f(str, mVar);
    }

    public void h(String str, m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.g(2);
        mVar.f(null);
    }

    public void i(String str, Bundle bundle, m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.g(4);
        mVar.f(null);
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(String str) {
    }

    /* access modifiers changed from: package-private */
    public void l(String str, Bundle bundle, f fVar, defpackage.e eVar) {
        d dVar = new d(this, str, eVar);
        d(str, bundle, dVar);
        if (!dVar.b()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        if (bundle == null) {
            f(str, aVar);
        } else {
            g(str, aVar, bundle);
        }
        if (!aVar.b()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.a + " id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(String str, f fVar, defpackage.e eVar) {
        b bVar = new b(this, str, eVar);
        h(str, bVar);
        if (!bVar.b()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(String str, Bundle bundle, f fVar, defpackage.e eVar) {
        c cVar = new c(this, str, eVar);
        i(str, bundle, cVar);
        if (!cVar.b()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.e.B(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        this.e = i2 >= 28 ? new k(this) : i2 >= 26 ? new j() : i2 >= 23 ? new i() : i2 >= 21 ? new h() : new l();
        this.e.m();
    }

    /* access modifiers changed from: package-private */
    public boolean p(String str, f fVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (fVar.e.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                k(str);
            }
        } else {
            List list = fVar.e.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((q3) it.next()).a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.e.remove(str);
                }
            }
            k(str);
            return z2;
        }
    }
}
