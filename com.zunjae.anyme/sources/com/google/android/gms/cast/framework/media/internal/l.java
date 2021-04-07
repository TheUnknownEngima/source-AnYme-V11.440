package com.google.android.gms.cast.framework.media.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.R$string;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.b;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.cast.o;
import com.google.android.gms.cast.q;
import com.google.android.gms.common.util.m;

public final class l implements i.b {
    private static final u60 n = new u60("MediaSessionManager");
    private final Context a;
    private final b b;
    private final aa0 c;
    private final ComponentName d;
    private final b e;
    private final b f;
    private final Handler g;
    private final Runnable h;
    /* access modifiers changed from: private */
    public i i;
    private CastDevice j;
    private MediaSessionCompat k;
    private MediaSessionCompat.c l;
    private boolean m;

    public l(Context context, b bVar, aa0 aa0) {
        this.a = context;
        this.b = bVar;
        this.c = aa0;
        this.d = (bVar.i() == null || TextUtils.isEmpty(this.b.i().i())) ? null : new ComponentName(this.a, this.b.i().i());
        b bVar2 = new b(this.a);
        this.e = bVar2;
        bVar2.d(new n(this));
        b bVar3 = new b(this.a);
        this.f = bVar3;
        bVar3.d(new m(this));
        this.g = new mb0(Looper.getMainLooper());
        this.h = new k(this);
    }

