package com.zunjae.anyme.features.casting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.mediarouter.app.MediaRouteActionProvider;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.h;
import androidx.mediarouter.media.m;
import androidx.mediarouter.media.q;
import com.google.android.gms.cast.CastDevice;
import com.google.android.material.snackbar.Snackbar;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import defpackage.ls1;
import java.util.HashMap;

public final class CastActivity extends AbstractActivity {
    public static final a N = new a((r62) null);
    private androidx.mediarouter.media.g D;
    private h E;
    private String F;
    private String G;
    private int H;
    /* access modifiers changed from: private */
    public h.f I;
    /* access modifiers changed from: private */
    public q J;
    /* access modifiers changed from: private */
    public Snackbar K;
    private final b L = new b(this);
    private HashMap M;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final Intent a(Context context, String str, int i, String str2) {
            v62.e(context, "context");
            v62.e(str, "seriesTitle");
            v62.e(str2, "videoURL");
            Intent intent = new Intent(context, CastActivity.class);
            intent.putExtra("seriesTitle", str);
            intent.putExtra("episodeNumber", i);
            intent.putExtra("videoURL", str2);
            return intent;
        }

        public final void b(String str) {
            if (str != null) {
                l02.v("keyLastSelectedRoute", str);
            } else {
                l02.c("keyLastSelectedRoute");
            }
        }
    }

    public static final class b extends h.a {
        final /* synthetic */ CastActivity a;

        public static final class a extends q.e {
            a() {
            }
        }

        b(CastActivity castActivity) {
            this.a = castActivity;
        }

        private final void l(h.f fVar) {
            if (fVar != null) {
                Snackbar m0 = this.a.K;
                if (m0 != null) {
                    m0.t();
                }
                CastDevice l = CastDevice.l(fVar.j());
                CastActivity castActivity = this.a;
                Toast makeText = Toast.makeText(castActivity, "Connected to " + fVar.n(), 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                a aVar = CastActivity.N;
                v62.d(l, "device");
                aVar.b(l.i());
                if (fVar.M("android.media.intent.category.REMOTE_PLAYBACK")) {
                    this.a.I = fVar;
                    CastActivity castActivity2 = this.a;
                    CastActivity castActivity3 = this.a;
                    castActivity2.J = new q(castActivity3, castActivity3.I);
                    Uri parse = Uri.parse(CastActivity.p0(this.a));
                    a aVar2 = new a();
                    q n0 = this.a.J;
                    if (n0 != null) {
                        n0.n(parse, "video/mp4", (Bundle) null, 0, (Bundle) null, aVar2);
                    }
                }
            }
        }

        public void d(h hVar, h.f fVar) {
            super.d(hVar, fVar);
            v62.c(hVar);
            v62.c(fVar);
            h(hVar, fVar);
        }

        public void h(h hVar, h.f fVar) {
            v62.e(hVar, "router");
            v62.e(fVar, "route");
            l(fVar);
        }
    }

    static final class c extends w62 implements z52<ve2<CastActivity>, u22> {
        public static final c f = new c();

        c() {
            super(1);
        }

        public final void a(ve2<CastActivity> ve2) {
            v62.e(ve2, "$receiver");
            ls1 a = new ns1((String) null, 0, 0, 7, (r62) null).a();
            if (a instanceof ls1.c) {
                try {
                    js1.a.a(((ls1.c) a).a().get(0).a()).a().h();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (a instanceof ls1.b) {
                System.out.print("No results found");
                throw new Exception();
            } else if (a instanceof ls1.a) {
                System.out.print("EXception: " + ((ls1.a) a).a().getMessage());
                throw new Exception();
            }
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    public static final class d extends q.g {
        final /* synthetic */ CastActivity a;

        d(CastActivity castActivity) {
            this.a = castActivity;
        }

        public void b(Bundle bundle, String str, m mVar) {
            super.b(bundle, str, mVar);
            Toast makeText = Toast.makeText(this.a, "Paused", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    public static final class e extends q.g {
        final /* synthetic */ CastActivity a;

        e(CastActivity castActivity) {
            this.a = castActivity;
        }

        public void b(Bundle bundle, String str, m mVar) {
            super.b(bundle, str, mVar);
            Toast makeText = Toast.makeText(this.a, "Resuming playback", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    static final class f implements View.OnClickListener {
        final /* synthetic */ CastActivity e;

        public static final class a extends q.g {
            final /* synthetic */ f a;

            a(f fVar) {
                this.a = fVar;
            }

            public void b(Bundle bundle, String str, m mVar) {
                if (mVar == null || !mVar.e()) {
                    this.a.e.u0();
                } else {
                    this.a.e.v0();
                }
            }
        }

        f(CastActivity castActivity) {
            this.e = castActivity;
        }

        public final void onClick(View view) {
            q n0 = this.e.J;
            if (n0 != null) {
                n0.f((Bundle) null, new a(this));
            }
        }
    }

    static final class g implements View.OnClickListener {
        final /* synthetic */ CastActivity e;

        public static final class a extends q.g {
            final /* synthetic */ g a;

            a(g gVar) {
                this.a = gVar;
            }

            public void b(Bundle bundle, String str, m mVar) {
                super.b(bundle, str, mVar);
                Toast makeText = Toast.makeText(this.a.e, "Stopped playback", 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
        }

        g(CastActivity castActivity) {
            this.e = castActivity;
        }

        public final void onClick(View view) {
            q n0 = this.e.J;
            if (n0 != null) {
                n0.e((Bundle) null, new a(this));
            }
        }
    }

    public static final /* synthetic */ String p0(CastActivity castActivity) {
        String str = castActivity.F;
        if (str != null) {
            return str;
        }
        v62.p("videoURL");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void u0() {
        q qVar = this.J;
        if (qVar != null) {
            qVar.k((Bundle) null, new d(this));
        }
    }

    /* access modifiers changed from: private */
    public final void v0() {
        q qVar = this.J;
        if (qVar != null) {
            qVar.p((Bundle) null, new e(this));
        }
    }

    private final void w0() {
        g.a aVar = new g.a();
        aVar.b("android.media.intent.category.REMOTE_PLAYBACK");
        androidx.mediarouter.media.g d2 = aVar.d();
        v62.d(d2, "MediaRouteSelector.Build…LAYBACK)\n        .build()");
        this.D = d2;
        h g2 = h.g(this);
        v62.d(g2, "MediaRouter.getInstance(this)");
        this.E = g2;
    }

    private final void x0() {
        ((ImageView) l0(C0275R$id.pauseButton)).setOnClickListener(new f(this));
        ((ImageView) l0(C0275R$id.stopButton)).setOnClickListener(new g(this));
    }

    private final void y0() {
        Snackbar snackbar = this.K;
        if (snackbar != null) {
            snackbar.t();
        }
        pw1 pw1 = pw1.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) l0(C0275R$id.coordinator);
        v62.d(coordinatorLayout, "coordinator");
        Snackbar c2 = pw1.c(pw1, coordinatorLayout, "Searching for devices...", (qw1) null, 4, (Object) null);
        this.K = c2;
        if (c2 != null) {
            c2.R();
        }
    }

    public View l0(int i) {
        if (this.M == null) {
            this.M = new HashMap();
        }
        View view = (View) this.M.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.M.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetTextI18n"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.castactivity);
        String stringExtra = getIntent().getStringExtra("seriesTitle");
        v62.c(stringExtra);
        this.G = stringExtra;
        this.H = getIntent().getIntExtra("episodeNumber", -1);
        String stringExtra2 = getIntent().getStringExtra("videoURL");
        v62.c(stringExtra2);
        this.F = stringExtra2;
        y0();
        TextView textView = (TextView) l0(C0275R$id.showInfoText);
        v62.d(textView, "showInfoText");
        StringBuilder sb = new StringBuilder();
        sb.append("Series Title: ");
        String str = this.G;
        if (str != null) {
            sb.append(str);
            sb.append("\n\nEpisode: ");
            sb.append(this.H);
            sb.append("\n\nLink: ");
            String str2 = this.F;
            if (str2 != null) {
                sb.append(i92.l0(str2, 30));
                sb.append("...");
                textView.setText(sb.toString());
                Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
                v62.d(toolbar, "toolbar");
                String str3 = this.G;
                if (str3 != null) {
                    AbstractActivity.k0(this, toolbar, str3, (String) null, true, 4, (Object) null);
                    w0();
                    x0();
                    we2.c(this, (z52) null, c.f, 1, (Object) null);
                    return;
                }
                v62.p("seriesTitle");
                throw null;
            }
            v62.p("videoURL");
            throw null;
        }
        v62.p("seriesTitle");
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(C0279R$menu.brose, menu);
        x3 a2 = c4.a(menu.findItem(C0275R$id.media_route_menu_item));
        if (a2 != null) {
            MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) a2;
            androidx.mediarouter.media.g gVar = this.D;
            if (gVar != null) {
                mediaRouteActionProvider.p(gVar);
                return true;
            }
            v62.p("selector");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.mediarouter.app.MediaRouteActionProvider");
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        h hVar = this.E;
        if (hVar != null) {
            androidx.mediarouter.media.g gVar = this.D;
            if (gVar != null) {
                hVar.b(gVar, this.L, 4);
            } else {
                v62.p("selector");
                throw null;
            }
        } else {
            v62.p("mediaRouter");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        h hVar = this.E;
        if (hVar != null) {
            hVar.l(this.L);
            super.onStop();
            return;
        }
        v62.p("mediaRouter");
        throw null;
    }
}
