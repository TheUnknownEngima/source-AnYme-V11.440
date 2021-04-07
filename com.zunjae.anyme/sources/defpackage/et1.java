package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import java.util.HashMap;

/* renamed from: et1  reason: default package */
public final class et1 extends Fragment {
    public static final a b0 = new a((r62) null);
    private HashMap a0;

    /* renamed from: et1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final et1 a() {
            return new et1();
        }
    }

    public et1() {
        super(C0278R$layout.fragment_show_genres);
    }

    private final GridLayoutManager L1() {
        return new GridLayoutManager(u(), 1, 0, false);
    }

    public void J1() {
        HashMap hashMap = this.a0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View K1(int i) {
        if (this.a0 == null) {
            this.a0 = new HashMap();
        }
        View view = (View) this.a0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.a0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerViewGenres);
        v62.d(recyclerView, "recyclerViewGenres");
        recyclerView.setLayoutManager(L1());
        RecyclerView recyclerView2 = (RecyclerView) K1(C0275R$id.recyclerViewGenres);
        v62.d(recyclerView2, "recyclerViewGenres");
        Context o1 = o1();
        v62.d(o1, "requireContext()");
        recyclerView2.setAdapter(new dt1(o1));
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
