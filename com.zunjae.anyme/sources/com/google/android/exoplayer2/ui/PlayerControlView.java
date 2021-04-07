package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.exoplayer2.b0;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.o0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.ui.g;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.x;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class PlayerControlView extends FrameLayout {
    private final Drawable A;
    private final String B;
    private final String C;
    private final String D;
    private final Drawable E;
    private final Drawable F;
    private final float G;
    private final float H;
    private final String I;
    private final String J;
    /* access modifiers changed from: private */
    public r0 K;
    /* access modifiers changed from: private */
    public w L;
    private c M;
    /* access modifiers changed from: private */
    public p0 N;
    private boolean O;
    private boolean P;
    private boolean Q;
    /* access modifiers changed from: private */
    public boolean R;
    private int S;
    private int T;
    private int U;
    private int V;
    /* access modifiers changed from: private */
    public int W;
    private boolean a0;
    private long b0;
    private long[] c0;
    private boolean[] d0;
    private final b e;
    private long[] e0;
    private final CopyOnWriteArrayList<d> f;
    private boolean[] f0;
    /* access modifiers changed from: private */
    public final View g;
    private long g0;
    /* access modifiers changed from: private */
    public final View h;
    /* access modifiers changed from: private */
    public final View i;
    /* access modifiers changed from: private */
    public final View j;
    /* access modifiers changed from: private */
    public final View k;
    /* access modifiers changed from: private */
    public final View l;
    /* access modifiers changed from: private */
    public final ImageView m;
    /* access modifiers changed from: private */
    public final ImageView n;
    private final View o;
    private final TextView p;
    /* access modifiers changed from: private */
    public final TextView q;
    private final g r;
    /* access modifiers changed from: private */
    public final StringBuilder s;
    /* access modifiers changed from: private */
    public final Formatter t;
    private final b1.b u;
    private final b1.c v;
    private final Runnable w;
    private final Runnable x;
    private final Drawable y;
    private final Drawable z;

    private final class b implements r0.a, g.a, View.OnClickListener {
        private b() {
        }

        public void A(int i) {
            PlayerControlView.this.b0();
            PlayerControlView.this.Y();
        }

        @Deprecated
        public /* synthetic */ void D(b1 b1Var, Object obj, int i) {
            q0.l(this, b1Var, obj, i);
        }

        public /* synthetic */ void L(p00 p00, i40 i40) {
            q0.m(this, p00, i40);
        }

        public void R(boolean z) {
            PlayerControlView.this.a0();
        }

        public void a(g gVar, long j) {
            if (PlayerControlView.this.q != null) {
                PlayerControlView.this.q.setText(v50.T(PlayerControlView.this.s, PlayerControlView.this.t, j));
            }
        }

        public void b(g gVar, long j, boolean z) {
            boolean unused = PlayerControlView.this.R = false;
            if (!z && PlayerControlView.this.K != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.T(playerControlView.K, j);
            }
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
            PlayerControlView.this.Y();
            PlayerControlView.this.d0();
        }

        public void g(g gVar, long j) {
            boolean unused = PlayerControlView.this.R = true;
            if (PlayerControlView.this.q != null) {
                PlayerControlView.this.q.setText(v50.T(PlayerControlView.this.s, PlayerControlView.this.t, j));
            }
        }

        public /* synthetic */ void j(b0 b0Var) {
            q0.e(this, b0Var);
        }

        public /* synthetic */ void l() {
            q0.i(this);
        }

        public void n(b1 b1Var, int i) {
            PlayerControlView.this.Y();
            PlayerControlView.this.d0();
        }

        public void onClick(View view) {
            r0 x = PlayerControlView.this.K;
            if (x != null) {
                if (PlayerControlView.this.h == view) {
                    PlayerControlView.this.M(x);
                } else if (PlayerControlView.this.g == view) {
                    PlayerControlView.this.N(x);
                } else if (PlayerControlView.this.k == view) {
                    PlayerControlView.this.F(x);
                } else if (PlayerControlView.this.l == view) {
                    PlayerControlView.this.Q(x);
                } else if (PlayerControlView.this.i == view) {
                    if (x.h() == 1) {
                        if (PlayerControlView.this.N != null) {
                            PlayerControlView.this.N.a();
                        }
                    } else if (x.h() == 4) {
                        boolean unused = PlayerControlView.this.R(x, x.w(), -9223372036854775807L);
                    }
                    PlayerControlView.this.L.d(x, true);
                } else if (PlayerControlView.this.j == view) {
                    PlayerControlView.this.L.d(x, false);
                } else if (PlayerControlView.this.m == view) {
                    PlayerControlView.this.L.a(x, m50.a(x.G(), PlayerControlView.this.W));
                } else if (PlayerControlView.this.n == view) {
                    PlayerControlView.this.L.c(x, !x.P());
                }
            }
        }

        public void u(boolean z) {
            PlayerControlView.this.c0();
            PlayerControlView.this.Y();
        }

        public void z(boolean z, int i) {
            PlayerControlView.this.Z();
            PlayerControlView.this.a0();
        }
    }

    public interface c {
        void a(long j, long j2);
    }

    public interface d {
        void a(int i);
    }

    static {
        e0.a("goog.exo.ui");
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PlayerControlView(android.content.Context r4, android.util.AttributeSet r5, int r6, android.util.AttributeSet r7) {
        /*
            r3 = this;
            r3.<init>(r4, r5, r6)
            int r5 = com.google.android.exoplayer2.ui.R$layout.exo_player_control_view
            r6 = 5000(0x1388, float:7.006E-42)
            r3.S = r6
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.T = r0
            r3.U = r6
            r6 = 0
            r3.W = r6
            r0 = 200(0xc8, float:2.8E-43)
            r3.V = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b0 = r0
            r3.a0 = r6
            if (r7 == 0) goto L_0x0075
            android.content.res.Resources$Theme r0 = r4.getTheme()
            int[] r1 = com.google.android.exoplayer2.ui.R$styleable.PlayerControlView
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r7, r1, r6, r6)
            int r1 = com.google.android.exoplayer2.ui.R$styleable.PlayerControlView_rewind_increment     // Catch:{ all -> 0x0070 }
            int r2 = r3.S     // Catch:{ all -> 0x0070 }
            int r1 = r0.getInt(r1, r2)     // Catch:{ all -> 0x0070 }
            r3.S = r1     // Catch:{ all -> 0x0070 }
            int r1 = com.google.android.exoplayer2.ui.R$styleable.PlayerControlView_fastforward_increment     // Catch:{ all -> 0x0070 }
            int r2 = r3.T     // Catch:{ all -> 0x0070 }
            int r1 = r0.getInt(r1, r2)     // Catch:{ all -> 0x0070 }
            r3.T = r1     // Catch:{ all -> 0x0070 }
            int r1 = com.google.android.exoplayer2.ui.R$styleable.PlayerControlView_show_timeout     // Catch:{ all -> 0x0070 }
            int r2 = r3.U     // Catch:{ all -> 0x0070 }
            int r1 = r0.getInt(r1, r2)     // Catch:{ all -> 0x0070 }
            r3.U = r1     // Catch:{ all -> 0x0070 }
            int r1 = com.google.android.exoplayer2.ui.R$styleable.PlayerControlView_controller_layout_id     // Catch:{ all -> 0x0070 }
            int r5 = r0.getResourceId(r1, r5)     // Catch:{ all -> 0x0070 }
            int r1 = r3.W     // Catch:{ all -> 0x0070 }
            int r1 = G(r0, r1)     // Catch:{ all -> 0x0070 }
            r3.W = r1     // Catch:{ all -> 0x0070 }
            int r1 = com.google.android.exoplayer2.ui.R$styleable.PlayerControlView_show_shuffle_button     // Catch:{ all -> 0x0070 }
            boolean r2 = r3.a0     // Catch:{ all -> 0x0070 }
            boolean r1 = r0.getBoolean(r1, r2)     // Catch:{ all -> 0x0070 }
            r3.a0 = r1     // Catch:{ all -> 0x0070 }
            int r1 = com.google.android.exoplayer2.ui.R$styleable.PlayerControlView_time_bar_min_update_interval     // Catch:{ all -> 0x0070 }
            int r2 = r3.V     // Catch:{ all -> 0x0070 }
            int r1 = r0.getInt(r1, r2)     // Catch:{ all -> 0x0070 }
            r3.setTimeBarMinUpdateInterval(r1)     // Catch:{ all -> 0x0070 }
            r0.recycle()
            goto L_0x0075
        L_0x0070:
            r4 = move-exception
            r0.recycle()
            throw r4
        L_0x0075:
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.f = r0
            com.google.android.exoplayer2.b1$b r0 = new com.google.android.exoplayer2.b1$b
            r0.<init>()
            r3.u = r0
            com.google.android.exoplayer2.b1$c r0 = new com.google.android.exoplayer2.b1$c
            r0.<init>()
            r3.v = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3.s = r0
            java.util.Formatter r0 = new java.util.Formatter
            java.lang.StringBuilder r1 = r3.s
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.<init>(r1, r2)
            r3.t = r0
            long[] r0 = new long[r6]
            r3.c0 = r0
            boolean[] r0 = new boolean[r6]
            r3.d0 = r0
            long[] r0 = new long[r6]
            r3.e0 = r0
            boolean[] r0 = new boolean[r6]
            r3.f0 = r0
            com.google.android.exoplayer2.ui.PlayerControlView$b r0 = new com.google.android.exoplayer2.ui.PlayerControlView$b
            r1 = 0
            r0.<init>()
            r3.e = r0
            com.google.android.exoplayer2.x r0 = new com.google.android.exoplayer2.x
            r0.<init>()
            r3.L = r0
            com.google.android.exoplayer2.ui.d r0 = new com.google.android.exoplayer2.ui.d
            r0.<init>(r3)
            r3.w = r0
            com.google.android.exoplayer2.ui.a r0 = new com.google.android.exoplayer2.ui.a
            r0.<init>(r3)
            r3.x = r0
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r4)
            r0.inflate(r5, r3)
            r5 = 262144(0x40000, float:3.67342E-40)
            r3.setDescendantFocusability(r5)
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_progress
            android.view.View r5 = r3.findViewById(r5)
            com.google.android.exoplayer2.ui.g r5 = (com.google.android.exoplayer2.ui.g) r5
            int r0 = com.google.android.exoplayer2.ui.R$id.exo_progress_placeholder
            android.view.View r0 = r3.findViewById(r0)
            if (r5 == 0) goto L_0x00ea
        L_0x00e7:
            r3.r = r5
            goto L_0x0110
        L_0x00ea:
            if (r0 == 0) goto L_0x010e
            com.google.android.exoplayer2.ui.DefaultTimeBar r5 = new com.google.android.exoplayer2.ui.DefaultTimeBar
            r5.<init>(r4, r1, r6, r7)
            int r7 = com.google.android.exoplayer2.ui.R$id.exo_progress
            r5.setId(r7)
            android.view.ViewGroup$LayoutParams r7 = r0.getLayoutParams()
            r5.setLayoutParams(r7)
            android.view.ViewParent r7 = r0.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r1 = r7.indexOfChild(r0)
            r7.removeView(r0)
            r7.addView(r5, r1)
            goto L_0x00e7
        L_0x010e:
            r3.r = r1
        L_0x0110:
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_duration
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.p = r5
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_position
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.q = r5
            com.google.android.exoplayer2.ui.g r5 = r3.r
            if (r5 == 0) goto L_0x012d
            com.google.android.exoplayer2.ui.PlayerControlView$b r7 = r3.e
            r5.b(r7)
        L_0x012d:
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_play
            android.view.View r5 = r3.findViewById(r5)
            r3.i = r5
            if (r5 == 0) goto L_0x013c
            com.google.android.exoplayer2.ui.PlayerControlView$b r7 = r3.e
            r5.setOnClickListener(r7)
        L_0x013c:
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_pause
            android.view.View r5 = r3.findViewById(r5)
            r3.j = r5
            if (r5 == 0) goto L_0x014b
            com.google.android.exoplayer2.ui.PlayerControlView$b r7 = r3.e
            r5.setOnClickListener(r7)
        L_0x014b:
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_prev
            android.view.View r5 = r3.findViewById(r5)
            r3.g = r5
            if (r5 == 0) goto L_0x015a
            com.google.android.exoplayer2.ui.PlayerControlView$b r7 = r3.e
            r5.setOnClickListener(r7)
        L_0x015a:
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_next
            android.view.View r5 = r3.findViewById(r5)
            r3.h = r5
            if (r5 == 0) goto L_0x0169
            com.google.android.exoplayer2.ui.PlayerControlView$b r7 = r3.e
            r5.setOnClickListener(r7)
        L_0x0169:
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_rew
            android.view.View r5 = r3.findViewById(r5)
            r3.l = r5
            if (r5 == 0) goto L_0x0178
            com.google.android.exoplayer2.ui.PlayerControlView$b r7 = r3.e
            r5.setOnClickListener(r7)
        L_0x0178:
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_ffwd
            android.view.View r5 = r3.findViewById(r5)
            r3.k = r5
            if (r5 == 0) goto L_0x0187
            com.google.android.exoplayer2.ui.PlayerControlView$b r7 = r3.e
            r5.setOnClickListener(r7)
        L_0x0187:
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_repeat_toggle
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r3.m = r5
            if (r5 == 0) goto L_0x0198
            com.google.android.exoplayer2.ui.PlayerControlView$b r7 = r3.e
            r5.setOnClickListener(r7)
        L_0x0198:
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_shuffle
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r3.n = r5
            if (r5 == 0) goto L_0x01a9
            com.google.android.exoplayer2.ui.PlayerControlView$b r7 = r3.e
            r5.setOnClickListener(r7)
        L_0x01a9:
            int r5 = com.google.android.exoplayer2.ui.R$id.exo_vr
            android.view.View r5 = r3.findViewById(r5)
            r3.o = r5
            r3.setShowVrButton(r6)
            android.content.res.Resources r4 = r4.getResources()
            int r5 = com.google.android.exoplayer2.ui.R$integer.exo_media_button_opacity_percentage_enabled
            int r5 = r4.getInteger(r5)
            float r5 = (float) r5
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r6
            r3.G = r5
            int r5 = com.google.android.exoplayer2.ui.R$integer.exo_media_button_opacity_percentage_disabled
            int r5 = r4.getInteger(r5)
            float r5 = (float) r5
            float r5 = r5 / r6
            r3.H = r5
            int r5 = com.google.android.exoplayer2.ui.R$drawable.exo_controls_repeat_off
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.y = r5
            int r5 = com.google.android.exoplayer2.ui.R$drawable.exo_controls_repeat_one
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.z = r5
            int r5 = com.google.android.exoplayer2.ui.R$drawable.exo_controls_repeat_all
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.A = r5
            int r5 = com.google.android.exoplayer2.ui.R$drawable.exo_controls_shuffle_on
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.E = r5
            int r5 = com.google.android.exoplayer2.ui.R$drawable.exo_controls_shuffle_off
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.F = r5
            int r5 = com.google.android.exoplayer2.ui.R$string.exo_controls_repeat_off_description
            java.lang.String r5 = r4.getString(r5)
            r3.B = r5
            int r5 = com.google.android.exoplayer2.ui.R$string.exo_controls_repeat_one_description
            java.lang.String r5 = r4.getString(r5)
            r3.C = r5
            int r5 = com.google.android.exoplayer2.ui.R$string.exo_controls_repeat_all_description
            java.lang.String r5 = r4.getString(r5)
            r3.D = r5
            int r5 = com.google.android.exoplayer2.ui.R$string.exo_controls_shuffle_on_description
            java.lang.String r5 = r4.getString(r5)
            r3.I = r5
            int r5 = com.google.android.exoplayer2.ui.R$string.exo_controls_shuffle_off_description
            java.lang.String r4 = r4.getString(r5)
            r3.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerControlView.<init>(android.content.Context, android.util.AttributeSet, int, android.util.AttributeSet):void");
    }

    private static boolean D(b1 b1Var, b1.c cVar) {
        if (b1Var.p() > 100) {
            return false;
        }
        int p2 = b1Var.p();
        for (int i2 = 0; i2 < p2; i2++) {
            if (b1Var.n(i2, cVar).l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void F(r0 r0Var) {
        int i2;
        if (r0Var.o() && (i2 = this.T) > 0) {
            S(r0Var, (long) i2);
        }
    }

    private static int G(TypedArray typedArray, int i2) {
        return typedArray.getInt(R$styleable.PlayerControlView_repeat_toggle_modes, i2);
    }

    private void I() {
        removeCallbacks(this.x);
        if (this.U > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i2 = this.U;
            this.b0 = uptimeMillis + ((long) i2);
            if (this.O) {
                postDelayed(this.x, (long) i2);
                return;
            }
            return;
        }
        this.b0 = -9223372036854775807L;
    }

    @SuppressLint({"InlinedApi"})
    private static boolean J(int i2) {
        return i2 == 90 || i2 == 89 || i2 == 85 || i2 == 126 || i2 == 127 || i2 == 87 || i2 == 88;
    }

    /* access modifiers changed from: private */
    public void M(r0 r0Var) {
        b1 N2 = r0Var.N();
        if (!N2.q() && !r0Var.f()) {
            int w2 = r0Var.w();
            int H2 = r0Var.H();
            if (H2 != -1) {
                R(r0Var, H2, -9223372036854775807L);
            } else if (N2.n(w2, this.v).g) {
                R(r0Var, w2, -9223372036854775807L);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r2.f == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N(com.google.android.exoplayer2.r0 r8) {
        /*
            r7 = this;
            com.google.android.exoplayer2.b1 r0 = r8.N()
            boolean r1 = r0.q()
            if (r1 != 0) goto L_0x0043
            boolean r1 = r8.f()
            if (r1 == 0) goto L_0x0011
            goto L_0x0043
        L_0x0011:
            int r1 = r8.w()
            com.google.android.exoplayer2.b1$c r2 = r7.v
            r0.n(r1, r2)
            int r0 = r8.B()
            r2 = -1
            if (r0 == r2) goto L_0x003e
            long r2 = r8.V()
            r4 = 3000(0xbb8, double:1.482E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0035
            com.google.android.exoplayer2.b1$c r2 = r7.v
            boolean r3 = r2.g
            if (r3 == 0) goto L_0x003e
            boolean r2 = r2.f
            if (r2 != 0) goto L_0x003e
        L_0x0035:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.R(r8, r0, r1)
            goto L_0x0043
        L_0x003e:
            r2 = 0
            r7.R(r8, r1, r2)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerControlView.N(com.google.android.exoplayer2.r0):void");
    }

    private void P() {
        View view;
        View view2;
        boolean V2 = V();
        if (!V2 && (view2 = this.i) != null) {
            view2.requestFocus();
        } else if (V2 && (view = this.j) != null) {
            view.requestFocus();
        }
    }

    /* access modifiers changed from: private */
    public void Q(r0 r0Var) {
        int i2;
        if (r0Var.o() && (i2 = this.S) > 0) {
            S(r0Var, (long) (-i2));
        }
    }

    /* access modifiers changed from: private */
    public boolean R(r0 r0Var, int i2, long j2) {
        return this.L.b(r0Var, i2, j2);
    }

    private void S(r0 r0Var, long j2) {
        long V2 = r0Var.V() + j2;
        long M2 = r0Var.M();
        if (M2 != -9223372036854775807L) {
            V2 = Math.min(V2, M2);
        }
        R(r0Var, r0Var.w(), Math.max(V2, 0));
    }

    /* access modifiers changed from: private */
    public void T(r0 r0Var, long j2) {
        int i2;
        b1 N2 = r0Var.N();
        if (this.Q && !N2.q()) {
            int p2 = N2.p();
            i2 = 0;
            while (true) {
                long c2 = N2.n(i2, this.v).c();
                if (j2 < c2) {
                    break;
                } else if (i2 == p2 - 1) {
                    j2 = c2;
                    break;
                } else {
                    j2 -= c2;
                    i2++;
                }
            }
        } else {
            i2 = r0Var.w();
        }
        if (!R(r0Var, i2, j2)) {
            a0();
        }
    }

    private void U(boolean z2, View view) {
        if (view != null) {
            view.setEnabled(z2);
            view.setAlpha(z2 ? this.G : this.H);
            view.setVisibility(0);
        }
    }

    private boolean V() {
        r0 r0Var = this.K;
        return (r0Var == null || r0Var.h() == 4 || this.K.h() == 1 || !this.K.j()) ? false : true;
    }

    private void X() {
        Z();
        Y();
        b0();
        c0();
        d0();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Y() {
        /*
            r8 = this;
            boolean r0 = r8.K()
            if (r0 == 0) goto L_0x0080
            boolean r0 = r8.O
            if (r0 != 0) goto L_0x000c
            goto L_0x0080
        L_0x000c:
            com.google.android.exoplayer2.r0 r0 = r8.K
            r1 = 0
            if (r0 == 0) goto L_0x0061
            com.google.android.exoplayer2.b1 r2 = r0.N()
            boolean r3 = r2.q()
            if (r3 != 0) goto L_0x0061
            boolean r3 = r0.f()
            if (r3 != 0) goto L_0x0061
            int r3 = r0.w()
            com.google.android.exoplayer2.b1$c r4 = r8.v
            r2.n(r3, r4)
            com.google.android.exoplayer2.b1$c r2 = r8.v
            boolean r3 = r2.f
            r4 = 1
            if (r3 != 0) goto L_0x003e
            boolean r2 = r2.g
            if (r2 == 0) goto L_0x003e
            boolean r2 = r0.hasPrevious()
            if (r2 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = 0
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            if (r3 == 0) goto L_0x0047
            int r5 = r8.S
            if (r5 <= 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            if (r3 == 0) goto L_0x0050
            int r6 = r8.T
            if (r6 <= 0) goto L_0x0050
            r6 = 1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            com.google.android.exoplayer2.b1$c r7 = r8.v
            boolean r7 = r7.g
            if (r7 != 0) goto L_0x005d
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            r0 = r1
            r1 = r2
            goto L_0x0065
        L_0x0061:
            r0 = 0
            r3 = 0
            r5 = 0
            r6 = 0
        L_0x0065:
            android.view.View r2 = r8.g
            r8.U(r1, r2)
            android.view.View r1 = r8.l
            r8.U(r5, r1)
            android.view.View r1 = r8.k
            r8.U(r6, r1)
            android.view.View r1 = r8.h
            r8.U(r0, r1)
            com.google.android.exoplayer2.ui.g r0 = r8.r
            if (r0 == 0) goto L_0x0080
            r0.setEnabled(r3)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerControlView.Y():void");
    }

    /* access modifiers changed from: private */
    public void Z() {
        boolean z2;
        if (K() && this.O) {
            boolean V2 = V();
            View view = this.i;
            int i2 = 8;
            boolean z3 = true;
            if (view != null) {
                z2 = (V2 && view.isFocused()) | false;
                this.i.setVisibility(V2 ? 8 : 0);
            } else {
                z2 = false;
            }
            View view2 = this.j;
            if (view2 != null) {
                if (V2 || !view2.isFocused()) {
                    z3 = false;
                }
                z2 |= z3;
                View view3 = this.j;
                if (V2) {
                    i2 = 0;
                }
                view3.setVisibility(i2);
            }
            if (z2) {
                P();
            }
        }
    }

    /* access modifiers changed from: private */
    public void a0() {
        long j2;
        if (K() && this.O) {
            r0 r0Var = this.K;
            long j3 = 0;
            if (r0Var != null) {
                j3 = this.g0 + r0Var.A();
                j2 = this.g0 + r0Var.Q();
            } else {
                j2 = 0;
            }
            TextView textView = this.q;
            if (textView != null && !this.R) {
                textView.setText(v50.T(this.s, this.t, j3));
            }
            g gVar = this.r;
            if (gVar != null) {
                gVar.setPosition(j3);
                this.r.setBufferedPosition(j2);
            }
            c cVar = this.M;
            if (cVar != null) {
                cVar.a(j3, j2);
            }
            removeCallbacks(this.w);
            int h2 = r0Var == null ? 1 : r0Var.h();
            long j4 = 1000;
            if (r0Var != null && r0Var.C()) {
                g gVar2 = this.r;
                long min = Math.min(gVar2 != null ? gVar2.getPreferredUpdateDelay() : 1000, 1000 - (j3 % 1000));
                float f2 = r0Var.e().a;
                if (f2 > Utils.FLOAT_EPSILON) {
                    j4 = (long) (((float) min) / f2);
                }
                postDelayed(this.w, v50.p(j4, (long) this.V, 1000));
            } else if (h2 != 4 && h2 != 1) {
                postDelayed(this.w, 1000);
            }
        }
    }

    /* access modifiers changed from: private */
    public void b0() {
        ImageView imageView;
        String str;
        ImageView imageView2;
        if (K() && this.O && (imageView = this.m) != null) {
            if (this.W == 0) {
                imageView.setVisibility(8);
                return;
            }
            r0 r0Var = this.K;
            if (r0Var == null) {
                U(false, imageView);
                this.m.setImageDrawable(this.y);
                this.m.setContentDescription(this.B);
                return;
            }
            U(true, imageView);
            int G2 = r0Var.G();
            if (G2 == 0) {
                this.m.setImageDrawable(this.y);
                imageView2 = this.m;
                str = this.B;
            } else if (G2 != 1) {
                if (G2 == 2) {
                    this.m.setImageDrawable(this.A);
                    imageView2 = this.m;
                    str = this.D;
                }
                this.m.setVisibility(0);
            } else {
                this.m.setImageDrawable(this.z);
                imageView2 = this.m;
                str = this.C;
            }
            imageView2.setContentDescription(str);
            this.m.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void c0() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (K() && this.O && (imageView = this.n) != null) {
            r0 r0Var = this.K;
            if (!this.a0) {
                imageView.setVisibility(8);
                return;
            }
            if (r0Var == null) {
                U(false, imageView);
                this.n.setImageDrawable(this.F);
                imageView2 = this.n;
            } else {
                U(true, imageView);
                this.n.setImageDrawable(r0Var.P() ? this.E : this.F);
                imageView2 = this.n;
                if (r0Var.P()) {
                    str = this.I;
                    imageView2.setContentDescription(str);
                }
            }
            str = this.J;
            imageView2.setContentDescription(str);
        }
    }

    /* access modifiers changed from: private */
    public void d0() {
        int i2;
        b1.c cVar;
        r0 r0Var = this.K;
        if (r0Var != null) {
            boolean z2 = true;
            this.Q = this.P && D(r0Var.N(), this.v);
            long j2 = 0;
            this.g0 = 0;
            b1 N2 = r0Var.N();
            if (!N2.q()) {
                int w2 = r0Var.w();
                int i3 = this.Q ? 0 : w2;
                int p2 = this.Q ? N2.p() - 1 : w2;
                long j3 = 0;
                i2 = 0;
                while (true) {
                    if (i3 > p2) {
                        break;
                    }
                    if (i3 == w2) {
                        this.g0 = v.b(j3);
                    }
                    N2.n(i3, this.v);
                    b1.c cVar2 = this.v;
                    if (cVar2.l == -9223372036854775807L) {
                        q40.f(this.Q ^ z2);
                        break;
                    }
                    int i4 = cVar2.i;
                    while (true) {
                        cVar = this.v;
                        if (i4 > cVar.j) {
                            break;
                        }
                        N2.f(i4, this.u);
                        int c2 = this.u.c();
                        for (int i5 = 0; i5 < c2; i5++) {
                            long f2 = this.u.f(i5);
                            if (f2 == Long.MIN_VALUE) {
                                long j4 = this.u.d;
                                if (j4 == -9223372036854775807L) {
                                } else {
                                    f2 = j4;
                                }
                            }
                            long l2 = f2 + this.u.l();
                            if (l2 >= 0) {
                                long[] jArr = this.c0;
                                if (i2 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.c0 = Arrays.copyOf(this.c0, length);
                                    this.d0 = Arrays.copyOf(this.d0, length);
                                }
                                this.c0[i2] = v.b(j3 + l2);
                                this.d0[i2] = this.u.m(i5);
                                i2++;
                            }
                        }
                        i4++;
                    }
                    j3 += cVar.l;
                    i3++;
                    z2 = true;
                }
                j2 = j3;
            } else {
                i2 = 0;
            }
            long b2 = v.b(j2);
            TextView textView = this.p;
            if (textView != null) {
                textView.setText(v50.T(this.s, this.t, b2));
            }
            g gVar = this.r;
            if (gVar != null) {
                gVar.setDuration(b2);
                int length2 = this.e0.length;
                int i6 = i2 + length2;
                long[] jArr2 = this.c0;
                if (i6 > jArr2.length) {
                    this.c0 = Arrays.copyOf(jArr2, i6);
                    this.d0 = Arrays.copyOf(this.d0, i6);
                }
                System.arraycopy(this.e0, 0, this.c0, i2, length2);
                System.arraycopy(this.f0, 0, this.d0, i2, length2);
                this.r.a(this.c0, this.d0, i6);
            }
            a0();
        }
    }

    public void C(d dVar) {
        this.f.add(dVar);
    }

    public boolean E(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        r0 r0Var = this.K;
        if (r0Var == null || !J(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                F(r0Var);
            } else if (keyCode == 89) {
                Q(r0Var);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 85) {
                    this.L.d(r0Var, !r0Var.j());
                } else if (keyCode == 87) {
                    M(r0Var);
                } else if (keyCode == 88) {
                    N(r0Var);
                } else if (keyCode == 126) {
                    this.L.d(r0Var, true);
                } else if (keyCode == 127) {
                    this.L.d(r0Var, false);
                }
            }
        }
        return true;
    }

    public void H() {
        if (K()) {
            setVisibility(8);
            Iterator<d> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            removeCallbacks(this.w);
            removeCallbacks(this.x);
            this.b0 = -9223372036854775807L;
        }
    }

    public boolean K() {
        return getVisibility() == 0;
    }

    public void O(d dVar) {
        this.f.remove(dVar);
    }

    public void W() {
        if (!K()) {
            setVisibility(0);
            Iterator<d> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            X();
            P();
        }
        I();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return E(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.x);
        } else if (motionEvent.getAction() == 1) {
            I();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public r0 getPlayer() {
        return this.K;
    }

    public int getRepeatToggleModes() {
        return this.W;
    }

    public boolean getShowShuffleButton() {
        return this.a0;
    }

    public int getShowTimeoutMs() {
        return this.U;
    }

    public boolean getShowVrButton() {
        View view = this.o;
        return view != null && view.getVisibility() == 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        long j2 = this.b0;
        if (j2 != -9223372036854775807L) {
            long uptimeMillis = j2 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                H();
            } else {
                postDelayed(this.x, uptimeMillis);
            }
        } else if (K()) {
            I();
        }
        X();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O = false;
        removeCallbacks(this.w);
        removeCallbacks(this.x);
    }

    public void setControlDispatcher(w wVar) {
        if (wVar == null) {
            wVar = new x();
        }
        this.L = wVar;
    }

    public void setFastForwardIncrementMs(int i2) {
        this.T = i2;
        Y();
    }

    public void setPlaybackPreparer(p0 p0Var) {
        this.N = p0Var;
    }

    public void setPlayer(r0 r0Var) {
        boolean z2 = true;
        q40.f(Looper.myLooper() == Looper.getMainLooper());
        if (!(r0Var == null || r0Var.O() == Looper.getMainLooper())) {
            z2 = false;
        }
        q40.a(z2);
        r0 r0Var2 = this.K;
        if (r0Var2 != r0Var) {
            if (r0Var2 != null) {
                r0Var2.v(this.e);
            }
            this.K = r0Var;
            if (r0Var != null) {
                r0Var.q(this.e);
            }
            X();
        }
    }

    public void setProgressUpdateListener(c cVar) {
        this.M = cVar;
    }

    public void setRepeatToggleModes(int i2) {
        int i3;
        w wVar;
        r0 r0Var;
        this.W = i2;
        r0 r0Var2 = this.K;
        if (r0Var2 != null) {
            int G2 = r0Var2.G();
            if (i2 != 0 || G2 == 0) {
                i3 = 2;
                if (i2 == 1 && G2 == 2) {
                    this.L.a(this.K, 1);
                } else if (i2 == 2 && G2 == 1) {
                    wVar = this.L;
                    r0Var = this.K;
                }
            } else {
                wVar = this.L;
                r0Var = this.K;
                i3 = 0;
            }
            wVar.a(r0Var, i3);
        }
        b0();
    }

    public void setRewindIncrementMs(int i2) {
        this.S = i2;
        Y();
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        this.P = z2;
        d0();
    }

    public void setShowShuffleButton(boolean z2) {
        this.a0 = z2;
        c0();
    }

    public void setShowTimeoutMs(int i2) {
        this.U = i2;
        if (K()) {
            I();
        }
    }

    public void setShowVrButton(boolean z2) {
        View view = this.o;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.V = v50.o(i2, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.o;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }
}
