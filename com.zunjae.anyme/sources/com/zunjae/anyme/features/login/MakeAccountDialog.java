package com.zunjae.anyme.features.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.abstracts.b;
import com.zunjae.anyme.features.browsers.sites.BasicWebViewBrowser;

public class MakeAccountDialog extends b {
    @BindString
    String bMalRegisterLink;

    public void K0() {
        super.K0();
        Y1();
    }

    @OnClick
    public void onCloseButtonClick() {
        N1().dismiss();
    }

    @OnClick
    public void onCreateAccountButtonClick() {
        n().finish();
        E1(BasicWebViewBrowser.S.a(u(), this.bMalRegisterLink));
    }

    @OnClick
    public void onExplanationButtonClicked() {
        ((AbstractActivity) n()).g0("https://github.com/zunjae/AnYme/blob/master/README.md");
        L1();
    }

    @OnClick
    public void onLoginButtonClicked() {
        N1().dismiss();
        n().finish();
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0278R$layout.dialog_make_account, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }
}
