package com.zunjae.anyme.features.anime.pickers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import java.util.ArrayList;

public final class NumberPickerAdapter extends RecyclerView.g<ViewHolder> {
    private final ArrayList<Integer> c = new ArrayList<>();
    private final a d;
    private final int e;
    private final Context f;
    private final int g;

    public static class ViewHolder extends RecyclerView.c0 {
        @BindView
        TextView episodeNumber;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.episodeNumber = (TextView) w8.c(view, C0275R$id.episodeNumber, "field 'episodeNumber'", TextView.class);
        }
    }

    public interface a {
        void a(int i);
    }

    NumberPickerAdapter(int i, int i2, Context context, a aVar) {
        this.d = aVar;
        this.e = i;
        this.f = context;
        for (int i3 = 0; i3 <= i2; i3++) {
            this.c.add(Integer.valueOf(i3));
        }
        this.g = androidx.core.content.a.d(context, C0272R$color.card_background);
    }

    public /* synthetic */ void H(Integer num, View view) {
        this.d.a(num.intValue());
    }

    /* renamed from: I */
    public void w(ViewHolder viewHolder, int i) {
        int i2;
        TextView textView;
        Integer num = this.c.get(viewHolder.j());
        if (num.intValue() <= this.e) {
            textView = viewHolder.episodeNumber;
            i2 = androidx.core.content.a.d(this.f, 2131099728);
        } else {
            textView = viewHolder.episodeNumber;
            i2 = this.g;
        }
        textView.setBackgroundColor(i2);
        TextView textView2 = viewHolder.episodeNumber;
        textView2.setText("" + num);
        viewHolder.episodeNumber.setOnClickListener(new c(this, num));
    }

    /* renamed from: J */
    public ViewHolder y(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_episode_list, viewGroup, false));
    }

    public int g() {
        return this.c.size();
    }
}
