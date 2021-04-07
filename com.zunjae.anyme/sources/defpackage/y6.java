package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: y6  reason: default package */
public class y6 extends d7 implements Animatable {
    private b f;
    private Context g;
    private ArgbEvaluator h;
    final Drawable.Callback i;

    /* renamed from: y6$a */
    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            y6.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            y6.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            y6.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: y6$b */
    private static class b extends Drawable.ConstantState {
        int a;
        e7 b;
        AnimatorSet c;
        ArrayList<Animator> d;
        b0<Animator, String> e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.a = bVar.a;
                e7 e7Var = bVar.b;
                if (e7Var != null) {
                    Drawable.ConstantState constantState = e7Var.getConstantState();
                    this.b = (e7) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    e7 e7Var2 = this.b;
                    e7Var2.mutate();
                    e7 e7Var3 = e7Var2;
                    this.b = e7Var3;
                    e7Var3.setCallback(callback);
                    this.b.setBounds(bVar.b.getBounds());
                    this.b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new b0<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.e.get(animator);
                        clone.setTarget(this.b.d(str));
                        this.d.add(clone);
                        this.e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: y6$c */
    private static class c extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            y6 y6Var = new y6();
            Drawable newDrawable = this.a.newDrawable();
            y6Var.e = newDrawable;
            newDrawable.setCallback(y6Var.i);
            return y6Var;
        }

        public Drawable newDrawable(Resources resources) {
            y6 y6Var = new y6();
            Drawable newDrawable = this.a.newDrawable(resources);
            y6Var.e = newDrawable;
            newDrawable.setCallback(y6Var.i);
            return y6Var;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            y6 y6Var = new y6();
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            y6Var.e = newDrawable;
            newDrawable.setCallback(y6Var.i);
            return y6Var;
        }
    }

    y6() {
        this((Context) null, (b) null, (Resources) null);
    }

    private y6(Context context) {
        this(context, (b) null, (Resources) null);
    }

    private y6(Context context, b bVar, Resources resources) {
        this.h = null;
        this.i = new a();
        this.g = context;
        if (bVar != null) {
            this.f = bVar;
        } else {
            this.f = new b(context, bVar, this.i, resources);
        }
    }

    public static y6 a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        y6 y6Var = new y6(context);
        y6Var.inflate(resources, xmlPullParser, attributeSet, theme);
        return y6Var;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f.b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        b bVar = this.f;
        if (bVar.d == null) {
            bVar.d = new ArrayList<>();
            this.f.e = new b0<>();
        }
        this.f.d.add(animator);
        this.f.e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                c(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.h == null) {
                    this.h = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.h);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f.b.draw(canvas);
        if (this.f.c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f.b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f.a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f.b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.e == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.e.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f.b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f.b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getOpacity() : this.f.b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = i2.s(resources, theme, attributeSet, w6.e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        e7 b2 = e7.b(resources, resourceId, theme);
                        b2.h(false);
                        b2.setCallback(this.i);
                        e7 e7Var = this.f.b;
                        if (e7Var != null) {
                            e7Var.setCallback((Drawable.Callback) null);
                        }
                        this.f.b = b2;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, w6.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.g;
                        if (context != null) {
                            b(string, a7.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f.b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.e;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f.c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.isStateful() : this.f.b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f.b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setLevel(i2) : this.f.b.setLevel(i2);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setState(iArr) : this.f.b.setState(iArr);
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f.b.setAlpha(i2);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f.b.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f.b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i2);
        } else {
            this.f.b.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f.b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f.b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f.c.isStarted()) {
            this.f.c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f.c.end();
        }
    }
}
