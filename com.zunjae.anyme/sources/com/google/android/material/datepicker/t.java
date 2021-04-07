package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.h;
import java.util.Calendar;
import java.util.Locale;

class t extends RecyclerView.g<b> {
    /* access modifiers changed from: private */
    public final h<?> c;

    class a implements View.OnClickListener {
        final /* synthetic */ int e;

        a(int i) {
            this.e = i;
        }

        public void onClick(View view) {
            t.this.c.c2(t.this.c.U1().e(l.e(this.e, t.this.c.W1().g)));
            t.this.c.d2(h.k.DAY);
        }
    }

    public static class b extends RecyclerView.c0 {
        final TextView x;

        b(TextView textView) {
            super(textView);
            this.x = textView;
        }
    }

    t(h<?> hVar) {
        this.c = hVar;
    }

    private View.OnClickListener I(int i) {
        return new a(i);
    }

    /* access modifiers changed from: package-private */
    public int J(int i) {
        return i - this.c.U1().j().h;
    }

    /* access modifiers changed from: package-private */
    public int K(int i) {
        return this.c.U1().j().h + i;
    }

    /* renamed from: L */
    public void w(b bVar, int i) {
        int K = K(i);
        String string = bVar.x.getContext().getString(R$string.mtrl_picker_navigate_to_year_description);
        bVar.x.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(K)}));
        bVar.x.setContentDescription(String.format(string, new Object[]{Integer.valueOf(K)}));
        c V1 = this.c.V1();
        Calendar j = s.j();
        b bVar2 = j.get(1) == K ? V1.f : V1.d;
        for (Long longValue : this.c.X1().p0()) {
            j.setTimeInMillis(longValue.longValue());
            if (j.get(1) == K) {
                bVar2 = V1.e;
            }
        }
        bVar2.d(bVar.x);
        bVar.x.setOnClickListener(I(K));
    }

    /* renamed from: M */
    public b y(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_year, viewGroup, false));
    }

    public int g() {
        return this.c.U1().k();
    }
}
