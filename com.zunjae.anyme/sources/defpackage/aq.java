package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import defpackage.eo;
import defpackage.jq;
import defpackage.zn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: aq  reason: default package */
public class aq implements bp, jq {
    private static final vm i = vm.b("proto");
    private final gq e;
    private final kq f;
    private final kq g;
    private final cp h;

    /* renamed from: aq$b */
    interface b<T, U> {
        U a(T t);
    }

    /* renamed from: aq$c */
    private static class c {
        final String a;
        final String b;

        private c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* renamed from: aq$d */
    interface d<T> {
        T a();
    }

    aq(kq kqVar, kq kqVar2, cp cpVar, gq gqVar) {
        this.e = gqVar;
        this.f = kqVar;
        this.g = kqVar2;
        this.h = cpVar;
    }

    static /* synthetic */ Object C(Throwable th) {
        throw new iq("Timed out while trying to acquire the lock.", th);
    }

    static /* synthetic */ SQLiteDatabase E(Throwable th) {
        throw new iq("Timed out while trying to open db.", th);
    }

    static /* synthetic */ Long F(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    static /* synthetic */ Long G(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    static /* synthetic */ Boolean J(aq aqVar, eo eoVar, SQLiteDatabase sQLiteDatabase) {
        Long m = aqVar.m(sQLiteDatabase, eoVar);
        if (m == null) {
            return Boolean.FALSE;
        }
        return (Boolean) k0(aqVar.i().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m.toString()}), tp.b());
    }

    static /* synthetic */ List K(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            eo.a a2 = eo.a();
            a2.b(cursor.getString(1));
            a2.d(qq.b(cursor.getInt(2)));
            a2.c(d0(cursor.getString(3)));
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    static /* synthetic */ List L(SQLiteDatabase sQLiteDatabase) {
        return (List) k0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), sp.b());
    }

    static /* synthetic */ List M(aq aqVar, eo eoVar, SQLiteDatabase sQLiteDatabase) {
        List<hp> Z = aqVar.Z(sQLiteDatabase, eoVar);
        aqVar.z(Z, aqVar.c0(sQLiteDatabase, Z));
        return Z;
    }

    static /* synthetic */ Object N(aq aqVar, List list, eo eoVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            zn.a a2 = zn.a();
            a2.j(cursor.getString(1));
            a2.i(cursor.getLong(2));
            a2.k(cursor.getLong(3));
            a2.h(z ? new yn(h0(cursor.getString(4)), cursor.getBlob(5)) : new yn(h0(cursor.getString(4)), aqVar.e0(j)));
            if (!cursor.isNull(6)) {
                a2.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(hp.a(j, eoVar, a2.d()));
        }
        return null;
    }

    static /* synthetic */ Object P(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    static /* synthetic */ Long Q(aq aqVar, eo eoVar, zn znVar, SQLiteDatabase sQLiteDatabase) {
        if (aqVar.t()) {
            return -1L;
        }
        long h2 = aqVar.h(sQLiteDatabase, eoVar);
        int e2 = aqVar.h.e();
        byte[] a2 = znVar.e().a();
        boolean z = a2.length <= e2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(h2));
        contentValues.put("transport_name", znVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(znVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(znVar.k()));
        contentValues.put("payload_encoding", znVar.e().b().a());
        contentValues.put("code", znVar.d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a2 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a2.length) / ((double) e2));
            for (int i2 = 1; i2 <= ceil; i2++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i2 - 1) * e2, Math.min(i2 * e2, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : znVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    static /* synthetic */ byte[] U(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i2 += blob.length;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            byte[] bArr2 = (byte[]) arrayList.get(i4);
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i3 += bArr2.length;
        }
        return bArr;
    }

    static /* synthetic */ Object V(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    static /* synthetic */ Object Y(long j, eo eoVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{eoVar.b(), String.valueOf(qq.a(eoVar.d()))}) < 1) {
            contentValues.put("backend_name", eoVar.b());
            contentValues.put("priority", Integer.valueOf(qq.a(eoVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    private List<hp> Z(SQLiteDatabase sQLiteDatabase, eo eoVar) {
        ArrayList arrayList = new ArrayList();
        Long m = m(sQLiteDatabase, eoVar);
        if (m == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        k0(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.h.d())), mp.b(this, arrayList, eoVar));
        return arrayList;
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        g0(pp.b(sQLiteDatabase), qp.b());
    }

    private Map<Long, Set<c>> c0(SQLiteDatabase sQLiteDatabase, List<hp> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).c());
            if (i2 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        k0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), op.b(hashMap));
        return hashMap;
    }

    private static byte[] d0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private byte[] e0(long j) {
        return (byte[]) k0(i().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), np.b());
    }

