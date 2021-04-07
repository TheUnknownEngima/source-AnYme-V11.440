package com.zunjae.anyme.features.recommendations;

import android.annotation.SuppressLint;
import android.app.Activity;
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
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.a;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import java.util.List;

@SuppressLint({"DefaultLocale", "SetTextI18n"})
public final class AnimeRecommendationsAdapter extends RecyclerView.g<ViewHolder> {
    private final int c;
    private final Activity d;
    private List<ux1> e;

    public static class ViewHolder extends RecyclerView.c0 {
        @BindView
        ImageView animeCoverImage;
        @BindView
        TextView seriesEpisodes;
        @BindView
        TextView seriesTitle;
        @BindView
        TextView userStatus;
        @BindView
        ViewGroup viewGroup;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.animeCoverImage = (ImageView) w8.c(view, C0275R$id.seriesImage, "field 'animeCoverImage'", ImageView.class);
            viewHolder.seriesTitle = (TextView) w8.c(view, C0275R$id.seriesTitle, "field 'seriesTitle'", TextView.class);
            viewHolder.viewGroup = (ViewGroup) w8.c(view, C0275R$id.cardViewContainer, "field 'viewGroup'", ViewGroup.class);
            viewHolder.userStatus = (TextView) w8.c(view, C0275R$id.userStatus, "field 'userStatus'", TextView.class);
            viewHolder.seriesEpisodes = (TextView) w8.c(view, C0275R$id.seriesEpisodes, "field 'seriesEpisodes'", TextView.class);
        }
    }

    public AnimeRecommendationsAdapter(Activity activity, int i) {
        this.d = activity;
        this.c = i;
    }

    public /* synthetic */ void H(ux1 ux1, View view) {
        xy1 xy1 = new xy1(ux1.a(), ux1.f(), ux1.c());
        Activity activity = this.d;
        activity.startActivity(AnimeInfoActivity.M.b(activity, xy1));
    }

    /* renamed from: I */
    public void w(ViewHolder viewHolder, int i) {
        ux1 ux1 = this.e.get(i);
        ry1 ry1 = this.e.get(i).g;
        a.a(this.d).t(ux1.c()).K0(viewHolder.animeCoverImage);
        viewHolder.seriesTitle.setText(ux1.f());
        if (ry1 != null) {
            viewHolder.userStatus.setText(String.format("%s (%d)", new Object[]{sy1.r.c(ry1.d()), Integer.valueOf(ry1.c())}));
            viewHolder.seriesEpisodes.setText(String.format("%d/%d", new Object[]{Integer.valueOf(ry1.b()), Integer.valueOf(ry1.e())}));
            viewHolder.userStatus.setVisibility(0);
            viewHolder.seriesEpisodes.setVisibility(0);
        } else {
            viewHolder.userStatus.setVisibility(8);
            viewHolder.seriesEpisodes.setVisibility(8);
        }
        viewHolder.viewGroup.setOnClickListener(new a(this, ux1));
    }

    /* renamed from: J */
    public ViewHolder y(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater;
        int i2;
        if (i == 0) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = C0278R$layout.cardview_anime_recommendations_horizontal_fragment;
        } else if (i == 1) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = C0278R$layout.cardview_anime_recommendations_vertical_fragment;
        } else {
            throw new IllegalStateException("wew");
        }
        return new ViewHolder(layoutInflater.inflate(i2, viewGroup, false));
    }

    public void K(List<ux1> list) {
        this.e = list;
        l();
    }

    public int g() {
        List<ux1> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long h(int i) {
        List<ux1> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.get(i).a();
    }

    public int i(int i) {
        return this.c;
    }
}
