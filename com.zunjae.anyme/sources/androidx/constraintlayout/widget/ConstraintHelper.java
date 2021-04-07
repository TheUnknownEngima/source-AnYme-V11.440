package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper extends View {
    protected int[] e = new int[32];
    protected int f;
    protected Context g;
    protected i1 h;
    protected boolean i = false;
    protected String j;
    private View[] k = null;
    private HashMap<Integer, String> l = new HashMap<>();

    public ConstraintHelper(Context context) {
        super(context);
        this.g = context;
        l((AttributeSet) null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = context;
        l(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g = context;
        l(attributeSet);
    }

    private void e(String str) {
        Object j2;
        if (str != null && str.length() != 0 && this.g != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            int i2 = 0;
            if (isInEditMode() && constraintLayout != null && (j2 = constraintLayout.j(0, trim)) != null && (j2 instanceof Integer)) {
                i2 = ((Integer) j2).intValue();
            }
            if (i2 == 0 && constraintLayout != null) {
                i2 = j(constraintLayout, trim);
            }
            if (i2 == 0) {
                i2 = this.g.getResources().getIdentifier(trim, "id", this.g.getPackageName());
            }
            if (i2 != 0) {
                this.l.put(Integer.valueOf(i2), trim);
                f(i2);
                return;
            }
            "Could not find id of \"" + trim + "\"";
        }
    }

    private void f(int i2) {
        int i3 = this.f + 1;
        int[] iArr = this.e;
        if (i3 > iArr.length) {
            this.e = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.e;
        int i4 = this.f;
        iArr2[i4] = i2;
        this.f = i4 + 1;
    }

    private int[] i(View view, String str) {
        int i2;
        Object j2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = R$id.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (j2 = ((ConstraintLayout) view.getParent()).j(0, trim)) != null && (j2 instanceof Integer)) {
                i2 = ((Integer) j2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    private int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void g() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            h((ConstraintLayout) parent);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.e, this.f);
    }

    /* access modifiers changed from: protected */
    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : Utils.FLOAT_EPSILON;
        String str = this.j;
        if (str != null) {
            setIds(str);
        }
        for (int i2 = 0; i2 < this.f; i2++) {
            View q = constraintLayout.q(this.e[i2]);
            if (q != null) {
                q.setVisibility(visibility);
                if (elevation > Utils.FLOAT_EPSILON && Build.VERSION.SDK_INT >= 21) {
                    q.setTranslationZ(q.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public View[] k(ConstraintLayout constraintLayout) {
        View[] viewArr = this.k;
        if (viewArr == null || viewArr.length != this.f) {
            this.k = new View[this.f];
        }
        for (int i2 = 0; i2 < this.f; i2++) {
            this.k[i2] = constraintLayout.q(this.e[i2]);
        }
        return this.k;
    }

    /* access modifiers changed from: protected */
    public void l(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.j = string;
                    setIds(string);
                }
            }
        }
    }

    public void m(c.a aVar, j1 j1Var, ConstraintLayout.LayoutParams layoutParams, SparseArray<e1> sparseArray) {
        c.b bVar = aVar.d;
        int[] iArr = bVar.e0;
        if (iArr != null) {
            setReferencedIds(iArr);
            return;
        }
        String str = bVar.f0;
        if (str != null && str.length() > 0) {
            c.b bVar2 = aVar.d;
            bVar2.e0 = i(this, bVar2.f0);
            j1Var.b();
            int i2 = 0;
            while (true) {
                int[] iArr2 = aVar.d.e0;
                if (i2 < iArr2.length) {
                    e1 e1Var = sparseArray.get(iArr2[i2]);
                    if (e1Var != null) {
                        j1Var.a(e1Var);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void n(e1 e1Var, boolean z) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.i) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(f1 f1Var, i1 i1Var, SparseArray<e1> sparseArray) {
        i1Var.b();
        for (int i2 = 0; i2 < this.f; i2++) {
            i1Var.a(sparseArray.get(this.e[i2]));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r1 = r5.l.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.j
            r5.setIds(r0)
        L_0x000b:
            java.lang.String r0 = r5.j
            if (r0 == 0) goto L_0x0012
            r5.setIds(r0)
        L_0x0012:
            i1 r0 = r5.h
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            r0.b()
            r0 = 0
        L_0x001b:
            int r1 = r5.f
            if (r0 >= r1) goto L_0x005a
            int[] r1 = r5.e
            r1 = r1[r0]
            android.view.View r2 = r6.q(r1)
            if (r2 != 0) goto L_0x004c
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.j(r6, r1)
            if (r3 == 0) goto L_0x004c
            int[] r2 = r5.e
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.q(r3)
        L_0x004c:
            if (r2 == 0) goto L_0x0057
            i1 r1 = r5.h
            e1 r2 = r6.r(r2)
            r1.a(r2)
        L_0x0057:
            int r0 = r0 + 1
            goto L_0x001b
        L_0x005a:
            i1 r0 = r5.h
            f1 r6 = r6.g
            r0.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.s(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.j = str;
        if (str != null) {
            int i2 = 0;
            this.f = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    e(str.substring(i2));
                    return;
                } else {
                    e(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.j = null;
        this.f = 0;
        for (int f2 : iArr) {
            f(f2);
        }
    }

    public void t() {
        if (this.h != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).m0 = (e1) this.h;
            }
        }
    }
}