    private <T> T g0(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.g.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.g.a() >= ((long) this.h.b()) + a2) {
                    return bVar.a(e2);
                }
                SystemClock.sleep(50);
            }
        }
    }

    private long h(SQLiteDatabase sQLiteDatabase, eo eoVar) {
        Long m = m(sQLiteDatabase, eoVar);
        if (m != null) {
            return m.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", eoVar.b());
        contentValues.put("priority", Integer.valueOf(qq.a(eoVar.d())));
        contentValues.put("next_request_ms", 0);
        if (eoVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(eoVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    private static vm h0(String str) {
        return str == null ? i : vm.b(str);
    }

    private static String j0(Iterable<hp> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<hp> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    private long k() {
        return i().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private static <T> T k0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    private long l() {
        return i().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private Long m(SQLiteDatabase sQLiteDatabase, eo eoVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{eoVar.b(), String.valueOf(qq.a(eoVar.d()))}));
        if (eoVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(eoVar.c(), 0));
        }
        return (Long) k0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), wp.b());
    }

    private <T> T r(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase i2 = i();
        i2.beginTransaction();
        try {
            T a2 = bVar.a(i2);
            i2.setTransactionSuccessful();
            return a2;
        } finally {
            i2.endTransaction();
        }
    }

    private boolean t() {
        return k() * l() >= this.h.f();
    }

    private List<hp> z(List<hp> list, Map<Long, Set<c>> map) {
        ListIterator<hp> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            hp next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                zn.a l = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l.c(cVar.a, cVar.b);
                }
                listIterator.set(hp.a(next.c(), next.d(), l.d()));
            }
        }
        return list;
    }

    public boolean C0(eo eoVar) {
        return ((Boolean) r(zp.b(this, eoVar))).booleanValue();
    }

    public void E0(Iterable<hp> iterable) {
        if (iterable.iterator().hasNext()) {
            r(xp.b("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + j0(iterable)));
        }
    }

    public <T> T a(jq.a<T> aVar) {
        SQLiteDatabase i2 = i();
        b(i2);
        try {
            T h2 = aVar.h();
            i2.setTransactionSuccessful();
            return h2;
        } finally {
            i2.endTransaction();
        }
    }

    public void close() {
        this.e.close();
    }

    public int g() {
        return ((Integer) r(lp.b(this.f.a() - this.h.c()))).intValue();
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase i() {
        gq gqVar = this.e;
        gqVar.getClass();
        return (SQLiteDatabase) g0(rp.b(gqVar), up.b());
    }

    public void j(Iterable<hp> iterable) {
        if (iterable.iterator().hasNext()) {
            i().compileStatement("DELETE FROM events WHERE _id in " + j0(iterable)).execute();
        }
    }

    public hp q0(eo eoVar, zn znVar) {
        mo.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", eoVar.d(), znVar.j(), eoVar.b());
        long longValue = ((Long) r(vp.b(this, eoVar, znVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return hp.a(longValue, eoVar, znVar);
    }

    public Iterable<hp> s(eo eoVar) {
        return (Iterable) r(jp.b(this, eoVar));
    }

    public void u(eo eoVar, long j) {
        r(ip.b(j, eoVar));
    }

    public long x0(eo eoVar) {
        return ((Long) k0(i().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{eoVar.b(), String.valueOf(qq.a(eoVar.d()))}), yp.b())).longValue();
    }

    public Iterable<eo> y() {
        return (Iterable) r(kp.b());
    }
}
