package org.aviran.cookiebar2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import org.aviran.cookiebar2.a;

final class Cookie extends LinearLayout implements View.OnTouchListener {
    private Animation e;
    private ViewGroup f;
    private TextView g;
    private TextView h;
    private ImageView i;
    private TextView j;
    /* access modifiers changed from: private */
    public long k;
    private int l;
    private float m;
    private float n;
    private float o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    /* access modifiers changed from: private */
    public boolean u;
    private boolean v;
    private b w;
    /* access modifiers changed from: private */
    public boolean x;
    /* access modifiers changed from: private */
    public boolean y;

    class a implements View.OnClickListener {
        final /* synthetic */ c e;

        a(c cVar) {
            this.e = cVar;
        }

        public void onClick(View view) {
            this.e.a();
            boolean unused = Cookie.this.x = true;
            Cookie.this.k();
        }
    }

    class b implements Animation.AnimationListener {

        class a implements Runnable {
            a() {
            }

            public void run() {
                boolean unused = Cookie.this.y = true;
                Cookie.this.k();
            }
        }

        b() {
        }

        public void onAnimationEnd(Animation animation) {
            if (Cookie.this.u) {
                Cookie.this.postDelayed(new a(), Cookie.this.k);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class c implements Animation.AnimationListener {
        c() {
        }

        public void onAnimationEnd(Animation animation) {
            Cookie.this.setVisibility(8);
            Cookie.this.s();
            Cookie cookie = Cookie.this;
            cookie.h(cookie.o());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class d implements Runnable {
        d() {
        }

        public void run() {
            ViewParent parent = Cookie.this.getParent();
            if (parent != null) {
                Cookie.this.clearAnimation();
                ((ViewGroup) parent).removeView(Cookie.this);
            }
        }
    }

    class e implements Animator.AnimatorListener {
        e() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            Cookie.this.k();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public Cookie(Context context) {
        this(context, (AttributeSet) null);
    }

    public Cookie(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Cookie(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = 2000;
        this.l = 80;
    }

    /* access modifiers changed from: private */
    public void h(int i2) {
        b bVar = this.w;
        if (bVar != null) {
            bVar.a(i2);
        }
    }

    private void i() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.l == 80 ? this.r : this.q);
        loadAnimation.setAnimationListener(new b());
        setAnimation(loadAnimation);
    }

    private void j() {
        this.e = AnimationUtils.loadAnimation(getContext(), this.l == 80 ? this.t : this.s);
    }

    private Animator.AnimatorListener m() {
        return new e();
    }

    /* access modifiers changed from: private */
    public int o() {
        if (this.x) {
            return 2;
        }
        return this.y ? 0 : 3;
    }

    private void q(Context context) {
        int a2 = d.a(context, R$attr.cookieTitleColor, -1);
        int a3 = d.a(context, R$attr.cookieMessageColor, -1);
        int a4 = d.a(context, R$attr.cookieActionColor, -1);
        int a5 = d.a(context, R$attr.cookieBackgroundColor, androidx.core.content.a.d(context, R$color.default_bg_color));
        this.g.setTextColor(a2);
        this.h.setTextColor(a3);
        this.j.setTextColor(a4);
        this.f.setBackgroundColor(a5);
    }

    private void r(int i2, a.c cVar) {
        if (i2 != 0) {
            LinearLayout.inflate(getContext(), i2, this);
            if (cVar != null) {
                cVar.a(getChildAt(0));
            }
        } else {
            LinearLayout.inflate(getContext(), R$layout.layout_cookie, this);
        }
        if (getChildAt(0).getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) getChildAt(0).getLayoutParams()).gravity = 80;
        }
        this.f = (ViewGroup) findViewById(R$id.cookie);
        this.g = (TextView) findViewById(R$id.tv_title);
        this.h = (TextView) findViewById(R$id.tv_message);
        this.i = (ImageView) findViewById(R$id.iv_icon);
        this.j = (TextView) findViewById(R$id.btn_action);
        if (i2 == 0) {
            v();
            q(getContext());
        }
        this.f.setOnTouchListener(this);
    }

    /* access modifiers changed from: private */
    public void s() {
        postDelayed(new d(), 200);
    }

    private void t(TextView textView, int i2) {
        float b2 = (float) d.b(getContext(), i2, 0);
        if (b2 > Utils.FLOAT_EPSILON) {
            textView.setTextSize(0, b2);
        }
    }

    private void v() {
        if (this.f == null || this.g == null || this.h == null || this.i == null || this.j == null) {
            throw new RuntimeException("Your custom cookie view is missing one of the default required views");
        }
    }

    public void k() {
        l((b) null);
    }

    public void l(b bVar) {
        getHandler().removeCallbacksAndMessages((Object) null);
        if (bVar != null) {
            this.w = bVar;
        }
        if (this.p) {
            s();
            h(1);
            return;
        }
        this.e.setAnimationListener(new c());
        startAnimation(this.e);
    }

    public b n() {
        return this.w;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        float width = (float) getWidth();
        this.o = width;
        this.n = width / 3.0f;
        if (this.l == 48) {
            super.onLayout(z, i2, 0, i4, this.f.getMeasuredHeight());
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.v) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            long j2 = 200;
            float f2 = Utils.FLOAT_EPSILON;
            if (action == 1) {
                if (!this.p) {
                    view.animate().x(Utils.FLOAT_EPSILON).alpha(1.0f).setDuration(200).start();
                }
                return true;
            } else if (action != 2) {
                return false;
            } else {
                if (this.p) {
                    return true;
                }
                float rawX = motionEvent.getRawX() - this.m;
                float abs = 1.0f - Math.abs(rawX / this.o);
                if (Math.abs(rawX) > this.n) {
                    rawX = Math.signum(rawX) * this.o;
                    this.p = true;
                } else {
                    f2 = abs;
                    j2 = 0;
                }
                view.animate().setListener(this.p ? m() : null).x(rawX).alpha(f2).setDuration(j2).start();
                return true;
            }
        } else {
            this.m = motionEvent.getRawX();
            return true;
        }
    }

    public int p() {
        return this.l;
    }

    public void u(a.d dVar) {
        ImageView imageView;
        r(dVar.m, dVar.r);
        this.k = dVar.k;
        this.l = dVar.l;
        this.q = dVar.n;
        this.r = dVar.o;
        this.s = dVar.p;
        this.t = dVar.q;
        this.v = dVar.d;
        this.u = dVar.e;
        this.w = dVar.u;
        c cVar = dVar.s;
        if (!(dVar.f == 0 || (imageView = this.i) == null)) {
            imageView.setVisibility(0);
            this.i.setBackgroundResource(dVar.f);
            AnimatorSet animatorSet = dVar.t;
            if (animatorSet != null) {
                animatorSet.setTarget(this.i);
                dVar.t.start();
            }
        }
        if (this.g != null && !TextUtils.isEmpty(dVar.a)) {
            this.g.setVisibility(0);
            this.g.setText(dVar.a);
            if (dVar.h != 0) {
                this.g.setTextColor(androidx.core.content.a.d(getContext(), dVar.h));
            }
            t(this.g, R$attr.cookieTitleSize);
        }
        if (this.h != null && !TextUtils.isEmpty(dVar.b)) {
            this.h.setVisibility(0);
            this.h.setText(dVar.b);
            if (dVar.i != 0) {
                this.h.setTextColor(androidx.core.content.a.d(getContext(), dVar.i));
            }
            t(this.h, R$attr.cookieMessageSize);
        }
        if (!(this.j == null || TextUtils.isEmpty(dVar.c) || cVar == null)) {
            this.j.setVisibility(0);
            this.j.setText(dVar.c);
            this.j.setOnClickListener(new a(cVar));
            if (dVar.j != 0) {
                this.j.setTextColor(androidx.core.content.a.d(getContext(), dVar.j));
            }
            t(this.j, R$attr.cookieActionSize);
        }
        if (dVar.g != 0) {
            this.f.setBackgroundColor(androidx.core.content.a.d(getContext(), dVar.g));
        }
        int b2 = d.b(getContext(), R$attr.cookiePadding, getContext().getResources().getDimensionPixelSize(R$dimen.default_padding));
        if (this.l == 80) {
            this.f.setPadding(b2, b2, b2, b2);
        }
        i();
        j();
    }
}
