package com.zunjae.anyme.features.anime.character;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class CharactersActivity extends AbstractActivity {
    public static final c G = new c((r62) null);
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    private final d22 E = g22.b(new b(this, (oh2) null, (o52) null));
    private HashMap F;

    public static final class a extends w62 implements o52<qu1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, qu1] */
        /* renamed from: a */
        public final qu1 invoke() {
            return lg2.b(this.f, f72.b(qu1.class), this.g, this.h);
        }
    }

    public static final class b extends w62 implements o52<ou1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, ou1] */
        /* renamed from: a */
        public final ou1 invoke() {
            return lg2.b(this.f, f72.b(ou1.class), this.g, this.h);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public final Intent a(Context context, int i, String str, ArrayList<Integer> arrayList) {
            v62.e(context, "context");
            v62.e(str, "seriesTitle");
            v62.e(arrayList, "characterIdsInFavorite");
            Intent intent = new Intent(context, CharactersActivity.class);
            intent.putExtra("animeId", i);
            intent.putExtra("seriesTitle", str);
            intent.putExtra("characterIdsInFavorite", arrayList);
            return intent;
        }
    }

    static final class d<T> implements u<List<? extends d>> {
        final /* synthetic */ ArrayList a;
        final /* synthetic */ AnimeCharactersAdapter b;

        d(ArrayList arrayList, AnimeCharactersAdapter animeCharactersAdapter) {
            this.a = arrayList;
            this.b = animeCharactersAdapter;
        }

        /* renamed from: b */
        public final void a(List<d> list) {
            if (list != null) {
                for (d dVar : list) {
                    dVar.i(this.a.contains(Integer.valueOf(dVar.c())));
                }
            }
            this.b.P(list);
        }
    }

    private final ou1 m0() {
        return (ou1) this.E.getValue();
    }

    private final qu1 n0() {
        return (qu1) this.D.getValue();
    }

    public View l0(int i) {
        if (this.F == null) {
            this.F = new HashMap();
        }
        View view = (View) this.F.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.F.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_anime_characters);
        int intExtra = getIntent().getIntExtra("animeId", -1);
        ArrayList<Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("characterIdsInFavorite");
        String stringExtra = getIntent().getStringExtra("seriesTitle");
        if (intExtra <= 0 || stringExtra == null || integerArrayListExtra == null) {
            throw new IllegalArgumentException("Incorrect arguments given");
        }
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        j0(toolbar, "Characters", stringExtra, true);
        AnimeCharactersAdapter animeCharactersAdapter = new AnimeCharactersAdapter(this, intExtra, n0(), 1);
        com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(T(), (RecyclerView) l0(C0275R$id.recyclerViewCharacters), animeCharactersAdapter);
        cVar.c(4, 6);
        cVar.d(com.zunjae.zrecyclerview.a.GRID);
        cVar.a();
        m0().i((long) intExtra).g(this, new d(integerArrayListExtra, animeCharactersAdapter));
    }
}
