package com.zunjae.anyme.features.vydia;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;
import com.afollestad.materialdialogs.f;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.gson.Gson;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.features.kanon.KanonExplanation;
import java.util.HashMap;
import java.util.List;

public final class AnimeVydiaPlayer extends AbstractVydiaActivity {
    public static final d Q = new d((r62) null);
    private final d22 J = g22.b(new a(this, (oh2) null, (o52) null));
    private final d22 K = g22.b(new b(this, (oh2) null, (o52) null));
    private final d22 L = g22.b(new c(this, (oh2) null, (o52) null));
    private sy1 M;
    private b N;
    private com.afollestad.materialdialogs.f O;
    private HashMap P;

    public static final class a extends w62 implements o52<nu1> {
        final /* synthetic */ androidx.lifecycle.n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(androidx.lifecycle.n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, nu1] */
        /* renamed from: a */
        public final nu1 invoke() {
            return lg2.b(this.f, f72.b(nu1.class), this.g, this.h);
        }
    }

    public static final class b extends w62 implements o52<c> {
        final /* synthetic */ androidx.lifecycle.n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.vydia.c, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final c invoke() {
            return lg2.b(this.f, f72.b(c.class), this.g, this.h);
        }
    }

    public static final class c extends w62 implements o52<gr1> {
        final /* synthetic */ androidx.lifecycle.n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(androidx.lifecycle.n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, gr1] */
        /* renamed from: a */
        public final gr1 invoke() {
            return lg2.b(this.f, f72.b(gr1.class), this.g, this.h);
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(r62 r62) {
            this();
        }

        public final Intent a(Context context, b bVar) {
            v62.e(context, "context");
            v62.e(bVar, "animeVydiaParameter");
            Intent intent = new Intent(context, AnimeVydiaPlayer.class);
            intent.putExtra("animeVydiaParameter", new Gson().toJson((Object) bVar));
            return intent;
        }
    }

    public static final class e implements ci2<Void> {
        final /* synthetic */ AnimeVydiaPlayer a;

        e(AnimeVydiaPlayer animeVydiaPlayer) {
            this.a = animeVydiaPlayer;
        }

        public void a(ai2<Void> ai2, Throwable th) {
            v62.e(ai2, "call");
            v62.e(th, "t");
            Toast makeText = Toast.makeText(this.a, "Unable to connect to Kanon. Please try again alter", 1);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }

