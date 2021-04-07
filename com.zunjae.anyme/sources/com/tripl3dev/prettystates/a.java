package com.tripl3dev.prettystates;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

public final class a {
    public static final View a(int i, Context context) {
        v62.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
        v62.b(inflate, "LayoutInflater.from(cont…nflate(this, null, false)");
        return inflate;
    }

    public static final View b(View view, int i) {
        View view2;
        ViewGroup viewGroup;
        v62.f(view, "receiver$0");
        "State Type  =  " + i;
        b b = b.c.b();
        if (i == -2431992) {
            view2 = new View(view.getContext());
        } else if (b != null) {
            int d = b.d(i);
            Context context = view.getContext();
            v62.b(context, "this.context");
            view2 = a(d, context);
        } else {
            v62.l();
            throw null;
        }
        if (!(view.getParent() instanceof ViewGroup) || (view.getParent() instanceof RecyclerView)) {
            viewGroup = null;
        } else {
            ViewParent parent = view.getParent();
            if (parent != null) {
                viewGroup = (ViewGroup) parent;
            } else {
                throw new r22("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(c.b.a());
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            if (i != -2431992) {
                if (view2 != null) {
                    view2.setId(c.b.a());
                    view2.setLayoutParams(view.getLayoutParams());
                    if (findViewById == null) {
                        if (view2.getParent() != null) {
                            ViewParent parent2 = view2.getParent();
                            if (parent2 != null) {
                                ((ViewGroup) parent2).removeView(view2);
                            } else {
                                throw new r22("null cannot be cast to non-null type android.view.ViewGroup");
                            }
                        }
                        if (viewGroup instanceof LinearLayout) {
                            viewGroup.addView(view2, viewGroup.indexOfChild(view));
                        } else {
                            viewGroup.addView(view2);
                        }
                    } else {
                        int indexOfChild = viewGroup.indexOfChild(findViewById);
                        viewGroup.removeView(findViewById);
                        viewGroup.addView(view2, indexOfChild);
                        view2.setVisibility(0);
                    }
                    if (view.getVisibility() == 0) {
                        view.setVisibility(8);
                    }
                } else {
                    v62.p("stateView");
                    throw null;
                }
            } else if (view.getVisibility() == 8) {
                view.setVisibility(0);
            }
        }
        if (view2 != null) {
            return view2;
        }
        v62.p("stateView");
        throw null;
    }
}
