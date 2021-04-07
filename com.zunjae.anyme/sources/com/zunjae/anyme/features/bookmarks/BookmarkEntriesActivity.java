package com.zunjae.anyme.features.bookmarks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public final class BookmarkEntriesActivity extends AbstractActivity {
    /* access modifiers changed from: private */
    public static final String I = "sortOrderBookmarkEntries";
    public static final c J = new c((r62) null);
    /* access modifiers changed from: private */
    public a9<f> D = b9.a();
    private final d22 E = g22.b(new a(this, (oh2) null, (o52) null));
    private String F;
    private String G;
    private HashMap H;

    public static final class a extends w62 implements o52<qu1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, qu1] */
        /* renamed from: a */
        public final qu1 invoke() {
            return lg2.b(this.f, f72.b(qu1.class), this.g, this.h);
        }
    }

    public static final class b extends RecyclerView.c0 {
        private final TextView A;
        private final TextView B;
        private final ImageView x;
        private final TextView y;
        private final TextView z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            v62.e(view, "itemView");
            View findViewById = view.findViewById(C0275R$id.seriesImage);
            v62.d(findViewById, "itemView.findViewById(R.id.seriesImage)");
            this.x = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0275R$id.seriesTitle);
            v62.d(findViewById2, "itemView.findViewById(R.id.seriesTitle)");
            this.y = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0275R$id.cardViewContainer);
            v62.d(findViewById3, "itemView.findViewById(R.id.cardViewContainer)");
            ViewGroup viewGroup = (ViewGroup) findViewById3;
            View findViewById4 = view.findViewById(C0275R$id.seriesScore);
            v62.d(findViewById4, "itemView.findViewById(R.id.seriesScore)");
            this.z = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C0275R$id.myStatus);
            v62.d(findViewById5, "itemView.findViewById(R.id.myStatus)");
            this.A = (TextView) findViewById5;
            View findViewById6 = view.findViewById(C0275R$id.myWatchingProgress);
            v62.d(findViewById6, "itemView.findViewById(R.id.myWatchingProgress)");
            this.B = (TextView) findViewById6;
        }

        public final TextView M() {
            return this.A;
        }

        public final TextView N() {
            return this.B;
        }

        public final ImageView O() {
            return this.x;
        }

        public final TextView P() {
            return this.z;
        }

        public final TextView Q() {
            return this.y;
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public final int a() {
            return l02.g(BookmarkEntriesActivity.I, 4);
        }

        public final Intent b(Context context, String str, String str2) {
            v62.e(context, "context");
            v62.e(str, "bookmarkId");
            v62.e(str2, "bookmarkName");
            Intent intent = new Intent(context, BookmarkEntriesActivity.class);
            intent.putExtra("bookmarkId", str);
            intent.putExtra("bookmarkName", str2);
            return intent;
        }

        public final void c(int i) {
            l02.r(BookmarkEntriesActivity.I, i);
        }
    }

    public enum d {
        Names(1, "Names Asc"),
        NamesDesc(2, "Names Desc"),
        Score(3, "Score Asc"),
        ScoreDesc(4, "Score Desc"),
        Date(5, "Date Added Asc"),
        DateDesc(6, "Date Added Desc");
        
        public static final a Companion = null;
        private final int id;
        private final String title;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(r62 r62) {
                this();
            }

            public final d a(int i) {
                d dVar;
                d[] values = d.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        dVar = null;
                        break;
                    }
                    dVar = values[i2];
                    if (dVar.getId() == i) {
                        break;
                    }
                    i2++;
                }
                return dVar != null ? dVar : d.ScoreDesc;
            }
        }

        static {
            Companion = new a((r62) null);
        }

        private d(int i, String str) {
            this.id = i;
            this.title = str;
        }

        public final int getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public String toString() {
            return this.title;
        }
    }

    static final class e extends w62 implements z52<f, u22> {
        final /* synthetic */ BookmarkEntriesActivity f;

        public static final class a implements ci2<Void> {
            final /* synthetic */ e a;
            final /* synthetic */ f b;

            a(e eVar, f fVar) {
                this.a = eVar;
                this.b = fVar;
            }

            public void a(ai2<Void> ai2, Throwable th) {
                v62.e(ai2, "call");
                v62.e(th, "t");
                Toast makeText = Toast.makeText(this.a.f, "A fatal error occurred. Are you connected to the internet?", 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }

            public void b(ai2<Void> ai2, qi2<Void> qi2) {
                v62.e(ai2, "call");
                v62.e(qi2, "response");
                if (qi2.d()) {
                    List d0 = n32.d0(this.a.f.D.e());
                    d0.remove(this.b);
                    a9.a.a(this.a.f.D, d0, (d62) null, (d62) null, 6, (Object) null);
                    this.a.f.J0();
                    return;
                }
                Toast makeText = Toast.makeText(this.a.f, "Could not delete this show", 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(BookmarkEntriesActivity bookmarkEntriesActivity) {
            super(1);
            this.f = bookmarkEntriesActivity;
        }

        public final void a(f fVar) {
            v62.e(fVar, "item");
            this.f.U().K(BookmarkEntriesActivity.p0(this.f), new j(f32.f(), e32.b(Integer.valueOf(fVar.a())))).Q(new a(this, fVar));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((f) obj);
            return u22.a;
        }
    }

    static final class f implements f.n {
        final /* synthetic */ e a;
        final /* synthetic */ f b;

        f(e eVar, f fVar) {
            this.a = eVar;
            this.b = fVar;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.a(this.b);
        }
    }

    public static final class g implements ci2<Void> {
        final /* synthetic */ BookmarkEntriesActivity a;

        g(BookmarkEntriesActivity bookmarkEntriesActivity) {
            this.a = bookmarkEntriesActivity;
        }

        public void a(ai2<Void> ai2, Throwable th) {
            v62.e(ai2, "call");
            v62.e(th, "t");
            Toast makeText = Toast.makeText(this.a.Q(), "Could not delete this bookmark. Try again later", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }

        public void b(ai2<Void> ai2, qi2<Void> qi2) {
            v62.e(ai2, "call");
            v62.e(qi2, "response");
            AbstractActivity o0 = this.a.Q();
            Toast makeText = Toast.makeText(o0, "Bookmark " + BookmarkEntriesActivity.q0(this.a) + " deleted ):", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            this.a.setResult(-1);
            this.a.finish();
        }
    }

    static final class h implements f.n {
        final /* synthetic */ BookmarkEntriesActivity a;

        h(BookmarkEntriesActivity bookmarkEntriesActivity) {
            this.a = bookmarkEntriesActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.A0();
        }
    }

    public static final class i implements ci2<Void> {
        final /* synthetic */ BookmarkEntriesActivity a;
        final /* synthetic */ String b;

        i(BookmarkEntriesActivity bookmarkEntriesActivity, String str) {
            this.a = bookmarkEntriesActivity;
            this.b = str;
        }

        public void a(ai2<Void> ai2, Throwable th) {
            v62.e(ai2, "call");
            v62.e(th, "t");
            Toast makeText = Toast.makeText(this.a.Q(), "Could not rename this bookmark. Try again later", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            uj2.d(th);
        }

        public void b(ai2<Void> ai2, qi2<Void> qi2) {
            v62.e(ai2, "call");
            v62.e(qi2, "response");
            AbstractActivity o0 = this.a.Q();
            Toast makeText = Toast.makeText(o0, "Successfully renamed this bookmark to " + this.b, 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            Toolbar toolbar = (Toolbar) this.a.l0(C0275R$id.toolbar);
            if (toolbar != null) {
                toolbar.setTitle((CharSequence) this.b);
            }
            this.a.setResult(-1);
        }
    }

    static final class j implements f.h {
        final /* synthetic */ BookmarkEntriesActivity a;

        j(BookmarkEntriesActivity bookmarkEntriesActivity) {
            this.a = bookmarkEntriesActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, CharSequence charSequence) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.d(charSequence, "input");
            if (charSequence.length() > 0) {
                this.a.D0(charSequence.toString());
                return;
            }
            Toast makeText = Toast.makeText(this.a.Q(), "Please enter something", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    static final class k extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ BookmarkEntriesActivity f;
        final /* synthetic */ int g;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends f, b>, u22> {
            final /* synthetic */ k f;

            /* renamed from: com.zunjae.anyme.features.bookmarks.BookmarkEntriesActivity$k$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0166a extends u62 implements z52<View, b> {
                public static final C0166a n = new C0166a();

                C0166a() {
                    super(1, b.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final b r(View view) {
                    v62.e(view, "p1");
                    return new b(view);
                }
            }

            static final class b extends w62 implements e62<b, Integer, f, u22> {
                final /* synthetic */ a f;

                /* renamed from: com.zunjae.anyme.features.bookmarks.BookmarkEntriesActivity$k$a$b$a  reason: collision with other inner class name */
                static final class C0167a extends w62 implements d62<Integer, Integer, u22> {
                    final /* synthetic */ b f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0167a(b bVar) {
                        super(2);
                        this.f = bVar;
                    }

                    public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                        a(((Number) obj).intValue(), ((Number) obj2).intValue());
                        return u22.a;
                    }

                    public final void a(int i, int i2) {
                        TextView N = this.f.N();
                        N.setText("EP " + i + '/' + i2);
                        rw1.i(this.f.N());
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(b bVar, int i, f fVar) {
                    v62.e(bVar, "$receiver");
                    v62.e(fVar, "entry");
                    ry1 d = fVar.d();
                    com.zunjae.anyme.a.b(this.f.f.f.T()).t(fVar.c()).K0(bVar.O());
                    bVar.Q().setText(fVar.e());
                    ry1 d2 = fVar.d();
                    if (d2 != null) {
                        int c = d2.c();
                        TextView P = bVar.P();
                        P.setText(' ' + c + " {faw-star} ");
                        rw1.i(bVar.P());
                    } else {
                        rw1.a(bVar.P());
                    }
                    ry1 d3 = fVar.d();
                    Integer num = null;
                    Integer valueOf = d3 != null ? Integer.valueOf(d3.b()) : null;
                    ry1 d4 = fVar.d();
                    if (d4 != null) {
                        num = Integer.valueOf(d4.e());
                    }
                    if (((u22) nw1.a(valueOf, num, new C0167a(bVar))) == null) {
                        rw1.a(bVar.N());
                        u22 u22 = u22.a;
                    }
                    if (d != null) {
                        bVar.M().setText(sy1.r.c(d.d()));
                        rw1.i(bVar.M());
                        return;
                    }
                    rw1.a(bVar.M());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((b) obj, ((Number) obj2).intValue(), (f) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements d62<r9<? extends f>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<f> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    long a = (long) r9Var.getItem().a();
                    String e = r9Var.getItem().e();
                    String str = "";
                    if (e == null) {
                        e = str;
                    }
                    String c = r9Var.getItem().c();
                    if (c != null) {
                        str = c;
                    }
                    this.f.f.f.T().startActivity(AnimeInfoActivity.M.b(this.f.f.f.T(), new xy1(a, e, str)));
                }
            }

            static final class d extends w62 implements d62<r9<? extends f>, Integer, u22> {
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

                public final void a(r9<f> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    this.f.f.f.z0(r9Var.getItem());
                }
            }

            static final class e extends w62 implements z52<f, Number> {
                public static final e f = new e();

                e() {
                    super(1);
                }

                /* renamed from: a */
                public final Number r(f fVar) {
                    v62.e(fVar, "it");
                    return Integer.valueOf(fVar.a());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(1);
                this.f = kVar;
            }

            public final void a(com.afollestad.recyclical.a<f, b> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0166a.n, new b(this));
                aVar.d(new c(this));
                aVar.a(new d(this));
                aVar.b(e.f);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(BookmarkEntriesActivity bookmarkEntriesActivity, int i) {
            super(1);
            this.f = bookmarkEntriesActivity;
            this.g = i;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.D);
            cVar.h(new GridLayoutManager(this.f.T(), this.g));
            a aVar = new a(this);
            String name = f.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_bookmark_entry, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    static final class l implements View.OnClickListener {
        final /* synthetic */ BookmarkEntriesActivity e;

        l(BookmarkEntriesActivity bookmarkEntriesActivity) {
            this.e = bookmarkEntriesActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList;
            List<f> list;
            com.zunjae.vresult.a d = this.e.C0().m().d();
            if (d == null || (list = (List) d.a()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(g32.l(list, 10));
                for (f a : list) {
                    arrayList.add(Integer.valueOf(a.a()));
                }
            }
            BookmarkEntriesActivity bookmarkEntriesActivity = this.e;
            bookmarkEntriesActivity.startActivityForResult(AddBookmarkEntriesActivity.K.a(bookmarkEntriesActivity, arrayList, BookmarkEntriesActivity.p0(bookmarkEntriesActivity), BookmarkEntriesActivity.q0(this.e)), 1);
        }
    }

    static final class m<T> implements u<com.zunjae.vresult.a<? extends List<? extends f>>> {
        final /* synthetic */ BookmarkEntriesActivity a;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ m f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(m mVar) {
                super(0);
                this.f = mVar;
            }

            public final void a() {
                this.f.a.C0().E(BookmarkEntriesActivity.p0(this.f.a));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        m(BookmarkEntriesActivity bookmarkEntriesActivity) {
            this.a = bookmarkEntriesActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<f>> aVar) {
            if (aVar instanceof a.c) {
                fw1.f.j((RecyclerView) this.a.l0(C0275R$id.recyclerView));
                FloatingTextButton floatingTextButton = (FloatingTextButton) this.a.l0(C0275R$id.addShows);
                v62.d(floatingTextButton, "addShows");
                floatingTextButton.setEnabled(false);
            } else if (aVar instanceof a.e) {
                a9.a.a(this.a.D, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView, "recyclerView");
                rw1.g(recyclerView);
                FloatingTextButton floatingTextButton2 = (FloatingTextButton) this.a.l0(C0275R$id.addShows);
                v62.d(floatingTextButton2, "addShows");
                floatingTextButton2.setEnabled(true);
                this.a.J0();
            } else if (aVar instanceof a.d) {
                String string = this.a.getString(C0283R$string.noBookmarksMessage);
                v62.d(string, "getString(R.string.noBookmarksMessage)");
                fw1.f.k((RecyclerView) this.a.l0(C0275R$id.recyclerView), string);
            } else if (aVar instanceof a.b) {
                RecyclerView recyclerView2 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView2, "recyclerView");
                rw1.d(recyclerView2, "Could not load any shows", (String) null, new a(this), 2, (Object) null);
            }
        }
    }

    public static final class n<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(((f) t).e(), ((f) t2).e());
        }
    }

    public static final class o<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            ry1 d = ((f) t).d();
            int i = 0;
            Integer valueOf = Integer.valueOf(d != null ? d.c() : 0);
            ry1 d2 = ((f) t2).d();
            if (d2 != null) {
                i = d2.c();
            }
            return d42.a(valueOf, Integer.valueOf(i));
        }
    }

    public static final class p<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Integer.valueOf(((f) t).b()), Integer.valueOf(((f) t2).b()));
        }
    }

    public static final class q<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(((f) t2).e(), ((f) t).e());
        }
    }

    public static final class r<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            ry1 d = ((f) t2).d();
            int i = 0;
            Integer valueOf = Integer.valueOf(d != null ? d.c() : 0);
            ry1 d2 = ((f) t).d();
            if (d2 != null) {
                i = d2.c();
            }
            return d42.a(valueOf, Integer.valueOf(i));
        }
    }

    public static final class s<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Integer.valueOf(((f) t2).b()), Integer.valueOf(((f) t).b()));
        }
    }

    static final class t implements f.i {
        final /* synthetic */ BookmarkEntriesActivity a;
        final /* synthetic */ List b;

        t(BookmarkEntriesActivity bookmarkEntriesActivity, List list) {
            this.a = bookmarkEntriesActivity;
            this.b = list;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, View view, int i, CharSequence charSequence) {
            BookmarkEntriesActivity.J.c(((d) this.b.get(i)).getId());
            com.zunjae.vresult.a d = this.a.C0().m().d();
            if (d != null && ((List) d.a()) != null) {
                a9 s0 = this.a.D;
                BookmarkEntriesActivity bookmarkEntriesActivity = this.a;
                a9.a.a(s0, bookmarkEntriesActivity.H0(bookmarkEntriesActivity.D.e()), (d62) null, (d62) null, 6, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void A0() {
        com.zunjae.anyme.features.kanon.e U = U();
        String str = this.F;
        if (str != null) {
            U.h(str).Q(new g(this));
        } else {
            v62.p("bookmarkId");
            throw null;
        }
    }

    private final void B0() {
        String str;
        int size = this.D.size();
        if (size != 0) {
            str = "Are you sure you want to delete this bookmark? It contains " + size + " shows";
        } else {
            str = "Are you sure you want to delete this bookmark?";
        }
        f.e eVar = new f.e(this);
        eVar.E("Are you sure");
        eVar.i(str);
        eVar.B("Yes");
        eVar.w("No");
        eVar.A(new h(this));
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final qu1 C0() {
        return (qu1) this.E.getValue();
    }

    /* access modifiers changed from: private */
    public final void D0(String str) {
        com.zunjae.anyme.features.kanon.e U = U();
        String str2 = this.F;
        if (str2 != null) {
            U.q(str2, str).Q(new i(this, str));
        } else {
            v62.p("bookmarkId");
            throw null;
        }
    }

    private final void E0() {
        f.e eVar = new f.e(this);
        eVar.E("Choose a new bookmark title");
        eVar.p(32769);
        eVar.n(3, 64);
        eVar.B("rename");
        eVar.e(true);
        String str = this.G;
        if (str != null) {
            eVar.l(str, (CharSequence) null, new j(this));
            try {
                eVar.D();
            } catch (Exception e2) {
                uj2.d(e2);
            }
        } else {
            v62.p("bookmarkName");
            throw null;
        }
    }

    private final void F0() {
        int a2 = bw1.a.a(T(), 3, 4, 5, 2);
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new k(this, a2));
    }

    private final void G0() {
        ((FloatingTextButton) l0(C0275R$id.addShows)).setOnClickListener(new l(this));
        C0().m().g(this, new m(this));
    }

    /* access modifiers changed from: private */
    public final List<f> H0(List<f> list) {
        Comparator comparator;
        switch (e.a[d.Companion.a(J.a()).ordinal()]) {
            case 1:
                comparator = new n();
                break;
            case 2:
                comparator = new q();
                break;
            case 3:
                comparator = new o();
                break;
            case 4:
                comparator = new r();
                break;
            case 5:
                comparator = new p();
                break;
            case 6:
                comparator = new s();
                break;
            default:
                throw new j22();
        }
        return n32.U(list, comparator);
    }

    private final void I0() {
        List a2 = a32.a(d.values());
        f.e eVar = new f.e(this);
        eVar.E("Pick Sort Order");
        eVar.q(a2);
        eVar.s(new t(this, a2));
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final void J0() {
        String str;
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        int size = this.D.size();
        if (size == 0) {
            str = "No entries";
        } else if (size != 1) {
            str = size + " entries";
        } else {
            str = "1 entry";
        }
        toolbar.setSubtitle((CharSequence) str);
    }

    public static final /* synthetic */ String p0(BookmarkEntriesActivity bookmarkEntriesActivity) {
        String str = bookmarkEntriesActivity.F;
        if (str != null) {
            return str;
        }
        v62.p("bookmarkId");
        throw null;
    }

    public static final /* synthetic */ String q0(BookmarkEntriesActivity bookmarkEntriesActivity) {
        String str = bookmarkEntriesActivity.G;
        if (str != null) {
            return str;
        }
        v62.p("bookmarkName");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void z0(f fVar) {
        e eVar = new e(this);
        f.e eVar2 = new f.e(this);
        StringBuilder sb = new StringBuilder();
        sb.append("Do you want to delete '");
        sb.append(fVar.e());
        sb.append("' from '");
        String str = this.G;
        if (str != null) {
            sb.append(str);
            sb.append("'?");
            eVar2.E(sb.toString());
            eVar2.w("Nope");
            eVar2.B("Yes");
            eVar2.A(new f(eVar, fVar));
            eVar2.D();
            return;
        }
        v62.p("bookmarkName");
        throw null;
    }

    public View l0(int i2) {
        if (this.H == null) {
            this.H = new HashMap();
        }
        View view = (View) this.H.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.H.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1 && i3 == -1) {
            qu1 C0 = C0();
            String str = this.F;
            if (str != null) {
                C0.E(str);
                setResult(-1);
                return;
            }
            v62.p("bookmarkId");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_bookmark_entries);
        String stringExtra = getIntent().getStringExtra("bookmarkId");
        v62.c(stringExtra);
        this.F = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("bookmarkName");
        v62.c(stringExtra2);
        this.G = stringExtra2;
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        String str = this.G;
        if (str != null) {
            AbstractActivity.k0(this, toolbar, str, (String) null, true, 4, (Object) null);
            F0();
            G0();
            return;
        }
        v62.p("bookmarkName");
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0279R$menu.bookmark_entries, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 2131296528) {
            B0();
        } else if (itemId == 2131297018) {
            E0();
        } else if (itemId == 2131297113) {
            I0();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!com.zunjae.vresult.b.a(C0().m())) {
            qu1 C0 = C0();
            String str = this.F;
            if (str != null) {
                C0.E(str);
            } else {
                v62.p("bookmarkId");
                throw null;
            }
        }
    }
}
