package com.zunjae.anyme.features.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class d extends c {
    /* access modifiers changed from: private */
    public final l a;
    private final e<com.zunjae.anyme.features.anime.character.d> b;
    private final s c;
    private final s d;

    class a extends e<com.zunjae.anyme.features.anime.character.d> {
        a(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `characters` (`name`,`characterURL`,`imageURL`,`animeId`) VALUES (?,?,?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, com.zunjae.anyme.features.anime.character.d dVar) {
            if (dVar.f() == null) {
                q6Var.bindNull(1);
            } else {
                q6Var.bindString(1, dVar.f());
            }
            if (dVar.d() == null) {
                q6Var.bindNull(2);
            } else {
                q6Var.bindString(2, dVar.d());
            }
            if (dVar.e() == null) {
                q6Var.bindNull(3);
            } else {
                q6Var.bindString(3, dVar.e());
            }
            q6Var.bindLong(4, dVar.a());
        }
    }

    class b extends s {
        b(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM characters";
        }
    }

    class c extends s {
        c(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM characters where animeId = ?";
        }
    }

    /* renamed from: com.zunjae.anyme.features.database.d$d  reason: collision with other inner class name */
    class C0182d implements Callable<List<com.zunjae.anyme.features.anime.character.d>> {
        final /* synthetic */ o a;

        C0182d(o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public List<com.zunjae.anyme.features.anime.character.d> call() {
            Cursor b2 = h6.b(d.this.a, this.a, false, (CancellationSignal) null);
            try {
                int b3 = g6.b(b2, "name");
                int b4 = g6.b(b2, "characterURL");
                int b5 = g6.b(b2, "imageURL");
                int b6 = g6.b(b2, "animeId");
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    com.zunjae.anyme.features.anime.character.d dVar = new com.zunjae.anyme.features.anime.character.d(b2.getString(b3));
                    dVar.k(b2.getString(b4));
                    dVar.l(b2.getString(b5));
                    dVar.j(b2.getLong(b6));
                    arrayList.add(dVar);
                }
                return arrayList;
            } finally {
                b2.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    public d(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
        this.c = new b(this, lVar);
        this.d = new c(this, lVar);
    }

    public void a() {
        this.a.b();
        q6 a2 = this.c.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.v();
        } finally {
            this.a.h();
            this.c.f(a2);
        }
    }

    public void b(long j) {
        this.a.b();
        q6 a2 = this.d.a();
        a2.bindLong(1, j);
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.v();
        } finally {
            this.a.h();
            this.d.f(a2);
        }
    }

    public List<com.zunjae.anyme.features.anime.character.d> c(long j) {
        o h = o.h("SELECT * FROM characters where animeId = ?", 1);
        h.bindLong(1, j);
        this.a.b();
        Cursor b2 = h6.b(this.a, h, false, (CancellationSignal) null);
        try {
            int b3 = g6.b(b2, "name");
            int b4 = g6.b(b2, "characterURL");
            int b5 = g6.b(b2, "imageURL");
            int b6 = g6.b(b2, "animeId");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                com.zunjae.anyme.features.anime.character.d dVar = new com.zunjae.anyme.features.anime.character.d(b2.getString(b3));
                dVar.k(b2.getString(b4));
                dVar.l(b2.getString(b5));
                dVar.j(b2.getLong(b6));
                arrayList.add(dVar);
            }
            return arrayList;
        } finally {
            b2.close();
            h.l();
        }
    }

    public LiveData<List<com.zunjae.anyme.features.anime.character.d>> d(long j) {
        o h = o.h("SELECT * FROM characters where animeId = ?", 1);
        h.bindLong(1, j);
        return this.a.k().d(new String[]{"characters"}, false, new C0182d(h));
    }

    public void e(List<com.zunjae.anyme.features.anime.character.d> list) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(list);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public void f(List<com.zunjae.anyme.features.anime.character.d> list, long j) {
        this.a.c();
        try {
            super.f(list, j);
            this.a.v();
        } finally {
            this.a.h();
        }
    }
}
