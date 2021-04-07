package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.datepicker.h;

class n extends RecyclerView.g<b> {
    private final a c;
    private final d<?> d;
    /* access modifiers changed from: private */
    public final h.l e;
    private final int f;

    class a implements AdapterView.OnItemClickListener {
        final /* synthetic */ MaterialCalendarGridView e;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.e = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.e.getAdapter().j(i)) {
                n.this.e.a(this.e.getAdapter().getItem(i).longValue());
            }
        }
    }

    public static class b extends RecyclerView.c0 {
        final TextView x;
        final MaterialCalendarGridView y;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R$id.month_title);
            this.x = textView;
            o4.j0(textView, true);
            this.y = (MaterialCalendarGridView) linearLayout.findViewById(R$id.month_grid);
            if (!z) {
                this.x.setVisibility(8);
            }
        }
    }

    n(Context context, d<?> dVar, a aVar, h.l lVar) {
        l j = aVar.j();
        l g = aVar.g();
        l i = aVar.i();
        if (j.compareTo(i) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (i.compareTo(g) <= 0) {
            this.f = (m.i * h.Y1(context)) + (i.m2(context) ? h.Y1(context) : 0);
            this.c = aVar;
            this.d = dVar;
            this.e = lVar;
            F(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    public l I(int i) {
        return this.c.j().q(i);
    }

    /* access modifiers changed from: package-private */
    public CharSequence J(int i) {
        return I(i).l();
    }

    /* access modifiers changed from: package-private */
    public int K(l lVar) {
        return this.c.j().s(lVar);
    }

    /* renamed from: L */
    public void w(b bVar, int i) {
        l q = this.c.j().q(i);
        bVar.x.setText(q.l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.y.findViewById(R$id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !q.equals(materialCalendarGridView.getAdapter().e)) {
            m mVar = new m(q, this.d, this.c);
            materialCalendarGridView.setNumColumns(q.i);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: M */
    public b y(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!i.m2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f));
        return new b(linearLayout, true);
    }

    public int g() {
        return this.c.h();
    }

    public long h(int i) {
        return this.c.j().q(i).m();
    }
}
