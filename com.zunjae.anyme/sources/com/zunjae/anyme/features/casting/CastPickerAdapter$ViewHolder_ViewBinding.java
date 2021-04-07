package com.zunjae.anyme.features.casting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import com.zunjae.anyme.C0275R$id;

public class CastPickerAdapter$ViewHolder_ViewBinding implements Unbinder {
    public CastPickerAdapter$ViewHolder_ViewBinding(CastPickerAdapter$ViewHolder castPickerAdapter$ViewHolder, View view) {
        castPickerAdapter$ViewHolder.castImageIcon = (ImageView) w8.c(view, C0275R$id.castImage, "field 'castImageIcon'", ImageView.class);
        castPickerAdapter$ViewHolder.appName = (TextView) w8.c(view, C0275R$id.castAppName, "field 'appName'", TextView.class);
        castPickerAdapter$ViewHolder.appIsInstalled = (TextView) w8.c(view, C0275R$id.castAppNameInstalled, "field 'appIsInstalled'", TextView.class);
        castPickerAdapter$ViewHolder.container = (CardView) w8.c(view, C0275R$id.cardViewContainer, "field 'container'", CardView.class);
    }
}
