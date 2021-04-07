package com.zunjae.anyme.features.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.afollestad.materialdialogs.b;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.HomeActivity;
import com.zunjae.anyme.abstracts.AbstractActivity;

public final class AuthUserActivity extends AbstractActivity {
    public static final a D = new a((r62) null);

    public static final class a {

        /* renamed from: com.zunjae.anyme.features.login.AuthUserActivity$a$a  reason: collision with other inner class name */
        static final class C0193a implements f.n {
            final /* synthetic */ Activity a;

            C0193a(Activity activity) {
                this.a = activity;
            }

            public final void a(f fVar, b bVar) {
                v62.e(fVar, "<anonymous parameter 0>");
                v62.e(bVar, "<anonymous parameter 1>");
                this.a.finish();
                this.a.startActivity(new Intent(this.a, HomeActivity.class));
            }
        }

        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final Intent a(Context context, String str) {
            v62.e(context, "context");
            v62.e(str, "token");
            Intent intent = new Intent(context, AuthUserActivity.class);
            intent.putExtra("source", "InApp");
            intent.putExtra("token", str);
            return intent;
        }

        public final void b(Activity activity, String str, String str2) {
            v62.e(activity, "activity");
            v62.e(str, "title");
            v62.e(str2, "message");
            f.e eVar = new f.e(activity);
            eVar.E(str);
            eVar.i(str2);
            eVar.B("ok");
            eVar.A(new C0193a(activity));
            eVar.D();
        }

        public final void c(Activity activity) {
            v62.e(activity, "activity");
            String string = activity.getString(C0283R$string.kanonLoginSuccess);
            v62.d(string, "activity.getString(R.string.kanonLoginSuccess)");
            b(activity, "Success", string);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        if (r9 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r9 != null) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            r9 = 2131492898(0x7f0c0022, float:1.860926E38)
            r8.setContentView((int) r9)
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r0 = "source"
            java.lang.String r9 = r9.getStringExtra(r0)
            java.lang.String r0 = "token"
            java.lang.String r1 = ""
            if (r9 != 0) goto L_0x001a
            goto L_0x0037
        L_0x001a:
            int r2 = r9.hashCode()
            r3 = 70760092(0x437b69c, float:2.1595397E-36)
            if (r2 == r3) goto L_0x0024
            goto L_0x0037
        L_0x0024:
            java.lang.String r2 = "InApp"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0037
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r9 = r9.getStringExtra(r0)
            if (r9 == 0) goto L_0x004e
            goto L_0x004c
        L_0x0037:
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r2 = "intent"
            defpackage.v62.d(r9, r2)
            android.net.Uri r9 = r9.getData()
            if (r9 == 0) goto L_0x004e
            java.lang.String r9 = r9.getQueryParameter(r0)
            if (r9 == 0) goto L_0x004e
        L_0x004c:
            r2 = r9
            goto L_0x004f
        L_0x004e:
            r2 = r1
        L_0x004f:
            java.lang.String r9 = "when (intent.getStringEx…eter(\"token\") ?: \"\"\n    }"
            defpackage.v62.d(r2, r9)
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r3 = "anymetoken:"
            java.lang.String r4 = ""
            java.lang.String r9 = defpackage.f92.q(r2, r3, r4, r5, r6, r7)
            int r0 = r9.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0068:
            if (r3 > r0) goto L_0x008d
            if (r4 != 0) goto L_0x006e
            r5 = r3
            goto L_0x006f
        L_0x006e:
            r5 = r0
        L_0x006f:
            char r5 = r9.charAt(r5)
            r6 = 32
            int r5 = defpackage.v62.g(r5, r6)
            if (r5 > 0) goto L_0x007d
            r5 = 1
            goto L_0x007e
        L_0x007d:
            r5 = 0
        L_0x007e:
            if (r4 != 0) goto L_0x0087
            if (r5 != 0) goto L_0x0084
            r4 = 1
            goto L_0x0068
        L_0x0084:
            int r3 = r3 + 1
            goto L_0x0068
        L_0x0087:
            if (r5 != 0) goto L_0x008a
            goto L_0x008d
        L_0x008a:
            int r0 = r0 + -1
            goto L_0x0068
        L_0x008d:
            int r0 = r0 + r1
            java.lang.CharSequence r9 = r9.subSequence(r3, r0)
            java.lang.String r0 = r9.toString()
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r9 = defpackage.f92.q(r0, r1, r2, r3, r4, r5)
            tw1 r0 = defpackage.tw1.a
            boolean r0 = r0.a(r9)
            java.lang.String r1 = "getString(R.string.error)"
            r2 = 2131820671(0x7f11007f, float:1.9274064E38)
            if (r0 == 0) goto L_0x00c7
            com.zunjae.anyme.features.login.AuthUserActivity$a r9 = D
            java.lang.String r0 = r8.getString(r2)
            defpackage.v62.d(r0, r1)
            r1 = 2131820658(0x7f110072, float:1.9274037E38)
            java.lang.String r1 = r8.getString(r1)
            java.lang.String r2 = "getString(R.string.couldNotVerifyAccount)"
            defpackage.v62.d(r1, r2)
            r9.b(r8, r0, r1)
            return
        L_0x00c7:
            int r0 = r9.length()
            r3 = 10
            if (r0 == r3) goto L_0x00e8
            com.zunjae.anyme.features.login.AuthUserActivity$a r9 = D
            java.lang.String r0 = r8.getString(r2)
            defpackage.v62.d(r0, r1)
            r1 = 2131821408(0x7f110360, float:1.9275558E38)
            java.lang.String r1 = r8.getString(r1)
            java.lang.String r2 = "getString(R.string.invalid_kanon_length_token)"
            defpackage.v62.d(r1, r2)
            r9.b(r8, r0, r1)
            return
        L_0x00e8:
            xx1 r0 = defpackage.xx1.a
            r0.c(r9)
            com.zunjae.anyme.features.login.AuthUserActivity$a r9 = D
            r9.c(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.login.AuthUserActivity.onCreate(android.os.Bundle):void");
    }
}
