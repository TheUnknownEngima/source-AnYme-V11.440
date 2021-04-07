package com.zunjae.anyme.abstracts;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import com.zunjae.anyme.features.bookmarks.i;
import com.zunjae.anyme.features.kanon.KanonExplanation;
import com.zunjae.anyme.features.login.WelcomeActivity;
import com.zunjae.anyme.features.niche.au.ud;
import com.zunjae.anyme.features.niche.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class AbstractActivity extends AppCompatActivity {
    private final d22 A = g22.b(new b(this, (oh2) null, (o52) null));
    private final d22 B = g22.b(new c(this, (oh2) null, (o52) null));
    private final String C = "keyUserHasLongClickedAddedAShow";
    protected Context w;
    protected AbstractActivity x;
    private final d22 y = g22.b(new a(this, (oh2) null, (o52) null));
    private final d22 z = g22.b(new d(this, (oh2) null, (o52) null));

    public static final class a extends w62 implements o52<hy1> {
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

        /* JADX WARNING: type inference failed for: r0v3, types: [hy1, java.lang.Object] */
        public final hy1 invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(hy1.class), this.g, this.h);
        }
    }

    public static final class b extends w62 implements o52<com.zunjae.anyme.features.kanon.e> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.zunjae.anyme.features.kanon.e] */
        public final com.zunjae.anyme.features.kanon.e invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(com.zunjae.anyme.features.kanon.e.class), this.g, this.h);
        }
    }

    public static final class c extends w62 implements o52<com.zunjae.anyme.features.niche.d> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.zunjae.anyme.features.niche.d, java.lang.Object] */
        public final com.zunjae.anyme.features.niche.d invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(com.zunjae.anyme.features.niche.d.class), this.g, this.h);
        }
    }

    public static final class d extends w62 implements o52<nu1> {
        final /* synthetic */ androidx.lifecycle.n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(androidx.lifecycle.n nVar, oh2 oh2, o52 o52) {
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

    public static final class e extends w62 implements o52<nu1> {
        final /* synthetic */ androidx.lifecycle.n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(androidx.lifecycle.n nVar, oh2 oh2, o52 o52) {
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

    static final class f extends w62 implements z52<ve2<AbstractActivity>, u22> {
        final /* synthetic */ AbstractActivity f;
        final /* synthetic */ int g;
        final /* synthetic */ d22 h;
        final /* synthetic */ d82 i;
        final /* synthetic */ String j;
        final /* synthetic */ String k;
        final /* synthetic */ com.afollestad.materialdialogs.f l;

        static final class a extends w62 implements z52<AbstractActivity, u22> {
            final /* synthetic */ f f;
            final /* synthetic */ boolean g;
            final /* synthetic */ int h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar, boolean z, int i) {
                super(1);
                this.f = fVar;
                this.g = z;
                this.h = i;
            }

            public final void a(AbstractActivity abstractActivity) {
                v62.e(abstractActivity, "it");
                com.afollestad.materialdialogs.f fVar = this.f.l;
                if (fVar != null) {
                    fVar.dismiss();
                }
                if (this.g) {
                    AbstractActivity abstractActivity2 = this.f.f;
                    Toast makeText = Toast.makeText(abstractActivity2, "Added " + this.f.j + " to your profile", 0);
                    makeText.show();
                    v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                    return;
                }
                AbstractActivity abstractActivity3 = this.f.f;
                mw1.q(abstractActivity3, "Could not added this show to your profile. Error = " + this.h, "Aww");
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((AbstractActivity) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AbstractActivity abstractActivity, int i2, d22 d22, d82 d82, String str, String str2, com.afollestad.materialdialogs.f fVar) {
            super(1);
            this.f = abstractActivity;
            this.g = i2;
            this.h = d22;
            this.i = d82;
            this.j = str;
            this.k = str2;
            this.l = fVar;
        }

        public final void a(ve2<AbstractActivity> ve2) {
            int i2;
            v62.e(ve2, "$receiver");
            try {
                i2 = this.f.R().a(this.g);
            } catch (Exception e) {
                uj2.d(e);
                i2 = -1;
            }
            boolean z = i2 == 200;
            if (z) {
                try {
                    ((nu1) this.h.getValue()).T(sy1.r.a((long) this.g, this.j, this.k));
                } catch (Exception e2) {
                    uj2.d(e2);
                }
            }
            we2.a(ve2, new a(this, z, i2));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    public static final class g implements View.OnLayoutChangeListener {
        final /* synthetic */ o52 e;

        public g(o52 o52) {
            this.e = o52;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            v62.f(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.e.invoke();
        }
    }

    static final class h extends w62 implements z52<com.zunjae.anyme.features.bookmarks.h, u22> {
        final /* synthetic */ AbstractActivity f;
        final /* synthetic */ int g;

        static final class a extends w62 implements z52<ve2<AbstractActivity>, u22> {
            final /* synthetic */ h f;
            final /* synthetic */ com.zunjae.anyme.features.bookmarks.h g;

            /* renamed from: com.zunjae.anyme.abstracts.AbstractActivity$h$a$a  reason: collision with other inner class name */
            static final class C0160a extends w62 implements z52<AbstractActivity, u22> {
                final /* synthetic */ a f;
                final /* synthetic */ boolean g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0160a(a aVar, boolean z) {
                    super(1);
                    this.f = aVar;
                    this.g = z;
                }

                public final void a(AbstractActivity abstractActivity) {
                    AbstractActivity abstractActivity2;
                    String str;
                    int i;
                    v62.e(abstractActivity, "it");
                    if (this.g) {
                        abstractActivity2 = this.f.f.f;
                        i = 0;
                        str = "Updated your bookmarks ~";
                    } else {
                        abstractActivity2 = this.f.f.f;
                        i = 1;
                        str = "Could not update your bookmarks, please try again later.";
                    }
                    Toast makeText = Toast.makeText(abstractActivity2, str, i);
                    makeText.show();
                    v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                }

                public /* bridge */ /* synthetic */ Object r(Object obj) {
                    a((AbstractActivity) obj);
                    return u22.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, com.zunjae.anyme.features.bookmarks.h hVar2) {
                super(1);
                this.f = hVar;
                this.g = hVar2;
            }

            public final void a(ve2<AbstractActivity> ve2) {
                boolean z;
                v62.e(ve2, "$receiver");
                try {
                    qi2<Void> h = this.f.f.U().y(this.f.g, this.g).h();
                    v62.d(h, "kanonService.bulkAddOrDe…bookmarkUpdate).execute()");
                    z = h.d();
                } catch (Exception e) {
                    uj2.d(e);
                    z = false;
                }
                we2.a(ve2, new C0160a(this, z));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((ve2) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(AbstractActivity abstractActivity, int i) {
            super(1);
            this.f = abstractActivity;
            this.g = i;
        }

        public final void a(com.zunjae.anyme.features.bookmarks.h hVar) {
            v62.e(hVar, "bookmarkUpdate");
            Toast makeText = Toast.makeText(this.f, "Please wait, updating your bookmarks...", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            we2.c(this.f, (z52) null, new a(this, hVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.zunjae.anyme.features.bookmarks.h) obj);
            return u22.a;
        }
    }

    static final class i extends w62 implements z52<List<? extends com.zunjae.anyme.features.bookmarks.c>, f.e> {
        final /* synthetic */ AbstractActivity f;
        final /* synthetic */ h g;

        static final class a implements f.j {
            final /* synthetic */ i a;
            final /* synthetic */ List b;

            a(i iVar, List list) {
                this.a = iVar;
                this.b = list;
            }

            public final boolean a(com.afollestad.materialdialogs.f fVar, Integer[] numArr, CharSequence[] charSequenceArr) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                for (Object next : this.b) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        com.zunjae.anyme.features.bookmarks.c cVar = (com.zunjae.anyme.features.bookmarks.c) next;
                        v62.d(numArr, "which");
                        if (b32.g(numArr, Integer.valueOf(i))) {
                            arrayList.add(cVar);
                        } else {
                            arrayList2.add(cVar);
                        }
                        i = i2;
                    } else {
                        d32.k();
                        throw null;
                    }
                }
                List list = this.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object next2 : list) {
                    if (((com.zunjae.anyme.features.bookmarks.c) next2).c()) {
                        arrayList3.add(next2);
                    }
                }
                Set<com.zunjae.anyme.features.bookmarks.c> V = n32.V(arrayList, arrayList3);
                List list2 = this.b;
                ArrayList arrayList4 = new ArrayList();
                for (Object next3 : list2) {
                    if (true ^ ((com.zunjae.anyme.features.bookmarks.c) next3).c()) {
                        arrayList4.add(next3);
                    }
                }
                Set<com.zunjae.anyme.features.bookmarks.c> V2 = n32.V(arrayList2, arrayList4);
                h hVar = this.a.g;
                ArrayList arrayList5 = new ArrayList(g32.l(V, 10));
                for (com.zunjae.anyme.features.bookmarks.c a2 : V) {
                    arrayList5.add(a2.a());
                }
                ArrayList arrayList6 = new ArrayList(g32.l(V2, 10));
                for (com.zunjae.anyme.features.bookmarks.c a3 : V2) {
                    arrayList6.add(a3.a());
                }
                hVar.a(new com.zunjae.anyme.features.bookmarks.h(arrayList5, arrayList6));
                return true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(AbstractActivity abstractActivity, h hVar) {
            super(1);
            this.f = abstractActivity;
            this.g = hVar;
        }

        /* renamed from: a */
        public final f.e r(List<com.zunjae.anyme.features.bookmarks.c> list) {
            v62.e(list, "bookmarks");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                Integer num = null;
                if (i >= 0) {
                    if (((com.zunjae.anyme.features.bookmarks.c) next).c()) {
                        num = Integer.valueOf(i);
                    }
                    if (num != null) {
                        arrayList.add(num);
                    }
                    i = i2;
                } else {
                    d32.k();
                    throw null;
                }
            }
            f.e eVar = new f.e(this.f);
            eVar.E("Select all bookmarks");
            eVar.q(list);
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array != null) {
                eVar.t((Integer[]) array, new a(this, list));
                eVar.B("Update");
                v62.d(eVar, "MaterialDialog.Builder(t…  .positiveText(\"Update\")");
                return eVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    static final class j extends w62 implements z52<ve2<AbstractActivity>, u22> {
        final /* synthetic */ AbstractActivity f;
        final /* synthetic */ int g;
        final /* synthetic */ i h;

        static final class a extends w62 implements z52<AbstractActivity, u22> {
            final /* synthetic */ j f;
            final /* synthetic */ com.zunjae.anyme.features.bookmarks.i g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j jVar, com.zunjae.anyme.features.bookmarks.i iVar) {
                super(1);
                this.f = jVar;
                this.g = iVar;
            }

            public final void a(AbstractActivity abstractActivity) {
                AbstractActivity abstractActivity2;
                String str;
                T t;
                boolean z;
                v62.e(abstractActivity, "it");
                com.zunjae.anyme.features.bookmarks.i iVar = this.g;
                if (iVar instanceof i.b) {
                    abstractActivity2 = this.f.f;
                    str = "Can't link this Anime to any bookmarks... :/";
                } else if (iVar instanceof i.c) {
                    List<com.zunjae.anyme.features.bookmarks.c> a = ((i.c) iVar).a();
                    ArrayList<com.zunjae.anyme.features.bookmarks.c> arrayList = new ArrayList<>();
                    Iterator<T> it = a.iterator();
                    while (true) {
                        boolean z2 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (((com.zunjae.anyme.features.bookmarks.c) next).b().length() > 0) {
                            z2 = true;
                        }
                        if (z2) {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        Toast makeText = Toast.makeText(this.f.f, "No bookmarks found", 0);
                        makeText.show();
                        v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                        return;
                    }
                    for (com.zunjae.anyme.features.bookmarks.c cVar : arrayList) {
                        Iterator<T> it2 = ((i.c) this.g).a().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            com.zunjae.anyme.features.bookmarks.c cVar2 = (com.zunjae.anyme.features.bookmarks.c) t;
                            if (!v62.a(cVar2.a(), cVar.a()) || cVar2.d() == 0) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        com.zunjae.anyme.features.bookmarks.c cVar3 = (com.zunjae.anyme.features.bookmarks.c) t;
                        cVar.e(cVar3 != null && cVar3.d() == 1);
                    }
                    this.f.h.r(arrayList).D();
                    return;
                } else if (iVar instanceof i.a) {
                    uj2.d(((i.a) iVar).a());
                    abstractActivity2 = this.f.f;
                    str = "Could not connect to Kanon";
                } else {
                    return;
                }
                Toast makeText2 = Toast.makeText(abstractActivity2, str, 1);
                makeText2.show();
                v62.b(makeText2, "Toast\n        .makeText(…         show()\n        }");
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((AbstractActivity) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(AbstractActivity abstractActivity, int i, i iVar) {
            super(1);
            this.f = abstractActivity;
            this.g = i;
            this.h = iVar;
        }

        public final void a(ve2<AbstractActivity> ve2) {
            com.zunjae.anyme.features.bookmarks.i iVar;
            v62.e(ve2, "$receiver");
            try {
                List a2 = this.f.U().l(this.g).h().a();
                if (a2 != null) {
                    v62.d(a2, "results");
                    iVar = new i.c(a2);
                } else {
                    iVar = i.b.a;
                }
            } catch (Exception e) {
                iVar = new i.a(e);
            }
            we2.a(ve2, new a(this, iVar));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    static final class k extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ AbstractActivity f;
        final /* synthetic */ a9 g;
        final /* synthetic */ int h;
        final /* synthetic */ com.zunjae.anyme.features.kanon.generic_anime_list.c i;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends vy1, com.zunjae.anyme.features.kanon.generic_anime_list.b>, u22> {
            final /* synthetic */ k f;

            /* renamed from: com.zunjae.anyme.abstracts.AbstractActivity$k$a$a  reason: collision with other inner class name */
            static final class C0161a extends w62 implements z52<vy1, Number> {
                public static final C0161a f = new C0161a();

                C0161a() {
                    super(1);
                }

                /* renamed from: a */
                public final Number r(vy1 vy1) {
                    v62.e(vy1, "it");
                    return Integer.valueOf(vy1.e());
                }
            }

            static final /* synthetic */ class b extends u62 implements z52<View, com.zunjae.anyme.features.kanon.generic_anime_list.b> {
                public static final b n = new b();

                b() {
                    super(1, com.zunjae.anyme.features.kanon.generic_anime_list.b.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final com.zunjae.anyme.features.kanon.generic_anime_list.b r(View view) {
                    v62.e(view, "p1");
                    return new com.zunjae.anyme.features.kanon.generic_anime_list.b(view);
                }
            }

            static final class c extends w62 implements e62<com.zunjae.anyme.features.kanon.generic_anime_list.b, Integer, vy1, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x00a7  */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x00b6  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(com.zunjae.anyme.features.kanon.generic_anime_list.b r5, int r6, defpackage.vy1 r7) {
                    /*
                        r4 = this;
                        java.lang.String r6 = "$receiver"
                        defpackage.v62.e(r5, r6)
                        java.lang.String r6 = "show"
                        defpackage.v62.e(r7, r6)
                        com.zunjae.anyme.abstracts.AbstractActivity$k$a r6 = r4.f
                        com.zunjae.anyme.abstracts.AbstractActivity$k r6 = r6.f
                        com.zunjae.anyme.abstracts.AbstractActivity r6 = r6.f
                        android.content.Context r6 = r6.T()
                        com.zunjae.anyme.d r6 = com.zunjae.anyme.a.b(r6)
                        java.lang.String r0 = r7.d()
                        com.zunjae.anyme.c r6 = r6.t(r0)
                        android.widget.ImageView r0 = r5.Q()
                        r6.K0(r0)
                        boolean r6 = r7.c()
                        if (r6 == 0) goto L_0x0035
                        android.widget.TextView r6 = r5.N()
                        defpackage.rw1.a(r6)
                        goto L_0x003c
                    L_0x0035:
                        android.widget.TextView r6 = r5.N()
                        defpackage.rw1.i(r6)
                    L_0x003c:
                        android.widget.TextView r6 = r5.R()
                        java.lang.String r0 = r7.g()
                        r6.setText(r0)
                        android.widget.TextView r6 = r5.N()
                        com.zunjae.anyme.abstracts.AbstractActivity$k$a r0 = r4.f
                        com.zunjae.anyme.abstracts.AbstractActivity$k r0 = r0.f
                        com.zunjae.anyme.features.kanon.generic_anime_list.c r0 = r0.i
                        java.lang.String r0 = r0.descriptionToDisplay(r7)
                        r6.setText(r0)
                        double r0 = r7.f()
                        r6 = 0
                        double r2 = (double) r6
                        int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                        if (r6 <= 0) goto L_0x007e
                        com.zunjae.anyme.abstracts.AbstractActivity$k$a r6 = r4.f
                        com.zunjae.anyme.abstracts.AbstractActivity$k r6 = r6.f
                        com.zunjae.anyme.features.kanon.generic_anime_list.c r6 = r6.i
                        boolean r6 = r6.getShowGlobalScore()
                        if (r6 == 0) goto L_0x007e
                        android.widget.TextView r6 = r5.O()
                        double r0 = r7.f()
                        java.lang.String r0 = java.lang.String.valueOf(r0)
                        r6.setText(r0)
                        goto L_0x008b
                    L_0x007e:
                        java.lang.String r6 = r7.b()
                        if (r6 == 0) goto L_0x0093
                        android.widget.TextView r0 = r5.O()
                        r0.setText(r6)
                    L_0x008b:
                        android.widget.TextView r6 = r5.O()
                        defpackage.rw1.i(r6)
                        goto L_0x009a
                    L_0x0093:
                        android.widget.TextView r6 = r5.O()
                        defpackage.rw1.a(r6)
                    L_0x009a:
                        android.view.View r6 = r5.M()
                        defpackage.rw1.a(r6)
                        java.lang.String r6 = r7.h()
                        if (r6 == 0) goto L_0x00b6
                        android.widget.TextView r7 = r5.P()
                        r7.setText(r6)
                        android.widget.TextView r5 = r5.P()
                        defpackage.rw1.i(r5)
                        goto L_0x00bd
                    L_0x00b6:
                        android.widget.TextView r5 = r5.P()
                        defpackage.rw1.a(r5)
                    L_0x00bd:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.abstracts.AbstractActivity.k.a.c.a(com.zunjae.anyme.features.kanon.generic_anime_list.b, int, vy1):void");
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((com.zunjae.anyme.features.kanon.generic_anime_list.b) obj, ((Number) obj2).intValue(), (vy1) obj3);
                    return u22.a;
                }
            }

            static final class d extends w62 implements d62<r9<? extends vy1>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                d(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<vy1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    this.f.f.f.T().startActivity(AnimeInfoActivity.M.b(this.f.f.f.T(), r9Var.getItem().a()));
                }
            }

            static final class e extends w62 implements d62<r9<? extends vy1>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                e(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<vy1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    this.f.f.f.M(r9Var.getItem().e(), r9Var.getItem().g(), r9Var.getItem().d());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(1);
                this.f = kVar;
            }

            public final void a(com.afollestad.recyclical.a<vy1, com.zunjae.anyme.features.kanon.generic_anime_list.b> aVar) {
                v62.e(aVar, "$receiver");
                aVar.b(C0161a.f);
                aVar.c(b.n, new c(this));
                aVar.d(new d(this));
                aVar.a(new e(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(AbstractActivity abstractActivity, a9 a9Var, int i2, com.zunjae.anyme.features.kanon.generic_anime_list.c cVar) {
            super(1);
            this.f = abstractActivity;
            this.g = a9Var;
            this.h = i2;
            this.i = cVar;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.g);
            cVar.h(new GridLayoutManager(this.f.T(), this.h));
            a aVar = new a(this);
            String name = vy1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_generic_mal, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    static final class l extends w62 implements z52<ve2<AbstractActivity>, u22> {
        final /* synthetic */ AbstractActivity f;
        final /* synthetic */ int g;

        static final class a extends w62 implements z52<AbstractActivity, u22> {
            final /* synthetic */ l f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(l lVar) {
                super(1);
                this.f = lVar;
            }

            public final void a(AbstractActivity abstractActivity) {
                v62.e(abstractActivity, "it");
                try {
                    com.afollestad.materialdialogs.f c = xr1.a.a(this.f.f).c();
                    if (c != null) {
                        c.show();
                    }
                } catch (Exception e) {
                    uj2.d(e);
                }
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((AbstractActivity) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(AbstractActivity abstractActivity, int i) {
            super(1);
            this.f = abstractActivity;
            this.g = i;
        }

        public final void a(ve2<AbstractActivity> ve2) {
            v62.e(ve2, "$receiver");
            if (!xr1.a.g(this.f) && !this.f.V().e("keyShowWarningVideoPlayerApp", new c.a(this.g, 99))) {
                we2.d(ve2, new a(this));
            }
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    public static final class m extends w62 implements o52<nu1> {
        final /* synthetic */ androidx.lifecycle.n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(androidx.lifecycle.n nVar, oh2 oh2, o52 o52) {
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

    static final class n extends w62 implements z52<ve2<AbstractActivity>, u22> {
        final /* synthetic */ AbstractActivity f;
        final /* synthetic */ d g;
        final /* synthetic */ sy1 h;
        final /* synthetic */ com.afollestad.materialdialogs.f i;
        final /* synthetic */ e j;

        static final class a extends w62 implements z52<AbstractActivity, u22> {
            final /* synthetic */ n f;
            final /* synthetic */ kv1 g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n nVar, kv1 kv1) {
                super(1);
                this.f = nVar;
                this.g = kv1;
            }

            public final void a(AbstractActivity abstractActivity) {
                v62.e(abstractActivity, "it");
                try {
                    com.afollestad.materialdialogs.f fVar = this.f.i;
                    if (fVar != null) {
                        fVar.dismiss();
                    }
                } catch (Exception unused) {
                }
                if (this.g.c()) {
                    this.f.j.a(this.g);
                } else {
                    wu1.a.a(this.f.f.Q(), this.g);
                }
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((AbstractActivity) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(AbstractActivity abstractActivity, d dVar, sy1 sy1, com.afollestad.materialdialogs.f fVar, e eVar) {
            super(1);
            this.f = abstractActivity;
            this.g = dVar;
            this.h = sy1;
            this.i = fVar;
            this.j = eVar;
        }

        public final void a(ve2<AbstractActivity> ve2) {
            int i2;
            v62.e(ve2, "$receiver");
            try {
                int i3 = a.a[this.g.ordinal()];
                if (i3 == 1) {
                    i2 = this.f.R().b(this.h.i());
                } else if (i3 == 2) {
                    i2 = this.f.R().f(this.h);
                } else if (i3 == 3) {
                    i2 = this.f.R().a(this.h.i());
                } else {
                    throw new j22();
                }
            } catch (Exception e) {
                uj2.d(e);
                i2 = -1;
            }
            kv1 kv1 = new kv1(i2, "");
            if (kv1.c()) {
                int i4 = a.b[this.g.ordinal()];
                if (i4 == 1) {
                    this.f.S().u0(this.h);
                } else if (i4 == 2) {
                    this.f.S().p(this.h.i());
                } else if (i4 == 3) {
                    this.f.S().T(this.h);
                }
            }
            we2.a(ve2, new a(this, kv1));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    static final class o implements DialogInterface.OnCancelListener {
        public static final o e = new o();

        o() {
        }

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    static final class p implements Runnable {
        final /* synthetic */ Toolbar e;
        final /* synthetic */ String f;

        p(Toolbar toolbar, String str) {
            this.e = toolbar;
            this.f = str;
        }

        public final void run() {
            this.e.setTitle((CharSequence) this.f);
        }
    }

    static final class q implements Runnable {
        final /* synthetic */ Toolbar e;
        final /* synthetic */ String f;

        q(Toolbar toolbar, String str) {
            this.e = toolbar;
            this.f = str;
        }

        public final void run() {
            this.e.setSubtitle((CharSequence) this.f);
        }
    }

    /* access modifiers changed from: private */
    public final hy1 R() {
        return (hy1) this.y.getValue();
    }

    /* access modifiers changed from: private */
    public final nu1 S() {
        return (nu1) this.z.getValue();
    }

    private final void X() {
        l02.p(this.C, true);
    }

    private final void Z() {
        Intent intent;
        Bundle extras;
        Set<String> keySet;
        if (O() && (intent = getIntent()) != null && (extras = intent.getExtras()) != null && (keySet = extras.keySet()) != null) {
            for (String str : keySet) {
                try {
                    Object obj = extras.get(str);
                    String obj2 = obj != null ? obj.toString() : null;
                    com.google.firebase.crashlytics.c a2 = com.google.firebase.crashlytics.c.a();
                    if (obj2 == null) {
                        obj2 = "<null value>";
                    }
                    a2.d(str, obj2);
                } catch (Exception e2) {
                    uj2.d(e2);
                }
            }
        }
    }

    private final void d0() {
        AbstractActivity abstractActivity = this.x;
        if (abstractActivity != null) {
            startActivity(new Intent(abstractActivity, WelcomeActivity.class));
        } else {
            v62.p("activity");
            throw null;
        }
    }

    public static /* synthetic */ void f0(AbstractActivity abstractActivity, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = 4;
            }
            abstractActivity.e0(i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showVideoPlayerAppNotice");
    }

    public static /* synthetic */ void k0(AbstractActivity abstractActivity, Toolbar toolbar, String str, String str2, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                z2 = false;
            }
            abstractActivity.j0(toolbar, str, str2, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: xsetupToolbar");
    }

    public final void M(int i2, String str, String str2) {
        v62.e(str, "title");
        v62.e(str2, "imageUrl");
        if (fz1.a.h()) {
            d0();
            return;
        }
        d22 b2 = g22.b(new e(this, (oh2) null, (o52) null));
        if (((nu1) b2.getValue()).o(i2)) {
            mw1.q(this, "You've already added this show to your profile", "Oi");
            return;
        }
        X();
        we2.c(this, (z52) null, new f(this, i2, b2, (d82) null, str, str2, mw1.a(this, "Please wait", "Adding " + str + " to your profile~").D()), 1, (Object) null);
    }

    public final void N(xy1 xy1) {
        v62.e(xy1, "minimalAnimeInfo");
        int a2 = (int) xy1.a();
        String c2 = xy1.c();
        v62.d(c2, "minimalAnimeInfo.seriesTitle");
        String b2 = xy1.b();
        v62.d(b2, "minimalAnimeInfo.seriesImage");
        M(a2, c2, b2);
    }

    public boolean O() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void P(o52<u22> o52) {
        v62.e(o52, "action");
        Window window = getWindow();
        v62.d(window, "window");
        View findViewById = window.getDecorView().findViewById(16908290);
        v62.d(findViewById, "rootView");
        if (!o4.O(findViewById) || findViewById.isLayoutRequested()) {
            findViewById.addOnLayoutChangeListener(new g(o52));
        } else {
            o52.invoke();
        }
    }

    /* access modifiers changed from: protected */
    public final AbstractActivity Q() {
        AbstractActivity abstractActivity = this.x;
        if (abstractActivity != null) {
            return abstractActivity;
        }
        v62.p("activity");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final Context T() {
        Context context = this.w;
        if (context != null) {
            return context;
        }
        v62.p("context");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final com.zunjae.anyme.features.kanon.e U() {
        return (com.zunjae.anyme.features.kanon.e) this.A.getValue();
    }

    /* access modifiers changed from: protected */
    public final com.zunjae.anyme.features.niche.d V() {
        return (com.zunjae.anyme.features.niche.d) this.B.getValue();
    }

    public final void W(int i2) {
        i iVar = new i(this, new h(this, i2));
        if (xx1.a.b()) {
            startActivity(new Intent(this, KanonExplanation.class));
        } else {
            we2.c(this, (z52) null, new j(this, i2, iVar), 1, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void Y(AbstractActivity abstractActivity) {
        v62.e(abstractActivity, "<set-?>");
        this.x = abstractActivity;
    }

    public boolean a0() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        v62.e(context, "newBase");
        super.attachBaseContext(io.github.inflationx.viewpump.f.c.a(context));
    }

    /* access modifiers changed from: protected */
    public final void b0(int i2, Fragment fragment) {
        v62.e(fragment, "fragmentToSet");
        androidx.fragment.app.k q2 = q();
        v62.d(q2, "supportFragmentManager");
        s j2 = q2.j();
        v62.d(j2, "fragmentManager.beginTransaction()");
        j2.q(i2, fragment);
        j2.j();
    }

    @SuppressLint({"SetTextI18n"})
    public final void c0(RecyclerView recyclerView, a9<?> a9Var, com.zunjae.anyme.features.kanon.generic_anime_list.c cVar, int i2) {
        v62.e(recyclerView, "recyclerView");
        v62.e(a9Var, "dataSource");
        v62.e(cVar, "listType");
        com.afollestad.recyclical.b.a(recyclerView, new k(this, a9Var, i2, cVar));
    }

    /* access modifiers changed from: protected */
    public final void e0(int i2) {
        we2.c(this, (z52) null, new l(this, i2), 1, (Object) null);
    }

    public final void g0(String str) {
        v62.e(str, "url");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        Context context = this.w;
        if (context != null) {
            context.startActivity(intent);
        } else {
            v62.p("context");
            throw null;
        }
    }

    public AssetManager getAssets() {
        AssetManager assets;
        String str;
        if (Build.VERSION.SDK_INT <= 22) {
            Resources resources = getResources();
            v62.d(resources, "resources");
            assets = resources.getAssets();
            str = "resources.assets";
        } else {
            assets = super.getAssets();
            str = "super.getAssets()";
        }
        v62.d(assets, str);
        return assets;
    }

    public final void h0(String str) {
        v62.e(str, "url");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        startActivity(Intent.createChooser(intent, "Pick Your Browser"));
    }

    public final void i0(sy1 sy1, d dVar, e eVar) {
        v62.e(sy1, "anime");
        v62.e(dVar, "action");
        v62.e(eVar, "listener");
        if (fz1.a.h()) {
            d0();
        } else if (dVar != d.ADD || !((nu1) g22.b(new m(this, (oh2) null, (o52) null)).getValue()).o(sy1.i())) {
            f.e eVar2 = new f.e(this);
            eVar2.E("Loading");
            eVar2.i("Updating your MyAnimeList profile, please wait");
            eVar2.C(true, 0);
            eVar2.e(true);
            eVar2.d(o.e);
            eVar2.w("Cancel");
            eVar2.f(false);
            we2.c(this, (z52) null, new n(this, dVar, sy1, eVar2.D(), eVar), 1, (Object) null);
        } else {
            mw1.q(this, "You've already added this show to your profile", "Oi");
        }
    }

    /* access modifiers changed from: protected */
    public final void j0(Toolbar toolbar, String str, String str2, boolean z2) {
        ActionBar A2;
        v62.e(toolbar, "toolbar");
        H(toolbar);
        if (str != null) {
            toolbar.post(new p(toolbar, str));
        }
        if (str2 != null) {
            toolbar.post(new q(toolbar, str2));
        }
        if (z2 && (A2 = A()) != null) {
            A2.s(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.w = this;
        this.x = this;
        if (l02.e(getString(C0283R$string.preferences_appearance_full_screen), true)) {
            getWindow().setFlags(1024, 1024);
            if (a0() && Build.VERSION.SDK_INT >= 28) {
                Window window = getWindow();
                v62.d(window, "window");
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
        }
        Z();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window2 = getWindow();
            v62.d(window2, "window");
            window2.setNavigationBarColor(androidx.core.content.a.d(this, C0272R$color.custom_background));
        }
        super.onCreate(bundle);
        qv1 qv1 = qv1.a;
        Context context = this.w;
        if (context == null) {
            v62.p("context");
            throw null;
        } else if (qv1.A(context)) {
            new ud().W1(q(), "ud");
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
