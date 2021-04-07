package com.zunjae.anyme.features.anime.pickers;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import com.zunjae.anyme.C0275R$id;
import mehdi.sakout.fancybuttons.FancyButton;

public final class ManualEpisodeSelectorDialogR2_ViewBinding implements Unbinder {

    class a extends v8 {
        final /* synthetic */ ManualEpisodeSelectorDialogR2 g;

        a(ManualEpisodeSelectorDialogR2_ViewBinding manualEpisodeSelectorDialogR2_ViewBinding, ManualEpisodeSelectorDialogR2 manualEpisodeSelectorDialogR2) {
            this.g = manualEpisodeSelectorDialogR2;
        }

        public void a(View view) {
            this.g.saveButtonClick();
        }
    }

    public ManualEpisodeSelectorDialogR2_ViewBinding(ManualEpisodeSelectorDialogR2 manualEpisodeSelectorDialogR2, View view) {
        manualEpisodeSelectorDialogR2.inputEpisode = (EditText) w8.c(view, C0275R$id.episodePickerManuallyEnter, "field 'inputEpisode'", EditText.class);
        View b = w8.b(view, C0275R$id.episodePickerSaveButton, "field 'saveButton' and method 'saveButtonClick'");
        manualEpisodeSelectorDialogR2.saveButton = (FancyButton) w8.a(b, C0275R$id.episodePickerSaveButton, "field 'saveButton'", FancyButton.class);
        b.setOnClickListener(new a(this, manualEpisodeSelectorDialogR2));
        manualEpisodeSelectorDialogR2.manualContainer = (LinearLayout) w8.c(view, C0275R$id.episodePickerManuallyViewGroup, "field 'manualContainer'", LinearLayout.class);
    }
}
