package com.zunjae.anyme.features.niche.au;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.abstracts.b;
import com.zunjae.zapplib.a;

public final class ud extends b {
    @BindView
    TextView diff;
    @BindView
    TextView sD;

    public void K0() {
        super.K0();
        Y1();
        R1(!qv1.a.w());
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        this.diff.setText(String.format(O(C0283R$string.curnew), new Object[]{a.f(u()), Double.valueOf(qv1.a.g())}));
        String i = qv1.a.i();
        if (i != null) {
            this.sD.setText(i);
        }
        String a = qv1.a.a();
        if (ie2.e(a)) {
            yv1.a.b(u(), a);
            Toast.makeText(u(), O(C0283R$string.apkURLCopied), 0).show();
        }
    }

    @OnClick
    public void onRc() {
        String c = qv1.a.c();
        if (c != null) {
            ((AbstractActivity) n()).g0(c);
        } else {
            ((AbstractActivity) n()).g0("https://reddit.com/r/anyme");
        }
    }

    @OnClick
    public void onUb() {
        ((AbstractActivity) n()).g0(qv1.a.a());
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0278R$layout.dialog_update, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }
}
