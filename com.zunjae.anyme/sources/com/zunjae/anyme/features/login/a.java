package com.zunjae.anyme.features.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import java.util.HashMap;

public final class a extends Fragment {
    public static final C0194a b0 = new C0194a((r62) null);
    private HashMap a0;

    /* renamed from: com.zunjae.anyme.features.login.a$a  reason: collision with other inner class name */
    public static final class C0194a {
        private C0194a() {
        }

        public /* synthetic */ C0194a(r62 r62) {
            this();
        }

        public final a a(String str, String str2) {
            v62.e(str, "text");
            v62.e(str2, "imageURL");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("imageURL", str2);
            bundle.putString("text", str);
            u22 u22 = u22.a;
            aVar.u1(bundle);
            return aVar;
        }
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
        super.h0(bundle);
        com.zunjae.anyme.a.c(this).t(n1().getString("imageURL")).K0((ImageView) K1(C0275R$id.backgroundImage));
        TextView textView = (TextView) K1(C0275R$id.welcomeScreenText);
        v62.d(textView, "welcomeScreenText");
        textView.setText(n1().getString("text"));
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v62.e(layoutInflater, "inflater");
        return layoutInflater.inflate(C0278R$layout.fragment_welcome_screen_explanation, viewGroup, false);
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
