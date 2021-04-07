package com.zunjae.anyme.features.discover.continue_watching;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import java.util.List;

public final class a extends BaseExpandableListAdapter {
    private List<d> e;
    private final Context f;
    private final b g;

    /* renamed from: com.zunjae.anyme.features.discover.continue_watching.a$a  reason: collision with other inner class name */
    static final class C0185a implements View.OnClickListener {
        final /* synthetic */ a e;
        final /* synthetic */ c f;

        C0185a(a aVar, c cVar) {
            this.e = aVar;
            this.f = cVar;
        }

        public final void onClick(View view) {
            this.e.a().a(this.f);
        }
    }

    public a(Context context, b bVar) {
        v62.e(context, "context");
        v62.e(bVar, "listener");
        this.f = context;
        this.g = bVar;
    }

    public final b a() {
        return this.g;
    }

    public final void b(List<d> list) {
        this.e = list;
    }

    public Object getChild(int i, int i2) {
        List<d> list = this.e;
        v62.c(list);
        return list.get(i).b().get(i2);
    }

    public long getChildId(int i, int i2) {
        List<d> list = this.e;
        v62.c(list);
        return (long) list.get(i).b().get(i2).c();
    }

    @SuppressLint({"SetTextI18n"})
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        v62.e(viewGroup, "parent");
        Object child = getChild(i, i2);
        if (child != null) {
            c cVar = (c) child;
            if (view == null) {
                Object systemService = this.f.getSystemService("layout_inflater");
                if (systemService != null) {
                    view = ((LayoutInflater) systemService).inflate(C0278R$layout.continue_watching_child, (ViewGroup) null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
                }
            }
            v62.c(view);
            View findViewById = view.findViewById(C0275R$id.cardViewContainer);
            v62.c(findViewById);
            View findViewById2 = view.findViewById(C0275R$id.animeCoverImage);
            v62.c(findViewById2);
            View findViewById3 = view.findViewById(C0275R$id.animeTitle);
            v62.c(findViewById3);
            View findViewById4 = view.findViewById(C0275R$id.showProgress);
            v62.c(findViewById4);
            View findViewById5 = view.findViewById(C0275R$id.showScore);
            v62.c(findViewById5);
            com.zunjae.anyme.a.b(this.f).t(cVar.b()).K0((ImageView) findViewById2);
            ((TextView) findViewById3).setText(cVar.f());
            ((TextView) findViewById4).setText(cVar.a() + " Eps (" + cVar.g() + ')');
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.e());
            sb.append(" {faw-star}");
            ((TextView) findViewById5).setText(sb.toString());
            ((CardView) findViewById).setOnClickListener(new C0185a(this, cVar));
            return view;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.features.discover.continue_watching.ContinueWatchingModel");
    }

    public int getChildrenCount(int i) {
        List<d> list = this.e;
        if (list == null) {
            return 0;
        }
        v62.c(list);
        return list.get(i).b().size();
    }

    public Object getGroup(int i) {
        List<d> list = this.e;
        if (list == null) {
            return 0;
        }
        v62.c(list);
        return list.get(i);
    }

    public int getGroupCount() {
        List<d> list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public long getGroupId(int i) {
        List<d> list = this.e;
        v62.c(list);
        xy1 a = list.get(i).a();
        if (a != null) {
            return a.a();
        }
        return 0;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        v62.e(viewGroup, "parent");
        Object group = getGroup(i);
        if (group != null) {
            d dVar = (d) group;
            if (view == null) {
                Object systemService = this.f.getSystemService("layout_inflater");
                if (systemService != null) {
                    view = ((LayoutInflater) systemService).inflate(C0278R$layout.continue_watching_group, (ViewGroup) null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
                }
            }
            v62.c(view);
            TextView textView = (TextView) view.findViewById(C0275R$id.parentTitle);
            xy1 a = dVar.a();
            v62.d(textView, "title");
            if (a != null) {
                String c = a.c();
                if (c == null) {
                    c = "";
                }
                textView.setText(c);
                rw1.i(textView);
            } else {
                rw1.a(textView);
            }
            return view;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.features.discover.continue_watching.ContinueWatchingWrapper");
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
