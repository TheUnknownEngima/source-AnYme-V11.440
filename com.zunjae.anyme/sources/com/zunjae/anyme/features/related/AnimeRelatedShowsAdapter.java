package com.zunjae.anyme.features.related;

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
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"DefaultLocale"})
public final class AnimeRelatedShowsAdapter extends RecyclerView.g<ViewHolder> {
    private final Activity c;
    private final int d;
    private List<bz1> e = new ArrayList();

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
            viewHolder.seriesEpisodes = (TextView) w8.c(view, C0275R$id.seriesEpisodes, "field 'seriesEpisodes'", TextView.class);
            viewHolder.userStatus = (TextView) w8.c(view, C0275R$id.userStatus, "field 'userStatus'", TextView.class);
        }
    }

    public AnimeRelatedShowsAdapter(Activity activity, int i) {
        this.c = activity;
        this.d = i;
    }

    public /* synthetic */ void H(az1 az1, View view) {
        xy1 xy1 = new xy1((long) az1.f().intValue(), az1.g(), az1.c());
        Activity activity = this.c;
        activity.startActivity(AnimeInfoActivity.M.b(activity, xy1));
    }

    /* renamed from: I */
    public void w(ViewHolder viewHolder, int i) {
        az1 az1 = this.e.get(i).b;
        sy1 sy1 = this.e.get(i).a;
        a.a(this.c).t(az1.c()).K0(viewHolder.animeCoverImage);
        viewHolder.seriesTitle.setText(az1.g());
        viewHolder.viewGroup.setOnClickListener(new a(this, az1));
        if (sy1 != null) {
            viewHolder.userStatus.setText(String.format("%s (%d)", new Object[]{sy1.o(), Integer.valueOf(sy1.m())}));
            viewHolder.userStatus.setVisibility(0);
        } else {
            viewHolder.userStatus.setVisibility(8);
        }
        TextView textView = viewHolder.seriesEpisodes;
        textView.setText(az1.h() + "\n" + az1.a() + "Eps");
    }

    /* renamed from: J */
    public ViewHolder y(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater;
        int i2;
        if (i == 0) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = C0278R$layout.cardview_anime_related;
        } else if (i == 1) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = C0278R$layout.cardview_anime_related_vertical;
        } else {
            throw new IllegalStateException("hm");
        }
        return new ViewHolder(layoutInflater.inflate(i2, viewGroup, false));
    }

    public void K(List<bz1> list) {
        this.e = list;
        l();
    }

    public int g() {
        return this.e.size();
    }

    public int i(int i) {
        return this.d;
    }
}
