package com.zunjae.anyme.features.anime.info_screen;

import android.view.View;
import butterknife.Unbinder;
import com.zunjae.anyme.C0275R$id;

public final class MiscSettingsDialog_ViewBinding implements Unbinder {

    class a extends v8 {
        final /* synthetic */ MiscSettingsDialog g;

        a(MiscSettingsDialog_ViewBinding miscSettingsDialog_ViewBinding, MiscSettingsDialog miscSettingsDialog) {
            this.g = miscSettingsDialog;
        }

        public void a(View view) {
            this.g.onSaveButtonClick();
        }
    }

    public MiscSettingsDialog_ViewBinding(MiscSettingsDialog miscSettingsDialog, View view) {
        w8.b(view, C0275R$id.saveAndUpdate, "method 'onSaveButtonClick'").setOnClickListener(new a(this, miscSettingsDialog));
    }
}
