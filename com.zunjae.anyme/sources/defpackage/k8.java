package defpackage;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.i;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import androidx.work.m;
import defpackage.i8;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: k8  reason: default package */
public final class k8 implements j8 {
    /* access modifiers changed from: private */
    public final l a;
    private final androidx.room.e b;
    private final s c;
    private final s d;
    private final s e;
    private final s f;
    private final s g;
    private final s h;
    private final s i;

    /* renamed from: k8$a */
    class a extends androidx.lifecycle.c<List<i8.b>> {
        private i.c g;
        final /* synthetic */ o h;

        /* renamed from: k8$a$a  reason: collision with other inner class name */
        class C0131a extends i.c {
            C0131a(String str, String... strArr) {
                super(str, strArr);
            }

            public void b(Set<String> set) {
                a.this.c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Executor executor, o oVar) {
            super(executor);
            this.h = oVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public List<i8.b> a() {
            Cursor t;
            if (this.g == null) {
                this.g = new C0131a("WorkTag", "workspec");
                k8.this.a.k().b(this.g);
            }
            k8.this.a.c();
            try {
                t = k8.this.a.t(this.h);
                b0 b0Var = new b0();
                int columnIndexOrThrow = t.getColumnIndexOrThrow("id");
                int columnIndexOrThrow2 = t.getColumnIndexOrThrow("state");
                int columnIndexOrThrow3 = t.getColumnIndexOrThrow("output");
                ArrayList arrayList = new ArrayList(t.getCount());
                while (t.moveToNext()) {
                    i8.b bVar = new i8.b();
                    bVar.a = t.getString(columnIndexOrThrow);
                    bVar.b = o8.f(t.getInt(columnIndexOrThrow2));
                    bVar.c = androidx.work.e.f(t.getBlob(columnIndexOrThrow3));
                    if (!t.isNull(columnIndexOrThrow)) {
                        String string = t.getString(columnIndexOrThrow);
                        ArrayList arrayList2 = (ArrayList) b0Var.get(string);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            b0Var.put(string, arrayList2);
                        }
                        bVar.d = arrayList2;
                    }
                    arrayList.add(bVar);
                }
                k8.this.t(b0Var);
                k8.this.a.v();
                t.close();
                k8.this.a.h();
                return arrayList;
            } catch (Throwable th) {
                k8.this.a.h();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.h.l();
        }
    }

    /* renamed from: k8$b */
    class b extends androidx.room.e<i8> {
        b(k8 k8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, i8 i8Var) {
            String str = i8Var.a;
            if (str == null) {
                q6Var.bindNull(1);
            } else {
                q6Var.bindString(1, str);
            }
            q6Var.bindLong(2, (long) o8.h(i8Var.b));
            String str2 = i8Var.c;
            if (str2 == null) {
                q6Var.bindNull(3);
            } else {
                q6Var.bindString(3, str2);
            }
            String str3 = i8Var.d;
            if (str3 == null) {
                q6Var.bindNull(4);
            } else {
                q6Var.bindString(4, str3);
            }
            byte[] j = androidx.work.e.j(i8Var.e);
            if (j == null) {
                q6Var.bindNull(5);
            } else {
                q6Var.bindBlob(5, j);
            }
            byte[] j2 = androidx.work.e.j(i8Var.f);
            if (j2 == null) {
                q6Var.bindNull(6);
            } else {
                q6Var.bindBlob(6, j2);
            }
            q6Var.bindLong(7, i8Var.g);
            q6Var.bindLong(8, i8Var.h);
            q6Var.bindLong(9, i8Var.i);
            q6Var.bindLong(10, (long) i8Var.k);
            q6Var.bindLong(11, (long) o8.a(i8Var.l));
            q6Var.bindLong(12, i8Var.m);
            q6Var.bindLong(13, i8Var.n);
            q6Var.bindLong(14, i8Var.o);
            q6Var.bindLong(15, i8Var.p);
            androidx.work.c cVar = i8Var.j;
            if (cVar != null) {
                q6Var.bindLong(16, (long) o8.g(cVar.b()));
                q6Var.bindLong(17, cVar.g() ? 1 : 0);
                q6Var.bindLong(18, cVar.h() ? 1 : 0);
                q6Var.bindLong(19, cVar.f() ? 1 : 0);
                q6Var.bindLong(20, cVar.i() ? 1 : 0);
                q6Var.bindLong(21, cVar.c());
                q6Var.bindLong(22, cVar.d());
                byte[] c = o8.c(cVar.a());
                if (c != null) {
                    q6Var.bindBlob(23, c);
                    return;
                }
            } else {
                q6Var.bindNull(16);
                q6Var.bindNull(17);
                q6Var.bindNull(18);
                q6Var.bindNull(19);
                q6Var.bindNull(20);
                q6Var.bindNull(21);
                q6Var.bindNull(22);
            }
            q6Var.bindNull(23);
        }
    }

