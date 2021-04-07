package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: m6  reason: default package */
public interface m6 extends Closeable {
    Cursor R(String str);

    void beginTransaction();

    void endTransaction();

    void execSQL(String str);

    List<Pair<String, String>> getAttachedDbs();

    String getPath();

    Cursor i0(p6 p6Var);

    boolean inTransaction();

    boolean isOpen();

    q6 p(String str);

    void setTransactionSuccessful();

    Cursor x(p6 p6Var, CancellationSignal cancellationSignal);
}
