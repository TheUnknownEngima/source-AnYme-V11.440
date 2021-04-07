package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import defpackage.as0;
import defpackage.cs0;
import defpackage.sy0;
import defpackage.yr0;
import defpackage.zr0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class d extends u9 {
    /* access modifiers changed from: private */
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */
    public static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */
    public static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final i d = new i(this, n(), "google_app_measurement.db");
    /* access modifiers changed from: private */
    public final q9 e = new q9(l());

    d(x9 x9Var) {
        super(x9Var);
    }

    private final Object F(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            h().E().a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                h().E().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            h().E().a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    private final String H(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = v().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return string;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str2;
        } catch (SQLiteException e2) {
            h().E().c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static void M(ContentValues contentValues, String str, Object obj) {
        r.f(str);
        r.j(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final boolean V(String str, int i2, zr0 zr0) {
        r();
        b();
        r.f(str);
        r.j(zr0);
        Integer num = null;
        if (TextUtils.isEmpty(zr0.I())) {
            e4 H = h().H();
            Object w = c4.w(str);
            Integer valueOf = Integer.valueOf(i2);
            if (zr0.G()) {
                num = Integer.valueOf(zr0.H());
            }
            H.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", w, valueOf, String.valueOf(num));
            return false;
        }
        byte[] h2 = zr0.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", zr0.G() ? Integer.valueOf(zr0.H()) : null);
        contentValues.put("event_name", zr0.I());
        contentValues.put("session_scoped", zr0.Q() ? Boolean.valueOf(zr0.R()) : null);
        contentValues.put("data", h2);
        try {
            if (v().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            h().E().b("Failed to insert event filter (got -1). appId", c4.w(str));
            return true;
        } catch (SQLiteException e2) {
            h().E().c("Error storing event filter. appId", c4.w(str), e2);
            return false;
        }
    }

    private final boolean W(String str, int i2, cs0 cs0) {
        r();
        b();
        r.f(str);
        r.j(cs0);
        Integer num = null;
        if (TextUtils.isEmpty(cs0.F())) {
            e4 H = h().H();
            Object w = c4.w(str);
            Integer valueOf = Integer.valueOf(i2);
            if (cs0.C()) {
                num = Integer.valueOf(cs0.D());
            }
            H.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", w, valueOf, String.valueOf(num));
            return false;
        }
        byte[] h2 = cs0.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", cs0.C() ? Integer.valueOf(cs0.D()) : null);
        contentValues.put("property_name", cs0.F());
        contentValues.put("session_scoped", cs0.K() ? Boolean.valueOf(cs0.L()) : null);
        contentValues.put("data", h2);
        try {
            if (v().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            h().E().b("Failed to insert property filter (got -1). appId", c4.w(str));
            return false;
        } catch (SQLiteException e2) {
            h().E().c("Error storing property filter. appId", c4.w(str), e2);
            return false;
        }
    }

    private final boolean h0() {
        return n().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long i0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = v().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j2 = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j2;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            h().E().c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean m0(String str, List<Integer> list) {
        r.f(str);
        r();
        b();
        SQLiteDatabase v = v();
        try {
            long i0 = i0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, j().u(str, u.F)));
            if (i0 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return v.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            h().E().c("Database error querying filters. appId", c4.w(str), e2);
            return false;
        }
    }

    private final long z(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = v().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j3;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j2;
        } catch (SQLiteException e2) {
            h().E().c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<defpackage.qs0, java.lang.Long> A(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.b()
            r7.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.v()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0076 }
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.measurement.internal.c4 r8 = r7.h()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.M()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0076 }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0076 }
            qs0$a r4 = defpackage.qs0.b0()     // Catch:{ IOException -> 0x005e }
            com.google.android.gms.measurement.internal.ba.z(r4, r2)     // Catch:{ IOException -> 0x005e }
            qs0$a r4 = (defpackage.qs0.a) r4     // Catch:{ IOException -> 0x005e }
            f01 r2 = r4.k()     // Catch:{ IOException -> 0x005e }
            sy0 r2 = (defpackage.sy0) r2     // Catch:{ IOException -> 0x005e }
            qs0 r2 = (defpackage.qs0) r2     // Catch:{ IOException -> 0x005e }
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x005d
            r1.close()
        L_0x005d:
            return r8
        L_0x005e:
            r2 = move-exception
            com.google.android.gms.measurement.internal.c4 r3 = r7.h()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.c4.w(r8)     // Catch:{ SQLiteException -> 0x0076 }
            r3.d(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0075
            r1.close()
        L_0x0075:
            return r0
        L_0x0076:
            r8 = move-exception
            goto L_0x007c
        L_0x0078:
            r8 = move-exception
            goto L_0x0091
        L_0x007a:
            r8 = move-exception
            r1 = r0
        L_0x007c:
            com.google.android.gms.measurement.internal.c4 r9 = r7.h()     // Catch:{ all -> 0x008f }
            com.google.android.gms.measurement.internal.e4 r9 = r9.E()     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x008e
            r1.close()
        L_0x008e:
            return r0
        L_0x008f:
            r8 = move-exception
            r0 = r1
        L_0x0091:
            if (r0 == 0) goto L_0x0096
            r0.close()
        L_0x0096:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.A(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    public final long A0(String str, String str2) {
        long z;
        String str3 = str;
        String str4 = str2;
        r.f(str);
        r.f(str2);
        b();
        r();
        SQLiteDatabase v = v();
        v.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                z = z(sb.toString(), new String[]{str3}, -1);
                if (z == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (v.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        h().E().c("Failed to insert column (got -1). appId", c4.w(str), str4);
                        v.endTransaction();
                        return -1;
                    }
                    z = 0;
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    h().E().d("Error inserting column. appId", c4.w(str), str4, e);
                    v.endTransaction();
                    return j2;
                } catch (Throwable th) {
                    th = th;
                    v.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put(str4, Long.valueOf(1 + z));
                if (((long) v.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    h().E().c("Failed to update column (got 0). appId", c4.w(str), str4);
                    v.endTransaction();
                    return -1;
                }
                v.setTransactionSuccessful();
                v.endTransaction();
                return z;
            } catch (SQLiteException e3) {
                e = e3;
                j2 = z;
                h().E().d("Error inserting column. appId", c4.w(str), str4, e);
                v.endTransaction();
                return j2;
            }
        } catch (SQLiteException e4) {
            e = e4;
            h().E().d("Error inserting column. appId", c4.w(str), str4, e);
            v.endTransaction();
            return j2;
        } catch (Throwable th2) {
            th = th2;
            v.endTransaction();
            throw th;
        }
    }

    public final g B(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        r.f(str);
        b();
        r();
        String[] strArr = {str};
        g gVar = new g();
        Cursor cursor = null;
        try {
            SQLiteDatabase v = v();
            cursor = v.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                h().H().b("Not updating daily counts, app is not known. appId", c4.w(str));
                if (cursor != null) {
                    cursor.close();
                }
                return gVar;
            }
            if (cursor.getLong(0) == j2) {
                gVar.b = cursor.getLong(1);
                gVar.a = cursor.getLong(2);
                gVar.c = cursor.getLong(3);
                gVar.d = cursor.getLong(4);
                gVar.e = cursor.getLong(5);
            }
            if (z) {
                gVar.b += j3;
            }
            if (z2) {
                gVar.a += j3;
            }
            if (z3) {
                gVar.c += j3;
            }
            if (z4) {
                gVar.d += j3;
            }
            if (z5) {
                gVar.e += j3;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j2));
            contentValues.put("daily_public_events_count", Long.valueOf(gVar.a));
            contentValues.put("daily_events_count", Long.valueOf(gVar.b));
            contentValues.put("daily_conversions_count", Long.valueOf(gVar.c));
            contentValues.put("daily_error_events_count", Long.valueOf(gVar.d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(gVar.e));
            v.update("apps", contentValues, "app_id=?", strArr);
            if (cursor != null) {
                cursor.close();
            }
            return gVar;
        } catch (SQLiteException e2) {
            h().E().c("Error updating daily counts. appId", c4.w(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return gVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle B0(java.lang.String r8) {
        /*
            r7 = this;
            r7.b()
            r7.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.v()     // Catch:{ SQLiteException -> 0x00bf, all -> 0x00bd }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00bf, all -> 0x00bd }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x00bf, all -> 0x00bd }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x00bf, all -> 0x00bd }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00bb }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.c4 r8 = r7.h()     // Catch:{ SQLiteException -> 0x00bb }
            com.google.android.gms.measurement.internal.e4 r8 = r8.M()     // Catch:{ SQLiteException -> 0x00bb }
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch:{ SQLiteException -> 0x00bb }
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x00bb }
            qs0$a r3 = defpackage.qs0.b0()     // Catch:{ IOException -> 0x00a3 }
            com.google.android.gms.measurement.internal.ba.z(r3, r2)     // Catch:{ IOException -> 0x00a3 }
            qs0$a r3 = (defpackage.qs0.a) r3     // Catch:{ IOException -> 0x00a3 }
            f01 r2 = r3.k()     // Catch:{ IOException -> 0x00a3 }
            sy0 r2 = (defpackage.sy0) r2     // Catch:{ IOException -> 0x00a3 }
            qs0 r2 = (defpackage.qs0) r2     // Catch:{ IOException -> 0x00a3 }
            r7.k()     // Catch:{ SQLiteException -> 0x00bb }
            java.util.List r8 = r2.B()     // Catch:{ SQLiteException -> 0x00bb }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00bb }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00bb }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00bb }
        L_0x0055:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00bb }
            if (r3 == 0) goto L_0x009d
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00bb }
            ss0 r3 = (defpackage.ss0) r3     // Catch:{ SQLiteException -> 0x00bb }
            java.lang.String r4 = r3.N()     // Catch:{ SQLiteException -> 0x00bb }
            boolean r5 = r3.a0()     // Catch:{ SQLiteException -> 0x00bb }
            if (r5 == 0) goto L_0x0073
            double r5 = r3.b0()     // Catch:{ SQLiteException -> 0x00bb }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00bb }
            goto L_0x0055
        L_0x0073:
            boolean r5 = r3.Y()     // Catch:{ SQLiteException -> 0x00bb }
            if (r5 == 0) goto L_0x0081
            float r3 = r3.Z()     // Catch:{ SQLiteException -> 0x00bb }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00bb }
            goto L_0x0055
        L_0x0081:
            boolean r5 = r3.S()     // Catch:{ SQLiteException -> 0x00bb }
            if (r5 == 0) goto L_0x008f
            java.lang.String r3 = r3.T()     // Catch:{ SQLiteException -> 0x00bb }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00bb }
            goto L_0x0055
        L_0x008f:
            boolean r5 = r3.W()     // Catch:{ SQLiteException -> 0x00bb }
            if (r5 == 0) goto L_0x0055
            long r5 = r3.X()     // Catch:{ SQLiteException -> 0x00bb }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00bb }
            goto L_0x0055
        L_0x009d:
            if (r1 == 0) goto L_0x00a2
            r1.close()
        L_0x00a2:
            return r2
        L_0x00a3:
            r2 = move-exception
            com.google.android.gms.measurement.internal.c4 r3 = r7.h()     // Catch:{ SQLiteException -> 0x00bb }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ SQLiteException -> 0x00bb }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.c4.w(r8)     // Catch:{ SQLiteException -> 0x00bb }
            r3.c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00bb }
            if (r1 == 0) goto L_0x00ba
            r1.close()
        L_0x00ba:
            return r0
        L_0x00bb:
            r8 = move-exception
            goto L_0x00c1
        L_0x00bd:
            r8 = move-exception
            goto L_0x00d6
        L_0x00bf:
            r8 = move-exception
            r1 = r0
        L_0x00c1:
            com.google.android.gms.measurement.internal.c4 r2 = r7.h()     // Catch:{ all -> 0x00d4 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x00d4 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x00d3
            r1.close()
        L_0x00d3:
            return r0
        L_0x00d4:
            r8 = move-exception
            r0 = r1
        L_0x00d6:
            if (r0 == 0) goto L_0x00db
            r0.close()
        L_0x00db:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.B0(java.lang.String):android.os.Bundle");
    }

    public final g C(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return B(j2, str, 1, false, false, z3, false, z5);
    }

    public final e C0(String str) {
        r.j(str);
        b();
        r();
        return e.b(H("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.o D(java.lang.String r26, java.lang.String r27) {
        /*
            r25 = this;
            r15 = r27
            com.google.android.gms.common.internal.r.f(r26)
            com.google.android.gms.common.internal.r.f(r27)
            r25.b()
            r25.r()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "lifetime_count"
            java.lang.String r2 = "current_bundle_count"
            java.lang.String r3 = "last_fire_timestamp"
            java.lang.String r4 = "last_bundled_timestamp"
            java.lang.String r5 = "last_bundled_day"
            java.lang.String r6 = "last_sampled_complex_event_id"
            java.lang.String r7 = "last_sampling_rate"
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "current_session_count"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r18 = 0
            android.database.sqlite.SQLiteDatabase r1 = r25.v()     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r2 = "events"
            r9 = 0
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r4 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r5[r9] = r26     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r10 = 1
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r1 != 0) goto L_0x005c
            if (r14 == 0) goto L_0x005b
            r14.close()
        L_0x005b:
            return r18
        L_0x005c:
            long r4 = r14.getLong(r9)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r6 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r11 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r0 = 3
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r2 = 0
            if (r1 == 0) goto L_0x0074
            r16 = r2
            goto L_0x007a
        L_0x0074:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r16 = r0
        L_0x007a:
            r0 = 4
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r1 == 0) goto L_0x0084
            r0 = r18
            goto L_0x008c
        L_0x0084:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
        L_0x008c:
            r1 = 5
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x0096
            r19 = r18
            goto L_0x00a0
        L_0x0096:
            long r19 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r1 = java.lang.Long.valueOf(r19)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r19 = r1
        L_0x00a0:
            r1 = 6
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x00aa
            r20 = r18
            goto L_0x00b4
        L_0x00aa:
            long r20 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r20 = r1
        L_0x00b4:
            r1 = 7
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 != 0) goto L_0x00d0
            long r21 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00cd }
            r23 = 1
            int r1 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x00c6
            r9 = 1
        L_0x00c6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x00cd }
            r21 = r1
            goto L_0x00d2
        L_0x00cd:
            r0 = move-exception
            goto L_0x012a
        L_0x00d0:
            r21 = r18
        L_0x00d2:
            r1 = 8
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x00dc
            r8 = r2
            goto L_0x00e1
        L_0x00dc:
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r8 = r1
        L_0x00e1:
            com.google.android.gms.measurement.internal.o r22 = new com.google.android.gms.measurement.internal.o     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r1 = r22
            r2 = r26
            r3 = r27
            r10 = r11
            r12 = r16
            r23 = r14
            r14 = r0
            r15 = r19
            r16 = r20
            r17 = r21
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            boolean r0 = r23.moveToNext()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            if (r0 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.c4 r0 = r25.h()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.c4.w(r26)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            r0.b(r1, r2)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
        L_0x010f:
            if (r23 == 0) goto L_0x0114
            r23.close()
        L_0x0114:
            return r22
        L_0x0115:
            r0 = move-exception
            goto L_0x011e
        L_0x0117:
            r0 = move-exception
            r14 = r23
            goto L_0x012a
        L_0x011b:
            r0 = move-exception
            r23 = r14
        L_0x011e:
            r18 = r23
            goto L_0x014e
        L_0x0121:
            r0 = move-exception
            r23 = r14
            goto L_0x012a
        L_0x0125:
            r0 = move-exception
            goto L_0x014e
        L_0x0127:
            r0 = move-exception
            r14 = r18
        L_0x012a:
            com.google.android.gms.measurement.internal.c4 r1 = r25.h()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ all -> 0x014b }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.c4.w(r26)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.a4 r4 = r25.d()     // Catch:{ all -> 0x014b }
            r5 = r27
            java.lang.String r4 = r4.v(r5)     // Catch:{ all -> 0x014b }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x014b }
            if (r14 == 0) goto L_0x014a
            r14.close()
        L_0x014a:
            return r18
        L_0x014b:
            r0 = move-exception
            r18 = r14
        L_0x014e:
            if (r18 == 0) goto L_0x0153
            r18.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.D(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.o");
    }

    /* access modifiers changed from: package-private */
    public final void D0() {
        int delete;
        b();
        r();
        if (h0()) {
            long a = i().h.a();
            long a2 = l().a();
            if (Math.abs(a2 - a) > u.y.a(null).longValue()) {
                i().h.b(a2);
                b();
                r();
                if (h0() && (delete = v().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(l().c()), String.valueOf(wa.J())})) > 0) {
                    h().M().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    public final long E0() {
        return z("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long F0() {
        return z("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String G(long r5) {
        /*
            r4 = this;
            r4.b()
            r4.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.v()     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.c4 r6 = r4.h()     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.gms.measurement.internal.e4 r6 = r6.M()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0044
        L_0x0040:
            r6 = move-exception
            goto L_0x0059
        L_0x0042:
            r6 = move-exception
            r5 = r0
        L_0x0044:
            com.google.android.gms.measurement.internal.c4 r1 = r4.h()     // Catch:{ all -> 0x0057 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0056
            r5.close()
        L_0x0056:
            return r0
        L_0x0057:
            r6 = move-exception
            r0 = r5
        L_0x0059:
            if (r0 == 0) goto L_0x005e
            r0.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.G(long):java.lang.String");
    }

    public final boolean G0() {
        return i0("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean H0() {
        return i0("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9 A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.ga> I(java.lang.String r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.r.f(r14)
            r13.b()
            r13.r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.v()     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x003e
            r2.close()
        L_0x003e:
            return r0
        L_0x003f:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0080 }
            r3 = 3
            java.lang.Object r10 = r13.F(r2, r3)     // Catch:{ SQLiteException -> 0x0080 }
            if (r10 != 0) goto L_0x006a
            com.google.android.gms.measurement.internal.c4 r3 = r13.h()     // Catch:{ SQLiteException -> 0x0080 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.c4.w(r14)     // Catch:{ SQLiteException -> 0x0080 }
            r3.b(r4, r5)     // Catch:{ SQLiteException -> 0x0080 }
            goto L_0x0074
        L_0x006a:
            com.google.android.gms.measurement.internal.ga r3 = new com.google.android.gms.measurement.internal.ga     // Catch:{ SQLiteException -> 0x0080 }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0080 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x0080 }
        L_0x0074:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x007f
            r2.close()
        L_0x007f:
            return r0
        L_0x0080:
            r0 = move-exception
            goto L_0x0086
        L_0x0082:
            r14 = move-exception
            goto L_0x00bb
        L_0x0084:
            r0 = move-exception
            r2 = r1
        L_0x0086:
            com.google.android.gms.measurement.internal.c4 r3 = r13.h()     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x00b9 }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.c4.w(r14)     // Catch:{ all -> 0x00b9 }
            r3.c(r4, r5, r0)     // Catch:{ all -> 0x00b9 }
            boolean r0 = defpackage.z31.a()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00b3
            com.google.android.gms.measurement.internal.wa r0 = r13.j()     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.N0     // Catch:{ all -> 0x00b9 }
            boolean r14 = r0.C(r14, r3)     // Catch:{ all -> 0x00b9 }
            if (r14 == 0) goto L_0x00b3
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x00b2
            r2.close()
        L_0x00b2:
            return r14
        L_0x00b3:
            if (r2 == 0) goto L_0x00b8
            r2.close()
        L_0x00b8:
            return r1
        L_0x00b9:
            r14 = move-exception
            r1 = r2
        L_0x00bb:
            if (r1 == 0) goto L_0x00c0
            r1.close()
        L_0x00c0:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.I(java.lang.String):java.util.List");
    }

    public final long I0() {
        Cursor cursor = null;
        try {
            cursor = v().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j2 = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j2;
        } catch (SQLiteException e2) {
            h().E().b("Error querying raw events", e2);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[LOOP:0: B:18:0x0054->B:42:0x00c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6 A[EDGE_INSN: B:56:0x00c6->B:43:0x00c6 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<defpackage.us0, java.lang.Long>> J(java.lang.String r13, int r14, int r15) {
        /*
            r12 = this;
            r12.b()
            r12.r()
            r0 = 1
            r1 = 0
            if (r14 <= 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            com.google.android.gms.common.internal.r.a(r2)
            if (r15 <= 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            com.google.android.gms.common.internal.r.a(r2)
            com.google.android.gms.common.internal.r.f(r13)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.v()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "data"
            java.lang.String r7 = "retry_count"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00ce }
            r7[r1] = r13     // Catch:{ SQLiteException -> 0x00ce }
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x00ce }
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00ce }
            boolean r14 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00ce }
            if (r14 != 0) goto L_0x004e
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00ce }
            if (r2 == 0) goto L_0x004d
            r2.close()
        L_0x004d:
            return r13
        L_0x004e:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ce }
            r14.<init>()     // Catch:{ SQLiteException -> 0x00ce }
            r3 = 0
        L_0x0054:
            long r4 = r2.getLong(r1)     // Catch:{ SQLiteException -> 0x00ce }
            byte[] r6 = r2.getBlob(r0)     // Catch:{ IOException -> 0x00ae }
            com.google.android.gms.measurement.internal.ba r7 = r12.k()     // Catch:{ IOException -> 0x00ae }
            byte[] r6 = r7.V(r6)     // Catch:{ IOException -> 0x00ae }
            boolean r7 = r14.isEmpty()     // Catch:{ SQLiteException -> 0x00ce }
            if (r7 != 0) goto L_0x006e
            int r7 = r6.length     // Catch:{ SQLiteException -> 0x00ce }
            int r7 = r7 + r3
            if (r7 > r15) goto L_0x00c6
        L_0x006e:
            us0$a r7 = defpackage.us0.O0()     // Catch:{ IOException -> 0x009b }
            com.google.android.gms.measurement.internal.ba.z(r7, r6)     // Catch:{ IOException -> 0x009b }
            us0$a r7 = (defpackage.us0.a) r7     // Catch:{ IOException -> 0x009b }
            r8 = 2
            boolean r9 = r2.isNull(r8)     // Catch:{ SQLiteException -> 0x00ce }
            if (r9 != 0) goto L_0x0085
            int r8 = r2.getInt(r8)     // Catch:{ SQLiteException -> 0x00ce }
            r7.y0(r8)     // Catch:{ SQLiteException -> 0x00ce }
        L_0x0085:
            int r6 = r6.length     // Catch:{ SQLiteException -> 0x00ce }
            int r3 = r3 + r6
            f01 r6 = r7.k()     // Catch:{ SQLiteException -> 0x00ce }
            sy0 r6 = (defpackage.sy0) r6     // Catch:{ SQLiteException -> 0x00ce }
            us0 r6 = (defpackage.us0) r6     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x00ce }
            android.util.Pair r4 = android.util.Pair.create(r6, r4)     // Catch:{ SQLiteException -> 0x00ce }
            r14.add(r4)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00be
        L_0x009b:
            r4 = move-exception
            com.google.android.gms.measurement.internal.c4 r5 = r12.h()     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.measurement.internal.e4 r5 = r5.E()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "Failed to merge queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.c4.w(r13)     // Catch:{ SQLiteException -> 0x00ce }
        L_0x00aa:
            r5.c(r6, r7, r4)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00be
        L_0x00ae:
            r4 = move-exception
            com.google.android.gms.measurement.internal.c4 r5 = r12.h()     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.measurement.internal.e4 r5 = r5.E()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "Failed to unzip queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.c4.w(r13)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00aa
        L_0x00be:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00ce }
            if (r4 == 0) goto L_0x00c6
            if (r3 <= r15) goto L_0x0054
        L_0x00c6:
            if (r2 == 0) goto L_0x00cb
            r2.close()
        L_0x00cb:
            return r14
        L_0x00cc:
            r13 = move-exception
            goto L_0x00ea
        L_0x00ce:
            r14 = move-exception
            com.google.android.gms.measurement.internal.c4 r15 = r12.h()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.e4 r15 = r15.E()     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "Error querying bundles. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.c4.w(r13)     // Catch:{ all -> 0x00cc }
            r15.c(r0, r13, r14)     // Catch:{ all -> 0x00cc }
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00e9
            r2.close()
        L_0x00e9:
            return r13
        L_0x00ea:
            if (r2 == 0) goto L_0x00ef
            r2.close()
        L_0x00ef:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.J(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
        r12 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        r12 = r20;
        r3 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013c, code lost:
        r9.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0128 A[Catch:{ all -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.ga> K(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            r20 = this;
            r8 = r21
            com.google.android.gms.common.internal.r.f(r21)
            r20.b()
            r20.r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            r10 = 3
            r1.<init>(r10)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            r1.add(r8)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            java.lang.String r3 = "app_id=?"
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            boolean r3 = android.text.TextUtils.isEmpty(r22)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            if (r3 != 0) goto L_0x0032
            r3 = r22
            r1.add(r3)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r4 = " and origin=?"
            r2.append(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            goto L_0x0034
        L_0x0032:
            r3 = r22
        L_0x0034:
            boolean r4 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            if (r4 != 0) goto L_0x004c
            java.lang.String r4 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            r1.add(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r4 = " and name glob ?"
            r2.append(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
        L_0x004c:
            int r4 = r1.size()     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.Object[] r1 = r1.toArray(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            r15 = r1
            java.lang.String[] r15 = (java.lang.String[]) r15     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            android.database.sqlite.SQLiteDatabase r11 = r20.v()     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r12 = "user_attributes"
            java.lang.String r1 = "name"
            java.lang.String r4 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r1, r4, r5, r6}     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r14 = r2.toString()     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "1001"
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            boolean r1 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            if (r1 != 0) goto L_0x0087
            if (r11 == 0) goto L_0x0086
            r11.close()
        L_0x0086:
            return r0
        L_0x0087:
            int r1 = r0.size()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r2) goto L_0x00a3
            com.google.android.gms.measurement.internal.c4 r1 = r20.h()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r1.b(r4, r2)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r12 = r20
            goto L_0x00e2
        L_0x00a3:
            r1 = 0
            java.lang.String r4 = r11.getString(r1)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r1 = 1
            long r5 = r11.getLong(r1)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r1 = 2
            r12 = r20
            java.lang.Object r7 = r12.F(r11, r1)     // Catch:{ SQLiteException -> 0x00ed }
            java.lang.String r13 = r11.getString(r10)     // Catch:{ SQLiteException -> 0x00ed }
            if (r7 != 0) goto L_0x00ce
            com.google.android.gms.measurement.internal.c4 r1 = r20.h()     // Catch:{ SQLiteException -> 0x00ea }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ SQLiteException -> 0x00ea }
            java.lang.String r2 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.c4.w(r21)     // Catch:{ SQLiteException -> 0x00ea }
            r14 = r23
            r1.d(r2, r3, r13, r14)     // Catch:{ SQLiteException -> 0x00ea }
            goto L_0x00dc
        L_0x00ce:
            r14 = r23
            com.google.android.gms.measurement.internal.ga r15 = new com.google.android.gms.measurement.internal.ga     // Catch:{ SQLiteException -> 0x00ea }
            r1 = r15
            r2 = r21
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x00ea }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00ea }
        L_0x00dc:
            boolean r1 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00ea }
            if (r1 != 0) goto L_0x00e8
        L_0x00e2:
            if (r11 == 0) goto L_0x00e7
            r11.close()
        L_0x00e7:
            return r0
        L_0x00e8:
            r3 = r13
            goto L_0x0087
        L_0x00ea:
            r0 = move-exception
            r3 = r13
            goto L_0x0105
        L_0x00ed:
            r0 = move-exception
            goto L_0x0105
        L_0x00ef:
            r0 = move-exception
            r12 = r20
            goto L_0x0139
        L_0x00f3:
            r0 = move-exception
            r12 = r20
            goto L_0x0105
        L_0x00f7:
            r0 = move-exception
            r12 = r20
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            r12 = r20
            goto L_0x013a
        L_0x00ff:
            r0 = move-exception
            r12 = r20
            r3 = r22
        L_0x0104:
            r11 = r9
        L_0x0105:
            com.google.android.gms.measurement.internal.c4 r1 = r20.h()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r21)     // Catch:{ all -> 0x0138 }
            r1.d(r2, r4, r3, r0)     // Catch:{ all -> 0x0138 }
            boolean r0 = defpackage.z31.a()     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0132
            com.google.android.gms.measurement.internal.wa r0 = r20.j()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.u.N0     // Catch:{ all -> 0x0138 }
            boolean r0 = r0.C(r8, r1)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0132
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0138 }
            if (r11 == 0) goto L_0x0131
            r11.close()
        L_0x0131:
            return r0
        L_0x0132:
            if (r11 == 0) goto L_0x0137
            r11.close()
        L_0x0137:
            return r9
        L_0x0138:
            r0 = move-exception
        L_0x0139:
            r9 = r11
        L_0x013a:
            if (r9 == 0) goto L_0x013f
            r9.close()
        L_0x013f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.K(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final List<ua> L(String str, String[] strArr) {
        b();
        r();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = v().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object F = F(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j2 = cursor.getLong(6);
                    long j3 = cursor.getLong(8);
                    long j4 = cursor.getLong(10);
                    boolean z2 = z;
                    ua uaVar = r3;
                    ua uaVar2 = new ua(string, string2, new ea(string3, j4, F, string2), j3, z2, string4, (s) k().w(cursor.getBlob(7), s.CREATOR), j2, (s) k().w(cursor.getBlob(9), s.CREATOR), cursor.getLong(11), (s) k().w(cursor.getBlob(12), s.CREATOR));
                    arrayList.add(uaVar);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    h().E().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e2) {
            h().E().b("Error querying conditional user property value", e2);
            List<ua> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void N(o oVar) {
        r.j(oVar);
        b();
        r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", oVar.a);
        contentValues.put("name", oVar.b);
        contentValues.put("lifetime_count", Long.valueOf(oVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(oVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(oVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(oVar.g));
        contentValues.put("last_bundled_day", oVar.h);
        contentValues.put("last_sampled_complex_event_id", oVar.i);
        contentValues.put("last_sampling_rate", oVar.j);
        contentValues.put("current_session_count", Long.valueOf(oVar.e));
        Boolean bool = oVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (v().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                h().E().b("Failed to insert/update event aggregates (got -1). appId", c4.w(oVar.a));
            }
        } catch (SQLiteException e2) {
            h().E().c("Error storing event aggregates. appId", c4.w(oVar.a), e2);
        }
    }

    public final void O(f4 f4Var) {
        r.j(f4Var);
        b();
        r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f4Var.t());
        contentValues.put("app_instance_id", f4Var.x());
        contentValues.put("gmp_app_id", f4Var.A());
        contentValues.put("resettable_device_id_hash", f4Var.J());
        contentValues.put("last_bundle_index", Long.valueOf(f4Var.f0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(f4Var.P()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(f4Var.R()));
        contentValues.put("app_version", f4Var.T());
        contentValues.put("app_store", f4Var.X());
        contentValues.put("gmp_version", Long.valueOf(f4Var.Z()));
        contentValues.put("dev_cert_hash", Long.valueOf(f4Var.b0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(f4Var.e0()));
        contentValues.put("day", Long.valueOf(f4Var.j0()));
        contentValues.put("daily_public_events_count", Long.valueOf(f4Var.k0()));
        contentValues.put("daily_events_count", Long.valueOf(f4Var.l0()));
        contentValues.put("daily_conversions_count", Long.valueOf(f4Var.m0()));
        contentValues.put("config_fetched_time", Long.valueOf(f4Var.g0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(f4Var.h0()));
        contentValues.put("app_version_int", Long.valueOf(f4Var.V()));
        contentValues.put("firebase_instance_id", f4Var.M());
        contentValues.put("daily_error_events_count", Long.valueOf(f4Var.h()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(f4Var.g()));
        contentValues.put("health_monitor_sample", f4Var.i());
        contentValues.put("android_id", Long.valueOf(f4Var.k()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(f4Var.l()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(f4Var.m()));
        contentValues.put("admob_app_id", f4Var.D());
        contentValues.put("dynamite_version", Long.valueOf(f4Var.d0()));
        if (f4Var.o() != null) {
            if (f4Var.o().size() == 0) {
                h().H().b("Safelisted events should not be an empty list. appId", f4Var.t());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", f4Var.o()));
            }
        }
        if (s41.a() && j().C(f4Var.t(), u.k0)) {
            contentValues.put("ga_app_id", f4Var.G());
        }
        try {
            SQLiteDatabase v = v();
            if (((long) v.update("apps", contentValues, "app_id = ?", new String[]{f4Var.t()})) == 0 && v.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                h().E().b("Failed to insert/update app (got -1). appId", c4.w(f4Var.t()));
            }
        } catch (SQLiteException e2) {
            h().E().c("Error storing app. appId", c4.w(f4Var.t()), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void P(String str, List<yr0> list) {
        boolean z;
        e4 H;
        String str2;
        Object w;
        Integer valueOf;
        boolean z2;
        String str3 = str;
        List<yr0> list2 = list;
        r.j(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            yr0.a aVar = (yr0.a) list2.get(i2).w();
            if (aVar.B() != 0) {
                for (int i3 = 0; i3 < aVar.B(); i3++) {
                    zr0.a aVar2 = (zr0.a) aVar.C(i3).w();
                    zr0.a aVar3 = (zr0.a) ((sy0.b) aVar2.clone());
                    String b = e6.b(aVar2.A());
                    if (b != null) {
                        aVar3.x(b);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i4 = 0; i4 < aVar2.B(); i4++) {
                        as0 y = aVar2.y(i4);
                        String a = i6.a(y.L());
                        if (a != null) {
                            as0.a aVar4 = (as0.a) y.w();
                            aVar4.w(a);
                            aVar3.w(i4, (as0) ((sy0) aVar4.k()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        aVar.x(i3, aVar3);
                        list2.set(i2, (yr0) ((sy0) aVar.k()));
                    }
                }
            }
            if (aVar.w() != 0) {
                for (int i5 = 0; i5 < aVar.w(); i5++) {
                    cs0 A = aVar.A(i5);
                    String a2 = h6.a(A.F());
                    if (a2 != null) {
                        cs0.a aVar5 = (cs0.a) A.w();
                        aVar5.w(a2);
                        aVar.y(i5, aVar5);
                        list2.set(i2, (yr0) ((sy0) aVar.k()));
                    }
                }
            }
        }
        r();
        b();
        r.f(str);
        r.j(list);
        SQLiteDatabase v = v();
        v.beginTransaction();
        try {
            r();
            b();
            r.f(str);
            SQLiteDatabase v2 = v();
            v2.delete("property_filters", "app_id=?", new String[]{str3});
            v2.delete("event_filters", "app_id=?", new String[]{str3});
            for (yr0 next : list) {
                r();
                b();
                r.f(str);
                r.j(next);
                if (next.G()) {
                    int H2 = next.H();
                    Iterator<zr0> it = next.M().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().G()) {
                                H = h().H();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                w = c4.w(str);
                                valueOf = Integer.valueOf(H2);
                                break;
                            }
                        } else {
                            for (cs0 C : next.K()) {
                                if (!C.C()) {
                                    H = h().H();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    w = c4.w(str);
                                    valueOf = Integer.valueOf(H2);
                                }
                            }
                            Iterator<zr0> it2 = next.M().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!V(str3, H2, it2.next())) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                Iterator<cs0> it3 = next.K().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (!W(str3, H2, it3.next())) {
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                r();
                                b();
                                r.f(str);
                                SQLiteDatabase v3 = v();
                                v3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str3, String.valueOf(H2)});
                                v3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str3, String.valueOf(H2)});
                            }
                        }
                    }
                    H.c(str2, w, valueOf);
                    break;
                }
                h().H().b("Audience with no ID. appId", c4.w(str));
            }
            ArrayList arrayList = new ArrayList();
            for (yr0 next2 : list) {
                arrayList.add(next2.G() ? Integer.valueOf(next2.H()) : null);
            }
            m0(str3, arrayList);
            v.setTransactionSuccessful();
        } finally {
            v.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    public final void Q(List<Long> list) {
        b();
        r();
        r.j(list);
        r.l(list.size());
        if (h0()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (i0(sb3.toString(), (String[]) null) > 0) {
                h().H().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase v = v();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                v.execSQL(sb4.toString());
            } catch (SQLiteException e2) {
                h().E().b("Error incrementing retry count. error", e2);
            }
        }
    }

    public final boolean R(us0 us0, boolean z) {
        e4 E;
        Object w;
        String str;
        b();
        r();
        r.j(us0);
        r.f(us0.T2());
        r.m(us0.s2());
        D0();
        long c = l().c();
        if (us0.t2() < c - wa.J() || us0.t2() > wa.J() + c) {
            h().H().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", c4.w(us0.T2()), Long.valueOf(c), Long.valueOf(us0.t2()));
        }
        try {
            byte[] W = k().W(us0.h());
            h().M().b("Saving bundle, size", Integer.valueOf(W.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", us0.T2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(us0.t2()));
            contentValues.put("data", W);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (us0.v0()) {
                contentValues.put("retry_count", Integer.valueOf(us0.H0()));
            }
            try {
                if (v().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                h().E().b("Failed to insert bundle (got -1). appId", c4.w(us0.T2()));
                return false;
            } catch (SQLiteException e2) {
                e = e2;
                E = h().E();
                w = c4.w(us0.T2());
                str = "Error storing bundle. appId";
                E.c(str, w, e);
                return false;
            }
        } catch (IOException e3) {
            e = e3;
            E = h().E();
            w = c4.w(us0.T2());
            str = "Data loss. Failed to serialize bundle. appId";
            E.c(str, w, e);
            return false;
        }
    }

    public final boolean S(l lVar, long j2, boolean z) {
        b();
        r();
        r.j(lVar);
        r.f(lVar.a);
        byte[] h2 = k().x(lVar).h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", lVar.a);
        contentValues.put("name", lVar.b);
        contentValues.put("timestamp", Long.valueOf(lVar.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", h2);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (v().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            h().E().b("Failed to insert raw event (got -1). appId", c4.w(lVar.a));
            return false;
        } catch (SQLiteException e2) {
            h().E().c("Error storing raw event. appId", c4.w(lVar.a), e2);
            return false;
        }
    }

    public final boolean T(ga gaVar) {
        r.j(gaVar);
        b();
        r();
        if (o0(gaVar.a, gaVar.c) == null) {
            if (fa.d0(gaVar.c)) {
                if (i0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{gaVar.a}) >= ((long) j().y(gaVar.a))) {
                    return false;
                }
            } else if (!"_npa".equals(gaVar.c)) {
                if (i0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{gaVar.a, gaVar.b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", gaVar.a);
        contentValues.put("origin", gaVar.b);
        contentValues.put("name", gaVar.c);
        contentValues.put("set_timestamp", Long.valueOf(gaVar.d));
        M(contentValues, "value", gaVar.e);
        try {
            if (v().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                h().E().b("Failed to insert/update user property (got -1). appId", c4.w(gaVar.a));
            }
        } catch (SQLiteException e2) {
            h().E().c("Error storing user property. appId", c4.w(gaVar.a), e2);
        }
        return true;
    }

    public final boolean U(ua uaVar) {
        r.j(uaVar);
        b();
        r();
        if (o0(uaVar.e, uaVar.g.f) == null) {
            if (i0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{uaVar.e}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", uaVar.e);
        contentValues.put("origin", uaVar.f);
        contentValues.put("name", uaVar.g.f);
        M(contentValues, "value", uaVar.g.i());
        contentValues.put("active", Boolean.valueOf(uaVar.i));
        contentValues.put("trigger_event_name", uaVar.j);
        contentValues.put("trigger_timeout", Long.valueOf(uaVar.l));
        g();
        contentValues.put("timed_out_event", fa.o0(uaVar.k));
        contentValues.put("creation_timestamp", Long.valueOf(uaVar.h));
        g();
        contentValues.put("triggered_event", fa.o0(uaVar.m));
        contentValues.put("triggered_timestamp", Long.valueOf(uaVar.g.g));
        contentValues.put("time_to_live", Long.valueOf(uaVar.n));
        g();
        contentValues.put("expired_event", fa.o0(uaVar.o));
        try {
            if (v().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                h().E().b("Failed to insert/update conditional user property (got -1)", c4.w(uaVar.e));
            }
        } catch (SQLiteException e2) {
            h().E().c("Error storing conditional user property", c4.w(uaVar.e), e2);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean X(String str, Bundle bundle) {
        b();
        r();
        byte[] h2 = k().x(new l(this.a, "", str, "dep", 0, 0, bundle)).h();
        h().M().c("Saving default event parameters, appId, data size", d().v(str), Integer.valueOf(h2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", h2);
        try {
            if (v().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            h().E().b("Failed to insert default event parameters (got -1). appId", c4.w(str));
            return false;
        } catch (SQLiteException e2) {
            h().E().c("Error storing default event parameters. appId", c4.w(str), e2);
            return false;
        }
    }

    public final boolean Y(String str, Long l2, long j2, qs0 qs0) {
        b();
        r();
        r.j(qs0);
        r.f(str);
        r.j(l2);
        byte[] h2 = qs0.h();
        h().M().c("Saving complex main event, appId, data size", d().v(str), Integer.valueOf(h2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", h2);
        try {
            if (v().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            h().E().b("Failed to insert complex main event (got -1). appId", c4.w(str));
            return false;
        } catch (SQLiteException e2) {
            h().E().c("Error storing complex main event. appId", c4.w(str), e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x011b A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011f A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0159 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0172 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0187 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a3 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a4 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b3 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e9 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.f4 j0(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r35
            com.google.android.gms.common.internal.r.f(r35)
            r34.b()
            r34.r()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r34.v()     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "ssaid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0206, all -> 0x0202 }
            if (r4 != 0) goto L_0x006b
            if (r3 == 0) goto L_0x006a
            r3.close()
        L_0x006a:
            return r2
        L_0x006b:
            com.google.android.gms.measurement.internal.f4 r4 = new com.google.android.gms.measurement.internal.f4     // Catch:{ SQLiteException -> 0x0206, all -> 0x0202 }
            r5 = r34
            com.google.android.gms.measurement.internal.x9 r6 = r5.b     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.h5 r6 = r6.k0()     // Catch:{ SQLiteException -> 0x0200 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0200 }
            r4.c(r6)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.r(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.C(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.H(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.a(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.q(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.I(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.L(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.y(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.B(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r7 != 0) goto L_0x00d9
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r6 = 0
            goto L_0x00da
        L_0x00d9:
            r6 = 1
        L_0x00da:
            r4.e(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.Q(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.S(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.U(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.W(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.K(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.N(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r7 == 0) goto L_0x011f
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0124
        L_0x011f:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0200 }
        L_0x0124:
            r4.u(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.F(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.a0(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.Y(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.O(r6)     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.wa r6 = r34.j()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.u.G0     // Catch:{ SQLiteException -> 0x0200 }
            boolean r6 = r6.s(r7)     // Catch:{ SQLiteException -> 0x0200 }
            r7 = 0
            if (r6 != 0) goto L_0x016a
            r6 = 22
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 == 0) goto L_0x0163
            r9 = r7
            goto L_0x0167
        L_0x0163:
            long r9 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x0167:
            r4.c0(r9)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x016a:
            r6 = 23
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 != 0) goto L_0x017b
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r6 = 0
            goto L_0x017c
        L_0x017b:
            r6 = 1
        L_0x017c:
            r4.s(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 24
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 != 0) goto L_0x018f
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x018e
            goto L_0x018f
        L_0x018e:
            r0 = 0
        L_0x018f:
            r4.w(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.v(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 26
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x01a4
            goto L_0x01a8
        L_0x01a4:
            long r7 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01a8:
            r4.E(r7)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 27
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 != 0) goto L_0x01c5
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x0200 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.d(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01c5:
            boolean r0 = defpackage.s41.a()     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01e0
            com.google.android.gms.measurement.internal.wa r0 = r34.j()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.u.k0     // Catch:{ SQLiteException -> 0x0200 }
            boolean r0 = r0.C(r1, r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01e0
            r0 = 28
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.z(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01e0:
            r4.p()     // Catch:{ SQLiteException -> 0x0200 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01fa
            com.google.android.gms.measurement.internal.c4 r0 = r34.h()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.c4.w(r35)     // Catch:{ SQLiteException -> 0x0200 }
            r0.b(r6, r7)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01fa:
            if (r3 == 0) goto L_0x01ff
            r3.close()
        L_0x01ff:
            return r4
        L_0x0200:
            r0 = move-exception
            goto L_0x0212
        L_0x0202:
            r0 = move-exception
            r5 = r34
            goto L_0x022a
        L_0x0206:
            r0 = move-exception
            r5 = r34
            goto L_0x0212
        L_0x020a:
            r0 = move-exception
            r5 = r34
            goto L_0x022b
        L_0x020e:
            r0 = move-exception
            r5 = r34
            r3 = r2
        L_0x0212:
            com.google.android.gms.measurement.internal.c4 r4 = r34.h()     // Catch:{ all -> 0x0229 }
            com.google.android.gms.measurement.internal.e4 r4 = r4.E()     // Catch:{ all -> 0x0229 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.c4.w(r35)     // Catch:{ all -> 0x0229 }
            r4.c(r6, r1, r0)     // Catch:{ all -> 0x0229 }
            if (r3 == 0) goto L_0x0228
            r3.close()
        L_0x0228:
            return r2
        L_0x0229:
            r0 = move-exception
        L_0x022a:
            r2 = r3
        L_0x022b:
            if (r2 == 0) goto L_0x0230
            r2.close()
        L_0x0230:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.j0(java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    public final List<ua> k0(String str, String str2, String str3) {
        r.f(str);
        b();
        r();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return L(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void l0(String str, String str2) {
        r.f(str);
        r.f(str2);
        b();
        r();
        try {
            v().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            h().E().d("Error deleting user property. appId", c4.w(str), d().z(str2), e2);
        }
    }

    public final long n0(String str) {
        r.f(str);
        b();
        r();
        try {
            return (long) v().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, j().u(str, u.p))))});
        } catch (SQLiteException e2) {
            h().E().c("Error deleting over the limit events. appId", c4.w(str), e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.ga o0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.r.f(r19)
            com.google.android.gms.common.internal.r.f(r20)
            r18.b()
            r18.r()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.v()     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            if (r3 != 0) goto L_0x003f
            if (r10 == 0) goto L_0x003e
            r10.close()
        L_0x003e:
            return r9
        L_0x003f:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            r11 = r18
            java.lang.Object r7 = r11.F(r10, r2)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.ga r0 = new com.google.android.gms.measurement.internal.ga     // Catch:{ SQLiteException -> 0x0074 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.measurement.internal.c4 r1 = r18.h()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.c4.w(r19)     // Catch:{ SQLiteException -> 0x0074 }
            r1.b(r2, r3)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x006e:
            if (r10 == 0) goto L_0x0073
            r10.close()
        L_0x0073:
            return r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0086
        L_0x0076:
            r0 = move-exception
            r11 = r18
            goto L_0x00a6
        L_0x007a:
            r0 = move-exception
            r11 = r18
            goto L_0x0086
        L_0x007e:
            r0 = move-exception
            r11 = r18
            goto L_0x00a7
        L_0x0082:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0086:
            com.google.android.gms.measurement.internal.c4 r1 = r18.h()     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.c4.w(r19)     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.measurement.internal.a4 r4 = r18.d()     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = r4.z(r8)     // Catch:{ all -> 0x00a5 }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x00a5 }
            if (r10 == 0) goto L_0x00a4
            r10.close()
        L_0x00a4:
            return r9
        L_0x00a5:
            r0 = move-exception
        L_0x00a6:
            r9 = r10
        L_0x00a7:
            if (r9 == 0) goto L_0x00ac
            r9.close()
        L_0x00ac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.o0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ga");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.ua p0(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            com.google.android.gms.common.internal.r.f(r30)
            com.google.android.gms.common.internal.r.f(r31)
            r29.b()
            r29.r()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.v()     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            if (r3 != 0) goto L_0x004e
            if (r9 == 0) goto L_0x004d
            r9.close()
        L_0x004d:
            return r8
        L_0x004e:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            r10 = r29
            java.lang.Object r5 = r10.F(r9, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r0 == 0) goto L_0x0061
            r20 = 1
            goto L_0x0063
        L_0x0061:
            r20 = 0
        L_0x0063:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.ba r0 = r29.k()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.s> r2 = com.google.android.gms.measurement.internal.s.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.w(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r22 = r0
            com.google.android.gms.measurement.internal.s r22 = (com.google.android.gms.measurement.internal.s) r22     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.ba r0 = r29.k()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.s> r2 = com.google.android.gms.measurement.internal.s.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.w(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r25 = r0
            com.google.android.gms.measurement.internal.s r25 = (com.google.android.gms.measurement.internal.s) r25     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.ba r0 = r29.k()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.s> r2 = com.google.android.gms.measurement.internal.s.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.w(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r28 = r0
            com.google.android.gms.measurement.internal.s r28 = (com.google.android.gms.measurement.internal.s) r28     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.ea r17 = new com.google.android.gms.measurement.internal.ea     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.ua r0 = new com.google.android.gms.measurement.internal.ua     // Catch:{ SQLiteException -> 0x00f0 }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.c4 r1 = r29.h()     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.c4.w(r30)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.a4 r4 = r29.d()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r4 = r4.z(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            r1.c(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00ea:
            if (r9 == 0) goto L_0x00ef
            r9.close()
        L_0x00ef:
            return r0
        L_0x00f0:
            r0 = move-exception
            goto L_0x0102
        L_0x00f2:
            r0 = move-exception
            r10 = r29
            goto L_0x0122
        L_0x00f6:
            r0 = move-exception
            r10 = r29
            goto L_0x0102
        L_0x00fa:
            r0 = move-exception
            r10 = r29
            goto L_0x0123
        L_0x00fe:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x0102:
            com.google.android.gms.measurement.internal.c4 r1 = r29.h()     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.c4.w(r30)     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.a4 r4 = r29.d()     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = r4.z(r7)     // Catch:{ all -> 0x0121 }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x0121 }
            if (r9 == 0) goto L_0x0120
            r9.close()
        L_0x0120:
            return r8
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            r8 = r9
        L_0x0123:
            if (r8 == 0) goto L_0x0128
            r8.close()
        L_0x0128:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.p0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ua");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] q0(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.r.f(r11)
            r10.b()
            r10.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.v()     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            r9 = 0
            r5[r9] = r11     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0052 }
            if (r2 != 0) goto L_0x0031
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            return r0
        L_0x0031:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0052 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0052 }
            if (r3 == 0) goto L_0x004c
            com.google.android.gms.measurement.internal.c4 r3 = r10.h()     // Catch:{ SQLiteException -> 0x0052 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ SQLiteException -> 0x0052 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ SQLiteException -> 0x0052 }
            r3.b(r4, r5)     // Catch:{ SQLiteException -> 0x0052 }
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            return r2
        L_0x0052:
            r2 = move-exception
            goto L_0x0058
        L_0x0054:
            r11 = move-exception
            goto L_0x0071
        L_0x0056:
            r2 = move-exception
            r1 = r0
        L_0x0058:
            com.google.android.gms.measurement.internal.c4 r3 = r10.h()     // Catch:{ all -> 0x006f }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x006f }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ all -> 0x006f }
            r3.c(r4, r11, r2)     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x006e
            r1.close()
        L_0x006e:
            return r0
        L_0x006f:
            r11 = move-exception
            r0 = r1
        L_0x0071:
            if (r0 == 0) goto L_0x0076
            r0.close()
        L_0x0076:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.q0(java.lang.String):byte[]");
    }

    public final int r0(String str, String str2) {
        r.f(str);
        r.f(str2);
        b();
        r();
        try {
            return v().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            h().E().d("Error deleting conditional property", c4.w(str), d().z(str2), e2);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<zr0>> s0(String str) {
        r.f(str);
        b0 b0Var = new b0();
        Cursor cursor = null;
        try {
            cursor = v().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<zr0>> emptyMap = Collections.emptyMap();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyMap;
            }
            do {
                byte[] blob = cursor.getBlob(1);
                try {
                    zr0.a S = zr0.S();
                    ba.z(S, blob);
                    zr0 zr0 = (zr0) ((sy0) S.k());
                    if (zr0.M()) {
                        int i2 = cursor.getInt(0);
                        List list = (List) b0Var.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            b0Var.put(Integer.valueOf(i2), list);
                        }
                        list.add(zr0);
                    }
                } catch (IOException e2) {
                    h().E().c("Failed to merge filter. appId", c4.w(str), e2);
                }
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            return b0Var;
        } catch (SQLiteException e3) {
            h().E().c("Database error querying filters. appId", c4.w(str), e3);
            Map<Integer, List<zr0>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    public final void t0() {
        r();
        v().beginTransaction();
    }

    public final void u() {
        r();
        v().setTransactionSuccessful();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> u0(java.lang.String r8) {
        /*
            r7 = this;
            r7.r()
            r7.b()
            com.google.android.gms.common.internal.r.f(r8)
            b0 r0 = new b0
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.v()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            r5 = 0
            r4[r5] = r8     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            r6 = 1
            r4[r6] = r8     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0065 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            return r8
        L_0x0032:
            int r3 = r1.getInt(r5)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x0065 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x0065 }
            if (r4 != 0) goto L_0x004e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0065 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x0065 }
        L_0x004e:
            int r3 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x0065 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            if (r1 == 0) goto L_0x0064
            r1.close()
        L_0x0064:
            return r0
        L_0x0065:
            r0 = move-exception
            goto L_0x006b
        L_0x0067:
            r8 = move-exception
            goto L_0x00a0
        L_0x0069:
            r0 = move-exception
            r1 = r2
        L_0x006b:
            com.google.android.gms.measurement.internal.c4 r3 = r7.h()     // Catch:{ all -> 0x009e }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x009e }
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.c4.w(r8)     // Catch:{ all -> 0x009e }
            r3.c(r4, r5, r0)     // Catch:{ all -> 0x009e }
            boolean r0 = defpackage.z31.a()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0098
            com.google.android.gms.measurement.internal.wa r0 = r7.j()     // Catch:{ all -> 0x009e }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.N0     // Catch:{ all -> 0x009e }
            boolean r8 = r0.C(r8, r3)     // Catch:{ all -> 0x009e }
            if (r8 == 0) goto L_0x0098
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0097
            r1.close()
        L_0x0097:
            return r8
        L_0x0098:
            if (r1 == 0) goto L_0x009d
            r1.close()
        L_0x009d:
            return r2
        L_0x009e:
            r8 = move-exception
            r2 = r1
        L_0x00a0:
            if (r2 == 0) goto L_0x00a5
            r2.close()
        L_0x00a5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.u0(java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase v() {
        b();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e2) {
            h().H().b("Error opening database", e2);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<defpackage.zr0>> v0(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.r()
            r12.b()
            com.google.android.gms.common.internal.r.f(r13)
            com.google.android.gms.common.internal.r.f(r14)
            b0 r0 = new b0
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.v()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            zr0$a r2 = defpackage.zr0.S()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.measurement.internal.ba.z(r2, r1)     // Catch:{ IOException -> 0x0077 }
            zr0$a r2 = (defpackage.zr0.a) r2     // Catch:{ IOException -> 0x0077 }
            f01 r1 = r2.k()     // Catch:{ IOException -> 0x0077 }
            sy0 r1 = (defpackage.sy0) r1     // Catch:{ IOException -> 0x0077 }
            zr0 r1 = (defpackage.zr0) r1     // Catch:{ IOException -> 0x0077 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0073
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0073:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0077:
            r1 = move-exception
            com.google.android.gms.measurement.internal.c4 r2 = r12.h()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.c(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009b
        L_0x0097:
            r13 = move-exception
            goto L_0x00d0
        L_0x0099:
            r0 = move-exception
            r14 = r9
        L_0x009b:
            com.google.android.gms.measurement.internal.c4 r1 = r12.h()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.c4.w(r13)     // Catch:{ all -> 0x00ce }
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x00ce }
            boolean r0 = defpackage.z31.a()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.wa r0 = r12.j()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.u.N0     // Catch:{ all -> 0x00ce }
            boolean r13 = r0.C(r13, r1)     // Catch:{ all -> 0x00ce }
            if (r13 == 0) goto L_0x00c8
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00ce }
            if (r14 == 0) goto L_0x00c7
            r14.close()
        L_0x00c7:
            return r13
        L_0x00c8:
            if (r14 == 0) goto L_0x00cd
            r14.close()
        L_0x00cd:
            return r9
        L_0x00ce:
            r13 = move-exception
            r9 = r14
        L_0x00d0:
            if (r9 == 0) goto L_0x00d5
            r9.close()
        L_0x00d5:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.v0(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String w() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.v()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.measurement.internal.c4 r3 = r6.h()     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.w():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c0 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, defpackage.ws0> w0(java.lang.String r12) {
        /*
            r11 = this;
            r11.r()
            r11.b()
            com.google.android.gms.common.internal.r.f(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.v()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            r10 = 0
            r4[r10] = r12     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 != 0) goto L_0x004f
            boolean r1 = defpackage.z31.a()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 == 0) goto L_0x0049
            com.google.android.gms.measurement.internal.wa r1 = r11.j()     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.N0     // Catch:{ SQLiteException -> 0x0097 }
            boolean r1 = r1.C(r12, r2)     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 == 0) goto L_0x0049
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0097 }
            if (r0 == 0) goto L_0x0048
            r0.close()
        L_0x0048:
            return r12
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()
        L_0x004e:
            return r8
        L_0x004f:
            b0 r1 = new b0     // Catch:{ SQLiteException -> 0x0097 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x0097 }
        L_0x0054:
            int r2 = r0.getInt(r10)     // Catch:{ SQLiteException -> 0x0097 }
            byte[] r3 = r0.getBlob(r9)     // Catch:{ SQLiteException -> 0x0097 }
            ws0$a r4 = defpackage.ws0.a0()     // Catch:{ IOException -> 0x0075 }
            com.google.android.gms.measurement.internal.ba.z(r4, r3)     // Catch:{ IOException -> 0x0075 }
            ws0$a r4 = (defpackage.ws0.a) r4     // Catch:{ IOException -> 0x0075 }
            f01 r3 = r4.k()     // Catch:{ IOException -> 0x0075 }
            sy0 r3 = (defpackage.sy0) r3     // Catch:{ IOException -> 0x0075 }
            ws0 r3 = (defpackage.ws0) r3     // Catch:{ IOException -> 0x0075 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0097 }
            r1.put(r2, r3)     // Catch:{ SQLiteException -> 0x0097 }
            goto L_0x008b
        L_0x0075:
            r3 = move-exception
            com.google.android.gms.measurement.internal.c4 r4 = r11.h()     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.measurement.internal.e4 r4 = r4.E()     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.c4.w(r12)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0097 }
            r4.d(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x0097 }
        L_0x008b:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x0097 }
            if (r2 != 0) goto L_0x0054
            if (r0 == 0) goto L_0x0096
            r0.close()
        L_0x0096:
            return r1
        L_0x0097:
            r1 = move-exception
            goto L_0x009d
        L_0x0099:
            r12 = move-exception
            goto L_0x00d2
        L_0x009b:
            r1 = move-exception
            r0 = r8
        L_0x009d:
            com.google.android.gms.measurement.internal.c4 r2 = r11.h()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r12)     // Catch:{ all -> 0x00d0 }
            r2.c(r3, r4, r1)     // Catch:{ all -> 0x00d0 }
            boolean r1 = defpackage.z31.a()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00ca
            com.google.android.gms.measurement.internal.wa r1 = r11.j()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.N0     // Catch:{ all -> 0x00d0 }
            boolean r12 = r1.C(r12, r2)     // Catch:{ all -> 0x00d0 }
            if (r12 == 0) goto L_0x00ca
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00c9
            r0.close()
        L_0x00c9:
            return r12
        L_0x00ca:
            if (r0 == 0) goto L_0x00cf
            r0.close()
        L_0x00cf:
            return r8
        L_0x00d0:
            r12 = move-exception
            r8 = r0
        L_0x00d2:
            if (r8 == 0) goto L_0x00d7
            r8.close()
        L_0x00d7:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.w0(java.lang.String):java.util.Map");
    }

    public final boolean x() {
        return i0("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<defpackage.cs0>> x0(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.r()
            r12.b()
            com.google.android.gms.common.internal.r.f(r13)
            com.google.android.gms.common.internal.r.f(r14)
            b0 r0 = new b0
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.v()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            cs0$a r2 = defpackage.cs0.M()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.measurement.internal.ba.z(r2, r1)     // Catch:{ IOException -> 0x0077 }
            cs0$a r2 = (defpackage.cs0.a) r2     // Catch:{ IOException -> 0x0077 }
            f01 r1 = r2.k()     // Catch:{ IOException -> 0x0077 }
            sy0 r1 = (defpackage.sy0) r1     // Catch:{ IOException -> 0x0077 }
            cs0 r1 = (defpackage.cs0) r1     // Catch:{ IOException -> 0x0077 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0073
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0073:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0077:
            r1 = move-exception
            com.google.android.gms.measurement.internal.c4 r2 = r12.h()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.c(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009b
        L_0x0097:
            r13 = move-exception
            goto L_0x00d0
        L_0x0099:
            r0 = move-exception
            r14 = r9
        L_0x009b:
            com.google.android.gms.measurement.internal.c4 r1 = r12.h()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.c4.w(r13)     // Catch:{ all -> 0x00ce }
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x00ce }
            boolean r0 = defpackage.z31.a()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.wa r0 = r12.j()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.u.N0     // Catch:{ all -> 0x00ce }
            boolean r13 = r0.C(r13, r1)     // Catch:{ all -> 0x00ce }
            if (r13 == 0) goto L_0x00c8
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00ce }
            if (r14 == 0) goto L_0x00c7
            r14.close()
        L_0x00c7:
            return r13
        L_0x00c8:
            if (r14 == 0) goto L_0x00cd
            r14.close()
        L_0x00cd:
            return r9
        L_0x00ce:
            r13 = move-exception
            r9 = r14
        L_0x00d0:
            if (r9 == 0) goto L_0x00d5
            r9.close()
        L_0x00d5:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.x0(java.lang.String, java.lang.String):java.util.Map");
    }

    public final long y(us0 us0) {
        b();
        r();
        r.j(us0);
        r.f(us0.T2());
        byte[] h2 = us0.h();
        long v = k().v(h2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", us0.T2());
        contentValues.put("metadata_fingerprint", Long.valueOf(v));
        contentValues.put("metadata", h2);
        try {
            v().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return v;
        } catch (SQLiteException e2) {
            h().E().c("Error storing raw event metadata. appId", c4.w(us0.T2()), e2);
            throw e2;
        }
    }

    public final void y0() {
        r();
        v().endTransaction();
    }

    public final long z0(String str) {
        r.f(str);
        return z("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }
}
