package com.zunjae.anyme.features.anime.shows_list;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"SetTextI18n"})
public final class d extends RecyclerView.g<RecyclerView.c0> {
    private List<sy1> c;
    private List<sy1> d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private int i = -1;
    /* access modifiers changed from: private */
    public final AbstractActivity j;
    private final int k;

    public static final class a implements com.zunjae.anyme.abstracts.e {
        final /* synthetic */ d a;
        final /* synthetic */ sy1 b;

        a(d dVar, sy1 sy1) {
            this.a = dVar;
            this.b = sy1;
        }

        public void a(kv1 kv1) {
            v62.e(kv1, "httpResult");
            AbstractActivity I = this.a.j;
            Toast makeText = Toast.makeText(I, "Deleted " + this.b.y() + " from your profile", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    static final class b implements f.i {
        final /* synthetic */ d a;
        final /* synthetic */ ArrayList b;
        final /* synthetic */ String c;
        final /* synthetic */ sy1 d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;
        final /* synthetic */ String g;
        final /* synthetic */ String h;
        final /* synthetic */ String i;

        b(d dVar, ArrayList arrayList, String str, sy1 sy1, String str2, String str3, String str4, String str5, String str6) {
            this.a = dVar;
            this.b = arrayList;
            this.c = str;
            this.d = sy1;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, View view, int i2, CharSequence charSequence) {
            AbstractActivity I;
            Intent createChooser;
            String str = (String) this.b.get(i2);
            if (v62.a(str, this.c)) {
                this.d.H();
                this.a.X(this.d);
            } else if (v62.a(str, this.e)) {
                this.a.j.W(this.d.i());
            } else {
                if (v62.a(str, this.f)) {
                    I = this.a.j;
                    createChooser = AnimeInfoActivity.M.b(this.a.j, this.d.l());
                } else if (v62.a(str, this.g)) {
                    I = this.a.j;
                    createChooser = Intent.createChooser(this.d.D(), "Share this Anime");
                } else if (v62.a(str, this.h)) {
                    this.a.L(this.d);
                    return;
                } else if (v62.a(str, this.i)) {
                    yv1.a.b(this.a.j, this.d.y());
                    Toast makeText = Toast.makeText(this.a.j, "Copied title to your clipboard", 0);
                    makeText.show();
                    v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                    return;
                } else {
                    throw new IllegalStateException("no switch case found for " + i2);
                }
                I.startActivity(createChooser);
            }
        }
    }

    static final class c implements View.OnClickListener {
        final /* synthetic */ d e;
        final /* synthetic */ sy1 f;

        c(d dVar, sy1 sy1) {
            this.e = dVar;
            this.f = sy1;
        }

        public final void onClick(View view) {
            this.e.j.startActivity(AnimeInfoActivity.M.b(this.e.j, this.f.l()));
        }
    }

    /* renamed from: com.zunjae.anyme.features.anime.shows_list.d$d  reason: collision with other inner class name */
    static final class C0165d implements View.OnLongClickListener {
        final /* synthetic */ d e;
        final /* synthetic */ sy1 f;

        C0165d(d dVar, sy1 sy1) {
            this.e = dVar;
            this.f = sy1;
        }

        public final boolean onLongClick(View view) {
            this.e.Q(this.f);
            return true;
        }
    }

    static final class e implements View.OnClickListener {
        final /* synthetic */ d e;
        final /* synthetic */ sy1 f;

        e(d dVar, sy1 sy1) {
            this.e = dVar;
            this.f = sy1;
        }

        public final void onClick(View view) {
            this.e.Q(this.f);
        }
    }

    public static final class f implements com.zunjae.anyme.abstracts.e {
        final /* synthetic */ d a;
        final /* synthetic */ sy1 b;

        f(d dVar, sy1 sy1) {
            this.a = dVar;
            this.b = sy1;
        }

        public void a(kv1 kv1) {
            v62.e(kv1, "httpResult");
            AbstractActivity I = this.a.j;
            Toast makeText = Toast.makeText(I, "Successfully updated " + this.b.y(), 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    public d(AbstractActivity abstractActivity, int i2) {
        v62.e(abstractActivity, "activity");
        this.j = abstractActivity;
        this.k = i2;
        P();
        F(true);
    }

    /* access modifiers changed from: private */
    public final void L(sy1 sy1) {
        this.j.i0(sy1, com.zunjae.anyme.abstracts.d.DELETE, new a(this, sy1));
    }

    private final void O(sy1 sy1, a aVar) {
        com.zunjae.anyme.a.d(this.j).t(sy1.w()).g0(this.g, this.h).K0(aVar.N());
    }

    private final void P() {
        String string = this.j.getString(C0283R$string.preference_key_show_percentage_anime_watched);
        v62.d(string, "activity.getString(R.str…percentage_anime_watched)");
        this.e = l02.e(string, true);
        this.f = qv1.a.y();
        this.i = xu1.i.b(false);
        this.g = xu1.i.e(this.j);
        this.h = xu1.i.d(this.j);
    }

    /* access modifiers changed from: private */
    public final void Q(sy1 sy1) {
        ArrayList arrayList = new ArrayList();
        if (sy1.n() != 2) {
            arrayList.add("+1 Episode");
        }
        arrayList.add("Open");
        arrayList.add("Add To Bookmarks");
        arrayList.add("Share");
        arrayList.add("Delete");
        arrayList.add("Copy Title To Clipboard");
        f.e eVar = new f.e(this.j);
        eVar.E("Pick an Action");
        eVar.q(arrayList);
        eVar.s(new b(this, arrayList, "+1 Episode", sy1, "Add To Bookmarks", "Open", "Share", "Delete", "Copy Title To Clipboard"));
        eVar.D();
    }

    private final void R(a aVar, sy1 sy1) {
        aVar.M().setOnClickListener(new c(this, sy1));
        aVar.M().setOnLongClickListener(new C0165d(this, sy1));
    }

    private final void S(a aVar, sy1 sy1, ky1 ky1) {
        IconicsTextView P;
        Drawable f2;
        AbstractActivity abstractActivity;
        int i2;
        if (sy1.x() == 3) {
            IconicsTextView P2 = aVar.P();
            v62.d(P2, "holder.statusView");
            rw1.i(P2);
            IconicsTextView P3 = aVar.P();
            v62.d(P3, "holder.statusView");
            P3.setText("NYA");
            P = aVar.P();
            v62.d(P, "holder.statusView");
            abstractActivity = this.j;
            i2 = C0274R$drawable.textview_nya;
        } else if (sy1.x() == 0) {
            IconicsTextView P4 = aVar.P();
            v62.d(P4, "holder.statusView");
            P4.setText("UNKNOWN");
            IconicsTextView P5 = aVar.P();
            v62.d(P5, "holder.statusView");
            rw1.i(P5);
            P = aVar.P();
            v62.d(P, "holder.statusView");
            abstractActivity = this.j;
            i2 = C0274R$drawable.textview_unknown;
        } else if (sy1.x() == -1) {
            IconicsTextView P6 = aVar.P();
            v62.d(P6, "holder.statusView");
            h72 h72 = h72.a;
            Object[] objArr = new Object[1];
            objArr[0] = aVar instanceof OptimizedAdapter ? " " : "\n";
            String format = String.format("REFRESH%sPROFILE", Arrays.copyOf(objArr, 1));
            v62.d(format, "java.lang.String.format(format, *args)");
            P6.setText(format);
            IconicsTextView P7 = aVar.P();
            v62.d(P7, "holder.statusView");
            rw1.i(P7);
            P = aVar.P();
            v62.d(P, "holder.statusView");
            abstractActivity = this.j;
            i2 = C0274R$drawable.textview_anime_fav;
        } else {
            if (ky1 != null && ky1.f()) {
                String str = "EP" + ky1.b() + " in " + ky1.c();
                IconicsTextView P8 = aVar.P();
                v62.d(P8, "holder.statusView");
                P8.setText(str);
            } else if (sy1.x() == 1) {
                IconicsTextView P9 = aVar.P();
                v62.d(P9, "holder.statusView");
                P9.setText("AIRING");
            } else {
                IconicsTextView P10 = aVar.P();
                v62.d(P10, "holder.statusView");
                P10.setText("");
                IconicsTextView P11 = aVar.P();
                v62.d(P11, "holder.statusView");
                rw1.a(P11);
                P = aVar.P();
                v62.d(P, "holder.statusView");
                f2 = null;
                P.setBackground(f2);
            }
            IconicsTextView P12 = aVar.P();
            v62.d(P12, "holder.statusView");
            rw1.i(P12);
            P = aVar.P();
            v62.d(P, "holder.statusView");
            f2 = androidx.core.content.a.f(this.j, C0274R$drawable.textview_airing);
            P.setBackground(f2);
        }
        f2 = androidx.core.content.a.f(abstractActivity, i2);
        P.setBackground(f2);
    }

    private final void T(ClassicAdapter classicAdapter, sy1 sy1, ky1 ky1) {
        if (this.i != -1) {
            ImageView N = classicAdapter.N();
            v62.d(N, "holder.image");
            N.getLayoutParams().height = this.i;
        }
        TextView R = classicAdapter.R();
        v62.d(R, "holder.progress");
        R.setText(sy1.E(ky1));
        if (this.e && sy1.n() != 2 && sy1.u() > 0) {
            TextView R2 = classicAdapter.R();
            v62.d(R2, "holder.progress");
            StringBuilder sb = new StringBuilder();
            TextView R3 = classicAdapter.R();
            v62.d(R3, "holder.progress");
            sb.append(((String) R3.getText()).toString());
            sb.append(sy1.s());
            R2.setText(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void U(com.zunjae.anyme.features.anime.shows_list.OptimizedAdapter r7, defpackage.sy1 r8, defpackage.ky1 r9) {
        /*
            r6 = this;
            yy1 r0 = r8.k()
            com.mikepenz.iconics.view.IconicsTextView r1 = r7.userProgress
            java.lang.String r2 = "holder.userProgress"
            defpackage.v62.d(r1, r2)
            java.lang.String r3 = r8.E(r9)
            r1.setText(r3)
            com.mikepenz.iconics.view.IconicsTextView r1 = r7.userProgress
            defpackage.v62.d(r1, r2)
            r2 = 0
            r1.setBackground(r2)
            java.lang.String r1 = "holder.releaseDate"
            if (r0 == 0) goto L_0x0034
            android.widget.TextView r3 = r7.releaseDate
            defpackage.v62.d(r3, r1)
            java.lang.String r0 = r0.f()
            r3.setText(r0)
            android.widget.TextView r0 = r7.releaseDate
            defpackage.v62.d(r0, r1)
            defpackage.rw1.i(r0)
            goto L_0x003c
        L_0x0034:
            android.widget.TextView r0 = r7.releaseDate
            defpackage.v62.d(r0, r1)
            defpackage.rw1.a(r0)
        L_0x003c:
            int r0 = r8.u()
            r1 = 1
            r3 = 0
            java.lang.String r4 = "holder.progressBar"
            if (r0 <= 0) goto L_0x0085
            int r0 = r8.u()
            int r5 = r8.p()
            if (r0 < r5) goto L_0x0085
            android.widget.ProgressBar r0 = r7.progressBar
            defpackage.v62.d(r0, r4)
            int r5 = r8.u()
            r0.setMax(r5)
            android.widget.ProgressBar r0 = r7.progressBar
            defpackage.v62.d(r0, r4)
            int r5 = r8.p()
            r0.setProgress(r5)
            int r0 = r8.x()
            if (r0 != r1) goto L_0x00b1
            if (r9 == 0) goto L_0x00b1
            int r0 = r9.b()
            r5 = -1
            if (r0 <= r5) goto L_0x00b1
            android.widget.ProgressBar r0 = r7.progressBar
            defpackage.v62.d(r0, r4)
            int r9 = r9.b()
            int r9 = r9 - r1
            r0.setSecondaryProgress(r9)
            goto L_0x00b9
        L_0x0085:
            if (r9 == 0) goto L_0x00a1
            android.widget.ProgressBar r0 = r7.progressBar
            defpackage.v62.d(r0, r4)
            int r9 = r9.b()
            int r9 = r9 - r1
            r0.setMax(r9)
            android.widget.ProgressBar r9 = r7.progressBar
            defpackage.v62.d(r9, r4)
            int r0 = r8.p()
            r9.setProgress(r0)
            goto L_0x00b1
        L_0x00a1:
            android.widget.ProgressBar r9 = r7.progressBar
            defpackage.v62.d(r9, r4)
            r9.setMax(r3)
            android.widget.ProgressBar r9 = r7.progressBar
            defpackage.v62.d(r9, r4)
            r9.setProgress(r3)
        L_0x00b1:
            android.widget.ProgressBar r9 = r7.progressBar
            defpackage.v62.d(r9, r4)
            r9.setSecondaryProgress(r3)
        L_0x00b9:
            android.widget.ImageButton r9 = r7.overflowIcon
            com.zunjae.anyme.features.anime.shows_list.d$e r0 = new com.zunjae.anyme.features.anime.shows_list.d$e
            r0.<init>(r6, r8)
            r9.setOnClickListener(r0)
            int r9 = r8.m()
            java.lang.String r0 = "holder.userScore"
            if (r9 != 0) goto L_0x00d4
            com.mikepenz.iconics.view.IconicsTextView r7 = r7.userScore
            defpackage.v62.d(r7, r0)
            r7.setBackground(r2)
            goto L_0x0106
        L_0x00d4:
            int r9 = r8.m()
            r1 = 4
            if (r9 >= r1) goto L_0x00ed
            com.mikepenz.iconics.view.IconicsTextView r7 = r7.userScore
            defpackage.v62.d(r7, r0)
            com.zunjae.anyme.abstracts.AbstractActivity r8 = r6.j
            r9 = 2131231345(0x7f080271, float:1.8078768E38)
        L_0x00e5:
            android.graphics.drawable.Drawable r8 = androidx.core.content.a.f(r8, r9)
            r7.setBackground(r8)
            goto L_0x0106
        L_0x00ed:
            int r8 = r8.m()
            r9 = 8
            com.mikepenz.iconics.view.IconicsTextView r7 = r7.userScore
            defpackage.v62.d(r7, r0)
            if (r8 >= r9) goto L_0x0100
            com.zunjae.anyme.abstracts.AbstractActivity r8 = r6.j
            r9 = 2131231346(0x7f080272, float:1.807877E38)
            goto L_0x00e5
        L_0x0100:
            com.zunjae.anyme.abstracts.AbstractActivity r8 = r6.j
            r9 = 2131231347(0x7f080273, float:1.8078772E38)
            goto L_0x00e5
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.anime.shows_list.d.U(com.zunjae.anyme.features.anime.shows_list.OptimizedAdapter, sy1, ky1):void");
    }

    private final void V(a aVar, int i2) {
        if (i2 > 0) {
            IconicsTextView O = aVar.O();
            v62.d(O, "adapter.score");
            O.setText(' ' + i2 + " {faw-star} ");
            IconicsTextView O2 = aVar.O();
            v62.d(O2, "adapter.score");
            rw1.i(O2);
            return;
        }
        IconicsTextView O3 = aVar.O();
        v62.d(O3, "adapter.score");
        rw1.a(O3);
    }

    private final void W(a aVar, sy1 sy1) {
        String l;
        TextView Q;
        String l2;
        yy1 k2 = sy1.k();
        if (!this.f) {
            TextView Q2 = aVar.Q();
            v62.d(Q2, "adapter.title");
            Q2.setText(sy1.y());
            return;
        }
        if (k2 == null || (l = k2.l()) == null || !(!f92.n(l))) {
            Q = aVar.Q();
            v62.d(Q, "adapter.title");
            l2 = sy1.y();
        } else {
            Q = aVar.Q();
            v62.d(Q, "adapter.title");
            l2 = k2.l();
        }
        Q.setText(l2);
    }

    /* access modifiers changed from: private */
    public final void X(sy1 sy1) {
        this.j.i0(sy1, com.zunjae.anyme.abstracts.d.UPDATE, new f(this, sy1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x00cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M(java.lang.String r9, boolean r10, boolean r11, boolean r12, java.util.List<java.lang.Integer> r13, int r14) {
        /*
            r8 = this;
            java.lang.String r0 = "query"
            defpackage.v62.e(r9, r0)
            java.util.List<sy1> r0 = r8.d
            if (r0 == 0) goto L_0x0170
            java.util.List<sy1> r0 = r8.c
            if (r0 != 0) goto L_0x000f
            goto L_0x0170
        L_0x000f:
            xw1 r0 = new xw1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "filtering using "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.util.List<sy1> r1 = r8.c
            r2 = 0
            if (r1 == 0) goto L_0x0053
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0033:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0054
            java.lang.Object r4 = r1.next()
            r5 = r4
            sy1 r5 = (defpackage.sy1) r5
            java.lang.String r6 = r9.toLowerCase()
            java.lang.String r7 = "(this as java.lang.String).toLowerCase()"
            defpackage.v62.d(r6, r7)
            boolean r5 = r5.i0(r6)
            if (r5 == 0) goto L_0x0033
            r3.add(r4)
            goto L_0x0033
        L_0x0053:
            r3 = r2
        L_0x0054:
            java.lang.String r9 = "movie"
            if (r11 != 0) goto L_0x0089
            if (r3 == 0) goto L_0x0088
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r1 = r3.iterator()
        L_0x0063:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r1.next()
            r4 = r3
            sy1 r4 = (defpackage.sy1) r4
            yy1 r4 = r4.k()
            if (r4 == 0) goto L_0x007b
            java.lang.String r4 = r4.o()
            goto L_0x007c
        L_0x007b:
            r4 = r2
        L_0x007c:
            boolean r4 = defpackage.v62.a(r4, r9)
            if (r4 != 0) goto L_0x0063
            r11.add(r3)
            goto L_0x0063
        L_0x0086:
            r3 = r11
            goto L_0x0089
        L_0x0088:
            r3 = r2
        L_0x0089:
            java.lang.String r11 = "TV"
            if (r10 != 0) goto L_0x00be
            if (r3 == 0) goto L_0x00bd
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r3.iterator()
        L_0x0098:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r1.next()
            r4 = r3
            sy1 r4 = (defpackage.sy1) r4
            yy1 r4 = r4.k()
            if (r4 == 0) goto L_0x00b0
            java.lang.String r4 = r4.o()
            goto L_0x00b1
        L_0x00b0:
            r4 = r2
        L_0x00b1:
            boolean r4 = defpackage.v62.a(r4, r11)
            if (r4 != 0) goto L_0x0098
            r10.add(r3)
            goto L_0x0098
        L_0x00bb:
            r3 = r10
            goto L_0x00be
        L_0x00bd:
            r3 = r2
        L_0x00be:
            r10 = 1
            r1 = 0
            if (r12 != 0) goto L_0x010b
            if (r3 == 0) goto L_0x010a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00cd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0108
            java.lang.Object r4 = r3.next()
            r5 = r4
            sy1 r5 = (defpackage.sy1) r5
            yy1 r6 = r5.k()
            if (r6 == 0) goto L_0x00e5
            java.lang.String r6 = r6.o()
            goto L_0x00e6
        L_0x00e5:
            r6 = r2
        L_0x00e6:
            boolean r6 = defpackage.v62.a(r6, r11)
            if (r6 != 0) goto L_0x0101
            yy1 r5 = r5.k()
            if (r5 == 0) goto L_0x00f7
            java.lang.String r5 = r5.o()
            goto L_0x00f8
        L_0x00f7:
            r5 = r2
        L_0x00f8:
            boolean r5 = defpackage.v62.a(r5, r9)
            if (r5 == 0) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r5 = 0
            goto L_0x0102
        L_0x0101:
            r5 = 1
        L_0x0102:
            if (r5 == 0) goto L_0x00cd
            r12.add(r4)
            goto L_0x00cd
        L_0x0108:
            r3 = r12
            goto L_0x010b
        L_0x010a:
            r3 = r2
        L_0x010b:
            if (r13 == 0) goto L_0x013a
            if (r3 == 0) goto L_0x0139
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r11 = r3.iterator()
        L_0x0118:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0137
            java.lang.Object r12 = r11.next()
            r3 = r12
            sy1 r3 = (defpackage.sy1) r3
            java.util.List r3 = r3.h()
            if (r3 == 0) goto L_0x0130
            boolean r3 = r3.containsAll(r13)
            goto L_0x0131
        L_0x0130:
            r3 = 0
        L_0x0131:
            if (r3 == 0) goto L_0x0118
            r9.add(r12)
            goto L_0x0118
        L_0x0137:
            r3 = r9
            goto L_0x013a
        L_0x0139:
            r3 = r2
        L_0x013a:
            if (r3 == 0) goto L_0x0161
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r11 = r3.iterator()
        L_0x0145:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0162
            java.lang.Object r12 = r11.next()
            r13 = r12
            sy1 r13 = (defpackage.sy1) r13
            int r13 = r13.m()
            if (r13 < r14) goto L_0x015a
            r13 = 1
            goto L_0x015b
        L_0x015a:
            r13 = 0
        L_0x015b:
            if (r13 == 0) goto L_0x0145
            r9.add(r12)
            goto L_0x0145
        L_0x0161:
            r9 = r2
        L_0x0162:
            if (r9 == 0) goto L_0x0168
            java.util.List r2 = defpackage.n32.d0(r9)
        L_0x0168:
            r8.d = r2
            r8.l()
            r0.a()
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.anime.shows_list.d.M(java.lang.String, boolean, boolean, boolean, java.util.List, int):void");
    }

    public final void N(List<com.zunjae.anyme.features.kanon.a> list) {
        List<Integer> list2;
        T t;
        boolean z;
        v62.e(list, "animesLinkedWithGenres");
        List<sy1> list3 = this.c;
        if (list3 != null) {
            for (sy1 sy1 : list3) {
                Iterator<T> it = list.iterator();
                while (true) {
                    list2 = null;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (sy1.i() == ((com.zunjae.anyme.features.kanon.a) t).b()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                com.zunjae.anyme.features.kanon.a aVar = (com.zunjae.anyme.features.kanon.a) t;
                if (aVar != null) {
                    list2 = aVar.a();
                }
                sy1.N(list2);
            }
        }
    }

    public final void Y(List<sy1> list) {
        v62.e(list, "animes");
        this.c = list;
        this.d = list;
        l();
    }

    public int g() {
        List<sy1> list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public long h(int i2) {
        sy1 sy1;
        List<sy1> list = this.d;
        if (list == null || (sy1 = list.get(i2)) == null) {
            return 0;
        }
        return sy1.c();
    }

    public int i(int i2) {
        return this.k;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.zunjae.anyme.features.anime.shows_list.ClassicAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.zunjae.anyme.features.anime.shows_list.OptimizedAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.zunjae.anyme.features.anime.shows_list.ClassicAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.zunjae.anyme.features.anime.shows_list.ClassicAdapter} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w(androidx.recyclerview.widget.RecyclerView.c0 r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = "holder"
            defpackage.v62.e(r4, r0)
            java.util.List<sy1> r0 = r3.d
            defpackage.v62.c(r0)
            java.lang.Object r5 = r0.get(r5)
            sy1 r5 = (defpackage.sy1) r5
            ky1 r0 = r5.d()
            int r1 = r4.l()
            if (r1 == 0) goto L_0x002b
            r2 = 1
            if (r1 != r2) goto L_0x0023
            com.zunjae.anyme.features.anime.shows_list.OptimizedAdapter r4 = (com.zunjae.anyme.features.anime.shows_list.OptimizedAdapter) r4
            r3.U(r4, r5, r0)
            goto L_0x0030
        L_0x0023:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "No valid ViewType set"
            r4.<init>(r5)
            throw r4
        L_0x002b:
            com.zunjae.anyme.features.anime.shows_list.ClassicAdapter r4 = (com.zunjae.anyme.features.anime.shows_list.ClassicAdapter) r4
            r3.T(r4, r5, r0)
        L_0x0030:
            r3.R(r4, r5)
            int r1 = r5.m()
            r3.V(r4, r1)
            r3.S(r4, r5, r0)
            r3.W(r4, r5)
            r3.O(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.anime.shows_list.d.w(androidx.recyclerview.widget.RecyclerView$c0, int):void");
    }

    public RecyclerView.c0 y(ViewGroup viewGroup, int i2) {
        v62.e(viewGroup, "parent");
        if (i2 == 0) {
            return new ClassicAdapter(LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_anime_main_classic, viewGroup, false));
        }
        if (i2 == 1) {
            return new OptimizedAdapter(LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_anime_main_optimized, viewGroup, false));
        }
        throw new IllegalArgumentException("No viewType found for id" + i2);
    }
}
