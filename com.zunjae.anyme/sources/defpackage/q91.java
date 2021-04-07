package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$plurals;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.j;
import com.google.android.material.internal.m;
import java.lang.ref.WeakReference;

/* renamed from: q91  reason: default package */
public class q91 extends Drawable implements j.b {
    private static final int u = R$style.Widget_MaterialComponents_Badge;
    private static final int v = R$attr.badgeStyle;
    private final WeakReference<Context> e;
    private final ra1 f = new ra1();
    private final j g;
    private final Rect h = new Rect();
    private final float i;
    private final float j;
    private final float k;
    private final a l;
    private float m;
    private float n;
    private int o;
    private float p;
    private float q;
    private float r;
    private WeakReference<View> s;
    private WeakReference<ViewGroup> t;

    /* renamed from: q91$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0134a();
        /* access modifiers changed from: private */
        public int e;
        /* access modifiers changed from: private */
        public int f;
        /* access modifiers changed from: private */
        public int g = 255;
        /* access modifiers changed from: private */
        public int h = -1;
        /* access modifiers changed from: private */
        public int i;
        /* access modifiers changed from: private */
        public CharSequence j;
        /* access modifiers changed from: private */
        public int k;
        /* access modifiers changed from: private */
        public int l;
        /* access modifiers changed from: private */
        public int m;
        /* access modifiers changed from: private */
        public int n;
        /* access modifiers changed from: private */
        public int o;

        /* renamed from: q91$a$a  reason: collision with other inner class name */
        static class C0134a implements Parcelable.Creator<a> {
            C0134a() {
            }

            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: b */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Context context) {
            this.f = new da1(context, R$style.TextAppearance_MaterialComponents_Badge).a.getDefaultColor();
            this.j = context.getString(R$string.mtrl_badge_numberless_content_description);
            this.k = R$plurals.mtrl_badge_content_description;
            this.l = R$string.mtrl_exceed_max_badge_number_content_description;
        }

