package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.exoplayer2.b0;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.o0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.spherical.SphericalGLSurfaceView;
import com.google.android.exoplayer2.ui.spherical.g;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.n;
import com.google.android.exoplayer2.video.r;
import com.google.android.exoplayer2.video.s;
import com.google.android.exoplayer2.w;
import defpackage.yx;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class PlayerView extends FrameLayout {
    private boolean A;
    /* access modifiers changed from: private */
    public boolean B;
    private boolean C;
    /* access modifiers changed from: private */
    public int D;
    private boolean E;
    private final a e;
    /* access modifiers changed from: private */
    public final AspectRatioFrameLayout f;
    /* access modifiers changed from: private */
    public final View g;
    /* access modifiers changed from: private */
    public final View h;
    private final ImageView i;
    /* access modifiers changed from: private */
    public final SubtitleView j;
    private final View k;
    private final TextView l;
    private final PlayerControlView m;
    private final FrameLayout n;
    private final FrameLayout o;
    /* access modifiers changed from: private */
    public r0 p;
    private boolean q;
    private PlayerControlView.d r;
    private boolean s;
    private Drawable t;
    private int u;
    private boolean v;
    private boolean w;
    private w40<? super b0> x;
    private CharSequence y;
    private int z;

    private final class a implements r0.a, q20, s, View.OnLayoutChangeListener, g, PlayerControlView.d {
        private final b1.b e = new b1.b();
        private Object f;

        public a() {
        }

        public /* synthetic */ void A(int i) {
            q0.h(this, i);
        }

        @Deprecated
        public /* synthetic */ void D(b1 b1Var, Object obj, int i) {
            q0.l(this, b1Var, obj, i);
        }

        public void E() {
            if (PlayerView.this.g != null) {
                PlayerView.this.g.setVisibility(4);
            }
        }

        public void L(p00 p00, i40 i40) {
            r0 m = PlayerView.this.p;
            q40.e(m);
            r0 r0Var = m;
            b1 N = r0Var.N();
            if (!N.q()) {
                if (!r0Var.L().c()) {
                    this.f = N.g(r0Var.n(), this.e, true).b;
                } else {
                    Object obj = this.f;
                    if (obj != null) {
                        int b = N.b(obj);
                        if (b != -1 && r0Var.w() == N.f(b, this.e).c) {
                            return;
                        }
                    }
                }
                PlayerView.this.M(false);
            }
            this.f = null;
            PlayerView.this.M(false);
        }

        public /* synthetic */ void N(int i, int i2) {
            r.a(this, i, i2);
        }

        public /* synthetic */ void R(boolean z) {
            q0.a(this, z);
        }

        public void a(int i) {
            PlayerView.this.K();
        }

        public void b(int i, int i2, int i3, float f2) {
            float f3 = (i2 == 0 || i == 0) ? 1.0f : (((float) i) * f2) / ((float) i2);
            if (PlayerView.this.h instanceof TextureView) {
                if (i3 == 90 || i3 == 270) {
                    f3 = 1.0f / f3;
                }
                if (PlayerView.this.D != 0) {
                    PlayerView.this.h.removeOnLayoutChangeListener(this);
                }
                int unused = PlayerView.this.D = i3;
                if (PlayerView.this.D != 0) {
                    PlayerView.this.h.addOnLayoutChangeListener(this);
                }
                PlayerView.q((TextureView) PlayerView.this.h, PlayerView.this.D);
            }
            PlayerView playerView = PlayerView.this;
            playerView.B(f3, playerView.f, PlayerView.this.h);
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

        public void f(int i) {
            if (PlayerView.this.z() && PlayerView.this.B) {
                PlayerView.this.w();
            }
        }

        public /* synthetic */ void j(b0 b0Var) {
            q0.e(this, b0Var);
        }

        public /* synthetic */ void l() {
            q0.i(this);
        }

        public /* synthetic */ void n(b1 b1Var, int i) {
            q0.k(this, b1Var, i);
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.q((TextureView) view, PlayerView.this.D);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return PlayerView.this.I();
        }

        public void p(List<h20> list) {
            if (PlayerView.this.j != null) {
                PlayerView.this.j.p(list);
            }
        }

        public /* synthetic */ void u(boolean z) {
            q0.j(this, z);
        }

        public void z(boolean z, int i) {
            PlayerView.this.J();
            PlayerView.this.L();
            if (!PlayerView.this.z() || !PlayerView.this.B) {
                PlayerView.this.A(false);
            } else {
                PlayerView.this.w();
            }
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.view.TextureView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: com.google.android.exoplayer2.ui.spherical.SphericalGLSurfaceView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: android.view.TextureView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: android.view.TextureView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: android.view.SurfaceView} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PlayerView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r19.<init>(r20, r21, r22)
            com.google.android.exoplayer2.ui.PlayerView$a r3 = new com.google.android.exoplayer2.ui.PlayerView$a
            r3.<init>()
            r1.e = r3
            boolean r3 = r19.isInEditMode()
            r4 = 0
            if (r3 == 0) goto L_0x0049
            r1.f = r4
            r1.g = r4
            r1.h = r4
            r1.i = r4
            r1.j = r4
            r1.k = r4
            r1.l = r4
            r1.m = r4
            r1.n = r4
            r1.o = r4
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r0)
            int r0 = defpackage.v50.a
            r3 = 23
            if (r0 < r3) goto L_0x003e
            android.content.res.Resources r0 = r19.getResources()
            t(r0, r2)
            goto L_0x0045
        L_0x003e:
            android.content.res.Resources r0 = r19.getResources()
            s(r0, r2)
        L_0x0045:
            r1.addView(r2)
            return
        L_0x0049:
            int r3 = com.google.android.exoplayer2.ui.R$layout.exo_player_view
            r5 = 5000(0x1388, float:7.006E-42)
            r6 = 1
            r1.w = r6
            r7 = 0
            if (r2 == 0) goto L_0x00d9
            android.content.res.Resources$Theme r8 = r20.getTheme()
            int[] r9 = com.google.android.exoplayer2.ui.R$styleable.PlayerView
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r2, r9, r7, r7)
            int r9 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_shutter_background_color     // Catch:{ all -> 0x00d4 }
            boolean r9 = r8.hasValue(r9)     // Catch:{ all -> 0x00d4 }
            int r10 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_shutter_background_color     // Catch:{ all -> 0x00d4 }
            int r10 = r8.getColor(r10, r7)     // Catch:{ all -> 0x00d4 }
            int r11 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_player_layout_id     // Catch:{ all -> 0x00d4 }
            int r3 = r8.getResourceId(r11, r3)     // Catch:{ all -> 0x00d4 }
            int r11 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_use_artwork     // Catch:{ all -> 0x00d4 }
            boolean r11 = r8.getBoolean(r11, r6)     // Catch:{ all -> 0x00d4 }
            int r12 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_default_artwork     // Catch:{ all -> 0x00d4 }
            int r12 = r8.getResourceId(r12, r7)     // Catch:{ all -> 0x00d4 }
            int r13 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_use_controller     // Catch:{ all -> 0x00d4 }
            boolean r13 = r8.getBoolean(r13, r6)     // Catch:{ all -> 0x00d4 }
            int r14 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_surface_type     // Catch:{ all -> 0x00d4 }
            int r14 = r8.getInt(r14, r6)     // Catch:{ all -> 0x00d4 }
            int r15 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_resize_mode     // Catch:{ all -> 0x00d4 }
            int r15 = r8.getInt(r15, r7)     // Catch:{ all -> 0x00d4 }
            int r4 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_show_timeout     // Catch:{ all -> 0x00d4 }
            int r5 = r8.getInt(r4, r5)     // Catch:{ all -> 0x00d4 }
            int r4 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_hide_on_touch     // Catch:{ all -> 0x00d4 }
            boolean r4 = r8.getBoolean(r4, r6)     // Catch:{ all -> 0x00d4 }
            int r7 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_auto_show     // Catch:{ all -> 0x00d4 }
            boolean r7 = r8.getBoolean(r7, r6)     // Catch:{ all -> 0x00d4 }
            int r6 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_show_buffering     // Catch:{ all -> 0x00d4 }
            r16 = r3
            r3 = 0
            int r6 = r8.getInteger(r6, r3)     // Catch:{ all -> 0x00d4 }
            int r3 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_keep_content_on_player_reset     // Catch:{ all -> 0x00d4 }
            r17 = r4
            boolean r4 = r1.v     // Catch:{ all -> 0x00d4 }
            boolean r3 = r8.getBoolean(r3, r4)     // Catch:{ all -> 0x00d4 }
            r1.v = r3     // Catch:{ all -> 0x00d4 }
            int r3 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_hide_during_ads     // Catch:{ all -> 0x00d4 }
            r4 = 1
            boolean r3 = r8.getBoolean(r3, r4)     // Catch:{ all -> 0x00d4 }
            int r4 = com.google.android.exoplayer2.ui.R$styleable.PlayerView_use_sensor_rotation     // Catch:{ all -> 0x00d4 }
            r18 = r3
            boolean r3 = r1.w     // Catch:{ all -> 0x00d4 }
            boolean r3 = r8.getBoolean(r4, r3)     // Catch:{ all -> 0x00d4 }
            r1.w = r3     // Catch:{ all -> 0x00d4 }
            r8.recycle()
            r8 = r7
            r3 = r16
            r4 = r18
            r16 = r5
            r5 = r17
            goto L_0x00e6
        L_0x00d4:
            r0 = move-exception
            r8.recycle()
            throw r0
        L_0x00d9:
            r4 = 1
            r5 = 1
            r6 = 0
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 1
            r14 = 1
            r15 = 0
            r16 = 5000(0x1388, float:7.006E-42)
        L_0x00e6:
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r20)
            r7.inflate(r3, r1)
            r3 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r3)
            int r3 = com.google.android.exoplayer2.ui.R$id.exo_content_frame
            android.view.View r3 = r1.findViewById(r3)
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r3 = (com.google.android.exoplayer2.ui.AspectRatioFrameLayout) r3
            r1.f = r3
            if (r3 == 0) goto L_0x0101
            E(r3, r15)
        L_0x0101:
            int r3 = com.google.android.exoplayer2.ui.R$id.exo_shutter
            android.view.View r3 = r1.findViewById(r3)
            r1.g = r3
            if (r3 == 0) goto L_0x0110
            if (r9 == 0) goto L_0x0110
            r3.setBackgroundColor(r10)
        L_0x0110:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r3 = r1.f
            if (r3 == 0) goto L_0x0156
            if (r14 == 0) goto L_0x0156
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r7 = -1
            r3.<init>(r7, r7)
            r7 = 2
            if (r14 == r7) goto L_0x0141
            r7 = 3
            if (r14 == r7) goto L_0x0131
            r7 = 4
            if (r14 == r7) goto L_0x012b
            android.view.SurfaceView r7 = new android.view.SurfaceView
            r7.<init>(r0)
            goto L_0x0146
        L_0x012b:
            com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView r7 = new com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView
            r7.<init>(r0)
            goto L_0x0146
        L_0x0131:
            com.google.android.exoplayer2.ui.spherical.SphericalGLSurfaceView r7 = new com.google.android.exoplayer2.ui.spherical.SphericalGLSurfaceView
            r7.<init>(r0)
            com.google.android.exoplayer2.ui.PlayerView$a r9 = r1.e
            r7.setSingleTapListener(r9)
            boolean r9 = r1.w
            r7.setUseSensorRotation(r9)
            goto L_0x0146
        L_0x0141:
            android.view.TextureView r7 = new android.view.TextureView
            r7.<init>(r0)
        L_0x0146:
            r1.h = r7
            android.view.View r7 = r1.h
            r7.setLayoutParams(r3)
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r3 = r1.f
            android.view.View r7 = r1.h
            r9 = 0
            r3.addView(r7, r9)
            goto L_0x0159
        L_0x0156:
            r3 = 0
            r1.h = r3
        L_0x0159:
            int r3 = com.google.android.exoplayer2.ui.R$id.exo_ad_overlay
            android.view.View r3 = r1.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r1.n = r3
            int r3 = com.google.android.exoplayer2.ui.R$id.exo_overlay
            android.view.View r3 = r1.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r1.o = r3
            int r3 = com.google.android.exoplayer2.ui.R$id.exo_artwork
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r1.i = r3
            if (r11 == 0) goto L_0x017d
            if (r3 == 0) goto L_0x017d
            r3 = 1
            goto L_0x017e
        L_0x017d:
            r3 = 0
        L_0x017e:
            r1.s = r3
            if (r12 == 0) goto L_0x018c
            android.content.Context r3 = r19.getContext()
            android.graphics.drawable.Drawable r3 = androidx.core.content.a.f(r3, r12)
            r1.t = r3
        L_0x018c:
            int r3 = com.google.android.exoplayer2.ui.R$id.exo_subtitles
            android.view.View r3 = r1.findViewById(r3)
            com.google.android.exoplayer2.ui.SubtitleView r3 = (com.google.android.exoplayer2.ui.SubtitleView) r3
            r1.j = r3
            if (r3 == 0) goto L_0x01a0
            r3.f()
            com.google.android.exoplayer2.ui.SubtitleView r3 = r1.j
            r3.g()
        L_0x01a0:
            int r3 = com.google.android.exoplayer2.ui.R$id.exo_buffering
            android.view.View r3 = r1.findViewById(r3)
            r1.k = r3
            r7 = 8
            if (r3 == 0) goto L_0x01af
            r3.setVisibility(r7)
        L_0x01af:
            r1.u = r6
            int r3 = com.google.android.exoplayer2.ui.R$id.exo_error_message
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.l = r3
            if (r3 == 0) goto L_0x01c0
            r3.setVisibility(r7)
        L_0x01c0:
            int r3 = com.google.android.exoplayer2.ui.R$id.exo_controller
            android.view.View r3 = r1.findViewById(r3)
            com.google.android.exoplayer2.ui.PlayerControlView r3 = (com.google.android.exoplayer2.ui.PlayerControlView) r3
            int r6 = com.google.android.exoplayer2.ui.R$id.exo_controller_placeholder
            android.view.View r6 = r1.findViewById(r6)
            if (r3 == 0) goto L_0x01d4
            r1.m = r3
            r7 = 0
            goto L_0x0204
        L_0x01d4:
            if (r6 == 0) goto L_0x0200
            com.google.android.exoplayer2.ui.PlayerControlView r3 = new com.google.android.exoplayer2.ui.PlayerControlView
            r7 = 0
            r9 = 0
            r3.<init>(r0, r9, r7, r2)
            r1.m = r3
            int r0 = com.google.android.exoplayer2.ui.R$id.exo_controller
            r3.setId(r0)
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.m
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            r0.setLayoutParams(r2)
            android.view.ViewParent r0 = r6.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.indexOfChild(r6)
            r0.removeView(r6)
            com.google.android.exoplayer2.ui.PlayerControlView r3 = r1.m
            r0.addView(r3, r2)
            goto L_0x0204
        L_0x0200:
            r0 = 0
            r7 = 0
            r1.m = r0
        L_0x0204:
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.m
            if (r0 == 0) goto L_0x020b
            r3 = r16
            goto L_0x020c
        L_0x020b:
            r3 = 0
        L_0x020c:
            r1.z = r3
            r1.C = r5
            r1.A = r8
            r1.B = r4
            if (r13 == 0) goto L_0x021c
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.m
            if (r0 == 0) goto L_0x021c
            r6 = 1
            goto L_0x021d
        L_0x021c:
            r6 = 0
        L_0x021d:
            r1.q = r6
            r19.w()
            r19.K()
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.m
            if (r0 == 0) goto L_0x022e
            com.google.android.exoplayer2.ui.PlayerView$a r2 = r1.e
            r0.C(r2)
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: private */
    public void A(boolean z2) {
        if ((!z() || !this.B) && O()) {
            boolean z3 = this.m.K() && this.m.getShowTimeoutMs() <= 0;
            boolean F = F();
            if (z2 || z3 || F) {
                H(F);
            }
        }
    }

    @RequiresNonNull({"artworkView"})
    private boolean C(yx yxVar) {
        byte[] bArr;
        int i2;
        int i3 = 0;
        int i4 = -1;
        boolean z2 = false;
        while (i3 < yxVar.d()) {
            yx.b c = yxVar.c(i3);
            if (c instanceof oy) {
                oy oyVar = (oy) c;
                bArr = oyVar.i;
                i2 = oyVar.h;
            } else if (c instanceof iy) {
                iy iyVar = (iy) c;
                bArr = iyVar.l;
                i2 = iyVar.e;
            } else {
                continue;
                i3++;
            }
            if (i4 == -1 || i2 == 3) {
                z2 = D(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                if (i2 == 3) {
                    break;
                }
                i4 = i2;
                i3++;
            } else {
                i3++;
            }
        }
        return z2;
    }

    @RequiresNonNull({"artworkView"})
    private boolean D(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                B(((float) intrinsicWidth) / ((float) intrinsicHeight), this.f, this.i);
                this.i.setImageDrawable(drawable);
                this.i.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void E(AspectRatioFrameLayout aspectRatioFrameLayout, int i2) {
        aspectRatioFrameLayout.setResizeMode(i2);
    }

    private boolean F() {
        r0 r0Var = this.p;
        if (r0Var == null) {
            return true;
        }
        int h2 = r0Var.h();
        return this.A && (h2 == 1 || h2 == 4 || !this.p.j());
    }

    private void H(boolean z2) {
        if (O()) {
            this.m.setShowTimeoutMs(z2 ? 0 : this.z);
            this.m.W();
        }
    }

    /* access modifiers changed from: private */
    public boolean I() {
        if (!O() || this.p == null) {
            return false;
        }
        if (!this.m.K()) {
            A(true);
        } else if (this.C) {
            this.m.H();
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void J() {
        int i2;
        if (this.k != null) {
            r0 r0Var = this.p;
            boolean z2 = true;
            int i3 = 0;
            if (r0Var == null || r0Var.h() != 2 || ((i2 = this.u) != 2 && (i2 != 1 || !this.p.j()))) {
                z2 = false;
            }
            View view = this.k;
            if (!z2) {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
    }

    /* access modifiers changed from: private */
    public void K() {
        PlayerControlView playerControlView = this.m;
        String str = null;
        if (playerControlView != null && this.q) {
            if (playerControlView.getVisibility() != 0) {
                setContentDescription(getResources().getString(R$string.exo_controls_show));
                return;
            } else if (this.C) {
                str = getResources().getString(R$string.exo_controls_hide);
            }
        }
        setContentDescription(str);
    }

    /* access modifiers changed from: private */
    public void L() {
        w40<? super b0> w40;
        TextView textView = this.l;
        if (textView != null) {
            CharSequence charSequence = this.y;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.l.setVisibility(0);
                return;
            }
            r0 r0Var = this.p;
            b0 l2 = r0Var != null ? r0Var.l() : null;
            if (l2 == null || (w40 = this.x) == null) {
                this.l.setVisibility(8);
                return;
            }
            this.l.setText((CharSequence) w40.a(l2).second);
            this.l.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void M(boolean z2) {
        r0 r0Var = this.p;
        if (r0Var != null && !r0Var.L().c()) {
            if (z2 && !this.v) {
                r();
            }
            i40 S = r0Var.S();
            int i2 = 0;
            while (i2 < S.a) {
                if (r0Var.T(i2) != 2 || S.a(i2) == null) {
                    i2++;
                } else {
                    v();
                    return;
                }
            }
            r();
            if (N()) {
                for (int i3 = 0; i3 < S.a; i3++) {
                    h40 a2 = S.a(i3);
                    if (a2 != null) {
                        int i4 = 0;
                        while (i4 < a2.length()) {
                            yx yxVar = a2.d(i4).k;
                            if (yxVar == null || !C(yxVar)) {
                                i4++;
                            } else {
                                return;
                            }
                        }
                        continue;
                    }
                }
                if (D(this.t)) {
                    return;
                }
            }
            v();
        } else if (!this.v) {
            v();
            r();
        }
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean N() {
        if (!this.s) {
            return false;
        }
        q40.h(this.i);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean O() {
        if (!this.q) {
            return false;
        }
        q40.h(this.m);
        return true;
    }

    /* access modifiers changed from: private */
    public static void q(TextureView textureView, int i2) {
        Matrix matrix = new Matrix();
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == Utils.FLOAT_EPSILON || height == Utils.FLOAT_EPSILON || i2 == 0)) {
            float f2 = width / 2.0f;
            float f3 = height / 2.0f;
            matrix.postRotate((float) i2, f2, f3);
            RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f2, f3);
        }
        textureView.setTransform(matrix);
    }

    private void r() {
        View view = this.g;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void s(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R$drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R$color.exo_edit_mode_background_color));
    }

    @TargetApi(23)
    private static void t(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R$drawable.exo_edit_mode_logo, (Resources.Theme) null));
        imageView.setBackgroundColor(resources.getColor(R$color.exo_edit_mode_background_color, (Resources.Theme) null));
    }

    private void v() {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.i.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean y(int i2) {
        return i2 == 19 || i2 == 270 || i2 == 22 || i2 == 271 || i2 == 20 || i2 == 269 || i2 == 21 || i2 == 268 || i2 == 23;
    }

    /* access modifiers changed from: private */
    public boolean z() {
        r0 r0Var = this.p;
        return r0Var != null && r0Var.f() && this.p.j();
    }

    /* access modifiers changed from: protected */
    public void B(float f2, AspectRatioFrameLayout aspectRatioFrameLayout, View view) {
        if (aspectRatioFrameLayout != null) {
            if (view instanceof SphericalGLSurfaceView) {
                f2 = Utils.FLOAT_EPSILON;
            }
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    public void G() {
        H(F());
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        r0 r0Var = this.p;
        if (r0Var != null && r0Var.f()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean y2 = y(keyEvent.getKeyCode());
        if ((y2 && O() && !this.m.K()) || u(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            A(true);
            return true;
        } else if (!y2 || !O()) {
            return false;
        } else {
            A(true);
            return false;
        }
    }

    public View[] getAdOverlayViews() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.o;
        if (frameLayout != null) {
            arrayList.add(frameLayout);
        }
        PlayerControlView playerControlView = this.m;
        if (playerControlView != null) {
            arrayList.add(playerControlView);
        }
        return (View[]) arrayList.toArray(new View[0]);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.n;
        q40.i(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.A;
    }

    public boolean getControllerHideOnTouch() {
        return this.C;
    }

    public int getControllerShowTimeoutMs() {
        return this.z;
    }

    public Drawable getDefaultArtwork() {
        return this.t;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.o;
    }

    public r0 getPlayer() {
        return this.p;
    }

    public int getResizeMode() {
        q40.h(this.f);
        return this.f.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.j;
    }

    public boolean getUseArtwork() {
        return this.s;
    }

    public boolean getUseController() {
        return this.q;
    }

    public View getVideoSurfaceView() {
        return this.h;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!O() || this.p == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.E = true;
            return true;
        } else if (action != 1 || !this.E) {
            return false;
        } else {
            this.E = false;
            performClick();
            return true;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!O() || this.p == null) {
            return false;
        }
        A(true);
        return true;
    }

    public boolean performClick() {
        super.performClick();
        return I();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        q40.h(this.f);
        this.f.setAspectRatioListener(bVar);
    }

    public void setControlDispatcher(w wVar) {
        q40.h(this.m);
        this.m.setControlDispatcher(wVar);
    }

    public void setControllerAutoShow(boolean z2) {
        this.A = z2;
    }

    public void setControllerHideDuringAds(boolean z2) {
        this.B = z2;
    }

    public void setControllerHideOnTouch(boolean z2) {
        q40.h(this.m);
        this.C = z2;
        K();
    }

    public void setControllerShowTimeoutMs(int i2) {
        q40.h(this.m);
        this.z = i2;
        if (this.m.K()) {
            G();
        }
    }

    public void setControllerVisibilityListener(PlayerControlView.d dVar) {
        q40.h(this.m);
        PlayerControlView.d dVar2 = this.r;
        if (dVar2 != dVar) {
            if (dVar2 != null) {
                this.m.O(dVar2);
            }
            this.r = dVar;
            if (dVar != null) {
                this.m.C(dVar);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        q40.f(this.l != null);
        this.y = charSequence;
        L();
    }

    @Deprecated
    public void setDefaultArtwork(Bitmap bitmap) {
        setDefaultArtwork((Drawable) bitmap == null ? null : new BitmapDrawable(getResources(), bitmap));
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.t != drawable) {
            this.t = drawable;
            M(false);
        }
    }

    public void setErrorMessageProvider(w40<? super b0> w40) {
        if (this.x != w40) {
            this.x = w40;
            L();
        }
    }

    public void setFastForwardIncrementMs(int i2) {
        q40.h(this.m);
        this.m.setFastForwardIncrementMs(i2);
    }

    public void setKeepContentOnPlayerReset(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
            M(false);
        }
    }

    public void setPlaybackPreparer(p0 p0Var) {
        q40.h(this.m);
        this.m.setPlaybackPreparer(p0Var);
    }

    public void setPlayer(r0 r0Var) {
        q40.f(Looper.myLooper() == Looper.getMainLooper());
        q40.a(r0Var == null || r0Var.O() == Looper.getMainLooper());
        r0 r0Var2 = this.p;
        if (r0Var2 != r0Var) {
            if (r0Var2 != null) {
                r0Var2.v(this.e);
                r0.c z2 = r0Var2.z();
                if (z2 != null) {
                    z2.U(this.e);
                    View view = this.h;
                    if (view instanceof TextureView) {
                        z2.p((TextureView) view);
                    } else if (view instanceof SphericalGLSurfaceView) {
                        ((SphericalGLSurfaceView) view).setVideoComponent((r0.c) null);
                    } else if (view instanceof VideoDecoderGLSurfaceView) {
                        z2.r((n) null);
                    } else if (view instanceof SurfaceView) {
                        z2.I((SurfaceView) view);
                    }
                }
                r0.b W = r0Var2.W();
                if (W != null) {
                    W.u(this.e);
                }
            }
            this.p = r0Var;
            if (O()) {
                this.m.setPlayer(r0Var);
            }
            SubtitleView subtitleView = this.j;
            if (subtitleView != null) {
                subtitleView.setCues((List<h20>) null);
            }
            J();
            L();
            M(true);
            if (r0Var != null) {
                r0.c z3 = r0Var.z();
                if (z3 != null) {
                    View view2 = this.h;
                    if (view2 instanceof TextureView) {
                        z3.R((TextureView) view2);
                    } else if (view2 instanceof SphericalGLSurfaceView) {
                        ((SphericalGLSurfaceView) view2).setVideoComponent(z3);
                    } else if (view2 instanceof VideoDecoderGLSurfaceView) {
                        z3.r(((VideoDecoderGLSurfaceView) view2).getVideoDecoderOutputBufferRenderer());
                    } else if (view2 instanceof SurfaceView) {
                        z3.t((SurfaceView) view2);
                    }
                    z3.x(this.e);
                }
                r0.b W2 = r0Var.W();
                if (W2 != null) {
                    W2.J(this.e);
                }
                r0Var.q(this.e);
                A(false);
                return;
            }
            w();
        }
    }

    public void setRepeatToggleModes(int i2) {
        q40.h(this.m);
        this.m.setRepeatToggleModes(i2);
    }

    public void setResizeMode(int i2) {
        q40.h(this.f);
        this.f.setResizeMode(i2);
    }

    public void setRewindIncrementMs(int i2) {
        q40.h(this.m);
        this.m.setRewindIncrementMs(i2);
    }

    public void setShowBuffering(int i2) {
        if (this.u != i2) {
            this.u = i2;
            J();
        }
    }

    @Deprecated
    public void setShowBuffering(boolean z2) {
        setShowBuffering(z2 ? 1 : 0);
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        q40.h(this.m);
        this.m.setShowMultiWindowTimeBar(z2);
    }

    public void setShowShuffleButton(boolean z2) {
        q40.h(this.m);
        this.m.setShowShuffleButton(z2);
    }

    public void setShutterBackgroundColor(int i2) {
        View view = this.g;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setUseArtwork(boolean z2) {
        q40.f(!z2 || this.i != null);
        if (this.s != z2) {
            this.s = z2;
            M(false);
        }
    }

    public void setUseController(boolean z2) {
        PlayerControlView playerControlView;
        r0 r0Var;
        q40.f(!z2 || this.m != null);
        if (this.q != z2) {
            this.q = z2;
            if (O()) {
                playerControlView = this.m;
                r0Var = this.p;
            } else {
                PlayerControlView playerControlView2 = this.m;
                if (playerControlView2 != null) {
                    playerControlView2.H();
                    playerControlView = this.m;
                    r0Var = null;
                }
                K();
            }
            playerControlView.setPlayer(r0Var);
            K();
        }
    }

    public void setUseSensorRotation(boolean z2) {
        if (this.w != z2) {
            this.w = z2;
            View view = this.h;
            if (view instanceof SphericalGLSurfaceView) {
                ((SphericalGLSurfaceView) view).setUseSensorRotation(z2);
            }
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.h;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }

    public boolean u(KeyEvent keyEvent) {
        return O() && this.m.E(keyEvent);
    }

    public void w() {
        PlayerControlView playerControlView = this.m;
        if (playerControlView != null) {
            playerControlView.H();
        }
    }

    public boolean x() {
        PlayerControlView playerControlView = this.m;
        return playerControlView != null && playerControlView.K();
    }
}
