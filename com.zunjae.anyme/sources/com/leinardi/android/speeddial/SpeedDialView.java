package com.leinardi.android.speeddial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SpeedDialView extends LinearLayout implements CoordinatorLayout.b {
    /* access modifiers changed from: private */
    public static final String p = SpeedDialView.class.getSimpleName();
    private final g e = new g();
    private List<FabWithLabelView> f = new ArrayList();
    private Drawable g = null;
    private Drawable h = null;
    private Drawable i;
    private FloatingActionButton j;
    private int k;
    private SpeedDialOverlayLayout l;
    /* access modifiers changed from: private */
    public i m;
    /* access modifiers changed from: private */
    public h n;
    private h o = new a();

    public static class NoBehavior extends CoordinatorLayout.Behavior<View> {
        public NoBehavior() {
        }

        public NoBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewSnackbarBehavior extends SnackbarBehavior {
        private boolean d = false;

        public ScrollingViewSnackbarBehavior() {
        }

        public ScrollingViewSnackbarBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return true;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (!this.d && (view2 instanceof RecyclerView)) {
                RecyclerView recyclerView = (RecyclerView) view2;
                if (recyclerView.getAdapter() == null || recyclerView.getAdapter().g() == 0) {
                    I(view);
                    this.d = true;
                }
            }
            return (view2 instanceof RecyclerView) || super.e(coordinatorLayout, view, view2);
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            super.s(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
            this.d = false;
            if (i2 > 0 && view.getVisibility() == 0) {
                F(view);
            } else if (i2 < 0) {
                I(view);
            }
        }
    }

    public static class SnackbarBehavior extends CoordinatorLayout.Behavior<View> {
        private Rect a;
        private FloatingActionButton.b b;
        private boolean c;

        public SnackbarBehavior() {
            this.c = true;
        }

        public SnackbarBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton_Behavior_Layout);
            this.c = obtainStyledAttributes.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        private int E(AppBarLayout appBarLayout) {
            int z = o4.z(appBarLayout);
            if (z != 0) {
                return z * 2;
            }
            int childCount = appBarLayout.getChildCount();
            if (childCount >= 1) {
                return o4.z(appBarLayout.getChildAt(childCount - 1)) * 2;
            }
            return 0;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean H(View view, View view2) {
            return this.c && ((CoordinatorLayout.e) view2.getLayoutParams()).e() == view.getId() && view2.getVisibility() == 0;
        }

        private boolean J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (!H(appBarLayout, view)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= E(appBarLayout)) {
                view.setVisibility(8);
                return true;
            }
            view.setVisibility(0);
            return true;
        }

        private boolean K(View view, View view2) {
            if (!H(view, view2)) {
                return false;
            }
            if (view.getTop() < (view2.getHeight() / 2) + ((CoordinatorLayout.e) view2.getLayoutParams()).topMargin) {
                F(view2);
                return true;
            }
            I(view2);
            return true;
        }

        /* access modifiers changed from: protected */
        public void F(View view) {
            if (view instanceof FloatingActionButton) {
                ((FloatingActionButton) view).l(this.b);
            } else if (view instanceof SpeedDialView) {
                ((SpeedDialView) view).n(this.b);
            } else {
                view.setVisibility(4);
            }
        }

        /* access modifiers changed from: protected */
        public void I(View view) {
            if (view instanceof FloatingActionButton) {
                ((FloatingActionButton) view).s(this.b);
            } else if (view instanceof SpeedDialView) {
                ((SpeedDialView) view).v(this.b);
            } else {
                view.setVisibility(0);
            }
        }

        public void g(CoordinatorLayout.e eVar) {
            if (eVar.h == 0) {
                eVar.h = 80;
            }
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                J(coordinatorLayout, (AppBarLayout) view2, view);
                return false;
            } else if (!G(view2)) {
                return false;
            } else {
                K(view2, view);
                return false;
            }
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            List<View> v = coordinatorLayout.v(view);
            int size = v.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = v.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    if (G(view2) && K(view2, view)) {
                        break;
                    }
                } else if (J(coordinatorLayout, (AppBarLayout) view2, view)) {
                    break;
                }
            }
            coordinatorLayout.M(view, i);
            return true;
        }
    }

    class a implements h {
        a() {
        }

        public boolean a(a aVar) {
            if (SpeedDialView.this.n == null) {
                return false;
            }
            boolean a2 = SpeedDialView.this.n.a(aVar);
            if (!a2) {
                SpeedDialView.this.j(false);
            }
            return a2;
        }
    }

    class b extends FloatingActionButton.b {
        final /* synthetic */ FloatingActionButton.b a;

        b(SpeedDialView speedDialView, FloatingActionButton.b bVar) {
            this.a = bVar;
        }

        public void a(FloatingActionButton floatingActionButton) {
            FloatingActionButton.b bVar = this.a;
            if (bVar != null) {
                bVar.a(floatingActionButton);
            }
        }

        public void b(FloatingActionButton floatingActionButton) {
            try {
                Field declaredField = floatingActionButton.getClass().getDeclaredField("impl");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(floatingActionButton);
                Method declaredMethod = (Build.VERSION.SDK_INT >= 21 ? obj.getClass().getSuperclass() : obj.getClass()).getDeclaredMethod("setImageMatrixScale", new Class[]{Float.TYPE});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, new Object[]{Float.valueOf(1.0f)});
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
                String unused2 = SpeedDialView.p;
            }
            FloatingActionButton.b bVar = this.a;
            if (bVar != null) {
                bVar.b(floatingActionButton);
            }
        }
    }

    class c extends FloatingActionButton.b {
        final /* synthetic */ FloatingActionButton.b a;

        c(FloatingActionButton.b bVar) {
            this.a = bVar;
        }

        public void a(FloatingActionButton floatingActionButton) {
            super.a(floatingActionButton);
            SpeedDialView.this.setVisibility(4);
            FloatingActionButton.b bVar = this.a;
            if (bVar != null) {
                bVar.a(floatingActionButton);
            }
        }

        public void b(FloatingActionButton floatingActionButton) {
            super.b(floatingActionButton);
            FloatingActionButton.b bVar = this.a;
            if (bVar != null) {
                bVar.b(floatingActionButton);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            SpeedDialView.this.i();
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        public void onClick(View view) {
            if (!SpeedDialView.this.q()) {
                SpeedDialView.this.r();
            } else if (SpeedDialView.this.m == null || !SpeedDialView.this.m.a()) {
                SpeedDialView.this.i();
            }
        }
    }

    class f implements Animation.AnimationListener {
        final /* synthetic */ CardView a;

        f(SpeedDialView speedDialView, CardView cardView) {
            this.a = cardView;
        }

        public void onAnimationEnd(Animation animation) {
            this.a.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();
        /* access modifiers changed from: private */
        public boolean e = false;
        /* access modifiers changed from: private */
        public int f = Integer.MIN_VALUE;
        /* access modifiers changed from: private */
        public int g = Integer.MIN_VALUE;
        /* access modifiers changed from: private */
        public int h = 0;
        /* access modifiers changed from: private */
        public float i = 45.0f;
        /* access modifiers changed from: private */
        public boolean j = false;
        /* access modifiers changed from: private */
        public ArrayList<a> k = new ArrayList<>();

        class a implements Parcelable.Creator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            /* renamed from: b */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g() {
        }

        protected g(Parcel parcel) {
            boolean z = false;
            this.e = parcel.readByte() != 0;
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readFloat();
            this.j = parcel.readByte() != 0 ? true : z;
            this.k = parcel.createTypedArrayList(a.CREATOR);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeByte(this.e ? (byte) 1 : 0);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeFloat(this.i);
            parcel.writeByte(this.j ? (byte) 1 : 0);
            parcel.writeTypedList(this.k);
        }
    }

    public interface h {
        boolean a(a aVar);
    }

    public interface i {
        boolean a();

        void b(boolean z);
    }

    public SpeedDialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p(context, attributeSet);
    }

    public SpeedDialView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        p(context, attributeSet);
    }

    private void A() {
        int mainFabOpenedBackgroundColor = q() ? getMainFabOpenedBackgroundColor() : getMainFabClosedBackgroundColor();
        if (mainFabOpenedBackgroundColor != Integer.MIN_VALUE) {
            this.j.setBackgroundTintList(ColorStateList.valueOf(mainFabOpenedBackgroundColor));
        } else {
            this.j.setBackgroundTintList(ColorStateList.valueOf(b.e(getContext())));
        }
    }

    private void B(boolean z) {
        if (q()) {
            Drawable drawable = this.h;
            if (drawable != null) {
                this.j.setImageDrawable(drawable);
            }
            b.j(this.j, getMainFabAnimationRotateAngle(), z);
            return;
        }
        b.i(this.j, z);
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            this.j.setImageDrawable(drawable2);
        }
    }

    private void C(boolean z, boolean z2, boolean z3) {
        int size = this.f.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                FabWithLabelView fabWithLabelView = this.f.get(i2);
                fabWithLabelView.setAlpha(1.0f);
                fabWithLabelView.setVisibility(0);
                if (z2) {
                    y(fabWithLabelView, i2 * 25);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < size; i3++) {
            FabWithLabelView fabWithLabelView2 = this.f.get(z3 ? (size - 1) - i3 : i3);
            if (!z2) {
                fabWithLabelView2.setAlpha(Utils.FLOAT_EPSILON);
                fabWithLabelView2.setVisibility(8);
            } else if (z3) {
                o(fabWithLabelView2, i3 * 25);
            } else {
                b.l(fabWithLabelView2, false);
            }
        }
    }

    private FloatingActionButton k() {
        FloatingActionButton floatingActionButton = new FloatingActionButton(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        int a2 = b.a(getContext(), 4.0f);
        int a3 = b.a(getContext(), -2.0f);
        layoutParams.setMargins(a2, a3, a2, a3);
        floatingActionButton.setUseCompatPadding(true);
        floatingActionButton.setLayoutParams(layoutParams);
        floatingActionButton.setClickable(true);
        floatingActionButton.setFocusable(true);
        floatingActionButton.setSize(0);
        floatingActionButton.setOnClickListener(new e());
        return floatingActionButton;
    }

    private FabWithLabelView l(int i2) {
        for (FabWithLabelView next : this.f) {
            if (next.getId() == i2) {
                return next;
            }
        }
        return null;
    }

    private int m(int i2) {
        return (getExpansionMode() == 0 || getExpansionMode() == 2) ? this.f.size() - i2 : i2 + 1;
    }

    private void o(FabWithLabelView fabWithLabelView, int i2) {
        o4.c(fabWithLabelView).b();
        long j2 = (long) i2;
        b.k(fabWithLabelView.getFab(), j2);
        if (fabWithLabelView.c()) {
            CardView labelBackground = fabWithLabelView.getLabelBackground();
            o4.c(labelBackground).b();
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R$anim.sd_fade_and_translate_out);
            loadAnimation.setAnimationListener(new f(this, labelBackground));
            loadAnimation.setStartOffset(j2);
            labelBackground.startAnimation(loadAnimation);
        }
    }

    private void p(Context context, AttributeSet attributeSet) {
        FloatingActionButton k2 = k();
        this.j = k2;
        addView(k2);
        setClipChildren(false);
        if (Build.VERSION.SDK_INT >= 21) {
            setElevation(getResources().getDimension(R$dimen.sd_close_elevation));
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SpeedDialView, 0, 0);
        try {
            setUseReverseAnimationOnClose(obtainStyledAttributes.getBoolean(R$styleable.SpeedDialView_sdUseReverseAnimationOnClose, getUseReverseAnimationOnClose()));
            setMainFabAnimationRotateAngle(obtainStyledAttributes.getFloat(R$styleable.SpeedDialView_sdMainFabAnimationRotateAngle, getMainFabAnimationRotateAngle()));
            int resourceId = obtainStyledAttributes.getResourceId(R$styleable.SpeedDialView_sdMainFabClosedSrc, Integer.MIN_VALUE);
            if (resourceId != Integer.MIN_VALUE) {
                setMainFabClosedDrawable(defpackage.f.d(getContext(), resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.SpeedDialView_sdMainFabOpenedSrc, Integer.MIN_VALUE);
            if (resourceId2 != Integer.MIN_VALUE) {
                setMainFabOpenedDrawable(defpackage.f.d(context, resourceId2));
            }
            u(obtainStyledAttributes.getInt(R$styleable.SpeedDialView_sdExpansionMode, getExpansionMode()), true);
            setMainFabClosedBackgroundColor(obtainStyledAttributes.getColor(R$styleable.SpeedDialView_sdMainFabClosedBackgroundColor, getMainFabClosedBackgroundColor()));
            setMainFabOpenedBackgroundColor(obtainStyledAttributes.getColor(R$styleable.SpeedDialView_sdMainFabOpenedBackgroundColor, getMainFabOpenedBackgroundColor()));
            this.k = obtainStyledAttributes.getResourceId(R$styleable.SpeedDialView_sdOverlayLayout, Integer.MIN_VALUE);
        } catch (Exception unused) {
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
    }

    private a s(FabWithLabelView fabWithLabelView, Iterator<FabWithLabelView> it, boolean z) {
        if (fabWithLabelView == null) {
            return null;
        }
        a speedDialActionItem = fabWithLabelView.getSpeedDialActionItem();
        if (it != null) {
            it.remove();
        } else {
            this.f.remove(fabWithLabelView);
        }
        if (q()) {
            if (this.f.isEmpty()) {
                i();
            }
            if (z) {
                b.l(fabWithLabelView, true);
                return speedDialActionItem;
            }
        }
        removeView(fabWithLabelView);
        return speedDialActionItem;
    }

    private void u(int i2, boolean z) {
        if (this.e.h != i2 || z) {
            int unused = this.e.h = i2;
            if (i2 == 0 || i2 == 1) {
                setOrientation(1);
                for (FabWithLabelView orientation : this.f) {
                    orientation.setOrientation(0);
                }
            } else if (i2 == 2 || i2 == 3) {
                setOrientation(0);
                for (FabWithLabelView orientation2 : this.f) {
                    orientation2.setOrientation(1);
                }
            }
            j(false);
            ArrayList<a> actionItems = getActionItems();
            h();
            g(actionItems);
        }
    }

    private void w(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        floatingActionButton.s(new b(this, bVar));
    }

    private void x(boolean z, boolean z2) {
        SpeedDialOverlayLayout speedDialOverlayLayout = this.l;
        if (speedDialOverlayLayout == null) {
            return;
        }
        if (z) {
            speedDialOverlayLayout.d(z2);
        } else {
            speedDialOverlayLayout.b(z2);
        }
    }

    private void y(FabWithLabelView fabWithLabelView, int i2) {
        o4.c(fabWithLabelView).b();
        long j2 = (long) i2;
        b.b(fabWithLabelView.getFab(), j2);
        if (fabWithLabelView.c()) {
            CardView labelBackground = fabWithLabelView.getLabelBackground();
            o4.c(labelBackground).b();
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R$anim.sd_fade_and_translate_in);
            loadAnimation.setStartOffset(j2);
            labelBackground.startAnimation(loadAnimation);
        }
    }

    private void z(boolean z, boolean z2) {
        if (z && this.f.isEmpty()) {
            z = false;
            i iVar = this.m;
            if (iVar != null) {
                iVar.a();
            }
        }
        if (q() != z) {
            boolean unused = this.e.e = z;
            C(z, z2, this.e.j);
            B(z2);
            A();
            x(z, z2);
            i iVar2 = this.m;
            if (iVar2 != null) {
                iVar2.b(z);
            }
        }
    }

    public FabWithLabelView d(a aVar) {
        return e(aVar, this.f.size());
    }

    public FabWithLabelView e(a aVar, int i2) {
        return f(aVar, i2, true);
    }

    public FabWithLabelView f(a aVar, int i2, boolean z) {
        FabWithLabelView l2 = l(aVar.s());
        if (l2 != null) {
            return t(l2.getSpeedDialActionItem(), aVar);
        }
        FabWithLabelView m2 = aVar.m(getContext());
        int i3 = 1;
        if (getOrientation() == 1) {
            i3 = 0;
        }
        m2.setOrientation(i3);
        m2.setOnActionSelectedListener(this.o);
        addView(m2, m(i2));
        this.f.add(i2, m2);
        if (!q()) {
            m2.setVisibility(8);
        } else if (z) {
            y(m2, 0);
        }
        return m2;
    }

    public Collection<FabWithLabelView> g(Collection<a> collection) {
        ArrayList arrayList = new ArrayList();
        for (a d2 : collection) {
            arrayList.add(d(d2));
        }
        return arrayList;
    }

    public ArrayList<a> getActionItems() {
        ArrayList<a> arrayList = new ArrayList<>(this.f.size());
        for (FabWithLabelView speedDialActionItem : this.f) {
            arrayList.add(speedDialActionItem.getSpeedDialActionItem());
        }
        return arrayList;
    }

    public CoordinatorLayout.Behavior getBehavior() {
        return new SnackbarBehavior();
    }

    public int getExpansionMode() {
        return this.e.h;
    }

    public FloatingActionButton getMainFab() {
        return this.j;
    }

    public float getMainFabAnimationRotateAngle() {
        return this.e.i;
    }

    public int getMainFabClosedBackgroundColor() {
        return this.e.f;
    }

    public int getMainFabOpenedBackgroundColor() {
        return this.e.g;
    }

    public SpeedDialOverlayLayout getOverlayLayout() {
        return this.l;
    }

    public boolean getUseReverseAnimationOnClose() {
        return this.e.j;
    }

    public void h() {
        Iterator<FabWithLabelView> it = this.f.iterator();
        while (it.hasNext()) {
            s(it.next(), it, true);
        }
    }

    public void i() {
        z(false, true);
    }

    public void j(boolean z) {
        z(false, z);
    }

    public void n(FloatingActionButton.b bVar) {
        if (q()) {
            i();
            t4 c2 = o4.c(this.j);
            c2.d(Utils.FLOAT_EPSILON);
            c2.e(0);
            c2.k();
        }
        this.j.l(new c(bVar));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l == null) {
            setOverlayLayout((SpeedDialOverlayLayout) getRootView().findViewById(this.k));
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            g gVar = (g) bundle.getParcelable(g.class.getName());
            if (!(gVar == null || gVar.k == null || gVar.k.isEmpty())) {
                setUseReverseAnimationOnClose(gVar.j);
                setMainFabAnimationRotateAngle(gVar.i);
                setMainFabOpenedBackgroundColor(gVar.g);
                setMainFabClosedBackgroundColor(gVar.f);
                u(gVar.h, true);
                g(gVar.k);
                z(gVar.e, false);
            }
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        ArrayList unused = this.e.k = getActionItems();
        bundle.putParcelable(g.class.getName(), this.e);
        bundle.putParcelable("superState", super.onSaveInstanceState());
        return bundle;
    }

    public boolean q() {
        return this.e.e;
    }

    public void r() {
        z(true, true);
    }

    public void setExpansionMode(int i2) {
        u(i2, false);
    }

    public void setMainFabAnimationRotateAngle(float f2) {
        float unused = this.e.i = f2;
        setMainFabOpenedDrawable(this.i);
    }

    public void setMainFabClosedBackgroundColor(int i2) {
        int unused = this.e.f = i2;
        A();
    }

    public void setMainFabClosedDrawable(Drawable drawable) {
        this.g = drawable;
        B(false);
    }

    public void setMainFabOpenedBackgroundColor(int i2) {
        int unused = this.e.g = i2;
        A();
    }

    public void setMainFabOpenedDrawable(Drawable drawable) {
        this.i = drawable;
        this.h = drawable == null ? null : b.g(drawable, -getMainFabAnimationRotateAngle());
        B(false);
    }

    public void setOnActionSelectedListener(h hVar) {
        this.n = hVar;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.f.get(i2).setOnActionSelectedListener(this.o);
        }
    }

    public void setOnChangeListener(i iVar) {
        this.m = iVar;
    }

    public void setOrientation(int i2) {
        super.setOrientation(i2);
    }

    public void setOverlayLayout(SpeedDialOverlayLayout speedDialOverlayLayout) {
        if (this.l != null) {
            setOnClickListener((View.OnClickListener) null);
        }
        this.l = speedDialOverlayLayout;
        if (speedDialOverlayLayout != null) {
            speedDialOverlayLayout.setOnClickListener(new d());
            x(q(), false);
        }
    }

    public void setUseReverseAnimationOnClose(boolean z) {
        boolean unused = this.e.j = z;
    }

    public FabWithLabelView t(a aVar, a aVar2) {
        FabWithLabelView l2;
        int indexOf;
        if (aVar == null || (l2 = l(aVar.s())) == null || (indexOf = this.f.indexOf(l2)) < 0) {
            return null;
        }
        s(l(aVar2.s()), (Iterator<FabWithLabelView>) null, false);
        s(l(aVar.s()), (Iterator<FabWithLabelView>) null, false);
        return f(aVar2, indexOf, false);
    }

    public void v(FloatingActionButton.b bVar) {
        setVisibility(0);
        w(this.j, bVar);
    }
}
