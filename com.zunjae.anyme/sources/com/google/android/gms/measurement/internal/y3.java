package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

public final class y3 extends f5 {
    private final x3 c = new x3(this, n(), "google_app_measurement_local.db");
    private boolean d;

    y3(h5 h5Var) {
        super(h5Var);
    }

    private static long B(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, (String) null, (String) null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor == null) {
                return -1;
            }
            cursor.close();
            return -1;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c1 A[SYNTHETIC, Splitter:B:47:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0115 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0115 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0115 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean D(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.b()
            boolean r0 = r1.d
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0023:
            if (r5 >= r4) goto L_0x0127
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.K()     // Catch:{ SQLiteFullException -> 0x00fb, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x00bd, all -> 0x00ba }
            if (r9 != 0) goto L_0x0035
            r1.d = r8     // Catch:{ SQLiteFullException -> 0x00b8, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b4 }
            if (r9 == 0) goto L_0x0034
            r9.close()
        L_0x0034:
            return r2
        L_0x0035:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00b8, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b4 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00b8, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b4 }
            if (r12 == 0) goto L_0x0056
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0056
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            goto L_0x0056
        L_0x004d:
            r0 = move-exception
            goto L_0x00e7
        L_0x0050:
            r0 = move-exception
            goto L_0x00b6
        L_0x0052:
            r0 = move-exception
            r7 = r12
            goto L_0x00fd
        L_0x0056:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x009d
            com.google.android.gms.measurement.internal.c4 r15 = r16.h()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.e4 r15 = r15.E()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r4 = "Data loss, local db full"
            r15.a(r4)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r10[r2] = r11     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            int r4 = r9.delete(r0, r4, r10)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r10 = (long) r4     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x009d
            com.google.android.gms.measurement.internal.c4 r4 = r16.h()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.e4 r4 = r4.E()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r4.d(r15, r2, r8, r10)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
        L_0x009d:
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r12 == 0) goto L_0x00ab
            r12.close()
        L_0x00ab:
            if (r9 == 0) goto L_0x00b0
            r9.close()
        L_0x00b0:
            r2 = 1
            return r2
        L_0x00b2:
            r7 = r12
            goto L_0x00ea
        L_0x00b4:
            r0 = move-exception
            r12 = r7
        L_0x00b6:
            r7 = r9
            goto L_0x00bf
        L_0x00b8:
            r0 = move-exception
            goto L_0x00fd
        L_0x00ba:
            r0 = move-exception
            r9 = r7
            goto L_0x011c
        L_0x00bd:
            r0 = move-exception
            r12 = r7
        L_0x00bf:
            if (r7 == 0) goto L_0x00ca
            boolean r2 = r7.inTransaction()     // Catch:{ all -> 0x00e5 }
            if (r2 == 0) goto L_0x00ca
            r7.endTransaction()     // Catch:{ all -> 0x00e5 }
        L_0x00ca:
            com.google.android.gms.measurement.internal.c4 r2 = r16.h()     // Catch:{ all -> 0x00e5 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.b(r4, r0)     // Catch:{ all -> 0x00e5 }
            r2 = 1
            r1.d = r2     // Catch:{ all -> 0x00e5 }
            if (r12 == 0) goto L_0x00df
            r12.close()
        L_0x00df:
            if (r7 == 0) goto L_0x0115
            r7.close()
            goto L_0x0115
        L_0x00e5:
            r0 = move-exception
            r9 = r7
        L_0x00e7:
            r7 = r12
            goto L_0x011c
        L_0x00e9:
            r9 = r7
        L_0x00ea:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x011b }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f5
            r7.close()
        L_0x00f5:
            if (r9 == 0) goto L_0x0115
        L_0x00f7:
            r9.close()
            goto L_0x0115
        L_0x00fb:
            r0 = move-exception
            r9 = r7
        L_0x00fd:
            com.google.android.gms.measurement.internal.c4 r2 = r16.h()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x011b }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.b(r4, r0)     // Catch:{ all -> 0x011b }
            r2 = 1
            r1.d = r2     // Catch:{ all -> 0x011b }
            if (r7 == 0) goto L_0x0112
            r7.close()
        L_0x0112:
            if (r9 == 0) goto L_0x0115
            goto L_0x00f7
        L_0x0115:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0023
        L_0x011b:
            r0 = move-exception
        L_0x011c:
            if (r7 == 0) goto L_0x0121
            r7.close()
        L_0x0121:
            if (r9 == 0) goto L_0x0126
            r9.close()
        L_0x0126:
            throw r0
        L_0x0127:
            com.google.android.gms.measurement.internal.c4 r0 = r16.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.M()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y3.D(int, byte[]):boolean");
    }

    private final SQLiteDatabase K() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    private final boolean L() {
        return n().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:60|61|62|63) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:75|76|77|78) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:47|48|49|50|172) */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0180, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0183, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0184, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0187, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x018b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x018c, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x019b, code lost:
        if (r15.inTransaction() != false) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x019d, code lost:
        r15.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01af, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01bf, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01e5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x01e6, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01e7, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x01ea, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x01ef, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        h().E().a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        h().E().a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        h().E().a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0104 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0180 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0197 A[SYNTHETIC, Splitter:B:126:0x0197] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01e0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<defpackage.m80> C(int r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "Error reading entries from local database"
            r21.b()
            boolean r0 = r1.d
            r3 = 0
            if (r0 == 0) goto L_0x000d
            return r3
        L_0x000d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r21.L()
            if (r0 != 0) goto L_0x0019
            return r4
        L_0x0019:
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 5
        L_0x001d:
            if (r7 >= r5) goto L_0x01f3
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r21.K()     // Catch:{ SQLiteFullException -> 0x01c8, SQLiteDatabaseLockedException -> 0x01b5, SQLiteException -> 0x0192, all -> 0x018f }
            if (r15 != 0) goto L_0x0034
            r1.d = r9     // Catch:{ SQLiteFullException -> 0x0031, SQLiteDatabaseLockedException -> 0x0187, SQLiteException -> 0x002e, all -> 0x0180 }
            if (r15 == 0) goto L_0x002d
            r15.close()
        L_0x002d:
            return r3
        L_0x002e:
            r0 = move-exception
            goto L_0x0185
        L_0x0031:
            r0 = move-exception
            goto L_0x018d
        L_0x0034:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x018b, SQLiteDatabaseLockedException -> 0x0187, SQLiteException -> 0x0183, all -> 0x0180 }
            long r10 = B(r15)     // Catch:{ SQLiteFullException -> 0x018b, SQLiteDatabaseLockedException -> 0x0187, SQLiteException -> 0x0183, all -> 0x0180 }
            r19 = -1
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0031, SQLiteDatabaseLockedException -> 0x0187, SQLiteException -> 0x002e, all -> 0x0180 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0031, SQLiteDatabaseLockedException -> 0x0187, SQLiteException -> 0x002e, all -> 0x0180 }
            r12[r6] = r10     // Catch:{ SQLiteFullException -> 0x0031, SQLiteDatabaseLockedException -> 0x0187, SQLiteException -> 0x002e, all -> 0x0180 }
            r13 = r0
            r14 = r12
            goto L_0x0050
        L_0x004e:
            r13 = r3
            r14 = r13
        L_0x0050:
            java.lang.String r11 = "messages"
            java.lang.String r0 = "rowid"
            java.lang.String r10 = "type"
            java.lang.String r12 = "entry"
            java.lang.String[] r12 = new java.lang.String[]{r0, r10, r12}     // Catch:{ SQLiteFullException -> 0x018b, SQLiteDatabaseLockedException -> 0x0187, SQLiteException -> 0x0183, all -> 0x0180 }
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r10 = 100
            java.lang.String r18 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x018b, SQLiteDatabaseLockedException -> 0x0187, SQLiteException -> 0x0183, all -> 0x0180 }
            r10 = r15
            r5 = r15
            r15 = r0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x017c, SQLiteDatabaseLockedException -> 0x0188, SQLiteException -> 0x0178, all -> 0x0175 }
        L_0x006e:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            if (r0 == 0) goto L_0x0139
            long r19 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            r11 = 2
            byte[] r12 = r10.getBlob(r11)     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            if (r0 != 0) goto L_0x00b6
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            int r0 = r12.length     // Catch:{ a -> 0x00a1 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x00a1 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x00a1 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.s> r0 = com.google.android.gms.measurement.internal.s.CREATOR     // Catch:{ a -> 0x00a1 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x00a1 }
            com.google.android.gms.measurement.internal.s r0 = (com.google.android.gms.measurement.internal.s) r0     // Catch:{ a -> 0x00a1 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            if (r0 == 0) goto L_0x006e
        L_0x009b:
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            goto L_0x006e
        L_0x009f:
            r0 = move-exception
            goto L_0x00b2
        L_0x00a1:
            com.google.android.gms.measurement.internal.c4 r0 = r21.h()     // Catch:{ all -> 0x009f }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ all -> 0x009f }
            java.lang.String r12 = "Failed to load event from local database"
            r0.a(r12)     // Catch:{ all -> 0x009f }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            goto L_0x006e
        L_0x00b2:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            throw r0     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
        L_0x00b6:
            if (r0 != r9) goto L_0x00e9
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            int r0 = r12.length     // Catch:{ a -> 0x00d1 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x00d1 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x00d1 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.ea> r0 = com.google.android.gms.measurement.internal.ea.CREATOR     // Catch:{ a -> 0x00d1 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x00d1 }
            com.google.android.gms.measurement.internal.ea r0 = (com.google.android.gms.measurement.internal.ea) r0     // Catch:{ a -> 0x00d1 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            goto L_0x00e2
        L_0x00cf:
            r0 = move-exception
            goto L_0x00e5
        L_0x00d1:
            com.google.android.gms.measurement.internal.c4 r0 = r21.h()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ all -> 0x00cf }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.a(r12)     // Catch:{ all -> 0x00cf }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            r0 = r3
        L_0x00e2:
            if (r0 == 0) goto L_0x006e
            goto L_0x009b
        L_0x00e5:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            throw r0     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
        L_0x00e9:
            if (r0 != r11) goto L_0x011c
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            int r0 = r12.length     // Catch:{ a -> 0x0104 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x0104 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x0104 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.ua> r0 = com.google.android.gms.measurement.internal.ua.CREATOR     // Catch:{ a -> 0x0104 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x0104 }
            com.google.android.gms.measurement.internal.ua r0 = (com.google.android.gms.measurement.internal.ua) r0     // Catch:{ a -> 0x0104 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            goto L_0x0115
        L_0x0102:
            r0 = move-exception
            goto L_0x0118
        L_0x0104:
            com.google.android.gms.measurement.internal.c4 r0 = r21.h()     // Catch:{ all -> 0x0102 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = "Failed to load conditional user property from local database"
            r0.a(r12)     // Catch:{ all -> 0x0102 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            r0 = r3
        L_0x0115:
            if (r0 == 0) goto L_0x006e
            goto L_0x009b
        L_0x0118:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            throw r0     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
        L_0x011c:
            r11 = 3
            if (r0 != r11) goto L_0x012e
            com.google.android.gms.measurement.internal.c4 r0 = r21.h()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            java.lang.String r11 = "Skipping app launch break"
        L_0x0129:
            r0.a(r11)     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            goto L_0x006e
        L_0x012e:
            com.google.android.gms.measurement.internal.c4 r0 = r21.h()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            java.lang.String r11 = "Unknown record type in local database"
            goto L_0x0129
        L_0x0139:
            java.lang.String r0 = "messages"
            java.lang.String r11 = "rowid <= ?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            java.lang.String r13 = java.lang.Long.toString(r19)     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            r12[r6] = r13     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            int r0 = r5.delete(r0, r11, r12)     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            int r11 = r4.size()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            if (r0 >= r11) goto L_0x015c
            com.google.android.gms.measurement.internal.c4 r0 = r21.h()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            java.lang.String r11 = "Fewer entries removed from local database than expected"
            r0.a(r11)     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
        L_0x015c:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0173, SQLiteDatabaseLockedException -> 0x0189, SQLiteException -> 0x0171, all -> 0x016d }
            if (r10 == 0) goto L_0x0167
            r10.close()
        L_0x0167:
            if (r5 == 0) goto L_0x016c
            r5.close()
        L_0x016c:
            return r4
        L_0x016d:
            r0 = move-exception
            r3 = r10
            goto L_0x01e8
        L_0x0171:
            r0 = move-exception
            goto L_0x017a
        L_0x0173:
            r0 = move-exception
            goto L_0x017e
        L_0x0175:
            r0 = move-exception
            goto L_0x01e8
        L_0x0178:
            r0 = move-exception
            r10 = r3
        L_0x017a:
            r15 = r5
            goto L_0x0195
        L_0x017c:
            r0 = move-exception
            r10 = r3
        L_0x017e:
            r15 = r5
            goto L_0x01cb
        L_0x0180:
            r0 = move-exception
            goto L_0x01e7
        L_0x0183:
            r0 = move-exception
            r5 = r15
        L_0x0185:
            r10 = r3
            goto L_0x0195
        L_0x0187:
            r5 = r15
        L_0x0188:
            r10 = r3
        L_0x0189:
            r15 = r5
            goto L_0x01b7
        L_0x018b:
            r0 = move-exception
            r5 = r15
        L_0x018d:
            r10 = r3
            goto L_0x01cb
        L_0x018f:
            r0 = move-exception
            r5 = r3
            goto L_0x01e8
        L_0x0192:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x0195:
            if (r15 == 0) goto L_0x01a0
            boolean r5 = r15.inTransaction()     // Catch:{ all -> 0x01e5 }
            if (r5 == 0) goto L_0x01a0
            r15.endTransaction()     // Catch:{ all -> 0x01e5 }
        L_0x01a0:
            com.google.android.gms.measurement.internal.c4 r5 = r21.h()     // Catch:{ all -> 0x01e5 }
            com.google.android.gms.measurement.internal.e4 r5 = r5.E()     // Catch:{ all -> 0x01e5 }
            r5.b(r2, r0)     // Catch:{ all -> 0x01e5 }
            r1.d = r9     // Catch:{ all -> 0x01e5 }
            if (r10 == 0) goto L_0x01b2
            r10.close()
        L_0x01b2:
            if (r15 == 0) goto L_0x01e0
            goto L_0x01c4
        L_0x01b5:
            r10 = r3
            r15 = r10
        L_0x01b7:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x01e5 }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x01c2
            r10.close()
        L_0x01c2:
            if (r15 == 0) goto L_0x01e0
        L_0x01c4:
            r15.close()
            goto L_0x01e0
        L_0x01c8:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x01cb:
            com.google.android.gms.measurement.internal.c4 r5 = r21.h()     // Catch:{ all -> 0x01e5 }
            com.google.android.gms.measurement.internal.e4 r5 = r5.E()     // Catch:{ all -> 0x01e5 }
            r5.b(r2, r0)     // Catch:{ all -> 0x01e5 }
            r1.d = r9     // Catch:{ all -> 0x01e5 }
            if (r10 == 0) goto L_0x01dd
            r10.close()
        L_0x01dd:
            if (r15 == 0) goto L_0x01e0
            goto L_0x01c4
        L_0x01e0:
            int r7 = r7 + 1
            r5 = 5
            goto L_0x001d
        L_0x01e5:
            r0 = move-exception
            r3 = r10
        L_0x01e7:
            r5 = r15
        L_0x01e8:
            if (r3 == 0) goto L_0x01ed
            r3.close()
        L_0x01ed:
            if (r5 == 0) goto L_0x01f2
            r5.close()
        L_0x01f2:
            throw r0
        L_0x01f3:
            com.google.android.gms.measurement.internal.c4 r0 = r21.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.a(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y3.C(int):java.util.List");
    }

    public final boolean E(s sVar) {
        Parcel obtain = Parcel.obtain();
        sVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return D(0, marshall);
        }
        h().F().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean F(ea eaVar) {
        Parcel obtain = Parcel.obtain();
        eaVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return D(1, marshall);
        }
        h().F().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean G(ua uaVar) {
        g();
        byte[] o0 = fa.o0(uaVar);
        if (o0.length <= 131072) {
            return D(2, o0);
        }
        h().F().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final void H() {
        b();
        try {
            int delete = K().delete("messages", (String) null, (String[]) null) + 0;
            if (delete > 0) {
                h().M().b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            h().E().b("Error resetting local analytics data. error", e);
        }
    }

    public final boolean I() {
        return D(3, new byte[0]);
    }

    public final boolean J() {
        b();
        if (this.d || !L()) {
            return false;
        }
        int i = 0;
        int i2 = 5;
        while (i < 5) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = K();
                if (sQLiteDatabase == null) {
                    this.d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return false;
                }
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return true;
            } catch (SQLiteFullException e) {
                h().E().b("Error deleting app launch break from local database", e);
                this.d = true;
                if (sQLiteDatabase == null) {
                    i++;
                }
                sQLiteDatabase.close();
                i++;
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep((long) i2);
                i2 += 20;
                if (sQLiteDatabase == null) {
                    i++;
                }
                sQLiteDatabase.close();
                i++;
            } catch (SQLiteException e2) {
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
                h().E().b("Error deleting app launch break from local database", e2);
                this.d = true;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    i++;
                } else {
                    i++;
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        h().H().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return false;
    }
}
