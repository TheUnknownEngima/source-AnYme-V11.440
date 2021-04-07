package com.zunjae.anyme.features.anime.pickers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.b;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.c;

public final class ScorePickerDialogR2 extends b {
    private int p0;
    @BindView
    RecyclerView recyclerView;

    private void a2() {
        c cVar = new c(u(), this.recyclerView, new BetterScorePickerAdapter(u(), this.p0, new d(this)));
        cVar.c(2, 3);
        cVar.d(a.GRID);
        cVar.a();
    }

    public void K0() {
        super.K0();
        Y1();
    }

    public /* synthetic */ void Z1(int i) {
        cw1.k.a().i(new fv1(i));
        L1();
    }

    public void h0(Bundle bundle) {
        N1().requestWindowFeature(1);
        super.h0(bundle);
        int i = s().getInt("currentScore", -10);
        this.p0 = i;
        if (i >= 0) {
            a2();
            return;
        }
        throw new NullPointerException("no valid required argument given");
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0278R$layout.dialog_scorepicker, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }
}
