package com.zunjae.anyme.features.anime.pickers;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.C0275R$id;

public class BetterStatusPickerAdapter$ViewHolder_ViewBinding implements Unbinder {
    public BetterStatusPickerAdapter$ViewHolder_ViewBinding(BetterStatusPickerAdapter$ViewHolder betterStatusPickerAdapter$ViewHolder, View view) {
        betterStatusPickerAdapter$ViewHolder.statusTextView = (TextView) w8.c(view, C0275R$id.status, "field 'statusTextView'", TextView.class);
        betterStatusPickerAdapter$ViewHolder.linearLayout = (LinearLayout) w8.c(view, C0275R$id.viewGroupNoAnimeHere, "field 'linearLayout'", LinearLayout.class);
    }
}
