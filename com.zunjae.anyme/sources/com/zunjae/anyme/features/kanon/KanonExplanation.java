package com.zunjae.anyme.features.kanon;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import java.util.HashMap;
import mehdi.sakout.fancybuttons.FancyButton;

public final class KanonExplanation extends AbstractActivity {
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    private HashMap E;

    public static final class a extends w62 implements o52<ut1> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [ut1, java.lang.Object] */
        public final ut1 invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(ut1.class), this.g, this.h);
        }
    }

    static final class b extends w62 implements z52<ve2<KanonExplanation>, u22> {
        final /* synthetic */ KanonExplanation f;

        static final class a extends w62 implements z52<KanonExplanation, u22> {
            final /* synthetic */ b f;
            final /* synthetic */ vt1 g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, vt1 vt1) {
                super(1);
                this.f = bVar;
                this.g = vt1;
            }

            public final void a(KanonExplanation kanonExplanation) {
                TextView textView;
                String str;
                v62.e(kanonExplanation, "it");
                if (this.g == null) {
                    textView = (TextView) this.f.f.l0(C0275R$id.description);
                    v62.d(textView, "description");
                    str = "With an account on Kanon you can do more with AnYme such as adding notes to episodes you've watched and keeping a list of your favorite characters. \n\nThis will only takes a few seconds.";
                } else {
                    textView = (TextView) this.f.f.l0(C0275R$id.description);
                    v62.d(textView, "description");
                    str = this.g.a();
                }
                textView.setText(str);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((KanonExplanation) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(KanonExplanation kanonExplanation) {
            super(1);
            this.f = kanonExplanation;
        }

        public final void a(ve2<KanonExplanation> ve2) {
            vt1 vt1;
            v62.e(ve2, "$receiver");
            try {
                vt1 = this.f.n0().h().h().a();
            } catch (Exception unused) {
                vt1 = null;
            }
            we2.d(ve2, new a(this, vt1));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    static final class c implements View.OnClickListener {
        final /* synthetic */ KanonExplanation e;

        c(KanonExplanation kanonExplanation) {
            this.e = kanonExplanation;
        }

        public final void onClick(View view) {
            this.e.g0("https://kanonapp.com/account/register");
            this.e.finish();
        }
    }

    /* access modifiers changed from: private */
    public final ut1 n0() {
        return (ut1) this.D.getValue();
    }

    public View l0(int i) {
        if (this.E == null) {
            this.E = new HashMap();
        }
        View view = (View) this.E.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.E.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_kanonapp_explanation);
        we2.c(this, (z52) null, new b(this), 1, (Object) null);
        FancyButton fancyButton = (FancyButton) l0(C0275R$id.loginButton);
        v62.d(fancyButton, "loginButton");
        fancyButton.setAnimation(gw1.a.a(1.0d, 0.7d, 250));
        ((FancyButton) l0(C0275R$id.loginButton)).setOnClickListener(new c(this));
    }
}
