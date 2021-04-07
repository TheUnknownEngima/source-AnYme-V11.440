package androidx.work.impl;

import android.os.Build;
import androidx.room.c;
import androidx.room.i;
import androidx.room.l;
import androidx.room.n;
import defpackage.k6;
import defpackage.n6;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile j8 m;
    private volatile a8 n;
    private volatile m8 o;
    private volatile d8 p;
    private volatile g8 q;

    class a extends n.a {
        a(int i) {
            super(i);
        }

        public void a(m6 m6Var) {
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            m6Var.execSQL("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            m6Var.execSQL("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            m6Var.execSQL("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            m6Var.execSQL("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            m6Var.execSQL("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            m6Var.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c84d23ade98552f1cec71088c1f0794c\")");
        }

        public void b(m6 m6Var) {
            m6Var.execSQL("DROP TABLE IF EXISTS `Dependency`");
            m6Var.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            m6Var.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            m6Var.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            m6Var.execSQL("DROP TABLE IF EXISTS `WorkName`");
        }

        /* access modifiers changed from: protected */
        public void c(m6 m6Var) {
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((l.b) WorkDatabase_Impl.this.h.get(i)).a(m6Var);
                }
            }
        }

        public void d(m6 m6Var) {
            m6 unused = WorkDatabase_Impl.this.a = m6Var;
            m6Var.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.q(m6Var);
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((l.b) WorkDatabase_Impl.this.h.get(i)).c(m6Var);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(m6 m6Var) {
            m6 m6Var2 = m6Var;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new k6.a("work_spec_id", "TEXT", true, 1));
            hashMap.put("prerequisite_id", new k6.a("prerequisite_id", "TEXT", true, 2));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new k6.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new k6.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new k6.d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new k6.d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            k6 k6Var = new k6("Dependency", hashMap, hashSet, hashSet2);
            k6 a = k6.a(m6Var2, "Dependency");
            if (k6Var.equals(a)) {
                HashMap hashMap2 = new HashMap(23);
                hashMap2.put("id", new k6.a("id", "TEXT", true, 1));
                hashMap2.put("state", new k6.a("state", "INTEGER", true, 0));
                hashMap2.put("worker_class_name", new k6.a("worker_class_name", "TEXT", true, 0));
                hashMap2.put("input_merger_class_name", new k6.a("input_merger_class_name", "TEXT", false, 0));
                hashMap2.put("input", new k6.a("input", "BLOB", true, 0));
                hashMap2.put("output", new k6.a("output", "BLOB", true, 0));
                hashMap2.put("initial_delay", new k6.a("initial_delay", "INTEGER", true, 0));
                hashMap2.put("interval_duration", new k6.a("interval_duration", "INTEGER", true, 0));
                hashMap2.put("flex_duration", new k6.a("flex_duration", "INTEGER", true, 0));
                hashMap2.put("run_attempt_count", new k6.a("run_attempt_count", "INTEGER", true, 0));
                hashMap2.put("backoff_policy", new k6.a("backoff_policy", "INTEGER", true, 0));
                hashMap2.put("backoff_delay_duration", new k6.a("backoff_delay_duration", "INTEGER", true, 0));
                hashMap2.put("period_start_time", new k6.a("period_start_time", "INTEGER", true, 0));
                hashMap2.put("minimum_retention_duration", new k6.a("minimum_retention_duration", "INTEGER", true, 0));
                hashMap2.put("schedule_requested_at", new k6.a("schedule_requested_at", "INTEGER", true, 0));
                hashMap2.put("required_network_type", new k6.a("required_network_type", "INTEGER", false, 0));
                hashMap2.put("requires_charging", new k6.a("requires_charging", "INTEGER", true, 0));
                hashMap2.put("requires_device_idle", new k6.a("requires_device_idle", "INTEGER", true, 0));
                hashMap2.put("requires_battery_not_low", new k6.a("requires_battery_not_low", "INTEGER", true, 0));
                hashMap2.put("requires_storage_not_low", new k6.a("requires_storage_not_low", "INTEGER", true, 0));
                hashMap2.put("trigger_content_update_delay", new k6.a("trigger_content_update_delay", "INTEGER", true, 0));
                hashMap2.put("trigger_max_content_delay", new k6.a("trigger_max_content_delay", "INTEGER", true, 0));
                hashMap2.put("content_uri_triggers", new k6.a("content_uri_triggers", "BLOB", false, 0));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new k6.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
                k6 k6Var2 = new k6("WorkSpec", hashMap2, hashSet3, hashSet4);
                k6 a2 = k6.a(m6Var2, "WorkSpec");
                if (k6Var2.equals(a2)) {
                    HashMap hashMap3 = new HashMap(2);
                    hashMap3.put("tag", new k6.a("tag", "TEXT", true, 1));
                    hashMap3.put("work_spec_id", new k6.a("work_spec_id", "TEXT", true, 2));
                    HashSet hashSet5 = new HashSet(1);
                    hashSet5.add(new k6.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                    HashSet hashSet6 = new HashSet(1);
                    hashSet6.add(new k6.d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                    k6 k6Var3 = new k6("WorkTag", hashMap3, hashSet5, hashSet6);
                    k6 a3 = k6.a(m6Var2, "WorkTag");
                    if (k6Var3.equals(a3)) {
                        HashMap hashMap4 = new HashMap(2);
                        hashMap4.put("work_spec_id", new k6.a("work_spec_id", "TEXT", true, 1));
                        hashMap4.put("system_id", new k6.a("system_id", "INTEGER", true, 0));
                        HashSet hashSet7 = new HashSet(1);
                        hashSet7.add(new k6.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                        k6 k6Var4 = new k6("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                        k6 a4 = k6.a(m6Var2, "SystemIdInfo");
                        if (k6Var4.equals(a4)) {
                            HashMap hashMap5 = new HashMap(2);
                            hashMap5.put("name", new k6.a("name", "TEXT", true, 1));
                            hashMap5.put("work_spec_id", new k6.a("work_spec_id", "TEXT", true, 2));
                            HashSet hashSet8 = new HashSet(1);
                            hashSet8.add(new k6.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                            HashSet hashSet9 = new HashSet(1);
                            hashSet9.add(new k6.d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                            k6 k6Var5 = new k6("WorkName", hashMap5, hashSet8, hashSet9);
                            k6 a5 = k6.a(m6Var2, "WorkName");
                            if (!k6Var5.equals(a5)) {
                                throw new IllegalStateException("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + k6Var5 + "\n Found:\n" + a5);
                            }
                            return;
                        }
                        throw new IllegalStateException("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + k6Var4 + "\n Found:\n" + a4);
                    }
                    throw new IllegalStateException("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + k6Var3 + "\n Found:\n" + a3);
                }
                throw new IllegalStateException("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + k6Var2 + "\n Found:\n" + a2);
            }
            throw new IllegalStateException("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + k6Var + "\n Found:\n" + a);
        }
    }

    public d8 B() {
        d8 d8Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new e8(this);
            }
            d8Var = this.p;
        }
        return d8Var;
    }

    public g8 C() {
        g8 g8Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new h8(this);
            }
            g8Var = this.q;
        }
        return g8Var;
    }

    public j8 D() {
        j8 j8Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new k8(this);
            }
            j8Var = this.m;
        }
        return j8Var;
    }

    public m8 E() {
        m8 m8Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new n8(this);
            }
            m8Var = this.o;
        }
        return m8Var;
    }

    public void d() {
        super.a();
        m6 b = super.l().b();
        boolean z = Build.VERSION.SDK_INT >= 21;
        if (!z) {
            try {
                b.execSQL("PRAGMA foreign_keys = FALSE");
            } catch (Throwable th) {
                super.h();
                if (!z) {
                    b.execSQL("PRAGMA foreign_keys = TRUE");
                }
                b.R("PRAGMA wal_checkpoint(FULL)").close();
                if (!b.inTransaction()) {
                    b.execSQL("VACUUM");
                }
                throw th;
            }
        }
        super.c();
        if (z) {
            b.execSQL("PRAGMA defer_foreign_keys = TRUE");
        }
        b.execSQL("DELETE FROM `Dependency`");
        b.execSQL("DELETE FROM `WorkSpec`");
        b.execSQL("DELETE FROM `WorkTag`");
        b.execSQL("DELETE FROM `SystemIdInfo`");
        b.execSQL("DELETE FROM `WorkName`");
        super.v();
        super.h();
        if (!z) {
            b.execSQL("PRAGMA foreign_keys = TRUE");
        }
        b.R("PRAGMA wal_checkpoint(FULL)").close();
        if (!b.inTransaction()) {
            b.execSQL("VACUUM");
        }
    }

    /* access modifiers changed from: protected */
    public i f() {
        return new i(this, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    /* access modifiers changed from: protected */
    public n6 g(c cVar) {
        n nVar = new n(cVar, new a(5), "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        n6.b.a a2 = n6.b.a(cVar.b);
        a2.c(cVar.c);
        a2.b(nVar);
        return cVar.a.a(a2.a());
    }

    public a8 x() {
        a8 a8Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new b8(this);
            }
            a8Var = this.n;
        }
        return a8Var;
    }
}
