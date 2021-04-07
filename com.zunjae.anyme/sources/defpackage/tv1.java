package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import androidx.lifecycle.LiveData;
import com.zunjae.anyme.features.database.AppDatabase;
import com.zunjae.anyme.features.database.e;
import com.zunjae.anyme.features.waifus.j;
import defpackage.og2;
import java.util.List;

/* renamed from: tv1  reason: default package */
public final class tv1 implements og2 {
    private final e e;
    private final com.zunjae.anyme.features.kanon.e f;

    /* renamed from: tv1$a */
    private static final class a extends AsyncTask<j, Void, Void> {
        private final mv1 a;
        private final e b;

        public a(mv1 mv1, e eVar) {
            v62.e(mv1, "crud");
            v62.e(eVar, "kanonDao");
            this.a = mv1;
            this.b = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(j... jVarArr) {
            v62.e(jVarArr, "kanonWaifus");
            int i = sv1.a[this.a.ordinal()];
            if (i == 1) {
                this.b.f(jVarArr[0]);
                return null;
            } else if (i != 2) {
                return null;
            } else {
                this.b.b(jVarArr[0]);
                return null;
            }
        }
    }

    /* renamed from: tv1$b */
    private static final class b extends AsyncTask<Void, Void, Void> {
        private final e a;
        private final com.zunjae.anyme.features.kanon.e b;

        public b(e eVar, com.zunjae.anyme.features.kanon.e eVar2) {
            v62.e(eVar, "kanonDao");
            v62.e(eVar2, "kanonService");
            this.a = eVar;
            this.b = eVar2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            v62.e(voidArr, "voids");
            try {
                List a2 = this.b.f().h().a();
                if (a2 != null) {
                    this.a.g(a2);
                }
                return null;
            } catch (Exception e) {
                uj2.d(e);
                return null;
            }
        }
    }

    public tv1(Context context, com.zunjae.anyme.features.kanon.e eVar) {
        v62.e(context, "application");
        v62.e(eVar, "kanonService");
        this.f = eVar;
        e z = AppDatabase.y(context.getApplicationContext()).z();
        v62.d(z, "AppDatabase.getAppDataba…cationContext).kanonDao()");
        this.e = z;
    }

    public final LiveData<List<j>> a() {
        return this.e.c();
    }

    public final void b(j jVar) {
        v62.e(jVar, "kanonWaifu");
        new a(mv1.DELETE, this.e).execute(new j[]{jVar});
    }

    public final void c(j jVar) {
        v62.e(jVar, "kanonWaifu");
        new a(mv1.INSERT, this.e).execute(new j[]{jVar});
    }

    public final kv1 d(int i) {
        String str;
        try {
            qi2<db2> h = this.f.I(i).h();
            int b2 = h.b();
            db2 a2 = h.a();
            if (a2 == null || (str = a2.r()) == null) {
                str = "";
            }
            return new kv1(b2, str);
        } catch (Exception e2) {
            uj2.d(e2);
            return null;
        }
    }

    public final void e(List<yy1> list) {
        if (list != null) {
            this.e.d(list);
        }
    }

    public final kv1 f(j jVar) {
        String str;
        v62.e(jVar, "kanonWaifu");
        try {
            qi2<db2> h = this.f.x(jVar).h();
            db2 a2 = h.a();
            if (a2 == null || (str = a2.r()) == null) {
                str = "";
            }
            return new kv1(h.b(), str);
        } catch (Exception e2) {
            uj2.d(e2);
            return null;
        }
    }

    public final void g() {
        new b(this.e, this.f).execute(new Void[0]);
    }

    public mg2 m() {
        return og2.a.a(this);
    }
}
