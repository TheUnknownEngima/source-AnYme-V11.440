package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class MediaControllerCompat {
    private final b a;
    private final MediaSessionCompat.Token b;
    private final ConcurrentHashMap<a, Boolean> c = new ConcurrentHashMap<>();

    static class MediaControllerImplApi21 implements b {
        protected final MediaController a;
        final Object b = new Object();
        private final List<a> c = new ArrayList();
        private HashMap<a, a> d = new HashMap<>();
        final MediaSessionCompat.Token e;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> e;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.e = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.e.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.b) {
                        mediaControllerImplApi21.e.f(b.a.p3(androidx.core.app.e.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.e.g(androidx.versionedparcelable.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.f();
                    }
                }
            }
        }

        private static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            public void F0(Bundle bundle) {
                throw new AssertionError();
            }

            public void I1(CharSequence charSequence) {
                throw new AssertionError();
            }

            public void K0(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            public void O1() {
                throw new AssertionError();
            }

            public void Q1(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            public void o3(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) this.e.e());
            this.a = mediaController;
            if (mediaController == null) {
                throw new RemoteException();
            } else if (this.e.c() == null) {
                g();
            }
        }

        private void g() {
            i("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        public final void a(a aVar) {
            this.a.unregisterCallback(aVar.a);
            synchronized (this.b) {
                if (this.e.c() != null) {
                    try {
                        a remove = this.d.remove(aVar);
                        if (remove != null) {
                            aVar.c = null;
                            this.e.c().T0(remove);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.c.remove(aVar);
                }
            }
        }

        public boolean b(KeyEvent keyEvent) {
            return this.a.dispatchMediaButtonEvent(keyEvent);
        }

        public PendingIntent c() {
            return this.a.getSessionActivity();
        }

        public e d() {
            return new f(this.a.getTransportControls());
        }

        public final void e(a aVar, Handler handler) {
            this.a.registerCallback(aVar.a, handler);
            synchronized (this.b) {
                if (this.e.c() != null) {
                    a aVar2 = new a(aVar);
                    this.d.put(aVar, aVar2);
                    aVar.c = aVar2;
                    try {
                        this.e.c().S(aVar2);
                        aVar.m(13, (Object) null, (Bundle) null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    aVar.c = null;
                    this.c.add(aVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
            if (this.e.c() != null) {
                for (a next : this.c) {
                    a aVar = new a(next);
                    this.d.put(next, aVar);
                    next.c = aVar;
                    try {
                        this.e.c().S(aVar);
                        next.m(13, (Object) null, (Bundle) null);
                    } catch (RemoteException unused) {
                    }
                }
                this.c.clear();
            }
        }

        public PlaybackStateCompat h() {
            if (this.e.c() != null) {
                try {
                    return this.e.c().h();
                } catch (RemoteException unused) {
                }
            }
            PlaybackState playbackState = this.a.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.a(playbackState);
            }
            return null;
        }

        public void i(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.a.sendCommand(str, bundle, resultReceiver);
        }

        public MediaMetadataCompat v() {
            MediaMetadata metadata = this.a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.b(metadata);
            }
            return null;
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {
        final MediaController.Callback a;
        b b;
        a c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        private static class C0002a extends MediaController.Callback {
            private final WeakReference<a> a;

            C0002a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.c(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.d(MediaMetadataCompat.b(mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = (a) this.a.get();
                if (aVar != null && aVar.c == null) {
                    aVar.e(PlaybackStateCompat.a(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.f(MediaSessionCompat.QueueItem.b(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.g(charSequence);
                }
            }

            public void onSessionDestroyed() {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.i();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a aVar = (a) this.a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.c == null || Build.VERSION.SDK_INT >= 23) {
                    aVar.j(str, bundle);
                }
            }
        }

        private class b extends Handler {
            boolean a = false;

            b(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.b(data);
                            a.this.j((String) message.obj, data);
                            return;
                        case 2:
                            a.this.e((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            a.this.d((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            a.this.a((d) message.obj);
                            return;
                        case 5:
                            a.this.f((List) message.obj);
                            return;
                        case 6:
                            a.this.g((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.b(bundle);
                            a.this.c(bundle);
                            return;
                        case 8:
                            a.this.i();
                            return;
                        case 9:
                            a.this.h(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            a.this.b(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            a.this.l(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            a.this.k();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        private static class c extends a.C0003a {
            private final WeakReference<a> a;

            c(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public void A(int i) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            public void C1(boolean z) {
            }

            public void E0() {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(13, (Object) null, (Bundle) null);
                }
            }

            public void F0(Bundle bundle) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(7, bundle, (Bundle) null);
                }
            }

            public void I1(CharSequence charSequence) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(6, charSequence, (Bundle) null);
                }
            }

            public void J(String str, Bundle bundle) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(1, str, bundle);
                }
            }

            public void K0(List<MediaSessionCompat.QueueItem> list) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(5, list, (Bundle) null);
                }
            }

            public void O1() {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(8, (Object) null, (Bundle) null);
                }
            }

            public void Q1(MediaMetadataCompat mediaMetadataCompat) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            public void j3(PlaybackStateCompat playbackStateCompat) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(2, playbackStateCompat, (Bundle) null);
                }
            }

            public void k1(boolean z) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            public void n2(int i) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            public void o3(ParcelableVolumeInfo parcelableVolumeInfo) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    aVar.m(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.e, parcelableVolumeInfo.f, parcelableVolumeInfo.g, parcelableVolumeInfo.h, parcelableVolumeInfo.i) : null, (Bundle) null);
                }
            }
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.a = new C0002a(this);
                return;
            }
            this.a = null;
            this.c = new c(this);
        }

        public void a(d dVar) {
        }

        public void b(boolean z) {
        }

        public void binderDied() {
            m(8, (Object) null, (Bundle) null);
        }

        public void c(Bundle bundle) {
        }

        public void d(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void e(PlaybackStateCompat playbackStateCompat) {
        }

        public void f(List<MediaSessionCompat.QueueItem> list) {
        }

        public void g(CharSequence charSequence) {
        }

        public void h(int i) {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k() {
        }

        public void l(int i) {
        }

        /* access modifiers changed from: package-private */
        public void m(int i, Object obj, Bundle bundle) {
            b bVar = this.b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* access modifiers changed from: package-private */
        public void n(Handler handler) {
            if (handler == null) {
                b bVar = this.b;
                if (bVar != null) {
                    bVar.a = false;
                    bVar.removeCallbacksAndMessages((Object) null);
                    this.b = null;
                    return;
                }
                return;
            }
            b bVar2 = new b(handler.getLooper());
            this.b = bVar2;
            bVar2.a = true;
        }
    }

    interface b {
        void a(a aVar);

        boolean b(KeyEvent keyEvent);

        PendingIntent c();

        e d();

        void e(a aVar, Handler handler);

        PlaybackStateCompat h();

        MediaMetadataCompat v();
    }

    static class c implements b {
        private b a;
        private e b;

        public c(MediaSessionCompat.Token token) {
            this.a = b.a.p3((IBinder) token.e());
        }

        public void a(a aVar) {
            if (aVar != null) {
                try {
                    this.a.T0(aVar.c);
                    this.a.asBinder().unlinkToDeath(aVar, 0);
                } catch (RemoteException unused) {
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        public boolean b(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.a.A1(keyEvent);
                    return false;
                } catch (RemoteException unused) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }

        public PendingIntent c() {
            try {
                return this.a.r0();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public e d() {
            if (this.b == null) {
                this.b = new g(this.a);
            }
            return this.b;
        }

        public void e(a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.a.asBinder().linkToDeath(aVar, 0);
                    this.a.S(aVar.c);
                    aVar.m(13, (Object) null, (Bundle) null);
                } catch (RemoteException unused) {
                    aVar.m(8, (Object) null, (Bundle) null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        public PlaybackStateCompat h() {
            try {
                return this.a.h();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public MediaMetadataCompat v() {
            try {
                return this.a.v();
            } catch (RemoteException unused) {
                return null;
            }
        }
    }

    public static final class d {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        d(int r8, int r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                androidx.media.AudioAttributesCompat$a r0 = new androidx.media.AudioAttributesCompat$a
                r0.<init>()
                r0.b(r9)
                androidx.media.AudioAttributesCompat r3 = r0.a()
                r1 = r7
                r2 = r8
                r4 = r10
                r5 = r11
                r6 = r12
                r1.<init>((int) r2, (androidx.media.AudioAttributesCompat) r3, (int) r4, (int) r5, (int) r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaControllerCompat.d.<init>(int, int, int, int, int):void");
        }

        d(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
        }
    }

    public static abstract class e {
        e() {
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }

    static class f extends e {
        protected final MediaController.TransportControls a;

        f(MediaController.TransportControls transportControls) {
            this.a = transportControls;
        }

        public void a() {
            this.a.pause();
        }

        public void b() {
            this.a.play();
        }

        public void c() {
            this.a.stop();
        }
    }

    static class g extends e {
        private b a;

        public g(b bVar) {
            this.a = bVar;
        }

        public void a() {
            try {
                this.a.n();
            } catch (RemoteException unused) {
            }
        }

        public void b() {
            try {
                this.a.D();
            } catch (RemoteException unused) {
            }
        }

        public void c() {
            try {
                this.a.stop();
            } catch (RemoteException unused) {
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.b = token;
            if (Build.VERSION.SDK_INT >= 21) {
                this.a = new MediaControllerImplApi21(context, token);
            } else {
                this.a = new c(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token e2 = mediaSessionCompat.e();
            this.b = e2;
            MediaControllerImplApi21 mediaControllerImplApi21 = null;
            try {
                mediaControllerImplApi21 = Build.VERSION.SDK_INT >= 21 ? new MediaControllerImplApi21(context, e2) : new c(e2);
            } catch (RemoteException unused) {
            }
            this.a = mediaControllerImplApi21;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.a.b(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public MediaMetadataCompat b() {
        return this.a.v();
    }

    public PlaybackStateCompat c() {
        return this.a.h();
    }

    public PendingIntent d() {
        return this.a.c();
    }

    public e e() {
        return this.a.d();
    }

    public void f(a aVar) {
        g(aVar, (Handler) null);
    }

    public void g(a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.c.putIfAbsent(aVar, Boolean.TRUE) == null) {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.n(handler);
            this.a.e(aVar, handler);
        }
    }

    public void h(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.c.remove(aVar) != null) {
            try {
                this.a.a(aVar);
            } finally {
                aVar.n((Handler) null);
            }
        }
    }
}