    /* renamed from: k8$c */
    class c extends s {
        c(k8 k8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: k8$d */
    class d extends s {
        d(k8 k8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: k8$e */
    class e extends s {
        e(k8 k8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: k8$f */
    class f extends s {
        f(k8 k8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: k8$g */
    class g extends s {
        g(k8 k8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: k8$h */
    class h extends s {
        h(k8 k8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: k8$i */
    class i extends s {
        i(k8 k8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: k8$j */
    class j extends s {
        j(k8 k8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public k8(l lVar) {
        this.a = lVar;
        this.b = new b(this, lVar);
        this.c = new c(this, lVar);
        this.d = new d(this, lVar);
        this.e = new e(this, lVar);
        this.f = new f(this, lVar);
        this.g = new g(this, lVar);
        this.h = new h(this, lVar);
        this.i = new i(this, lVar);
        new j(this, lVar);
    }

    /* access modifiers changed from: private */
    public void t(b0<String, ArrayList<String>> b0Var) {
        ArrayList arrayList;
        int i2;
        Set<String> keySet = b0Var.keySet();
        if (!keySet.isEmpty()) {
            if (b0Var.size() > 999) {
                b0 b0Var2 = new b0(999);
                int size = b0Var.size();
                int i3 = 0;
                loop0:
                while (true) {
                    i2 = 0;
                    while (i3 < size) {
                        b0Var2.put(b0Var.i(i3), b0Var.m(i3));
                        i3++;
                        i2++;
                        if (i2 == 999) {
                            t(b0Var2);
                            b0Var2 = new b0(999);
                        }
                    }
                    break loop0;
                }
                if (i2 > 0) {
                    t(b0Var2);
                    return;
                }
                return;
            }
            StringBuilder b2 = j6.b();
            b2.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            j6.a(b2, size2);
            b2.append(")");
            o h2 = o.h(b2.toString(), size2 + 0);
            int i4 = 1;
            for (String next : keySet) {
                if (next == null) {
                    h2.bindNull(i4);
                } else {
                    h2.bindString(i4, next);
                }
                i4++;
            }
            Cursor t = this.a.t(h2);
            try {
                int columnIndex = t.getColumnIndex("work_spec_id");
                if (columnIndex != -1) {
                    while (t.moveToNext()) {
                        if (!t.isNull(columnIndex) && (arrayList = b0Var.get(t.getString(columnIndex))) != null) {
                            arrayList.add(t.getString(0));
                        }
                    }
                    t.close();
                }
            } finally {
                t.close();
            }
        }
    }

    public int a(m.a aVar, String... strArr) {
        StringBuilder b2 = j6.b();
        b2.append("UPDATE workspec SET state=");
        b2.append("?");
        b2.append(" WHERE id IN (");
        j6.a(b2, strArr.length);
        b2.append(")");
        q6 e2 = this.a.e(b2.toString());
        e2.bindLong(1, (long) o8.h(aVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                e2.bindNull(i2);
            } else {
                e2.bindString(i2, str);
            }
            i2++;
        }
        this.a.c();
        try {
            int executeUpdateDelete = e2.executeUpdateDelete();
            this.a.v();
            return executeUpdateDelete;
        } finally {
            this.a.h();
        }
    }

    public int b(String str, long j2) {
        q6 a2 = this.h.a();
        this.a.c();
        try {
            a2.bindLong(1, j2);
            if (str == null) {
                a2.bindNull(2);
            } else {
                a2.bindString(2, str);
            }
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.a.v();
            return executeUpdateDelete;
        } finally {
            this.a.h();
            this.h.f(a2);
        }
    }

    public List<i8.a> c(String str) {
        o h2 = o.h("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        Cursor t = this.a.t(h2);
        try {
            int columnIndexOrThrow = t.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = t.getColumnIndexOrThrow("state");
            ArrayList arrayList = new ArrayList(t.getCount());
            while (t.moveToNext()) {
                i8.a aVar = new i8.a();
                aVar.a = t.getString(columnIndexOrThrow);
                aVar.b = o8.f(t.getInt(columnIndexOrThrow2));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            t.close();
            h2.l();
        }
    }

    public List<i8> d(int i2) {
        o oVar;
        o h2 = o.h("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        h2.bindLong(1, (long) i2);
        Cursor t = this.a.t(h2);
        try {
            int columnIndexOrThrow = t.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = t.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = t.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = t.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = t.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = t.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = t.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = t.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = t.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = t.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = t.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = t.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = t.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = t.getColumnIndexOrThrow("minimum_retention_duration");
            oVar = h2;
            try {
                int columnIndexOrThrow15 = t.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = t.getColumnIndexOrThrow("required_network_type");
                int i3 = columnIndexOrThrow14;
                int columnIndexOrThrow17 = t.getColumnIndexOrThrow("requires_charging");
                int i4 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = t.getColumnIndexOrThrow("requires_device_idle");
                int i5 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = t.getColumnIndexOrThrow("requires_battery_not_low");
                int i6 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = t.getColumnIndexOrThrow("requires_storage_not_low");
                int i7 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = t.getColumnIndexOrThrow("trigger_content_update_delay");
                int i8 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = t.getColumnIndexOrThrow("trigger_max_content_delay");
                int i9 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = t.getColumnIndexOrThrow("content_uri_triggers");
                int i10 = columnIndexOrThrow7;
                int i11 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(t.getCount());
                while (t.moveToNext()) {
                    String string = t.getString(columnIndexOrThrow);
                    int i12 = columnIndexOrThrow;
                    String string2 = t.getString(columnIndexOrThrow3);
                    int i13 = columnIndexOrThrow3;
                    androidx.work.c cVar = new androidx.work.c();
                    int i14 = columnIndexOrThrow16;
                    cVar.k(o8.e(t.getInt(columnIndexOrThrow16)));
                    cVar.m(t.getInt(columnIndexOrThrow17) != 0);
                    cVar.n(t.getInt(columnIndexOrThrow18) != 0);
                    cVar.l(t.getInt(columnIndexOrThrow19) != 0);
                    cVar.o(t.getInt(columnIndexOrThrow20) != 0);
                    int i15 = columnIndexOrThrow18;
                    cVar.p(t.getLong(columnIndexOrThrow21));
                    cVar.q(t.getLong(columnIndexOrThrow22));
                    cVar.j(o8.b(t.getBlob(columnIndexOrThrow23)));
                    i8 i8Var = new i8(string, string2);
                    i8Var.b = o8.f(t.getInt(columnIndexOrThrow2));
                    i8Var.d = t.getString(columnIndexOrThrow4);
                    i8Var.e = androidx.work.e.f(t.getBlob(columnIndexOrThrow5));
                    int i16 = i11;
                    i8Var.f = androidx.work.e.f(t.getBlob(i16));
                    int i17 = columnIndexOrThrow4;
                    int i18 = i10;
                    int i19 = columnIndexOrThrow5;
                    i8Var.g = t.getLong(i18);
                    int i20 = columnIndexOrThrow17;
                    int i21 = i9;
                    int i22 = i18;
                    i8Var.h = t.getLong(i21);
                    int i23 = i21;
                    int i24 = i8;
                    int i25 = i20;
                    i8Var.i = t.getLong(i24);
                    int i26 = i7;
                    i8Var.k = t.getInt(i26);
                    int i27 = i6;
                    i11 = i16;
                    i8Var.l = o8.d(t.getInt(i27));
                    int i28 = i23;
                    int i29 = i5;
                    int i30 = i24;
                    i8Var.m = t.getLong(i29);
                    i7 = i26;
                    int i31 = i4;
                    i8Var.n = t.getLong(i31);
                    i4 = i31;
                    int i32 = i3;
                    i8Var.o = t.getLong(i32);
                    int i33 = columnIndexOrThrow15;
                    i3 = i32;
                    int i34 = i27;
                    i8Var.p = t.getLong(i33);
                    i8Var.j = cVar;
                    arrayList.add(i8Var);
                    columnIndexOrThrow15 = i33;
                    columnIndexOrThrow4 = i17;
                    columnIndexOrThrow5 = i19;
                    columnIndexOrThrow3 = i13;
                    columnIndexOrThrow18 = i15;
                    columnIndexOrThrow16 = i14;
                    i10 = i22;
                    i9 = i28;
                    i6 = i34;
                    columnIndexOrThrow17 = i25;
                    i8 = i30;
                    i5 = i29;
                    columnIndexOrThrow = i12;
                }
                t.close();
                oVar.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                t.close();
                oVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = h2;
            t.close();
            oVar.l();
            throw th;
        }
    }

    public void e(String str) {
        q6 a2 = this.c.a();
        this.a.c();
        if (str == null) {
            try {
                a2.bindNull(1);
            } catch (Throwable th) {
                this.a.h();
                this.c.f(a2);
                throw th;
            }
        } else {
            a2.bindString(1, str);
        }
        a2.executeUpdateDelete();
        this.a.v();
        this.a.h();
        this.c.f(a2);
    }

    public void f(i8 i8Var) {
        this.a.c();
        try {
            this.b.i(i8Var);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public List<i8> g() {
        o oVar;
        o h2 = o.h("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        Cursor t = this.a.t(h2);
        try {
            int columnIndexOrThrow = t.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = t.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = t.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = t.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = t.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = t.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = t.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = t.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = t.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = t.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = t.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = t.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = t.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = t.getColumnIndexOrThrow("minimum_retention_duration");
            oVar = h2;
            try {
                int columnIndexOrThrow15 = t.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = t.getColumnIndexOrThrow("required_network_type");
                int i2 = columnIndexOrThrow14;
                int columnIndexOrThrow17 = t.getColumnIndexOrThrow("requires_charging");
                int i3 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = t.getColumnIndexOrThrow("requires_device_idle");
                int i4 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = t.getColumnIndexOrThrow("requires_battery_not_low");
                int i5 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = t.getColumnIndexOrThrow("requires_storage_not_low");
                int i6 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = t.getColumnIndexOrThrow("trigger_content_update_delay");
                int i7 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = t.getColumnIndexOrThrow("trigger_max_content_delay");
                int i8 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = t.getColumnIndexOrThrow("content_uri_triggers");
                int i9 = columnIndexOrThrow7;
                int i10 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(t.getCount());
                while (t.moveToNext()) {
                    String string = t.getString(columnIndexOrThrow);
                    int i11 = columnIndexOrThrow;
                    String string2 = t.getString(columnIndexOrThrow3);
                    int i12 = columnIndexOrThrow3;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = columnIndexOrThrow16;
                    cVar.k(o8.e(t.getInt(columnIndexOrThrow16)));
                    cVar.m(t.getInt(columnIndexOrThrow17) != 0);
                    cVar.n(t.getInt(columnIndexOrThrow18) != 0);
                    cVar.l(t.getInt(columnIndexOrThrow19) != 0);
                    cVar.o(t.getInt(columnIndexOrThrow20) != 0);
                    int i14 = columnIndexOrThrow18;
                    cVar.p(t.getLong(columnIndexOrThrow21));
                    cVar.q(t.getLong(columnIndexOrThrow22));
                    cVar.j(o8.b(t.getBlob(columnIndexOrThrow23)));
                    i8 i8Var = new i8(string, string2);
                    i8Var.b = o8.f(t.getInt(columnIndexOrThrow2));
                    i8Var.d = t.getString(columnIndexOrThrow4);
                    i8Var.e = androidx.work.e.f(t.getBlob(columnIndexOrThrow5));
                    int i15 = i10;
                    i8Var.f = androidx.work.e.f(t.getBlob(i15));
                    int i16 = columnIndexOrThrow4;
                    int i17 = i9;
                    int i18 = columnIndexOrThrow5;
                    i8Var.g = t.getLong(i17);
                    int i19 = columnIndexOrThrow17;
                    int i20 = i8;
                    int i21 = i17;
                    i8Var.h = t.getLong(i20);
                    int i22 = i20;
                    int i23 = i7;
                    int i24 = i19;
                    i8Var.i = t.getLong(i23);
                    int i25 = i6;
                    i8Var.k = t.getInt(i25);
                    int i26 = i5;
                    i10 = i15;
                    i8Var.l = o8.d(t.getInt(i26));
                    int i27 = i22;
                    int i28 = i4;
                    int i29 = i23;
                    i8Var.m = t.getLong(i28);
                    i6 = i25;
                    int i30 = i3;
                    i8Var.n = t.getLong(i30);
                    i3 = i30;
                    int i31 = i2;
                    i8Var.o = t.getLong(i31);
                    i2 = i31;
                    int i32 = i26;
                    int i33 = columnIndexOrThrow15;
                    i8Var.p = t.getLong(i33);
                    i8Var.j = cVar;
                    arrayList.add(i8Var);
                    columnIndexOrThrow15 = i33;
                    columnIndexOrThrow4 = i16;
                    columnIndexOrThrow5 = i18;
                    columnIndexOrThrow3 = i12;
                    columnIndexOrThrow18 = i14;
                    columnIndexOrThrow16 = i13;
                    i9 = i21;
                    i8 = i27;
                    i5 = i32;
                    columnIndexOrThrow17 = i24;
                    i7 = i29;
                    i4 = i28;
                    columnIndexOrThrow = i11;
                }
                t.close();
                oVar.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                t.close();
                oVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = h2;
            t.close();
            oVar.l();
            throw th;
        }
    }

    public void h(String str, androidx.work.e eVar) {
        q6 a2 = this.d.a();
        this.a.c();
        try {
            byte[] j2 = androidx.work.e.j(eVar);
            if (j2 == null) {
                a2.bindNull(1);
            } else {
                a2.bindBlob(1, j2);
            }
            if (str == null) {
                a2.bindNull(2);
            } else {
                a2.bindString(2, str);
            }
            a2.executeUpdateDelete();
            this.a.v();
        } finally {
            this.a.h();
            this.d.f(a2);
        }
    }

    public List<i8> i() {
        o oVar;
        o h2 = o.h("SELECT * FROM workspec WHERE state=0", 0);
        Cursor t = this.a.t(h2);
        try {
            int columnIndexOrThrow = t.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = t.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = t.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = t.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = t.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = t.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = t.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = t.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = t.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = t.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = t.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = t.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = t.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = t.getColumnIndexOrThrow("minimum_retention_duration");
            oVar = h2;
            try {
                int columnIndexOrThrow15 = t.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = t.getColumnIndexOrThrow("required_network_type");
                int i2 = columnIndexOrThrow14;
                int columnIndexOrThrow17 = t.getColumnIndexOrThrow("requires_charging");
                int i3 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = t.getColumnIndexOrThrow("requires_device_idle");
                int i4 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = t.getColumnIndexOrThrow("requires_battery_not_low");
                int i5 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = t.getColumnIndexOrThrow("requires_storage_not_low");
                int i6 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = t.getColumnIndexOrThrow("trigger_content_update_delay");
                int i7 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = t.getColumnIndexOrThrow("trigger_max_content_delay");
                int i8 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = t.getColumnIndexOrThrow("content_uri_triggers");
                int i9 = columnIndexOrThrow7;
                int i10 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(t.getCount());
                while (t.moveToNext()) {
                    String string = t.getString(columnIndexOrThrow);
                    int i11 = columnIndexOrThrow;
                    String string2 = t.getString(columnIndexOrThrow3);
                    int i12 = columnIndexOrThrow3;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = columnIndexOrThrow16;
                    cVar.k(o8.e(t.getInt(columnIndexOrThrow16)));
                    cVar.m(t.getInt(columnIndexOrThrow17) != 0);
                    cVar.n(t.getInt(columnIndexOrThrow18) != 0);
                    cVar.l(t.getInt(columnIndexOrThrow19) != 0);
                    cVar.o(t.getInt(columnIndexOrThrow20) != 0);
                    int i14 = columnIndexOrThrow18;
                    cVar.p(t.getLong(columnIndexOrThrow21));
                    cVar.q(t.getLong(columnIndexOrThrow22));
                    cVar.j(o8.b(t.getBlob(columnIndexOrThrow23)));
                    i8 i8Var = new i8(string, string2);
                    i8Var.b = o8.f(t.getInt(columnIndexOrThrow2));
                    i8Var.d = t.getString(columnIndexOrThrow4);
                    i8Var.e = androidx.work.e.f(t.getBlob(columnIndexOrThrow5));
                    int i15 = i10;
                    i8Var.f = androidx.work.e.f(t.getBlob(i15));
                    int i16 = columnIndexOrThrow4;
                    int i17 = i9;
                    int i18 = columnIndexOrThrow5;
                    i8Var.g = t.getLong(i17);
                    int i19 = columnIndexOrThrow17;
                    int i20 = i8;
                    int i21 = i17;
                    i8Var.h = t.getLong(i20);
                    int i22 = i20;
                    int i23 = i7;
                    int i24 = i19;
                    i8Var.i = t.getLong(i23);
                    int i25 = i6;
                    i8Var.k = t.getInt(i25);
                    int i26 = i5;
                    i10 = i15;
                    i8Var.l = o8.d(t.getInt(i26));
                    int i27 = i22;
                    int i28 = i4;
                    int i29 = i23;
                    i8Var.m = t.getLong(i28);
                    i6 = i25;
                    int i30 = i3;
                    i8Var.n = t.getLong(i30);
                    i3 = i30;
                    int i31 = i2;
                    i8Var.o = t.getLong(i31);
                    i2 = i31;
                    int i32 = i26;
                    int i33 = columnIndexOrThrow15;
                    i8Var.p = t.getLong(i33);
                    i8Var.j = cVar;
                    arrayList.add(i8Var);
                    columnIndexOrThrow15 = i33;
                    columnIndexOrThrow4 = i16;
                    columnIndexOrThrow5 = i18;
                    columnIndexOrThrow3 = i12;
                    columnIndexOrThrow18 = i14;
                    columnIndexOrThrow16 = i13;
                    i9 = i21;
                    i8 = i27;
                    i5 = i32;
                    columnIndexOrThrow17 = i24;
                    i7 = i29;
                    i4 = i28;
                    columnIndexOrThrow = i11;
                }
                t.close();
                oVar.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                t.close();
                oVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = h2;
            t.close();
            oVar.l();
            throw th;
        }
    }

    public List<String> j() {
        o h2 = o.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        Cursor t = this.a.t(h2);
        try {
            ArrayList arrayList = new ArrayList(t.getCount());
            while (t.moveToNext()) {
                arrayList.add(t.getString(0));
            }
            return arrayList;
        } finally {
            t.close();
            h2.l();
        }
    }

    public List<String> k(String str) {
        o h2 = o.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        Cursor t = this.a.t(h2);
        try {
            ArrayList arrayList = new ArrayList(t.getCount());
            while (t.moveToNext()) {
                arrayList.add(t.getString(0));
            }
            return arrayList;
        } finally {
            t.close();
            h2.l();
        }
    }

    public m.a l(String str) {
        o h2 = o.h("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        Cursor t = this.a.t(h2);
        try {
            return t.moveToFirst() ? o8.f(t.getInt(0)) : null;
        } finally {
            t.close();
            h2.l();
        }
    }

    public i8 m(String str) {
        o oVar;
        i8 i8Var;
        String str2 = str;
        o h2 = o.h("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str2);
        }
        Cursor t = this.a.t(h2);
        try {
            int columnIndexOrThrow = t.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = t.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = t.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = t.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = t.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = t.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = t.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = t.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = t.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = t.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = t.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = t.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = t.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = t.getColumnIndexOrThrow("minimum_retention_duration");
            oVar = h2;
            try {
                int columnIndexOrThrow15 = t.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = t.getColumnIndexOrThrow("required_network_type");
                int i2 = columnIndexOrThrow14;
                int columnIndexOrThrow17 = t.getColumnIndexOrThrow("requires_charging");
                int i3 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = t.getColumnIndexOrThrow("requires_device_idle");
                int i4 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = t.getColumnIndexOrThrow("requires_battery_not_low");
                int i5 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = t.getColumnIndexOrThrow("requires_storage_not_low");
                int i6 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = t.getColumnIndexOrThrow("trigger_content_update_delay");
                int i7 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = t.getColumnIndexOrThrow("trigger_max_content_delay");
                int i8 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = t.getColumnIndexOrThrow("content_uri_triggers");
                if (t.moveToFirst()) {
                    String string = t.getString(columnIndexOrThrow);
                    String string2 = t.getString(columnIndexOrThrow3);
                    int i9 = columnIndexOrThrow7;
                    androidx.work.c cVar = new androidx.work.c();
                    cVar.k(o8.e(t.getInt(columnIndexOrThrow16)));
                    cVar.m(t.getInt(columnIndexOrThrow17) != 0);
                    cVar.n(t.getInt(columnIndexOrThrow18) != 0);
                    cVar.l(t.getInt(columnIndexOrThrow19) != 0);
                    cVar.o(t.getInt(columnIndexOrThrow20) != 0);
                    cVar.p(t.getLong(columnIndexOrThrow21));
                    cVar.q(t.getLong(columnIndexOrThrow22));
                    cVar.j(o8.b(t.getBlob(columnIndexOrThrow23)));
                    i8Var = new i8(string, string2);
                    i8Var.b = o8.f(t.getInt(columnIndexOrThrow2));
                    i8Var.d = t.getString(columnIndexOrThrow4);
                    i8Var.e = androidx.work.e.f(t.getBlob(columnIndexOrThrow5));
                    i8Var.f = androidx.work.e.f(t.getBlob(columnIndexOrThrow6));
                    i8Var.g = t.getLong(i9);
                    i8Var.h = t.getLong(i8);
                    i8Var.i = t.getLong(i7);
                    i8Var.k = t.getInt(i6);
                    i8Var.l = o8.d(t.getInt(i5));
                    i8Var.m = t.getLong(i4);
                    i8Var.n = t.getLong(i3);
                    i8Var.o = t.getLong(i2);
                    i8Var.p = t.getLong(columnIndexOrThrow15);
                    i8Var.j = cVar;
                } else {
                    i8Var = null;
                }
                t.close();
                oVar.l();
                return i8Var;
            } catch (Throwable th) {
                th = th;
                t.close();
                oVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = h2;
            t.close();
            oVar.l();
            throw th;
        }
    }

    public int n(String str) {
        q6 a2 = this.g.a();
        this.a.c();
        if (str == null) {
            try {
                a2.bindNull(1);
            } catch (Throwable th) {
                this.a.h();
                this.g.f(a2);
                throw th;
            }
        } else {
            a2.bindString(1, str);
        }
        int executeUpdateDelete = a2.executeUpdateDelete();
        this.a.v();
        this.a.h();
        this.g.f(a2);
        return executeUpdateDelete;
    }

    public LiveData<List<i8.b>> o(List<String> list) {
        StringBuilder b2 = j6.b();
        b2.append("SELECT id, state, output FROM workspec WHERE id IN (");
        int size = list.size();
        j6.a(b2, size);
        b2.append(")");
        o h2 = o.h(b2.toString(), size + 0);
        int i2 = 1;
        for (String next : list) {
            if (next == null) {
                h2.bindNull(i2);
            } else {
                h2.bindString(i2, next);
            }
            i2++;
        }
        return new a(this.a.m(), h2).b();
    }

    public List<androidx.work.e> p(String str) {
        o h2 = o.h("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        Cursor t = this.a.t(h2);
        try {
            ArrayList arrayList = new ArrayList(t.getCount());
            while (t.moveToNext()) {
                arrayList.add(androidx.work.e.f(t.getBlob(0)));
            }
            return arrayList;
        } finally {
            t.close();
            h2.l();
        }
    }

    public int q(String str) {
        q6 a2 = this.f.a();
        this.a.c();
        if (str == null) {
            try {
                a2.bindNull(1);
            } catch (Throwable th) {
                this.a.h();
                this.f.f(a2);
                throw th;
            }
        } else {
            a2.bindString(1, str);
        }
        int executeUpdateDelete = a2.executeUpdateDelete();
        this.a.v();
        this.a.h();
        this.f.f(a2);
        return executeUpdateDelete;
    }

    public void r(String str, long j2) {
        q6 a2 = this.e.a();
        this.a.c();
        try {
            a2.bindLong(1, j2);
            if (str == null) {
                a2.bindNull(2);
            } else {
                a2.bindString(2, str);
            }
            a2.executeUpdateDelete();
            this.a.v();
        } finally {
            this.a.h();
            this.e.f(a2);
        }
    }

    public int s() {
        q6 a2 = this.i.a();
        this.a.c();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.a.v();
            return executeUpdateDelete;
        } finally {
            this.a.h();
            this.i.f(a2);
        }
    }
}
