package com.google.android.gms.cast.framework.media.widget;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.R$drawable;
import com.google.android.gms.cast.framework.R$id;
import com.google.android.gms.cast.framework.R$layout;
import com.google.android.gms.cast.framework.R$string;
import com.google.android.gms.cast.framework.R$style;
import com.google.android.gms.cast.framework.R$styleable;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.cast.framework.g;
import com.google.android.gms.cast.framework.h;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.cast.framework.media.internal.o;
import com.google.android.gms.cast.l;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.m;
import java.util.Timer;

public class ExpandedControllerActivity extends AppCompatActivity {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    /* access modifiers changed from: private */
    public TextView Q;
    private CastSeekBar R;
    private ImageView S;
    private ImageView T;
    private int[] U;
    private ImageView[] V = new ImageView[4];
    private View W;
    private View X;
    /* access modifiers changed from: private */
    public ImageView Y;
    /* access modifiers changed from: private */
    public TextView Z;
    private TextView a0;
    /* access modifiers changed from: private */
    public TextView b0;
    private TextView c0;
    private com.google.android.gms.cast.framework.media.internal.b d0;
    private h60 e0;
    private g f0;
    /* access modifiers changed from: private */
    public boolean g0;
    private boolean h0;
    private Timer i0;
    private String j0;
    private final h<c> w = new b(this, (c) null);
    private final i.b x = new a(this, (c) null);
    private int y;
    private int z;

    class a implements i.b {
        private a() {
        }

        /* synthetic */ a(ExpandedControllerActivity expandedControllerActivity, c cVar) {
            this();
        }

        public final void a() {
            ExpandedControllerActivity.this.T();
        }

        public final void b() {
        }

        public final void c() {
        }

        public final void d() {
            i R = ExpandedControllerActivity.this.K();
            if (R != null && R.o()) {
                boolean unused = ExpandedControllerActivity.this.g0 = false;
                ExpandedControllerActivity.this.U();
                ExpandedControllerActivity.this.V();
            } else if (!ExpandedControllerActivity.this.g0) {
                ExpandedControllerActivity.this.finish();
            }
        }

        public final void e() {
            ExpandedControllerActivity.this.V();
        }

        public final void f() {
            ExpandedControllerActivity.this.Q.setText(ExpandedControllerActivity.this.getResources().getString(R$string.cast_expanded_controller_loading));
        }
    }

    class b implements h<c> {
        private b() {
        }

        /* synthetic */ b(ExpandedControllerActivity expandedControllerActivity, c cVar) {
            this();
        }

        public final /* bridge */ /* synthetic */ void g(f fVar, int i) {
            c cVar = (c) fVar;
        }

        public final /* bridge */ /* synthetic */ void h(f fVar, String str) {
            c cVar = (c) fVar;
        }

        public final /* synthetic */ void i(f fVar, int i) {
            c cVar = (c) fVar;
            ExpandedControllerActivity.this.finish();
        }

        public final /* bridge */ /* synthetic */ void j(f fVar, String str) {
            c cVar = (c) fVar;
        }

        public final /* bridge */ /* synthetic */ void k(f fVar, int i) {
            c cVar = (c) fVar;
        }

        public final /* bridge */ /* synthetic */ void l(f fVar, boolean z) {
            c cVar = (c) fVar;
        }

        public final /* bridge */ /* synthetic */ void m(f fVar, int i) {
            c cVar = (c) fVar;
        }

        public final /* bridge */ /* synthetic */ void n(f fVar) {
            c cVar = (c) fVar;
        }

        public final /* bridge */ /* synthetic */ void o(f fVar) {
            c cVar = (c) fVar;
        }
    }

    /* access modifiers changed from: private */
    public final i K() {
        c c = this.f0.c();
        if (c == null || !c.c()) {
            return null;
        }
        return c.p();
    }

