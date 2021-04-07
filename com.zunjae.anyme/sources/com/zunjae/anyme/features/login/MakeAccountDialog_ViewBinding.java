package com.zunjae.anyme.features.login;

import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0283R$string;

public class MakeAccountDialog_ViewBinding implements Unbinder {

    class a extends v8 {
        final /* synthetic */ MakeAccountDialog g;

        a(MakeAccountDialog_ViewBinding makeAccountDialog_ViewBinding, MakeAccountDialog makeAccountDialog) {
            this.g = makeAccountDialog;
        }

        public void a(View view) {
            this.g.onCreateAccountButtonClick();
        }
    }

    class b extends v8 {
        final /* synthetic */ MakeAccountDialog g;

        b(MakeAccountDialog_ViewBinding makeAccountDialog_ViewBinding, MakeAccountDialog makeAccountDialog) {
            this.g = makeAccountDialog;
        }

        public void a(View view) {
            this.g.onExplanationButtonClicked();
        }
    }

    class c extends v8 {
        final /* synthetic */ MakeAccountDialog g;

        c(MakeAccountDialog_ViewBinding makeAccountDialog_ViewBinding, MakeAccountDialog makeAccountDialog) {
            this.g = makeAccountDialog;
        }

        public void a(View view) {
            this.g.onCloseButtonClick();
        }
    }

    class d extends v8 {
        final /* synthetic */ MakeAccountDialog g;

        d(MakeAccountDialog_ViewBinding makeAccountDialog_ViewBinding, MakeAccountDialog makeAccountDialog) {
            this.g = makeAccountDialog;
        }

        public void a(View view) {
            this.g.onLoginButtonClicked();
        }
    }

    public MakeAccountDialog_ViewBinding(MakeAccountDialog makeAccountDialog, View view) {
        w8.b(view, C0275R$id.createAccountButton, "method 'onCreateAccountButtonClick'").setOnClickListener(new a(this, makeAccountDialog));
        w8.b(view, C0275R$id.explainWhyButton, "method 'onExplanationButtonClicked'").setOnClickListener(new b(this, makeAccountDialog));
        w8.b(view, C0275R$id.ignoreButton, "method 'onCloseButtonClick'").setOnClickListener(new c(this, makeAccountDialog));
        w8.b(view, C0275R$id.loginButton, "method 'onLoginButtonClicked'").setOnClickListener(new d(this, makeAccountDialog));
        makeAccountDialog.bMalRegisterLink = view.getContext().getResources().getString(C0283R$string.mal_register_url);
    }
}
