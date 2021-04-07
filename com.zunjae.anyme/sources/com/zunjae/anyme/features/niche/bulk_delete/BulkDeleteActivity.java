package com.zunjae.anyme.features.niche.bulk_delete;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.niche.bulk_delete.AnimeBulkDeleteAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class BulkDeleteActivity extends AbstractActivity {
    private AnimeBulkDeleteAdapter D;
    private com.afollestad.materialdialogs.f E;
    private final d22 F = g22.b(new a(this, (oh2) null, (o52) null));
    private HashMap G;

    public static final class a extends w62 implements o52<nu1> {
        final /* synthetic */ n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, nu1] */
        /* renamed from: a */
        public final nu1 invoke() {
            return lg2.b(this.f, f72.b(nu1.class), this.g, this.h);
        }
    }

    static final class b implements f.n {
        final /* synthetic */ BulkDeleteActivity a;
        final /* synthetic */ ArrayList b;

        b(BulkDeleteActivity bulkDeleteActivity, ArrayList arrayList) {
            this.a = bulkDeleteActivity;
            this.b = arrayList;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            BulkDeleteAnimeService.j.b(true);
            BulkDeleteActivity bulkDeleteActivity = this.a;
            bulkDeleteActivity.startService(BulkDeleteAnimeService.j.a(bulkDeleteActivity.T(), this.b));
            BulkDeleteActivity.m0(this.a).H();
        }
    }

    static final class c<T> implements u<List<? extends sy1>> {
        final /* synthetic */ BulkDeleteActivity a;

        c(BulkDeleteActivity bulkDeleteActivity) {
            this.a = bulkDeleteActivity;
        }

        /* renamed from: b */
        public final void a(List<sy1> list) {
            if (list != null) {
                BulkDeleteActivity.m0(this.a).P(list);
                AnimeBulkDeleteAdapter m0 = BulkDeleteActivity.m0(this.a);
                CheckBox checkBox = (CheckBox) this.a.l0(C0275R$id.filterUnwatchedOnly);
                v62.d(checkBox, "filterUnwatchedOnly");
                m0.I(checkBox.isChecked());
            }
        }
    }

    static final class d implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ BulkDeleteActivity a;

        d(BulkDeleteActivity bulkDeleteActivity) {
            this.a = bulkDeleteActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            AnimeBulkDeleteAdapter m0 = BulkDeleteActivity.m0(this.a);
            CheckBox checkBox = (CheckBox) this.a.l0(C0275R$id.filterUnwatchedOnly);
            v62.d(checkBox, "filterUnwatchedOnly");
            m0.I(checkBox.isChecked());
        }
    }

    static final class e implements f.n {
        final /* synthetic */ BulkDeleteActivity a;

        e(BulkDeleteActivity bulkDeleteActivity) {
            this.a = bulkDeleteActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.s0();
        }
    }

    static final class f implements AnimeBulkDeleteAdapter.a {
        final /* synthetic */ BulkDeleteActivity a;

        f(BulkDeleteActivity bulkDeleteActivity) {
            this.a = bulkDeleteActivity;
        }

        public final void a(int i) {
            if (i > 0) {
                Toolbar toolbar = (Toolbar) this.a.l0(C0275R$id.toolbar);
                v62.d(toolbar, "toolbar");
                h72 h72 = h72.a;
                String format = String.format("Selected: %d Anime", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                v62.d(format, "java.lang.String.format(format, *args)");
                toolbar.setSubtitle((CharSequence) format);
                return;
            }
            Toolbar toolbar2 = (Toolbar) this.a.l0(C0275R$id.toolbar);
            v62.d(toolbar2, "toolbar");
            toolbar2.setSubtitle((CharSequence) null);
        }
    }

    private final nu1 S() {
        return (nu1) this.F.getValue();
    }

    public static final /* synthetic */ AnimeBulkDeleteAdapter m0(BulkDeleteActivity bulkDeleteActivity) {
        AnimeBulkDeleteAdapter animeBulkDeleteAdapter = bulkDeleteActivity.D;
        if (animeBulkDeleteAdapter != null) {
            return animeBulkDeleteAdapter;
        }
        v62.p("adapter");
        throw null;
    }

    private final void p0() {
        AnimeBulkDeleteAdapter animeBulkDeleteAdapter = this.D;
        if (animeBulkDeleteAdapter != null) {
            List<sy1> J = animeBulkDeleteAdapter.J();
            if (J.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (sy1 i : J) {
                    arrayList.add(Integer.valueOf(i.i()));
                }
                f.e eVar = new f.e(this);
                eVar.E("Are you sure?");
                eVar.i("You're about to delete " + arrayList.size() + " show(s)");
                eVar.B("DELETE");
                eVar.w("Cancel");
                eVar.A(new b(this, arrayList));
                eVar.D();
                return;
            }
            Toast.makeText(T(), "No Anime selected", 0).show();
            return;
        }
        v62.p("adapter");
        throw null;
    }

    @SuppressLint({"DefaultLocale"})
    private final void q0() {
        LiveData<List<sy1>> n = S().n();
        if (n != null) {
            n.g(this, new c(this));
        }
        ((CheckBox) l0(C0275R$id.filterUnwatchedOnly)).setOnCheckedChangeListener(new d(this));
    }

    private final void r0() {
        this.D = new AnimeBulkDeleteAdapter(this, new f(this));
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        AnimeBulkDeleteAdapter animeBulkDeleteAdapter = this.D;
        if (animeBulkDeleteAdapter != null) {
            com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(this, recyclerView, animeBulkDeleteAdapter);
            cVar.c(2, 2);
            cVar.d(com.zunjae.zrecyclerview.a.GRID);
            cVar.a();
            return;
        }
        v62.p("adapter");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void s0() {
        BulkDeleteAnimeService.j.b(false);
        com.afollestad.materialdialogs.f fVar = this.E;
        if (fVar != null) {
            v62.c(fVar);
            if (!fVar.isShowing()) {
                com.afollestad.materialdialogs.f fVar2 = this.E;
                v62.c(fVar2);
                fVar2.dismiss();
                this.E = null;
            }
        }
    }

    public View l0(int i) {
        if (this.G == null) {
            this.G = new HashMap();
        }
        View view = (View) this.G.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.G.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @SuppressLint({"DefaultLocale"})
    @vq1
    public final void onAnimeDeletedProgress(bv1 bv1) {
        com.afollestad.materialdialogs.f fVar;
        v62.e(bv1, "bus");
        setResult(lv1.f.c());
        com.afollestad.materialdialogs.f fVar2 = this.E;
        if (fVar2 == null) {
            f.e eVar = new f.e(this);
            eVar.E("Deleting...");
            eVar.C(true, 0);
            h72 h72 = h72.a;
            String format = String.format("Deleting %s\n(%d/%d)", Arrays.copyOf(new Object[]{bv1.c(), Integer.valueOf(bv1.b()), Integer.valueOf(bv1.d())}, 3));
            v62.d(format, "java.lang.String.format(format, *args)");
            eVar.i(format);
            eVar.x("Cancel");
            eVar.z(new e(this));
            eVar.e(true);
            com.afollestad.materialdialogs.f c2 = eVar.c();
            this.E = c2;
            v62.c(c2);
            c2.setCanceledOnTouchOutside(false);
            com.afollestad.materialdialogs.f fVar3 = this.E;
            v62.c(fVar3);
            fVar3.show();
        } else {
            v62.c(fVar2);
            h72 h722 = h72.a;
            String format2 = String.format("Deleted %s\n(%d/%d)\n\nETA: %ds", Arrays.copyOf(new Object[]{bv1.c(), Integer.valueOf(bv1.b()), Integer.valueOf(bv1.d()), Integer.valueOf(bv1.a())}, 4));
            v62.d(format2, "java.lang.String.format(format, *args)");
            fVar2.q(format2);
        }
        if (bv1.b() == bv1.d() && (fVar = this.E) != null) {
            v62.c(fVar);
            if (fVar.isShowing()) {
                com.afollestad.materialdialogs.f fVar4 = this.E;
                v62.c(fVar4);
                fVar4.dismiss();
                this.E = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_bulk_delete);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, "Bulk Delete", (String) null, true, 4, (Object) null);
        r0();
        q0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        v62.d(menuInflater, "menuInflater");
        menuInflater.inflate(C0279R$menu.menu_activity_bulk_delete, menu);
        return true;
    }

    @vq1
    public final void onFailure(cv1 cv1) {
        v62.e(cv1, "bus");
        Toast.makeText(T(), cv1.a(), 0).show();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 2131296703) {
            p0();
        } else if (itemId == 2131296705) {
            AnimeBulkDeleteAdapter animeBulkDeleteAdapter = this.D;
            if (animeBulkDeleteAdapter != null) {
                int size = animeBulkDeleteAdapter.J().size();
                AnimeBulkDeleteAdapter animeBulkDeleteAdapter2 = this.D;
                if (animeBulkDeleteAdapter2 != null) {
                    if (size == animeBulkDeleteAdapter2.K().size()) {
                        AnimeBulkDeleteAdapter animeBulkDeleteAdapter3 = this.D;
                        if (animeBulkDeleteAdapter3 != null) {
                            animeBulkDeleteAdapter3.H();
                        } else {
                            v62.p("adapter");
                            throw null;
                        }
                    } else {
                        AnimeBulkDeleteAdapter animeBulkDeleteAdapter4 = this.D;
                        if (animeBulkDeleteAdapter4 != null) {
                            animeBulkDeleteAdapter4.O();
                        } else {
                            v62.p("adapter");
                            throw null;
                        }
                    }
                    Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
                    v62.d(toolbar, "toolbar");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Selected: ");
                    AnimeBulkDeleteAdapter animeBulkDeleteAdapter5 = this.D;
                    if (animeBulkDeleteAdapter5 != null) {
                        sb.append(animeBulkDeleteAdapter5.J().size());
                        sb.append(" Anime");
                        toolbar.setSubtitle((CharSequence) sb.toString());
                    } else {
                        v62.p("adapter");
                        throw null;
                    }
                } else {
                    v62.p("adapter");
                    throw null;
                }
            } else {
                v62.p("adapter");
                throw null;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @vq1
    public final void onServiceFinished(yu1 yu1) {
        v62.e(yu1, "bus");
    }

    public void onStart() {
        super.onStart();
        cw1.k.a().j(this);
    }

    public void onStop() {
        super.onStop();
        cw1.k.a().l(this);
    }
}
