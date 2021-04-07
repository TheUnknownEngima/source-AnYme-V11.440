package com.mikepenz.materialdrawer;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.m;
import com.mikepenz.materialdrawer.c;
import defpackage.vn1;
import java.util.List;

class e {
    private static void a(Context context, ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setMinimumHeight((int) to1.a(1.0f, context));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(to1.m(context, R$attr.material_drawer_divider, R$color.material_drawer_divider));
        viewGroup.addView(linearLayout, layoutParams);
    }

    public static ViewGroup b(Context context, d dVar, View.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(to1.m(context, R$attr.material_drawer_background, R$color.material_drawer_background));
        if (dVar.N) {
            a(context, linearLayout);
        }
        c(dVar, linearLayout, onClickListener);
        return linearLayout;
    }

    public static void c(d dVar, ViewGroup viewGroup, View.OnClickListener onClickListener) {
        for (go1 next : dVar.e0) {
            View t = next.t(viewGroup.getContext(), viewGroup);
            t.setTag(next);
            if (next.isEnabled()) {
                t.setOnClickListener(onClickListener);
            }
            viewGroup.addView(t);
            no1.f(t);
        }
        viewGroup.setPadding(0, 0, 0, 0);
    }

    public static int d(d dVar, long j) {
        if (j == -1) {
            return -1;
        }
        for (int i = 0; i < dVar.h().g(); i++) {
            if (dVar.h().Y(i).c() == j) {
                return i;
            }
        }
        return -1;
    }

