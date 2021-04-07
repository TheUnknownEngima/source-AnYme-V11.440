package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.n6;

/* renamed from: s6  reason: default package */
class s6 implements n6 {
    private final a a;

    /* renamed from: s6$a */
    static class a extends SQLiteOpenHelper {
        final r6[] e;
        final n6.a f;
        private boolean g;

        /* renamed from: s6$a$a  reason: collision with other inner class name */
        class C0141a implements DatabaseErrorHandler {
            final /* synthetic */ n6.a a;
            final /* synthetic */ r6[] b;

            C0141a(n6.a aVar, r6[] r6VarArr) {
                this.a = aVar;
                this.b = r6VarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.a.c(a.b(this.b, sQLiteDatabase));
            }
        }

        a(Context context, String str, r6[] r6VarArr, n6.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.a, new C0141a(aVar, r6VarArr));
            this.f = aVar;
            this.e = r6VarArr;
        }

        static r6 b(r6[] r6VarArr, SQLiteDatabase sQLiteDatabase) {
            r6 r6Var = r6VarArr[0];
            if (r6Var == null || !r6Var.a(sQLiteDatabase)) {
                r6VarArr[0] = new r6(sQLiteDatabase);
            }
            return r6VarArr[0];
        }

        /* access modifiers changed from: package-private */
        public r6 a(SQLiteDatabase sQLiteDatabase) {
            return b(this.e, sQLiteDatabase);
        }

        public synchronized void close() {
            super.close();
            this.e[0] = null;
        }

        /* access modifiers changed from: package-private */
        public synchronized m6 h() {
            this.g = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.g) {
                close();
                return h();
            }
            return a(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f.b(a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f.d(a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.g = true;
            this.f.e(a(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.g) {
                this.f.f(a(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.g = true;
            this.f.g(a(sQLiteDatabase), i, i2);
        }
    }

    s6(Context context, String str, n6.a aVar) {
        this.a = d(context, str, aVar);
    }

    private a d(Context context, String str, n6.a aVar) {
        return new a(context, str, new r6[1], aVar);
    }

    public void a(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }

    public m6 b() {
        return this.a.h();
    }

    public String c() {
        return this.a.getDatabaseName();
    }
}