    private final void h(int i2, MediaInfo mediaInfo) {
        PendingIntent pendingIntent;
        MediaSessionCompat mediaSessionCompat = this.k;
        if (mediaSessionCompat != null) {
            long j2 = 0;
            if (i2 == 0) {
                PlaybackStateCompat.b bVar = new PlaybackStateCompat.b();
                bVar.c(0, 0, 1.0f);
                mediaSessionCompat.n(bVar.a());
                this.k.m(new MediaMetadataCompat.b().a());
                return;
            }
            long j3 = 512;
            if (!this.i.q()) {
                j3 = 768;
            }
            long Q = this.i.q() ? 0 : this.i.k().Q();
            MediaSessionCompat mediaSessionCompat2 = this.k;
            PlaybackStateCompat.b bVar2 = new PlaybackStateCompat.b();
            bVar2.c(i2, Q, 1.0f);
            bVar2.b(j3);
            mediaSessionCompat2.n(bVar2.a());
            MediaSessionCompat mediaSessionCompat3 = this.k;
            if (this.d == null) {
                pendingIntent = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(this.d);
                pendingIntent = PendingIntent.getActivity(this.a, 0, intent, 134217728);
            }
            mediaSessionCompat3.q(pendingIntent);
            if (this.k != null) {
                com.google.android.gms.cast.l p = mediaInfo.p();
                if (!this.i.q()) {
                    j2 = mediaInfo.y();
                }
                MediaMetadataCompat.b n2 = n();
                n2.d("android.media.metadata.TITLE", p.m("com.google.android.gms.cast.metadata.TITLE"));
                n2.d("android.media.metadata.DISPLAY_TITLE", p.m("com.google.android.gms.cast.metadata.TITLE"));
                n2.d("android.media.metadata.DISPLAY_SUBTITLE", p.m("com.google.android.gms.cast.metadata.SUBTITLE"));
                n2.c("android.media.metadata.DURATION", j2);
                this.k.m(n2.a());
                Uri m2 = m(p, 0);
                if (m2 != null) {
                    this.e.e(m2);
                } else {
                    i((Bitmap) null, 0);
                }
                Uri m3 = m(p, 3);
                if (m3 != null) {
                    this.f.e(m3);
                } else {
                    i((Bitmap) null, 3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void i(Bitmap bitmap, int i2) {
        MediaSessionCompat mediaSessionCompat = this.k;
        if (mediaSessionCompat != null) {
            if (i2 == 0) {
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    bitmap.eraseColor(0);
                    mediaSessionCompat = this.k;
                }
                MediaMetadataCompat.b n2 = n();
                n2.b("android.media.metadata.DISPLAY_ICON", bitmap);
                mediaSessionCompat.m(n2.a());
            } else if (i2 == 3) {
                MediaMetadataCompat.b n3 = n();
                n3.b("android.media.metadata.ALBUM_ART", bitmap);
                mediaSessionCompat.m(n3.a());
            }
        }
    }

    public static Bitmap l(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = (float) width;
        int i2 = (int) (((9.0f * f2) / 16.0f) + 0.5f);
        float f3 = (float) ((i2 - height) / 2);
        RectF rectF = new RectF(Utils.FLOAT_EPSILON, f3, f2, ((float) height) + f3);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i2, config);
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return createBitmap;
    }

    private final Uri m(com.google.android.gms.cast.l lVar, int i2) {
        k80 a2 = this.b.i().j() != null ? this.b.i().j().a(lVar, i2) : lVar.o() ? lVar.k().get(0) : null;
        if (a2 == null) {
            return null;
        }
        return a2.i();
    }

    private final MediaMetadataCompat.b n() {
        MediaSessionCompat mediaSessionCompat = this.k;
        MediaMetadataCompat b2 = mediaSessionCompat == null ? null : mediaSessionCompat.c().b();
        return b2 == null ? new MediaMetadataCompat.b() : new MediaMetadataCompat.b(b2);
    }

    private final void o() {
        if (this.b.i().m() != null) {
            n.a("Stopping notification service.", new Object[0]);
            if (Build.VERSION.SDK_INT >= 26) {
                MediaNotificationService.b();
                return;
            }
            Intent intent = new Intent(this.a, MediaNotificationService.class);
            intent.setPackage(this.a.getPackageName());
            intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
            this.a.stopService(intent);
        }
    }

    private final void p() {
        if (this.b.j()) {
            this.g.removeCallbacks(this.h);
            Intent intent = new Intent(this.a, ReconnectionService.class);
            intent.setPackage(this.a.getPackageName());
            this.a.stopService(intent);
        }
    }

    private final void s(boolean z) {
        if (this.b.j()) {
            this.g.removeCallbacks(this.h);
            Intent intent = new Intent(this.a, ReconnectionService.class);
            intent.setPackage(this.a.getPackageName());
            try {
                this.a.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.g.postDelayed(this.h, 1000);
                }
            }
        }
    }

    public final void a() {
        r(false);
    }

    public final void b() {
        r(false);
    }

    public final void c() {
        r(false);
    }

    public final void d() {
        r(false);
    }

    public final void e() {
        r(false);
    }

    public final void f() {
    }

    public final void j(i iVar, CastDevice castDevice) {
        b bVar;
        if (!this.m && (bVar = this.b) != null && bVar.i() != null && iVar != null && castDevice != null) {
            this.i = iVar;
            iVar.b(this);
            this.j = castDevice;
            if (!m.h()) {
                ((AudioManager) this.a.getSystemService("audio")).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 3);
            }
            ComponentName componentName = new ComponentName(this.a, this.b.i().k());
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.a, 0, intent, 0);
            if (this.b.i().l()) {
                this.k = new MediaSessionCompat(this.a, "CastMediaSession", componentName, broadcast);
                h(0, (MediaInfo) null);
                CastDevice castDevice2 = this.j;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.k())) {
                    MediaSessionCompat mediaSessionCompat = this.k;
                    MediaMetadataCompat.b bVar2 = new MediaMetadataCompat.b();
                    bVar2.d("android.media.metadata.ALBUM_ARTIST", this.a.getResources().getString(R$string.cast_casting_to_device, new Object[]{this.j.k()}));
                    mediaSessionCompat.m(bVar2.a());
                }
                p pVar = new p(this);
                this.l = pVar;
                this.k.k(pVar);
                this.k.j(true);
                this.c.q3(this.k);
            }
            this.m = true;
            r(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q() {
        s(false);
    }

    public final void r(boolean z) {
        boolean z2;
        boolean z3;
        o i2;
        i iVar = this.i;
        if (iVar != null) {
            MediaInfo j2 = iVar.j();
            int i3 = 6;
            if (!this.i.p()) {
                if (this.i.t()) {
                    i3 = 3;
                } else if (this.i.s()) {
                    i3 = 2;
                } else if (!this.i.r() || (i2 = this.i.i()) == null || i2.m() == null) {
                    i3 = 0;
                } else {
                    j2 = i2.m();
                }
            }
            if (j2 == null || j2.p() == null) {
                i3 = 0;
            }
            h(i3, j2);
            if (!this.i.o()) {
                o();
                p();
            } else if (i3 != 0) {
                if (this.j != null && MediaNotificationService.a(this.b)) {
                    Intent intent = new Intent(this.a, MediaNotificationService.class);
                    intent.putExtra("extra_media_notification_force_update", z);
                    intent.setPackage(this.a.getPackageName());
                    intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
                    intent.putExtra("extra_media_info", this.i.j());
                    intent.putExtra("extra_remote_media_client_player_state", this.i.m());
                    intent.putExtra("extra_cast_device", this.j);
                    MediaSessionCompat mediaSessionCompat = this.k;
                    if (mediaSessionCompat != null) {
                        intent.putExtra("extra_media_session_token", mediaSessionCompat == null ? null : mediaSessionCompat.e());
                    }
                    q k2 = this.i.k();
                    int N = k2.N();
                    if (N == 1 || N == 2 || N == 3) {
                        z2 = true;
                        z3 = true;
                    } else {
                        Integer n2 = k2.n(k2.l());
                        if (n2 != null) {
                            z3 = n2.intValue() > 0;
                            z2 = n2.intValue() < k2.M() - 1;
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                    }
                    intent.putExtra("extra_can_skip_next", z2);
                    intent.putExtra("extra_can_skip_prev", z3);
                    n.a("Starting notification service.", new Object[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        this.a.startForegroundService(intent);
                    } else {
                        this.a.startService(intent);
                    }
                }
                if (!this.i.r()) {
                    s(true);
                }
            }
        }
    }

    public final void t(int i2) {
        if (this.m) {
            this.m = false;
            i iVar = this.i;
            if (iVar != null) {
                iVar.D(this);
            }
            if (!m.h()) {
                ((AudioManager) this.a.getSystemService("audio")).abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
            }
            this.c.q3((MediaSessionCompat) null);
            b bVar = this.e;
            if (bVar != null) {
                bVar.b();
            }
            b bVar2 = this.f;
            if (bVar2 != null) {
                bVar2.b();
            }
            MediaSessionCompat mediaSessionCompat = this.k;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.q((PendingIntent) null);
                this.k.k((MediaSessionCompat.c) null);
                this.k.m(new MediaMetadataCompat.b().a());
                h(0, (MediaInfo) null);
                this.k.j(false);
                this.k.h();
                this.k = null;
            }
            this.i = null;
            this.j = null;
            this.l = null;
            o();
            if (i2 == 0) {
                p();
            }
        }
    }
}