        public void b(ai2<Void> ai2, qi2<Void> qi2) {
            AnimeVydiaPlayer animeVydiaPlayer;
            String str;
            v62.e(ai2, "call");
            v62.e(qi2, "response");
            if (qi2.d()) {
                animeVydiaPlayer = this.a;
                str = "Snapshot created! You can find this snapshot in 'More Info' and then 'Snapshots'.";
            } else {
                animeVydiaPlayer = this.a;
                str = "Unable to create a snapshot. Please report this issue";
            }
            Toast makeText = Toast.makeText(animeVydiaPlayer, str, 1);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    static final class f implements f.h {
        final /* synthetic */ AnimeVydiaPlayer a;

        f(AnimeVydiaPlayer animeVydiaPlayer) {
            this.a = animeVydiaPlayer;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, CharSequence charSequence) {
            v62.e(fVar, "<anonymous parameter 0>");
            this.a.l1(charSequence.toString());
        }
    }

    static final class g extends w62 implements z52<ve2<AnimeVydiaPlayer>, u22> {
        final /* synthetic */ AnimeVydiaPlayer f;

        static final class a extends w62 implements z52<AnimeVydiaPlayer, u22> {
            final /* synthetic */ g f;
            final /* synthetic */ List g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, List list) {
                super(1);
                this.f = gVar;
                this.g = list;
            }

            public final void a(AnimeVydiaPlayer animeVydiaPlayer) {
                v62.e(animeVydiaPlayer, "it");
                this.f.f.r1();
                List list = this.g;
                if (list == null) {
                    Toast makeText = Toast.makeText(this.f.f, "Could not connect to Kanon", 0);
                    makeText.show();
                    v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                    return;
                }
                AnimeVydiaPlayer animeVydiaPlayer2 = this.f.f;
                com.zunjae.anyme.features.notes.d dVar = (com.zunjae.anyme.features.notes.d) n32.B(list);
                animeVydiaPlayer2.y1(dVar != null ? dVar.d() : null);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((AnimeVydiaPlayer) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(AnimeVydiaPlayer animeVydiaPlayer) {
            super(1);
            this.f = animeVydiaPlayer;
        }

        public final void a(ve2<AnimeVydiaPlayer> ve2) {
            List list;
            v62.e(ve2, "$receiver");
            try {
                com.zunjae.anyme.features.kanon.e e1 = this.f.U();
                int b = AnimeVydiaPlayer.f1(this.f).b();
                Integer a2 = AnimeVydiaPlayer.f1(this.f).a();
                list = e1.e(b, a2 != null ? a2.intValue() : 0).h().a();
            } catch (Exception unused) {
                list = null;
            }
            we2.d(ve2, new a(this, list));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    static final class h extends w62 implements o52<u22> {
        final /* synthetic */ AnimeVydiaPlayer f;

        static final class a implements f.n {
            final /* synthetic */ h a;

            a(h hVar) {
                this.a = hVar;
            }

            public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
                v62.e(fVar, "<anonymous parameter 0>");
                v62.e(bVar, "<anonymous parameter 1>");
                h.super.onBackPressed();
            }
        }

        static final class b implements f.n {
            public static final b a = new b();

            b() {
            }

            public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
                v62.e(fVar, "dialog");
                v62.e(bVar, "<anonymous parameter 1>");
                fVar.dismiss();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(AnimeVydiaPlayer animeVydiaPlayer) {
            super(0);
            this.f = animeVydiaPlayer;
        }

        public final void a() {
            f.e eVar = new f.e(this.f);
            eVar.E("Hi there");
            eVar.i("Are you sure you want to exit Vydia?");
            eVar.B("Yes");
            eVar.w("Nope");
            eVar.A(new a(this));
            eVar.y(b.a);
            eVar.D();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    public static final class i implements ci2<db2> {
        final /* synthetic */ AnimeVydiaPlayer a;
        final /* synthetic */ String b;

        i(AnimeVydiaPlayer animeVydiaPlayer, String str) {
            this.a = animeVydiaPlayer;
            this.b = str;
        }

        public void a(ai2<db2> ai2, Throwable th) {
            v62.e(ai2, "call");
            v62.e(th, "t");
            this.a.r1();
            Toast makeText = Toast.makeText(this.a, "Could not save the note to the Kanon server...", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            this.a.y1(this.b);
        }

        public void b(ai2<db2> ai2, qi2<db2> qi2) {
            v62.e(ai2, "call");
            v62.e(qi2, "response");
            Toast makeText = Toast.makeText(this.a, "Note saved", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            this.a.r1();
        }
    }

    static final class j implements View.OnClickListener {
        final /* synthetic */ AnimeVydiaPlayer e;

        j(AnimeVydiaPlayer animeVydiaPlayer) {
            this.e = animeVydiaPlayer;
        }

        public final void onClick(View view) {
            FrameLayout frameLayout = (FrameLayout) this.e.l0(C0275R$id.container);
            v62.d(frameLayout, "container");
            rw1.i(frameLayout);
            Button button = (Button) this.e.l0(C0275R$id.exoSkipIntro);
            v62.d(button, "exoSkipIntro");
            rw1.a(button);
            Button button2 = (Button) this.e.l0(C0275R$id.showInfoButton);
            v62.d(button2, "showInfoButton");
            rw1.a(button2);
        }
    }

    static final class k implements View.OnClickListener {
        final /* synthetic */ AnimeVydiaPlayer e;

        k(AnimeVydiaPlayer animeVydiaPlayer) {
            this.e = animeVydiaPlayer;
        }

        public final void onClick(View view) {
            this.e.H0();
        }
    }

    static final class l implements View.OnClickListener {
        final /* synthetic */ AnimeVydiaPlayer e;

        l(AnimeVydiaPlayer animeVydiaPlayer) {
            this.e = animeVydiaPlayer;
        }

        public final void onClick(View view) {
            this.e.I0();
        }
    }

    static final class m implements View.OnClickListener {
        final /* synthetic */ AnimeVydiaPlayer e;

        m(AnimeVydiaPlayer animeVydiaPlayer) {
            this.e = animeVydiaPlayer;
        }

        public final void onClick(View view) {
            if (xx1.a.a()) {
                AnimeVydiaPlayer.n1(this.e, (String) null, 1, (Object) null);
            } else {
                this.e.Q().startActivity(new Intent(this.e.Q(), KanonExplanation.class));
            }
        }
    }

    static final class n implements View.OnLongClickListener {
        final /* synthetic */ AnimeVydiaPlayer e;

        n(AnimeVydiaPlayer animeVydiaPlayer) {
            this.e = animeVydiaPlayer;
        }

        public final boolean onLongClick(View view) {
            if (xx1.a.a()) {
                this.e.l1((String) null);
                return true;
            }
            this.e.Q().startActivity(new Intent(this.e.Q(), KanonExplanation.class));
            return true;
        }
    }

    static final class o implements View.OnClickListener {
        final /* synthetic */ AnimeVydiaPlayer e;

        o(AnimeVydiaPlayer animeVydiaPlayer) {
            this.e = animeVydiaPlayer;
        }

        public final void onClick(View view) {
            this.e.Q0(85000);
            ((PlayerView) this.e.l0(C0275R$id.exoPlayer)).w();
            this.e.z0().y(true);
            Button button = (Button) this.e.l0(C0275R$id.exoSkipIntro);
            v62.d(button, "exoSkipIntro");
            rw1.a(button);
            this.e.q1().j(true);
        }
    }

    static final class p implements f.n {
        final /* synthetic */ AnimeVydiaPlayer a;

        p(AnimeVydiaPlayer animeVydiaPlayer) {
            this.a = animeVydiaPlayer;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "dialog");
            v62.e(bVar, "<anonymous parameter 1>");
            EditText i = fVar.i();
            this.a.w1(String.valueOf(i != null ? i.getText() : null));
        }
    }

    private final nu1 S() {
        return (nu1) this.J.getValue();
    }

    public static final /* synthetic */ b f1(AnimeVydiaPlayer animeVydiaPlayer) {
        b bVar = animeVydiaPlayer.N;
        if (bVar != null) {
            return bVar;
        }
        v62.p("params");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void l1(String str) {
        b bVar = this.N;
        if (bVar != null) {
            Integer a2 = bVar.a();
            if (a2 != null) {
                int intValue = a2.intValue();
                com.zunjae.anyme.features.kanon.f fVar = new com.zunjae.anyme.features.kanon.f(O0().b(), str);
                com.zunjae.anyme.features.kanon.e U = U();
                b bVar2 = this.N;
                if (bVar2 != null) {
                    U.k(bVar2.b(), intValue, fVar).Q(new e(this));
                } else {
                    v62.p("params");
                    throw null;
                }
            } else {
                uj2.f("No episode found", new Object[0]);
            }
        } else {
            v62.p("params");
            throw null;
        }
    }

    private final void m1(String str) {
        ((PlayerView) l0(C0275R$id.exoPlayer)).w();
        z0().y(false);
        f.e eVar = new f.e(Q());
        eVar.p(16385);
        eVar.n(0, 512);
        eVar.B("Create");
        eVar.w("Cancel");
        eVar.m("Optionally write a note for this snapshot", str, true, new f(this));
        eVar.c().show();
    }

    static /* synthetic */ void n1(AnimeVydiaPlayer animeVydiaPlayer, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        animeVydiaPlayer.m1(str);
    }

    private final gr1 p1() {
        return (gr1) this.L.getValue();
    }

    /* access modifiers changed from: private */
    public final c q1() {
        return (c) this.K.getValue();
    }

    /* access modifiers changed from: private */
    public final void r1() {
        com.afollestad.materialdialogs.f fVar = this.O;
        if (fVar != null) {
            fVar.hide();
        }
        this.O = null;
    }

    private final boolean s1() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final String t1() {
        StringBuilder sb = new StringBuilder();
        sb.append("EPProgression-");
        b bVar = this.N;
        if (bVar != null) {
            sb.append(bVar.b());
            sb.append('=');
            b bVar2 = this.N;
            if (bVar2 != null) {
                Integer a2 = bVar2.a();
                sb.append(a2 != null ? a2.intValue() : 1);
                return sb.toString();
            }
            v62.p("params");
            throw null;
        }
        v62.p("params");
        throw null;
    }

    private final String u1() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreferredResizeMode");
        b bVar = this.N;
        if (bVar != null) {
            sb.append(bVar.b());
            return sb.toString();
        }
        v62.p("params");
        throw null;
    }

    private final void v1() {
        z1();
        we2.c(this, (z52) null, new g(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void w1(String str) {
        z1();
        b bVar = this.N;
        if (bVar != null) {
            Integer a2 = bVar.a();
            int intValue = a2 != null ? a2.intValue() : 0;
            b bVar2 = this.N;
            if (bVar2 != null) {
                U().j(new com.zunjae.anyme.features.notes.d(bVar2.b(), intValue, str)).Q(new i(this, str));
            } else {
                v62.p("params");
                throw null;
            }
        } else {
            v62.p("params");
            throw null;
        }
    }

    private final void x1() {
        ((Button) l0(C0275R$id.showInfoButton)).setOnClickListener(new j(this));
        ((ImageButton) l0(C0275R$id.exoPlaybackSpeed)).setOnClickListener(new k(this));
        ((ImageButton) l0(C0275R$id.exoResizeMode)).setOnClickListener(new l(this));
        ((ImageButton) l0(C0275R$id.exoCreateSnapshot)).setOnClickListener(new m(this));
        ((ImageButton) l0(C0275R$id.exoCreateSnapshot)).setOnLongClickListener(new n(this));
        ((Button) l0(C0275R$id.exoSkipIntro)).setOnClickListener(new o(this));
    }

    /* access modifiers changed from: private */
    public final void y1(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Episode ");
        b bVar = this.N;
        if (bVar != null) {
            sb.append(bVar.a());
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Write some notes for ");
            b bVar2 = this.N;
            if (bVar2 != null) {
                sb3.append(bVar2.c());
                f.e a2 = com.zunjae.anyme.features.notes.b.h0.a(Q(), sb2, sb3.toString(), str);
                a2.A(new p(this));
                com.afollestad.materialdialogs.f c2 = a2.c();
                v62.d(c2, "dialog");
                EditText i2 = c2.i();
                if (i2 != null) {
                    i2.setMaxLines(5);
                }
                c2.show();
                return;
            }
            v62.p("params");
            throw null;
        }
        v62.p("params");
        throw null;
    }

    private final void z1() {
        com.afollestad.materialdialogs.f c2 = mw1.a(this, "Please wait", (String) null).c();
        this.O = c2;
        if (c2 != null) {
            c2.show();
        }
    }

    public void G0(int i2) {
        if (i2 == 0) {
            Button button = (Button) l0(C0275R$id.showInfoButton);
            v62.d(button, "showInfoButton");
            rw1.i(button);
            if (!q1().f()) {
                Button button2 = (Button) l0(C0275R$id.exoSkipIntro);
                v62.d(button2, "exoSkipIntro");
                rw1.i(button2);
                return;
            }
            return;
        }
        FrameLayout frameLayout = (FrameLayout) l0(C0275R$id.container);
        v62.d(frameLayout, "container");
        rw1.a(frameLayout);
        E0();
    }

    public void J0(long j2, long j3) {
        if (B0().b()) {
            if (((float) j2) / ((float) j3) < 0.9f) {
                l02.s(t1(), j2);
            } else {
                l02.c(t1());
            }
        }
    }

    public long L0() {
        long h2 = l02.h(t1(), 0);
        l02.c(t1());
        return h2;
    }

    public void M0(List<l22<String, String>> list) {
        v62.e(list, "videoInformation");
        q1().i().k(list);
    }

    public void N0() {
    }

    public int P0() {
        return l02.g(u1(), 0);
    }

    public void S0(int i2) {
        l02.r(u1(), i2);
    }

    public String X0() {
        return null;
    }

    public String a1() {
        b bVar = this.N;
        if (bVar != null) {
            return bVar.d();
        }
        v62.p("params");
        throw null;
    }

    public String b1() {
        StringBuilder sb = new StringBuilder();
        sb.append("EP");
        b bVar = this.N;
        if (bVar != null) {
            sb.append(bVar.a());
            sb.append(' ');
            b bVar2 = this.N;
            if (bVar2 != null) {
                sb.append(bVar2.c());
                return sb.toString();
            }
            v62.p("params");
            throw null;
        }
        v62.p("params");
        throw null;
    }

    public View l0(int i2) {
        if (this.P == null) {
            this.P = new HashMap();
        }
        View view = (View) this.P.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.P.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public boolean o1() {
        return true;
    }

    public void onBackPressed() {
        h hVar = new h(this);
        r O0 = O0();
        if (((float) O0.b()) / ((float) O0.a()) < 0.75f) {
            hVar.a();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        String w;
        String stringExtra = getIntent().getStringExtra("animeVydiaParameter");
        v62.c(stringExtra);
        v62.d(stringExtra, "intent.getStringExtra(\"animeVydiaParameter\")!!");
        Object fromJson = new Gson().fromJson(stringExtra, b.class);
        v62.d(fromJson, "Gson().fromJson(animeVyd…diaParameter::class.java)");
        this.N = (b) fromJson;
        c q1 = q1();
        b bVar = this.N;
        if (bVar != null) {
            q1.l(bVar.b());
            c q12 = q1();
            b bVar2 = this.N;
            if (bVar2 != null) {
                Integer a2 = bVar2.a();
                q12.k(a2 != null ? a2.intValue() : 0);
                super.onCreate(bundle);
                nu1 S = S();
                b bVar3 = this.N;
                if (bVar3 != null) {
                    this.M = S.u((long) bVar3.b());
                    gr1 p1 = p1();
                    b bVar4 = this.N;
                    if (bVar4 != null) {
                        long b2 = (long) bVar4.b();
                        sy1 sy1 = this.M;
                        String str2 = "";
                        if (sy1 == null || (str = sy1.y()) == null) {
                            str = str2;
                        }
                        sy1 sy12 = this.M;
                        if (!(sy12 == null || (w = sy12.w()) == null)) {
                            str2 = w;
                        }
                        p1.l(new xy1(b2, str, str2));
                        x1();
                        b0(2131296501, new su1());
                        return;
                    }
                    v62.p("params");
                    throw null;
                }
                v62.p("params");
                throw null;
            }
            v62.p("params");
            throw null;
        }
        v62.p("params");
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        getMenuInflater().inflate(C0279R$menu.menu_animevydiaplayer, menu);
        MenuItem findItem = menu.findItem(C0275R$id.enterPiP);
        v62.d(findItem, "menu.findItem(R.id.enterPiP)");
        findItem.setVisible(s1() && o1());
        return true;
    }

    @vq1
    public final void onNavigationBusReceived(p pVar) {
        v62.e(pVar, "navigationBus");
        com.zunjae.extensions.a e2 = com.zunjae.extensions.c.e(pVar.a() / ((long) 1000));
        W0("Navigating to " + e2.d());
        z0().Z(pVar.a());
        ((PlayerView) l0(C0275R$id.exoPlayer)).w();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId != 2131296340) {
            if (itemId != 2131296569) {
                if (itemId == 2131296972) {
                    K0();
                }
            } else if (Build.VERSION.SDK_INT >= 26) {
                y0();
            }
        } else if (xx1.a.b()) {
            startActivity(new Intent(this, KanonExplanation.class));
        } else {
            v1();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        cw1.k.a().l(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        cw1.k.a().j(this);
    }
}
