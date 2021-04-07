package com.zunjae.anyme.features.anime.pickers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.b;

public final class DefaultEpisodePickerDialogR2 extends b {
    private uy1 p0;
    @BindView
    RecyclerView recyclerView;

    static {
        Class<DefaultEpisodePickerDialogR2> cls = DefaultEpisodePickerDialogR2.class;
    }

    private void a2() {
        int i = I().getConfiguration().orientation == 2 ? 3 : 1;
        int i2 = this.p0.e;
        this.recyclerView.setLayoutManager(new GridLayoutManager(u(), i2 < 20 ? i + 2 : i2 < 40 ? i + 3 : i + 4));
        this.recyclerView.setAdapter(new NumberPickerAdapter(i2, this.p0.f, u(), new b(this)));
        this.recyclerView.j1(this.p0.e);
    }

    public void K0() {
        super.K0();
        Y1();
    }

    public /* synthetic */ void Z1(int i) {
        cw1.k.a().i(new av1(i));
        L1();
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        uy1 uy1 = (uy1) s().getParcelable("defaultEpisodePickerDialog");
        this.p0 = uy1;
        if (uy1 != null) {
            a2();
            return;
        }
        throw new NullPointerException("Forgot to set Anime argument");
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0278R$layout.dialog_episode_selector, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }
}
