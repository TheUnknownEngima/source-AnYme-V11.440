package com.zunjae.anyme.features.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.work.c;
import androidx.work.f;
import androidx.work.i;
import androidx.work.j;
import androidx.work.n;
import androidx.work.o;
import com.google.android.material.button.MaterialButton;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.HomeActivity;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.niche.PrivacyActivity;
import com.zunjae.anyme.features.workers.AppUpdaterWorker;
import java.util.HashMap;

public final class LoginActivity extends AbstractActivity {
    private HashMap D;

    static final class a implements View.OnClickListener {
        final /* synthetic */ LoginActivity e;

        a(LoginActivity loginActivity) {
            this.e = loginActivity;
        }

        public final void onClick(View view) {
            mw1.q(this.e, "The credentials you enter here gets saved locally in an encrypted sandbox container for future use, Other apps can not access this data. If you feel like this is unsafe, then decompile the APK or monitor all outgoing HTTP connections to verify it yourself.\n\nNote: feel free to use a throw-away account and please avoid logging in with your Gmail account", "Info");
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ LoginActivity e;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ b f;
            final /* synthetic */ String g;
            final /* synthetic */ String h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, String str, String str2) {
                super(0);
                this.f = bVar;
                this.g = str;
                this.h = str2;
            }

            public final void a() {
                this.f.e.p0(this.g, this.h);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        b(LoginActivity loginActivity) {
            this.e = loginActivity;
        }

        public final void onClick(View view) {
            EditText editText = (EditText) this.e.l0(C0275R$id.inputUsername);
            v62.d(editText, "inputUsername");
            String obj = editText.getText().toString();
            boolean z = true;
            int length = obj.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = v62.g(obj.charAt(!z2 ? i : length), 32) <= 0;
                if (!z2) {
                    if (!z3) {
                        z2 = true;
                    } else {
                        i++;
                    }
                } else if (!z3) {
                    break;
                } else {
                    length--;
                }
            }
            String obj2 = obj.subSequence(i, length + 1).toString();
            EditText editText2 = (EditText) this.e.l0(C0275R$id.inputPassword);
            v62.d(editText2, "inputPassword");
            String obj3 = editText2.getText().toString();
            int length2 = obj3.length() - 1;
            int i2 = 0;
            boolean z4 = false;
            while (i2 <= length2) {
                boolean z5 = v62.g(obj3.charAt(!z4 ? i2 : length2), 32) <= 0;
                if (!z4) {
                    if (!z5) {
                        z4 = true;
                    } else {
                        i2++;
                    }
                } else if (!z5) {
                    break;
                } else {
                    length2--;
                }
            }
            String obj4 = obj3.subSequence(i2, length2 + 1).toString();
            if (g92.v(obj2, "@", false, 2, (Object) null)) {
                this.e.r0();
                return;
            }
            if (obj2.length() == 0) {
                Toast makeText = Toast.makeText(this.e, "You forgot to enter something", 1);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                return;
            }
            if (obj4.length() != 0) {
                z = false;
            }
            if (z) {
                mw1.b(this.e, "Info", "You did not enter your password which is fine, but this means that every 5-7 days you need to manually enter it again to refresh your login tokens on MAL. You can let the app remember your password in an encrypted container", "Continue", new a(this, obj2, obj4)).show();
            } else {
                this.e.p0(obj2, obj4);
            }
        }
    }

    static final class c implements View.OnClickListener {
        final /* synthetic */ LoginActivity e;

        c(LoginActivity loginActivity) {
            this.e = loginActivity;
        }

        public final void onClick(View view) {
            LoginActivity loginActivity = this.e;
            String str = com.zunjae.constants.a.a;
            v62.d(str, "Sites.MAL_RESET_PASS");
            loginActivity.h0(str);
        }
    }

    static final class d implements View.OnClickListener {
        final /* synthetic */ LoginActivity e;

        d(LoginActivity loginActivity) {
            this.e = loginActivity;
        }

        public final void onClick(View view) {
            this.e.startActivity(new Intent(this.e, PrivacyActivity.class));
        }
    }

    private final void o0(qy1 qy1) {
        fz1.a.q(qy1);
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(335544320);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void p0(String str, String str2) {
        startActivityForResult(LoginBrowser.V.a(T(), str, str2, true), 123);
    }

    private final void q0() {
        ((TextView) l0(C0275R$id.isThisSafe)).setOnClickListener(new a(this));
        ((MaterialButton) l0(C0275R$id.loginButton)).setOnClickListener(new b(this));
        ((TextView) l0(C0275R$id.setupForgotPassword)).setOnClickListener(new c(this));
        ((TextView) l0(C0275R$id.policy)).setOnClickListener(new d(this));
    }

    /* access modifiers changed from: private */
    public final void r0() {
        mw1.q(this, "Please do not login with your email. Instead, click on 'forgot password' to request a new username and password.", "Warning");
    }

    private final void s0() {
        c.a aVar = new c.a();
        aVar.b(i.CONNECTED);
        androidx.work.c a2 = aVar.a();
        v62.d(a2, "Constraints.Builder()\n  …NNECTED)\n        .build()");
        j.a aVar2 = new j.a(AppUpdaterWorker.class);
        aVar2.e(a2);
        o b2 = aVar2.b();
        v62.d(b2, "OneTimeWorkRequestBuilde…tworkConstraints).build()");
        n.c().b("BunBakaThotLogin", f.REPLACE, e32.b((j) b2)).a();
    }

    public View l0(int i) {
        if (this.D == null) {
            this.D = new HashMap();
        }
        View view = (View) this.D.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.D.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 123 && i2 == lv1.f.c()) {
            EditText editText = (EditText) l0(C0275R$id.inputUsername);
            v62.d(editText, "inputUsername");
            String obj = editText.getText().toString();
            EditText editText2 = (EditText) l0(C0275R$id.inputPassword);
            v62.d(editText2, "inputPassword");
            o0(new qy1(obj, editText2.getText().toString()));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_new_login_screen);
        q0();
        s0();
    }
}
