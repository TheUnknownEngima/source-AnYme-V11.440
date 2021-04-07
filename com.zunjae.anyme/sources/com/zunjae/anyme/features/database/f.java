package com.zunjae.anyme.features.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import com.zunjae.anyme.features.waifus.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class f extends e {
    /* access modifiers changed from: private */
    public final l a;
    private final androidx.room.e<j> b;
    private final androidx.room.e<yy1> c;
    private final androidx.room.d<j> d;
    private final s e;

    class a extends androidx.room.e<j> {
        a(f fVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `waifus` (`waifu_id`,`parent_anime_id`,`waifu_name`,`waifu_image_url`,`date_created`) VALUES (?,?,?,?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, j jVar) {
            q6Var.bindLong(1, (long) jVar.i());
            q6Var.bindLong(2, (long) jVar.d());
            if (jVar.j() == null) {
                q6Var.bindNull(3);
            } else {
                q6Var.bindString(3, jVar.j());
            }
            if (jVar.f() == null) {
                q6Var.bindNull(4);
            } else {
                q6Var.bindString(4, jVar.f());
            }
            q6Var.bindLong(5, jVar.e());
        }
    }

    class b extends androidx.room.e<yy1> {
        b(f fVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `minimal_kitsu_info` (`malId`,`kitsuId`,`startDate2`,`endDate2`,`posterId`,`coverId`,`type`,`titleEnJp`,`titleEn`,`titleJaJp`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, yy1 yy1) {
            q6Var.bindLong(1, (long) yy1.h());
            q6Var.bindLong(2, (long) yy1.g());
            if (yy1.k() == null) {
                q6Var.bindNull(3);
            } else {
                q6Var.bindString(3, yy1.k());
            }
            if (yy1.e() == null) {
                q6Var.bindNull(4);
            } else {
                q6Var.bindString(4, yy1.e());
            }
            if (yy1.i() == null) {
                q6Var.bindNull(5);
            } else {
                q6Var.bindString(5, yy1.i());
            }
            if (yy1.b() == null) {
                q6Var.bindNull(6);
            } else {
                q6Var.bindString(6, yy1.b());
            }
            if (yy1.o() == null) {
                q6Var.bindNull(7);
            } else {
                q6Var.bindString(7, yy1.o());
            }
            if (yy1.m() == null) {
                q6Var.bindNull(8);
            } else {
                q6Var.bindString(8, yy1.m());
            }
            if (yy1.l() == null) {
                q6Var.bindNull(9);
            } else {
                q6Var.bindString(9, yy1.l());
            }
            if (yy1.n() == null) {
                q6Var.bindNull(10);
            } else {
                q6Var.bindString(10, yy1.n());
            }
        }
    }

    class c extends androidx.room.d<j> {
        c(f fVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM `waifus` WHERE `waifu_id` = ?";
        }

        /* renamed from: i */
        public void g(q6 q6Var, j jVar) {
            q6Var.bindLong(1, (long) jVar.i());
        }
    }

    class d extends s {
        d(f fVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM waifus";
        }
    }

    class e implements Callable<List<j>> {
        final /* synthetic */ o a;

        e(o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public List<j> call() {
            Cursor b2 = h6.b(f.this.a, this.a, false, (CancellationSignal) null);
            try {
                int b3 = g6.b(b2, "waifu_id");
                int b4 = g6.b(b2, "parent_anime_id");
                int b5 = g6.b(b2, "waifu_name");
                int b6 = g6.b(b2, "waifu_image_url");
                int b7 = g6.b(b2, "date_created");
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    j jVar = new j(b2.getInt(b3), b2.getInt(b4), b2.getString(b5), b2.getString(b6));
                    jVar.n(b2.getLong(b7));
                    arrayList.add(jVar);
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

    public f(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
        this.c = new b(this, lVar);
        this.d = new c(this, lVar);
        this.e = new d(this, lVar);
    }

    public void a() {
        this.a.b();
        q6 a2 = this.e.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.v();
        } finally {
            this.a.h();
            this.e.f(a2);
        }
    }

    public void b(j jVar) {
        this.a.b();
        this.a.c();
        try {
            this.d.h(jVar);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public LiveData<List<j>> c() {
        return this.a.k().d(new String[]{"waifus"}, false, new e(o.h("SELECT * from waifus", 0)));
    }

    public void d(List<yy1> list) {
        this.a.b();
        this.a.c();
        try {
            this.c.h(list);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public void e(List<j> list) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(list);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public void f(j jVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(jVar);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public void g(List<j> list) {
        this.a.c();
        try {
            super.g(list);
            this.a.v();
        } finally {
            this.a.h();
        }
    }
}
