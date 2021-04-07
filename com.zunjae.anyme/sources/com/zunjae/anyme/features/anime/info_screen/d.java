package com.zunjae.anyme.features.anime.info_screen;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import java.util.HashMap;

public final class d extends com.zunjae.anyme.abstracts.b {
    public static final a q0 = new a((r62) null);
    private HashMap p0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final d a(String str, String str2) {
            v62.e(str, "dialogTitle");
            v62.e(str2, "imageURL");
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putString("dialogTitle", str);
            bundle.putString("imageURL", str2);
            u22 u22 = u22.a;
            dVar.u1(bundle);
            return dVar;
        }
    }

    public static final class b implements bl<Drawable> {
        final /* synthetic */ d a;

        b(d dVar) {
            this.a = dVar;
        }

        public boolean a(df dfVar, Object obj, pl<Drawable> plVar, boolean z) {
            try {
                Toast.makeText(this.a.u(), "Can't preview image... (no internet?)", 0).show();
                this.a.L1();
                return true;
            } catch (Exception unused) {
                return true;
            }
        }

        /* renamed from: c */
        public boolean b(Drawable drawable, Object obj, pl<Drawable> plVar, com.bumptech.glide.load.a aVar, boolean z) {
            try {
                ProgressBar progressBar = (ProgressBar) this.a.Z1(C0275R$id.progressBar);
                if (progressBar != null) {
                    rw1.a(progressBar);
                }
                ImageView imageView = (ImageView) this.a.Z1(C0275R$id.animeCoverImage);
                if (imageView == null) {
                    return true;
                }
                imageView.setImageDrawable(drawable);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    public void X1() {
        HashMap hashMap = this.p0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View Z1(int i) {
        if (this.p0 == null) {
            this.p0 = new HashMap();
        }
        View view = (View) this.p0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.p0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        String str;
        String str2;
        super.h0(bundle);
        Bundle s = s();
        if (s == null || (str = s.getString("dialogTitle")) == null) {
            str = "Anime";
        }
        v62.d(str, "arguments?.getString(\"dialogTitle\") ?: \"Anime\"");
        Bundle s2 = s();
        if (s2 == null || (str2 = s2.getString("imageURL")) == null) {
            str2 = "";
        }
        String str3 = str2;
        v62.d(str3, "arguments?.getString(\"imageURL\") ?: \"\"");
        TextView textView = (TextView) Z1(C0275R$id.dialogTitle);
        v62.d(textView, "dialogTitle");
        textView.setText(str);
        if (g92.v(str3, "cdn-dena.com", false, 2, (Object) null) || g92.v(str3, "cdn.myanimelist", false, 2, (Object) null)) {
            str3 = f92.q(f92.q(str3, ".jpg", "l.jpg", false, 4, (Object) null), "/r/130x194", "", false, 4, (Object) null);
        }
        com.zunjae.anyme.a.b(o1()).t(str3).x0(new b(this)).K0((ImageView) Z1(C0275R$id.animeCoverImage));
    }

    public void n0(Bundle bundle) {
        super.n0(bundle);
        T1(0, 16973834);
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v62.e(layoutInflater, "inflater");
        return layoutInflater.inflate(C0278R$layout.dialog_anime_cover_preview, viewGroup, false);
    }

    public /* synthetic */ void u0() {
        super.u0();
        X1();
    }
}
