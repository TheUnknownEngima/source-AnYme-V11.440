package com.zunjae.anyme.features.anime.info_screen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import butterknife.OnClick;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.b;
import java.util.HashMap;

public final class MiscSettingsDialog extends b {
    public static final a r0 = new a((r62) null);
    private int p0;
    private HashMap q0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final MiscSettingsDialog a(int i) {
            MiscSettingsDialog miscSettingsDialog = new MiscSettingsDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("animeId", i);
            u22 u22 = u22.a;
            miscSettingsDialog.u1(bundle);
            return miscSettingsDialog;
        }
    }

    public void K0() {
        super.K0();
        Y1();
    }

    public void X1() {
        HashMap hashMap = this.q0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View Z1(int i) {
        if (this.q0 == null) {
            this.q0 = new HashMap();
        }
        View view = (View) this.q0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.q0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        int i = n1().getInt("animeId");
        this.p0 = i;
        int f = xu1.i.f(i);
        if (f > 0) {
            ((EditText) Z1(C0275R$id.userInputAnimeSync)).setText("" + f);
            return;
        }
        xu1.i.n(this.p0, 0);
    }

    @OnClick
    public final void onSaveButtonClick() {
        EditText editText = (EditText) Z1(C0275R$id.userInputAnimeSync);
        v62.d(editText, "userInputAnimeSync");
        String obj = editText.getText().toString();
        if (!(obj.length() == 0)) {
            try {
                xu1.i.n(this.p0, Integer.parseInt(obj));
                L1();
            } catch (Exception e) {
                throw new IllegalArgumentException("Can not parse counter. Given input was " + obj + "\n\n" + e);
            }
        }
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v62.e(layoutInflater, "inflater");
        return layoutInflater.inflate(C0278R$layout.dialog_misc_settings, viewGroup, false);
    }

    public /* synthetic */ void u0() {
        super.u0();
        X1();
    }
}
