package com.zunjae.anyme.features.anime.shows_list;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0276R$integer;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.a;
import java.util.List;

public class AnimeLightCardViewAdapter extends RecyclerView.g<ViewHolder> {
    private List<sy1> c;
    private final Context d;
    private int e = -1;

    public static class ViewHolder extends RecyclerView.c0 {
        @BindView
        ImageView animeCoverImage;
        @BindView
        TextView animeName;
        @BindView
        TextView animeStatus;
        @BindView
        TextView userProgress;
        @BindView
        TextView userScore;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.animeCoverImage = (ImageView) w8.c(view, C0275R$id.animeCardViewCoverImage, "field 'animeCoverImage'", ImageView.class);
            viewHolder.animeName = (TextView) w8.c(view, C0275R$id.animeCardViewName, "field 'animeName'", TextView.class);
            viewHolder.userProgress = (TextView) w8.c(view, C0275R$id.animeCardViewProgress, "field 'userProgress'", TextView.class);
            viewHolder.userScore = (TextView) w8.c(view, C0275R$id.animeCardViewScore, "field 'userScore'", TextView.class);
            viewHolder.animeStatus = (TextView) w8.c(view, C0275R$id.animeCardViewStatus, "field 'animeStatus'", TextView.class);
        }
    }

    public AnimeLightCardViewAdapter(Context context) {
        this.d = context;
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: H */
    public void w(ViewHolder viewHolder, int i) {
        sy1 sy1 = this.c.get(i);
        a.b(this.d).t(sy1.w()).g0(C0276R$integer.imageWidth, C0276R$integer.imageHeight).K0(viewHolder.animeCoverImage);
        if (this.e != -1) {
            viewHolder.animeCoverImage.getLayoutParams().height = this.e;
        }
        viewHolder.animeName.setText(sy1.y());
        viewHolder.userProgress.setText(sy1.E((ky1) null));
        TextView textView = viewHolder.userScore;
        textView.setText("" + sy1.m());
    }

    /* renamed from: I */
    public ViewHolder y(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_anime_main_classic, viewGroup, false);
        ButterKnife.a(this, inflate);
        return new ViewHolder(inflate);
    }

    public void J(List<sy1> list) {
        this.c = list;
        l();
    }

    public void K(int i) {
        this.e = i;
        l();
    }

    public int g() {
        List<sy1> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
