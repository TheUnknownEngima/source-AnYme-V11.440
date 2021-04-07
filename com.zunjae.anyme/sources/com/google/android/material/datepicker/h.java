package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$integer;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

public final class h<S> extends p<S> {
    static final Object l0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object m0 = "NAVIGATION_PREV_TAG";
    static final Object n0 = "NAVIGATION_NEXT_TAG";
    static final Object o0 = "SELECTOR_TOGGLE_TAG";
    private int b0;
    /* access modifiers changed from: private */
    public d<S> c0;
    /* access modifiers changed from: private */
    public a d0;
    /* access modifiers changed from: private */
    public l e0;
    private k f0;
    /* access modifiers changed from: private */
    public c g0;
    /* access modifiers changed from: private */
    public RecyclerView h0;
    /* access modifiers changed from: private */
    public RecyclerView i0;
    private View j0;
    /* access modifiers changed from: private */
    public View k0;

    class a implements Runnable {
        final /* synthetic */ int e;

        a(int i) {
            this.e = i;
        }

        public void run() {
            h.this.i0.r1(this.e);
        }
    }

    class b extends w3 {
        b(h hVar) {
        }

        public void g(View view, a5 a5Var) {
            super.g(view, a5Var);
            a5Var.f0((Object) null);
        }
    }

    class c extends q {
        final /* synthetic */ int M;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.M = i2;
        }

