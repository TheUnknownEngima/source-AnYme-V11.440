package com.zunjae.anyme.features.vydia;

import android.app.PictureInPictureParams;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Rational;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.afollestad.materialdialogs.f;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.b0;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.o0;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.p;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import defpackage.c00;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class AbstractVydiaActivity extends AbstractActivity {
    protected a1 D;
    private final int E = 5000;
    private String F = com.zunjae.constants.b.d.a();
    private final d22 G = g22.b(new a(this, (oh2) null, (o52) null));
    private final d H = new d(this);
    private HashMap I;

    public static final class a extends w62 implements o52<o> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.zunjae.anyme.features.vydia.o, java.lang.Object] */
        public final o invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(o.class), this.g, this.h);
        }
    }

    static final class b implements Runnable {
        final /* synthetic */ AbstractVydiaActivity e;

        b(AbstractVydiaActivity abstractVydiaActivity) {
            this.e = abstractVydiaActivity;
        }

        public final void run() {
            AbstractVydiaActivity abstractVydiaActivity = this.e;
            Toolbar toolbar = (Toolbar) abstractVydiaActivity.l0(C0275R$id.toolbar);
            v62.d(toolbar, "toolbar");
            abstractVydiaActivity.j0(toolbar, this.e.b1(), this.e.X0(), true);
        }
    }

    static final class c implements f.i {
        final /* synthetic */ AbstractVydiaActivity a;
        final /* synthetic */ List b;

        c(AbstractVydiaActivity abstractVydiaActivity, List list) {
            this.a = abstractVydiaActivity;
            this.b = list;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, View view, int i, CharSequence charSequence) {
            this.a.v0(((Number) ((l22) this.b.get(i)).d()).floatValue());
        }
    }

    public static final class d implements r0.a {
        final /* synthetic */ AbstractVydiaActivity e;

        d(AbstractVydiaActivity abstractVydiaActivity) {
            this.e = abstractVydiaActivity;
        }

        public /* synthetic */ void A(int i) {
            q0.h(this, i);
        }

        @Deprecated
        public /* synthetic */ void D(b1 b1Var, Object obj, int i) {
            q0.l(this, b1Var, obj, i);
        }

        public /* synthetic */ void L(p00 p00, i40 i40) {
            q0.m(this, p00, i40);
        }

        public /* synthetic */ void R(boolean z) {
            q0.a(this, z);
        }

        public /* synthetic */ void c(o0 o0Var) {
            q0.c(this, o0Var);
        }

        public /* synthetic */ void d(int i) {
            q0.d(this, i);
        }

        public /* synthetic */ void e(boolean z) {
            q0.b(this, z);
        }

        public /* synthetic */ void f(int i) {
            q0.g(this, i);
        }

        public void j(b0 b0Var) {
            AbstractVydiaActivity abstractVydiaActivity;
            String str;
            v62.e(b0Var, "error");
            q0.e(this, b0Var);
            int i = b0Var.e;
            if (i == 0) {
                abstractVydiaActivity = this.e;
                str = "A source error occurred";
            } else if (i == 1) {
                abstractVydiaActivity = this.e;
                str = "A local error occurred with your phone renderer";
            } else if (i != 3) {
                abstractVydiaActivity = this.e;
                str = "An unknown error occurred";
            } else {
                abstractVydiaActivity = this.e;
                str = "A remote error occurred";
            }
            abstractVydiaActivity.V0(str);
        }

        public /* synthetic */ void l() {
            q0.i(this);
        }

        public /* synthetic */ void n(b1 b1Var, int i) {
            q0.k(this, b1Var, i);
        }

        public /* synthetic */ void u(boolean z) {
            q0.j(this, z);
        }

        public void z(boolean z, int i) {
            q0.f(this, z, i);
            boolean z2 = i == 1 || i == 4 || !z;
            PlayerView playerView = (PlayerView) this.e.l0(C0275R$id.exoPlayer);
            v62.d(playerView, "exoPlayer");
            playerView.setKeepScreenOn(!z2);
            if (i != 1) {
                if (i == 2) {
                    this.e.N0();
                    ProgressBar progressBar = (ProgressBar) this.e.l0(C0275R$id.progressBarVideoLoading);
                    v62.d(progressBar, "progressBarVideoLoading");
                    rw1.i(progressBar);
                    return;
                } else if (i != 3) {
                    if (i == 4) {
                        ((PlayerView) this.e.l0(C0275R$id.exoPlayer)).G();
                        this.e.getWindow().clearFlags(128);
                    } else {
                        return;
                    }
                }
            }
            AbstractVydiaActivity abstractVydiaActivity = this.e;
            abstractVydiaActivity.M0(abstractVydiaActivity.Z0());
            ProgressBar progressBar2 = (ProgressBar) this.e.l0(C0275R$id.progressBarVideoLoading);
            v62.d(progressBar2, "progressBarVideoLoading");
            rw1.a(progressBar2);
        }
    }

    public static final class e extends d {
        private int n = 10;
        final /* synthetic */ AbstractVydiaActivity o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AbstractVydiaActivity abstractVydiaActivity, q qVar, Context context, o oVar, q qVar2) {
            super(context, oVar, qVar2);
            this.o = abstractVydiaActivity;
        }

        public void a(MotionEvent motionEvent, float f, w wVar, int i) {
            g gVar;
            AbstractVydiaActivity abstractVydiaActivity;
            g gVar2;
            AbstractVydiaActivity abstractVydiaActivity2;
            v62.e(motionEvent, "event");
            v62.e(wVar, "direction");
            int i2 = a.f[this.o.D0(motionEvent).ordinal()];
            if (i2 == 1) {
                int i3 = a.d[wVar.ordinal()];
                if (i3 == 1) {
                    abstractVydiaActivity = this.o;
                    gVar = g.Increase;
                } else if (i3 == 2) {
                    abstractVydiaActivity = this.o;
                    gVar = g.Decrease;
                } else {
                    return;
                }
                int unused = abstractVydiaActivity.u0(gVar);
            } else if (i2 == 2) {
                int i4 = a.e[wVar.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        if (i == 1 || i % this.n == 0) {
                            abstractVydiaActivity2 = this.o;
                            gVar2 = g.Decrease;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i == 1 || i % this.n == 0) {
                    abstractVydiaActivity2 = this.o;
                    gVar2 = g.Increase;
                } else {
                    return;
                }
                abstractVydiaActivity2.w0(gVar2);
            }
        }

        public void b(MotionEvent motionEvent, float f, m mVar, int i) {
            v62.e(motionEvent, "event");
            v62.e(mVar, "direction");
            int i2 = a.c[mVar.ordinal()];
            if (i2 == 1 || i2 == 2) {
                this.o.F0(i);
            }
        }

        public void c(v vVar) {
            v62.e(vVar, "lastUsedGesture");
            TextView textView = (TextView) this.o.l0(C0275R$id.overlayMessage);
            v62.d(textView, "overlayMessage");
            textView.setText("");
            TextView textView2 = (TextView) this.o.l0(C0275R$id.overlayMessage);
            v62.d(textView2, "overlayMessage");
            rw1.i(textView2);
        }

        public void d() {
            PlayerView playerView = (PlayerView) this.o.l0(C0275R$id.exoPlayer);
            v62.d(playerView, "exoPlayer");
            if (playerView.x()) {
                ((PlayerView) this.o.l0(C0275R$id.exoPlayer)).w();
            } else {
                ((PlayerView) this.o.l0(C0275R$id.exoPlayer)).G();
            }
        }

        public void e(MotionEvent motionEvent) {
            AbstractVydiaActivity abstractVydiaActivity;
            int i;
            v62.e(motionEvent, "event");
            int i2 = a.a[this.o.D0(motionEvent).ordinal()];
            if (i2 == 1) {
                abstractVydiaActivity = this.o;
                i = -abstractVydiaActivity.A0();
            } else if (i2 == 2) {
                abstractVydiaActivity = this.o;
                i = abstractVydiaActivity.A0();
            } else {
                return;
            }
            abstractVydiaActivity.Q0(i);
        }

        public void f(v vVar, int i) {
            v62.e(vVar, "lastUsedGesture");
            "±OnAfterMove with value " + i;
            if (vVar == v.Horizontal) {
                this.o.Q0(i * 1000);
            }
            if (a.b[vVar.ordinal()] == 1 && !this.o.z0().C()) {
                this.o.z0().y(true);
            }
            TextView textView = (TextView) this.o.l0(C0275R$id.overlayMessage);
            v62.d(textView, "overlayMessage");
            rw1.a(textView);
        }
    }

    static final class f implements PlayerControlView.d {
        final /* synthetic */ AbstractVydiaActivity e;

        f(AbstractVydiaActivity abstractVydiaActivity) {
            this.e = abstractVydiaActivity;
        }

        public final void a(int i) {
            this.e.G0(i);
        }
    }

    static final class g implements f.i {
        final /* synthetic */ AbstractVydiaActivity a;

        g(AbstractVydiaActivity abstractVydiaActivity) {
            this.a = abstractVydiaActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, View view, int i, CharSequence charSequence) {
            if (i == 0) {
                this.a.z0().y(true);
                this.a.z0().Z(this.a.z0().V() + 1);
            } else if (i == 1) {
                this.a.K0();
            }
        }
    }

    /* access modifiers changed from: private */
    public final h D0(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        PlayerView playerView = (PlayerView) l0(C0275R$id.exoPlayer);
        v62.d(playerView, "exoPlayer");
        return x <= ((float) playerView.getWidth()) / 2.0f ? h.LEFT : h.RIGHT;
    }

    /* access modifiers changed from: private */
    public final void F0(int i) {
        String str;
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append(i);
            str = sb.toString();
        } else {
            str = String.valueOf(i);
        }
        String c2 = O0().c(i * 1000);
        if (v62.a(c2, "00:00:00")) {
            TextView textView = (TextView) l0(C0275R$id.overlayMessage);
            v62.d(textView, "overlayMessage");
            if (g92.v(textView.getText().toString(), "00:00:00", false, 2, (Object) null)) {
                return;
            }
        }
        TextView textView2 = (TextView) l0(C0275R$id.overlayMessage);
        v62.d(textView2, "overlayMessage");
        textView2.setText(str + "s\n" + c2);
    }

    private final void R0() {
        a1 a1Var = this.D;
        if (a1Var != null) {
            a1Var.v(this.H);
            a1 a1Var2 = this.D;
            if (a1Var2 != null) {
                a1Var2.E0();
            } else {
                v62.p("player");
                throw null;
            }
        } else {
            v62.p("player");
            throw null;
        }
    }

    private final void T0() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = Q().getWindowManager();
        v62.d(windowManager, "activity.windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        q qVar = new q(displayMetrics.heightPixels, displayMetrics.widthPixels);
        ((PlayerView) l0(C0275R$id.exoPlayer)).setOnTouchListener(new e(this, qVar, Q(), B0(), qVar));
    }

    private final void U0() {
        StringBuilder sb;
        a1 a2 = new a1.b(T()).a();
        v62.d(a2, "SimpleExoPlayer.Builder(context).build()");
        this.D = a2;
        PlayerView playerView = (PlayerView) l0(C0275R$id.exoPlayer);
        v62.d(playerView, "exoPlayer");
        a1 a1Var = this.D;
        if (a1Var != null) {
            playerView.setPlayer(a1Var);
            a1 a1Var2 = this.D;
            if (a1Var2 != null) {
                a1Var2.q(this.H);
                uj2.f("Playing video link: " + a1(), new Object[0]);
                Uri parse = Uri.parse(a1());
                v62.b(parse, "Uri.parse(this)");
                p pVar = new p(C0(), 8000, 8000, true);
                List<s> h = qv1.a.h();
                if (h != null) {
                    for (s sVar : h) {
                        if (g92.v(a1(), sVar.b(), false, 2, (Object) null)) {
                            for (t tVar : sVar.a()) {
                                pVar.d().b(tVar.a(), tVar.b());
                            }
                        }
                    }
                }
                f00 t0 = t0(parse, pVar);
                a1 a1Var3 = this.D;
                if (a1Var3 != null) {
                    a1Var3.C0(t0);
                    PlayerView playerView2 = (PlayerView) l0(C0275R$id.exoPlayer);
                    v62.d(playerView2, "exoPlayer");
                    playerView2.setResizeMode(P0());
                    ((PlayerView) l0(C0275R$id.exoPlayer)).setControllerVisibilityListener(new f(this));
                    long L0 = L0();
                    a1 a1Var4 = this.D;
                    if (a1Var4 != null) {
                        a1Var4.Z(L0);
                        if (L0 > 0) {
                            com.zunjae.extensions.a e2 = com.zunjae.extensions.c.e(L0 / ((long) 1000));
                            String O = g92.O(String.valueOf(e2.a()), 2, '0');
                            String O2 = g92.O(String.valueOf(e2.b()), 2, '0');
                            String O3 = g92.O(String.valueOf(e2.c()), 2, '0');
                            if (e2.a() > 0) {
                                sb = new StringBuilder();
                                sb.append("Resuming video from ");
                                sb.append(O);
                                sb.append(':');
                            } else {
                                sb = new StringBuilder();
                                sb.append("Resuming video from ");
                            }
                            sb.append(O2);
                            sb.append(':');
                            sb.append(O3);
                            Toast makeText = Toast.makeText(this, sb.toString(), 0);
                            makeText.show();
                            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                        }
                        a1 a1Var5 = this.D;
                        if (a1Var5 != null) {
                            a1Var5.y(true);
                        } else {
                            v62.p("player");
                            throw null;
                        }
                    } else {
                        v62.p("player");
                        throw null;
                    }
                } else {
                    v62.p("player");
                    throw null;
                }
            } else {
                v62.p("player");
                throw null;
            }
        } else {
            v62.p("player");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void V0(String str) {
        List h = f32.h("Retry", "Open in external video player");
        f.e eVar = new f.e(this);
        eVar.E("An error occurred");
        eVar.i(str);
        eVar.q(h);
        eVar.s(new g(this));
        eVar.D();
    }

    private final void Y0() {
        int x0 = x0();
        TextView textView = (TextView) l0(C0275R$id.overlayMessage);
        v62.d(textView, "overlayMessage");
        textView.setText("Brightness: " + x0 + '%');
    }

    private final f00 t0(Uri uri, p pVar) {
        String str;
        f00 f00;
        int b0 = v50.b0(uri, (String) null);
        if (b0 == 0) {
            f00 = new DashMediaSource.Factory(pVar).a(uri);
            str = "DashMediaSource.Factory(…  .createMediaSource(uri)";
        } else if (b0 == 1) {
            f00 = new SsMediaSource.Factory(pVar).a(uri);
            str = "SsMediaSource.Factory(da…  .createMediaSource(uri)";
        } else if (b0 == 2) {
            f00 = new HlsMediaSource.Factory((i.a) pVar).a(uri);
            str = "HlsMediaSource.Factory(d…  .createMediaSource(uri)";
        } else if (b0 == 3) {
            f00 = new c00.b(pVar).a(uri);
            str = "ExtractorMediaSource.Fac…y).createMediaSource(uri)";
        } else {
            throw new IllegalStateException("Unsupported type: " + b0);
        }
        v62.d(f00, str);
        return f00;
    }

    /* access modifiers changed from: private */
    public final int u0(g gVar) {
        Window window = getWindow();
        v62.d(window, "window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        float f2 = attributes.screenBrightness;
        float f3 = Utils.FLOAT_EPSILON;
        boolean z = f2 == Utils.FLOAT_EPSILON;
        float amount = attributes.screenBrightness + gVar.getAmount();
        if (!z) {
            f3 = 0.01f;
        }
        attributes.screenBrightness = w72.d(w72.a(amount, f3), 1.0f);
        Window window2 = getWindow();
        v62.d(window2, "window");
        window2.setAttributes(attributes);
        Y0();
        return (int) Math.floor(((double) attributes.screenBrightness) * ((double) 100));
    }

    /* access modifiers changed from: private */
    public final void v0(float f2) {
        o0 o0Var = new o0(f2);
        a1 a1Var = this.D;
        if (a1Var != null) {
            a1Var.H0(o0Var);
            W0("Playback speed changed to " + f2 + 'x');
            return;
        }
        v62.p("player");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void w0(g gVar) {
        Object systemService = getApplicationContext().getSystemService("audio");
        if (systemService != null) {
            AudioManager audioManager = (AudioManager) systemService;
            int i = a.g[gVar.ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i == 2) {
                    i2 = -1;
                } else {
                    throw new j22();
                }
            }
            audioManager.adjustStreamVolume(3, i2, 0);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            TextView textView = (TextView) l0(C0275R$id.overlayMessage);
            v62.d(textView, "overlayMessage");
            StringBuilder sb = new StringBuilder();
            sb.append(audioManager.getStreamVolume(3));
            sb.append('/');
            sb.append(streamMaxVolume);
            textView.setText(sb.toString());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }

    private final int x0() {
        Window window = getWindow();
        v62.d(window, "window");
        return (int) Math.floor(((double) window.getAttributes().screenBrightness) * ((double) 100));
    }

    public final int A0() {
        return this.E;
    }

    public o B0() {
        return (o) this.G.getValue();
    }

    public String C0() {
        return this.F;
    }

    public final void E0() {
        PlayerView playerView = (PlayerView) l0(C0275R$id.exoPlayer);
        v62.d(playerView, "exoPlayer");
        playerView.setSystemUiVisibility(2054);
    }

    public abstract void G0(int i);

    public final void H0() {
        List<l22> h = f32.h(new l22("100% (default)", Float.valueOf(1.0f)), new l22("110%", Float.valueOf(1.1f)), new l22("120%", Float.valueOf(1.2f)), new l22("130%", Float.valueOf(1.3f)), new l22("150%", Float.valueOf(1.5f)), new l22("200%", Float.valueOf(2.0f)));
        f.e eVar = new f.e(this);
        eVar.E("Change playback speed");
        ArrayList arrayList = new ArrayList(g32.l(h, 10));
        for (l22 c2 : h) {
            arrayList.add((String) c2.c());
        }
        eVar.q(arrayList);
        eVar.s(new c(this, h));
        eVar.D();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I0() {
        /*
            r4 = this;
            int r0 = com.zunjae.anyme.C0275R$id.exoPlayer
            android.view.View r0 = r4.l0(r0)
            com.google.android.exoplayer2.ui.PlayerView r0 = (com.google.android.exoplayer2.ui.PlayerView) r0
            java.lang.String r1 = "exoPlayer"
            defpackage.v62.d(r0, r1)
            int r0 = r0.getResizeMode()
            r2 = 3
            if (r0 == 0) goto L_0x003d
            r3 = 4
            if (r0 == r2) goto L_0x002c
            if (r0 == r3) goto L_0x001a
            goto L_0x0050
        L_0x001a:
            int r0 = com.zunjae.anyme.C0275R$id.exoPlayer
            android.view.View r0 = r4.l0(r0)
            com.google.android.exoplayer2.ui.PlayerView r0 = (com.google.android.exoplayer2.ui.PlayerView) r0
            defpackage.v62.d(r0, r1)
            r2 = 0
            r0.setResizeMode(r2)
            java.lang.String r0 = "Resize Mode: Fit"
            goto L_0x004d
        L_0x002c:
            int r0 = com.zunjae.anyme.C0275R$id.exoPlayer
            android.view.View r0 = r4.l0(r0)
            com.google.android.exoplayer2.ui.PlayerView r0 = (com.google.android.exoplayer2.ui.PlayerView) r0
            defpackage.v62.d(r0, r1)
            r0.setResizeMode(r3)
            java.lang.String r0 = "Resize Mode: Zoom"
            goto L_0x004d
        L_0x003d:
            int r0 = com.zunjae.anyme.C0275R$id.exoPlayer
            android.view.View r0 = r4.l0(r0)
            com.google.android.exoplayer2.ui.PlayerView r0 = (com.google.android.exoplayer2.ui.PlayerView) r0
            defpackage.v62.d(r0, r1)
            r0.setResizeMode(r2)
            java.lang.String r0 = "Resize Mode: Fill"
        L_0x004d:
            r4.W0(r0)
        L_0x0050:
            int r0 = com.zunjae.anyme.C0275R$id.exoPlayer
            android.view.View r0 = r4.l0(r0)
            com.google.android.exoplayer2.ui.PlayerView r0 = (com.google.android.exoplayer2.ui.PlayerView) r0
            defpackage.v62.d(r0, r1)
            int r0 = r0.getResizeMode()
            r4.S0(r0)
            int r0 = com.zunjae.anyme.C0275R$id.exoPlayer
            android.view.View r0 = r4.l0(r0)
            com.google.android.exoplayer2.ui.PlayerView r0 = (com.google.android.exoplayer2.ui.PlayerView) r0
            r0.w()
            com.google.android.exoplayer2.a1 r0 = r4.D
            if (r0 == 0) goto L_0x0076
            r1 = 1
            r0.y(r1)
            return
        L_0x0076:
            java.lang.String r0 = "player"
            defpackage.v62.p(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.vydia.AbstractVydiaActivity.I0():void");
    }

    public abstract void J0(long j, long j2);

    /* access modifiers changed from: protected */
    public final void K0() {
        a1 a1Var = this.D;
        if (a1Var != null) {
            a1Var.y(false);
            xr1.a.k(this, a1(), b1());
            return;
        }
        v62.p("player");
        throw null;
    }

    public abstract long L0();

    public abstract void M0(List<l22<String, String>> list);

    public abstract void N0();

    public final r O0() {
        a1 a1Var = this.D;
        if (a1Var != null) {
            long A = a1Var.A();
            a1 a1Var2 = this.D;
            if (a1Var2 != null) {
                return new r(A, a1Var2.X());
            }
            v62.p("player");
            throw null;
        }
        v62.p("player");
        throw null;
    }

    public abstract int P0();

    public final void Q0(int i) {
        a1 a1Var = this.D;
        if (a1Var == null) {
            v62.p("player");
            throw null;
        } else if (a1Var != null) {
            a1Var.Z(a1Var.V() + ((long) i));
            String str = i > 0 ? "+" : "";
            O0();
            ((PlayerView) l0(C0275R$id.exoPlayer)).w();
            W0(str + (i / 1000) + " seconds");
            a1 a1Var2 = this.D;
            if (a1Var2 != null) {
                a1Var2.y(true);
            } else {
                v62.p("player");
                throw null;
            }
        } else {
            v62.p("player");
            throw null;
        }
    }

    public abstract void S0(int i);

    public final void W0(String str) {
        v62.e(str, "message");
        Toast makeText = Toast.makeText(this, str, 0);
        makeText.show();
        v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
    }

    public abstract String X0();

    public final List<l22<String, String>> Z0() {
        a1 a1Var = this.D;
        Double d2 = null;
        if (a1Var != null) {
            f0 A0 = a1Var.A0();
            Integer valueOf = A0 != null ? Integer.valueOf(A0.r) : null;
            Integer valueOf2 = A0 != null ? Integer.valueOf(A0.s) : null;
            float f2 = 1.0f;
            float intValue = valueOf != null ? (float) valueOf.intValue() : 1.0f;
            if (valueOf2 != null) {
                f2 = (float) valueOf2.intValue();
            }
            double d3 = com.zunjae.extensions.c.d((double) (intValue / f2), 1);
            if (A0 != null) {
                d2 = Double.valueOf(com.zunjae.extensions.c.d((double) A0.t, 2));
            }
            l22[] l22Arr = new l22[3];
            l22Arr[0] = new l22("Link", a1());
            StringBuilder sb = new StringBuilder();
            if (valueOf == null) {
                valueOf = "?";
            }
            sb.append(valueOf);
            sb.append(" x ");
            if (valueOf2 == null) {
                valueOf2 = "?";
            }
            sb.append(valueOf2);
            sb.append(" (Aspect ratio: ");
            sb.append(d3);
            sb.append(')');
            l22Arr[1] = new l22("Resolution", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            if (d2 == null) {
                d2 = "?";
            }
            sb2.append(d2);
            sb2.append(" fps");
            l22Arr[2] = new l22("Frame rate", sb2.toString());
            return f32.h(l22Arr);
        }
        v62.p("player");
        throw null;
    }

    public boolean a0() {
        return false;
    }

    public abstract String a1();

    public abstract String b1();

    public View l0(int i) {
        if (this.I == null) {
            this.I = new HashMap();
        }
        View view = (View) this.I.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.I.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_vydia);
        getWindow().addFlags(128);
        U0();
        T0();
        ((Toolbar) l0(C0275R$id.toolbar)).postDelayed(new b(this), 16);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent();
        a1 a1Var = this.D;
        if (a1Var != null) {
            intent.putExtra("contentPosition", a1Var.A());
            a1 a1Var2 = this.D;
            if (a1Var2 != null) {
                intent.putExtra("contentDuration", a1Var2.X());
                u22 u22 = u22.a;
                setResult(-1, intent);
                a1 a1Var3 = this.D;
                if (a1Var3 != null) {
                    long A = a1Var3.A();
                    a1 a1Var4 = this.D;
                    if (a1Var4 != null) {
                        J0(A, a1Var4.X());
                        R0();
                        return;
                    }
                    v62.p("player");
                    throw null;
                }
                v62.p("player");
                throw null;
            }
            v62.p("player");
            throw null;
        }
        v62.p("player");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        Q0(r4.E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        Q0(-r4.E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            r0 = 126(0x7e, float:1.77E-43)
            r1 = 0
            java.lang.String r2 = "player"
            r3 = 1
            if (r5 == r0) goto L_0x0040
            r0 = 127(0x7f, float:1.78E-43)
            if (r5 == r0) goto L_0x0028
            switch(r5) {
                case 86: goto L_0x0024;
                case 87: goto L_0x001e;
                case 88: goto L_0x0017;
                case 89: goto L_0x0017;
                case 90: goto L_0x001e;
                default: goto L_0x000f;
            }
        L_0x000f:
            switch(r5) {
                case 272: goto L_0x001e;
                case 273: goto L_0x0017;
                case 274: goto L_0x001e;
                case 275: goto L_0x0017;
                default: goto L_0x0012;
            }
        L_0x0012:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        L_0x0017:
            int r5 = r4.E
            int r5 = -r5
            r4.Q0(r5)
            return r3
        L_0x001e:
            int r5 = r4.E
            r4.Q0(r5)
            return r3
        L_0x0024:
            r4.finish()
            return r3
        L_0x0028:
            com.google.android.exoplayer2.a1 r5 = r4.D
            if (r5 == 0) goto L_0x003c
            r6 = 0
            r5.y(r6)
            int r5 = com.zunjae.anyme.C0275R$id.exoPlayer
            android.view.View r5 = r4.l0(r5)
            com.google.android.exoplayer2.ui.PlayerView r5 = (com.google.android.exoplayer2.ui.PlayerView) r5
            r5.G()
            return r3
        L_0x003c:
            defpackage.v62.p(r2)
            throw r1
        L_0x0040:
            com.google.android.exoplayer2.a1 r5 = r4.D
            if (r5 == 0) goto L_0x0053
            r5.y(r3)
            int r5 = com.zunjae.anyme.C0275R$id.exoPlayer
            android.view.View r5 = r4.l0(r5)
            com.google.android.exoplayer2.ui.PlayerView r5 = (com.google.android.exoplayer2.ui.PlayerView) r5
            r5.w()
            return r3
        L_0x0053:
            defpackage.v62.p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.vydia.AbstractVydiaActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT < 24 || !isInPictureInPictureMode()) {
            a1 a1Var = this.D;
            if (a1Var != null) {
                a1Var.y(false);
            } else {
                v62.p("player");
                throw null;
            }
        }
    }

    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super.onPictureInPictureModeChanged(z, configuration);
        if (z) {
            ((PlayerView) l0(C0275R$id.exoPlayer)).w();
        } else {
            ((PlayerView) l0(C0275R$id.exoPlayer)).G();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        E0();
    }

    public final void y0() {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        PlayerView playerView = (PlayerView) l0(C0275R$id.exoPlayer);
        v62.d(playerView, "exoPlayer");
        int width = playerView.getWidth();
        PlayerView playerView2 = (PlayerView) l0(C0275R$id.exoPlayer);
        v62.d(playerView2, "exoPlayer");
        enterPictureInPictureMode(builder.setAspectRatio(new Rational(width, playerView2.getHeight())).build());
    }

    /* access modifiers changed from: protected */
    public final a1 z0() {
        a1 a1Var = this.D;
        if (a1Var != null) {
            return a1Var;
        }
        v62.p("player");
        throw null;
    }
}
