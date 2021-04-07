package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.features.login.WelcomeActivity;
import java.util.List;

/* renamed from: fw1  reason: default package */
public final class fw1 {
    private static int a = 1001;
    private static int b = 1002;
    private static int c = 1003;
    private static int d = 1005;
    private static int e = 1006;
    public static final fw1 f = new fw1();

    /* renamed from: fw1$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ Context e;

        a(Context context) {
            this.e = context;
        }

        public final void onClick(View view) {
            this.e.startActivity(new Intent(this.e, WelcomeActivity.class));
        }
    }

    private fw1() {
    }

    public final int a() {
        return d;
    }

    public final int b() {
        return a;
    }

    public final int c() {
        return b;
    }

    public final int d() {
        return c;
    }

    public final int e() {
        return e;
    }

    public final void f(View view) {
        g(view, a, "Nothing to find here, come back later\n¯\\_(ツ)_/¯");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(android.view.View r2, int r3, java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "message"
            defpackage.v62.e(r4, r0)
            r0 = 0
            if (r2 == 0) goto L_0x000d
            android.view.View r2 = com.tripl3dev.prettystates.a.b(r2, r3)
            goto L_0x000e
        L_0x000d:
            r2 = r0
        L_0x000e:
            if (r2 == 0) goto L_0x001a
            r3 = 2131296834(0x7f090242, float:1.8211596E38)
            android.view.View r2 = r2.findViewById(r3)
            r0 = r2
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001a:
            if (r0 == 0) goto L_0x001f
            r0.setText(r4)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw1.g(android.view.View, int, java.lang.String):void");
    }

    public final void h(View view, String str) {
        v62.e(str, "message");
        if (view != null) {
            f.k(view, str);
        }
    }

    public final void i(List<? extends View> list, String str) {
        v62.e(str, "message");
        if (list != null) {
            for (View k : list) {
                f.k(k, str);
            }
        }
    }

    public final void j(View view) {
        if (view != null) {
            com.tripl3dev.prettystates.a.b(view, -2731992);
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(android.view.View r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "message"
            defpackage.v62.e(r4, r0)
            r0 = 0
            if (r3 == 0) goto L_0x000f
            int r1 = a
            android.view.View r3 = com.tripl3dev.prettystates.a.b(r3, r1)
            goto L_0x0010
        L_0x000f:
            r3 = r0
        L_0x0010:
            if (r3 == 0) goto L_0x001c
            r0 = 2131296834(0x7f090242, float:1.8211596E38)
            android.view.View r3 = r3.findViewById(r0)
            r0 = r3
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.setText(r4)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw1.k(android.view.View, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(android.view.View r20, android.view.View.OnClickListener r21, android.view.View.OnClickListener r22, android.view.View.OnClickListener r23) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = "onPopularAnimeClicked"
            defpackage.v62.e(r1, r4)
            java.lang.String r4 = "onSearchClicked"
            defpackage.v62.e(r2, r4)
            java.lang.String r4 = "onReloginClicked"
            defpackage.v62.e(r3, r4)
            r4 = 0
            if (r0 == 0) goto L_0x0021
            int r5 = c
            android.view.View r0 = com.tripl3dev.prettystates.a.b(r0, r5)
            goto L_0x0022
        L_0x0021:
            r0 = r4
        L_0x0022:
            if (r0 == 0) goto L_0x002e
            r5 = 2131296643(0x7f090183, float:1.8211208E38)
            android.view.View r5 = r0.findViewById(r5)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            goto L_0x002f
        L_0x002e:
            r5 = r4
        L_0x002f:
            if (r0 == 0) goto L_0x003b
            r6 = 2131296339(0x7f090053, float:1.8210592E38)
            android.view.View r6 = r0.findViewById(r6)
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            goto L_0x003c
        L_0x003b:
            r6 = r4
        L_0x003c:
            if (r0 == 0) goto L_0x0048
            r7 = 2131297182(0x7f09039e, float:1.8212302E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            goto L_0x0049
        L_0x0048:
            r7 = r4
        L_0x0049:
            fz1 r8 = defpackage.fz1.a
            java.lang.String r8 = r8.t()
            if (r8 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            java.lang.String r8 = "there"
        L_0x0054:
            com.zunjae.dynsourcegen.e$a r9 = com.zunjae.dynsourcegen.e.j
            java.util.List r10 = r9.b()
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 62
            r18 = 0
            java.lang.String r11 = ", "
            java.lang.String r9 = defpackage.n32.G(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Hello <b><u>"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = "</u></b> ~ Want to watch Anime on "
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = "? "
            r10.append(r8)
            java.lang.String r8 = "Add a show to your profile!\n\nYou can add Anime to your profile in many ways. Here are two options"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            if (r7 == 0) goto L_0x0096
            android.text.Spanned r8 = com.zunjae.extensions.c.a(r8)
            r7.setText(r8)
        L_0x0096:
            if (r0 == 0) goto L_0x00a2
            r4 = 2131297190(0x7f0903a6, float:1.8212318E38)
            android.view.View r0 = r0.findViewById(r4)
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
        L_0x00a2:
            if (r4 == 0) goto L_0x00a7
            r4.setOnClickListener(r3)
        L_0x00a7:
            if (r5 == 0) goto L_0x00ac
            r5.setOnClickListener(r1)
        L_0x00ac:
            if (r6 == 0) goto L_0x00b1
            r6.setOnClickListener(r2)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw1.l(android.view.View, android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener):void");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(android.view.View r3, java.lang.String r4, android.view.View.OnClickListener r5) {
        /*
            r2 = this;
            java.lang.String r0 = "message"
            defpackage.v62.e(r4, r0)
            java.lang.String r0 = "onLoginClicked"
            defpackage.v62.e(r5, r0)
            r0 = 0
            if (r3 == 0) goto L_0x0014
            int r1 = d
            android.view.View r3 = com.tripl3dev.prettystates.a.b(r3, r1)
            goto L_0x0015
        L_0x0014:
            r3 = r0
        L_0x0015:
            if (r3 == 0) goto L_0x0021
            r1 = 2131297020(0x7f0902fc, float:1.8211973E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            goto L_0x0022
        L_0x0021:
            r1 = r0
        L_0x0022:
            if (r3 == 0) goto L_0x002e
            r0 = 2131296834(0x7f090242, float:1.8211596E38)
            android.view.View r3 = r3.findViewById(r0)
            r0 = r3
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.setOnClickListener(r5)
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r0.setText(r4)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw1.m(android.view.View, java.lang.String, android.view.View$OnClickListener):void");
    }

    public final void n(Context context, View view) {
        Button button;
        v62.e(context, "context");
        View b2 = view != null ? com.tripl3dev.prettystates.a.b(view, e) : null;
        if (b2 != null && (button = (Button) b2.findViewById(C0275R$id.loginButton)) != null) {
            button.setOnClickListener(new a(context));
        }
    }

    public final void o(View view) {
        if (view != null) {
            com.tripl3dev.prettystates.a.b(view, -2431992);
        }
    }
}
