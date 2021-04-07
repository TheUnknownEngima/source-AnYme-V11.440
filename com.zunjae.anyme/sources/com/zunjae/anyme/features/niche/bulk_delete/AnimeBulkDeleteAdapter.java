package com.zunjae.anyme.features.niche.bulk_delete;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimeBulkDeleteAdapter extends RecyclerView.g<ViewHolder> {
    private final Context c;
    private List<sy1> d;
    private final a e;
    private List<sy1> f = new ArrayList();
    private ArrayList<sy1> g;

    public static class ViewHolder extends RecyclerView.c0 {
        @BindView
        CheckBox checkBox;
        @BindView
        CardView container;
        @BindView
        ImageView coverImage;
        @BindView
        TextView lastUpdated;
        @BindView
        TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.coverImage = (ImageView) w8.c(view, 2131296693, "field 'coverImage'", ImageView.class);
            viewHolder.title = (TextView) w8.c(view, 2131297204, "field 'title'", TextView.class);
            viewHolder.container = (CardView) w8.c(view, C0275R$id.cardViewContainer, "field 'container'", CardView.class);
            viewHolder.checkBox = (CheckBox) w8.c(view, 2131296467, "field 'checkBox'", CheckBox.class);
            viewHolder.lastUpdated = (TextView) w8.c(view, C0275R$id.lastUpdated, "field 'lastUpdated'", TextView.class);
        }
    }

    public interface a {
        void a(int i);
    }

    public AnimeBulkDeleteAdapter(Context context, a aVar) {
        this.c = context;
        this.e = aVar;
    }

    public void H() {
        this.f.clear();
        l();
    }

    public void I(boolean z) {
        this.g.clear();
        ArrayList<sy1> arrayList = new ArrayList<>(this.d);
        this.g = arrayList;
        Iterator<sy1> it = arrayList.iterator();
        while (it.hasNext()) {
            sy1 next = it.next();
            if (z && next.n() != 6) {
                it.remove();
            }
        }
        l();
    }

    public List<sy1> J() {
        return this.f;
    }

    public List<sy1> K() {
        return this.g;
    }

    public /* synthetic */ void L(ViewHolder viewHolder, sy1 sy1, View view) {
        boolean z;
        CheckBox checkBox;
        if (viewHolder.checkBox.isChecked()) {
            this.f.remove(sy1);
            checkBox = viewHolder.checkBox;
            z = false;
        } else {
            this.f.add(sy1);
            checkBox = viewHolder.checkBox;
            z = true;
        }
        checkBox.setChecked(z);
        this.e.a(this.f.size());
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: M */
    public void w(ViewHolder viewHolder, int i) {
        sy1 sy1 = this.g.get(i);
        com.zunjae.anyme.a.b(this.c).t(sy1.w()).U0().K0(viewHolder.coverImage);
        viewHolder.title.setText(sy1.y());
        viewHolder.lastUpdated.setText("");
        viewHolder.container.setOnClickListener(new a(this, viewHolder, sy1));
        viewHolder.checkBox.setChecked(this.f.contains(sy1));
    }

    /* renamed from: N */
    public ViewHolder y(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0278R$layout.cardview_anime_bulk_delete, viewGroup, false));
    }

    public void O() {
        this.f.clear();
        this.f.addAll(this.g);
        l();
    }

    public void P(List<sy1> list) {
        this.d = list;
        this.g = new ArrayList<>(list);
        l();
    }

    public int g() {
        ArrayList<sy1> arrayList = this.g;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