    public static void e(d dVar, View.OnClickListener onClickListener) {
        Context context = dVar.r.getContext();
        List<go1> list = dVar.e0;
        if (list != null && list.size() > 0) {
            dVar.M = b(context, dVar, onClickListener);
        }
        if (dVar.M != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12, 1);
            dVar.M.setId(R$id.material_drawer_sticky_footer);
            dVar.r.addView(dVar.M, layoutParams);
            if ((dVar.l || dVar.n) && Build.VERSION.SDK_INT >= 19) {
                dVar.M.setPadding(0, 0, 0, to1.d(context));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) dVar.U.getLayoutParams();
            layoutParams2.addRule(2, R$id.material_drawer_sticky_footer);
            dVar.U.setLayoutParams(layoutParams2);
            if (dVar.P) {
                View view = new View(context);
                dVar.O = view;
                view.setBackgroundResource(R$drawable.material_drawer_shadow_top);
                dVar.r.addView(dVar.O, -1, context.getResources().getDimensionPixelSize(R$dimen.material_drawer_sticky_footer_elevation));
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) dVar.O.getLayoutParams();
                layoutParams3.addRule(2, R$id.material_drawer_sticky_footer);
                dVar.O.setLayoutParams(layoutParams3);
            }
            RecyclerView recyclerView = dVar.U;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), dVar.U.getPaddingTop(), dVar.U.getPaddingRight(), context.getResources().getDimensionPixelSize(R$dimen.material_drawer_padding));
        }
        if (dVar.K == null) {
            return;
        }
        if (dVar.U == null) {
            throw new RuntimeException("can't use a footerView without a recyclerView");
        } else if (dVar.L) {
            m<go1, go1> j = dVar.j();
            vn1 vn1 = new vn1();
            vn1.L(dVar.K);
            vn1.M(vn1.b.BOTTOM);
            j.e(vn1);
        } else {
            m<go1, go1> j2 = dVar.j();
            vn1 vn12 = new vn1();
            vn12.L(dVar.K);
            vn12.M(vn1.b.NONE);
            j2.e(vn12);
        }
    }

    public static void f(d dVar) {
        a aVar = dVar.y;
        if (aVar != null) {
            boolean z = dVar.z;
            View b = aVar.b();
            if (z) {
                dVar.I = b;
            } else {
                dVar.E = b;
                b bVar = dVar.y.a;
                dVar.F = bVar.D;
                dVar.G = bVar.C;
            }
        }
        if (dVar.I != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(10, 1);
            dVar.I.setId(R$id.material_drawer_sticky_header);
            dVar.r.addView(dVar.I, 0, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) dVar.U.getLayoutParams();
            layoutParams2.addRule(3, R$id.material_drawer_sticky_header);
            dVar.U.setLayoutParams(layoutParams2);
            dVar.I.setBackgroundColor(to1.m(dVar.d, R$attr.material_drawer_background, R$color.material_drawer_background));
            if (dVar.J) {
                if (Build.VERSION.SDK_INT >= 21) {
                    dVar.I.setElevation(to1.a(4.0f, dVar.d));
                } else {
                    View view = new View(dVar.d);
                    view.setBackgroundResource(R$drawable.material_drawer_shadow_bottom);
                    dVar.r.addView(view, -1, (int) to1.a(4.0f, dVar.d));
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    layoutParams3.addRule(3, R$id.material_drawer_sticky_header);
                    view.setLayoutParams(layoutParams3);
                }
            }
            dVar.U.setPadding(0, 0, 0, 0);
        }
        if (dVar.E == null) {
            return;
        }
        if (dVar.U != null) {
            if (dVar.G) {
                m<go1, go1> k = dVar.k();
                vn1 vn1 = new vn1();
                vn1.L(dVar.E);
                vn1.K(dVar.H);
                vn1.J(dVar.F);
                vn1.M(vn1.b.TOP);
                k.e(vn1);
            } else {
                m<go1, go1> k2 = dVar.k();
                vn1 vn12 = new vn1();
                vn12.L(dVar.E);
                vn12.K(dVar.H);
                vn12.J(dVar.F);
                vn12.M(vn1.b.NONE);
                k2.e(vn12);
            }
            RecyclerView recyclerView = dVar.U;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), 0, dVar.U.getPaddingRight(), dVar.U.getPaddingBottom());
            return;
        }
        throw new RuntimeException("can't use a headerView without a recyclerView");
    }

    public static void g(d dVar, go1 go1, View view, Boolean bool) {
        boolean z = false;
        if (go1 == null || !(go1 instanceof jo1) || go1.b()) {
            dVar.o();
            view.setActivated(true);
            view.setSelected(true);
            dVar.h().P();
            ViewGroup viewGroup = dVar.M;
            if (viewGroup != null && (viewGroup instanceof LinearLayout)) {
                LinearLayout linearLayout = (LinearLayout) viewGroup;
                int i = 0;
                while (true) {
                    if (i >= linearLayout.getChildCount()) {
                        break;
                    } else if (linearLayout.getChildAt(i) == view) {
                        dVar.b = i;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                if (go1 instanceof qn1) {
                    qn1 qn1 = (qn1) go1;
                    if (qn1.w() != null) {
                        z = qn1.w().a(view, -1, go1);
                    }
                }
                c.a aVar = dVar.j0;
                if (aVar != null) {
                    z = aVar.a(view, -1, go1);
                }
            }
            if (!z) {
                dVar.f();
            }
        }
    }

    public static DrawerLayout.LayoutParams h(d dVar, DrawerLayout.LayoutParams layoutParams) {
        if (layoutParams != null) {
            Integer num = dVar.x;
            if (num != null && (num.intValue() == 5 || dVar.x.intValue() == 8388613)) {
                layoutParams.rightMargin = 0;
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginEnd(0);
                }
                layoutParams.leftMargin = dVar.d.getResources().getDimensionPixelSize(R$dimen.material_drawer_margin);
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginEnd(dVar.d.getResources().getDimensionPixelSize(R$dimen.material_drawer_margin));
                }
            }
            int i = dVar.w;
            if (i > -1) {
                layoutParams.width = i;
            } else {
                layoutParams.width = no1.b(dVar.d);
            }
        }
        return layoutParams;
    }

    public static void i(d dVar, int i, Boolean bool) {
        ViewGroup viewGroup;
        if (i > -1 && (viewGroup = dVar.M) != null && (viewGroup instanceof LinearLayout)) {
            LinearLayout linearLayout = (LinearLayout) viewGroup;
            if (dVar.N) {
                i++;
            }
            if (linearLayout.getChildCount() > i && i >= 0) {
                g(dVar, (go1) linearLayout.getChildAt(i).getTag(R$id.material_drawer_item), linearLayout.getChildAt(i), bool);
            }
        }
    }
}
