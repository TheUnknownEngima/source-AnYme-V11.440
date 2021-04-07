package com.zunjae.anyme.features.anime.pickers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import java.util.ArrayList;

public final class BetterScorePickerAdapter extends RecyclerView.g<ViewHolder> {
    private final a c;
    private final Context d;
    private final int e;
    private ArrayList<oy1> f = oy1.c.a();
    private final int g;

    public static class ViewHolder extends RecyclerView.c0 {
        @BindView
        LinearLayout linearLayout;
        @BindView
        TextView scoreDescription;
        @BindView
        TextView scoreNumber;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.scoreNumber = (TextView) w8.c(view, C0275R$id.scoreNumber, "field 'scoreNumber'", TextView.class);
            viewHolder.scoreDescription = (TextView) w8.c(view, C0275R$id.scoreDescription, "field 'scoreDescription'", TextView.class);
            viewHolder.linearLayout = (LinearLayout) w8.c(view, C0275R$id.viewGroupNoAnimeHere, "field 'linearLayout'", LinearLayout.class);
        }
    }

    public interface a {
        void a(int i);
    }

    public BetterScorePickerAdapter(Context context, int i, a aVar) {
        this.c = aVar;
        this.d = context;
        this.e = i;
        this.g = androidx.core.content.a.d(context, C0272R$color.card_background);
    }

    public /* synthetic */ void H(oy1 oy1, View view) {
        this.c.a(oy1.b());
    }

    /* renamed from: I */
    public void w(ViewHolder viewHolder, int i) {
        int i2;
        LinearLayout linearLayout;
        oy1 oy1 = this.f.get(viewHolder.j());
        TextView textView = viewHolder.scoreNumber;
        textView.setText("" + oy1.b());
        TextView textView2 = viewHolder.scoreDescription;
        textView2.setText("" + oy1.a());
        if (oy1.b() == this.e) {
            linearLayout = viewHolder.linearLayout;
            i2 = androidx.core.content.a.d(this.d, 2131099728);
        } else {
            linearLayout = viewHolder.linearLayout;
            i2 = this.g;
        }
        linearLayout.setBackgroundColor(i2);
        viewHolder.linearLayout.setOnClickListener(new a(this, oy1));
    }

    /* renamed from: J */
    public ViewHolder y(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_score_list, viewGroup, false));
    }

    public int g() {
        return this.f.size();
    }
}
