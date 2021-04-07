package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.g;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat {
    static int d;
    private final d a;
    private final MediaControllerCompat b;
    private final ArrayList<j> c;

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        private final MediaDescriptionCompat e;
        private final long f;

        static class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.e = mediaDescriptionCompat;
                this.f = j;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.e = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f = parcel.readLong();
        }

        public static QueueItem a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.a(queueItem.getDescription()), queueItem.getQueueId());
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a2 : list) {
                arrayList.add(a(a2));
            }
            return arrayList;
        }

        public MediaDescriptionCompat c() {
            return this.e;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.e + ", Id=" + this.f + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.e.writeToParcel(parcel, i);
            parcel.writeLong(this.f);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        ResultReceiver e;

        static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.e = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.e.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        private final Object e;
        private b f;
        private androidx.versionedparcelable.d g;

        static class a implements Parcelable.Creator<Token> {
            a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable((ClassLoader) null) : parcel.readStrongBinder());
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (b) null, (androidx.versionedparcelable.d) null);
        }

        Token(Object obj, b bVar) {
            this(obj, bVar, (androidx.versionedparcelable.d) null);
        }

        Token(Object obj, b bVar, androidx.versionedparcelable.d dVar) {
            this.e = obj;
            this.f = bVar;
            this.g = dVar;
        }

        public static Token a(Object obj) {
            return b(obj, (b) null);
        }

        public static Token b(Object obj, b bVar) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public b c() {
            return this.f;
        }

        public androidx.versionedparcelable.d d() {
            return this.g;
        }

        public int describeContents() {
            return 0;
        }

        public Object e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.e;
            Object obj3 = ((Token) obj).e;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public void f(b bVar) {
            this.f = bVar;
        }

        public void g(androidx.versionedparcelable.d dVar) {
            this.g = dVar;
        }

        public int hashCode() {
            Object obj = this.e;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.e, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.e);
            }
        }
    }

    class a extends c {
        a(MediaSessionCompat mediaSessionCompat) {
        }
    }

    class b extends c {
        b(MediaSessionCompat mediaSessionCompat) {
        }
    }

    public static abstract class c {
        final MediaSession.Callback a;
        WeakReference<d> b;
        private a c = null;
        private boolean d;

        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                d dVar;
                if (message.what == 1 && (dVar = (d) c.this.b.get()) != null) {
                    dVar.m((androidx.media.c) message.obj);
                    c.this.a();
                    dVar.m((androidx.media.c) null);
                }
            }
        }

        private class b extends MediaSession.Callback {
            b() {
            }

            /* access modifiers changed from: package-private */
            public void a() {
                WeakReference<d> weakReference = c.this.b;
                d dVar = weakReference != null ? (d) weakReference.get() : null;
                if (dVar != null) {
                    dVar.m((androidx.media.c) null);
                }
            }

            /* access modifiers changed from: package-private */
            public void b() {
                if (Build.VERSION.SDK_INT < 28) {
                    WeakReference<d> weakReference = c.this.b;
                    d dVar = weakReference != null ? (d) weakReference.get() : null;
                    if (dVar != null) {
                        String c = dVar.c();
                        if (TextUtils.isEmpty(c)) {
                            c = "android.media.session.MediaController";
                        }
                        dVar.m(new androidx.media.c(c, -1, -1));
                    }
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r1v0 */
            /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r1v6 */
            /* JADX WARNING: type inference failed for: r1v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCommand(java.lang.String r5, android.os.Bundle r6, android.os.ResultReceiver r7) {
                /*
                    r4 = this;
                    android.support.v4.media.session.MediaSessionCompat.b(r6)
                    r4.b()
                    java.lang.String r0 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c5 }
                    r1 = 0
                    if (r0 == 0) goto L_0x0043
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.v4.media.session.MediaSessionCompat.c.this     // Catch:{ BadParcelableException -> 0x00c5 }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$d> r5 = r5.b     // Catch:{ BadParcelableException -> 0x00c5 }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00c5 }
                    android.support.v4.media.session.MediaSessionCompat$g r5 = (android.support.v4.media.session.MediaSessionCompat.g) r5     // Catch:{ BadParcelableException -> 0x00c5 }
                    if (r5 == 0) goto L_0x00c5
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00c5 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00c5 }
                    android.support.v4.media.session.MediaSessionCompat$Token r5 = r5.i()     // Catch:{ BadParcelableException -> 0x00c5 }
                    android.support.v4.media.session.b r0 = r5.c()     // Catch:{ BadParcelableException -> 0x00c5 }
                    java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r0 != 0) goto L_0x002d
                    goto L_0x0031
                L_0x002d:
                    android.os.IBinder r1 = r0.asBinder()     // Catch:{ BadParcelableException -> 0x00c5 }
                L_0x0031:
                    androidx.core.app.e.b(r6, r2, r1)     // Catch:{ BadParcelableException -> 0x00c5 }
                    java.lang.String r0 = "android.support.v4.media.session.SESSION_TOKEN2"
                    androidx.versionedparcelable.d r5 = r5.d()     // Catch:{ BadParcelableException -> 0x00c5 }
                    androidx.versionedparcelable.a.c(r6, r0, r5)     // Catch:{ BadParcelableException -> 0x00c5 }
                    r5 = 0
                    r7.send(r5, r6)     // Catch:{ BadParcelableException -> 0x00c5 }
                    goto L_0x00c5
                L_0x0043:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c5 }
                    java.lang.String r2 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r0 == 0) goto L_0x0059
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.v4.media.session.MediaSessionCompat.c.this     // Catch:{ BadParcelableException -> 0x00c5 }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c5 }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00c5 }
                    r5.b(r6)     // Catch:{ BadParcelableException -> 0x00c5 }
                    goto L_0x00c5
                L_0x0059:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c5 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r0 == 0) goto L_0x0073
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.v4.media.session.MediaSessionCompat.c.this     // Catch:{ BadParcelableException -> 0x00c5 }
                    android.os.Parcelable r7 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c5 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00c5 }
                    int r6 = r6.getInt(r3)     // Catch:{ BadParcelableException -> 0x00c5 }
                    r5.c(r7, r6)     // Catch:{ BadParcelableException -> 0x00c5 }
                    goto L_0x00c5
                L_0x0073:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c5 }
                    if (r0 == 0) goto L_0x0087
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.v4.media.session.MediaSessionCompat.c.this     // Catch:{ BadParcelableException -> 0x00c5 }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c5 }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00c5 }
                L_0x0083:
                    r5.q(r6)     // Catch:{ BadParcelableException -> 0x00c5 }
                    goto L_0x00c5
                L_0x0087:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c5 }
                    if (r0 == 0) goto L_0x00c0
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.v4.media.session.MediaSessionCompat.c.this     // Catch:{ BadParcelableException -> 0x00c5 }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$d> r5 = r5.b     // Catch:{ BadParcelableException -> 0x00c5 }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00c5 }
                    android.support.v4.media.session.MediaSessionCompat$g r5 = (android.support.v4.media.session.MediaSessionCompat.g) r5     // Catch:{ BadParcelableException -> 0x00c5 }
                    if (r5 == 0) goto L_0x00c5
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.h     // Catch:{ BadParcelableException -> 0x00c5 }
                    if (r7 == 0) goto L_0x00c5
                    r7 = -1
                    int r6 = r6.getInt(r3, r7)     // Catch:{ BadParcelableException -> 0x00c5 }
                    if (r6 < 0) goto L_0x00b7
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.h     // Catch:{ BadParcelableException -> 0x00c5 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00c5 }
                    if (r6 >= r7) goto L_0x00b7
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = r5.h     // Catch:{ BadParcelableException -> 0x00c5 }
                    java.lang.Object r5 = r5.get(r6)     // Catch:{ BadParcelableException -> 0x00c5 }
                    r1 = r5
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r1     // Catch:{ BadParcelableException -> 0x00c5 }
                L_0x00b7:
                    if (r1 == 0) goto L_0x00c5
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.v4.media.session.MediaSessionCompat.c.this     // Catch:{ BadParcelableException -> 0x00c5 }
                    android.support.v4.media.MediaDescriptionCompat r6 = r1.c()     // Catch:{ BadParcelableException -> 0x00c5 }
                    goto L_0x0083
                L_0x00c0:
                    android.support.v4.media.session.MediaSessionCompat$c r0 = android.support.v4.media.session.MediaSessionCompat.c.this     // Catch:{ BadParcelableException -> 0x00c5 }
                    r0.d(r5, r6, r7)     // Catch:{ BadParcelableException -> 0x00c5 }
                L_0x00c5:
                    r4.a()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.c.b.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void onCustomAction(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.b(bundle2);
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    c.this.l((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                    c.this.m();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    c.this.n(bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    c.this.o(bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    c.this.p((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    c.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    c.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    c.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    c.this.w((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    c.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                } else {
                    c.this.e(str, bundle);
                }
                a();
            }

            public void onFastForward() {
                b();
                c.this.f();
                a();
            }

            public boolean onMediaButtonEvent(Intent intent) {
                b();
                boolean g = c.this.g(intent);
                a();
                return g || super.onMediaButtonEvent(intent);
            }

            public void onPause() {
                b();
                c.this.h();
                a();
            }

            public void onPlay() {
                b();
                c.this.i();
                a();
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                c.this.j(str, bundle);
                a();
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                c.this.k(str, bundle);
                a();
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                c.this.l(uri, bundle);
                a();
            }

            public void onPrepare() {
                b();
                c.this.m();
                a();
            }

            public void onPrepareFromMediaId(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                c.this.n(str, bundle);
                a();
            }

            public void onPrepareFromSearch(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                c.this.o(str, bundle);
                a();
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                b();
                c.this.p(uri, bundle);
                a();
            }

            public void onRewind() {
                b();
                c.this.r();
                a();
            }

            public void onSeekTo(long j) {
                b();
                c.this.s(j);
                a();
            }

            public void onSetRating(Rating rating) {
                b();
                c.this.v(RatingCompat.a(rating));
                a();
            }

            public void onSkipToNext() {
                b();
                c.this.z();
                a();
            }

            public void onSkipToPrevious() {
                b();
                c.this.A();
                a();
            }

            public void onSkipToQueueItem(long j) {
                b();
                c.this.B(j);
                a();
            }

            public void onStop() {
                b();
                c.this.C();
                a();
            }
        }

        public c() {
            b bVar = null;
            this.a = Build.VERSION.SDK_INT >= 21 ? new b() : bVar;
        }

        public void A() {
        }

        public void B(long j) {
        }

        public void C() {
        }

        /* access modifiers changed from: package-private */
        public void D(d dVar, Handler handler) {
            this.b = new WeakReference<>(dVar);
            a aVar = this.c;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages((Object) null);
            }
            this.c = new a(handler.getLooper());
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (this.d) {
                boolean z = false;
                this.d = false;
                this.c.removeMessages(1);
                d dVar = (d) this.b.get();
                if (dVar != null) {
                    PlaybackStateCompat h = dVar.h();
                    long b2 = h == null ? 0 : h.b();
                    boolean z2 = h != null && h.g() == 3;
                    boolean z3 = (516 & b2) != 0;
                    if ((b2 & 514) != 0) {
                        z = true;
                    }
                    if (z2 && z) {
                        h();
                    } else if (!z2 && z3) {
                        i();
                    }
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            d dVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27 || (dVar = (d) this.b.get()) == null || this.c == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            androidx.media.c p = dVar.p();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() > 0) {
                    a();
                } else if (this.d) {
                    this.c.removeMessages(1);
                    this.d = false;
                    PlaybackStateCompat h = dVar.h();
                    if (((h == null ? 0 : h.b()) & 32) != 0) {
                        z();
                    }
                } else {
                    this.d = true;
                    a aVar = this.c;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, p), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            a();
            return false;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long j) {
        }

        public void t(boolean z) {
        }

        public void u(float f) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int i) {
        }

        public void y(int i) {
        }

        public void z() {
        }
    }

    interface d {
        void a();

        boolean b();

        String c();

        void d(PendingIntent pendingIntent);

        void e(c cVar, Handler handler);

        void f(int i);

        void g(MediaMetadataCompat mediaMetadataCompat);

        PlaybackStateCompat h();

        Token i();

        void j(PendingIntent pendingIntent);

        Object k();

        void l(boolean z);

        void m(androidx.media.c cVar);

        void n(PlaybackStateCompat playbackStateCompat);

        void o(androidx.media.g gVar);

        androidx.media.c p();
    }

    static class e extends i {
        private static boolean G = true;

        class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            a() {
            }

            public void onPlaybackPositionUpdate(long j) {
                e.this.v(18, -1, -1, Long.valueOf(j), (Bundle) null);
            }
        }

        e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bundle);
        }

        /* access modifiers changed from: package-private */
        public void B(PlaybackStateCompat playbackStateCompat) {
            long f = playbackStateCompat.f();
            float d = playbackStateCompat.d();
            long c = playbackStateCompat.c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.g() == 3) {
                long j = 0;
                if (f > 0) {
                    if (c > 0) {
                        j = elapsedRealtime - c;
                        if (d > Utils.FLOAT_EPSILON && d != 1.0f) {
                            j = (long) (((float) j) * d);
                        }
                    }
                    f += j;
                }
            }
            this.j.setPlaybackState(t(playbackStateCompat.g()), f, d);
        }

        /* access modifiers changed from: package-private */
        public void D(PendingIntent pendingIntent, ComponentName componentName) {
            if (G) {
                this.i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.D(pendingIntent, componentName);
            }
        }

        public void e(c cVar, Handler handler) {
            super.e(cVar, handler);
            if (cVar == null) {
                this.j.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);
                return;
            }
            this.j.setPlaybackPositionUpdateListener(new a());
        }

        /* access modifiers changed from: package-private */
        public int u(long j) {
            int u = super.u(j);
            return (j & 256) != 0 ? u | 256 : u;
        }

        /* access modifiers changed from: package-private */
        public void w(PendingIntent pendingIntent, ComponentName componentName) {
            if (G) {
                try {
                    this.i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    G = false;
                }
            }
            if (!G) {
                super.w(pendingIntent, componentName);
            }
        }
    }

    static class f extends e {

        class a implements RemoteControlClient.OnMetadataUpdateListener {
            a() {
            }

            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    f.this.v(19, -1, -1, RatingCompat.a(obj), (Bundle) null);
                }
            }
        }

        f(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bundle);
        }

        public void e(c cVar, Handler handler) {
            super.e(cVar, handler);
            if (cVar == null) {
                this.j.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);
                return;
            }
            this.j.setMetadataUpdateListener(new a());
        }

        /* access modifiers changed from: package-private */
        public RemoteControlClient.MetadataEditor r(Bundle bundle) {
            RemoteControlClient.MetadataEditor r = super.r(bundle);
            PlaybackStateCompat playbackStateCompat = this.t;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.b()) & 128) != 0) {
                r.addEditableKey(268435457);
            }
            if (bundle == null) {
                return r;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                r.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                r.putObject(101, bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                r.putObject(268435457, bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return r;
        }

        /* access modifiers changed from: package-private */
        public int u(long j) {
            int u = super.u(j);
            return (j & 128) != 0 ? u | 512 : u;
        }
    }

    static class g implements d {
        final MediaSession a;
        final Token b;
        final Object c = new Object();
        final Bundle d;
        boolean e = false;
        final RemoteCallbackList<a> f = new RemoteCallbackList<>();
        PlaybackStateCompat g;
        List<QueueItem> h;
        MediaMetadataCompat i;
        int j;
        boolean k;
        int l;
        int m;
        androidx.media.c n;

        class a extends b.a {
            a() {
            }

            public boolean A1(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            public void D() {
                throw new AssertionError();
            }

            public void E(int i) {
                throw new AssertionError();
            }

            public int G() {
                return g.this.l;
            }

            public Bundle H() {
                throw new AssertionError();
            }

            public long I2() {
                throw new AssertionError();
            }

            public void L1(int i, int i2, String str) {
                throw new AssertionError();
            }

            public CharSequence M0() {
                throw new AssertionError();
            }

            public void M1(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            public void M2(long j) {
                throw new AssertionError();
            }

            public void N2(boolean z) {
            }

            public void O(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public ParcelableVolumeInfo O2() {
                throw new AssertionError();
            }

            public void P1(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            public void R0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void S(a aVar) {
                if (!g.this.e) {
                    g.this.f.register(aVar, new androidx.media.c("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            public Bundle S0() {
                if (g.this.d == null) {
                    return null;
                }
                return new Bundle(g.this.d);
            }

            public void T0(a aVar) {
                g.this.f.unregister(aVar);
            }

            public void T1(boolean z) {
                throw new AssertionError();
            }

            public void V2(int i) {
                throw new AssertionError();
            }

            public boolean W() {
                return false;
            }

            public void X(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            public void a0(int i, int i2, String str) {
                throw new AssertionError();
            }

            public void b0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public void b1(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void c1(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public int d2() {
                return g.this.m;
            }

            public void e1() {
                throw new AssertionError();
            }

            public String e3() {
                throw new AssertionError();
            }

            public void f1(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public PlaybackStateCompat h() {
                g gVar = g.this;
                return MediaSessionCompat.f(gVar.g, gVar.i);
            }

            public void h2(int i) {
                throw new AssertionError();
            }

            public void i0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void i1(long j) {
                throw new AssertionError();
            }

            public boolean i2() {
                return g.this.k;
            }

            public boolean l0() {
                throw new AssertionError();
            }

            public void m0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void n() {
                throw new AssertionError();
            }

            public void next() {
                throw new AssertionError();
            }

            public String o() {
                throw new AssertionError();
            }

            public void previous() {
                throw new AssertionError();
            }

            public PendingIntent r0() {
                throw new AssertionError();
            }

            public void stop() {
                throw new AssertionError();
            }

            public void t() {
                throw new AssertionError();
            }

            public void t2(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            public void u1(float f) {
                throw new AssertionError();
            }

            public List<QueueItem> u2() {
                return null;
            }

            public MediaMetadataCompat v() {
                throw new AssertionError();
            }

            public int w0() {
                return g.this.j;
            }

            public void x2() {
                throw new AssertionError();
            }

            public void z0(String str, Bundle bundle) {
                throw new AssertionError();
            }
        }

        g(Context context, String str, androidx.versionedparcelable.d dVar, Bundle bundle) {
            this.a = new MediaSession(context, str);
            this.b = new Token(this.a.getSessionToken(), new a(), dVar);
            this.d = bundle;
            q(3);
        }

        public void a() {
            this.e = true;
            this.a.release();
        }

        public boolean b() {
            return this.a.isActive();
        }

        public String c() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.a, new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }

        public void d(PendingIntent pendingIntent) {
            this.a.setSessionActivity(pendingIntent);
        }

        public void e(c cVar, Handler handler) {
            this.a.setCallback(cVar == null ? null : cVar.a, handler);
            if (cVar != null) {
                cVar.D(this, handler);
            }
        }

        public void f(int i2) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i2);
            this.a.setPlaybackToLocal(builder.build());
        }

        public void g(MediaMetadataCompat mediaMetadataCompat) {
            this.i = mediaMetadataCompat;
            this.a.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.g());
        }

        public PlaybackStateCompat h() {
            return this.g;
        }

        public Token i() {
            return this.b;
        }

        public void j(PendingIntent pendingIntent) {
            this.a.setMediaButtonReceiver(pendingIntent);
        }

        public Object k() {
            return null;
        }

        public void l(boolean z) {
            this.a.setActive(z);
        }

        public void m(androidx.media.c cVar) {
            synchronized (this.c) {
                this.n = cVar;
            }
        }

        public void n(PlaybackStateCompat playbackStateCompat) {
            this.g = playbackStateCompat;
            for (int beginBroadcast = this.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f.getBroadcastItem(beginBroadcast).j3(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f.finishBroadcast();
            this.a.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.e());
        }

        public void o(androidx.media.g gVar) {
            this.a.setPlaybackToRemote((VolumeProvider) gVar.d());
        }

        public androidx.media.c p() {
            androidx.media.c cVar;
            synchronized (this.c) {
                cVar = this.n;
            }
            return cVar;
        }

        @SuppressLint({"WrongConstant"})
        public void q(int i2) {
            this.a.setFlags(i2 | 1 | 2);
        }
    }

    static class h extends g {
        h(Context context, String str, androidx.versionedparcelable.d dVar, Bundle bundle) {
            super(context, str, dVar, bundle);
        }

        public void m(androidx.media.c cVar) {
        }

        public final androidx.media.c p() {
            return new androidx.media.c(this.a.getCurrentControllerInfo());
        }
    }

    static class i implements d {
        int A;
        Bundle B;
        int C;
        int D;
        androidx.media.g E;
        private g.b F = new a();
        private final Context a;
        private final ComponentName b;
        private final PendingIntent c;
        private final c d;
        private final Token e;
        final String f;
        final Bundle g;
        final String h;
        final AudioManager i;
        final RemoteControlClient j;
        final Object k = new Object();
        final RemoteCallbackList<a> l = new RemoteCallbackList<>();
        private d m;
        boolean n = false;
        boolean o = false;
        volatile c p;
        private androidx.media.c q;
        int r = 3;
        MediaMetadataCompat s;
        PlaybackStateCompat t;
        PendingIntent u;
        List<QueueItem> v;
        CharSequence w;
        int x;
        boolean y;
        int z;

        class a extends g.b {
            a() {
            }

            public void a(androidx.media.g gVar) {
                if (i.this.E == gVar) {
                    i iVar = i.this;
                    i.this.A(new ParcelableVolumeInfo(iVar.C, iVar.D, gVar.c(), gVar.b(), gVar.a()));
                }
            }
        }

        private static final class b {
            public final String a;
            public final Bundle b;
            public final ResultReceiver c;

            public b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.a = str;
                this.b = bundle;
                this.c = resultReceiver;
            }
        }

        class c extends b.a {
            c() {
            }

            public boolean A1(KeyEvent keyEvent) {
                s3(21, keyEvent);
                return true;
            }

            public void D() {
                q3(7);
            }

            public void E(int i) {
                r3(23, i);
            }

            public int G() {
                return i.this.z;
            }

            public Bundle H() {
                Bundle bundle;
                synchronized (i.this.k) {
                    bundle = i.this.B;
                }
                return bundle;
            }

            public long I2() {
                long j;
                synchronized (i.this.k) {
                    j = (long) i.this.r;
                }
                return j;
            }

            public void L1(int i, int i2, String str) {
                i.this.q(i, i2);
            }

            public CharSequence M0() {
                return i.this.w;
            }

            public void M1(RatingCompat ratingCompat, Bundle bundle) {
                u3(31, ratingCompat, bundle);
            }

            public void M2(long j) {
                s3(11, Long.valueOf(j));
            }

            public void N2(boolean z) {
            }

            public void O(String str, Bundle bundle) {
                u3(20, str, bundle);
            }

            public ParcelableVolumeInfo O2() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (i.this.k) {
                    i = i.this.C;
                    i2 = i.this.D;
                    androidx.media.g gVar = i.this.E;
                    if (i == 2) {
                        int c = gVar.c();
                        int b = gVar.b();
                        i3 = gVar.a();
                        i4 = b;
                        i5 = c;
                    } else {
                        i4 = i.this.i.getStreamMaxVolume(i2);
                        i3 = i.this.i.getStreamVolume(i2);
                        i5 = 2;
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i5, i4, i3);
            }

            public void P1(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                t3(26, mediaDescriptionCompat, i);
            }

            public void R0(String str, Bundle bundle) {
                u3(4, str, bundle);
            }

            public void S(a aVar) {
                if (i.this.n) {
                    try {
                        aVar.O1();
                    } catch (Exception unused) {
                    }
                } else {
                    i.this.l.register(aVar, new androidx.media.c(i.this.s(Binder.getCallingUid()), Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            public Bundle S0() {
                if (i.this.g == null) {
                    return null;
                }
                return new Bundle(i.this.g);
            }

            public void T0(a aVar) {
                i.this.l.unregister(aVar);
            }

            public void T1(boolean z) {
                s3(29, Boolean.valueOf(z));
            }

            public void V2(int i) {
                r3(30, i);
            }

            public boolean W() {
                return false;
            }

            public void X(RatingCompat ratingCompat) {
                s3(19, ratingCompat);
            }

            public void a0(int i, int i2, String str) {
                i.this.C(i, i2);
            }

            public void b0(Uri uri, Bundle bundle) {
                u3(6, uri, bundle);
            }

            public void b1(String str, Bundle bundle) {
                u3(8, str, bundle);
            }

            public void c1(String str, Bundle bundle) {
                u3(9, str, bundle);
            }

            public int d2() {
                return i.this.A;
            }

            public void e1() {
                q3(16);
            }

            public String e3() {
                return i.this.f;
            }

            public void f1(Uri uri, Bundle bundle) {
                u3(10, uri, bundle);
            }

            public PlaybackStateCompat h() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (i.this.k) {
                    playbackStateCompat = i.this.t;
                    mediaMetadataCompat = i.this.s;
                }
                return MediaSessionCompat.f(playbackStateCompat, mediaMetadataCompat);
            }

            public void h2(int i) {
                r3(28, i);
            }

            public void i0(MediaDescriptionCompat mediaDescriptionCompat) {
                s3(27, mediaDescriptionCompat);
            }

            public void i1(long j) {
                s3(18, Long.valueOf(j));
            }

            public boolean i2() {
                return i.this.y;
            }

            public boolean l0() {
                return true;
            }

            public void m0(MediaDescriptionCompat mediaDescriptionCompat) {
                s3(25, mediaDescriptionCompat);
            }

            public void n() {
                q3(12);
            }

            public void next() {
                q3(14);
            }

            public String o() {
                return i.this.h;
            }

            public void previous() {
                q3(15);
            }

            /* access modifiers changed from: package-private */
            public void q3(int i) {
                i.this.v(i, 0, 0, (Object) null, (Bundle) null);
            }

            public PendingIntent r0() {
                PendingIntent pendingIntent;
                synchronized (i.this.k) {
                    pendingIntent = i.this.u;
                }
                return pendingIntent;
            }

            /* access modifiers changed from: package-private */
            public void r3(int i, int i2) {
                i.this.v(i, i2, 0, (Object) null, (Bundle) null);
            }

            /* access modifiers changed from: package-private */
            public void s3(int i, Object obj) {
                i.this.v(i, 0, 0, obj, (Bundle) null);
            }

            public void stop() {
                q3(13);
            }

            public void t() {
                q3(3);
            }

            public void t2(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                s3(1, new b(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.e));
            }

            /* access modifiers changed from: package-private */
            public void t3(int i, Object obj, int i2) {
                i.this.v(i, i2, 0, obj, (Bundle) null);
            }

            public void u1(float f) {
                s3(32, Float.valueOf(f));
            }

            public List<QueueItem> u2() {
                List<QueueItem> list;
                synchronized (i.this.k) {
                    list = i.this.v;
                }
                return list;
            }

            /* access modifiers changed from: package-private */
            public void u3(int i, Object obj, Bundle bundle) {
                i.this.v(i, 0, 0, obj, bundle);
            }

            public MediaMetadataCompat v() {
                return i.this.s;
            }

            public int w0() {
                return i.this.x;
            }

            public void x2() {
                q3(17);
            }

            public void z0(String str, Bundle bundle) {
                u3(5, str, bundle);
            }
        }

        class d extends Handler {
            public d(Looper looper) {
                super(looper);
            }

            private void a(KeyEvent keyEvent, c cVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = i.this.t;
                    long b = playbackStateCompat == null ? 0 : playbackStateCompat.b();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 126) {
                        if (keyCode != 127) {
                            switch (keyCode) {
                                case 86:
                                    if ((b & 1) != 0) {
                                        cVar.C();
                                        return;
                                    }
                                    return;
                                case 87:
                                    if ((b & 32) != 0) {
                                        cVar.z();
                                        return;
                                    }
                                    return;
                                case 88:
                                    if ((b & 16) != 0) {
                                        cVar.A();
                                        return;
                                    }
                                    return;
                                case 89:
                                    if ((b & 8) != 0) {
                                        cVar.r();
                                        return;
                                    }
                                    return;
                                case 90:
                                    if ((b & 64) != 0) {
                                        cVar.f();
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if ((b & 2) != 0) {
                            cVar.h();
                        }
                    } else if ((b & 4) != 0) {
                        cVar.i();
                    }
                }
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void handleMessage(android.os.Message r8) {
                /*
                    r7 = this;
                    android.support.v4.media.session.MediaSessionCompat$i r0 = android.support.v4.media.session.MediaSessionCompat.i.this
                    android.support.v4.media.session.MediaSessionCompat$c r0 = r0.p
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.os.Bundle r1 = r8.getData()
                    android.support.v4.media.session.MediaSessionCompat.b(r1)
                    android.support.v4.media.session.MediaSessionCompat$i r2 = android.support.v4.media.session.MediaSessionCompat.i.this
                    androidx.media.c r3 = new androidx.media.c
                    java.lang.String r4 = "data_calling_pkg"
                    java.lang.String r4 = r1.getString(r4)
                    java.lang.String r5 = "data_calling_pid"
                    int r5 = r1.getInt(r5)
                    java.lang.String r6 = "data_calling_uid"
                    int r6 = r1.getInt(r6)
                    r3.<init>(r4, r5, r6)
                    r2.m(r3)
                    java.lang.String r2 = "data_extras"
                    android.os.Bundle r1 = r1.getBundle(r2)
                    android.support.v4.media.session.MediaSessionCompat.b(r1)
                    r2 = 0
                    int r3 = r8.what     // Catch:{ all -> 0x0172 }
                    r4 = 0
                    switch(r3) {
                        case 1: goto L_0x015f;
                        case 2: goto L_0x0157;
                        case 3: goto L_0x0153;
                        case 4: goto L_0x014b;
                        case 5: goto L_0x0143;
                        case 6: goto L_0x013b;
                        case 7: goto L_0x0137;
                        case 8: goto L_0x012f;
                        case 9: goto L_0x0127;
                        case 10: goto L_0x011f;
                        case 11: goto L_0x0113;
                        case 12: goto L_0x010f;
                        case 13: goto L_0x010b;
                        case 14: goto L_0x0107;
                        case 15: goto L_0x0102;
                        case 16: goto L_0x00fd;
                        case 17: goto L_0x00f8;
                        case 18: goto L_0x00eb;
                        case 19: goto L_0x00e2;
                        case 20: goto L_0x00d9;
                        case 21: goto L_0x00be;
                        case 22: goto L_0x00b5;
                        case 23: goto L_0x00ae;
                        case 24: goto L_0x003a;
                        case 25: goto L_0x00a5;
                        case 26: goto L_0x009a;
                        case 27: goto L_0x0095;
                        case 28: goto L_0x0066;
                        case 29: goto L_0x0059;
                        case 30: goto L_0x0052;
                        case 31: goto L_0x0049;
                        case 32: goto L_0x003c;
                        default: goto L_0x003a;
                    }     // Catch:{ all -> 0x0172 }
                L_0x003a:
                    goto L_0x016c
                L_0x003c:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    java.lang.Float r8 = (java.lang.Float) r8     // Catch:{ all -> 0x0172 }
                    float r8 = r8.floatValue()     // Catch:{ all -> 0x0172 }
                    r0.u(r8)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0049:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    android.support.v4.media.RatingCompat r8 = (android.support.v4.media.RatingCompat) r8     // Catch:{ all -> 0x0172 }
                    r0.w(r8, r1)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0052:
                    int r8 = r8.arg1     // Catch:{ all -> 0x0172 }
                    r0.y(r8)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0059:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0172 }
                    boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0172 }
                    r0.t(r8)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0066:
                    android.support.v4.media.session.MediaSessionCompat$i r1 = android.support.v4.media.session.MediaSessionCompat.i.this     // Catch:{ all -> 0x0172 }
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r1 = r1.v     // Catch:{ all -> 0x0172 }
                    if (r1 == 0) goto L_0x016c
                    int r1 = r8.arg1     // Catch:{ all -> 0x0172 }
                    if (r1 < 0) goto L_0x0089
                    int r1 = r8.arg1     // Catch:{ all -> 0x0172 }
                    android.support.v4.media.session.MediaSessionCompat$i r3 = android.support.v4.media.session.MediaSessionCompat.i.this     // Catch:{ all -> 0x0172 }
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r3 = r3.v     // Catch:{ all -> 0x0172 }
                    int r3 = r3.size()     // Catch:{ all -> 0x0172 }
                    if (r1 >= r3) goto L_0x0089
                    android.support.v4.media.session.MediaSessionCompat$i r1 = android.support.v4.media.session.MediaSessionCompat.i.this     // Catch:{ all -> 0x0172 }
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r1 = r1.v     // Catch:{ all -> 0x0172 }
                    int r8 = r8.arg1     // Catch:{ all -> 0x0172 }
                    java.lang.Object r8 = r1.get(r8)     // Catch:{ all -> 0x0172 }
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r8 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r8     // Catch:{ all -> 0x0172 }
                    goto L_0x008a
                L_0x0089:
                    r8 = r2
                L_0x008a:
                    if (r8 == 0) goto L_0x016c
                    android.support.v4.media.MediaDescriptionCompat r8 = r8.c()     // Catch:{ all -> 0x0172 }
                L_0x0090:
                    r0.q(r8)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0095:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.v4.media.MediaDescriptionCompat) r8     // Catch:{ all -> 0x0172 }
                    goto L_0x0090
                L_0x009a:
                    java.lang.Object r1 = r8.obj     // Catch:{ all -> 0x0172 }
                    android.support.v4.media.MediaDescriptionCompat r1 = (android.support.v4.media.MediaDescriptionCompat) r1     // Catch:{ all -> 0x0172 }
                    int r8 = r8.arg1     // Catch:{ all -> 0x0172 }
                    r0.c(r1, r8)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x00a5:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.v4.media.MediaDescriptionCompat) r8     // Catch:{ all -> 0x0172 }
                    r0.b(r8)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x00ae:
                    int r8 = r8.arg1     // Catch:{ all -> 0x0172 }
                    r0.x(r8)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x00b5:
                    android.support.v4.media.session.MediaSessionCompat$i r0 = android.support.v4.media.session.MediaSessionCompat.i.this     // Catch:{ all -> 0x0172 }
                    int r8 = r8.arg1     // Catch:{ all -> 0x0172 }
                    r0.C(r8, r4)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x00be:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    android.view.KeyEvent r8 = (android.view.KeyEvent) r8     // Catch:{ all -> 0x0172 }
                    android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0172 }
                    java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
                    r1.<init>(r3)     // Catch:{ all -> 0x0172 }
                    java.lang.String r3 = "android.intent.extra.KEY_EVENT"
                    r1.putExtra(r3, r8)     // Catch:{ all -> 0x0172 }
                    boolean r1 = r0.g(r1)     // Catch:{ all -> 0x0172 }
                    if (r1 != 0) goto L_0x016c
                    r7.a(r8, r0)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x00d9:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0172 }
                    r0.e(r8, r1)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x00e2:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    android.support.v4.media.RatingCompat r8 = (android.support.v4.media.RatingCompat) r8     // Catch:{ all -> 0x0172 }
                    r0.v(r8)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x00eb:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0172 }
                    long r3 = r8.longValue()     // Catch:{ all -> 0x0172 }
                    r0.s(r3)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x00f8:
                    r0.r()     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x00fd:
                    r0.f()     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0102:
                    r0.A()     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0107:
                    r0.z()     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x010b:
                    r0.C()     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x010f:
                    r0.h()     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0113:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0172 }
                    long r3 = r8.longValue()     // Catch:{ all -> 0x0172 }
                    r0.B(r3)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x011f:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    android.net.Uri r8 = (android.net.Uri) r8     // Catch:{ all -> 0x0172 }
                    r0.l(r8, r1)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0127:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0172 }
                    r0.k(r8, r1)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x012f:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0172 }
                    r0.j(r8, r1)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0137:
                    r0.i()     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x013b:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    android.net.Uri r8 = (android.net.Uri) r8     // Catch:{ all -> 0x0172 }
                    r0.p(r8, r1)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0143:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0172 }
                    r0.o(r8, r1)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x014b:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0172 }
                    r0.n(r8, r1)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0153:
                    r0.m()     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x0157:
                    android.support.v4.media.session.MediaSessionCompat$i r0 = android.support.v4.media.session.MediaSessionCompat.i.this     // Catch:{ all -> 0x0172 }
                    int r8 = r8.arg1     // Catch:{ all -> 0x0172 }
                    r0.q(r8, r4)     // Catch:{ all -> 0x0172 }
                    goto L_0x016c
                L_0x015f:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x0172 }
                    android.support.v4.media.session.MediaSessionCompat$i$b r8 = (android.support.v4.media.session.MediaSessionCompat.i.b) r8     // Catch:{ all -> 0x0172 }
                    java.lang.String r1 = r8.a     // Catch:{ all -> 0x0172 }
                    android.os.Bundle r3 = r8.b     // Catch:{ all -> 0x0172 }
                    android.os.ResultReceiver r8 = r8.c     // Catch:{ all -> 0x0172 }
                    r0.d(r1, r3, r8)     // Catch:{ all -> 0x0172 }
                L_0x016c:
                    android.support.v4.media.session.MediaSessionCompat$i r8 = android.support.v4.media.session.MediaSessionCompat.i.this
                    r8.m(r2)
                    return
                L_0x0172:
                    r8 = move-exception
                    android.support.v4.media.session.MediaSessionCompat$i r0 = android.support.v4.media.session.MediaSessionCompat.i.this
                    r0.m(r2)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.i.d.handleMessage(android.os.Message):void");
            }
        }

        public i(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            if (componentName != null) {
                this.a = context;
                this.f = context.getPackageName();
                this.g = bundle;
                this.i = (AudioManager) context.getSystemService("audio");
                this.h = str;
                this.b = componentName;
                this.c = pendingIntent;
                this.d = new c();
                this.e = new Token(this.d);
                this.x = 0;
                this.C = 1;
                this.D = 3;
                this.j = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        private void x(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).Q1(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        private void y() {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).O1();
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
            this.l.kill();
        }

        private void z(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).j3(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        /* access modifiers changed from: package-private */
        public void A(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).o3(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        /* access modifiers changed from: package-private */
        public void B(PlaybackStateCompat playbackStateCompat) {
            this.j.setPlaybackState(t(playbackStateCompat.g()));
        }

        /* access modifiers changed from: package-private */
        public void C(int i2, int i3) {
            if (this.C == 2) {
                androidx.media.g gVar = this.E;
                if (gVar != null) {
                    gVar.f(i2);
                    return;
                }
                return;
            }
            this.i.setStreamVolume(this.D, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public void D(PendingIntent pendingIntent, ComponentName componentName) {
            this.i.unregisterMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        public void E() {
            if (this.o) {
                w(this.c, this.b);
                this.i.registerRemoteControlClient(this.j);
                g(this.s);
                n(this.t);
                return;
            }
            D(this.c, this.b);
            this.j.setPlaybackState(0);
            this.i.unregisterRemoteControlClient(this.j);
        }

        public void a() {
            this.o = false;
            this.n = true;
            E();
            y();
        }

        public boolean b() {
            return this.o;
        }

        public String c() {
            return null;
        }

        public void d(PendingIntent pendingIntent) {
            synchronized (this.k) {
                this.u = pendingIntent;
            }
        }

        public void e(c cVar, Handler handler) {
            this.p = cVar;
            if (cVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.k) {
                    if (this.m != null) {
                        this.m.removeCallbacksAndMessages((Object) null);
                    }
                    this.m = new d(handler.getLooper());
                    this.p.D(this, handler);
                }
            }
        }

        public void f(int i2) {
            androidx.media.g gVar = this.E;
            if (gVar != null) {
                gVar.g((g.b) null);
            }
            this.D = i2;
            this.C = 1;
            int i3 = this.C;
            int i4 = this.D;
            A(new ParcelableVolumeInfo(i3, i4, 2, this.i.getStreamMaxVolume(i4), this.i.getStreamVolume(this.D)));
        }

        public void g(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.b(mediaMetadataCompat, MediaSessionCompat.d).a();
            }
            synchronized (this.k) {
                this.s = mediaMetadataCompat;
            }
            x(mediaMetadataCompat);
            if (this.o) {
                r(mediaMetadataCompat == null ? null : mediaMetadataCompat.d()).apply();
            }
        }

        public PlaybackStateCompat h() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.k) {
                playbackStateCompat = this.t;
            }
            return playbackStateCompat;
        }

        public Token i() {
            return this.e;
        }

        public void j(PendingIntent pendingIntent) {
        }

        public Object k() {
            return null;
        }

        public void l(boolean z2) {
            if (z2 != this.o) {
                this.o = z2;
                E();
            }
        }

        public void m(androidx.media.c cVar) {
            synchronized (this.k) {
                this.q = cVar;
            }
        }

        public void n(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.k) {
                this.t = playbackStateCompat;
            }
            z(playbackStateCompat);
            if (this.o) {
                if (playbackStateCompat == null) {
                    this.j.setPlaybackState(0);
                    this.j.setTransportControlFlags(0);
                    return;
                }
                B(playbackStateCompat);
                this.j.setTransportControlFlags(u(playbackStateCompat.b()));
            }
        }

        public void o(androidx.media.g gVar) {
            if (gVar != null) {
                androidx.media.g gVar2 = this.E;
                if (gVar2 != null) {
                    gVar2.g((g.b) null);
                }
                this.C = 2;
                this.E = gVar;
                A(new ParcelableVolumeInfo(this.C, this.D, this.E.c(), this.E.b(), this.E.a()));
                gVar.g(this.F);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        public androidx.media.c p() {
            androidx.media.c cVar;
            synchronized (this.k) {
                cVar = this.q;
            }
            return cVar;
        }

        /* access modifiers changed from: package-private */
        public void q(int i2, int i3) {
            if (this.C == 2) {
                androidx.media.g gVar = this.E;
                if (gVar != null) {
                    gVar.e(i2);
                    return;
                }
                return;
            }
            this.i.adjustStreamVolume(this.D, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            if (r2 != null) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
            if (r2 != null) goto L_0x001d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.media.RemoteControlClient.MetadataEditor r(android.os.Bundle r7) {
            /*
                r6 = this;
                android.media.RemoteControlClient r0 = r6.j
                r1 = 1
                android.media.RemoteControlClient$MetadataEditor r0 = r0.editMetadata(r1)
                if (r7 != 0) goto L_0x000a
                return r0
            L_0x000a:
                java.lang.String r2 = "android.media.metadata.ART"
                boolean r3 = r7.containsKey(r2)
                r4 = 100
                r5 = 0
                if (r3 == 0) goto L_0x0029
                android.os.Parcelable r2 = r7.getParcelable(r2)
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                if (r2 == 0) goto L_0x0025
            L_0x001d:
                android.graphics.Bitmap$Config r3 = r2.getConfig()
                android.graphics.Bitmap r2 = r2.copy(r3, r5)
            L_0x0025:
                r0.putBitmap(r4, r2)
                goto L_0x003a
            L_0x0029:
                java.lang.String r2 = "android.media.metadata.ALBUM_ART"
                boolean r3 = r7.containsKey(r2)
                if (r3 == 0) goto L_0x003a
                android.os.Parcelable r2 = r7.getParcelable(r2)
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                if (r2 == 0) goto L_0x0025
                goto L_0x001d
            L_0x003a:
                java.lang.String r2 = "android.media.metadata.ALBUM"
                boolean r3 = r7.containsKey(r2)
                if (r3 == 0) goto L_0x0049
                java.lang.String r2 = r7.getString(r2)
                r0.putString(r1, r2)
            L_0x0049:
                java.lang.String r1 = "android.media.metadata.ALBUM_ARTIST"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x005a
                r2 = 13
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x005a:
                java.lang.String r1 = "android.media.metadata.ARTIST"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x006a
                r2 = 2
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x006a:
                java.lang.String r1 = "android.media.metadata.AUTHOR"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x007a
                r2 = 3
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x007a:
                java.lang.String r1 = "android.media.metadata.COMPILATION"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x008b
                r2 = 15
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x008b:
                java.lang.String r1 = "android.media.metadata.COMPOSER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x009b
                r2 = 4
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x009b:
                java.lang.String r1 = "android.media.metadata.DATE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00ab
                r2 = 5
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x00ab:
                java.lang.String r1 = "android.media.metadata.DISC_NUMBER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00bc
                r2 = 14
                long r3 = r7.getLong(r1)
                r0.putLong(r2, r3)
            L_0x00bc:
                java.lang.String r1 = "android.media.metadata.DURATION"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00cd
                r2 = 9
                long r3 = r7.getLong(r1)
                r0.putLong(r2, r3)
            L_0x00cd:
                java.lang.String r1 = "android.media.metadata.GENRE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00dd
                r2 = 6
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x00dd:
                java.lang.String r1 = "android.media.metadata.TITLE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00ed
                r2 = 7
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x00ed:
                java.lang.String r1 = "android.media.metadata.TRACK_NUMBER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00fc
                long r1 = r7.getLong(r1)
                r0.putLong(r5, r1)
            L_0x00fc:
                java.lang.String r1 = "android.media.metadata.WRITER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x010d
                r2 = 11
                java.lang.String r7 = r7.getString(r1)
                r0.putString(r2, r7)
            L_0x010d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.i.r(android.os.Bundle):android.media.RemoteControlClient$MetadataEditor");
        }

        /* access modifiers changed from: package-private */
        public String s(int i2) {
            String nameForUid = this.a.getPackageManager().getNameForUid(i2);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        /* access modifiers changed from: package-private */
        public int t(int i2) {
            switch (i2) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* access modifiers changed from: package-private */
        public int u(long j2) {
            int i2 = (1 & j2) != 0 ? 32 : 0;
            if ((2 & j2) != 0) {
                i2 |= 16;
            }
            if ((4 & j2) != 0) {
                i2 |= 4;
            }
            if ((8 & j2) != 0) {
                i2 |= 2;
            }
            if ((16 & j2) != 0) {
                i2 |= 1;
            }
            if ((32 & j2) != 0) {
                i2 |= 128;
            }
            if ((64 & j2) != 0) {
                i2 |= 64;
            }
            return (j2 & 512) != 0 ? i2 | 8 : i2;
        }

        /* access modifiers changed from: package-private */
        public void v(int i2, int i3, int i4, Object obj, Bundle bundle) {
            synchronized (this.k) {
                if (this.m != null) {
                    Message obtainMessage = this.m.obtainMessage(i2, i3, i4, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString("data_calling_pkg", s(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void w(PendingIntent pendingIntent, ComponentName componentName) {
            this.i.registerMediaButtonEventReceiver(componentName);
        }
    }

    public interface j {
        void a();
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, (androidx.versionedparcelable.d) null);
    }

    /* JADX WARNING: type inference failed for: r9v6, types: [android.support.v4.media.session.MediaSessionCompat$d] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.support.v4.media.session.MediaSessionCompat$i] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.support.v4.media.session.MediaSessionCompat$e] */
    /* JADX WARNING: type inference failed for: r0v7, types: [android.support.v4.media.session.MediaSessionCompat$f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaSessionCompat(android.content.Context r7, java.lang.String r8, android.content.ComponentName r9, android.app.PendingIntent r10, android.os.Bundle r11, androidx.versionedparcelable.d r12) {
        /*
            r6 = this;
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.c = r0
            if (r7 == 0) goto L_0x00aa
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00a2
            if (r9 != 0) goto L_0x0018
            android.content.ComponentName r9 = androidx.media.session.MediaButtonReceiver.a(r7)
        L_0x0018:
            r3 = r9
            if (r3 == 0) goto L_0x002c
            if (r10 != 0) goto L_0x002c
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r10 = "android.intent.action.MEDIA_BUTTON"
            r9.<init>(r10)
            r9.setComponent(r3)
            r10 = 0
            android.app.PendingIntent r10 = android.app.PendingIntent.getBroadcast(r7, r10, r9, r10)
        L_0x002c:
            r4 = r10
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 < r10) goto L_0x0048
            android.support.v4.media.session.MediaSessionCompat$h r9 = new android.support.v4.media.session.MediaSessionCompat$h
            r9.<init>(r7, r8, r12, r11)
            r6.a = r9
            android.support.v4.media.session.MediaSessionCompat$a r8 = new android.support.v4.media.session.MediaSessionCompat$a
            r8.<init>(r6)
        L_0x003f:
            r6.k(r8)
            android.support.v4.media.session.MediaSessionCompat$d r8 = r6.a
            r8.j(r4)
            goto L_0x0081
        L_0x0048:
            r10 = 21
            if (r9 < r10) goto L_0x0059
            android.support.v4.media.session.MediaSessionCompat$g r9 = new android.support.v4.media.session.MediaSessionCompat$g
            r9.<init>(r7, r8, r12, r11)
            r6.a = r9
            android.support.v4.media.session.MediaSessionCompat$b r8 = new android.support.v4.media.session.MediaSessionCompat$b
            r8.<init>(r6)
            goto L_0x003f
        L_0x0059:
            r10 = 19
            if (r9 < r10) goto L_0x0069
            android.support.v4.media.session.MediaSessionCompat$f r9 = new android.support.v4.media.session.MediaSessionCompat$f
            r0 = r9
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0066:
            r6.a = r9
            goto L_0x0081
        L_0x0069:
            r10 = 18
            if (r9 < r10) goto L_0x0077
            android.support.v4.media.session.MediaSessionCompat$e r9 = new android.support.v4.media.session.MediaSessionCompat$e
            r0 = r9
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0066
        L_0x0077:
            android.support.v4.media.session.MediaSessionCompat$i r9 = new android.support.v4.media.session.MediaSessionCompat$i
            r0 = r9
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0066
        L_0x0081:
            android.support.v4.media.session.MediaControllerCompat r8 = new android.support.v4.media.session.MediaControllerCompat
            r8.<init>((android.content.Context) r7, (android.support.v4.media.session.MediaSessionCompat) r6)
            r6.b = r8
            int r8 = d
            if (r8 != 0) goto L_0x00a1
            r8 = 1
            r9 = 1134559232(0x43a00000, float:320.0)
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = android.util.TypedValue.applyDimension(r8, r9, r7)
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r8
            int r7 = (int) r7
            d = r7
        L_0x00a1:
            return
        L_0x00a2:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "tag must not be null or empty"
            r7.<init>(r8)
            throw r7
        L_0x00aa:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "context must not be null"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.<init>(android.content.Context, java.lang.String, android.content.ComponentName, android.app.PendingIntent, android.os.Bundle, androidx.versionedparcelable.d):void");
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat f(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j2 = -1;
        if (playbackStateCompat.f() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.g() != 3 && playbackStateCompat.g() != 4 && playbackStateCompat.g() != 5) {
            return playbackStateCompat;
        }
        long c2 = playbackStateCompat.c();
        if (c2 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long d2 = ((long) (playbackStateCompat.d() * ((float) (elapsedRealtime - c2)))) + playbackStateCompat.f();
        if (mediaMetadataCompat != null && mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            j2 = mediaMetadataCompat.f("android.media.metadata.DURATION");
        }
        long j3 = (j2 < 0 || d2 <= j2) ? d2 < 0 ? 0 : d2 : j2;
        PlaybackStateCompat.b bVar = new PlaybackStateCompat.b(playbackStateCompat);
        bVar.d(playbackStateCompat.g(), j3, playbackStateCompat.d(), elapsedRealtime);
        return bVar.a();
    }

    public void a(j jVar) {
        if (jVar != null) {
            this.c.add(jVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public MediaControllerCompat c() {
        return this.b;
    }

    public Object d() {
        return this.a.k();
    }

    public Token e() {
        return this.a.i();
    }

    public boolean g() {
        return this.a.b();
    }

    public void h() {
        this.a.a();
    }

    public void i(j jVar) {
        if (jVar != null) {
            this.c.remove(jVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public void j(boolean z) {
        this.a.l(z);
        Iterator<j> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void k(c cVar) {
        l(cVar, (Handler) null);
    }

    public void l(c cVar, Handler handler) {
        if (cVar == null) {
            this.a.e((c) null, (Handler) null);
            return;
        }
        d dVar = this.a;
        if (handler == null) {
            handler = new Handler();
        }
        dVar.e(cVar, handler);
    }

    public void m(MediaMetadataCompat mediaMetadataCompat) {
        this.a.g(mediaMetadataCompat);
    }

    public void n(PlaybackStateCompat playbackStateCompat) {
        this.a.n(playbackStateCompat);
    }

    public void o(int i2) {
        this.a.f(i2);
    }

    public void p(androidx.media.g gVar) {
        if (gVar != null) {
            this.a.o(gVar);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void q(PendingIntent pendingIntent) {
        this.a.d(pendingIntent);
    }
}
