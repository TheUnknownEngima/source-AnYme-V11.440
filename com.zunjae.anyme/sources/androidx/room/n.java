package androidx.room;

import android.database.Cursor;
import defpackage.n6;
import java.util.List;

public class n extends n6.a {
    private c b;
    private final a c;
    private final String d;
    private final String e;

    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        /* access modifiers changed from: protected */
        public abstract void a(m6 m6Var);

        /* access modifiers changed from: protected */
        public abstract void b(m6 m6Var);

        /* access modifiers changed from: protected */
        public abstract void c(m6 m6Var);

        /* access modifiers changed from: protected */
        public abstract void d(m6 m6Var);

        /* access modifiers changed from: protected */
        public void e(m6 m6Var) {
        }

        /* access modifiers changed from: protected */
        public void f(m6 m6Var) {
        }

        /* access modifiers changed from: protected */
        public b g(m6 m6Var) {
            h(m6Var);
            return new b(true, (String) null);
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public void h(m6 m6Var) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public n(c cVar, a aVar, String str, String str2) {
        super(aVar.a);
        this.b = cVar;
        this.c = aVar;
        this.d = str;
        this.e = str2;
    }

    /* JADX INFO: finally extract failed */
    private void h(m6 m6Var) {
        if (k(m6Var)) {
            String str = null;
            Cursor i0 = m6Var.i0(new l6("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (i0.moveToFirst()) {
                    str = i0.getString(0);
                }
                i0.close();
                if (!this.d.equals(str) && !this.e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                i0.close();
                throw th;
            }
        } else {
            b g = this.c.g(m6Var);
            if (g.a) {
                this.c.e(m6Var);
                l(m6Var);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.b);
        }
    }

    private void i(m6 m6Var) {
        m6Var.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(m6 m6Var) {
        Cursor R = m6Var.R("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (R.moveToFirst() && R.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            R.close();
        }
    }

    private static boolean k(m6 m6Var) {
        Cursor R = m6Var.R("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (R.moveToFirst() && R.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            R.close();
        }
    }

    private void l(m6 m6Var) {
        i(m6Var);
        m6Var.execSQL(m.a(this.d));
    }

    public void b(m6 m6Var) {
        super.b(m6Var);
    }

    public void d(m6 m6Var) {
        boolean j = j(m6Var);
        this.c.a(m6Var);
        if (!j) {
            b g = this.c.g(m6Var);
            if (!g.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.b);
            }
        }
        l(m6Var);
        this.c.c(m6Var);
    }

    public void e(m6 m6Var, int i, int i2) {
        g(m6Var, i, i2);
    }

    public void f(m6 m6Var) {
        super.f(m6Var);
        h(m6Var);
        this.c.d(m6Var);
        this.b = null;
    }

    public void g(m6 m6Var, int i, int i2) {
        boolean z;
        List<e6> c2;
        c cVar = this.b;
        if (cVar == null || (c2 = cVar.d.c(i, i2)) == null) {
            z = false;
        } else {
            this.c.f(m6Var);
            for (e6 a2 : c2) {
                a2.a(m6Var);
            }
            b g = this.c.g(m6Var);
            if (g.a) {
                this.c.e(m6Var);
                l(m6Var);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g.b);
            }
        }
        if (!z) {
            c cVar2 = this.b;
            if (cVar2 == null || cVar2.a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.c.b(m6Var);
            this.c.a(m6Var);
        }
    }
}
