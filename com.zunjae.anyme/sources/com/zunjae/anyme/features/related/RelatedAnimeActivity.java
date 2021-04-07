package com.zunjae.anyme.features.related;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.vresult.a;
import java.util.HashMap;
import java.util.List;

public final class RelatedAnimeActivity extends AbstractActivity {
    public static final b H = new b((r62) null);
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public int E;
    private AnimeRelatedShowsAdapter F;
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

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        public final Intent a(Context context, int i, String str) {
            v62.e(context, "context");
            v62.e(str, "seriesTitle");
            Intent intent = new Intent(context, RelatedAnimeActivity.class);
            intent.putExtra("animeId", i);
            intent.putExtra("seriesTitle", str);
            return intent;
        }
    }

    static final class c<T> implements u<com.zunjae.vresult.a<? extends List<? extends bz1>>> {
        final /* synthetic */ RelatedAnimeActivity a;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.f = cVar;
            }

            public final void a() {
                this.f.a.S().b0(this.f.a.E);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        c(RelatedAnimeActivity relatedAnimeActivity) {
            this.a = relatedAnimeActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<bz1>> aVar) {
            if (aVar instanceof a.c) {
                RecyclerView recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerViewCharacters);
                v62.d(recyclerView, "recyclerViewCharacters");
                rw1.h(recyclerView);
            } else if (aVar instanceof a.e) {
                RelatedAnimeActivity.o0(this.a).K((List) ((a.e) aVar).b());
                RecyclerView recyclerView2 = (RecyclerView) this.a.l0(C0275R$id.recyclerViewCharacters);
                v62.d(recyclerView2, "recyclerViewCharacters");
                rw1.g(recyclerView2);
            } else if (aVar instanceof a.d) {
                fw1.f.h((RecyclerView) this.a.l0(C0275R$id.recyclerViewCharacters), "No related Anime found :/");
            } else if (aVar instanceof a.b) {
                RecyclerView recyclerView3 = (RecyclerView) this.a.l0(C0275R$id.recyclerViewCharacters);
                v62.d(recyclerView3, "recyclerViewCharacters");
                rw1.d(recyclerView3, "Could not connect with MyAnimeList", (String) null, new a(this), 2, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public final nu1 S() {
        return (nu1) this.D.getValue();
    }

    public static final /* synthetic */ AnimeRelatedShowsAdapter o0(RelatedAnimeActivity relatedAnimeActivity) {
        AnimeRelatedShowsAdapter animeRelatedShowsAdapter = relatedAnimeActivity.F;
        if (animeRelatedShowsAdapter != null) {
            return animeRelatedShowsAdapter;
        }
        v62.p("relatedShowsAdapter");
        throw null;
    }

    private final void p0() {
        this.F = new AnimeRelatedShowsAdapter(this, 1);
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerViewCharacters);
        AnimeRelatedShowsAdapter animeRelatedShowsAdapter = this.F;
        if (animeRelatedShowsAdapter != null) {
            com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(this, recyclerView, animeRelatedShowsAdapter);
            cVar.d(com.zunjae.zrecyclerview.a.GRID);
            cVar.c(3, 5);
            cVar.a();
            S().I().g(this, new c(this));
            return;
        }
        v62.p("relatedShowsAdapter");
        throw null;
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_anime_characters);
        this.E = getIntent().getIntExtra("animeId", -1);
        String stringExtra = getIntent().getStringExtra("seriesTitle");
        if (this.E <= 0 || stringExtra == null) {
            throw new IllegalArgumentException("Incorrect arguments given");
        }
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        j0(toolbar, "Related Anime", stringExtra, true);
        p0();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!com.zunjae.vresult.b.a(S().I())) {
            S().b0(this.E);
        }
    }
}
