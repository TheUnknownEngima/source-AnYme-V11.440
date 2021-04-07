package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.m;
import com.google.android.material.internal.r;
import defpackage.a5;
import defpackage.wa1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {
    private static final String o = MaterialButtonToggleGroup.class.getSimpleName();
    private static final int p = R$style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    private final List<d> e;
    private final c f;
    private final f g;
    private final LinkedHashSet<e> h;
    private final Comparator<MaterialButton> i;
    private Integer[] j;
    /* access modifiers changed from: private */
    public boolean k;
    /* access modifiers changed from: private */
    public boolean l;
    private boolean m;
    /* access modifiers changed from: private */
    public int n;

    class a implements Comparator<MaterialButton> {
        a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends w3 {
        b() {
        }

        public void g(View view, a5 a5Var) {
            super.g(view, a5Var);
            a5Var.g0(a5.c.f(0, 1, MaterialButtonToggleGroup.this.n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private class c implements MaterialButton.a {
        private c() {
        }

        /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        public void a(MaterialButton materialButton, boolean z) {
            if (!MaterialButtonToggleGroup.this.k) {
                if (MaterialButtonToggleGroup.this.l) {
                    int unused = MaterialButtonToggleGroup.this.n = z ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.u(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.l(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }
    }

    private static class d {
        private static final ma1 e = new ka1(Utils.FLOAT_EPSILON);
        ma1 a;
        ma1 b;
        ma1 c;
        ma1 d;

        d(ma1 ma1, ma1 ma12, ma1 ma13, ma1 ma14) {
            this.a = ma1;
            this.b = ma13;
            this.c = ma14;
            this.d = ma12;
        }

        public static d a(d dVar) {
            ma1 ma1 = e;
            return new d(ma1, dVar.d, ma1, dVar.c);
        }

        public static d b(d dVar, View view) {
            return r.h(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            ma1 ma1 = dVar.a;
            ma1 ma12 = dVar.d;
            ma1 ma13 = e;
            return new d(ma1, ma12, ma13, ma13);
        }

        public static d d(d dVar) {
            ma1 ma1 = e;
            return new d(ma1, ma1, dVar.b, dVar.c);
        }

        public static d e(d dVar, View view) {
            return r.h(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            ma1 ma1 = dVar.a;
            ma1 ma12 = e;
            return new d(ma1, ma12, dVar.b, ma12);
        }
    }

    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    private class f implements MaterialButton.b {
        private f() {
        }

        /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        public void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, p), attributeSet, i2);
        this.e = new ArrayList();
        this.f = new c(this, (a) null);
        this.g = new f(this, (a) null);
        this.h = new LinkedHashSet<>();
        this.i = new a();
        this.k = false;
        TypedArray h2 = m.h(getContext(), attributeSet, R$styleable.MaterialButtonToggleGroup, i2, p, new int[0]);
        setSingleSelection(h2.getBoolean(R$styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.n = h2.getResourceId(R$styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.m = h2.getBoolean(R$styleable.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        h2.recycle();
        o4.s0(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (p(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && p(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
                MaterialButton m2 = m(i2);
                int min = Math.min(m2.getStrokeWidth(), m(i2 - 1).getStrokeWidth());
                LinearLayout.LayoutParams i3 = i(m2);
                if (getOrientation() == 0) {
                    b4.c(i3, 0);
                    b4.d(i3, -min);
                } else {
                    i3.bottomMargin = 0;
                    i3.topMargin = -min;
                }
                m2.setLayoutParams(i3);
            }
            r(firstVisibleChildIndex);
        }
    }

    private LinearLayout.LayoutParams i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void j(int i2) {
        s(i2, true);
        u(i2, true);
        setCheckedId(i2);
    }

    /* access modifiers changed from: private */
    public void l(int i2, boolean z) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(this, i2, z);
        }
    }

    private MaterialButton m(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    /* access modifiers changed from: private */
    public int n(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == view) {
                return i2;
            }
            if ((getChildAt(i3) instanceof MaterialButton) && p(i3)) {
                i2++;
            }
        }
        return -1;
    }

    private d o(int i2, int i3, int i4) {
        d dVar = this.e.get(i2);
        if (i3 == i4) {
            return dVar;
        }
        boolean z = getOrientation() == 0;
        if (i2 == i3) {
            return z ? d.e(dVar, this) : d.f(dVar);
        }
        if (i2 == i4) {
            return z ? d.b(dVar, this) : d.a(dVar);
        }
        return null;
    }

    private boolean p(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    private void r(int i2) {
        if (getChildCount() != 0 && i2 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m(i2).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            b4.c(layoutParams, 0);
            b4.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void s(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof MaterialButton) {
            this.k = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.k = false;
        }
    }

    private void setCheckedId(int i2) {
        this.n = i2;
        l(i2, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(o4.i());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.a(this.f);
        materialButton.setOnPressedChangeListenerInternal(this.g);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private static void t(wa1.b bVar, d dVar) {
        if (dVar == null) {
            bVar.o(Utils.FLOAT_EPSILON);
            return;
        }
        bVar.F(dVar.a);
        bVar.w(dVar.d);
        bVar.J(dVar.b);
        bVar.A(dVar.c);
    }

    /* access modifiers changed from: private */
    public boolean u(int i2, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.m || !checkedButtonIds.isEmpty()) {
            if (z && this.l) {
                checkedButtonIds.remove(Integer.valueOf(i2));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    s(intValue2, false);
                    l(intValue2, false);
                }
            }
            return true;
        }
        s(i2, true);
        this.n = i2;
        return false;
    }

    private void v() {
        TreeMap treeMap = new TreeMap(this.i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(m(i2), Integer.valueOf(i2));
        }
        this.j = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i2, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            if (materialButton.isChecked()) {
                u(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            wa1 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.e.add(new d(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
            o4.i0(materialButton, new b());
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        v();
        super.dispatchDraw(canvas);
    }

    public void g(e eVar) {
        this.h.add(eVar);
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.l) {
            return this.n;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton m2 = m(i2);
            if (m2.isChecked()) {
                arrayList.add(Integer.valueOf(m2.getId()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.j;
        return (numArr == null || i3 >= numArr.length) ? i3 : numArr[i3].intValue();
    }

    public void k() {
        this.k = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton m2 = m(i2);
            m2.setChecked(false);
            l(m2.getId(), false);
        }
        this.k = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.n;
        if (i2 != -1) {
            j(i2);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a5.I0(accessibilityNodeInfo).f0(a5.b.b(1, getVisibleButtonCount(), false, q() ? 1 : 2));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        w();
        h();
        super.onMeasure(i2, i3);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.h(this.f);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.e.remove(indexOfChild);
        }
        w();
        h();
    }

    public boolean q() {
        return this.l;
    }

    public void setSelectionRequired(boolean z) {
        this.m = z;
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z) {
        if (this.l != z) {
            this.l = z;
            k();
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton m2 = m(i2);
            if (m2.getVisibility() != 8) {
                wa1.b v = m2.getShapeAppearanceModel().v();
                t(v, o(i2, firstVisibleChildIndex, lastVisibleChildIndex));
                m2.setShapeAppearanceModel(v.m());
            }
        }
    }
}
