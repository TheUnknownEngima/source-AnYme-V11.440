package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import defpackage.d40;
import defpackage.f40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class TrackSelectionView extends LinearLayout {
    private final int e;
    private final LayoutInflater f;
    private final CheckedTextView g;
    private final CheckedTextView h;
    private final b i;
    private final SparseArray<d40.e> j;
    private boolean k;
    private boolean l;
    private h m;
    private CheckedTextView[][] n;
    private f40.a o;
    private int p;
    private p00 q;
    private boolean r;
    private c s;

    private class b implements View.OnClickListener {
        private b() {
        }

        public void onClick(View view) {
            TrackSelectionView.this.d(view);
        }
    }

    public interface c {
        void a(boolean z, List<d40.e> list);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setOrientation(1);
        this.j = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        this.e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        this.f = LayoutInflater.from(context);
        this.i = new b();
        this.m = new e(getResources());
        this.q = p00.h;
        CheckedTextView checkedTextView = (CheckedTextView) this.f.inflate(17367055, this, false);
        this.g = checkedTextView;
        checkedTextView.setBackgroundResource(this.e);
        this.g.setText(R$string.exo_track_selection_none);
        this.g.setEnabled(false);
        this.g.setFocusable(true);
        this.g.setOnClickListener(this.i);
        this.g.setVisibility(8);
        addView(this.g);
        addView(this.f.inflate(R$layout.exo_list_divider, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) this.f.inflate(17367055, this, false);
        this.h = checkedTextView2;
        checkedTextView2.setBackgroundResource(this.e);
        this.h.setText(R$string.exo_track_selection_auto);
        this.h.setEnabled(false);
        this.h.setFocusable(true);
        this.h.setOnClickListener(this.i);
        addView(this.h);
    }

    private static int[] b(int[] iArr, int i2) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i2;
        return copyOf;
    }

    private static int[] c(int[] iArr, int i2) {
        int[] iArr2 = new int[(iArr.length - 1)];
        int i3 = 0;
        for (int i4 : iArr) {
            if (i4 != i2) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return iArr2;
    }

    /* access modifiers changed from: private */
    public void d(View view) {
        if (view == this.g) {
            f();
        } else if (view == this.h) {
            e();
        } else {
            g(view);
        }
        j();
        c cVar = this.s;
        if (cVar != null) {
            cVar.a(getIsDisabled(), getOverrides());
        }
    }

    private void e() {
        this.r = false;
        this.j.clear();
    }

    private void f() {
        this.r = true;
        this.j.clear();
    }

    private void g(View view) {
        d40.e eVar;
        SparseArray<d40.e> sparseArray;
        SparseArray<d40.e> sparseArray2;
        d40.e eVar2;
        this.r = false;
        Pair pair = (Pair) view.getTag();
        int intValue = ((Integer) pair.first).intValue();
        int intValue2 = ((Integer) pair.second).intValue();
        d40.e eVar3 = this.j.get(intValue);
        q40.e(this.o);
        if (eVar3 == null) {
            if (!this.l && this.j.size() > 0) {
                this.j.clear();
            }
            sparseArray2 = this.j;
            eVar2 = new d40.e(intValue, intValue2);
        } else {
            int i2 = eVar3.g;
            int[] iArr = eVar3.f;
            boolean isChecked = ((CheckedTextView) view).isChecked();
            boolean h2 = h(intValue);
            boolean z = h2 || i();
            if (!isChecked || !z) {
                if (isChecked) {
                    return;
                }
                if (h2) {
                    int[] b2 = b(iArr, intValue2);
                    sparseArray = this.j;
                    eVar = new d40.e(intValue, b2);
                } else {
                    sparseArray2 = this.j;
                    eVar2 = new d40.e(intValue, intValue2);
                }
            } else if (i2 == 1) {
                this.j.remove(intValue);
                return;
            } else {
                int[] c2 = c(iArr, intValue2);
                sparseArray = this.j;
                eVar = new d40.e(intValue, c2);
            }
            sparseArray.put(intValue, eVar);
            return;
        }
        sparseArray2.put(intValue, eVar2);
    }

    @RequiresNonNull({"mappedTrackInfo"})
    private boolean h(int i2) {
        return this.k && this.q.a(i2).e > 1 && this.o.a(this.p, i2, false) != 0;
    }

    private boolean i() {
        return this.l && this.q.e > 1;
    }

    private void j() {
        this.g.setChecked(this.r);
        this.h.setChecked(!this.r && this.j.size() == 0);
        for (int i2 = 0; i2 < this.n.length; i2++) {
            d40.e eVar = this.j.get(i2);
            int i3 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.n;
                if (i3 >= checkedTextViewArr[i2].length) {
                    break;
                }
                checkedTextViewArr[i2][i3].setChecked(eVar != null && eVar.a(i3));
                i3++;
            }
        }
    }

    private void k() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.o == null) {
            this.g.setEnabled(false);
            this.h.setEnabled(false);
            return;
        }
        this.g.setEnabled(true);
        this.h.setEnabled(true);
        p00 e2 = this.o.e(this.p);
        this.q = e2;
        this.n = new CheckedTextView[e2.e][];
        boolean i2 = i();
        int i3 = 0;
        while (true) {
            p00 p00 = this.q;
            if (i3 < p00.e) {
                o00 a2 = p00.a(i3);
                boolean h2 = h(i3);
                this.n[i3] = new CheckedTextView[a2.e];
                for (int i4 = 0; i4 < a2.e; i4++) {
                    if (i4 == 0) {
                        addView(this.f.inflate(R$layout.exo_list_divider, this, false));
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.f.inflate((h2 || i2) ? 17367056 : 17367055, this, false);
                    checkedTextView.setBackgroundResource(this.e);
                    checkedTextView.setText(this.m.a(a2.a(i4)));
                    if (this.o.f(this.p, i3, i4) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setTag(Pair.create(Integer.valueOf(i3), Integer.valueOf(i4)));
                        checkedTextView.setOnClickListener(this.i);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.n[i3][i4] = checkedTextView;
                    addView(checkedTextView);
                }
                i3++;
            } else {
                j();
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.r;
    }

    public List<d40.e> getOverrides() {
        ArrayList arrayList = new ArrayList(this.j.size());
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            arrayList.add(this.j.valueAt(i2));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.k != z) {
            this.k = z;
            k();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (!z && this.j.size() > 1) {
                for (int size = this.j.size() - 1; size > 0; size--) {
                    this.j.remove(size);
                }
            }
            k();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(h hVar) {
        q40.e(hVar);
        this.m = hVar;
        k();
    }
}
