package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.afollestad.materialdialogs.f;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: mw1  reason: default package */
public final class mw1 {

    /* renamed from: mw1$a */
    static final class a implements f.n {
        final /* synthetic */ o52 a;

        a(o52 o52) {
            this.a = o52;
        }

        public final void a(f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.invoke();
        }
    }

    /* renamed from: mw1$b */
    static final class b extends w62 implements z52<View, Chip> {
        public static final b f = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Chip r(View view) {
            v62.e(view, "it");
            return (Chip) view;
        }
    }

    public static final f.e a(Activity activity, String str, String str2) {
        v62.e(activity, "$this$buildLoadingDialog");
        v62.e(str, "title");
        f.e eVar = new f.e(activity);
        eVar.E(str);
        if (str2 == null) {
            str2 = "";
        }
        eVar.i(str2);
        eVar.C(true, 0);
        v62.d(eVar, "MaterialDialog.Builder(t…\n      .progress(true, 0)");
        return eVar;
    }

    public static final f b(Activity activity, String str, String str2, String str3, o52<u22> o52) {
        v62.e(activity, "$this$buildOkCancelDialogWithAction");
        v62.e(str, "title");
        v62.e(str2, "message");
        v62.e(str3, "buttonText");
        v62.e(o52, "onButtonClicked");
        f.e eVar = new f.e(activity);
        eVar.E(str);
        eVar.i(str2);
        eVar.e(true);
        eVar.B(str3);
        eVar.w("cancel");
        eVar.A(new a(o52));
        f c = eVar.c();
        v62.d(c, "MaterialDialog.Builder(t…()\n      }\n      .build()");
        return c;
    }

    public static final f.e c(Activity activity, String str, String str2) {
        v62.e(activity, "$this$buildOkDialog");
        v62.e(str, "message");
        v62.e(str2, "title");
        f.e eVar = new f.e(activity);
        eVar.E(str2);
        eVar.i(str);
        eVar.B("Ok");
        v62.d(eVar, "MaterialDialog.Builder(t…      .positiveText(\"Ok\")");
        return eVar;
    }

    public static final List<Chip> d(ChipGroup chipGroup) {
        v62.e(chipGroup, "$this$chipsChildren");
        return m82.j(m82.h(r4.a(chipGroup), b.f));
    }

    public static final void e(BottomSheetBehavior<?> bottomSheetBehavior) {
        v62.e(bottomSheetBehavior, "$this$collapse");
        bottomSheetBehavior.k0(4);
    }

    public static final void f(ExpandableListView expandableListView, int i) {
        v62.e(expandableListView, "$this$collapseAll");
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                expandableListView.collapseGroup(i2);
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static final BottomSheetBehavior<ViewGroup> g(ViewGroup viewGroup) {
        v62.e(viewGroup, "$this$createBottomSheetBehaviour");
        return BottomSheetBehavior.T(viewGroup);
    }

    public static final long h(int i) {
        return (System.currentTimeMillis() / ((long) 1000)) + ((long) (i * 86400));
    }

    public static final void i(Context context, String str, String str2) {
        v62.e(context, "$this$downloadAppOnPlayStore");
        v62.e(str, "packageName");
        if (str2 != null) {
            Toast makeText = Toast.makeText(context, str2, 1);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
        }
    }

    public static final void j(BottomSheetBehavior<?> bottomSheetBehavior) {
        v62.e(bottomSheetBehavior, "$this$expand");
        bottomSheetBehavior.k0(3);
    }

    public static final void k(ExpandableListView expandableListView, int i) {
        v62.e(expandableListView, "$this$expandAll");
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                expandableListView.expandGroup(i2);
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static final boolean l(BottomSheetBehavior<?> bottomSheetBehavior) {
        v62.e(bottomSheetBehavior, "$this$isExpanded");
        return bottomSheetBehavior.V() == 3;
    }

    public static final int m(ChipGroup chipGroup) {
        v62.e(chipGroup, "$this$numberOfCheckedItems");
        return o(chipGroup).size();
    }

    public static final Chip n(ChipGroup chipGroup) {
        T t;
        v62.e(chipGroup, "$this$selectedChip");
        Iterator<T> it = d(chipGroup).iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Chip) t).isChecked()) {
                break;
            }
        }
        return (Chip) t;
    }

    public static final List<Chip> o(ChipGroup chipGroup) {
        v62.e(chipGroup, "$this$selectedChips");
        List<Chip> d = d(chipGroup);
        ArrayList arrayList = new ArrayList();
        for (T next : d) {
            if (((Chip) next).isChecked()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final ViewPager p(ViewPager viewPager, z52<? super sw1, u22> z52) {
        v62.e(viewPager, "$this$setup");
        v62.e(z52, "block");
        int currentItem = viewPager.getCurrentItem();
        z52.r(new sw1(viewPager));
        viewPager.setCurrentItem(currentItem);
        return viewPager;
    }

    public static final void q(Activity activity, String str, String str2) {
        v62.e(activity, "$this$showOkDialog");
        v62.e(str, "message");
        v62.e(str2, "title");
        f.e eVar = new f.e(activity);
        eVar.E(str2);
        eVar.i(str);
        eVar.B("Ok");
        eVar.D();
    }

    public static final void r(BottomSheetBehavior<?> bottomSheetBehavior) {
        v62.e(bottomSheetBehavior, "$this$toggle");
        if (bottomSheetBehavior.V() == 3) {
            bottomSheetBehavior.k0(4);
        } else if (bottomSheetBehavior.V() == 4) {
            bottomSheetBehavior.k0(3);
        }
    }

    public static final void s(ExpandableListView expandableListView, int i) {
        v62.e(expandableListView, "$this$toggleCollapse");
        if (i >= 0) {
            int i2 = 0;
            while (!expandableListView.isGroupExpanded(i2)) {
                if (i2 != i) {
                    i2++;
                }
            }
            f(expandableListView, i);
            return;
        }
        k(expandableListView, i);
    }
}