        protected a(Parcel parcel) {
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readString();
            this.k = parcel.readInt();
            this.m = parcel.readInt();
            this.n = parcel.readInt();
            this.o = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeString(this.j.toString());
            parcel.writeInt(this.k);
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
        }
    }

    private q91(Context context) {
        this.e = new WeakReference<>(context);
        m.c(context);
        Resources resources = context.getResources();
        this.i = (float) resources.getDimensionPixelSize(R$dimen.mtrl_badge_radius);
        this.k = (float) resources.getDimensionPixelSize(R$dimen.mtrl_badge_long_text_horizontal_padding);
        this.j = (float) resources.getDimensionPixelSize(R$dimen.mtrl_badge_with_text_radius);
        j jVar = new j(this);
        this.g = jVar;
        jVar.e().setTextAlign(Paint.Align.CENTER);
        this.l = new a(context);
        w(R$style.TextAppearance_MaterialComponents_Badge);
    }

    private void A() {
        this.o = ((int) Math.pow(10.0d, ((double) i()) - 1.0d)) - 1;
    }

    private void b(Context context, Rect rect, View view) {
        float f2;
        int j2 = this.l.m;
        this.n = (float) ((j2 == 8388691 || j2 == 8388693) ? rect.bottom - this.l.o : rect.top + this.l.o);
        if (j() <= 9) {
            f2 = !l() ? this.i : this.j;
            this.p = f2;
            this.r = f2;
        } else {
            float f3 = this.j;
            this.p = f3;
            this.r = f3;
            f2 = (this.g.f(g()) / 2.0f) + this.k;
        }
        this.q = f2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(l() ? R$dimen.mtrl_badge_text_horizontal_edge_offset : R$dimen.mtrl_badge_horizontal_edge_offset);
        int j3 = this.l.m;
        this.m = (j3 == 8388659 || j3 == 8388691 ? o4.y(view) != 0 : o4.y(view) == 0) ? ((((float) rect.right) + this.q) - ((float) dimensionPixelSize)) - ((float) this.l.n) : (((float) rect.left) - this.q) + ((float) dimensionPixelSize) + ((float) this.l.n);
    }

    public static q91 c(Context context) {
        return d(context, (AttributeSet) null, v, u);
    }

    private static q91 d(Context context, AttributeSet attributeSet, int i2, int i3) {
        q91 q91 = new q91(context);
        q91.m(context, attributeSet, i2, i3);
        return q91;
    }

    static q91 e(Context context, a aVar) {
        q91 q91 = new q91(context);
        q91.o(aVar);
        return q91;
    }

    private void f(Canvas canvas) {
        Rect rect = new Rect();
        String g2 = g();
        this.g.e().getTextBounds(g2, 0, g2.length(), rect);
        canvas.drawText(g2, this.m, this.n + ((float) (rect.height() / 2)), this.g.e());
    }

    private String g() {
        if (j() <= this.o) {
            return Integer.toString(j());
        }
        Context context = (Context) this.e.get();
        if (context == null) {
            return "";
        }
        return context.getString(R$string.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.o), "+"});
    }

    private void m(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray h2 = m.h(context, attributeSet, R$styleable.Badge, i2, i3, new int[0]);
        t(h2.getInt(R$styleable.Badge_maxCharacterCount, 4));
        if (h2.hasValue(R$styleable.Badge_number)) {
            u(h2.getInt(R$styleable.Badge_number, 0));
        }
        p(n(context, h2, R$styleable.Badge_backgroundColor));
        if (h2.hasValue(R$styleable.Badge_badgeTextColor)) {
            r(n(context, h2, R$styleable.Badge_badgeTextColor));
        }
        q(h2.getInt(R$styleable.Badge_badgeGravity, 8388661));
        s(h2.getDimensionPixelOffset(R$styleable.Badge_horizontalOffset, 0));
        x(h2.getDimensionPixelOffset(R$styleable.Badge_verticalOffset, 0));
        h2.recycle();
    }

    private static int n(Context context, TypedArray typedArray, int i2) {
        return ca1.a(context, typedArray, i2).getDefaultColor();
    }

    private void o(a aVar) {
        t(aVar.i);
        if (aVar.h != -1) {
            u(aVar.h);
        }
        p(aVar.e);
        r(aVar.f);
        q(aVar.m);
        s(aVar.n);
        x(aVar.o);
    }

    private void v(da1 da1) {
        Context context;
        if (this.g.d() != da1 && (context = (Context) this.e.get()) != null) {
            this.g.h(da1, context);
            z();
        }
    }

    private void w(int i2) {
        Context context = (Context) this.e.get();
        if (context != null) {
            v(new da1(context, i2));
        }
    }

    private void z() {
        Context context = (Context) this.e.get();
        WeakReference<View> weakReference = this.s;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.h);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.t;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null || r91.a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            b(context, rect2, view);
            r91.f(this.h, this.m, this.n, this.q, this.r);
            this.f.V(this.p);
            if (!rect.equals(this.h)) {
                this.f.setBounds(this.h);
            }
        }
    }

    public void a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f.draw(canvas);
            if (l()) {
                f(canvas);
            }
        }
    }

    public int getAlpha() {
        return this.l.g;
    }

    public int getIntrinsicHeight() {
        return this.h.height();
    }

    public int getIntrinsicWidth() {
        return this.h.width();
    }

    public int getOpacity() {
        return -3;
    }

    public CharSequence h() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!l()) {
            return this.l.j;
        }
        if (this.l.k <= 0 || (context = (Context) this.e.get()) == null) {
            return null;
        }
        if (j() <= this.o) {
            return context.getResources().getQuantityString(this.l.k, j(), new Object[]{Integer.valueOf(j())});
        }
        return context.getString(this.l.l, new Object[]{Integer.valueOf(this.o)});
    }

    public int i() {
        return this.l.i;
    }

    public boolean isStateful() {
        return false;
    }

    public int j() {
        if (!l()) {
            return 0;
        }
        return this.l.h;
    }

    public a k() {
        return this.l;
    }

    public boolean l() {
        return this.l.h != -1;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p(int i2) {
        int unused = this.l.e = i2;
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        if (this.f.x() != valueOf) {
            this.f.Y(valueOf);
            invalidateSelf();
        }
    }

    public void q(int i2) {
        if (this.l.m != i2) {
            int unused = this.l.m = i2;
            WeakReference<View> weakReference = this.s;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.s.get();
                WeakReference<ViewGroup> weakReference2 = this.t;
                y(view, weakReference2 != null ? (ViewGroup) weakReference2.get() : null);
            }
        }
    }

    public void r(int i2) {
        int unused = this.l.f = i2;
        if (this.g.e().getColor() != i2) {
            this.g.e().setColor(i2);
            invalidateSelf();
        }
    }

    public void s(int i2) {
        int unused = this.l.n = i2;
        z();
    }

    public void setAlpha(int i2) {
        int unused = this.l.g = i2;
        this.g.e().setAlpha(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void t(int i2) {
        if (this.l.i != i2) {
            int unused = this.l.i = i2;
            A();
            this.g.i(true);
            z();
            invalidateSelf();
        }
    }

    public void u(int i2) {
        int max = Math.max(0, i2);
        if (this.l.h != max) {
            int unused = this.l.h = max;
            this.g.i(true);
            z();
            invalidateSelf();
        }
    }

    public void x(int i2) {
        int unused = this.l.o = i2;
        z();
    }

    public void y(View view, ViewGroup viewGroup) {
        this.s = new WeakReference<>(view);
        this.t = new WeakReference<>(viewGroup);
        z();
        invalidateSelf();
    }
}