    private final void M(View view, int i, int i2, h60 h60) {
        ImageView imageView = (ImageView) view.findViewById(i);
        if (i2 == R$id.cast_button_type_empty) {
            imageView.setVisibility(4);
        } else if (i2 == R$id.cast_button_type_custom) {
        } else {
            if (i2 == R$id.cast_button_type_play_pause_toggle) {
                imageView.setBackgroundResource(this.y);
                Drawable c = g.c(this, this.M, this.A);
                Drawable c2 = g.c(this, this.M, this.z);
                Drawable c3 = g.c(this, this.M, this.B);
                imageView.setImageDrawable(c2);
                h60.r(imageView, c2, c, c3, (View) null, false);
            } else if (i2 == R$id.cast_button_type_skip_previous) {
                imageView.setBackgroundResource(this.y);
                imageView.setImageDrawable(g.c(this, this.M, this.C));
                imageView.setContentDescription(getResources().getString(R$string.cast_skip_prev));
                h60.y(imageView, 0);
            } else if (i2 == R$id.cast_button_type_skip_next) {
                imageView.setBackgroundResource(this.y);
                imageView.setImageDrawable(g.c(this, this.M, this.D));
                imageView.setContentDescription(getResources().getString(R$string.cast_skip_next));
                h60.x(imageView, 0);
            } else if (i2 == R$id.cast_button_type_rewind_30_seconds) {
                imageView.setBackgroundResource(this.y);
                imageView.setImageDrawable(g.c(this, this.M, this.E));
                imageView.setContentDescription(getResources().getString(R$string.cast_rewind_30));
                h60.w(imageView, 30000);
            } else if (i2 == R$id.cast_button_type_forward_30_seconds) {
                imageView.setBackgroundResource(this.y);
                imageView.setImageDrawable(g.c(this, this.M, this.F));
                imageView.setContentDescription(getResources().getString(R$string.cast_forward_30));
                h60.u(imageView, 30000);
            } else if (i2 == R$id.cast_button_type_mute_toggle) {
                imageView.setBackgroundResource(this.y);
                imageView.setImageDrawable(g.c(this, this.M, this.G));
                h60.q(imageView);
            } else if (i2 == R$id.cast_button_type_closed_caption) {
                imageView.setBackgroundResource(this.y);
                imageView.setImageDrawable(g.c(this, this.M, this.H));
                h60.t(imageView);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void T() {
        MediaInfo j;
        l p;
        ActionBar A2;
        i K2 = K();
        if (K2 != null && K2.o() && (j = K2.j()) != null && (p = j.p()) != null && (A2 = A()) != null) {
            A2.y(p.m("com.google.android.gms.cast.metadata.TITLE"));
            A2.x(o.a(p));
        }
    }

    /* access modifiers changed from: private */
    public final void U() {
        CastDevice o;
        c c = this.f0.c();
        if (!(c == null || (o = c.o()) == null)) {
            String k = o.k();
            if (!TextUtils.isEmpty(k)) {
                this.Q.setText(getResources().getString(R$string.cast_casting_to_device, new Object[]{k}));
                return;
            }
        }
        this.Q.setText("");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
    @android.annotation.TargetApi(23)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V() {
        /*
            r8 = this;
            com.google.android.gms.cast.framework.media.i r0 = r8.K()
            if (r0 == 0) goto L_0x00df
            com.google.android.gms.cast.q r1 = r0.k()
            if (r1 != 0) goto L_0x000e
            goto L_0x00df
        L_0x000e:
            com.google.android.gms.cast.q r1 = r0.k()
            boolean r1 = r1.j0()
            r2 = 0
            r3 = 8
            if (r1 == 0) goto L_0x00c0
            boolean r1 = com.google.android.gms.common.util.m.d()
            r4 = 0
            if (r1 == 0) goto L_0x0052
            android.widget.ImageView r1 = r8.T
            int r1 = r1.getVisibility()
            if (r1 != r3) goto L_0x0052
            android.widget.ImageView r1 = r8.S
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            if (r1 == 0) goto L_0x0052
            boolean r5 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r5 == 0) goto L_0x0052
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            if (r1 == 0) goto L_0x0052
            r5 = 1048576000(0x3e800000, float:0.25)
            r6 = 1089470464(0x40f00000, float:7.5)
            android.graphics.Bitmap r1 = com.google.android.gms.cast.framework.media.widget.g.a(r8, r1, r5, r6)
            if (r1 == 0) goto L_0x0052
            android.widget.ImageView r5 = r8.T
            r5.setImageBitmap(r1)
            android.widget.ImageView r1 = r8.T
            r1.setVisibility(r4)
        L_0x0052:
            com.google.android.gms.cast.q r1 = r0.k()
            com.google.android.gms.cast.a r1 = r1.k()
            if (r1 == 0) goto L_0x0068
            java.lang.String r2 = r1.u()
            java.lang.String r1 = r1.o()
            r7 = r2
            r2 = r1
            r1 = r7
            goto L_0x0069
        L_0x0068:
            r1 = r2
        L_0x0069:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x0073
        L_0x006f:
            r8.b0(r2)
            goto L_0x008d
        L_0x0073:
            java.lang.String r2 = r8.j0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x007e
            java.lang.String r2 = r8.j0
            goto L_0x006f
        L_0x007e:
            android.widget.TextView r2 = r8.Z
            r2.setVisibility(r4)
            android.view.View r2 = r8.X
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r8.Y
            r2.setVisibility(r3)
        L_0x008d:
            android.widget.TextView r2 = r8.a0
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x009f
            android.content.res.Resources r1 = r8.getResources()
            int r3 = com.google.android.gms.cast.framework.R$string.cast_ad_label
            java.lang.String r1 = r1.getString(r3)
        L_0x009f:
            r2.setText(r1)
            boolean r1 = com.google.android.gms.common.util.m.i()
            if (r1 == 0) goto L_0x00b0
            android.widget.TextView r1 = r8.a0
            int r2 = r8.N
            r1.setTextAppearance(r2)
            goto L_0x00b7
        L_0x00b0:
            android.widget.TextView r1 = r8.a0
            int r2 = r8.N
            r1.setTextAppearance(r8, r2)
        L_0x00b7:
            android.view.View r1 = r8.W
            r1.setVisibility(r4)
            r8.X(r0)
            return
        L_0x00c0:
            android.widget.TextView r0 = r8.c0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r8.b0
            r0.setVisibility(r3)
            android.view.View r0 = r8.W
            r0.setVisibility(r3)
            boolean r0 = com.google.android.gms.common.util.m.d()
            if (r0 == 0) goto L_0x00df
            android.widget.ImageView r0 = r8.T
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r8.T
            r0.setImageBitmap(r2)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity.V():void");
    }

    /* access modifiers changed from: private */
    public final void X(i iVar) {
        if (!this.g0 && !iVar.p()) {
            this.b0.setVisibility(8);
            this.c0.setVisibility(8);
            com.google.android.gms.cast.a k = iVar.k().k();
            if (k != null && k.z() != -1) {
                if (!this.h0) {
                    d dVar = new d(this, iVar);
                    Timer timer = new Timer();
                    this.i0 = timer;
                    timer.scheduleAtFixedRate(dVar, 0, 500);
                    this.h0 = true;
                }
                float z2 = (float) (k.z() - iVar.d());
                if (z2 <= Utils.FLOAT_EPSILON) {
                    if (this.h0) {
                        this.i0.cancel();
                        this.h0 = false;
                    }
                    this.b0.setVisibility(0);
                    this.b0.setClickable(true);
                    return;
                }
                this.c0.setVisibility(0);
                this.c0.setText(getResources().getString(R$string.cast_expanded_controller_skip_ad_text, new Object[]{Integer.valueOf((int) Math.ceil((double) (z2 / 1000.0f)))}));
                this.b0.setClickable(false);
            }
        }
    }

    private final void b0(String str) {
        this.d0.e(Uri.parse(str));
        this.X.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g b2 = com.google.android.gms.cast.framework.a.d(this).b();
        this.f0 = b2;
        if (b2.c() == null) {
            finish();
        }
        h60 h60 = new h60(this);
        this.e0 = h60;
        h60.T(this.x);
        setContentView(R$layout.cast_expanded_controller_activity);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{R$attr.selectableItemBackgroundBorderless});
        this.y = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = obtainStyledAttributes((AttributeSet) null, R$styleable.CastExpandedController, com.google.android.gms.cast.framework.R$attr.castExpandedControllerStyle, R$style.CastExpandedController);
        this.M = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castButtonColor, 0);
        this.z = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castPlayButtonDrawable, 0);
        this.A = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castPauseButtonDrawable, 0);
        this.B = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castStopButtonDrawable, 0);
        this.C = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castSkipPreviousButtonDrawable, 0);
        this.D = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castSkipNextButtonDrawable, 0);
        this.E = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castRewind30ButtonDrawable, 0);
        this.F = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castForward30ButtonDrawable, 0);
        this.G = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castMuteToggleButtonDrawable, 0);
        this.H = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castClosedCaptionsButtonDrawable, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castControlButtons, 0);
        if (resourceId != 0) {
            TypedArray obtainTypedArray = getResources().obtainTypedArray(resourceId);
            r.a(obtainTypedArray.length() == 4);
            this.U = new int[obtainTypedArray.length()];
            for (int i = 0; i < obtainTypedArray.length(); i++) {
                this.U[i] = obtainTypedArray.getResourceId(i, 0);
            }
            obtainTypedArray.recycle();
        } else {
            int i2 = R$id.cast_button_type_empty;
            this.U = new int[]{i2, i2, i2, i2};
        }
        this.L = obtainStyledAttributes2.getColor(R$styleable.CastExpandedController_castExpandedControllerLoadingIndicatorColor, 0);
        this.I = getResources().getColor(obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castAdLabelColor, 0));
        this.J = getResources().getColor(obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castAdInProgressTextColor, 0));
        this.K = getResources().getColor(obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castAdLabelTextColor, 0));
        this.N = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castAdLabelTextAppearance, 0);
        this.O = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castAdInProgressLabelTextAppearance, 0);
        this.P = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castAdInProgressText, 0);
        int resourceId2 = obtainStyledAttributes2.getResourceId(R$styleable.CastExpandedController_castDefaultAdPosterUrl, 0);
        if (resourceId2 != 0) {
            this.j0 = getApplicationContext().getResources().getString(resourceId2);
        }
        obtainStyledAttributes2.recycle();
        View findViewById = findViewById(R$id.expanded_controller_layout);
        h60 h602 = this.e0;
        this.S = (ImageView) findViewById.findViewById(R$id.background_image_view);
        this.T = (ImageView) findViewById.findViewById(R$id.blurred_background_image_view);
        View findViewById2 = findViewById.findViewById(R$id.background_place_holder_image_view);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        h602.p(this.S, new com.google.android.gms.cast.framework.media.b(4, displayMetrics.widthPixels, displayMetrics.heightPixels), findViewById2);
        this.Q = (TextView) findViewById.findViewById(R$id.status_text);
        ProgressBar progressBar = (ProgressBar) findViewById.findViewById(R$id.loading_indicator);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        int i3 = this.L;
        if (i3 != 0) {
            indeterminateDrawable.setColorFilter(i3, PorterDuff.Mode.SRC_IN);
        }
        h602.v(progressBar);
        TextView textView = (TextView) findViewById.findViewById(R$id.start_text);
        TextView textView2 = (TextView) findViewById.findViewById(R$id.end_text);
        SeekBar seekBar = (SeekBar) findViewById.findViewById(R$id.seek_bar);
        CastSeekBar castSeekBar = (CastSeekBar) findViewById.findViewById(R$id.cast_seek_bar);
        this.R = castSeekBar;
        h602.s(castSeekBar, 1000);
        h602.z(textView, new za0(textView, h602.c0()));
        h602.z(textView2, new ya0(textView2, h602.c0()));
        View findViewById3 = findViewById.findViewById(R$id.live_indicators);
        h60 h603 = this.e0;
        h603.z(findViewById3, new ab0(findViewById3, h603.c0()));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById.findViewById(R$id.tooltip_container);
        bb0 bb0 = new bb0(relativeLayout, this.R, this.e0.c0());
        this.e0.z(relativeLayout, bb0);
        this.e0.Z(bb0);
        this.V[0] = (ImageView) findViewById.findViewById(R$id.button_0);
        this.V[1] = (ImageView) findViewById.findViewById(R$id.button_1);
        this.V[2] = (ImageView) findViewById.findViewById(R$id.button_2);
        this.V[3] = (ImageView) findViewById.findViewById(R$id.button_3);
        M(findViewById, R$id.button_0, this.U[0], h602);
        M(findViewById, R$id.button_1, this.U[1], h602);
        M(findViewById, R$id.button_play_pause_toggle, R$id.cast_button_type_play_pause_toggle, h602);
        M(findViewById, R$id.button_2, this.U[2], h602);
        M(findViewById, R$id.button_3, this.U[3], h602);
        View findViewById4 = findViewById(R$id.ad_container);
        this.W = findViewById4;
        this.Y = (ImageView) findViewById4.findViewById(R$id.ad_image_view);
        this.X = this.W.findViewById(R$id.ad_background_image_view);
        TextView textView3 = (TextView) this.W.findViewById(R$id.ad_label);
        this.a0 = textView3;
        textView3.setTextColor(this.K);
        this.a0.setBackgroundColor(this.I);
        this.Z = (TextView) this.W.findViewById(R$id.ad_in_progress_label);
        this.c0 = (TextView) findViewById(R$id.ad_skip_text);
        TextView textView4 = (TextView) findViewById(R$id.ad_skip_button);
        this.b0 = textView4;
        textView4.setOnClickListener(new e(this));
        H((Toolbar) findViewById(R$id.toolbar));
        if (A() != null) {
            A().s(true);
            A().u(R$drawable.quantum_ic_keyboard_arrow_down_white_36);
        }
        U();
        T();
        if (!(this.Z == null || this.P == 0)) {
            if (m.i()) {
                this.Z.setTextAppearance(this.O);
            } else {
                this.Z.setTextAppearance(getApplicationContext(), this.O);
            }
            this.Z.setTextColor(this.J);
            this.Z.setText(this.P);
        }
        com.google.android.gms.cast.framework.media.internal.b bVar = new com.google.android.gms.cast.framework.media.internal.b(getApplicationContext(), new com.google.android.gms.cast.framework.media.b(-1, this.Y.getWidth(), this.Y.getHeight()));
        this.d0 = bVar;
        bVar.d(new c(this));
        bn0.c(vh0.CAF_EXPANDED_CONTROLLER);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.d0.b();
        h60 h60 = this.e0;
        if (h60 != null) {
            h60.T((i.b) null);
            this.e0.A();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        com.google.android.gms.cast.framework.a.d(this).b().e(this.w, c.class);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        com.google.android.gms.cast.framework.a.d(this).b().a(this.w, c.class);
        c c = com.google.android.gms.cast.framework.a.d(this).b().c();
        if (c == null || (!c.c() && !c.d())) {
            finish();
        }
        i K2 = K();
        this.g0 = K2 == null || !K2.o();
        U();
        V();
        super.onResume();
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() ^ 2;
            if (m.c()) {
                systemUiVisibility ^= 4;
            }
            if (m.f()) {
                systemUiVisibility ^= 4096;
            }
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
            if (m.e()) {
                setImmersive(true);
            }
        }
    }
}
