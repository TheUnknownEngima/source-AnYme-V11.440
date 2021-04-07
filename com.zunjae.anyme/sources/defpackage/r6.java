package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;

/* renamed from: r6  reason: default package */
class r6 implements m6 {
    private static final String[] f = new String[0];
    private final SQLiteDatabase e;

    /* renamed from: r6$a */
    class a implements SQLiteDatabase.CursorFactory {
        final /* synthetic */ p6 a;

        a(r6 r6Var, p6 p6Var) {
            this.a = p6Var;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.b(new u6(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: r6$b */
    class b implements SQLiteDatabase.CursorFactory {
        final /* synthetic */ p6 a;

        b(r6 r6Var, p6 p6Var) {
            this.a = p6Var;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.b(new u6(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    r6(SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
    }

    public Cursor R(String str) {
        return i0(new l6(str));
    }

    /* access modifiers changed from: package-private */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.e == sQLiteDatabase;
    }

    public void beginTransaction() {
        this.e.beginTransaction();
    }

    public void close() {
        this.e.close();
    }

    public void endTransaction() {
        this.e.endTransaction();
    }

    public void execSQL(String str) {
        this.e.execSQL(str);
    }

    public List<Pair<String, String>> getAttachedDbs() {
        return this.e.getAttachedDbs();
    }

    public String getPath() {
        return this.e.getPath();
    }

    public Cursor i0(p6 p6Var) {
        return this.e.rawQueryWithFactory(new a(this, p6Var), p6Var.a(), f, (String) null);
    }

    public boolean inTransaction() {
        return this.e.inTransaction();
    }

    public boolean isOpen() {
        return this.e.isOpen();
    }

    public q6 p(String str) {
        return new v6(this.e.compileStatement(str));
    }

    public void setTransactionSuccessful() {
        this.e.setTransactionSuccessful();
    }

    public Cursor x(p6 p6Var, CancellationSignal cancellationSignal) {
        return this.e.rawQueryWithFactory(new b(this, p6Var), p6Var.a(), f, (String) null, cancellationSignal);
    }
}
