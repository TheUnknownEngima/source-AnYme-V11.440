package com.afollestad.materialdialogs;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import java.util.ArrayList;

class a extends RecyclerView.g<b> {
    /* access modifiers changed from: private */
    public final f c;
    private final int d;
    private final e e;
    /* access modifiers changed from: private */
    public c f;

    /* renamed from: com.afollestad.materialdialogs.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0075a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.afollestad.materialdialogs.f$m[] r0 = com.afollestad.materialdialogs.f.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.afollestad.materialdialogs.f$m r1 = com.afollestad.materialdialogs.f.m.SINGLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.afollestad.materialdialogs.f$m r1 = com.afollestad.materialdialogs.f.m.MULTI     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.a.C0075a.<clinit>():void");
        }
    }

    static class b extends RecyclerView.c0 implements View.OnClickListener, View.OnLongClickListener {
        final CompoundButton x;
        final TextView y;
        final a z;

        b(View view, a aVar) {
            super(view);
            this.x = (CompoundButton) view.findViewById(R$id.md_control);
            this.y = (TextView) view.findViewById(R$id.md_title);
            this.z = aVar;
            view.setOnClickListener(this);
            if (aVar.c.g.F != null) {
                view.setOnLongClickListener(this);
            }
        }

        public void onClick(View view) {
            if (this.z.f != null && j() != -1) {
                CharSequence charSequence = null;
                if (this.z.c.g.l != null && j() < this.z.c.g.l.size()) {
                    charSequence = this.z.c.g.l.get(j());
                }
                View view2 = view;
                this.z.f.a(this.z.c, view2, j(), charSequence, false);
            }
        }

        public boolean onLongClick(View view) {
            if (this.z.f == null || j() == -1) {
                return false;
            }
            CharSequence charSequence = null;
            if (this.z.c.g.l != null && j() < this.z.c.g.l.size()) {
                charSequence = this.z.c.g.l.get(j());
            }
            return this.z.f.a(this.z.c, view, j(), charSequence, true);
        }
    }

    interface c {
        boolean a(f fVar, View view, int i, CharSequence charSequence, boolean z);
    }

    a(f fVar, int i) {
        this.c = fVar;
        this.d = i;
        this.e = fVar.g.f;
    }

    @TargetApi(17)
    private boolean J() {
        return Build.VERSION.SDK_INT >= 17 && this.c.f().j().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @TargetApi(17)
    private void N(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.e.getGravityInt() | 16);
        if (viewGroup.getChildCount() != 2) {
            return;
        }
        if (this.e == e.END && !J() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
            CompoundButton compoundButton = (CompoundButton) viewGroup.getChildAt(0);
            viewGroup.removeView(compoundButton);
            TextView textView = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView);
            textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
            viewGroup.addView(textView);
            viewGroup.addView(compoundButton);
        } else if (this.e == e.START && J() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
            CompoundButton compoundButton2 = (CompoundButton) viewGroup.getChildAt(1);
            viewGroup.removeView(compoundButton2);
            TextView textView2 = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView2);
            textView2.setPadding(textView2.getPaddingRight(), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
            viewGroup.addView(compoundButton2);
            viewGroup.addView(textView2);
        }
    }

    /* renamed from: K */
    public void w(b bVar, int i) {
        View childAt;
        View view = bVar.e;
        boolean h = x8.h(Integer.valueOf(i), this.c.g.Q);
        int i2 = this.c.g.h0;
        if (h) {
            i2 = x8.a(i2, 0.4f);
        }
        bVar.e.setEnabled(!h);
        int i3 = C0075a.a[this.c.x.ordinal()];
        if (i3 == 1) {
            RadioButton radioButton = (RadioButton) bVar.x;
            boolean z = this.c.g.O == i;
            f.e eVar = this.c.g;
            ColorStateList colorStateList = eVar.u;
            if (colorStateList != null) {
                com.afollestad.materialdialogs.internal.c.i(radioButton, colorStateList);
            } else {
                com.afollestad.materialdialogs.internal.c.h(radioButton, eVar.t);
            }
            radioButton.setChecked(z);
            radioButton.setEnabled(!h);
        } else if (i3 == 2) {
            CheckBox checkBox = (CheckBox) bVar.x;
            boolean contains = this.c.y.contains(Integer.valueOf(i));
            f.e eVar2 = this.c.g;
            ColorStateList colorStateList2 = eVar2.u;
            if (colorStateList2 != null) {
                com.afollestad.materialdialogs.internal.c.d(checkBox, colorStateList2);
            } else {
                com.afollestad.materialdialogs.internal.c.c(checkBox, eVar2.t);
            }
            checkBox.setChecked(contains);
            checkBox.setEnabled(!h);
        }
        bVar.y.setText(this.c.g.l.get(i));
        bVar.y.setTextColor(i2);
        f fVar = this.c;
        fVar.t(bVar.y, fVar.g.S);
        ViewGroup viewGroup = (ViewGroup) view;
        N(viewGroup);
        int[] iArr = this.c.g.v0;
        if (iArr != null) {
            view.setId(i < iArr.length ? iArr[i] : -1);
        }
        if (Build.VERSION.SDK_INT >= 21 && viewGroup.getChildCount() == 2) {
            if (viewGroup.getChildAt(0) instanceof CompoundButton) {
                childAt = viewGroup.getChildAt(0);
            } else if (viewGroup.getChildAt(1) instanceof CompoundButton) {
                childAt = viewGroup.getChildAt(1);
            } else {
                return;
            }
            childAt.setBackground((Drawable) null);
        }
    }

    /* renamed from: L */
    public b y(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.d, viewGroup, false);
        x8.t(inflate, this.c.j());
        return new b(inflate, this);
    }

    /* access modifiers changed from: package-private */
    public void M(c cVar) {
        this.f = cVar;
    }

    public int g() {
        ArrayList<CharSequence> arrayList = this.c.g.l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
