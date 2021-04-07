package com.zunjae.anyme.features.kanon;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import java.util.HashMap;

public final class c extends Fragment {
    public static final a b0 = new a((r62) null);
    private HashMap a0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final c a(String str) {
            v62.e(str, "message");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putString("message", str);
            u22 u22 = u22.a;
            cVar.u1(bundle);
            return cVar;
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ c e;

        b(c cVar) {
            this.e = cVar;
        }

        public final void onClick(View view) {
            FragmentActivity n = this.e.n();
            if (n != null) {
                ((AbstractActivity) n).g0("https://kanonapp.com/account/register");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.abstracts.AbstractActivity");
        }
    }

    public c() {
        super(C0278R$layout.fragment_no_kanon);
    }

    public void J1() {
        HashMap hashMap = this.a0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View K1(int i) {
        if (this.a0 == null) {
            this.a0 = new HashMap();
        }
        View view = (View) this.a0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.a0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        String string;
        super.h0(bundle);
        Bundle s = s();
        if (s != null && (string = s.getString("message", "This feature requires you to be logged in on Kanon")) != null) {
            TextView textView = (TextView) K1(C0275R$id.message);
            v62.d(textView, "message");
            textView.setText(string);
            ((MaterialButton) K1(C0275R$id.buttonGetStarted)).setOnClickListener(new b(this));
        }
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
