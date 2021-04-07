package com.zunjae.anyme.features.bookmarks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public final class AddBookmarkEntriesActivity extends AbstractActivity {
    public static final c K = new c((r62) null);
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    private final d22 E = g22.b(new b(this, (oh2) null, (o52) null));
    private a F;
    private String G;
    private String H;
    private ArrayList<Integer> I;
    private HashMap J;

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

    public static final class b extends w62 implements o52<qu1> {
        final /* synthetic */ n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, qu1] */
        /* renamed from: a */
        public final qu1 invoke() {
            return lg2.b(this.f, f72.b(qu1.class), this.g, this.h);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public final Intent a(Context context, List<Integer> list, String str, String str2) {
            v62.e(context, "context");
            v62.e(str, "bookmarkId");
            v62.e(str2, "bookmarkName");
            Intent intent = new Intent(context, AddBookmarkEntriesActivity.class);
            if (list == null) {
                list = new ArrayList<>();
            }
            intent.putIntegerArrayListExtra("alreadyAddedIds", new ArrayList(list));
            intent.putExtra("bookmarkId", str);
            intent.putExtra("bookmarkName", str2);
            return intent;
        }
    }

    static final class d<T> implements u<List<? extends sy1>> {
        final /* synthetic */ AddBookmarkEntriesActivity a;

        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return d42.a(((sy1) t).y(), ((sy1) t2).y());
            }
        }

        d(AddBookmarkEntriesActivity addBookmarkEntriesActivity) {
            this.a = addBookmarkEntriesActivity;
        }

        /* renamed from: b */
        public final void a(List<sy1> list) {
            if (list != null) {
                AddBookmarkEntriesActivity.m0(this.a).M(n32.U(list, new a()));
            }
        }
    }

    public static final class e implements SimpleSearchView.f {
        final /* synthetic */ AddBookmarkEntriesActivity a;

        e(AddBookmarkEntriesActivity addBookmarkEntriesActivity) {
            this.a = addBookmarkEntriesActivity;
        }

        public boolean a(String str) {
            v62.e(str, "newText");
            AddBookmarkEntriesActivity.m0(this.a).I(str);
            return false;
        }

        public boolean b(String str) {
            v62.e(str, "query");
            return false;
        }

        public boolean c() {
            return false;
        }
    }

    static final class f implements View.OnClickListener {
        final /* synthetic */ AddBookmarkEntriesActivity e;

        public static final class a implements ci2<Void> {
            final /* synthetic */ f a;

            a(f fVar) {
                this.a = fVar;
            }

            public void a(ai2<Void> ai2, Throwable th) {
                v62.e(ai2, "call");
                v62.e(th, "t");
                Toast makeText = Toast.makeText(this.a.e, "Could not update. Please try again.", 1);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }

            public void b(ai2<Void> ai2, qi2<Void> qi2) {
                v62.e(ai2, "call");
                v62.e(qi2, "response");
                if (qi2.d()) {
                    this.a.e.setResult(-1);
                    this.a.e.finish();
                }
            }
        }

        f(AddBookmarkEntriesActivity addBookmarkEntriesActivity) {
            this.e = addBookmarkEntriesActivity;
        }

        public final void onClick(View view) {
            this.e.U().K(AddBookmarkEntriesActivity.n0(this.e), AddBookmarkEntriesActivity.m0(this.e).H()).Q(new a(this));
        }
    }

    private final nu1 S() {
        return (nu1) this.D.getValue();
    }

    public static final /* synthetic */ a m0(AddBookmarkEntriesActivity addBookmarkEntriesActivity) {
        a aVar = addBookmarkEntriesActivity.F;
        if (aVar != null) {
            return aVar;
        }
        v62.p("bookmarkEntriesAdapter");
        throw null;
    }

    public static final /* synthetic */ String n0(AddBookmarkEntriesActivity addBookmarkEntriesActivity) {
        String str = addBookmarkEntriesActivity.G;
        if (str != null) {
            return str;
        }
        v62.p("bookmarkId");
        throw null;
    }

    private final qu1 p0() {
        return (qu1) this.E.getValue();
    }

    private final void q0() {
        ArrayList<Integer> arrayList = this.I;
        if (arrayList != null) {
            this.F = new a(this, arrayList, p0().w());
            RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
            a aVar = this.F;
            if (aVar != null) {
                com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(this, recyclerView, aVar);
                cVar.c(4, 6);
                cVar.d(com.zunjae.zrecyclerview.a.GRID);
                cVar.a();
                return;
            }
            v62.p("bookmarkEntriesAdapter");
            throw null;
        }
        v62.p("alreadyAddedIds");
        throw null;
    }

    private final void r0() {
        S().m().g(this, new d(this));
        ((SimpleSearchView) l0(C0275R$id.searchView)).setOnQueryTextListener(new e(this));
        ((FloatingTextButton) l0(C0275R$id.saveShows)).setOnClickListener(new f(this));
    }

    public View l0(int i) {
        if (this.J == null) {
            this.J = new HashMap();
        }
        View view = (View) this.J.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.J.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_bookmark_entries_add);
        String stringExtra = getIntent().getStringExtra("bookmarkId");
        v62.c(stringExtra);
        this.G = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("bookmarkName");
        v62.c(stringExtra2);
        this.H = stringExtra2;
        ArrayList<Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("alreadyAddedIds");
        if (integerArrayListExtra == null) {
            integerArrayListExtra = new ArrayList<>();
        }
        this.I = integerArrayListExtra;
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, "Pick shows you want to add", (String) null, true, 4, (Object) null);
        Toolbar toolbar2 = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar2, "toolbar");
        String str = this.H;
        if (str != null) {
            toolbar2.setSubtitle((CharSequence) str);
            q0();
            r0();
            return;
        }
        v62.p("bookmarkName");
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        getMenuInflater().inflate(C0279R$menu.menu_add_bookmark_entries, menu);
        ((SimpleSearchView) l0(C0275R$id.searchView)).setMenuItem(menu.findItem(C0275R$id.action_search));
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        v62.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        qu1 p0 = p0();
        a aVar = this.F;
        if (aVar != null) {
            p0.S(aVar.J());
        } else {
            v62.p("bookmarkEntriesAdapter");
            throw null;
        }
    }
}
