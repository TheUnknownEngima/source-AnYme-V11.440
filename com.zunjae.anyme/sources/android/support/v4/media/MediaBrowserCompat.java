package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class MediaBrowserCompat {
    static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
    private final e a;

    private static class CustomActionResultReceiver extends defpackage.e {
        private final String h;
        private final Bundle i;
        private final c j;

        /* access modifiers changed from: protected */
        public void a(int i2, Bundle bundle) {
            if (this.j != null) {
                MediaSessionCompat.b(bundle);
                if (i2 == -1) {
                    this.j.a(this.h, this.i, bundle);
                } else if (i2 == 0) {
                    this.j.c(this.h, this.i, bundle);
                } else if (i2 != 1) {
                    "Unknown result code: " + i2 + " (extras=" + this.i + ", resultData=" + bundle + ")";
                } else {
                    this.j.b(this.h, this.i, bundle);
                }
            }
        }
    }

    private static class ItemReceiver extends defpackage.e {
        private final String h;
        private final d i;

        /* access modifiers changed from: protected */
        public void a(int i2, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i2 != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.i.a(this.h);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.i.b((MediaItem) parcelable);
            } else {
                this.i.a(this.h);
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        private final int e;
        private final MediaDescriptionCompat f;

        static class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        MediaItem(Parcel parcel) {
            this.e = parcel.readInt();
            this.f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.e())) {
                this.e = i;
                this.f = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        public static MediaItem a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.a(mediaItem.getDescription()), mediaItem.getFlags());
        }

        public static List<MediaItem> b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a2 : list) {
                arrayList.add(a(a2));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.e + ", mDescription=" + this.f + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.e);
            this.f.writeToParcel(parcel, i);
        }
    }

    private static class SearchResultReceiver extends defpackage.e {
        private final String h;
        private final Bundle i;
        private final k j;

        /* access modifiers changed from: protected */
        public void a(int i2, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i2 != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.j.a(this.h, this.i);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.j.b(this.h, this.i, arrayList);
        }
    }

    private static class a extends Handler {
        private final WeakReference<j> a;
        private WeakReference<Messenger> b;

        a(j jVar) {
            this.a = new WeakReference<>(jVar);
        }

        /* access modifiers changed from: package-private */
        public void a(Messenger messenger) {
            this.b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.b;
            if (weakReference != null && weakReference.get() != null && this.a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.b(data);
                j jVar = (j) this.a.get();
                Messenger messenger = (Messenger) this.b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.b(bundle);
                        jVar.a(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        jVar.e(messenger);
                    } else if (i != 3) {
                        "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1;
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.b(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.b(bundle3);
                        jVar.b(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        jVar.e(messenger);
                    }
                }
            }
        }
    }

    public static class b {
        final MediaBrowser.ConnectionCallback a;
        C0001b b;

        private class a extends MediaBrowser.ConnectionCallback {
            a() {
            }

            public void onConnected() {
                C0001b bVar = b.this.b;
                if (bVar != null) {
                    bVar.f();
                }
                b.this.a();
            }

            public void onConnectionFailed() {
                C0001b bVar = b.this.b;
                if (bVar != null) {
                    bVar.h();
                }
                b.this.b();
            }

            public void onConnectionSuspended() {
                C0001b bVar = b.this.b;
                if (bVar != null) {
                    bVar.c();
                }
                b.this.c();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b  reason: collision with other inner class name */
        interface C0001b {
            void c();

            void f();

            void h();
        }

        public b() {
            this.a = Build.VERSION.SDK_INT >= 21 ? new a() : null;
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        /* access modifiers changed from: package-private */
        public void d(C0001b bVar) {
            this.b = bVar;
        }
    }

    public static abstract class c {
        public abstract void a(String str, Bundle bundle, Bundle bundle2);

        public abstract void b(String str, Bundle bundle, Bundle bundle2);

        public abstract void c(String str, Bundle bundle, Bundle bundle2);
    }

    public static abstract class d {
        public abstract void a(String str);

        public abstract void b(MediaItem mediaItem);
    }

    interface e {
        void d();

        void g();

        MediaSessionCompat.Token i();
    }

    static class f implements e, j, b.C0001b {
        final Context a;
        protected final MediaBrowser b;
        protected final Bundle c;
        protected final a d = new a(this);
        private final b0<String, m> e = new b0<>();
        protected l f;
        protected Messenger g;
        private MediaSessionCompat.Token h;

        f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            Bundle bundle2;
            this.a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            this.c.putInt("extra_calling_pid", Process.myPid());
            bVar.d(this);
            this.b = new MediaBrowser(context, componentName, bVar.a, this.c);
        }

        public void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        public void b(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.g == messenger) {
                m mVar = this.e.get(str);
                if (mVar != null) {
                    n a2 = mVar.a(bundle);
                    if (a2 == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a2.c(str);
                        } else {
                            a2.a(str, list);
                        }
                    } else if (list == null) {
                        a2.d(str, bundle);
                    } else {
                        a2.b(str, list, bundle);
                    }
                } else if (MediaBrowserCompat.b) {
                    "onLoadChildren for id that isn't subscribed id=" + str;
                }
            }
        }

        public void c() {
            this.f = null;
            this.g = null;
            this.h = null;
            this.d.a((Messenger) null);
        }

        public void d() {
            Messenger messenger;
            l lVar = this.f;
            if (!(lVar == null || (messenger = this.g) == null)) {
                try {
                    lVar.f(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.b.disconnect();
        }

        public void e(Messenger messenger) {
        }

        public void f() {
            try {
                Bundle extras = this.b.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder a2 = androidx.core.app.e.a(extras, "extra_messenger");
                    if (a2 != null) {
                        this.f = new l(a2, this.c);
                        Messenger messenger = new Messenger(this.d);
                        this.g = messenger;
                        this.d.a(messenger);
                        try {
                            this.f.d(this.a, this.g);
                        } catch (RemoteException unused) {
                        }
                    }
                    android.support.v4.media.session.b p3 = b.a.p3(androidx.core.app.e.a(extras, "extra_session_binder"));
                    if (p3 != null) {
                        this.h = MediaSessionCompat.Token.b(this.b.getSessionToken(), p3);
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }

        public void g() {
            this.b.connect();
        }

        public void h() {
        }

        public MediaSessionCompat.Token i() {
            if (this.h == null) {
                this.h = MediaSessionCompat.Token.a(this.b.getSessionToken());
            }
            return this.h;
        }
    }

    static class g extends f {
        g(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    static class h extends g {
        h(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    static class i implements e, j {
        final Context a;
        final ComponentName b;
        final b c;
        final Bundle d;
        final a e = new a(this);
        private final b0<String, m> f = new b0<>();
        int g = 1;
        c h;
        l i;
        Messenger j;
        private String k;
        private MediaSessionCompat.Token l;

        class a implements Runnable {
            a() {
            }

            public void run() {
                i iVar = i.this;
                if (iVar.g != 0) {
                    iVar.g = 2;
                    if (!MediaBrowserCompat.b || iVar.h == null) {
                        i iVar2 = i.this;
                        if (iVar2.i != null) {
                            throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + i.this.i);
                        } else if (iVar2.j == null) {
                            Intent intent = new Intent("android.media.browse.MediaBrowserService");
                            intent.setComponent(i.this.b);
                            i iVar3 = i.this;
                            iVar3.h = new c();
                            boolean z = false;
                            try {
                                z = i.this.a.bindService(intent, i.this.h, 1);
                            } catch (Exception unused) {
                                "Failed binding to service " + i.this.b;
                            }
                            if (!z) {
                                i.this.f();
                                i.this.c.b();
                            }
                            if (MediaBrowserCompat.b) {
                                i.this.c();
                            }
                        } else {
                            throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + i.this.j);
                        }
                    } else {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + i.this.h);
                    }
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            public void run() {
                i iVar = i.this;
                Messenger messenger = iVar.j;
                if (messenger != null) {
                    try {
                        iVar.i.c(messenger);
                    } catch (RemoteException unused) {
                        "RemoteException during connect for " + i.this.b;
                    }
                }
                i iVar2 = i.this;
                int i = iVar2.g;
                iVar2.f();
                if (i != 0) {
                    i.this.g = i;
                }
                if (MediaBrowserCompat.b) {
                    i.this.c();
                }
            }
        }

        private class c implements ServiceConnection {

            class a implements Runnable {
                final /* synthetic */ ComponentName e;
                final /* synthetic */ IBinder f;

                a(ComponentName componentName, IBinder iBinder) {
                    this.e = componentName;
                    this.f = iBinder;
                }

                public void run() {
                    if (MediaBrowserCompat.b) {
                        "MediaServiceConnection.onServiceConnected name=" + this.e + " binder=" + this.f;
                        i.this.c();
                    }
                    if (c.this.a("onServiceConnected")) {
                        i iVar = i.this;
                        iVar.i = new l(this.f, iVar.d);
                        i.this.j = new Messenger(i.this.e);
                        i iVar2 = i.this;
                        iVar2.e.a(iVar2.j);
                        i.this.g = 2;
                        try {
                            if (MediaBrowserCompat.b) {
                                i.this.c();
                            }
                            i.this.i.b(i.this.a, i.this.j);
                        } catch (RemoteException unused) {
                            "RemoteException during connect for " + i.this.b;
                            if (MediaBrowserCompat.b) {
                                i.this.c();
                            }
                        }
                    }
                }
            }

            class b implements Runnable {
                final /* synthetic */ ComponentName e;

                b(ComponentName componentName) {
                    this.e = componentName;
                }

                public void run() {
                    if (MediaBrowserCompat.b) {
                        "MediaServiceConnection.onServiceDisconnected name=" + this.e + " this=" + this + " mServiceConnection=" + i.this.h;
                        i.this.c();
                    }
                    if (c.this.a("onServiceDisconnected")) {
                        i iVar = i.this;
                        iVar.i = null;
                        iVar.j = null;
                        iVar.e.a((Messenger) null);
                        i iVar2 = i.this;
                        iVar2.g = 4;
                        iVar2.c.c();
                    }
                }
            }

            c() {
            }

            private void b(Runnable runnable) {
                if (Thread.currentThread() == i.this.e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    i.this.e.post(runnable);
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a(String str) {
                int i;
                i iVar = i.this;
                if (iVar.h == this && (i = iVar.g) != 0 && i != 1) {
                    return true;
                }
                int i2 = i.this.g;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                str + " for " + i.this.b + " with mServiceConnection=" + i.this.h + " this=" + this;
                return false;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b(new a(componentName, iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                b(new b(componentName));
            }
        }

        public i(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.a = context;
                this.b = componentName;
                this.c = bVar;
                this.d = bundle == null ? null : new Bundle(bundle);
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        private static String h(int i2) {
            if (i2 == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i2 == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i2 == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i2 == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i2 == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i2;
        }

        private boolean k(Messenger messenger, String str) {
            int i2;
            if (this.j == messenger && (i2 = this.g) != 0 && i2 != 1) {
                return true;
            }
            int i3 = this.g;
            if (i3 == 0 || i3 == 1) {
                return false;
            }
            str + " for " + this.b + " with mCallbacksMessenger=" + this.j + " this=" + this;
            return false;
        }

        public void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (k(messenger, "onConnect")) {
                if (this.g != 2) {
                    "onConnect from service while mState=" + h(this.g) + "... ignoring";
                    return;
                }
                this.k = str;
                this.l = token;
                this.g = 3;
                if (MediaBrowserCompat.b) {
                    c();
                }
                this.c.a();
                try {
                    for (Map.Entry next : this.f.entrySet()) {
                        String str2 = (String) next.getKey();
                        m mVar = (m) next.getValue();
                        List<n> b2 = mVar.b();
                        List<Bundle> c2 = mVar.c();
                        for (int i2 = 0; i2 < b2.size(); i2++) {
                            this.i.a(str2, b2.get(i2).a, c2.get(i2), this.j);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        public void b(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (k(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.b) {
                    "onLoadChildren for " + this.b + " id=" + str;
                }
                m mVar = this.f.get(str);
                if (mVar != null) {
                    n a2 = mVar.a(bundle);
                    if (a2 == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a2.c(str);
                        } else {
                            a2.a(str, list);
                        }
                    } else if (list == null) {
                        a2.d(str, bundle);
                    } else {
                        a2.b(str, list, bundle);
                    }
                } else if (MediaBrowserCompat.b) {
                    "onLoadChildren for id that isn't subscribed id=" + str;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            "  mServiceComponent=" + this.b;
            "  mCallback=" + this.c;
            "  mRootHints=" + this.d;
            "  mState=" + h(this.g);
            "  mServiceConnection=" + this.h;
            "  mServiceBinderWrapper=" + this.i;
            "  mCallbacksMessenger=" + this.j;
            "  mRootId=" + this.k;
            "  mMediaSessionToken=" + this.l;
        }

        public void d() {
            this.g = 0;
            this.e.post(new b());
        }

        public void e(Messenger messenger) {
            "onConnectFailed for " + this.b;
            if (k(messenger, "onConnectFailed")) {
                if (this.g != 2) {
                    "onConnect from service while mState=" + h(this.g) + "... ignoring";
                    return;
                }
                f();
                this.c.b();
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
            c cVar = this.h;
            if (cVar != null) {
                this.a.unbindService(cVar);
            }
            this.g = 1;
            this.h = null;
            this.i = null;
            this.j = null;
            this.e.a((Messenger) null);
            this.k = null;
            this.l = null;
        }

        public void g() {
            int i2 = this.g;
            if (i2 == 0 || i2 == 1) {
                this.g = 2;
                this.e.post(new a());
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + h(this.g) + ")");
        }

        public MediaSessionCompat.Token i() {
            if (j()) {
                return this.l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.g + ")");
        }

        public boolean j() {
            return this.g == 3;
        }
    }

    interface j {
        void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void b(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void e(Messenger messenger);
    }

    public static abstract class k {
        public abstract void a(String str, Bundle bundle);

        public abstract void b(String str, Bundle bundle, List<MediaItem> list);
    }

    private static class l {
        private Messenger a;
        private Bundle b;

        public l(IBinder iBinder, Bundle bundle) {
            this.a = new Messenger(iBinder);
            this.b = bundle;
        }

        private void e(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.a.send(obtain);
        }

        /* access modifiers changed from: package-private */
        public void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            androidx.core.app.e.b(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            e(3, bundle2, messenger);
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.b);
            e(1, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        public void c(Messenger messenger) {
            e(2, (Bundle) null, messenger);
        }

        /* access modifiers changed from: package-private */
        public void d(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.b);
            e(6, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        public void f(Messenger messenger) {
            e(7, (Bundle) null, messenger);
        }
    }

    private static class m {
        private final List<n> a = new ArrayList();
        private final List<Bundle> b = new ArrayList();

        public n a(Bundle bundle) {
            for (int i = 0; i < this.b.size(); i++) {
                if (androidx.media.b.a(this.b.get(i), bundle)) {
                    return this.a.get(i);
                }
            }
            return null;
        }

        public List<n> b() {
            return this.a;
        }

        public List<Bundle> c() {
            return this.b;
        }
    }

    public static abstract class n {
        final IBinder a = new Binder();
        WeakReference<m> b;

        private class a extends MediaBrowser.SubscriptionCallback {
            a() {
            }

            /* access modifiers changed from: package-private */
            public List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<m> weakReference = n.this.b;
                m mVar = weakReference == null ? null : (m) weakReference.get();
                if (mVar == null) {
                    n.this.a(str, MediaItem.b(list));
                    return;
                }
                List<MediaItem> b = MediaItem.b(list);
                List<n> b2 = mVar.b();
                List<Bundle> c = mVar.c();
                for (int i = 0; i < b2.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        n.this.a(str, b);
                    } else {
                        n.this.b(str, a(b, bundle), bundle);
                    }
                }
            }

            public void onError(String str) {
                n.this.c(str);
            }
        }

        private class b extends a {
            b() {
                super();
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                n.this.b(str, MediaItem.b(list), bundle);
            }

            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                n.this.d(str, bundle);
            }
        }

        public n() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                new b();
            } else if (i >= 21) {
                new a();
            }
        }

        public void a(String str, List<MediaItem> list) {
        }

        public void b(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void c(String str) {
        }

        public void d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        this.a = i2 >= 26 ? new h(context, componentName, bVar, bundle) : i2 >= 23 ? new g(context, componentName, bVar, bundle) : i2 >= 21 ? new f(context, componentName, bVar, bundle) : new i(context, componentName, bVar, bundle);
    }

    public void a() {
        this.a.g();
    }

    public void b() {
        this.a.d();
    }

    public MediaSessionCompat.Token c() {
        return this.a.i();
    }
}