        /* access modifiers changed from: protected */
        public void V1(RecyclerView.z zVar, int[] iArr) {
            if (this.M == 0) {
                iArr[0] = h.this.i0.getWidth();
                iArr[1] = h.this.i0.getWidth();
                return;
            }
            iArr[0] = h.this.i0.getHeight();
            iArr[1] = h.this.i0.getHeight();
        }
    }

    class d implements l {
        d() {
        }

        public void a(long j) {
            if (h.this.d0.f().g0(j)) {
                h.this.c0.G0(j);
                Iterator it = h.this.a0.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).a(h.this.c0.u0());
                }
                h.this.i0.getAdapter().l();
                if (h.this.h0 != null) {
                    h.this.h0.getAdapter().l();
                }
            }
        }
    }

    class e extends RecyclerView.n {
        private final Calendar a = s.l();
        private final Calendar b = s.l();

        e() {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if ((recyclerView.getAdapter() instanceof t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                t tVar = (t) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (q3 next : h.this.c0.t()) {
                    F f = next.a;
                    if (!(f == null || next.b == null)) {
                        this.a.setTimeInMillis(((Long) f).longValue());
                        this.b.setTimeInMillis(((Long) next.b).longValue());
                        int J = tVar.J(this.a.get(1));
                        int J2 = tVar.J(this.b.get(1));
                        View M = gridLayoutManager.M(J);
                        View M2 = gridLayoutManager.M(J2);
                        int h3 = J / gridLayoutManager.h3();
                        int h32 = J2 / gridLayoutManager.h3();
                        int i = h3;
                        while (i <= h32) {
                            View M3 = gridLayoutManager.M(gridLayoutManager.h3() * i);
                            if (M3 != null) {
                                canvas.drawRect((float) (i == h3 ? M.getLeft() + (M.getWidth() / 2) : 0), (float) (M3.getTop() + h.this.g0.d.c()), (float) (i == h32 ? M2.getLeft() + (M2.getWidth() / 2) : recyclerView.getWidth()), (float) (M3.getBottom() - h.this.g0.d.b()), h.this.g0.h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    class f extends w3 {
        f() {
        }

        public void g(View view, a5 a5Var) {
            h hVar;
            int i;
            super.g(view, a5Var);
            if (h.this.k0.getVisibility() == 0) {
                hVar = h.this;
                i = R$string.mtrl_picker_toggle_to_year_selection;
            } else {
                hVar = h.this;
                i = R$string.mtrl_picker_toggle_to_day_selection;
            }
            a5Var.o0(hVar.O(i));
        }
    }

    class g extends RecyclerView.s {
        final /* synthetic */ n a;
        final /* synthetic */ MaterialButton b;

        g(n nVar, MaterialButton materialButton) {
            this.a = nVar;
            this.b = materialButton;
        }

        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager Z1 = h.this.Z1();
            int j2 = i < 0 ? Z1.j2() : Z1.m2();
            l unused = h.this.e0 = this.a.I(j2);
            this.b.setText(this.a.J(j2));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h  reason: collision with other inner class name */
    class C0099h implements View.OnClickListener {
        C0099h() {
        }

        public void onClick(View view) {
            h.this.e2();
        }
    }

    class i implements View.OnClickListener {
        final /* synthetic */ n e;

        i(n nVar) {
            this.e = nVar;
        }

        public void onClick(View view) {
            int j2 = h.this.Z1().j2() + 1;
            if (j2 < h.this.i0.getAdapter().g()) {
                h.this.c2(this.e.I(j2));
            }
        }
    }

    class j implements View.OnClickListener {
        final /* synthetic */ n e;

        j(n nVar) {
            this.e = nVar;
        }

        public void onClick(View view) {
            int m2 = h.this.Z1().m2() - 1;
            if (m2 >= 0) {
                h.this.c2(this.e.I(m2));
            }
        }
    }

    enum k {
        DAY,
        YEAR
    }

    interface l {
        void a(long j);
    }

    private void S1(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(R$id.month_navigation_fragment_toggle);
        materialButton.setTag(o0);
        o4.i0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(R$id.month_navigation_previous);
        materialButton2.setTag(m0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(R$id.month_navigation_next);
        materialButton3.setTag(n0);
        this.j0 = view.findViewById(R$id.mtrl_calendar_year_selector_frame);
        this.k0 = view.findViewById(R$id.mtrl_calendar_day_selector_frame);
        d2(k.DAY);
        materialButton.setText(this.e0.l());
        this.i0.l(new g(nVar, materialButton));
        materialButton.setOnClickListener(new C0099h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    private RecyclerView.n T1() {
        return new e();
    }

    static int Y1(Context context) {
        return context.getResources().getDimensionPixelSize(R$dimen.mtrl_calendar_day_height);
    }

    static <T> h<T> a2(d<T> dVar, int i2, a aVar) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.i());
        hVar.u1(bundle);
        return hVar;
    }

    private void b2(int i2) {
        this.i0.post(new a(i2));
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.b0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.c0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.e0);
    }

    /* access modifiers changed from: package-private */
    public a U1() {
        return this.d0;
    }

    /* access modifiers changed from: package-private */
    public c V1() {
        return this.g0;
    }

    /* access modifiers changed from: package-private */
    public l W1() {
        return this.e0;
    }

    public d<S> X1() {
        return this.c0;
    }

    /* access modifiers changed from: package-private */
    public LinearLayoutManager Z1() {
        return (LinearLayoutManager) this.i0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    public void c2(l lVar) {
        RecyclerView recyclerView;
        int i2;
        n nVar = (n) this.i0.getAdapter();
        int K = nVar.K(lVar);
        int K2 = K - nVar.K(this.e0);
        boolean z = true;
        boolean z2 = Math.abs(K2) > 3;
        if (K2 <= 0) {
            z = false;
        }
        this.e0 = lVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.i0;
                i2 = K + 3;
            }
            b2(K);
        }
        recyclerView = this.i0;
        i2 = K - 3;
        recyclerView.j1(i2);
        b2(K);
    }

    /* access modifiers changed from: package-private */
    public void d2(k kVar) {
        this.f0 = kVar;
        if (kVar == k.YEAR) {
            this.h0.getLayoutManager().F1(((t) this.h0.getAdapter()).J(this.e0.h));
            this.j0.setVisibility(0);
            this.k0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.j0.setVisibility(8);
            this.k0.setVisibility(0);
            c2(this.e0);
        }
    }

    /* access modifiers changed from: package-private */
    public void e2() {
        k kVar;
        k kVar2 = this.f0;
        if (kVar2 == k.YEAR) {
            kVar = k.DAY;
        } else if (kVar2 == k.DAY) {
            kVar = k.YEAR;
        } else {
            return;
        }
        d2(kVar);
    }

    public void n0(Bundle bundle) {
        super.n0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.b0 = bundle.getInt("THEME_RES_ID_KEY");
        this.c0 = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.d0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.e0 = (l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(u(), this.b0);
        this.g0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        l j2 = this.d0.j();
        if (i.m2(contextThemeWrapper)) {
            i3 = R$layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i3 = R$layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R$id.mtrl_calendar_days_of_week);
        o4.i0(gridView, new b(this));
        gridView.setAdapter(new g());
        gridView.setNumColumns(j2.i);
        gridView.setEnabled(false);
        this.i0 = (RecyclerView) inflate.findViewById(R$id.mtrl_calendar_months);
        this.i0.setLayoutManager(new c(u(), i2, false, i2));
        this.i0.setTag(l0);
        n nVar = new n(contextThemeWrapper, this.c0, this.d0, new d());
        this.i0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(R$integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R$id.mtrl_calendar_year_selector_frame);
        this.h0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.h0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.h0.setAdapter(new t(this));
            this.h0.h(T1());
        }
        if (inflate.findViewById(R$id.month_navigation_fragment_toggle) != null) {
            S1(inflate, nVar);
        }
        if (!i.m2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.k().b(this.i0);
        }
        this.i0.j1(nVar.K(this.e0));
        return inflate;
    }
}
