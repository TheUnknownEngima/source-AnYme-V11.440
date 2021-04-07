package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.R$id;
import com.google.android.gms.cast.framework.R$layout;
import com.google.android.gms.cast.framework.R$string;
import java.util.ArrayList;
import java.util.List;

public final class z extends ArrayAdapter<MediaTrack> implements View.OnClickListener {
    private final Context e;
    private int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(Context context, List<MediaTrack> list, int i) {
        super(context, R$layout.cast_tracks_chooser_dialog_row_layout, list == null ? new ArrayList<>() : list);
        this.f = -1;
        this.e = context;
        this.f = i;
    }

    public final MediaTrack a() {
        int i = this.f;
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (MediaTrack) getItem(this.f);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        b0 b0Var;
        String str;
        if (view == null) {
            view = ((LayoutInflater) this.e.getSystemService("layout_inflater")).inflate(R$layout.cast_tracks_chooser_dialog_row_layout, viewGroup, false);
            b0Var = new b0(this, (TextView) view.findViewById(R$id.text), (RadioButton) view.findViewById(R$id.radio));
            view.setTag(b0Var);
        } else {
            b0Var = (b0) view.getTag();
        }
        if (b0Var == null) {
            return null;
        }
        b0Var.b.setTag(Integer.valueOf(i));
        b0Var.b.setChecked(this.f == i);
        view.setOnClickListener(this);
        MediaTrack mediaTrack = (MediaTrack) getItem(i);
        String m = mediaTrack.m();
        if (TextUtils.isEmpty(m)) {
            if (mediaTrack.o() == 2) {
                str = this.e.getString(R$string.cast_tracks_chooser_dialog_closed_captions);
            } else {
                if (!TextUtils.isEmpty(mediaTrack.l())) {
                    String displayLanguage = e.b(mediaTrack).getDisplayLanguage();
                    if (!TextUtils.isEmpty(displayLanguage)) {
                        str = displayLanguage;
                    }
                }
                m = this.e.getString(R$string.cast_tracks_chooser_dialog_default_track_name, new Object[]{Integer.valueOf(i + 1)});
            }
            b0Var.a.setText(str);
            return view;
        }
        str = m;
        b0Var.a.setText(str);
        return view;
    }

    public final void onClick(View view) {
        this.f = ((Integer) ((b0) view.getTag()).b.getTag()).intValue();
        notifyDataSetChanged();
    }
}
