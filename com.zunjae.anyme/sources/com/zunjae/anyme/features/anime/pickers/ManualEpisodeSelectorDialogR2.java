package com.zunjae.anyme.features.anime.pickers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.b;
import mehdi.sakout.fancybuttons.FancyButton;

public final class ManualEpisodeSelectorDialogR2 extends b {
    @BindView
    EditText inputEpisode;
    @BindView
    LinearLayout manualContainer;
    private int p0;
    @BindView
    FancyButton saveButton;

    private void Z1() {
        EditText editText = this.inputEpisode;
        editText.setHint("" + this.p0);
        try {
            N1().getWindow().setSoftInputMode(4);
        } catch (Exception unused) {
        }
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        int i = s().getInt("myWatchedEpisodes", -10);
        this.p0 = i;
        if (i != -10) {
            Z1();
            return;
        }
        throw new IllegalArgumentException("Incorrectly set the Anime object");
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0278R$layout.dialog_manual_episode_picker, viewGroup, false);
        ButterKnife.a(this, inflate);
        return inflate;
    }

    @OnClick
    public void saveButtonClick() {
        if (this.inputEpisode.getText().toString().equals("")) {
            Toast.makeText(u(), "Make sure you enter something", 0).show();
        } else if (!this.inputEpisode.getText().toString().matches("[0-9]+")) {
            Toast.makeText(u(), "Make sure you only enter numbers", 0).show();
        } else {
            try {
                int parseInt = Integer.parseInt(this.inputEpisode.getText().toString());
                if (parseInt < 0) {
                    Toast.makeText(u(), "Make sure that the number you enter is greater than 0", 0).show();
                    return;
                }
                cw1.k.a().i(new ev1(parseInt));
                L1();
            } catch (Exception unused) {
                Toast.makeText(u(), "Your input is invalid", 0).show();
            }
        }
    }
}
