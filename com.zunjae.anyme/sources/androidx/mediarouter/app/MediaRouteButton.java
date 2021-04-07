package androidx.mediarouter.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.widget.i0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.k;
import androidx.mediarouter.R$attr;
import androidx.mediarouter.R$string;
import androidx.mediarouter.R$styleable;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.h;
import java.util.ArrayList;
import java.util.List;

public class MediaRouteButton extends View {
    private static a t;
    static final SparseArray<Drawable.ConstantState> u = new SparseArray<>(2);
    private static final int[] v = {16842912};
    private static final int[] w = {16842911};
    private final h e;
    private final b f;
    private g g;
    private e h;
    private boolean i;
    private int j;
    c k;
    private Drawable l;
    private int m;
    private int n;
    private ColorStateList o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;

    private static final class a extends BroadcastReceiver {
        private final Context a;
        private boolean b = true;
        private List<MediaRouteButton> c;

        a(Context context) {
            this.a = context;
            this.c = new ArrayList();
        }

        public boolean a() {
            return this.b;
        }

        public void b(MediaRouteButton mediaRouteButton) {
            if (this.c.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.a.registerReceiver(this, intentFilter);
            }
            this.c.add(mediaRouteButton);
        }

        public void c(MediaRouteButton mediaRouteButton) {
            this.c.remove(mediaRouteButton);
            if (this.c.size() == 0) {
                this.a.unregisterReceiver(this);
            }
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && this.b != (!intent.getBooleanExtra("noConnectivity", false))) {
                this.b = z;
                for (MediaRouteButton d : this.c) {
                    d.d();
                }
            }
        }
    }

    private final class b extends h.a {
        b() {
        }

        public void a(h hVar, h.e eVar) {
            MediaRouteButton.this.c();
        }

        public void b(h hVar, h.e eVar) {
            MediaRouteButton.this.c();
        }

        public void c(h hVar, h.e eVar) {
            MediaRouteButton.this.c();
        }

        public void d(h hVar, h.f fVar) {
            MediaRouteButton.this.c();
        }

        public void e(h hVar, h.f fVar) {
            MediaRouteButton.this.c();
        }

        public void g(h hVar, h.f fVar) {
            MediaRouteButton.this.c();
        }

        public void h(h hVar, h.f fVar) {
            MediaRouteButton.this.c();
        }

        public void i(h hVar, h.f fVar) {
            MediaRouteButton.this.c();
        }
    }

    private final class c extends AsyncTask<Void, Void, Drawable> {
        private final int a;
        private final Context b;

        c(int i, Context context) {
            this.a = i;
            this.b = context;
        }

        private void a(Drawable drawable) {
            if (drawable != null) {
                MediaRouteButton.u.put(this.a, drawable.getConstantState());
            }
            MediaRouteButton.this.k = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Drawable doInBackground(Void... voidArr) {
            if (MediaRouteButton.u.get(this.a) == null) {
                return this.b.getResources().getDrawable(this.a);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onCancelled(Drawable drawable) {
            a(drawable);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void onPostExecute(Drawable drawable) {
            if (drawable != null) {
                a(drawable);
            } else {
                Drawable.ConstantState constantState = MediaRouteButton.u.get(this.a);
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                MediaRouteButton.this.k = null;
            }
            MediaRouteButton.this.setRemoteIndicatorDrawableInternal(drawable);
        }
    }

    public MediaRouteButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i2) {
        super(i.a(context), attributeSet, i2);
        Drawable.ConstantState constantState;
        this.g = g.c;
        this.h = e.a();
        this.j = 0;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.MediaRouteButton, i2, 0);
        if (isInEditMode()) {
            this.e = null;
            this.f = null;
            this.l = getResources().getDrawable(obtainStyledAttributes.getResourceId(R$styleable.MediaRouteButton_externalRouteEnabledDrawableStatic, 0));
            return;
        }
        this.e = h.g(context2);
        this.f = new b();
        if (t == null) {
            t = new a(context2.getApplicationContext());
        }
        this.o = obtainStyledAttributes.getColorStateList(R$styleable.MediaRouteButton_mediaRouteButtonTint);
        this.p = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MediaRouteButton_android_minWidth, 0);
        this.q = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MediaRouteButton_android_minHeight, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MediaRouteButton_externalRouteEnabledDrawableStatic, 0);
        this.m = obtainStyledAttributes.getResourceId(R$styleable.MediaRouteButton_externalRouteEnabledDrawable, 0);
        obtainStyledAttributes.recycle();
        int i3 = this.m;
        if (!(i3 == 0 || (constantState = u.get(i3)) == null)) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.l == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = u.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    c cVar = new c(resourceId, getContext());
                    this.k = cVar;
                    cVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                b();
            }
        }
        f();
        setClickable(true);
    }

    private void b() {
        if (this.m > 0) {
            c cVar = this.k;
            if (cVar != null) {
                cVar.cancel(false);
            }
            c cVar2 = new c(this.m, getContext());
            this.k = cVar2;
            this.m = 0;
            cVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private void f() {
        int i2 = this.n;
        setContentDescription(getContext().getString(i2 != 1 ? i2 != 2 ? R$string.mr_cast_button_disconnected : R$string.mr_cast_button_connected : R$string.mr_cast_button_connecting));
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private k getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).q();
        }
        return null;
    }

    public void a() {
        this.r = true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        boolean z;
        h.f j2 = this.e.j();
        boolean z2 = false;
        int c2 = !j2.x() && j2.F(this.g) ? j2.c() : 0;
        if (this.n != c2) {
            this.n = c2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f();
            refreshDrawableState();
        }
        if (c2 == 1) {
            b();
        }
        if (this.i) {
            if (this.s || this.e.k(this.g, 1)) {
                z2 = true;
            }
            setEnabled(z2);
        }
        Drawable drawable = this.l;
        if (drawable != null && (drawable.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.l.getCurrent();
            if (this.i) {
                if ((z || c2 == 1) && !animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            } else if (c2 == 2) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        super.setVisibility((this.j != 0 || this.s || t.a()) ? this.j : 4);
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.l != null) {
            this.l.setState(getDrawableState());
            invalidate();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.mediarouter.app.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.mediarouter.app.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: androidx.mediarouter.app.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: androidx.mediarouter.app.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r4 = this;
            boolean r0 = r4.i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            androidx.fragment.app.k r0 = r4.getFragmentManager()
            if (r0 == 0) goto L_0x0060
            androidx.mediarouter.media.h r2 = r4.e
            androidx.mediarouter.media.h$f r2 = r2.j()
            boolean r3 = r2.x()
            if (r3 != 0) goto L_0x003b
            androidx.mediarouter.media.g r3 = r4.g
            boolean r2 = r2.F(r3)
            if (r2 != 0) goto L_0x0021
            goto L_0x003b
        L_0x0021:
            java.lang.String r2 = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment"
            androidx.fragment.app.Fragment r3 = r0.Z(r2)
            if (r3 == 0) goto L_0x002a
            return r1
        L_0x002a:
            androidx.mediarouter.app.e r1 = r4.h
            androidx.mediarouter.app.d r1 = r1.c()
            androidx.mediarouter.media.g r3 = r4.g
            r1.a2(r3)
            boolean r3 = r4.r
            r1.b2(r3)
            goto L_0x0054
        L_0x003b:
            java.lang.String r2 = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment"
            androidx.fragment.app.Fragment r3 = r0.Z(r2)
            if (r3 == 0) goto L_0x0044
            return r1
        L_0x0044:
            androidx.mediarouter.app.e r1 = r4.h
            androidx.mediarouter.app.b r1 = r1.b()
            androidx.mediarouter.media.g r3 = r4.g
            r1.b2(r3)
            boolean r3 = r4.r
            r1.c2(r3)
        L_0x0054:
            androidx.fragment.app.s r0 = r0.j()
            r0.e(r1, r2)
            r0.j()
            r0 = 1
            return r0
        L_0x0060:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The activity must be a subclass of FragmentActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.e():boolean");
    }

    public e getDialogFactory() {
        return this.h;
    }

    public g getRouteSelector() {
        return this.g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.i = true;
            if (!this.g.f()) {
                this.e.a(this.g, this.f);
            }
            c();
            t.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        int i3 = this.n;
        if (i3 == 1) {
            View.mergeDrawableStates(onCreateDrawableState, w);
        } else if (i3 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, v);
        }
        return onCreateDrawableState;
    }

    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.i = false;
            if (!this.g.f()) {
                this.e.l(this.f);
            }
            t.c(this);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.l != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.l.getIntrinsicWidth();
            int intrinsicHeight = this.l.getIntrinsicHeight();
            int i2 = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i3 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.l.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.l.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i4 = this.p;
        Drawable drawable = this.l;
        int i5 = 0;
        int max = Math.max(i4, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i6 = this.q;
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            i5 = drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
        }
        int max2 = Math.max(i6, i5);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        b();
        return e() || performClick;
    }

    public void setAlwaysVisible(boolean z) {
        if (z != this.s) {
            this.s = z;
            d();
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void setCheatSheetEnabled(boolean z) {
        i0.a(this, z ? getContext().getString(R$string.mr_button_content_description) : null);
    }

    public void setDialogFactory(e eVar) {
        if (eVar != null) {
            this.h = eVar;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.m = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        Drawable drawable2;
        c cVar = this.k;
        if (cVar != null) {
            cVar.cancel(false);
        }
        Drawable drawable3 = this.l;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.l);
        }
        if (drawable != null) {
            if (this.o != null) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.o);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.l = drawable;
        refreshDrawableState();
        if (this.i && (drawable2 = this.l) != null && (drawable2.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.l.getCurrent();
            int i2 = this.n;
            if (i2 == 1) {
                if (!animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            } else if (i2 == 2) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    public void setRouteSelector(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.g.equals(gVar)) {
            if (this.i) {
                if (!this.g.f()) {
                    this.e.l(this.f);
                }
                if (!gVar.f()) {
                    this.e.a(gVar, this.f);
                }
            }
            this.g = gVar;
            c();
        }
    }

    public void setVisibility(int i2) {
        this.j = i2;
        d();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.l;
    }
}
