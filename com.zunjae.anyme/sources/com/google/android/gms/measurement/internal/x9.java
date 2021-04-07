package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import defpackage.qs0;
import defpackage.ss0;
import defpackage.us0;
import defpackage.ys0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class x9 implements c6 {
    private static volatile x9 z;
    private b5 a;
    private g4 b;
    private d c;
    private n4 d;
    private t9 e;
    private ma f;
    private final ba g;
    private s7 h;
    private c9 i;
    private final h5 j;
    private boolean k;
    private boolean l;
    private long m;
    private List<Runnable> n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private FileLock t;
    private FileChannel u;
    private List<Long> v;
    private List<Long> w;
    private long x;
    private final Map<String, e> y;

    class a implements f {
        us0 a;
        List<Long> b;
        List<qs0> c;
        private long d;

        private a(x9 x9Var) {
        }

        /* synthetic */ a(x9 x9Var, w9 w9Var) {
            this(x9Var);
        }

        private static long c(qs0 qs0) {
            return ((qs0.W() / 1000) / 60) / 60;
        }

        public final boolean a(long j, qs0 qs0) {
            r.j(qs0);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() > 0 && c(this.c.get(0)) != c(qs0)) {
                return false;
            }
            long d2 = this.d + ((long) qs0.d());
            if (d2 >= ((long) Math.max(0, u.i.a(null).intValue()))) {
                return false;
            }
            this.d = d2;
            this.c.add(qs0);
            this.b.add(Long.valueOf(j));
            return this.c.size() < Math.max(1, u.j.a(null).intValue());
        }

        public final void b(us0 us0) {
            r.j(us0);
            this.a = us0;
        }
    }

    private x9(ca caVar) {
        this(caVar, (h5) null);
    }

    private x9(ca caVar, h5 h5Var) {
        this.k = false;
        r.j(caVar);
        this.j = h5.a(caVar.a, (sq0) null, (Long) null);
        this.x = -1;
        ba baVar = new ba(this);
        baVar.s();
        this.g = baVar;
        g4 g4Var = new g4(this);
        g4Var.s();
        this.b = g4Var;
        b5 b5Var = new b5(this);
        b5Var.s();
        this.a = b5Var;
        this.y = new HashMap();
        this.j.f().y(new w9(this, caVar));
    }

    private final boolean D(int i2, FileChannel fileChannel) {
        n0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.j.h().E().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            if (this.j.b().s(u.u0) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.j.h().E().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.j.h().E().b("Failed to write to channel", e2);
            return false;
        }
    }

    private final boolean E(qs0.a aVar, qs0.a aVar2) {
        r.a("_e".equals(aVar.P()));
        d0();
        ss0 y2 = ba.y((qs0) ((sy0) aVar.k()), "_sc");
        String str = null;
        String T = y2 == null ? null : y2.T();
        d0();
        ss0 y3 = ba.y((qs0) ((sy0) aVar2.k()), "_pc");
        if (y3 != null) {
            str = y3.T();
        }
        if (str == null || !str.equals(T)) {
            return false;
        }
        N(aVar, aVar2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0233, code lost:
        if (r6 == null) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0246, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0247, code lost:
        r5 = r1;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x024c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x024d, code lost:
        r25 = "";
        r4 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0263, code lost:
        if (r6 == null) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dc, code lost:
        if (r6 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01bf, code lost:
        if (r4 != null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0213, code lost:
        if (r4 != null) goto L_0x01c1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0246 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x026a A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0278 A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x044b A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x044d A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0450 A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0451 A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0470 A[SYNTHETIC, Splitter:B:211:0x0470] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x050a A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x056a A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x056e A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x05d4 A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0604 A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0621 A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0715 A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x08ac A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x08c5 A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x08df A[Catch:{ all -> 0x1003 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0115 A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:600:0x0fe6  */
    /* JADX WARNING: Removed duplicated region for block: B:608:0x0ffd A[SYNTHETIC, Splitter:B:608:0x0ffd] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0129 A[Catch:{ SQLiteException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:626:0x04d1 A[EDGE_INSN: B:626:0x04d1->B:220:0x04d1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:81:0x01c1=Splitter:B:81:0x01c1, B:108:0x0235=Splitter:B:108:0x0235, B:124:0x0266=Splitter:B:124:0x0266, B:47:0x00de=Splitter:B:47:0x00de} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean F(java.lang.String r43, long r44) {
        /*
            r42 = this;
            r1 = r42
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            java.lang.String r4 = ""
            com.google.android.gms.measurement.internal.d r5 = r42.Z()
            r5.t0()
            com.google.android.gms.measurement.internal.x9$a r5 = new com.google.android.gms.measurement.internal.x9$a     // Catch:{ all -> 0x1003 }
            r6 = 0
            r5.<init>(r1, r6)     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.d r7 = r42.Z()     // Catch:{ all -> 0x1003 }
            long r8 = r1.x     // Catch:{ all -> 0x1003 }
            com.google.android.gms.common.internal.r.j(r5)     // Catch:{ all -> 0x1003 }
            r7.b()     // Catch:{ all -> 0x1003 }
            r7.r()     // Catch:{ all -> 0x1003 }
            r11 = -1
            r13 = 2
            r14 = 0
            r15 = 1
            android.database.sqlite.SQLiteDatabase r10 = r7.v()     // Catch:{ SQLiteException -> 0x024c, all -> 0x0246 }
            boolean r16 = android.text.TextUtils.isEmpty(r6)     // Catch:{ SQLiteException -> 0x024c, all -> 0x0246 }
            if (r16 == 0) goto L_0x0092
            int r16 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r16 == 0) goto L_0x0046
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            java.lang.String r17 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            r6[r14] = r17     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            java.lang.String r17 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            r6[r15] = r17     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            goto L_0x004e
        L_0x0046:
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            java.lang.String r17 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            r6[r14] = r17     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
        L_0x004e:
            if (r16 == 0) goto L_0x0055
            java.lang.String r16 = "rowid <= ? and "
            r44 = r16
            goto L_0x0057
        L_0x0055:
            r44 = r4
        L_0x0057:
            int r13 = r44.length()     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            int r13 = r13 + 148
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            r11.<init>(r13)     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            java.lang.String r12 = "select app_id, metadata_fingerprint from raw_events where "
            r11.append(r12)     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            r12 = r44
            r11.append(r12)     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            java.lang.String r12 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r11.append(r12)     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            java.lang.String r11 = r11.toString()     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            android.database.Cursor r6 = r10.rawQuery(r11, r6)     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            boolean r11 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x008e }
            if (r11 != 0) goto L_0x0082
            if (r6 == 0) goto L_0x00e1
            goto L_0x00de
        L_0x0082:
            java.lang.String r11 = r6.getString(r14)     // Catch:{ SQLiteException -> 0x008e }
            java.lang.String r12 = r6.getString(r15)     // Catch:{ SQLiteException -> 0x023c }
            r6.close()     // Catch:{ SQLiteException -> 0x023c }
            goto L_0x00ed
        L_0x008e:
            r0 = move-exception
            r25 = r4
            goto L_0x00a7
        L_0x0092:
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x00ab
            r11 = 2
            java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            r11 = 0
            r12[r14] = r11     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            r12[r15] = r11     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0246 }
            goto L_0x00b0
        L_0x00a3:
            r0 = move-exception
            r25 = r4
            r6 = 0
        L_0x00a7:
            r11 = 0
        L_0x00a8:
            r4 = r0
            goto L_0x0252
        L_0x00ab:
            r11 = 0
            java.lang.String[] r12 = new java.lang.String[]{r11}     // Catch:{ SQLiteException -> 0x024c, all -> 0x0246 }
        L_0x00b0:
            if (r6 == 0) goto L_0x00b5
            java.lang.String r6 = " and rowid <= ?"
            goto L_0x00b6
        L_0x00b5:
            r6 = r4
        L_0x00b6:
            int r11 = r6.length()     // Catch:{ SQLiteException -> 0x024c, all -> 0x0246 }
            int r11 = r11 + 84
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x024c, all -> 0x0246 }
            r13.<init>(r11)     // Catch:{ SQLiteException -> 0x024c, all -> 0x0246 }
            java.lang.String r11 = "select metadata_fingerprint from raw_events where app_id = ?"
            r13.append(r11)     // Catch:{ SQLiteException -> 0x024c, all -> 0x0246 }
            r13.append(r6)     // Catch:{ SQLiteException -> 0x024c, all -> 0x0246 }
            java.lang.String r6 = " order by rowid limit 1;"
            r13.append(r6)     // Catch:{ SQLiteException -> 0x024c, all -> 0x0246 }
            java.lang.String r6 = r13.toString()     // Catch:{ SQLiteException -> 0x024c, all -> 0x0246 }
            android.database.Cursor r6 = r10.rawQuery(r6, r12)     // Catch:{ SQLiteException -> 0x024c, all -> 0x0246 }
            boolean r11 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0241 }
            if (r11 != 0) goto L_0x00e5
            if (r6 == 0) goto L_0x00e1
        L_0x00de:
            r6.close()     // Catch:{ all -> 0x1003 }
        L_0x00e1:
            r25 = r4
            goto L_0x0266
        L_0x00e5:
            java.lang.String r12 = r6.getString(r14)     // Catch:{ SQLiteException -> 0x0241 }
            r6.close()     // Catch:{ SQLiteException -> 0x0241 }
            r11 = 0
        L_0x00ed:
            java.lang.String r17 = "raw_events_metadata"
            java.lang.String r13 = "metadata"
            java.lang.String[] r18 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x023c }
            java.lang.String r19 = "app_id = ? and metadata_fingerprint = ?"
            r13 = 2
            java.lang.String[] r15 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x023c }
            r15[r14] = r11     // Catch:{ SQLiteException -> 0x023c }
            r13 = 1
            r15[r13] = r12     // Catch:{ SQLiteException -> 0x023c }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid"
            java.lang.String r24 = "2"
            r16 = r10
            r20 = r15
            android.database.Cursor r6 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x023c }
            boolean r13 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x023c }
            if (r13 != 0) goto L_0x0129
            com.google.android.gms.measurement.internal.c4 r8 = r7.h()     // Catch:{ SQLiteException -> 0x023c }
            com.google.android.gms.measurement.internal.e4 r8 = r8.E()     // Catch:{ SQLiteException -> 0x023c }
            java.lang.String r9 = "Raw event metadata record is missing. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ SQLiteException -> 0x023c }
            r8.b(r9, r10)     // Catch:{ SQLiteException -> 0x023c }
            if (r6 == 0) goto L_0x00e1
            goto L_0x00de
        L_0x0129:
            byte[] r13 = r6.getBlob(r14)     // Catch:{ SQLiteException -> 0x023c }
            us0$a r15 = defpackage.us0.O0()     // Catch:{ IOException -> 0x021e }
            com.google.android.gms.measurement.internal.ba.z(r15, r13)     // Catch:{ IOException -> 0x021e }
            us0$a r15 = (defpackage.us0.a) r15     // Catch:{ IOException -> 0x021e }
            f01 r13 = r15.k()     // Catch:{ IOException -> 0x021e }
            sy0 r13 = (defpackage.sy0) r13     // Catch:{ IOException -> 0x021e }
            us0 r13 = (defpackage.us0) r13     // Catch:{ IOException -> 0x021e }
            boolean r15 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x023c }
            if (r15 == 0) goto L_0x0158
            com.google.android.gms.measurement.internal.c4 r15 = r7.h()     // Catch:{ SQLiteException -> 0x023c }
            com.google.android.gms.measurement.internal.e4 r15 = r15.H()     // Catch:{ SQLiteException -> 0x023c }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            r25 = r4
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ SQLiteException -> 0x0239 }
            r15.b(r14, r4)     // Catch:{ SQLiteException -> 0x0239 }
            goto L_0x015a
        L_0x0158:
            r25 = r4
        L_0x015a:
            r6.close()     // Catch:{ SQLiteException -> 0x0239 }
            r5.b(r13)     // Catch:{ SQLiteException -> 0x0239 }
            r13 = -1
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x017d
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0239 }
            r13 = 0
            r14[r13] = r11     // Catch:{ SQLiteException -> 0x0239 }
            r13 = 1
            r14[r13] = r12     // Catch:{ SQLiteException -> 0x0239 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0239 }
            r9 = 2
            r14[r9] = r8     // Catch:{ SQLiteException -> 0x0239 }
            r19 = r4
            r20 = r14
            goto L_0x018c
        L_0x017d:
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r8 = 2
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0239 }
            r8 = 0
            r9[r8] = r11     // Catch:{ SQLiteException -> 0x0239 }
            r8 = 1
            r9[r8] = r12     // Catch:{ SQLiteException -> 0x0239 }
            r19 = r4
            r20 = r9
        L_0x018c:
            java.lang.String r17 = "raw_events"
            java.lang.String r4 = "rowid"
            java.lang.String r8 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r12 = "data"
            java.lang.String[] r18 = new java.lang.String[]{r4, r8, r9, r12}     // Catch:{ SQLiteException -> 0x0239 }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid"
            r24 = 0
            r16 = r10
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x0239 }
            boolean r6 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            if (r6 != 0) goto L_0x01c6
            com.google.android.gms.measurement.internal.c4 r6 = r7.h()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            r6.b(r8, r9)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            if (r4 == 0) goto L_0x0266
        L_0x01c1:
            r4.close()     // Catch:{ all -> 0x1003 }
            goto L_0x0266
        L_0x01c6:
            r6 = 0
            long r8 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            r6 = 3
            byte[] r10 = r4.getBlob(r6)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            qs0$a r6 = defpackage.qs0.b0()     // Catch:{ IOException -> 0x01fa }
            com.google.android.gms.measurement.internal.ba.z(r6, r10)     // Catch:{ IOException -> 0x01fa }
            qs0$a r6 = (defpackage.qs0.a) r6     // Catch:{ IOException -> 0x01fa }
            r10 = 1
            java.lang.String r12 = r4.getString(r10)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            r6.D(r12)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            r10 = 2
            long r12 = r4.getLong(r10)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            r6.y(r12)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            f01 r6 = r6.k()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            sy0 r6 = (defpackage.sy0) r6     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            qs0 r6 = (defpackage.qs0) r6     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            boolean r6 = r5.a(r8, r6)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            if (r6 != 0) goto L_0x020d
            if (r4 == 0) goto L_0x0266
            goto L_0x01c1
        L_0x01fa:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.c4 r8 = r7.h()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.E()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            r8.c(r9, r10, r6)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
        L_0x020d:
            boolean r6 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0216 }
            if (r6 != 0) goto L_0x01c6
            if (r4 == 0) goto L_0x0266
            goto L_0x01c1
        L_0x0216:
            r0 = move-exception
            r5 = r1
            r6 = r4
            goto L_0x0249
        L_0x021a:
            r0 = move-exception
            r6 = r4
            goto L_0x00a8
        L_0x021e:
            r0 = move-exception
            r25 = r4
            r4 = r0
            com.google.android.gms.measurement.internal.c4 r8 = r7.h()     // Catch:{ SQLiteException -> 0x0239 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.E()     // Catch:{ SQLiteException -> 0x0239 }
            java.lang.String r9 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ SQLiteException -> 0x0239 }
            r8.c(r9, r10, r4)     // Catch:{ SQLiteException -> 0x0239 }
            if (r6 == 0) goto L_0x0266
        L_0x0235:
            r6.close()     // Catch:{ all -> 0x1003 }
            goto L_0x0266
        L_0x0239:
            r0 = move-exception
            goto L_0x00a8
        L_0x023c:
            r0 = move-exception
            r25 = r4
            goto L_0x00a8
        L_0x0241:
            r0 = move-exception
            r25 = r4
            r4 = r0
            goto L_0x0251
        L_0x0246:
            r0 = move-exception
            r5 = r1
            r6 = 0
        L_0x0249:
            r1 = r0
            goto L_0x0ffb
        L_0x024c:
            r0 = move-exception
            r25 = r4
            r4 = r0
            r6 = 0
        L_0x0251:
            r11 = 0
        L_0x0252:
            com.google.android.gms.measurement.internal.c4 r7 = r7.h()     // Catch:{ all -> 0x0ff7 }
            com.google.android.gms.measurement.internal.e4 r7 = r7.E()     // Catch:{ all -> 0x0ff7 }
            java.lang.String r8 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ all -> 0x0ff7 }
            r7.c(r8, r9, r4)     // Catch:{ all -> 0x0ff7 }
            if (r6 == 0) goto L_0x0266
            goto L_0x0235
        L_0x0266:
            java.util.List<qs0> r4 = r5.c     // Catch:{ all -> 0x1003 }
            if (r4 == 0) goto L_0x0275
            java.util.List<qs0> r4 = r5.c     // Catch:{ all -> 0x1003 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x1003 }
            if (r4 == 0) goto L_0x0273
            goto L_0x0275
        L_0x0273:
            r4 = 0
            goto L_0x0276
        L_0x0275:
            r4 = 1
        L_0x0276:
            if (r4 != 0) goto L_0x0fe6
            us0 r4 = r5.a     // Catch:{ all -> 0x1003 }
            sy0$b r4 = r4.w()     // Catch:{ all -> 0x1003 }
            us0$a r4 = (defpackage.us0.a) r4     // Catch:{ all -> 0x1003 }
            r4.T()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.wa r6 = r6.b()     // Catch:{ all -> 0x1003 }
            us0 r7 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r7 = r7.T2()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.u.V     // Catch:{ all -> 0x1003 }
            boolean r6 = r6.C(r7, r8)     // Catch:{ all -> 0x1003 }
            r7 = -1
            r8 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x029e:
            java.util.List<qs0> r9 = r5.c     // Catch:{ all -> 0x1003 }
            int r9 = r9.size()     // Catch:{ all -> 0x1003 }
            r18 = r13
            java.lang.String r13 = "_fr"
            r19 = r2
            java.lang.String r2 = "_et"
            r20 = r14
            java.lang.String r14 = "_e"
            r21 = r6
            r22 = r7
            if (r12 >= r9) goto L_0x0936
            java.util.List<qs0> r9 = r5.c     // Catch:{ all -> 0x1003 }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x1003 }
            qs0 r9 = (defpackage.qs0) r9     // Catch:{ all -> 0x1003 }
            sy0$b r9 = r9.w()     // Catch:{ all -> 0x1003 }
            qs0$a r9 = (defpackage.qs0.a) r9     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.b5 r6 = r42.V()     // Catch:{ all -> 0x1003 }
            us0 r7 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r7 = r7.T2()     // Catch:{ all -> 0x1003 }
            r26 = r12
            java.lang.String r12 = r9.P()     // Catch:{ all -> 0x1003 }
            boolean r6 = r6.A(r7, r12)     // Catch:{ all -> 0x1003 }
            java.lang.String r7 = "_err"
            if (r6 == 0) goto L_0x035a
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.H()     // Catch:{ all -> 0x1003 }
            java.lang.String r6 = "Dropping blacklisted raw event. appId"
            us0 r12 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = r12.T2()     // Catch:{ all -> 0x1003 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.c4.w(r12)     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.h5 r13 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.a4 r13 = r13.H()     // Catch:{ all -> 0x1003 }
            java.lang.String r14 = r9.P()     // Catch:{ all -> 0x1003 }
            java.lang.String r13 = r13.v(r14)     // Catch:{ all -> 0x1003 }
            r2.c(r6, r12, r13)     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.b5 r2 = r42.V()     // Catch:{ all -> 0x1003 }
            us0 r6 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r6 = r6.T2()     // Catch:{ all -> 0x1003 }
            boolean r2 = r2.H(r6)     // Catch:{ all -> 0x1003 }
            if (r2 != 0) goto L_0x0326
            com.google.android.gms.measurement.internal.b5 r2 = r42.V()     // Catch:{ all -> 0x1003 }
            us0 r6 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r6 = r6.T2()     // Catch:{ all -> 0x1003 }
            boolean r2 = r2.I(r6)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x0324
            goto L_0x0326
        L_0x0324:
            r2 = 0
            goto L_0x0327
        L_0x0326:
            r2 = 1
        L_0x0327:
            if (r2 != 0) goto L_0x034c
            java.lang.String r2 = r9.P()     // Catch:{ all -> 0x1003 }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x1003 }
            if (r2 != 0) goto L_0x034c
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.fa r27 = r2.G()     // Catch:{ all -> 0x1003 }
            us0 r2 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r28 = r2.T2()     // Catch:{ all -> 0x1003 }
            r29 = 11
            java.lang.String r30 = "_ev"
            java.lang.String r31 = r9.P()     // Catch:{ all -> 0x1003 }
            r32 = 0
            r27.W(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x1003 }
        L_0x034c:
            r27 = r15
            r13 = r18
            r14 = r20
            r7 = r22
            r6 = r26
            r16 = r3
            goto L_0x092a
        L_0x035a:
            boolean r6 = defpackage.j21.a()     // Catch:{ all -> 0x1003 }
            if (r6 == 0) goto L_0x03ea
            com.google.android.gms.measurement.internal.h5 r6 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.wa r6 = r6.b()     // Catch:{ all -> 0x1003 }
            us0 r12 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = r12.T2()     // Catch:{ all -> 0x1003 }
            r27 = r15
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.u.T0     // Catch:{ all -> 0x1003 }
            boolean r6 = r6.C(r12, r15)     // Catch:{ all -> 0x1003 }
            if (r6 == 0) goto L_0x03ec
            java.lang.String r6 = r9.P()     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = com.google.android.gms.measurement.internal.e6.a(r3)     // Catch:{ all -> 0x1003 }
            boolean r6 = r6.equals(r12)     // Catch:{ all -> 0x1003 }
            if (r6 == 0) goto L_0x03ec
            r9.D(r3)     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r6 = r6.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r6 = r6.M()     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = "Renaming ad_impression to _ai"
            r6.a(r12)     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r6 = r6.h()     // Catch:{ all -> 0x1003 }
            r12 = 5
            boolean r6 = r6.B(r12)     // Catch:{ all -> 0x1003 }
            if (r6 == 0) goto L_0x03ec
            r6 = 0
        L_0x03a4:
            int r12 = r9.I()     // Catch:{ all -> 0x1003 }
            if (r6 >= r12) goto L_0x03ec
            java.lang.String r12 = "ad_platform"
            ss0 r15 = r9.G(r6)     // Catch:{ all -> 0x1003 }
            java.lang.String r15 = r15.N()     // Catch:{ all -> 0x1003 }
            boolean r12 = r12.equals(r15)     // Catch:{ all -> 0x1003 }
            if (r12 == 0) goto L_0x03e7
            ss0 r12 = r9.G(r6)     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = r12.T()     // Catch:{ all -> 0x1003 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x1003 }
            if (r12 != 0) goto L_0x03e7
            java.lang.String r12 = "admob"
            ss0 r15 = r9.G(r6)     // Catch:{ all -> 0x1003 }
            java.lang.String r15 = r15.T()     // Catch:{ all -> 0x1003 }
            boolean r12 = r12.equalsIgnoreCase(r15)     // Catch:{ all -> 0x1003 }
            if (r12 == 0) goto L_0x03e7
            com.google.android.gms.measurement.internal.h5 r12 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r12 = r12.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r12 = r12.J()     // Catch:{ all -> 0x1003 }
            java.lang.String r15 = "AdMob ad impression logged from app. Potentially duplicative."
            r12.a(r15)     // Catch:{ all -> 0x1003 }
        L_0x03e7:
            int r6 = r6 + 1
            goto L_0x03a4
        L_0x03ea:
            r27 = r15
        L_0x03ec:
            com.google.android.gms.measurement.internal.b5 r6 = r42.V()     // Catch:{ all -> 0x1003 }
            us0 r12 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = r12.T2()     // Catch:{ all -> 0x1003 }
            java.lang.String r15 = r9.P()     // Catch:{ all -> 0x1003 }
            boolean r6 = r6.C(r12, r15)     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = "_c"
            if (r6 != 0) goto L_0x045d
            r42.d0()     // Catch:{ all -> 0x1003 }
            java.lang.String r15 = r9.P()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.common.internal.r.f(r15)     // Catch:{ all -> 0x1003 }
            r16 = r3
            int r3 = r15.hashCode()     // Catch:{ all -> 0x1003 }
            r29 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r3 == r10) goto L_0x0438
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r3 == r10) goto L_0x042e
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r3 == r10) goto L_0x0424
            goto L_0x0442
        L_0x0424:
            java.lang.String r3 = "_ui"
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x1003 }
            if (r3 == 0) goto L_0x0442
            r3 = 1
            goto L_0x0443
        L_0x042e:
            java.lang.String r3 = "_ug"
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x1003 }
            if (r3 == 0) goto L_0x0442
            r3 = 2
            goto L_0x0443
        L_0x0438:
            java.lang.String r3 = "_in"
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x1003 }
            if (r3 == 0) goto L_0x0442
            r3 = 0
            goto L_0x0443
        L_0x0442:
            r3 = -1
        L_0x0443:
            if (r3 == 0) goto L_0x044d
            r10 = 1
            if (r3 == r10) goto L_0x044d
            r10 = 2
            if (r3 == r10) goto L_0x044d
            r3 = 0
            goto L_0x044e
        L_0x044d:
            r3 = 1
        L_0x044e:
            if (r3 == 0) goto L_0x0451
            goto L_0x0461
        L_0x0451:
            r30 = r2
            r31 = r4
            r32 = r11
            r10 = r13
            r11 = r14
        L_0x0459:
            r13 = r18
            goto L_0x063c
        L_0x045d:
            r16 = r3
            r29 = r10
        L_0x0461:
            r30 = r2
            r3 = 0
            r10 = 0
            r15 = 0
        L_0x0466:
            int r2 = r9.I()     // Catch:{ all -> 0x1003 }
            r31 = r4
            java.lang.String r4 = "_r"
            if (r15 >= r2) goto L_0x04d1
            ss0 r2 = r9.G(r15)     // Catch:{ all -> 0x1003 }
            java.lang.String r2 = r2.N()     // Catch:{ all -> 0x1003 }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x049c
            ss0 r2 = r9.G(r15)     // Catch:{ all -> 0x1003 }
            sy0$b r2 = r2.w()     // Catch:{ all -> 0x1003 }
            ss0$a r2 = (defpackage.ss0.a) r2     // Catch:{ all -> 0x1003 }
            r3 = 1
            r2.y(r3)     // Catch:{ all -> 0x1003 }
            f01 r2 = r2.k()     // Catch:{ all -> 0x1003 }
            sy0 r2 = (defpackage.sy0) r2     // Catch:{ all -> 0x1003 }
            ss0 r2 = (defpackage.ss0) r2     // Catch:{ all -> 0x1003 }
            r9.x(r15, r2)     // Catch:{ all -> 0x1003 }
            r32 = r11
            r3 = 1
            goto L_0x04ca
        L_0x049c:
            ss0 r2 = r9.G(r15)     // Catch:{ all -> 0x1003 }
            java.lang.String r2 = r2.N()     // Catch:{ all -> 0x1003 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x04c8
            ss0 r2 = r9.G(r15)     // Catch:{ all -> 0x1003 }
            sy0$b r2 = r2.w()     // Catch:{ all -> 0x1003 }
            ss0$a r2 = (defpackage.ss0.a) r2     // Catch:{ all -> 0x1003 }
            r32 = r11
            r10 = 1
            r2.y(r10)     // Catch:{ all -> 0x1003 }
            f01 r2 = r2.k()     // Catch:{ all -> 0x1003 }
            sy0 r2 = (defpackage.sy0) r2     // Catch:{ all -> 0x1003 }
            ss0 r2 = (defpackage.ss0) r2     // Catch:{ all -> 0x1003 }
            r9.x(r15, r2)     // Catch:{ all -> 0x1003 }
            r10 = 1
            goto L_0x04ca
        L_0x04c8:
            r32 = r11
        L_0x04ca:
            int r15 = r15 + 1
            r4 = r31
            r11 = r32
            goto L_0x0466
        L_0x04d1:
            r32 = r11
            if (r3 != 0) goto L_0x0506
            if (r6 == 0) goto L_0x0506
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.M()     // Catch:{ all -> 0x1003 }
            java.lang.String r3 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.h5 r11 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.a4 r11 = r11.H()     // Catch:{ all -> 0x1003 }
            java.lang.String r15 = r9.P()     // Catch:{ all -> 0x1003 }
            java.lang.String r11 = r11.v(r15)     // Catch:{ all -> 0x1003 }
            r2.b(r3, r11)     // Catch:{ all -> 0x1003 }
            ss0$a r2 = defpackage.ss0.e0()     // Catch:{ all -> 0x1003 }
            r2.C(r12)     // Catch:{ all -> 0x1003 }
            r3 = r13
            r11 = r14
            r13 = 1
            r2.y(r13)     // Catch:{ all -> 0x1003 }
            r9.A(r2)     // Catch:{ all -> 0x1003 }
            goto L_0x0508
        L_0x0506:
            r3 = r13
            r11 = r14
        L_0x0508:
            if (r10 != 0) goto L_0x0536
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.M()     // Catch:{ all -> 0x1003 }
            java.lang.String r10 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.h5 r13 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.a4 r13 = r13.H()     // Catch:{ all -> 0x1003 }
            java.lang.String r14 = r9.P()     // Catch:{ all -> 0x1003 }
            java.lang.String r13 = r13.v(r14)     // Catch:{ all -> 0x1003 }
            r2.b(r10, r13)     // Catch:{ all -> 0x1003 }
            ss0$a r2 = defpackage.ss0.e0()     // Catch:{ all -> 0x1003 }
            r2.C(r4)     // Catch:{ all -> 0x1003 }
            r13 = 1
            r2.y(r13)     // Catch:{ all -> 0x1003 }
            r9.A(r2)     // Catch:{ all -> 0x1003 }
        L_0x0536:
            com.google.android.gms.measurement.internal.d r33 = r42.Z()     // Catch:{ all -> 0x1003 }
            long r34 = r42.o0()     // Catch:{ all -> 0x1003 }
            us0 r2 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r36 = r2.T2()     // Catch:{ all -> 0x1003 }
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 1
            com.google.android.gms.measurement.internal.g r2 = r33.C(r34, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x1003 }
            long r13 = r2.e     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.wa r2 = r2.b()     // Catch:{ all -> 0x1003 }
            us0 r10 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r10 = r10.T2()     // Catch:{ all -> 0x1003 }
            int r2 = r2.w(r10)     // Catch:{ all -> 0x1003 }
            r10 = r3
            long r2 = (long) r2     // Catch:{ all -> 0x1003 }
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x056e
            k(r9, r4)     // Catch:{ all -> 0x1003 }
            goto L_0x0570
        L_0x056e:
            r18 = 1
        L_0x0570:
            java.lang.String r2 = r9.P()     // Catch:{ all -> 0x1003 }
            boolean r2 = com.google.android.gms.measurement.internal.fa.d0(r2)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x0459
            if (r6 == 0) goto L_0x0459
            com.google.android.gms.measurement.internal.d r33 = r42.Z()     // Catch:{ all -> 0x1003 }
            long r34 = r42.o0()     // Catch:{ all -> 0x1003 }
            us0 r2 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r36 = r2.T2()     // Catch:{ all -> 0x1003 }
            r37 = 0
            r38 = 0
            r39 = 1
            r40 = 0
            r41 = 0
            com.google.android.gms.measurement.internal.g r2 = r33.C(r34, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x1003 }
            long r2 = r2.c     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.h5 r4 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.wa r4 = r4.b()     // Catch:{ all -> 0x1003 }
            us0 r13 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r13 = r13.T2()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.u.n     // Catch:{ all -> 0x1003 }
            int r4 = r4.u(r13, r14)     // Catch:{ all -> 0x1003 }
            long r13 = (long) r4     // Catch:{ all -> 0x1003 }
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0459
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.H()     // Catch:{ all -> 0x1003 }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            us0 r4 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r4 = r4.T2()     // Catch:{ all -> 0x1003 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r4)     // Catch:{ all -> 0x1003 }
            r2.b(r3, r4)     // Catch:{ all -> 0x1003 }
            r2 = -1
            r3 = 0
            r4 = 0
            r13 = 0
        L_0x05ce:
            int r14 = r9.I()     // Catch:{ all -> 0x1003 }
            if (r13 >= r14) goto L_0x05f9
            ss0 r14 = r9.G(r13)     // Catch:{ all -> 0x1003 }
            java.lang.String r15 = r14.N()     // Catch:{ all -> 0x1003 }
            boolean r15 = r12.equals(r15)     // Catch:{ all -> 0x1003 }
            if (r15 == 0) goto L_0x05eb
            sy0$b r2 = r14.w()     // Catch:{ all -> 0x1003 }
            ss0$a r2 = (defpackage.ss0.a) r2     // Catch:{ all -> 0x1003 }
            r3 = r2
            r2 = r13
            goto L_0x05f6
        L_0x05eb:
            java.lang.String r14 = r14.N()     // Catch:{ all -> 0x1003 }
            boolean r14 = r7.equals(r14)     // Catch:{ all -> 0x1003 }
            if (r14 == 0) goto L_0x05f6
            r4 = 1
        L_0x05f6:
            int r13 = r13 + 1
            goto L_0x05ce
        L_0x05f9:
            if (r4 == 0) goto L_0x0602
            if (r3 == 0) goto L_0x0602
            r9.K(r2)     // Catch:{ all -> 0x1003 }
            goto L_0x0459
        L_0x0602:
            if (r3 == 0) goto L_0x0621
            java.lang.Object r3 = r3.clone()     // Catch:{ all -> 0x1003 }
            sy0$b r3 = (defpackage.sy0.b) r3     // Catch:{ all -> 0x1003 }
            ss0$a r3 = (defpackage.ss0.a) r3     // Catch:{ all -> 0x1003 }
            r3.C(r7)     // Catch:{ all -> 0x1003 }
            r13 = 10
            r3.y(r13)     // Catch:{ all -> 0x1003 }
            f01 r3 = r3.k()     // Catch:{ all -> 0x1003 }
            sy0 r3 = (defpackage.sy0) r3     // Catch:{ all -> 0x1003 }
            ss0 r3 = (defpackage.ss0) r3     // Catch:{ all -> 0x1003 }
            r9.x(r2, r3)     // Catch:{ all -> 0x1003 }
            goto L_0x0459
        L_0x0621:
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x1003 }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            us0 r4 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r4 = r4.T2()     // Catch:{ all -> 0x1003 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r4)     // Catch:{ all -> 0x1003 }
            r2.b(r3, r4)     // Catch:{ all -> 0x1003 }
            goto L_0x0459
        L_0x063c:
            if (r6 == 0) goto L_0x06ff
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x1003 }
            java.util.List r3 = r9.H()     // Catch:{ all -> 0x1003 }
            r2.<init>(r3)     // Catch:{ all -> 0x1003 }
            r3 = 0
            r4 = -1
            r6 = -1
        L_0x064a:
            int r7 = r2.size()     // Catch:{ all -> 0x1003 }
            java.lang.String r14 = "currency"
            java.lang.String r15 = "value"
            if (r3 >= r7) goto L_0x067a
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x1003 }
            ss0 r7 = (defpackage.ss0) r7     // Catch:{ all -> 0x1003 }
            java.lang.String r7 = r7.N()     // Catch:{ all -> 0x1003 }
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x1003 }
            if (r7 == 0) goto L_0x0666
            r4 = r3
            goto L_0x0677
        L_0x0666:
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x1003 }
            ss0 r7 = (defpackage.ss0) r7     // Catch:{ all -> 0x1003 }
            java.lang.String r7 = r7.N()     // Catch:{ all -> 0x1003 }
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x1003 }
            if (r7 == 0) goto L_0x0677
            r6 = r3
        L_0x0677:
            int r3 = r3 + 1
            goto L_0x064a
        L_0x067a:
            r3 = -1
            if (r4 == r3) goto L_0x0700
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x1003 }
            ss0 r3 = (defpackage.ss0) r3     // Catch:{ all -> 0x1003 }
            boolean r3 = r3.W()     // Catch:{ all -> 0x1003 }
            if (r3 != 0) goto L_0x06b0
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x1003 }
            ss0 r3 = (defpackage.ss0) r3     // Catch:{ all -> 0x1003 }
            boolean r3 = r3.a0()     // Catch:{ all -> 0x1003 }
            if (r3 != 0) goto L_0x06b0
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.J()     // Catch:{ all -> 0x1003 }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.a(r3)     // Catch:{ all -> 0x1003 }
            r9.K(r4)     // Catch:{ all -> 0x1003 }
            k(r9, r12)     // Catch:{ all -> 0x1003 }
            r2 = 18
            j(r9, r2, r15)     // Catch:{ all -> 0x1003 }
            goto L_0x06ff
        L_0x06b0:
            r3 = -1
            if (r6 != r3) goto L_0x06b6
            r2 = 1
            r7 = 3
            goto L_0x06e2
        L_0x06b6:
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x1003 }
            ss0 r2 = (defpackage.ss0) r2     // Catch:{ all -> 0x1003 }
            java.lang.String r2 = r2.T()     // Catch:{ all -> 0x1003 }
            int r6 = r2.length()     // Catch:{ all -> 0x1003 }
            r7 = 3
            if (r6 == r7) goto L_0x06c9
        L_0x06c7:
            r2 = 1
            goto L_0x06e2
        L_0x06c9:
            r6 = 0
        L_0x06ca:
            int r15 = r2.length()     // Catch:{ all -> 0x1003 }
            if (r6 >= r15) goto L_0x06e1
            int r15 = r2.codePointAt(r6)     // Catch:{ all -> 0x1003 }
            boolean r17 = java.lang.Character.isLetter(r15)     // Catch:{ all -> 0x1003 }
            if (r17 != 0) goto L_0x06db
            goto L_0x06c7
        L_0x06db:
            int r15 = java.lang.Character.charCount(r15)     // Catch:{ all -> 0x1003 }
            int r6 = r6 + r15
            goto L_0x06ca
        L_0x06e1:
            r2 = 0
        L_0x06e2:
            if (r2 == 0) goto L_0x0701
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.J()     // Catch:{ all -> 0x1003 }
            java.lang.String r6 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r6)     // Catch:{ all -> 0x1003 }
            r9.K(r4)     // Catch:{ all -> 0x1003 }
            k(r9, r12)     // Catch:{ all -> 0x1003 }
            r2 = 19
            j(r9, r2, r14)     // Catch:{ all -> 0x1003 }
            goto L_0x0701
        L_0x06ff:
            r3 = -1
        L_0x0700:
            r7 = 3
        L_0x0701:
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.wa r2 = r2.b()     // Catch:{ all -> 0x1003 }
            us0 r4 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r4 = r4.T2()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.u.U     // Catch:{ all -> 0x1003 }
            boolean r2 = r2.C(r4, r6)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x08ac
            java.lang.String r2 = r9.P()     // Catch:{ all -> 0x1003 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x0775
            r42.d0()     // Catch:{ all -> 0x1003 }
            f01 r2 = r9.k()     // Catch:{ all -> 0x1003 }
            sy0 r2 = (defpackage.sy0) r2     // Catch:{ all -> 0x1003 }
            qs0 r2 = (defpackage.qs0) r2     // Catch:{ all -> 0x1003 }
            ss0 r2 = com.google.android.gms.measurement.internal.ba.y(r2, r10)     // Catch:{ all -> 0x1003 }
            if (r2 != 0) goto L_0x076d
            if (r32 == 0) goto L_0x0763
            long r14 = r32.R()     // Catch:{ all -> 0x1003 }
            long r17 = r9.R()     // Catch:{ all -> 0x1003 }
            long r14 = r14 - r17
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x1003 }
            r17 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x0763
            java.lang.Object r2 = r32.clone()     // Catch:{ all -> 0x1003 }
            sy0$b r2 = (defpackage.sy0.b) r2     // Catch:{ all -> 0x1003 }
            qs0$a r2 = (defpackage.qs0.a) r2     // Catch:{ all -> 0x1003 }
            boolean r4 = r1.E(r9, r2)     // Catch:{ all -> 0x1003 }
            if (r4 == 0) goto L_0x0763
            r4 = r31
            r4.x(r8, r2)     // Catch:{ all -> 0x1003 }
            r7 = r22
            r6 = r30
        L_0x075d:
            r29 = 0
            r32 = 0
            goto L_0x08b3
        L_0x0763:
            r4 = r31
            r29 = r9
            r7 = r20
            r6 = r30
            goto L_0x08b3
        L_0x076d:
            r4 = r31
            r10 = r22
            r6 = r30
            goto L_0x08b2
        L_0x0775:
            r4 = r31
            java.lang.String r2 = "_vs"
            java.lang.String r6 = r9.P()     // Catch:{ all -> 0x1003 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x07ce
            r42.d0()     // Catch:{ all -> 0x1003 }
            f01 r2 = r9.k()     // Catch:{ all -> 0x1003 }
            sy0 r2 = (defpackage.sy0) r2     // Catch:{ all -> 0x1003 }
            qs0 r2 = (defpackage.qs0) r2     // Catch:{ all -> 0x1003 }
            r6 = r30
            ss0 r2 = com.google.android.gms.measurement.internal.ba.y(r2, r6)     // Catch:{ all -> 0x1003 }
            if (r2 != 0) goto L_0x07ca
            if (r29 == 0) goto L_0x07c1
            long r14 = r29.R()     // Catch:{ all -> 0x1003 }
            long r17 = r9.R()     // Catch:{ all -> 0x1003 }
            long r14 = r14 - r17
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x1003 }
            r17 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x07c1
            java.lang.Object r2 = r29.clone()     // Catch:{ all -> 0x1003 }
            sy0$b r2 = (defpackage.sy0.b) r2     // Catch:{ all -> 0x1003 }
            qs0$a r2 = (defpackage.qs0.a) r2     // Catch:{ all -> 0x1003 }
            boolean r10 = r1.E(r2, r9)     // Catch:{ all -> 0x1003 }
            if (r10 == 0) goto L_0x07c1
            r10 = r22
            r4.x(r10, r2)     // Catch:{ all -> 0x1003 }
            r7 = r10
            goto L_0x075d
        L_0x07c1:
            r10 = r22
            r32 = r9
            r7 = r10
            r8 = r20
            goto L_0x08b3
        L_0x07ca:
            r10 = r22
            goto L_0x08b2
        L_0x07ce:
            r10 = r22
            r6 = r30
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.wa r2 = r2.b()     // Catch:{ all -> 0x1003 }
            us0 r12 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = r12.T2()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.u.o0     // Catch:{ all -> 0x1003 }
            boolean r2 = r2.C(r12, r14)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x08b2
            java.lang.String r2 = "_ab"
            java.lang.String r12 = r9.P()     // Catch:{ all -> 0x1003 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x08b2
            r42.d0()     // Catch:{ all -> 0x1003 }
            f01 r2 = r9.k()     // Catch:{ all -> 0x1003 }
            sy0 r2 = (defpackage.sy0) r2     // Catch:{ all -> 0x1003 }
            qs0 r2 = (defpackage.qs0) r2     // Catch:{ all -> 0x1003 }
            ss0 r2 = com.google.android.gms.measurement.internal.ba.y(r2, r6)     // Catch:{ all -> 0x1003 }
            if (r2 != 0) goto L_0x08b2
            if (r29 == 0) goto L_0x08b2
            long r14 = r29.R()     // Catch:{ all -> 0x1003 }
            long r17 = r9.R()     // Catch:{ all -> 0x1003 }
            long r14 = r14 - r17
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x1003 }
            r17 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x08b2
            java.lang.Object r2 = r29.clone()     // Catch:{ all -> 0x1003 }
            sy0$b r2 = (defpackage.sy0.b) r2     // Catch:{ all -> 0x1003 }
            qs0$a r2 = (defpackage.qs0.a) r2     // Catch:{ all -> 0x1003 }
            r1.N(r2, r9)     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = r2.P()     // Catch:{ all -> 0x1003 }
            boolean r12 = r11.equals(r12)     // Catch:{ all -> 0x1003 }
            com.google.android.gms.common.internal.r.a(r12)     // Catch:{ all -> 0x1003 }
            r42.d0()     // Catch:{ all -> 0x1003 }
            f01 r12 = r2.k()     // Catch:{ all -> 0x1003 }
            sy0 r12 = (defpackage.sy0) r12     // Catch:{ all -> 0x1003 }
            qs0 r12 = (defpackage.qs0) r12     // Catch:{ all -> 0x1003 }
            java.lang.String r14 = "_sn"
            ss0 r12 = com.google.android.gms.measurement.internal.ba.y(r12, r14)     // Catch:{ all -> 0x1003 }
            r42.d0()     // Catch:{ all -> 0x1003 }
            f01 r14 = r2.k()     // Catch:{ all -> 0x1003 }
            sy0 r14 = (defpackage.sy0) r14     // Catch:{ all -> 0x1003 }
            qs0 r14 = (defpackage.qs0) r14     // Catch:{ all -> 0x1003 }
            java.lang.String r15 = "_sc"
            ss0 r14 = com.google.android.gms.measurement.internal.ba.y(r14, r15)     // Catch:{ all -> 0x1003 }
            r42.d0()     // Catch:{ all -> 0x1003 }
            f01 r15 = r2.k()     // Catch:{ all -> 0x1003 }
            sy0 r15 = (defpackage.sy0) r15     // Catch:{ all -> 0x1003 }
            qs0 r15 = (defpackage.qs0) r15     // Catch:{ all -> 0x1003 }
            java.lang.String r3 = "_si"
            ss0 r3 = com.google.android.gms.measurement.internal.ba.y(r15, r3)     // Catch:{ all -> 0x1003 }
            if (r12 == 0) goto L_0x0869
            java.lang.String r12 = r12.T()     // Catch:{ all -> 0x1003 }
            goto L_0x086b
        L_0x0869:
            r12 = r25
        L_0x086b:
            boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x1003 }
            if (r15 != 0) goto L_0x087a
            com.google.android.gms.measurement.internal.ba r15 = r42.d0()     // Catch:{ all -> 0x1003 }
            java.lang.String r7 = "_sn"
            r15.H(r9, r7, r12)     // Catch:{ all -> 0x1003 }
        L_0x087a:
            if (r14 == 0) goto L_0x0881
            java.lang.String r7 = r14.T()     // Catch:{ all -> 0x1003 }
            goto L_0x0883
        L_0x0881:
            r7 = r25
        L_0x0883:
            boolean r12 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x1003 }
            if (r12 != 0) goto L_0x0892
            com.google.android.gms.measurement.internal.ba r12 = r42.d0()     // Catch:{ all -> 0x1003 }
            java.lang.String r14 = "_sc"
            r12.H(r9, r14, r7)     // Catch:{ all -> 0x1003 }
        L_0x0892:
            if (r3 == 0) goto L_0x08a5
            com.google.android.gms.measurement.internal.ba r7 = r42.d0()     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = "_si"
            long r14 = r3.X()     // Catch:{ all -> 0x1003 }
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x1003 }
            r7.H(r9, r12, r3)     // Catch:{ all -> 0x1003 }
        L_0x08a5:
            r4.x(r10, r2)     // Catch:{ all -> 0x1003 }
            r7 = r10
            r29 = 0
            goto L_0x08b3
        L_0x08ac:
            r10 = r22
            r6 = r30
            r4 = r31
        L_0x08b2:
            r7 = r10
        L_0x08b3:
            if (r21 != 0) goto L_0x0912
            java.lang.String r2 = r9.P()     // Catch:{ all -> 0x1003 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x0912
            int r2 = r9.I()     // Catch:{ all -> 0x1003 }
            if (r2 != 0) goto L_0x08df
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.H()     // Catch:{ all -> 0x1003 }
            java.lang.String r3 = "Engagement event does not contain any parameters. appId"
            us0 r6 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r6 = r6.T2()     // Catch:{ all -> 0x1003 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.c4.w(r6)     // Catch:{ all -> 0x1003 }
        L_0x08db:
            r2.b(r3, r6)     // Catch:{ all -> 0x1003 }
            goto L_0x0912
        L_0x08df:
            com.google.android.gms.measurement.internal.ba r2 = r42.d0()     // Catch:{ all -> 0x1003 }
            f01 r3 = r9.k()     // Catch:{ all -> 0x1003 }
            sy0 r3 = (defpackage.sy0) r3     // Catch:{ all -> 0x1003 }
            qs0 r3 = (defpackage.qs0) r3     // Catch:{ all -> 0x1003 }
            java.lang.Object r2 = r2.U(r3, r6)     // Catch:{ all -> 0x1003 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x1003 }
            if (r2 != 0) goto L_0x090a
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.H()     // Catch:{ all -> 0x1003 }
            java.lang.String r3 = "Engagement event does not include duration. appId"
            us0 r6 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r6 = r6.T2()     // Catch:{ all -> 0x1003 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.c4.w(r6)     // Catch:{ all -> 0x1003 }
            goto L_0x08db
        L_0x090a:
            long r2 = r2.longValue()     // Catch:{ all -> 0x1003 }
            long r2 = r27 + r2
            r27 = r2
        L_0x0912:
            java.util.List<qs0> r2 = r5.c     // Catch:{ all -> 0x1003 }
            f01 r3 = r9.k()     // Catch:{ all -> 0x1003 }
            sy0 r3 = (defpackage.sy0) r3     // Catch:{ all -> 0x1003 }
            qs0 r3 = (defpackage.qs0) r3     // Catch:{ all -> 0x1003 }
            r6 = r26
            r2.set(r6, r3)     // Catch:{ all -> 0x1003 }
            int r14 = r20 + 1
            r4.B(r9)     // Catch:{ all -> 0x1003 }
            r10 = r29
            r11 = r32
        L_0x092a:
            int r12 = r6 + 1
            r3 = r16
            r2 = r19
            r6 = r21
            r15 = r27
            goto L_0x029e
        L_0x0936:
            r6 = r2
            r10 = r13
            r11 = r14
            r27 = r15
            if (r21 == 0) goto L_0x0992
            r14 = r20
            r15 = r27
            r2 = 0
        L_0x0942:
            if (r2 >= r14) goto L_0x0990
            qs0 r3 = r4.O(r2)     // Catch:{ all -> 0x1003 }
            java.lang.String r7 = r3.U()     // Catch:{ all -> 0x1003 }
            boolean r7 = r11.equals(r7)     // Catch:{ all -> 0x1003 }
            if (r7 == 0) goto L_0x0963
            r42.d0()     // Catch:{ all -> 0x1003 }
            ss0 r7 = com.google.android.gms.measurement.internal.ba.y(r3, r10)     // Catch:{ all -> 0x1003 }
            if (r7 == 0) goto L_0x0963
            r4.U(r2)     // Catch:{ all -> 0x1003 }
            int r14 = r14 + -1
            int r2 = r2 + -1
            goto L_0x098d
        L_0x0963:
            r42.d0()     // Catch:{ all -> 0x1003 }
            ss0 r3 = com.google.android.gms.measurement.internal.ba.y(r3, r6)     // Catch:{ all -> 0x1003 }
            if (r3 == 0) goto L_0x098d
            boolean r7 = r3.W()     // Catch:{ all -> 0x1003 }
            if (r7 == 0) goto L_0x097b
            long r7 = r3.X()     // Catch:{ all -> 0x1003 }
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x1003 }
            goto L_0x097c
        L_0x097b:
            r3 = 0
        L_0x097c:
            if (r3 == 0) goto L_0x098d
            long r7 = r3.longValue()     // Catch:{ all -> 0x1003 }
            r12 = 0
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x098d
            long r7 = r3.longValue()     // Catch:{ all -> 0x1003 }
            long r15 = r15 + r7
        L_0x098d:
            r3 = 1
            int r2 = r2 + r3
            goto L_0x0942
        L_0x0990:
            r2 = r15
            goto L_0x0994
        L_0x0992:
            r2 = r27
        L_0x0994:
            r6 = 0
            r1.m(r4, r2, r6)     // Catch:{ all -> 0x1003 }
            java.util.List r6 = r4.K()     // Catch:{ all -> 0x1003 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x1003 }
        L_0x09a0:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x1003 }
            if (r7 == 0) goto L_0x09ba
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x1003 }
            qs0 r7 = (defpackage.qs0) r7     // Catch:{ all -> 0x1003 }
            java.lang.String r8 = "_s"
            java.lang.String r7 = r7.U()     // Catch:{ all -> 0x1003 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x1003 }
            if (r7 == 0) goto L_0x09a0
            r6 = 1
            goto L_0x09bb
        L_0x09ba:
            r6 = 0
        L_0x09bb:
            java.lang.String r7 = "_se"
            if (r6 == 0) goto L_0x09ca
            com.google.android.gms.measurement.internal.d r6 = r42.Z()     // Catch:{ all -> 0x1003 }
            java.lang.String r8 = r4.E0()     // Catch:{ all -> 0x1003 }
            r6.l0(r8, r7)     // Catch:{ all -> 0x1003 }
        L_0x09ca:
            java.lang.String r6 = "_sid"
            int r6 = com.google.android.gms.measurement.internal.ba.u(r4, r6)     // Catch:{ all -> 0x1003 }
            if (r6 < 0) goto L_0x09d4
            r6 = 1
            goto L_0x09d5
        L_0x09d4:
            r6 = 0
        L_0x09d5:
            if (r6 == 0) goto L_0x09dc
            r6 = 1
            r1.m(r4, r2, r6)     // Catch:{ all -> 0x1003 }
            goto L_0x09fe
        L_0x09dc:
            int r2 = com.google.android.gms.measurement.internal.ba.u(r4, r7)     // Catch:{ all -> 0x1003 }
            if (r2 < 0) goto L_0x09fe
            r4.g0(r2)     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x1003 }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            us0 r6 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r6 = r6.T2()     // Catch:{ all -> 0x1003 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.c4.w(r6)     // Catch:{ all -> 0x1003 }
            r2.b(r3, r6)     // Catch:{ all -> 0x1003 }
        L_0x09fe:
            com.google.android.gms.measurement.internal.ba r2 = r42.d0()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r3 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.M()     // Catch:{ all -> 0x1003 }
            java.lang.String r6 = "Checking account type status for ad personalization signals"
            r3.a(r6)     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.b5 r3 = r2.p()     // Catch:{ all -> 0x1003 }
            java.lang.String r6 = r4.E0()     // Catch:{ all -> 0x1003 }
            boolean r3 = r3.F(r6)     // Catch:{ all -> 0x1003 }
            if (r3 == 0) goto L_0x0a8c
            com.google.android.gms.measurement.internal.d r3 = r2.m()     // Catch:{ all -> 0x1003 }
            java.lang.String r6 = r4.E0()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.f4 r3 = r3.j0(r6)     // Catch:{ all -> 0x1003 }
            if (r3 == 0) goto L_0x0a8c
            boolean r3 = r3.l()     // Catch:{ all -> 0x1003 }
            if (r3 == 0) goto L_0x0a8c
            com.google.android.gms.measurement.internal.m r3 = r2.c()     // Catch:{ all -> 0x1003 }
            boolean r3 = r3.y()     // Catch:{ all -> 0x1003 }
            if (r3 == 0) goto L_0x0a8c
            com.google.android.gms.measurement.internal.c4 r3 = r2.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.L()     // Catch:{ all -> 0x1003 }
            java.lang.String r6 = "Turning off ad personalization due to account type"
            r3.a(r6)     // Catch:{ all -> 0x1003 }
            ys0$a r3 = defpackage.ys0.Y()     // Catch:{ all -> 0x1003 }
            r6 = r19
            r3.A(r6)     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.m r2 = r2.c()     // Catch:{ all -> 0x1003 }
            long r7 = r2.w()     // Catch:{ all -> 0x1003 }
            r3.y(r7)     // Catch:{ all -> 0x1003 }
            r7 = 1
            r3.C(r7)     // Catch:{ all -> 0x1003 }
            f01 r2 = r3.k()     // Catch:{ all -> 0x1003 }
            sy0 r2 = (defpackage.sy0) r2     // Catch:{ all -> 0x1003 }
            ys0 r2 = (defpackage.ys0) r2     // Catch:{ all -> 0x1003 }
            r3 = 0
        L_0x0a6a:
            int r7 = r4.f0()     // Catch:{ all -> 0x1003 }
            if (r3 >= r7) goto L_0x0a86
            ys0 r7 = r4.c0(r3)     // Catch:{ all -> 0x1003 }
            java.lang.String r7 = r7.Q()     // Catch:{ all -> 0x1003 }
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x1003 }
            if (r7 == 0) goto L_0x0a83
            r4.y(r3, r2)     // Catch:{ all -> 0x1003 }
            r3 = 1
            goto L_0x0a87
        L_0x0a83:
            int r3 = r3 + 1
            goto L_0x0a6a
        L_0x0a86:
            r3 = 0
        L_0x0a87:
            if (r3 != 0) goto L_0x0a8c
            r4.D(r2)     // Catch:{ all -> 0x1003 }
        L_0x0a8c:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.P(r2)     // Catch:{ all -> 0x1003 }
            r2 = -9223372036854775808
            r4.V(r2)     // Catch:{ all -> 0x1003 }
            r2 = 0
        L_0x0a9a:
            int r3 = r4.L()     // Catch:{ all -> 0x1003 }
            if (r2 >= r3) goto L_0x0acd
            qs0 r3 = r4.O(r2)     // Catch:{ all -> 0x1003 }
            long r6 = r3.W()     // Catch:{ all -> 0x1003 }
            long r8 = r4.k0()     // Catch:{ all -> 0x1003 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0ab7
            long r6 = r3.W()     // Catch:{ all -> 0x1003 }
            r4.P(r6)     // Catch:{ all -> 0x1003 }
        L_0x0ab7:
            long r6 = r3.W()     // Catch:{ all -> 0x1003 }
            long r8 = r4.p0()     // Catch:{ all -> 0x1003 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0aca
            long r6 = r3.W()     // Catch:{ all -> 0x1003 }
            r4.V(r6)     // Catch:{ all -> 0x1003 }
        L_0x0aca:
            int r2 = r2 + 1
            goto L_0x0a9a
        L_0x0acd:
            boolean r2 = defpackage.y51.a()     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x0ae8
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.wa r2 = r2.b()     // Catch:{ all -> 0x1003 }
            java.lang.String r3 = r4.E0()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.u.O0     // Catch:{ all -> 0x1003 }
            boolean r2 = r2.C(r3, r6)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x0ae8
            r4.T0()     // Catch:{ all -> 0x1003 }
        L_0x0ae8:
            r4.R0()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.ma r6 = r42.b0()     // Catch:{ all -> 0x1003 }
            java.lang.String r7 = r4.E0()     // Catch:{ all -> 0x1003 }
            java.util.List r8 = r4.K()     // Catch:{ all -> 0x1003 }
            java.util.List r9 = r4.e0()     // Catch:{ all -> 0x1003 }
            long r2 = r4.k0()     // Catch:{ all -> 0x1003 }
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x1003 }
            long r2 = r4.p0()     // Catch:{ all -> 0x1003 }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x1003 }
            java.util.List r2 = r6.v(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x1003 }
            r4.W(r2)     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.wa r2 = r2.b()     // Catch:{ all -> 0x1003 }
            us0 r3 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r3 = r3.T2()     // Catch:{ all -> 0x1003 }
            boolean r2 = r2.K(r3)     // Catch:{ all -> 0x1003 }
            if (r2 == 0) goto L_0x0e58
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0fe2 }
            r2.<init>()     // Catch:{ all -> 0x0fe2 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0fe2 }
            r3.<init>()     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.j     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.fa r6 = r6.G()     // Catch:{ all -> 0x0fe2 }
            java.security.SecureRandom r6 = r6.H0()     // Catch:{ all -> 0x0fe2 }
            r7 = 0
        L_0x0b39:
            int r8 = r4.L()     // Catch:{ all -> 0x0fe2 }
            if (r7 >= r8) goto L_0x0e20
            qs0 r8 = r4.O(r7)     // Catch:{ all -> 0x0fe2 }
            sy0$b r8 = r8.w()     // Catch:{ all -> 0x0fe2 }
            qs0$a r8 = (defpackage.qs0.a) r8     // Catch:{ all -> 0x0fe2 }
            java.lang.String r9 = r8.P()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0fe2 }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0bcd
            com.google.android.gms.measurement.internal.ba r9 = r42.d0()     // Catch:{ all -> 0x1003 }
            f01 r11 = r8.k()     // Catch:{ all -> 0x1003 }
            sy0 r11 = (defpackage.sy0) r11     // Catch:{ all -> 0x1003 }
            qs0 r11 = (defpackage.qs0) r11     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = "_en"
            java.lang.Object r9 = r9.U(r11, r12)     // Catch:{ all -> 0x1003 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x1003 }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.o r11 = (com.google.android.gms.measurement.internal.o) r11     // Catch:{ all -> 0x1003 }
            if (r11 != 0) goto L_0x0b84
            com.google.android.gms.measurement.internal.d r11 = r42.Z()     // Catch:{ all -> 0x1003 }
            us0 r12 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = r12.T2()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.o r11 = r11.D(r12, r9)     // Catch:{ all -> 0x1003 }
            r2.put(r9, r11)     // Catch:{ all -> 0x1003 }
        L_0x0b84:
            java.lang.Long r9 = r11.i     // Catch:{ all -> 0x1003 }
            if (r9 != 0) goto L_0x0bc3
            java.lang.Long r9 = r11.j     // Catch:{ all -> 0x1003 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x1003 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0b9d
            com.google.android.gms.measurement.internal.ba r9 = r42.d0()     // Catch:{ all -> 0x1003 }
            java.lang.Long r12 = r11.j     // Catch:{ all -> 0x1003 }
            r9.H(r8, r10, r12)     // Catch:{ all -> 0x1003 }
        L_0x0b9d:
            java.lang.Boolean r9 = r11.k     // Catch:{ all -> 0x1003 }
            if (r9 == 0) goto L_0x0bb8
            java.lang.Boolean r9 = r11.k     // Catch:{ all -> 0x1003 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x1003 }
            if (r9 == 0) goto L_0x0bb8
            com.google.android.gms.measurement.internal.ba r9 = r42.d0()     // Catch:{ all -> 0x1003 }
            java.lang.String r10 = "_efs"
            r11 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x1003 }
            r9.H(r8, r10, r13)     // Catch:{ all -> 0x1003 }
        L_0x0bb8:
            f01 r9 = r8.k()     // Catch:{ all -> 0x1003 }
            sy0 r9 = (defpackage.sy0) r9     // Catch:{ all -> 0x1003 }
            qs0 r9 = (defpackage.qs0) r9     // Catch:{ all -> 0x1003 }
            r3.add(r9)     // Catch:{ all -> 0x1003 }
        L_0x0bc3:
            r4.x(r7, r8)     // Catch:{ all -> 0x1003 }
        L_0x0bc6:
            r43 = r5
            r19 = r6
            r5 = r2
            goto L_0x0e15
        L_0x0bcd:
            com.google.android.gms.measurement.internal.b5 r9 = r42.V()     // Catch:{ all -> 0x0fe2 }
            us0 r11 = r5.a     // Catch:{ all -> 0x0fe2 }
            java.lang.String r11 = r11.T2()     // Catch:{ all -> 0x0fe2 }
            long r11 = r9.G(r11)     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.h5 r9 = r1.j     // Catch:{ all -> 0x0fe2 }
            r9.G()     // Catch:{ all -> 0x0fe2 }
            long r13 = r8.R()     // Catch:{ all -> 0x0fe2 }
            long r13 = com.google.android.gms.measurement.internal.fa.w(r13, r11)     // Catch:{ all -> 0x0fe2 }
            f01 r9 = r8.k()     // Catch:{ all -> 0x0fe2 }
            sy0 r9 = (defpackage.sy0) r9     // Catch:{ all -> 0x0fe2 }
            qs0 r9 = (defpackage.qs0) r9     // Catch:{ all -> 0x0fe2 }
            java.lang.String r15 = "_dbg"
            r19 = r11
            r16 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0fe2 }
            boolean r12 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0fe2 }
            if (r12 != 0) goto L_0x0c5a
            if (r11 != 0) goto L_0x0c03
            goto L_0x0c5a
        L_0x0c03:
            java.util.List r9 = r9.B()     // Catch:{ all -> 0x1003 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x1003 }
        L_0x0c0b:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x1003 }
            if (r12 == 0) goto L_0x0c5a
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x1003 }
            ss0 r12 = (defpackage.ss0) r12     // Catch:{ all -> 0x1003 }
            r43 = r9
            java.lang.String r9 = r12.N()     // Catch:{ all -> 0x1003 }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x1003 }
            if (r9 == 0) goto L_0x0c57
            boolean r9 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x1003 }
            if (r9 == 0) goto L_0x0c35
            long r15 = r12.X()     // Catch:{ all -> 0x1003 }
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x1003 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x1003 }
            if (r9 != 0) goto L_0x0c55
        L_0x0c35:
            boolean r9 = r11 instanceof java.lang.String     // Catch:{ all -> 0x1003 }
            if (r9 == 0) goto L_0x0c43
            java.lang.String r9 = r12.T()     // Catch:{ all -> 0x1003 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x1003 }
            if (r9 != 0) goto L_0x0c55
        L_0x0c43:
            boolean r9 = r11 instanceof java.lang.Double     // Catch:{ all -> 0x1003 }
            if (r9 == 0) goto L_0x0c5a
            double r15 = r12.b0()     // Catch:{ all -> 0x1003 }
            java.lang.Double r9 = java.lang.Double.valueOf(r15)     // Catch:{ all -> 0x1003 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x1003 }
            if (r9 == 0) goto L_0x0c5a
        L_0x0c55:
            r9 = 1
            goto L_0x0c5b
        L_0x0c57:
            r9 = r43
            goto L_0x0c0b
        L_0x0c5a:
            r9 = 0
        L_0x0c5b:
            if (r9 != 0) goto L_0x0c70
            com.google.android.gms.measurement.internal.b5 r9 = r42.V()     // Catch:{ all -> 0x1003 }
            us0 r11 = r5.a     // Catch:{ all -> 0x1003 }
            java.lang.String r11 = r11.T2()     // Catch:{ all -> 0x1003 }
            java.lang.String r12 = r8.P()     // Catch:{ all -> 0x1003 }
            int r9 = r9.D(r11, r12)     // Catch:{ all -> 0x1003 }
            goto L_0x0c71
        L_0x0c70:
            r9 = 1
        L_0x0c71:
            if (r9 > 0) goto L_0x0c97
            com.google.android.gms.measurement.internal.h5 r10 = r1.j     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.c4 r10 = r10.h()     // Catch:{ all -> 0x1003 }
            com.google.android.gms.measurement.internal.e4 r10 = r10.H()     // Catch:{ all -> 0x1003 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r8.P()     // Catch:{ all -> 0x1003 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1003 }
            r10.c(r11, r12, r9)     // Catch:{ all -> 0x1003 }
            f01 r9 = r8.k()     // Catch:{ all -> 0x1003 }
            sy0 r9 = (defpackage.sy0) r9     // Catch:{ all -> 0x1003 }
            qs0 r9 = (defpackage.qs0) r9     // Catch:{ all -> 0x1003 }
            r3.add(r9)     // Catch:{ all -> 0x1003 }
            goto L_0x0bc3
        L_0x0c97:
            java.lang.String r11 = r8.P()     // Catch:{ all -> 0x0fe2 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.o r11 = (com.google.android.gms.measurement.internal.o) r11     // Catch:{ all -> 0x0fe2 }
            if (r11 != 0) goto L_0x0cf5
            com.google.android.gms.measurement.internal.d r11 = r42.Z()     // Catch:{ all -> 0x0fe2 }
            us0 r12 = r5.a     // Catch:{ all -> 0x0fe2 }
            java.lang.String r12 = r12.T2()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r15 = r8.P()     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.o r11 = r11.D(r12, r15)     // Catch:{ all -> 0x0fe2 }
            if (r11 != 0) goto L_0x0cf5
            com.google.android.gms.measurement.internal.h5 r11 = r1.j     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.c4 r11 = r11.h()     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.e4 r11 = r11.H()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            us0 r15 = r5.a     // Catch:{ all -> 0x0fe2 }
            java.lang.String r15 = r15.T2()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r1 = r8.P()     // Catch:{ all -> 0x0fe2 }
            r11.c(r12, r15, r1)     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.o r11 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x0fe2 }
            us0 r1 = r5.a     // Catch:{ all -> 0x0fe2 }
            java.lang.String r26 = r1.T2()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r27 = r8.P()     // Catch:{ all -> 0x0fe2 }
            r28 = 1
            r30 = 1
            r32 = 1
            long r34 = r8.R()     // Catch:{ all -> 0x0fe2 }
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r25 = r11
            r25.<init>(r26, r27, r28, r30, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x0fe2 }
        L_0x0cf5:
            com.google.android.gms.measurement.internal.ba r1 = r42.d0()     // Catch:{ all -> 0x0fe2 }
            f01 r12 = r8.k()     // Catch:{ all -> 0x0fe2 }
            sy0 r12 = (defpackage.sy0) r12     // Catch:{ all -> 0x0fe2 }
            qs0 r12 = (defpackage.qs0) r12     // Catch:{ all -> 0x0fe2 }
            java.lang.String r15 = "_eid"
            java.lang.Object r1 = r1.U(r12, r15)     // Catch:{ all -> 0x0fe2 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0fe2 }
            if (r1 == 0) goto L_0x0d0d
            r12 = 1
            goto L_0x0d0e
        L_0x0d0d:
            r12 = 0
        L_0x0d0e:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0fe2 }
            r15 = 1
            if (r9 != r15) goto L_0x0d43
            f01 r1 = r8.k()     // Catch:{ all -> 0x0fe2 }
            sy0 r1 = (defpackage.sy0) r1     // Catch:{ all -> 0x0fe2 }
            qs0 r1 = (defpackage.qs0) r1     // Catch:{ all -> 0x0fe2 }
            r3.add(r1)     // Catch:{ all -> 0x0fe2 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0fe2 }
            if (r1 == 0) goto L_0x0d3e
            java.lang.Long r1 = r11.i     // Catch:{ all -> 0x0fe2 }
            if (r1 != 0) goto L_0x0d32
            java.lang.Long r1 = r11.j     // Catch:{ all -> 0x0fe2 }
            if (r1 != 0) goto L_0x0d32
            java.lang.Boolean r1 = r11.k     // Catch:{ all -> 0x0fe2 }
            if (r1 == 0) goto L_0x0d3e
        L_0x0d32:
            r1 = 0
            com.google.android.gms.measurement.internal.o r9 = r11.c(r1, r1, r1)     // Catch:{ all -> 0x0fe2 }
            java.lang.String r1 = r8.P()     // Catch:{ all -> 0x0fe2 }
            r2.put(r1, r9)     // Catch:{ all -> 0x0fe2 }
        L_0x0d3e:
            r4.x(r7, r8)     // Catch:{ all -> 0x0fe2 }
            goto L_0x0bc6
        L_0x0d43:
            int r15 = r6.nextInt(r9)     // Catch:{ all -> 0x0fe2 }
            if (r15 != 0) goto L_0x0d86
            com.google.android.gms.measurement.internal.ba r1 = r42.d0()     // Catch:{ all -> 0x0fe2 }
            r43 = r5
            r15 = r6
            long r5 = (long) r9     // Catch:{ all -> 0x0fe2 }
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fe2 }
            r1.H(r8, r10, r9)     // Catch:{ all -> 0x0fe2 }
            f01 r1 = r8.k()     // Catch:{ all -> 0x0fe2 }
            sy0 r1 = (defpackage.sy0) r1     // Catch:{ all -> 0x0fe2 }
            qs0 r1 = (defpackage.qs0) r1     // Catch:{ all -> 0x0fe2 }
            r3.add(r1)     // Catch:{ all -> 0x0fe2 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0fe2 }
            if (r1 == 0) goto L_0x0d72
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fe2 }
            r5 = 0
            com.google.android.gms.measurement.internal.o r11 = r11.c(r5, r1, r5)     // Catch:{ all -> 0x0fe2 }
        L_0x0d72:
            java.lang.String r1 = r8.P()     // Catch:{ all -> 0x0fe2 }
            long r5 = r8.R()     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.o r5 = r11.b(r5, r13)     // Catch:{ all -> 0x0fe2 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0fe2 }
            r5 = r2
            r19 = r15
            goto L_0x0e12
        L_0x0d86:
            r43 = r5
            r15 = r6
            java.lang.Long r5 = r11.h     // Catch:{ all -> 0x0fe2 }
            if (r5 == 0) goto L_0x0d98
            java.lang.Long r5 = r11.h     // Catch:{ all -> 0x0fe2 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0fe2 }
            r17 = r1
            r16 = r2
            goto L_0x0dad
        L_0x0d98:
            r5 = r42
            com.google.android.gms.measurement.internal.h5 r6 = r5.j     // Catch:{ all -> 0x0fe2 }
            r6.G()     // Catch:{ all -> 0x0fe2 }
            long r5 = r8.S()     // Catch:{ all -> 0x0fe2 }
            r17 = r1
            r16 = r2
            r1 = r19
            long r5 = com.google.android.gms.measurement.internal.fa.w(r5, r1)     // Catch:{ all -> 0x0fe2 }
        L_0x0dad:
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x0dfc
            com.google.android.gms.measurement.internal.ba r1 = r42.d0()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r2 = "_efs"
            r19 = r15
            r5 = 1
            java.lang.Long r15 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fe2 }
            r1.H(r8, r2, r15)     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.ba r1 = r42.d0()     // Catch:{ all -> 0x0fe2 }
            long r5 = (long) r9     // Catch:{ all -> 0x0fe2 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fe2 }
            r1.H(r8, r10, r2)     // Catch:{ all -> 0x0fe2 }
            f01 r1 = r8.k()     // Catch:{ all -> 0x0fe2 }
            sy0 r1 = (defpackage.sy0) r1     // Catch:{ all -> 0x0fe2 }
            qs0 r1 = (defpackage.qs0) r1     // Catch:{ all -> 0x0fe2 }
            r3.add(r1)     // Catch:{ all -> 0x0fe2 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0fe2 }
            if (r1 == 0) goto L_0x0dea
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fe2 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0fe2 }
            r5 = 0
            com.google.android.gms.measurement.internal.o r11 = r11.c(r5, r1, r2)     // Catch:{ all -> 0x0fe2 }
        L_0x0dea:
            java.lang.String r1 = r8.P()     // Catch:{ all -> 0x0fe2 }
            long r5 = r8.R()     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.o r2 = r11.b(r5, r13)     // Catch:{ all -> 0x0fe2 }
            r5 = r16
        L_0x0df8:
            r5.put(r1, r2)     // Catch:{ all -> 0x0fe2 }
            goto L_0x0e12
        L_0x0dfc:
            r19 = r15
            r5 = r16
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0fe2 }
            if (r1 == 0) goto L_0x0e12
            java.lang.String r1 = r8.P()     // Catch:{ all -> 0x0fe2 }
            r2 = r17
            r6 = 0
            com.google.android.gms.measurement.internal.o r2 = r11.c(r2, r6, r6)     // Catch:{ all -> 0x0fe2 }
            goto L_0x0df8
        L_0x0e12:
            r4.x(r7, r8)     // Catch:{ all -> 0x0fe2 }
        L_0x0e15:
            int r7 = r7 + 1
            r1 = r42
            r2 = r5
            r6 = r19
            r5 = r43
            goto L_0x0b39
        L_0x0e20:
            r43 = r5
            r5 = r2
            int r1 = r3.size()     // Catch:{ all -> 0x0fe2 }
            int r2 = r4.L()     // Catch:{ all -> 0x0fe2 }
            if (r1 >= r2) goto L_0x0e33
            r4.T()     // Catch:{ all -> 0x0fe2 }
            r4.G(r3)     // Catch:{ all -> 0x0fe2 }
        L_0x0e33:
            java.util.Set r1 = r5.entrySet()     // Catch:{ all -> 0x0fe2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0fe2 }
        L_0x0e3b:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0fe2 }
            if (r2 == 0) goto L_0x0e55
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0fe2 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.d r3 = r42.Z()     // Catch:{ all -> 0x0fe2 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.o r2 = (com.google.android.gms.measurement.internal.o) r2     // Catch:{ all -> 0x0fe2 }
            r3.N(r2)     // Catch:{ all -> 0x0fe2 }
            goto L_0x0e3b
        L_0x0e55:
            r1 = r43
            goto L_0x0e59
        L_0x0e58:
            r1 = r5
        L_0x0e59:
            us0 r2 = r1.a     // Catch:{ all -> 0x0fe2 }
            java.lang.String r2 = r2.T2()     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.d r3 = r42.Z()     // Catch:{ all -> 0x0fe2 }
            com.google.android.gms.measurement.internal.f4 r3 = r3.j0(r2)     // Catch:{ all -> 0x0fe2 }
            r5 = r42
            if (r3 != 0) goto L_0x0e85
            com.google.android.gms.measurement.internal.h5 r3 = r5.j     // Catch:{ all -> 0x1001 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.h()     // Catch:{ all -> 0x1001 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x1001 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            us0 r7 = r1.a     // Catch:{ all -> 0x1001 }
            java.lang.String r7 = r7.T2()     // Catch:{ all -> 0x1001 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.c4.w(r7)     // Catch:{ all -> 0x1001 }
            r3.b(r6, r7)     // Catch:{ all -> 0x1001 }
            goto L_0x0ee0
        L_0x0e85:
            int r6 = r4.L()     // Catch:{ all -> 0x1001 }
            if (r6 <= 0) goto L_0x0ee0
            long r6 = r3.R()     // Catch:{ all -> 0x1001 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0e99
            r4.h0(r6)     // Catch:{ all -> 0x1001 }
            goto L_0x0e9c
        L_0x0e99:
            r4.x0()     // Catch:{ all -> 0x1001 }
        L_0x0e9c:
            long r8 = r3.P()     // Catch:{ all -> 0x1001 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0ea7
            goto L_0x0ea8
        L_0x0ea7:
            r6 = r8
        L_0x0ea8:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0eb0
            r4.Z(r6)     // Catch:{ all -> 0x1001 }
            goto L_0x0eb3
        L_0x0eb0:
            r4.t0()     // Catch:{ all -> 0x1001 }
        L_0x0eb3:
            r3.i0()     // Catch:{ all -> 0x1001 }
            long r6 = r3.f0()     // Catch:{ all -> 0x1001 }
            int r7 = (int) r6     // Catch:{ all -> 0x1001 }
            r4.q0(r7)     // Catch:{ all -> 0x1001 }
            long r6 = r4.k0()     // Catch:{ all -> 0x1001 }
            r3.a(r6)     // Catch:{ all -> 0x1001 }
            long r6 = r4.p0()     // Catch:{ all -> 0x1001 }
            r3.q(r6)     // Catch:{ all -> 0x1001 }
            java.lang.String r6 = r3.j()     // Catch:{ all -> 0x1001 }
            if (r6 == 0) goto L_0x0ed6
            r4.D0(r6)     // Catch:{ all -> 0x1001 }
            goto L_0x0ed9
        L_0x0ed6:
            r4.N0()     // Catch:{ all -> 0x1001 }
        L_0x0ed9:
            com.google.android.gms.measurement.internal.d r6 = r42.Z()     // Catch:{ all -> 0x1001 }
            r6.O(r3)     // Catch:{ all -> 0x1001 }
        L_0x0ee0:
            int r3 = r4.L()     // Catch:{ all -> 0x1001 }
            if (r3 <= 0) goto L_0x0f41
            com.google.android.gms.measurement.internal.b5 r3 = r42.V()     // Catch:{ all -> 0x1001 }
            us0 r6 = r1.a     // Catch:{ all -> 0x1001 }
            java.lang.String r6 = r6.T2()     // Catch:{ all -> 0x1001 }
            ks0 r3 = r3.u(r6)     // Catch:{ all -> 0x1001 }
            if (r3 == 0) goto L_0x0f05
            boolean r6 = r3.F()     // Catch:{ all -> 0x1001 }
            if (r6 != 0) goto L_0x0efd
            goto L_0x0f05
        L_0x0efd:
            long r6 = r3.G()     // Catch:{ all -> 0x1001 }
            r4.z0(r6)     // Catch:{ all -> 0x1001 }
            goto L_0x0f30
        L_0x0f05:
            us0 r3 = r1.a     // Catch:{ all -> 0x1001 }
            java.lang.String r3 = r3.i0()     // Catch:{ all -> 0x1001 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1001 }
            if (r3 == 0) goto L_0x0f17
            r6 = -1
            r4.z0(r6)     // Catch:{ all -> 0x1001 }
            goto L_0x0f30
        L_0x0f17:
            com.google.android.gms.measurement.internal.h5 r3 = r5.j     // Catch:{ all -> 0x1001 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.h()     // Catch:{ all -> 0x1001 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.H()     // Catch:{ all -> 0x1001 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            us0 r7 = r1.a     // Catch:{ all -> 0x1001 }
            java.lang.String r7 = r7.T2()     // Catch:{ all -> 0x1001 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.c4.w(r7)     // Catch:{ all -> 0x1001 }
            r3.b(r6, r7)     // Catch:{ all -> 0x1001 }
        L_0x0f30:
            com.google.android.gms.measurement.internal.d r3 = r42.Z()     // Catch:{ all -> 0x1001 }
            f01 r4 = r4.k()     // Catch:{ all -> 0x1001 }
            sy0 r4 = (defpackage.sy0) r4     // Catch:{ all -> 0x1001 }
            us0 r4 = (defpackage.us0) r4     // Catch:{ all -> 0x1001 }
            r13 = r18
            r3.R(r4, r13)     // Catch:{ all -> 0x1001 }
        L_0x0f41:
            com.google.android.gms.measurement.internal.d r3 = r42.Z()     // Catch:{ all -> 0x1001 }
            java.util.List<java.lang.Long> r1 = r1.b     // Catch:{ all -> 0x1001 }
            com.google.android.gms.common.internal.r.j(r1)     // Catch:{ all -> 0x1001 }
            r3.b()     // Catch:{ all -> 0x1001 }
            r3.r()     // Catch:{ all -> 0x1001 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x1001 }
            java.lang.String r6 = "rowid in ("
            r4.<init>(r6)     // Catch:{ all -> 0x1001 }
            r6 = 0
        L_0x0f58:
            int r7 = r1.size()     // Catch:{ all -> 0x1001 }
            if (r6 >= r7) goto L_0x0f75
            if (r6 == 0) goto L_0x0f65
            java.lang.String r7 = ","
            r4.append(r7)     // Catch:{ all -> 0x1001 }
        L_0x0f65:
            java.lang.Object r7 = r1.get(r6)     // Catch:{ all -> 0x1001 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x1001 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x1001 }
            r4.append(r7)     // Catch:{ all -> 0x1001 }
            int r6 = r6 + 1
            goto L_0x0f58
        L_0x0f75:
            java.lang.String r6 = ")"
            r4.append(r6)     // Catch:{ all -> 0x1001 }
            android.database.sqlite.SQLiteDatabase r6 = r3.v()     // Catch:{ all -> 0x1001 }
            java.lang.String r7 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x1001 }
            r8 = 0
            int r4 = r6.delete(r7, r4, r8)     // Catch:{ all -> 0x1001 }
            int r6 = r1.size()     // Catch:{ all -> 0x1001 }
            if (r4 == r6) goto L_0x0fa8
            com.google.android.gms.measurement.internal.c4 r3 = r3.h()     // Catch:{ all -> 0x1001 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x1001 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1001 }
            int r1 = r1.size()     // Catch:{ all -> 0x1001 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x1001 }
            r3.c(r6, r4, r1)     // Catch:{ all -> 0x1001 }
        L_0x0fa8:
            com.google.android.gms.measurement.internal.d r1 = r42.Z()     // Catch:{ all -> 0x1001 }
            android.database.sqlite.SQLiteDatabase r3 = r1.v()     // Catch:{ all -> 0x1001 }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0fbf }
            r7 = 0
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0fbf }
            r7 = 1
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0fbf }
            r3.execSQL(r4, r6)     // Catch:{ SQLiteException -> 0x0fbf }
            goto L_0x0fd2
        L_0x0fbf:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.c4 r1 = r1.h()     // Catch:{ all -> 0x1001 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ all -> 0x1001 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.c4.w(r2)     // Catch:{ all -> 0x1001 }
            r1.c(r4, r2, r3)     // Catch:{ all -> 0x1001 }
        L_0x0fd2:
            com.google.android.gms.measurement.internal.d r1 = r42.Z()     // Catch:{ all -> 0x1001 }
            r1.u()     // Catch:{ all -> 0x1001 }
            com.google.android.gms.measurement.internal.d r1 = r42.Z()
            r1.y0()
            r1 = 1
            return r1
        L_0x0fe2:
            r0 = move-exception
            r5 = r42
            goto L_0x1005
        L_0x0fe6:
            r5 = r1
            com.google.android.gms.measurement.internal.d r1 = r42.Z()     // Catch:{ all -> 0x1001 }
            r1.u()     // Catch:{ all -> 0x1001 }
            com.google.android.gms.measurement.internal.d r1 = r42.Z()
            r1.y0()
            r1 = 0
            return r1
        L_0x0ff7:
            r0 = move-exception
            r5 = r1
            goto L_0x0249
        L_0x0ffb:
            if (r6 == 0) goto L_0x1000
            r6.close()     // Catch:{ all -> 0x1001 }
        L_0x1000:
            throw r1     // Catch:{ all -> 0x1001 }
        L_0x1001:
            r0 = move-exception
            goto L_0x1005
        L_0x1003:
            r0 = move-exception
            r5 = r1
        L_0x1005:
            r1 = r0
            com.google.android.gms.measurement.internal.d r2 = r42.Z()
            r2.y0()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.F(java.lang.String, long):boolean");
    }

    private final boolean G() {
        n0();
        g0();
        return Z().G0() || !TextUtils.isEmpty(Z().w());
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void H() {
        /*
            r21 = this;
            r0 = r21
            r21.n0()
            r21.g0()
            long r1 = r0.m
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.common.util.e r1 = r1.l()
            long r1 = r1.a()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.m
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.measurement.internal.c4 r1 = r1.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.l0()
            r1.c()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m0()
            r1.v()
            return
        L_0x004b:
            r0.m = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            boolean r1 = r1.u()
            if (r1 == 0) goto L_0x0239
            boolean r1 = r21.G()
            if (r1 != 0) goto L_0x005d
            goto L_0x0239
        L_0x005d:
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.common.util.e r1 = r1.l()
            long r1 = r1.c()
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.u.A
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.d r5 = r21.Z()
            boolean r5 = r5.H0()
            if (r5 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.d r5 = r21.Z()
            boolean r5 = r5.x()
            if (r5 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r5 = 0
            goto L_0x0090
        L_0x008f:
            r5 = 1
        L_0x0090:
            if (r5 == 0) goto L_0x00b0
            com.google.android.gms.measurement.internal.h5 r10 = r0.j
            com.google.android.gms.measurement.internal.wa r10 = r10.b()
            java.lang.String r10 = r10.O()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00ad
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ad
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.u.v
            goto L_0x00b2
        L_0x00ad:
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.u.u
            goto L_0x00b2
        L_0x00b0:
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.u.t
        L_0x00b2:
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            com.google.android.gms.measurement.internal.h5 r12 = r0.j
            com.google.android.gms.measurement.internal.p4 r12 = r12.x()
            com.google.android.gms.measurement.internal.t4 r12 = r12.e
            long r12 = r12.a()
            com.google.android.gms.measurement.internal.h5 r14 = r0.j
            com.google.android.gms.measurement.internal.p4 r14 = r14.x()
            com.google.android.gms.measurement.internal.t4 r14 = r14.f
            long r14 = r14.a()
            com.google.android.gms.measurement.internal.d r16 = r21.Z()
            r17 = r10
            long r9 = r16.E0()
            com.google.android.gms.measurement.internal.d r11 = r21.Z()
            r19 = r7
            long r6 = r11.F0()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00f7
        L_0x00f4:
            r10 = r3
            goto L_0x016c
        L_0x00f7:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x011d
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x011d
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x011d:
            com.google.android.gms.measurement.internal.ba r5 = r21.d0()
            r12 = r17
            boolean r5 = r5.Q(r8, r12)
            if (r5 != 0) goto L_0x012b
            long r10 = r8 + r12
        L_0x012b:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x016c
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x016c
            r5 = 0
        L_0x0134:
            r6 = 20
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.u.C
            r8 = 0
            java.lang.Object r7 = r7.a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 0
            int r7 = java.lang.Math.max(r9, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x00f4
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r12 = com.google.android.gms.measurement.internal.u.B
            java.lang.Object r12 = r12.a(r8)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r10 = r10 + r12
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0169
            goto L_0x016c
        L_0x0169:
            int r5 = r5 + 1
            goto L_0x0134
        L_0x016c:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x018e
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.measurement.internal.c4 r1 = r1.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.l0()
            r1.c()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m0()
            r1.v()
            return
        L_0x018e:
            com.google.android.gms.measurement.internal.g4 r1 = r21.X()
            boolean r1 = r1.x()
            if (r1 != 0) goto L_0x01b6
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.measurement.internal.c4 r1 = r1.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.String r2 = "No network"
            r1.a(r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.l0()
            r1.b()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m0()
            r1.v()
            return
        L_0x01b6:
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.measurement.internal.p4 r1 = r1.x()
            com.google.android.gms.measurement.internal.t4 r1 = r1.g
            long r1 = r1.a()
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.u.r
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ba r7 = r21.d0()
            boolean r7 = r7.Q(r1, r5)
            if (r7 != 0) goto L_0x01e2
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01e2:
            com.google.android.gms.measurement.internal.n4 r1 = r21.l0()
            r1.c()
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.common.util.e r1 = r1.l()
            long r1 = r1.c()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x021e
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r1 = com.google.android.gms.measurement.internal.u.w
            r2 = 0
            java.lang.Object r1 = r1.a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.measurement.internal.p4 r1 = r1.x()
            com.google.android.gms.measurement.internal.t4 r1 = r1.e
            com.google.android.gms.measurement.internal.h5 r2 = r0.j
            com.google.android.gms.common.util.e r2 = r2.l()
            long r2 = r2.c()
            r1.b(r2)
        L_0x021e:
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.measurement.internal.c4 r1 = r1.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.t9 r1 = r21.m0()
            r1.u(r10)
            return
        L_0x0239:
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.measurement.internal.c4 r1 = r1.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.l0()
            r1.c()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m0()
            r1.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.H():void");
    }

    private final void I() {
        n0();
        if (this.q || this.r || this.s) {
            this.j.h().M().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s));
            return;
        }
        this.j.h().M().a("Stopping uploading service(s)");
        List<Runnable> list = this.n;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.n.clear();
        }
    }

    private final boolean J() {
        String str;
        e4 e4Var;
        FileLock fileLock;
        n0();
        if (!this.j.b().s(u.j0) || (fileLock = this.t) == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.j.n().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.u = channel;
                FileLock tryLock = channel.tryLock();
                this.t = tryLock;
                if (tryLock != null) {
                    this.j.h().M().a("Storage concurrent access okay");
                    return true;
                }
                this.j.h().E().a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e2) {
                e = e2;
                e4Var = this.j.h().E();
                str = "Failed to acquire storage lock";
                e4Var.b(str, e);
                return false;
            } catch (IOException e3) {
                e = e3;
                e4Var = this.j.h().E();
                str = "Failed to access storage lock file";
                e4Var.b(str, e);
                return false;
            } catch (OverlappingFileLockException e4) {
                e = e4;
                e4Var = this.j.h().H();
                str = "Storage lock already acquired";
                e4Var.b(str, e);
                return false;
            }
        } else {
            this.j.h().M().a("Storage concurrent access okay");
            return true;
        }
    }

    private final la K(String str) {
        String str2 = str;
        f4 j0 = Z().j0(str2);
        if (j0 == null || TextUtils.isEmpty(j0.T())) {
            this.j.h().L().b("No app data available; dropping", str2);
            return null;
        }
        Boolean M = M(j0);
        if (M == null || M.booleanValue()) {
            return new la(str, j0.A(), j0.T(), j0.V(), j0.X(), j0.Z(), j0.b0(), (String) null, j0.e0(), false, j0.M(), j0.k(), 0, 0, j0.l(), j0.m(), false, j0.D(), j0.n(), j0.d0(), j0.o(), (!s41.a() || !this.j.b().C(str2, u.k0)) ? null : j0.G(), (!c31.a() || !this.j.b().s(u.Q0)) ? "" : b(str).e());
        }
        this.j.h().E().b("App version does not match; dropping. appId", c4.w(str));
        return null;
    }

    private final Boolean M(f4 f4Var) {
        try {
            if (f4Var.V() != -2147483648L) {
                if (f4Var.V() == ((long) v80.a(this.j.n()).e(f4Var.t(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = v80.a(this.j.n()).e(f4Var.t(), 0).versionName;
                if (f4Var.T() != null && f4Var.T().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void N(qs0.a aVar, qs0.a aVar2) {
        r.a("_e".equals(aVar.P()));
        d0();
        ss0 y2 = ba.y((qs0) ((sy0) aVar.k()), "_et");
        if (y2.W() && y2.X() > 0) {
            long X = y2.X();
            d0();
            ss0 y3 = ba.y((qs0) ((sy0) aVar2.k()), "_et");
            if (y3 != null && y3.X() > 0) {
                X += y3.X();
            }
            d0().H(aVar2, "_et", Long.valueOf(X));
            d0().H(aVar, "_fr", 1L);
        }
    }

    private final void O(s sVar, la laVar) {
        if (t41.a() && this.j.b().s(u.I0)) {
            h4 b2 = h4.b(sVar);
            this.j.G().M(b2.d, Z().B0(laVar.e));
            this.j.G().V(b2, this.j.b().k(laVar.e));
            sVar = b2.a();
        }
        if (this.j.b().s(u.f0) && "_cmp".equals(sVar.e) && "referrer API v2".equals(sVar.f.o("_cis"))) {
            String o2 = sVar.f.o("gclid");
            if (!TextUtils.isEmpty(o2)) {
                v(new ea("_lgclid", sVar.h, o2, "auto"), laVar);
            }
        }
        p(sVar, laVar);
    }

    private static void P(u9 u9Var) {
        if (u9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!u9Var.q()) {
            String valueOf = String.valueOf(u9Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02e1 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0318 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x034e A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x035d A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0391 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x06ae A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x06c2 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0703 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x071f A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x09a2 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017d A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0185 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09f1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void W(com.google.android.gms.measurement.internal.s r27, com.google.android.gms.measurement.internal.la r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "_sno"
            com.google.android.gms.common.internal.r.j(r28)
            java.lang.String r5 = r3.e
            com.google.android.gms.common.internal.r.f(r5)
            long r5 = java.lang.System.nanoTime()
            r26.n0()
            r26.g0()
            java.lang.String r15 = r3.e
            r26.d0()
            boolean r7 = com.google.android.gms.measurement.internal.ba.R(r27, r28)
            if (r7 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r7 = r3.l
            if (r7 != 0) goto L_0x002e
            r1.U(r3)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.b5 r7 = r26.V()
            java.lang.String r8 = r2.e
            boolean r7 = r7.A(r15, r8)
            java.lang.String r14 = "_err"
            r13 = 0
            if (r7 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.h5 r3 = r1.j
            com.google.android.gms.measurement.internal.c4 r3 = r3.h()
            com.google.android.gms.measurement.internal.e4 r3 = r3.H()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r15)
            com.google.android.gms.measurement.internal.h5 r5 = r1.j
            com.google.android.gms.measurement.internal.a4 r5 = r5.H()
            java.lang.String r6 = r2.e
            java.lang.String r5 = r5.v(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.c(r6, r4, r5)
            com.google.android.gms.measurement.internal.b5 r3 = r26.V()
            boolean r3 = r3.H(r15)
            if (r3 != 0) goto L_0x0073
            com.google.android.gms.measurement.internal.b5 r3 = r26.V()
            boolean r3 = r3.I(r15)
            if (r3 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = 0
            goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            if (r3 != 0) goto L_0x008f
            java.lang.String r4 = r2.e
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.h5 r4 = r1.j
            com.google.android.gms.measurement.internal.fa r7 = r4.G()
            r9 = 11
            java.lang.String r11 = r2.e
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.W(r8, r9, r10, r11, r12)
        L_0x008f:
            if (r3 == 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            com.google.android.gms.measurement.internal.f4 r2 = r2.j0(r15)
            if (r2 == 0) goto L_0x00d8
            long r3 = r2.h0()
            long r5 = r2.g0()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.h5 r5 = r1.j
            com.google.android.gms.common.util.e r5 = r5.l()
            long r5 = r5.c()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.u.z
            java.lang.Object r5 = r5.a(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.h5 r3 = r1.j
            com.google.android.gms.measurement.internal.c4 r3 = r3.h()
            com.google.android.gms.measurement.internal.e4 r3 = r3.L()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.a(r4)
            r1.r(r2)
        L_0x00d8:
            return
        L_0x00d9:
            boolean r7 = defpackage.b31.a()
            if (r7 == 0) goto L_0x0108
            com.google.android.gms.measurement.internal.h5 r7 = r1.j
            com.google.android.gms.measurement.internal.wa r7 = r7.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.u.E0
            boolean r7 = r7.s(r8)
            if (r7 == 0) goto L_0x0108
            com.google.android.gms.measurement.internal.h4 r2 = com.google.android.gms.measurement.internal.h4.b(r27)
            com.google.android.gms.measurement.internal.h5 r7 = r1.j
            com.google.android.gms.measurement.internal.fa r7 = r7.G()
            com.google.android.gms.measurement.internal.h5 r8 = r1.j
            com.google.android.gms.measurement.internal.wa r8 = r8.b()
            int r8 = r8.k(r15)
            r7.V(r2, r8)
            com.google.android.gms.measurement.internal.s r2 = r2.a()
        L_0x0108:
            com.google.android.gms.measurement.internal.h5 r7 = r1.j
            com.google.android.gms.measurement.internal.c4 r7 = r7.h()
            r8 = 2
            boolean r7 = r7.B(r8)
            if (r7 == 0) goto L_0x012e
            com.google.android.gms.measurement.internal.h5 r7 = r1.j
            com.google.android.gms.measurement.internal.c4 r7 = r7.h()
            com.google.android.gms.measurement.internal.e4 r7 = r7.M()
            com.google.android.gms.measurement.internal.h5 r9 = r1.j
            com.google.android.gms.measurement.internal.a4 r9 = r9.H()
            java.lang.String r9 = r9.u(r2)
            java.lang.String r10 = "Logging event"
            r7.b(r10, r9)
        L_0x012e:
            com.google.android.gms.measurement.internal.d r7 = r26.Z()
            r7.t0()
            r1.U(r3)     // Catch:{ all -> 0x09f1 }
            boolean r7 = defpackage.i31.a()     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x014e
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r7 = r7.b()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.u.D0     // Catch:{ all -> 0x09f1 }
            boolean r7 = r7.s(r9)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x014e
            r7 = 1
            goto L_0x014f
        L_0x014e:
            r7 = 0
        L_0x014f:
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r10 = r2.e     // Catch:{ all -> 0x09f1 }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x09f1 }
            java.lang.String r10 = "refund"
            if (r9 != 0) goto L_0x0172
            if (r7 == 0) goto L_0x0170
            java.lang.String r7 = "purchase"
            java.lang.String r9 = r2.e     // Catch:{ all -> 0x09f1 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x0172
            java.lang.String r7 = r2.e     // Catch:{ all -> 0x09f1 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            r7 = 0
            goto L_0x0173
        L_0x0172:
            r7 = 1
        L_0x0173:
            java.lang.String r9 = "_iap"
            java.lang.String r11 = r2.e     // Catch:{ all -> 0x09f1 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x09f1 }
            if (r9 != 0) goto L_0x0182
            if (r7 == 0) goto L_0x0180
            goto L_0x0182
        L_0x0180:
            r9 = 0
            goto L_0x0183
        L_0x0182:
            r9 = 1
        L_0x0183:
            if (r9 == 0) goto L_0x0327
            com.google.android.gms.measurement.internal.n r9 = r2.f     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = "currency"
            java.lang.String r9 = r9.o(r11)     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = "value"
            if (r7 == 0) goto L_0x0200
            com.google.android.gms.measurement.internal.n r7 = r2.f     // Catch:{ all -> 0x09f1 }
            java.lang.Double r7 = r7.n(r11)     // Catch:{ all -> 0x09f1 }
            double r17 = r7.doubleValue()     // Catch:{ all -> 0x09f1 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r7 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            com.google.android.gms.measurement.internal.n r7 = r2.f     // Catch:{ all -> 0x09f1 }
            java.lang.Long r7 = r7.m(r11)     // Catch:{ all -> 0x09f1 }
            long r12 = r7.longValue()     // Catch:{ all -> 0x09f1 }
            double r11 = (double) r12     // Catch:{ all -> 0x09f1 }
            double r17 = r11 * r19
        L_0x01b5:
            r11 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01e3
            r11 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01e3
            long r11 = java.lang.Math.round(r17)     // Catch:{ all -> 0x09f1 }
            boolean r7 = defpackage.i31.a()     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x020a
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r7 = r7.b()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.u.D0     // Catch:{ all -> 0x09f1 }
            boolean r7 = r7.s(r13)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x020a
            java.lang.String r7 = r2.e     // Catch:{ all -> 0x09f1 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x020a
            long r11 = -r11
            goto L_0x020a
        L_0x01e3:
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.c4 r7 = r7.h()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e4 r7 = r7.H()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r15)     // Catch:{ all -> 0x09f1 }
            java.lang.Double r10 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x09f1 }
            r7.c(r8, r9, r10)     // Catch:{ all -> 0x09f1 }
            r23 = r5
            r5 = 0
            r11 = 0
            goto L_0x0316
        L_0x0200:
            com.google.android.gms.measurement.internal.n r7 = r2.f     // Catch:{ all -> 0x09f1 }
            java.lang.Long r7 = r7.m(r11)     // Catch:{ all -> 0x09f1 }
            long r11 = r7.longValue()     // Catch:{ all -> 0x09f1 }
        L_0x020a:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x0312
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x09f1 }
            java.lang.String r7 = r9.toUpperCase(r7)     // Catch:{ all -> 0x09f1 }
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r7.matches(r9)     // Catch:{ all -> 0x09f1 }
            if (r9 == 0) goto L_0x0312
            java.lang.String r9 = "_ltv_"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x09f1 }
            int r10 = r7.length()     // Catch:{ all -> 0x09f1 }
            if (r10 == 0) goto L_0x022f
            java.lang.String r7 = r9.concat(r7)     // Catch:{ all -> 0x09f1 }
            goto L_0x0234
        L_0x022f:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x09f1 }
            r7.<init>(r9)     // Catch:{ all -> 0x09f1 }
        L_0x0234:
            r10 = r7
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.ga r7 = r7.o0(r15, r10)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x0270
            java.lang.Object r9 = r7.e     // Catch:{ all -> 0x09f1 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x09f1 }
            if (r9 != 0) goto L_0x0246
            goto L_0x0270
        L_0x0246:
            java.lang.Object r7 = r7.e     // Catch:{ all -> 0x09f1 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x09f1 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.ga r17 = new com.google.android.gms.measurement.internal.ga     // Catch:{ all -> 0x09f1 }
            java.lang.String r9 = r2.g     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r13 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.common.util.e r13 = r13.l()     // Catch:{ all -> 0x09f1 }
            long r18 = r13.c()     // Catch:{ all -> 0x09f1 }
            long r7 = r7 + r11
            java.lang.Long r13 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09f1 }
            r7 = r17
            r8 = r15
            r23 = r5
            r5 = 0
            r6 = 1
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09f1 }
        L_0x026d:
            r6 = r17
            goto L_0x02d7
        L_0x0270:
            r23 = r5
            r5 = 0
            r6 = 1
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r9 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r9 = r9.b()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.u.E     // Catch:{ all -> 0x09f1 }
            int r9 = r9.u(r15, r13)     // Catch:{ all -> 0x09f1 }
            int r9 = r9 - r6
            com.google.android.gms.common.internal.r.f(r15)     // Catch:{ all -> 0x09f1 }
            r7.b()     // Catch:{ all -> 0x09f1 }
            r7.r()     // Catch:{ all -> 0x09f1 }
            android.database.sqlite.SQLiteDatabase r13 = r7.v()     // Catch:{ SQLiteException -> 0x02a9 }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x02a9 }
            r6[r5] = r15     // Catch:{ SQLiteException -> 0x02a9 }
            r16 = 1
            r6[r16] = r15     // Catch:{ SQLiteException -> 0x02a9 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x02a9 }
            r16 = 2
            r6[r16] = r9     // Catch:{ SQLiteException -> 0x02a9 }
            r13.execSQL(r8, r6)     // Catch:{ SQLiteException -> 0x02a9 }
            goto L_0x02bc
        L_0x02a9:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.c4 r7 = r7.h()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e4 r7 = r7.E()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = "Error pruning currencies. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r15)     // Catch:{ all -> 0x09f1 }
            r7.c(r8, r9, r6)     // Catch:{ all -> 0x09f1 }
        L_0x02bc:
            com.google.android.gms.measurement.internal.ga r17 = new com.google.android.gms.measurement.internal.ga     // Catch:{ all -> 0x09f1 }
            java.lang.String r9 = r2.g     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.common.util.e r6 = r6.l()     // Catch:{ all -> 0x09f1 }
            long r18 = r6.c()     // Catch:{ all -> 0x09f1 }
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x09f1 }
            r7 = r17
            r8 = r15
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09f1 }
            goto L_0x026d
        L_0x02d7:
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09f1 }
            boolean r7 = r7.T(r6)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x0315
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.c4 r7 = r7.h()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e4 r7 = r7.E()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r15)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r10 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.a4 r10 = r10.H()     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = r6.c     // Catch:{ all -> 0x09f1 }
            java.lang.String r10 = r10.z(r11)     // Catch:{ all -> 0x09f1 }
            java.lang.Object r6 = r6.e     // Catch:{ all -> 0x09f1 }
            r7.d(r8, r9, r10, r6)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.fa r7 = r6.G()     // Catch:{ all -> 0x09f1 }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09f1 }
            goto L_0x0315
        L_0x0312:
            r23 = r5
            r5 = 0
        L_0x0315:
            r11 = 1
        L_0x0316:
            if (r11 != 0) goto L_0x032a
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09f1 }
            r2.u()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            return
        L_0x0327:
            r23 = r5
            r5 = 0
        L_0x032a:
            java.lang.String r6 = r2.e     // Catch:{ all -> 0x09f1 }
            boolean r6 = com.google.android.gms.measurement.internal.fa.d0(r6)     // Catch:{ all -> 0x09f1 }
            java.lang.String r7 = r2.e     // Catch:{ all -> 0x09f1 }
            boolean r18 = r14.equals(r7)     // Catch:{ all -> 0x09f1 }
            boolean r7 = defpackage.i31.a()     // Catch:{ all -> 0x09f1 }
            r19 = 1
            if (r7 == 0) goto L_0x035d
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r7 = r7.b()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = r3.e     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.u.z0     // Catch:{ all -> 0x09f1 }
            boolean r7 = r7.C(r8, r9)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x035d
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            r7.G()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.n r7 = r2.f     // Catch:{ all -> 0x09f1 }
            long r7 = com.google.android.gms.measurement.internal.fa.y(r7)     // Catch:{ all -> 0x09f1 }
            long r7 = r7 + r19
            r11 = r7
            goto L_0x035f
        L_0x035d:
            r11 = r19
        L_0x035f:
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09f1 }
            long r8 = r26.o0()     // Catch:{ all -> 0x09f1 }
            r13 = 1
            r16 = 0
            r17 = 0
            r10 = r15
            r14 = r6
            r27 = r15
            r15 = r16
            r16 = r18
            com.google.android.gms.measurement.internal.g r7 = r7.B(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x09f1 }
            long r8 = r7.b     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.u.k     // Catch:{ all -> 0x09f1 }
            r14 = 0
            java.lang.Object r10 = r10.a(r14)     // Catch:{ all -> 0x09f1 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x09f1 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x09f1 }
            long r10 = (long) r10     // Catch:{ all -> 0x09f1 }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x03be
            long r8 = r8 % r10
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x03af
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x09f1 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r27)     // Catch:{ all -> 0x09f1 }
            long r5 = r7.b     // Catch:{ all -> 0x09f1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09f1 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x09f1 }
        L_0x03af:
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09f1 }
            r2.u()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            return
        L_0x03be:
            if (r6 == 0) goto L_0x0413
            long r8 = r7.a     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.u.m     // Catch:{ all -> 0x09f1 }
            java.lang.Object r15 = r15.a(r14)     // Catch:{ all -> 0x09f1 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x09f1 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x09f1 }
            long r14 = (long) r15     // Catch:{ all -> 0x09f1 }
            long r8 = r8 - r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0413
            long r8 = r8 % r10
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x03f2
            com.google.android.gms.measurement.internal.h5 r3 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.h()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x09f1 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.c4.w(r27)     // Catch:{ all -> 0x09f1 }
            long r6 = r7.a     // Catch:{ all -> 0x09f1 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x09f1 }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x09f1 }
        L_0x03f2:
            com.google.android.gms.measurement.internal.h5 r3 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.fa r7 = r3.G()     // Catch:{ all -> 0x09f1 }
            r9 = 16
            java.lang.String r10 = "_ev"
            java.lang.String r11 = r2.e     // Catch:{ all -> 0x09f1 }
            r12 = 0
            r8 = r27
            r7.W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09f1 }
            r2.u()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            return
        L_0x0413:
            if (r18 == 0) goto L_0x0462
            long r8 = r7.d     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r10 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r10 = r10.b()     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = r3.e     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.u.l     // Catch:{ all -> 0x09f1 }
            int r10 = r10.u(r11, r14)     // Catch:{ all -> 0x09f1 }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x09f1 }
            int r10 = java.lang.Math.max(r5, r10)     // Catch:{ all -> 0x09f1 }
            long r10 = (long) r10     // Catch:{ all -> 0x09f1 }
            long r8 = r8 - r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0462
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0453
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x09f1 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r27)     // Catch:{ all -> 0x09f1 }
            long r5 = r7.d     // Catch:{ all -> 0x09f1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09f1 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x09f1 }
        L_0x0453:
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09f1 }
            r2.u()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            return
        L_0x0462:
            com.google.android.gms.measurement.internal.n r7 = r2.f     // Catch:{ all -> 0x09f1 }
            android.os.Bundle r14 = r7.l()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.fa r7 = r7.G()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.g     // Catch:{ all -> 0x09f1 }
            r7.N(r14, r8, r9)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.fa r7 = r7.G()     // Catch:{ all -> 0x09f1 }
            r15 = r27
            boolean r7 = r7.D0(r15)     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x04a1
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.fa r7 = r7.G()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = "_dbg"
            java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09f1 }
            r7.N(r14, r8, r9)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.fa r7 = r7.G()     // Catch:{ all -> 0x09f1 }
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09f1 }
            r7.N(r14, r11, r8)     // Catch:{ all -> 0x09f1 }
        L_0x04a1:
            java.lang.String r7 = "_s"
            java.lang.String r8 = r2.e     // Catch:{ all -> 0x09f1 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x04c8
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = r3.e     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.ga r7 = r7.o0(r8, r4)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x04c8
            java.lang.Object r8 = r7.e     // Catch:{ all -> 0x09f1 }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x09f1 }
            if (r8 == 0) goto L_0x04c8
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.fa r8 = r8.G()     // Catch:{ all -> 0x09f1 }
            java.lang.Object r7 = r7.e     // Catch:{ all -> 0x09f1 }
            r8.N(r14, r4, r7)     // Catch:{ all -> 0x09f1 }
        L_0x04c8:
            com.google.android.gms.measurement.internal.d r4 = r26.Z()     // Catch:{ all -> 0x09f1 }
            long r7 = r4.n0(r15)     // Catch:{ all -> 0x09f1 }
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x04eb
            com.google.android.gms.measurement.internal.h5 r4 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.c4 r4 = r4.h()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()     // Catch:{ all -> 0x09f1 }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.c4.w(r15)     // Catch:{ all -> 0x09f1 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09f1 }
            r4.c(r9, r10, r7)     // Catch:{ all -> 0x09f1 }
        L_0x04eb:
            com.google.android.gms.measurement.internal.l r4 = new com.google.android.gms.measurement.internal.l     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            java.lang.String r9 = r2.g     // Catch:{ all -> 0x09f1 }
            java.lang.String r10 = r2.e     // Catch:{ all -> 0x09f1 }
            long r12 = r2.h     // Catch:{ all -> 0x09f1 }
            r18 = 0
            r7 = r4
            r2 = r10
            r10 = r15
            r5 = r11
            r11 = r2
            r16 = r14
            r2 = r15
            r25 = 0
            r14 = r18
            r7.<init>((com.google.android.gms.measurement.internal.h5) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = r4.b     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.o r7 = r7.D(r2, r8)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x0589
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09f1 }
            long r7 = r7.z0(r2)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r9 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r9 = r9.b()     // Catch:{ all -> 0x09f1 }
            int r9 = r9.t(r2)     // Catch:{ all -> 0x09f1 }
            long r9 = (long) r9     // Catch:{ all -> 0x09f1 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x056f
            if (r6 == 0) goto L_0x056f
            com.google.android.gms.measurement.internal.h5 r3 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.h()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x09f1 }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.c4.w(r2)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.a4 r7 = r7.H()     // Catch:{ all -> 0x09f1 }
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x09f1 }
            java.lang.String r4 = r7.v(r4)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r7 = r7.b()     // Catch:{ all -> 0x09f1 }
            int r7 = r7.t(r2)     // Catch:{ all -> 0x09f1 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x09f1 }
            r3.d(r5, r6, r4, r7)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r3 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.fa r7 = r3.G()     // Catch:{ all -> 0x09f1 }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r2
            r7.W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            return
        L_0x056f:
            com.google.android.gms.measurement.internal.o r6 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x09f1 }
            java.lang.String r9 = r4.b     // Catch:{ all -> 0x09f1 }
            r10 = 0
            r12 = 0
            long r14 = r4.d     // Catch:{ all -> 0x09f1 }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r6
            r8 = r2
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x09f1 }
            goto L_0x0597
        L_0x0589:
            com.google.android.gms.measurement.internal.h5 r2 = r1.j     // Catch:{ all -> 0x09f1 }
            long r8 = r7.f     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.l r4 = r4.a(r2, r8)     // Catch:{ all -> 0x09f1 }
            long r8 = r4.d     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.o r6 = r7.a(r8)     // Catch:{ all -> 0x09f1 }
        L_0x0597:
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09f1 }
            r2.N(r6)     // Catch:{ all -> 0x09f1 }
            r26.n0()     // Catch:{ all -> 0x09f1 }
            r26.g0()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.common.internal.r.j(r4)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.common.internal.r.j(r28)     // Catch:{ all -> 0x09f1 }
            java.lang.String r2 = r4.a     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.common.internal.r.f(r2)     // Catch:{ all -> 0x09f1 }
            java.lang.String r2 = r4.a     // Catch:{ all -> 0x09f1 }
            java.lang.String r6 = r3.e     // Catch:{ all -> 0x09f1 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.common.internal.r.a(r2)     // Catch:{ all -> 0x09f1 }
            us0$a r2 = defpackage.us0.O0()     // Catch:{ all -> 0x09f1 }
            r6 = 1
            r2.w(r6)     // Catch:{ all -> 0x09f1 }
            java.lang.String r7 = "android"
            r2.H(r7)     // Catch:{ all -> 0x09f1 }
            java.lang.String r7 = r3.e     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x05d4
            java.lang.String r7 = r3.e     // Catch:{ all -> 0x09f1 }
            r2.o0(r7)     // Catch:{ all -> 0x09f1 }
        L_0x05d4:
            java.lang.String r7 = r3.h     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x05e1
            java.lang.String r7 = r3.h     // Catch:{ all -> 0x09f1 }
            r2.i0(r7)     // Catch:{ all -> 0x09f1 }
        L_0x05e1:
            java.lang.String r7 = r3.g     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x05ee
            java.lang.String r7 = r3.g     // Catch:{ all -> 0x09f1 }
            r2.s0(r7)     // Catch:{ all -> 0x09f1 }
        L_0x05ee:
            long r7 = r3.n     // Catch:{ all -> 0x09f1 }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x05fd
            long r7 = r3.n     // Catch:{ all -> 0x09f1 }
            int r8 = (int) r7     // Catch:{ all -> 0x09f1 }
            r2.u0(r8)     // Catch:{ all -> 0x09f1 }
        L_0x05fd:
            long r7 = r3.i     // Catch:{ all -> 0x09f1 }
            r2.n0(r7)     // Catch:{ all -> 0x09f1 }
            java.lang.String r7 = r3.f     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x060f
            java.lang.String r7 = r3.f     // Catch:{ all -> 0x09f1 }
            r2.H0(r7)     // Catch:{ all -> 0x09f1 }
        L_0x060f:
            boolean r7 = defpackage.c31.a()     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x0642
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r7 = r7.b()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09f1 }
            boolean r7 = r7.s(r8)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x0642
            java.lang.String r7 = r3.e     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e r7 = r1.b(r7)     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = r3.A     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e r8 = com.google.android.gms.measurement.internal.e.b(r8)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e r7 = r7.k(r8)     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = r3.A     // Catch:{ all -> 0x09f1 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x09f1 }
            if (r8 != 0) goto L_0x0642
            java.lang.String r7 = r7.e()     // Catch:{ all -> 0x09f1 }
            r2.U0(r7)     // Catch:{ all -> 0x09f1 }
        L_0x0642:
            boolean r7 = defpackage.s41.a()     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r7 = r7.b()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = r3.e     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.u.k0     // Catch:{ all -> 0x09f1 }
            boolean r7 = r7.C(r8, r9)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x0691
            java.lang.String r7 = r2.Q0()     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x066f
            java.lang.String r7 = r3.z     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x066f
            java.lang.String r7 = r3.z     // Catch:{ all -> 0x09f1 }
            r2.S0(r7)     // Catch:{ all -> 0x09f1 }
        L_0x066f:
            java.lang.String r7 = r2.Q0()     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x06a6
            java.lang.String r7 = r2.W0()     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x06a6
            java.lang.String r7 = r3.v     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x06a6
            java.lang.String r7 = r3.v     // Catch:{ all -> 0x09f1 }
        L_0x068d:
            r2.P0(r7)     // Catch:{ all -> 0x09f1 }
            goto L_0x06a6
        L_0x0691:
            java.lang.String r7 = r2.Q0()     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x06a6
            java.lang.String r7 = r3.v     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x06a6
            java.lang.String r7 = r3.v     // Catch:{ all -> 0x09f1 }
            goto L_0x068d
        L_0x06a6:
            long r7 = r3.j     // Catch:{ all -> 0x09f1 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x06b3
            long r7 = r3.j     // Catch:{ all -> 0x09f1 }
            r2.v0(r7)     // Catch:{ all -> 0x09f1 }
        L_0x06b3:
            long r7 = r3.x     // Catch:{ all -> 0x09f1 }
            r2.G0(r7)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.ba r7 = r26.d0()     // Catch:{ all -> 0x09f1 }
            java.util.List r7 = r7.X()     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x06c5
            r2.a0(r7)     // Catch:{ all -> 0x09f1 }
        L_0x06c5:
            java.lang.String r7 = r3.e     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e r7 = r1.b(r7)     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = r3.A     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e r8 = com.google.android.gms.measurement.internal.e.b(r8)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e r7 = r7.k(r8)     // Catch:{ all -> 0x09f1 }
            boolean r8 = defpackage.c31.a()     // Catch:{ all -> 0x09f1 }
            if (r8 == 0) goto L_0x06ef
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r8 = r8.b()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09f1 }
            boolean r8 = r8.s(r11)     // Catch:{ all -> 0x09f1 }
            if (r8 == 0) goto L_0x06ef
            boolean r8 = r7.o()     // Catch:{ all -> 0x09f1 }
            if (r8 == 0) goto L_0x0797
        L_0x06ef:
            com.google.android.gms.measurement.internal.c9 r8 = r1.i     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = r3.e     // Catch:{ all -> 0x09f1 }
            android.util.Pair r8 = r8.u(r11, r7)     // Catch:{ all -> 0x09f1 }
            if (r8 == 0) goto L_0x071f
            java.lang.Object r11 = r8.first     // Catch:{ all -> 0x09f1 }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x09f1 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x09f1 }
            if (r11 != 0) goto L_0x071f
            boolean r11 = r3.s     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x0797
            java.lang.Object r11 = r8.first     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x09f1 }
            r2.w0(r11)     // Catch:{ all -> 0x09f1 }
            java.lang.Object r11 = r8.second     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x0797
            java.lang.Object r8 = r8.second     // Catch:{ all -> 0x09f1 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x09f1 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x09f1 }
            r2.I(r8)     // Catch:{ all -> 0x09f1 }
            goto L_0x0797
        L_0x071f:
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.m r8 = r8.Q()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r11 = r1.j     // Catch:{ all -> 0x09f1 }
            android.content.Context r11 = r11.n()     // Catch:{ all -> 0x09f1 }
            boolean r8 = r8.t(r11)     // Catch:{ all -> 0x09f1 }
            if (r8 != 0) goto L_0x0797
            boolean r8 = r3.t     // Catch:{ all -> 0x09f1 }
            if (r8 == 0) goto L_0x0797
            boolean r8 = defpackage.y51.a()     // Catch:{ all -> 0x09f1 }
            if (r8 == 0) goto L_0x074b
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r8 = r8.b()     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = r3.e     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.O0     // Catch:{ all -> 0x09f1 }
            boolean r8 = r8.C(r11, r12)     // Catch:{ all -> 0x09f1 }
            if (r8 != 0) goto L_0x0797
        L_0x074b:
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            android.content.Context r8 = r8.n()     // Catch:{ all -> 0x09f1 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = "android_id"
            java.lang.String r8 = android.provider.Settings.Secure.getString(r8, r11)     // Catch:{ all -> 0x09f1 }
            if (r8 != 0) goto L_0x0777
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.c4 r8 = r8.h()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.H()     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = "null secure ID. appId"
            java.lang.String r12 = r2.E0()     // Catch:{ all -> 0x09f1 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.c4.w(r12)     // Catch:{ all -> 0x09f1 }
            r8.b(r11, r12)     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = "null"
            goto L_0x0794
        L_0x0777:
            boolean r11 = r8.isEmpty()     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x0794
            com.google.android.gms.measurement.internal.h5 r11 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.c4 r11 = r11.h()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e4 r11 = r11.H()     // Catch:{ all -> 0x09f1 }
            java.lang.String r12 = "empty secure ID. appId"
            java.lang.String r13 = r2.E0()     // Catch:{ all -> 0x09f1 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.c4.w(r13)     // Catch:{ all -> 0x09f1 }
            r11.b(r12, r13)     // Catch:{ all -> 0x09f1 }
        L_0x0794:
            r2.M0(r8)     // Catch:{ all -> 0x09f1 }
        L_0x0797:
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.m r8 = r8.Q()     // Catch:{ all -> 0x09f1 }
            r8.m()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ all -> 0x09f1 }
            r2.X(r8)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.m r8 = r8.Q()     // Catch:{ all -> 0x09f1 }
            r8.m()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x09f1 }
            r2.R(r8)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.m r8 = r8.Q()     // Catch:{ all -> 0x09f1 }
            long r11 = r8.u()     // Catch:{ all -> 0x09f1 }
            int r8 = (int) r11     // Catch:{ all -> 0x09f1 }
            r2.l0(r8)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.m r8 = r8.Q()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = r8.v()     // Catch:{ all -> 0x09f1 }
            r2.b0(r8)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r8 = r8.b()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.u.G0     // Catch:{ all -> 0x09f1 }
            boolean r8 = r8.s(r11)     // Catch:{ all -> 0x09f1 }
            if (r8 != 0) goto L_0x07e1
            long r11 = r3.p     // Catch:{ all -> 0x09f1 }
            r2.C0(r11)     // Catch:{ all -> 0x09f1 }
        L_0x07e1:
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            boolean r8 = r8.p()     // Catch:{ all -> 0x09f1 }
            if (r8 == 0) goto L_0x0809
            boolean r8 = defpackage.c31.a()     // Catch:{ all -> 0x09f1 }
            if (r8 == 0) goto L_0x07fb
            com.google.android.gms.measurement.internal.h5 r8 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r8 = r8.b()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09f1 }
            boolean r8 = r8.s(r11)     // Catch:{ all -> 0x09f1 }
        L_0x07fb:
            r2.E0()     // Catch:{ all -> 0x09f1 }
            boolean r8 = android.text.TextUtils.isEmpty(r25)     // Catch:{ all -> 0x09f1 }
            if (r8 != 0) goto L_0x0809
            r8 = r25
            r2.O0(r8)     // Catch:{ all -> 0x09f1 }
        L_0x0809:
            com.google.android.gms.measurement.internal.d r8 = r26.Z()     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = r3.e     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.f4 r8 = r8.j0(r11)     // Catch:{ all -> 0x09f1 }
            if (r8 != 0) goto L_0x08b4
            com.google.android.gms.measurement.internal.f4 r8 = new com.google.android.gms.measurement.internal.f4     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r11 = r1.j     // Catch:{ all -> 0x09f1 }
            java.lang.String r12 = r3.e     // Catch:{ all -> 0x09f1 }
            r8.<init>(r11, r12)     // Catch:{ all -> 0x09f1 }
            boolean r11 = defpackage.c31.a()     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x083a
            com.google.android.gms.measurement.internal.h5 r11 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r11 = r11.b()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09f1 }
            boolean r11 = r11.s(r12)     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x083a
            java.lang.String r11 = r1.e(r7)     // Catch:{ all -> 0x09f1 }
        L_0x0836:
            r8.c(r11)     // Catch:{ all -> 0x09f1 }
            goto L_0x083f
        L_0x083a:
            java.lang.String r11 = r26.p0()     // Catch:{ all -> 0x09f1 }
            goto L_0x0836
        L_0x083f:
            java.lang.String r11 = r3.o     // Catch:{ all -> 0x09f1 }
            r8.F(r11)     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = r3.f     // Catch:{ all -> 0x09f1 }
            r8.r(r11)     // Catch:{ all -> 0x09f1 }
            boolean r11 = defpackage.c31.a()     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x0863
            com.google.android.gms.measurement.internal.h5 r11 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r11 = r11.b()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09f1 }
            boolean r11 = r11.s(r12)     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x0863
            boolean r11 = r7.o()     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x086e
        L_0x0863:
            com.google.android.gms.measurement.internal.c9 r11 = r1.i     // Catch:{ all -> 0x09f1 }
            java.lang.String r12 = r3.e     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = r11.v(r12)     // Catch:{ all -> 0x09f1 }
            r8.C(r11)     // Catch:{ all -> 0x09f1 }
        L_0x086e:
            r8.H(r9)     // Catch:{ all -> 0x09f1 }
            r8.a(r9)     // Catch:{ all -> 0x09f1 }
            r8.q(r9)     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = r3.g     // Catch:{ all -> 0x09f1 }
            r8.I(r11)     // Catch:{ all -> 0x09f1 }
            long r11 = r3.n     // Catch:{ all -> 0x09f1 }
            r8.u(r11)     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = r3.h     // Catch:{ all -> 0x09f1 }
            r8.L(r11)     // Catch:{ all -> 0x09f1 }
            long r11 = r3.i     // Catch:{ all -> 0x09f1 }
            r8.y(r11)     // Catch:{ all -> 0x09f1 }
            long r11 = r3.j     // Catch:{ all -> 0x09f1 }
            r8.B(r11)     // Catch:{ all -> 0x09f1 }
            boolean r11 = r3.l     // Catch:{ all -> 0x09f1 }
            r8.e(r11)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r11 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r11 = r11.b()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.G0     // Catch:{ all -> 0x09f1 }
            boolean r11 = r11.s(r12)     // Catch:{ all -> 0x09f1 }
            if (r11 != 0) goto L_0x08a8
            long r11 = r3.p     // Catch:{ all -> 0x09f1 }
            r8.c0(r11)     // Catch:{ all -> 0x09f1 }
        L_0x08a8:
            long r11 = r3.x     // Catch:{ all -> 0x09f1 }
            r8.E(r11)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.d r11 = r26.Z()     // Catch:{ all -> 0x09f1 }
            r11.O(r8)     // Catch:{ all -> 0x09f1 }
        L_0x08b4:
            boolean r11 = defpackage.c31.a()     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x08ce
            com.google.android.gms.measurement.internal.h5 r11 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r11 = r11.b()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09f1 }
            boolean r11 = r11.s(r12)     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x08ce
            boolean r7 = r7.q()     // Catch:{ all -> 0x09f1 }
            if (r7 == 0) goto L_0x08df
        L_0x08ce:
            java.lang.String r7 = r8.x()     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x08df
            java.lang.String r7 = r8.x()     // Catch:{ all -> 0x09f1 }
            r2.A0(r7)     // Catch:{ all -> 0x09f1 }
        L_0x08df:
            java.lang.String r7 = r8.M()     // Catch:{ all -> 0x09f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f1 }
            if (r7 != 0) goto L_0x08f0
            java.lang.String r7 = r8.M()     // Catch:{ all -> 0x09f1 }
            r2.K0(r7)     // Catch:{ all -> 0x09f1 }
        L_0x08f0:
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09f1 }
            java.lang.String r3 = r3.e     // Catch:{ all -> 0x09f1 }
            java.util.List r3 = r7.I(r3)     // Catch:{ all -> 0x09f1 }
            r11 = 0
        L_0x08fb:
            int r7 = r3.size()     // Catch:{ all -> 0x09f1 }
            if (r11 >= r7) goto L_0x0930
            ys0$a r7 = defpackage.ys0.Y()     // Catch:{ all -> 0x09f1 }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.ga r8 = (com.google.android.gms.measurement.internal.ga) r8     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = r8.c     // Catch:{ all -> 0x09f1 }
            r7.A(r8)     // Catch:{ all -> 0x09f1 }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.ga r8 = (com.google.android.gms.measurement.internal.ga) r8     // Catch:{ all -> 0x09f1 }
            long r12 = r8.d     // Catch:{ all -> 0x09f1 }
            r7.y(r12)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.ba r8 = r26.d0()     // Catch:{ all -> 0x09f1 }
            java.lang.Object r12 = r3.get(r11)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.ga r12 = (com.google.android.gms.measurement.internal.ga) r12     // Catch:{ all -> 0x09f1 }
            java.lang.Object r12 = r12.e     // Catch:{ all -> 0x09f1 }
            r8.J(r7, r12)     // Catch:{ all -> 0x09f1 }
            r2.C(r7)     // Catch:{ all -> 0x09f1 }
            int r11 = r11 + 1
            goto L_0x08fb
        L_0x0930:
            com.google.android.gms.measurement.internal.d r3 = r26.Z()     // Catch:{ IOException -> 0x09a5 }
            f01 r7 = r2.k()     // Catch:{ IOException -> 0x09a5 }
            sy0 r7 = (defpackage.sy0) r7     // Catch:{ IOException -> 0x09a5 }
            us0 r7 = (defpackage.us0) r7     // Catch:{ IOException -> 0x09a5 }
            long r2 = r3.y(r7)     // Catch:{ IOException -> 0x09a5 }
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.n r8 = r4.f     // Catch:{ all -> 0x09f1 }
            if (r8 == 0) goto L_0x099b
            com.google.android.gms.measurement.internal.n r8 = r4.f     // Catch:{ all -> 0x09f1 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x09f1 }
        L_0x094e:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x0962
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x09f1 }
            boolean r11 = r5.equals(r11)     // Catch:{ all -> 0x09f1 }
            if (r11 == 0) goto L_0x094e
        L_0x0960:
            r11 = 1
            goto L_0x099c
        L_0x0962:
            com.google.android.gms.measurement.internal.b5 r5 = r26.V()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = r4.a     // Catch:{ all -> 0x09f1 }
            java.lang.String r11 = r4.b     // Catch:{ all -> 0x09f1 }
            boolean r5 = r5.C(r8, r11)     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.d r11 = r26.Z()     // Catch:{ all -> 0x09f1 }
            long r12 = r26.o0()     // Catch:{ all -> 0x09f1 }
            java.lang.String r14 = r4.a     // Catch:{ all -> 0x09f1 }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.google.android.gms.measurement.internal.g r8 = r11.C(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x09f1 }
            if (r5 == 0) goto L_0x099b
            long r11 = r8.e     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.h5 r5 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.wa r5 = r5.b()     // Catch:{ all -> 0x09f1 }
            java.lang.String r8 = r4.a     // Catch:{ all -> 0x09f1 }
            int r5 = r5.w(r8)     // Catch:{ all -> 0x09f1 }
            long r13 = (long) r5     // Catch:{ all -> 0x09f1 }
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x099b
            goto L_0x0960
        L_0x099b:
            r11 = 0
        L_0x099c:
            boolean r2 = r7.S(r4, r2, r11)     // Catch:{ all -> 0x09f1 }
            if (r2 == 0) goto L_0x09be
            r1.m = r9     // Catch:{ all -> 0x09f1 }
            goto L_0x09be
        L_0x09a5:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.h5 r4 = r1.j     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.c4 r4 = r4.h()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.e4 r4 = r4.E()     // Catch:{ all -> 0x09f1 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.E0()     // Catch:{ all -> 0x09f1 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.c4.w(r2)     // Catch:{ all -> 0x09f1 }
            r4.c(r5, r2, r3)     // Catch:{ all -> 0x09f1 }
        L_0x09be:
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09f1 }
            r2.u()     // Catch:{ all -> 0x09f1 }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            r26.H()
            com.google.android.gms.measurement.internal.h5 r2 = r1.j
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()
            com.google.android.gms.measurement.internal.e4 r2 = r2.M()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r23
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x09f1:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.d r3 = r26.Z()
            r3.y0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.W(com.google.android.gms.measurement.internal.s, com.google.android.gms.measurement.internal.la):void");
    }

    private final int a(FileChannel fileChannel) {
        n0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.j.h().E().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.j.h().H().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e2) {
            this.j.h().E().b("Failed to read from channel", e2);
            return 0;
        }
    }

    private final boolean a0(la laVar) {
        return (!s41.a() || !this.j.b().C(laVar.e, u.k0)) ? !TextUtils.isEmpty(laVar.f) || !TextUtils.isEmpty(laVar.v) : !TextUtils.isEmpty(laVar.f) || !TextUtils.isEmpty(laVar.z) || !TextUtils.isEmpty(laVar.v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r0.o() != false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.f4 c(com.google.android.gms.measurement.internal.la r9, com.google.android.gms.measurement.internal.f4 r10, java.lang.String r11) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.e r0 = com.google.android.gms.measurement.internal.e.c
            boolean r1 = defpackage.c31.a()
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.measurement.internal.h5 r1 = r8.j
            com.google.android.gms.measurement.internal.wa r1 = r1.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.Q0
            boolean r1 = r1.s(r2)
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = r9.e
            com.google.android.gms.measurement.internal.e r0 = r8.b(r0)
            java.lang.String r1 = r9.A
            com.google.android.gms.measurement.internal.e r1 = com.google.android.gms.measurement.internal.e.b(r1)
            com.google.android.gms.measurement.internal.e r0 = r0.k(r1)
        L_0x0026:
            r1 = 1
            if (r10 != 0) goto L_0x0066
            com.google.android.gms.measurement.internal.f4 r10 = new com.google.android.gms.measurement.internal.f4
            com.google.android.gms.measurement.internal.h5 r2 = r8.j
            java.lang.String r3 = r9.e
            r10.<init>(r2, r3)
            boolean r2 = defpackage.c31.a()
            if (r2 == 0) goto L_0x005a
            com.google.android.gms.measurement.internal.h5 r2 = r8.j
            com.google.android.gms.measurement.internal.wa r2 = r2.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.Q0
            boolean r2 = r2.s(r3)
            if (r2 == 0) goto L_0x005a
            boolean r2 = r0.q()
            if (r2 == 0) goto L_0x0053
            java.lang.String r2 = r8.e(r0)
            r10.c(r2)
        L_0x0053:
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x0064
            goto L_0x0061
        L_0x005a:
            java.lang.String r0 = r8.p0()
            r10.c(r0)
        L_0x0061:
            r10.C(r11)
        L_0x0064:
            r11 = 1
            goto L_0x00b5
        L_0x0066:
            boolean r2 = defpackage.c31.a()
            if (r2 == 0) goto L_0x0080
            com.google.android.gms.measurement.internal.h5 r2 = r8.j
            com.google.android.gms.measurement.internal.wa r2 = r2.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.Q0
            boolean r2 = r2.s(r3)
            if (r2 == 0) goto L_0x0080
            boolean r2 = r0.o()
            if (r2 == 0) goto L_0x00b4
        L_0x0080:
            java.lang.String r2 = r10.J()
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x00b4
            r10.C(r11)
            boolean r11 = defpackage.c31.a()
            if (r11 == 0) goto L_0x00ac
            com.google.android.gms.measurement.internal.h5 r11 = r8.j
            com.google.android.gms.measurement.internal.wa r11 = r11.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.Q0
            boolean r11 = r11.s(r2)
            if (r11 == 0) goto L_0x00ac
            boolean r11 = r0.q()
            if (r11 == 0) goto L_0x0064
            java.lang.String r11 = r8.e(r0)
            goto L_0x00b0
        L_0x00ac:
            java.lang.String r11 = r8.p0()
        L_0x00b0:
            r10.c(r11)
            goto L_0x0064
        L_0x00b4:
            r11 = 0
        L_0x00b5:
            java.lang.String r0 = r9.f
            java.lang.String r2 = r10.A()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x00c7
            java.lang.String r11 = r9.f
            r10.r(r11)
            r11 = 1
        L_0x00c7:
            java.lang.String r0 = r9.v
            java.lang.String r2 = r10.D()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x00d9
            java.lang.String r11 = r9.v
            r10.v(r11)
            r11 = 1
        L_0x00d9:
            boolean r0 = defpackage.s41.a()
            if (r0 == 0) goto L_0x0103
            com.google.android.gms.measurement.internal.h5 r0 = r8.j
            com.google.android.gms.measurement.internal.wa r0 = r0.b()
            java.lang.String r2 = r10.t()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.k0
            boolean r0 = r0.C(r2, r3)
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = r9.z
            java.lang.String r2 = r10.G()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x0103
            java.lang.String r11 = r9.z
            r10.z(r11)
            r11 = 1
        L_0x0103:
            java.lang.String r0 = r9.o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = r9.o
            java.lang.String r2 = r10.M()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x011d
            java.lang.String r11 = r9.o
            r10.F(r11)
            r11 = 1
        L_0x011d:
            long r2 = r9.i
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            long r6 = r10.Z()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            long r2 = r9.i
            r10.y(r2)
            r11 = 1
        L_0x0133:
            java.lang.String r0 = r9.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x014d
            java.lang.String r0 = r9.g
            java.lang.String r2 = r10.T()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x014d
            java.lang.String r11 = r9.g
            r10.I(r11)
            r11 = 1
        L_0x014d:
            long r2 = r9.n
            long r6 = r10.V()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x015d
            long r2 = r9.n
            r10.u(r2)
            r11 = 1
        L_0x015d:
            java.lang.String r0 = r9.h
            if (r0 == 0) goto L_0x0171
            java.lang.String r2 = r10.X()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0171
            java.lang.String r11 = r9.h
            r10.L(r11)
            r11 = 1
        L_0x0171:
            long r2 = r9.j
            long r6 = r10.b0()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0181
            long r2 = r9.j
            r10.B(r2)
            r11 = 1
        L_0x0181:
            boolean r0 = r9.l
            boolean r2 = r10.e0()
            if (r0 == r2) goto L_0x018f
            boolean r11 = r9.l
            r10.e(r11)
            r11 = 1
        L_0x018f:
            java.lang.String r0 = r9.k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01a9
            java.lang.String r0 = r9.k
            java.lang.String r2 = r10.i()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01a9
            java.lang.String r11 = r9.k
            r10.O(r11)
            r11 = 1
        L_0x01a9:
            com.google.android.gms.measurement.internal.h5 r0 = r8.j
            com.google.android.gms.measurement.internal.wa r0 = r0.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.G0
            boolean r0 = r0.s(r2)
            if (r0 != 0) goto L_0x01c7
            long r2 = r9.p
            long r6 = r10.k()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01c7
            long r2 = r9.p
            r10.c0(r2)
            r11 = 1
        L_0x01c7:
            boolean r0 = r9.s
            boolean r2 = r10.l()
            if (r0 == r2) goto L_0x01d5
            boolean r11 = r9.s
            r10.s(r11)
            r11 = 1
        L_0x01d5:
            boolean r0 = r9.t
            boolean r2 = r10.m()
            if (r0 == r2) goto L_0x01e3
            boolean r11 = r9.t
            r10.w(r11)
            r11 = 1
        L_0x01e3:
            java.lang.Boolean r0 = r9.w
            java.lang.Boolean r2 = r10.n()
            if (r0 == r2) goto L_0x01f1
            java.lang.Boolean r11 = r9.w
            r10.b(r11)
            r11 = 1
        L_0x01f1:
            long r2 = r9.x
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0205
            long r4 = r10.d0()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0205
            long r2 = r9.x
            r10.E(r2)
            goto L_0x0206
        L_0x0205:
            r1 = r11
        L_0x0206:
            if (r1 == 0) goto L_0x020f
            com.google.android.gms.measurement.internal.d r9 = r8.Z()
            r9.O(r10)
        L_0x020f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.c(com.google.android.gms.measurement.internal.la, com.google.android.gms.measurement.internal.f4, java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    public static x9 d(Context context) {
        r.j(context);
        r.j(context.getApplicationContext());
        if (z == null) {
            synchronized (x9.class) {
                if (z == null) {
                    z = new x9(new ca(context));
                }
            }
        }
        return z;
    }

    private final String e(e eVar) {
        if (!c31.a() || !this.j.b().s(u.Q0) || eVar.q()) {
            return p0();
        }
        return null;
    }

    private static void j(qs0.a aVar, int i2, String str) {
        List<ss0> H = aVar.H();
        int i3 = 0;
        while (i3 < H.size()) {
            if (!"_err".equals(H.get(i3).N())) {
                i3++;
            } else {
                return;
            }
        }
        ss0.a e0 = ss0.e0();
        e0.C("_err");
        e0.y(Long.valueOf((long) i2).longValue());
        ss0.a e02 = ss0.e0();
        e02.C("_ev");
        e02.G(str);
        aVar.B((ss0) ((sy0) e0.k()));
        aVar.B((ss0) ((sy0) e02.k()));
    }

    private static void k(qs0.a aVar, String str) {
        List<ss0> H = aVar.H();
        for (int i2 = 0; i2 < H.size(); i2++) {
            if (str.equals(H.get(i2).N())) {
                aVar.K(i2);
                return;
            }
        }
    }

    private final n4 l0() {
        n4 n4Var = this.d;
        if (n4Var != null) {
            return n4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final void m(us0.a aVar, long j2, boolean z2) {
        String str = z2 ? "_se" : "_lte";
        ga o0 = Z().o0(aVar.E0(), str);
        ga gaVar = (o0 == null || o0.e == null) ? new ga(aVar.E0(), "auto", str, this.j.l().c(), Long.valueOf(j2)) : new ga(aVar.E0(), "auto", str, this.j.l().c(), Long.valueOf(((Long) o0.e).longValue() + j2));
        ys0.a Y = ys0.Y();
        Y.A(str);
        Y.y(this.j.l().c());
        Y.C(((Long) gaVar.e).longValue());
        ys0 ys0 = (ys0) ((sy0) Y.k());
        boolean z3 = false;
        int u2 = ba.u(aVar, str);
        if (u2 >= 0) {
            aVar.y(u2, ys0);
            z3 = true;
        }
        if (!z3) {
            aVar.D(ys0);
        }
        if (j2 > 0) {
            Z().T(gaVar);
            this.j.h().M().c("Updated engagement user property. scope, value", z2 ? "session-scoped" : "lifetime", gaVar.e);
        }
    }

    private final t9 m0() {
        P(this.e);
        return this.e;
    }

    private final void n0() {
        this.j.f().b();
    }

    private final long o0() {
        long c2 = this.j.l().c();
        p4 x2 = this.j.x();
        x2.m();
        x2.b();
        long a2 = x2.i.a();
        if (a2 == 0) {
            a2 = 1 + ((long) x2.g().H0().nextInt(86400000));
            x2.i.b(a2);
        }
        return ((((c2 + a2) / 1000) / 60) / 60) / 24;
    }

    @Deprecated
    private final String p0() {
        byte[] bArr = new byte[16];
        this.j.G().H0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    private final void r(f4 f4Var) {
        b0 b0Var;
        n0();
        if (!s41.a() || !this.j.b().C(f4Var.t(), u.k0)) {
            if (TextUtils.isEmpty(f4Var.A()) && TextUtils.isEmpty(f4Var.D())) {
                A(f4Var.t(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(f4Var.A()) && TextUtils.isEmpty(f4Var.G()) && TextUtils.isEmpty(f4Var.D())) {
            A(f4Var.t(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String q2 = this.j.b().q(f4Var);
        try {
            URL url = new URL(q2);
            this.j.h().M().b("Fetching remote configuration", f4Var.t());
            ks0 u2 = V().u(f4Var.t());
            String z2 = V().z(f4Var.t());
            if (u2 == null || TextUtils.isEmpty(z2)) {
                b0Var = null;
            } else {
                b0 b0Var2 = new b0();
                b0Var2.put("If-Modified-Since", z2);
                b0Var = b0Var2;
            }
            this.q = true;
            g4 X = X();
            String t2 = f4Var.t();
            y9 y9Var = new y9(this);
            X.b();
            X.r();
            r.j(url);
            r.j(y9Var);
            X.f().E(new k4(X, t2, url, (byte[]) null, b0Var, y9Var));
        } catch (MalformedURLException unused) {
            this.j.h().E().c("Failed to parse config URL. Not fetching. appId", c4.w(f4Var.t()), q2);
        }
    }

    /* access modifiers changed from: private */
    public final void u(ca caVar) {
        this.j.f().b();
        d dVar = new d(this);
        dVar.s();
        this.c = dVar;
        this.j.b().r(this.a);
        c9 c9Var = new c9(this);
        c9Var.s();
        this.i = c9Var;
        ma maVar = new ma(this);
        maVar.s();
        this.f = maVar;
        s7 s7Var = new s7(this);
        s7Var.s();
        this.h = s7Var;
        t9 t9Var = new t9(this);
        t9Var.s();
        this.e = t9Var;
        this.d = new n4(this);
        if (this.o != this.p) {
            this.j.h().E().c("Not all upload components initialized", Integer.valueOf(this.o), Integer.valueOf(this.p));
        }
        this.k = true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132 A[Catch:{ all -> 0x0179, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142 A[Catch:{ all -> 0x0179, all -> 0x0182 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.n0()
            r6.g0()
            com.google.android.gms.common.internal.r.f(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0182 }
        L_0x000e:
            com.google.android.gms.measurement.internal.h5 r1 = r6.j     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.c4 r1 = r1.h()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()     // Catch:{ all -> 0x0182 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0182 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0182 }
            r1.b(r2, r3)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.d r1 = r6.Z()     // Catch:{ all -> 0x0182 }
            r1.t0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.d r1 = r6.Z()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.f4 r1 = r1.j0(r7)     // Catch:{ all -> 0x0179 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.h5 r8 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c4 r8 = r8.h()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.H()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.c4.w(r7)     // Catch:{ all -> 0x0179 }
            r8.b(r9, r7)     // Catch:{ all -> 0x0179 }
            goto L_0x016d
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            com.google.android.gms.measurement.internal.h5 r10 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r10 = r10.l()     // Catch:{ all -> 0x0179 }
            long r10 = r10.c()     // Catch:{ all -> 0x0179 }
            r1.N(r10)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.d r10 = r6.Z()     // Catch:{ all -> 0x0179 }
            r10.O(r1)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.h5 r10 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c4 r10 = r10.h()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.e4 r10 = r10.M()     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0179 }
            r10.c(r11, r1, r9)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.b5 r9 = r6.V()     // Catch:{ all -> 0x0179 }
            r9.B(r7)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.h5 r7 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.p4 r7 = r7.x()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.t4 r7 = r7.f     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.h5 r9 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r9 = r9.l()     // Catch:{ all -> 0x0179 }
            long r9 = r9.c()     // Catch:{ all -> 0x0179 }
            r7.b(r9)     // Catch:{ all -> 0x0179 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.h5 r7 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.p4 r7 = r7.x()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.t4 r7 = r7.g     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.h5 r8 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r8 = r8.l()     // Catch:{ all -> 0x0179 }
            long r8 = r8.c()     // Catch:{ all -> 0x0179 }
            r7.b(r8)     // Catch:{ all -> 0x0179 }
        L_0x00c5:
            r6.H()     // Catch:{ all -> 0x0179 }
            goto L_0x016d
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0179 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0179 }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x0179 }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0179 }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            com.google.android.gms.measurement.internal.b5 r9 = r6.V()     // Catch:{ all -> 0x0179 }
            boolean r9 = r9.y(r7, r10, r11)     // Catch:{ all -> 0x0179 }
            if (r9 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.d r7 = r6.Z()     // Catch:{ all -> 0x0182 }
        L_0x00fa:
            r7.y0()     // Catch:{ all -> 0x0182 }
            r6.q = r0
            r6.I()
            return
        L_0x0103:
            com.google.android.gms.measurement.internal.b5 r11 = r6.V()     // Catch:{ all -> 0x0179 }
            ks0 r11 = r11.u(r7)     // Catch:{ all -> 0x0179 }
            if (r11 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.b5 r11 = r6.V()     // Catch:{ all -> 0x0179 }
            boolean r9 = r11.y(r7, r9, r9)     // Catch:{ all -> 0x0179 }
            if (r9 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.d r7 = r6.Z()     // Catch:{ all -> 0x0182 }
            goto L_0x00fa
        L_0x011c:
            com.google.android.gms.measurement.internal.h5 r9 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r9 = r9.l()     // Catch:{ all -> 0x0179 }
            long r2 = r9.c()     // Catch:{ all -> 0x0179 }
            r1.K(r2)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.d r9 = r6.Z()     // Catch:{ all -> 0x0179 }
            r9.O(r1)     // Catch:{ all -> 0x0179 }
            if (r8 != r5) goto L_0x0142
            com.google.android.gms.measurement.internal.h5 r8 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c4 r8 = r8.h()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.J()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.b(r9, r7)     // Catch:{ all -> 0x0179 }
            goto L_0x015a
        L_0x0142:
            com.google.android.gms.measurement.internal.h5 r7 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c4 r7 = r7.h()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.e4 r7 = r7.M()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0179 }
            int r10 = r10.length     // Catch:{ all -> 0x0179 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0179 }
            r7.c(r9, r8, r10)     // Catch:{ all -> 0x0179 }
        L_0x015a:
            com.google.android.gms.measurement.internal.g4 r7 = r6.X()     // Catch:{ all -> 0x0179 }
            boolean r7 = r7.x()     // Catch:{ all -> 0x0179 }
            if (r7 == 0) goto L_0x00c5
            boolean r7 = r6.G()     // Catch:{ all -> 0x0179 }
            if (r7 == 0) goto L_0x00c5
            r6.h0()     // Catch:{ all -> 0x0179 }
        L_0x016d:
            com.google.android.gms.measurement.internal.d r7 = r6.Z()     // Catch:{ all -> 0x0179 }
            r7.u()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.d r7 = r6.Z()     // Catch:{ all -> 0x0182 }
            goto L_0x00fa
        L_0x0179:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r8 = r6.Z()     // Catch:{ all -> 0x0182 }
            r8.y0()     // Catch:{ all -> 0x0182 }
            throw r7     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r7 = move-exception
            r6.q = r0
            r6.I()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.A(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void B(String str, e eVar) {
        if (c31.a() && this.j.b().s(u.Q0)) {
            n0();
            g0();
            this.y.put(str, eVar);
            d Z = Z();
            if (c31.a() && Z.j().s(u.Q0)) {
                r.j(str);
                r.j(eVar);
                Z.b();
                Z.r();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("consent_state", eVar.e());
                try {
                    if (Z.v().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                        Z.h().E().b("Failed to insert/update consent setting (got -1). appId", c4.w(str));
                    }
                } catch (SQLiteException e2) {
                    Z.h().E().c("Error storing consent setting. appId, error", c4.w(str), e2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void C(boolean z2) {
        H();
    }

    public final wa L() {
        return this.j.b();
    }

    /* access modifiers changed from: package-private */
    public final void Q(ea eaVar, la laVar) {
        n0();
        g0();
        if (a0(laVar)) {
            if (!laVar.l) {
                U(laVar);
            } else if (!"_npa".equals(eaVar.f) || laVar.w == null) {
                this.j.h().L().b("Removing user property", this.j.H().z(eaVar.f));
                Z().t0();
                try {
                    U(laVar);
                    Z().l0(laVar.e, eaVar.f);
                    Z().u();
                    this.j.h().L().b("User property removed", this.j.H().z(eaVar.f));
                } finally {
                    Z().y0();
                }
            } else {
                this.j.h().L().a("Falling back to manifest metadata value for ad personalization");
                v(new ea("_npa", this.j.l().c(), Long.valueOf(laVar.w.booleanValue() ? 1 : 0), "auto"), laVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0455 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x048b A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d2 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0206 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0208 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020c A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x022f A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0235 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0242 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0251 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(com.google.android.gms.measurement.internal.la r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.n0()
            r21.g0()
            com.google.android.gms.common.internal.r.j(r22)
            java.lang.String r7 = r2.e
            com.google.android.gms.common.internal.r.f(r7)
            boolean r7 = r21.a0(r22)
            if (r7 != 0) goto L_0x0023
            return
        L_0x0023:
            com.google.android.gms.measurement.internal.d r7 = r21.Z()
            java.lang.String r8 = r2.e
            com.google.android.gms.measurement.internal.f4 r7 = r7.j0(r8)
            r8 = 0
            if (r7 == 0) goto L_0x0056
            java.lang.String r10 = r7.A()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0056
            java.lang.String r10 = r2.f
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0056
            r7.K(r8)
            com.google.android.gms.measurement.internal.d r10 = r21.Z()
            r10.O(r7)
            com.google.android.gms.measurement.internal.b5 r7 = r21.V()
            java.lang.String r10 = r2.e
            r7.E(r10)
        L_0x0056:
            boolean r7 = r2.l
            if (r7 != 0) goto L_0x005e
            r21.U(r22)
            return
        L_0x005e:
            long r10 = r2.q
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x006e
            com.google.android.gms.measurement.internal.h5 r7 = r1.j
            com.google.android.gms.common.util.e r7 = r7.l()
            long r10 = r7.c()
        L_0x006e:
            com.google.android.gms.measurement.internal.h5 r7 = r1.j
            com.google.android.gms.measurement.internal.m r7 = r7.Q()
            r7.x()
            int r7 = r2.r
            r15 = 1
            if (r7 == 0) goto L_0x0098
            if (r7 == r15) goto L_0x0098
            com.google.android.gms.measurement.internal.h5 r12 = r1.j
            com.google.android.gms.measurement.internal.c4 r12 = r12.h()
            com.google.android.gms.measurement.internal.e4 r12 = r12.H()
            java.lang.String r13 = r2.e
            java.lang.Object r13 = com.google.android.gms.measurement.internal.c4.w(r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r12.c(r14, r13, r7)
            r7 = 0
        L_0x0098:
            com.google.android.gms.measurement.internal.d r12 = r21.Z()
            r12.t0()
            com.google.android.gms.measurement.internal.d r12 = r21.Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = r2.e     // Catch:{ all -> 0x04b5 }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.ga r14 = r12.o0(r13, r14)     // Catch:{ all -> 0x04b5 }
            if (r14 == 0) goto L_0x00bc
            java.lang.String r12 = "auto"
            java.lang.String r13 = r14.b     // Catch:{ all -> 0x04b5 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            r18 = r3
            r3 = 1
            goto L_0x010f
        L_0x00bc:
            java.lang.Boolean r12 = r2.w     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.ea r13 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04b5 }
            java.lang.String r18 = "_npa"
            java.lang.Boolean r12 = r2.w     // Catch:{ all -> 0x04b5 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x00cf
            r19 = 1
            goto L_0x00d1
        L_0x00cf:
            r19 = r8
        L_0x00d1:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x04b5 }
            java.lang.String r20 = "auto"
            r8 = 1
            r12 = r13
            r8 = r13
            r13 = r18
            r18 = r3
            r9 = r14
            r3 = 1
            r14 = r10
            r16 = r19
            r17 = r20
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b5 }
            if (r9 == 0) goto L_0x00f5
            java.lang.Object r9 = r9.e     // Catch:{ all -> 0x04b5 }
            java.lang.Long r12 = r8.h     // Catch:{ all -> 0x04b5 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x04b5 }
            if (r9 != 0) goto L_0x010f
        L_0x00f5:
            r1.v(r8, r2)     // Catch:{ all -> 0x04b5 }
            goto L_0x010f
        L_0x00f9:
            r18 = r3
            r9 = r14
            r3 = 1
            if (r9 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.ea r8 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_npa"
            r16 = 0
            java.lang.String r17 = "auto"
            r12 = r8
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b5 }
            r1.Q(r8, r2)     // Catch:{ all -> 0x04b5 }
        L_0x010f:
            com.google.android.gms.measurement.internal.d r8 = r21.Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r9 = r2.e     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.f4 r8 = r8.j0(r9)     // Catch:{ all -> 0x04b5 }
            if (r8 == 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.h5 r12 = r1.j     // Catch:{ all -> 0x04b5 }
            r12.G()     // Catch:{ all -> 0x04b5 }
            java.lang.String r12 = r2.f     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = r8.A()     // Catch:{ all -> 0x04b5 }
            java.lang.String r14 = r2.v     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = r8.D()     // Catch:{ all -> 0x04b5 }
            boolean r12 = com.google.android.gms.measurement.internal.fa.j0(r12, r13, r14, r15)     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.h5 r12 = r1.j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.c4 r12 = r12.h()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.e4 r12 = r12.H()     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r14 = r8.t()     // Catch:{ all -> 0x04b5 }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.c4.w(r14)     // Catch:{ all -> 0x04b5 }
            r12.b(r13, r14)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.d r12 = r21.Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r8 = r8.t()     // Catch:{ all -> 0x04b5 }
            r12.r()     // Catch:{ all -> 0x04b5 }
            r12.b()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.r.f(r8)     // Catch:{ all -> 0x04b5 }
            android.database.sqlite.SQLiteDatabase r13 = r12.v()     // Catch:{ SQLiteException -> 0x01bd }
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01bd }
            r15 = 0
            r14[r15] = r8     // Catch:{ SQLiteException -> 0x01bd }
            java.lang.String r9 = "events"
            int r9 = r13.delete(r9, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "user_attributes"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "apps"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r0
            if (r9 <= 0) goto L_0x01cf
            com.google.android.gms.measurement.internal.c4 r0 = r12.h()     // Catch:{ SQLiteException -> 0x01bd }
            com.google.android.gms.measurement.internal.e4 r0 = r0.M()     // Catch:{ SQLiteException -> 0x01bd }
            java.lang.String r13 = "Deleted application data. app, records"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x01bd }
            r0.c(r13, r8, r9)     // Catch:{ SQLiteException -> 0x01bd }
            goto L_0x01cf
        L_0x01bd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r9 = r12.h()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.e4 r9 = r9.E()     // Catch:{ all -> 0x04b5 }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.c4.w(r8)     // Catch:{ all -> 0x04b5 }
            r9.c(r12, r8, r0)     // Catch:{ all -> 0x04b5 }
        L_0x01cf:
            r8 = 0
        L_0x01d0:
            if (r8 == 0) goto L_0x022f
            long r12 = r8.V()     // Catch:{ all -> 0x04b5 }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01ea
            long r12 = r8.V()     // Catch:{ all -> 0x04b5 }
            r9 = r4
            long r3 = r2.n     // Catch:{ all -> 0x04b5 }
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x01eb
            r0 = 1
            goto L_0x01ec
        L_0x01ea:
            r9 = r4
        L_0x01eb:
            r0 = 0
        L_0x01ec:
            long r3 = r8.V()     // Catch:{ all -> 0x04b5 }
            int r12 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0208
            java.lang.String r3 = r8.T()     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x0208
            java.lang.String r3 = r8.T()     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = r2.g     // Catch:{ all -> 0x04b5 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x04b5 }
            if (r3 != 0) goto L_0x0208
            r14 = 1
            goto L_0x0209
        L_0x0208:
            r14 = 0
        L_0x0209:
            r0 = r0 | r14
            if (r0 == 0) goto L_0x0230
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b5 }
            r0.<init>()     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = "_pv"
            java.lang.String r4 = r8.T()     // Catch:{ all -> 0x04b5 }
            r0.putString(r3, r4)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.s r3 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_au"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04b5 }
            r14.<init>(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b5 }
            r1.p(r3, r2)     // Catch:{ all -> 0x04b5 }
            goto L_0x0230
        L_0x022f:
            r9 = r4
        L_0x0230:
            r21.U(r22)     // Catch:{ all -> 0x04b5 }
            if (r7 != 0) goto L_0x0242
            com.google.android.gms.measurement.internal.d r0 = r21.Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = r2.e     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = "_f"
        L_0x023d:
            com.google.android.gms.measurement.internal.o r0 = r0.D(r3, r4)     // Catch:{ all -> 0x04b5 }
            goto L_0x024f
        L_0x0242:
            r3 = 1
            if (r7 != r3) goto L_0x024e
            com.google.android.gms.measurement.internal.d r0 = r21.Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = r2.e     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = "_v"
            goto L_0x023d
        L_0x024e:
            r0 = 0
        L_0x024f:
            if (r0 != 0) goto L_0x048b
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r10 / r3
            r14 = 1
            long r12 = r12 + r14
            long r12 = r12 * r3
            java.lang.String r0 = "_dac"
            java.lang.String r3 = "_r"
            java.lang.String r4 = "_c"
            java.lang.String r8 = "_et"
            if (r7 != 0) goto L_0x03eb
            com.google.android.gms.measurement.internal.ea r7 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04b5 }
            java.lang.String r14 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04b5 }
            java.lang.String r17 = "auto"
            r12 = r7
            r13 = r14
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b5 }
            r1.v(r7, r2)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r7 = r7.b()     // Catch:{ all -> 0x04b5 }
            java.lang.String r12 = r2.f     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.u.S     // Catch:{ all -> 0x04b5 }
            boolean r7 = r7.C(r12, r13)     // Catch:{ all -> 0x04b5 }
            if (r7 == 0) goto L_0x0296
            r21.n0()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.u4 r7 = r7.D()     // Catch:{ all -> 0x04b5 }
            java.lang.String r12 = r2.e     // Catch:{ all -> 0x04b5 }
            r7.b(r12)     // Catch:{ all -> 0x04b5 }
        L_0x0296:
            r21.n0()     // Catch:{ all -> 0x04b5 }
            r21.g0()     // Catch:{ all -> 0x04b5 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x04b5 }
            r7.<init>()     // Catch:{ all -> 0x04b5 }
            r12 = 1
            r7.putLong(r4, r12)     // Catch:{ all -> 0x04b5 }
            r7.putLong(r3, r12)     // Catch:{ all -> 0x04b5 }
            r3 = 0
            r7.putLong(r6, r3)     // Catch:{ all -> 0x04b5 }
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04b5 }
            r7.putLong(r9, r3)     // Catch:{ all -> 0x04b5 }
            r14 = r18
            r7.putLong(r14, r3)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r3 = r1.j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r3 = r3.b()     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = r2.e     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.U     // Catch:{ all -> 0x04b5 }
            boolean r3 = r3.C(r4, r12)     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x02cf
            r3 = 1
            r7.putLong(r8, r3)     // Catch:{ all -> 0x04b5 }
            goto L_0x02d1
        L_0x02cf:
            r3 = 1
        L_0x02d1:
            boolean r12 = r2.u     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x02d8
            r7.putLong(r0, r3)     // Catch:{ all -> 0x04b5 }
        L_0x02d8:
            com.google.android.gms.measurement.internal.d r0 = r21.Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = r2.e     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.r.f(r3)     // Catch:{ all -> 0x04b5 }
            r0.b()     // Catch:{ all -> 0x04b5 }
            r0.r()     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = "first_open_count"
            long r3 = r0.A0(r3, r4)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r0 = r1.j     // Catch:{ all -> 0x04b5 }
            android.content.Context r0 = r0.n()     // Catch:{ all -> 0x04b5 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04b5 }
            if (r0 != 0) goto L_0x0312
            com.google.android.gms.measurement.internal.h5 r0 = r1.j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.h()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r9 = r2.e     // Catch:{ all -> 0x04b5 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r9)     // Catch:{ all -> 0x04b5 }
            r0.b(r6, r9)     // Catch:{ all -> 0x04b5 }
        L_0x030e:
            r12 = 0
            goto L_0x03cf
        L_0x0312:
            com.google.android.gms.measurement.internal.h5 r0 = r1.j     // Catch:{ NameNotFoundException -> 0x0324 }
            android.content.Context r0 = r0.n()     // Catch:{ NameNotFoundException -> 0x0324 }
            u80 r0 = defpackage.v80.a(r0)     // Catch:{ NameNotFoundException -> 0x0324 }
            java.lang.String r12 = r2.e     // Catch:{ NameNotFoundException -> 0x0324 }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.e(r12, r13)     // Catch:{ NameNotFoundException -> 0x0324 }
            goto L_0x033b
        L_0x0324:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h5 r12 = r1.j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.c4 r12 = r12.h()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.e4 r12 = r12.E()     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r15 = r2.e     // Catch:{ all -> 0x04b5 }
            java.lang.Object r15 = com.google.android.gms.measurement.internal.c4.w(r15)     // Catch:{ all -> 0x04b5 }
            r12.c(r13, r15, r0)     // Catch:{ all -> 0x04b5 }
            r0 = 0
        L_0x033b:
            if (r0 == 0) goto L_0x038b
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04b5 }
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x038b
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04b5 }
            r18 = r14
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x04b5 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x036e
            com.google.android.gms.measurement.internal.h5 r0 = r1.j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r0 = r0.b()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.p0     // Catch:{ all -> 0x04b5 }
            boolean r0 = r0.s(r12)     // Catch:{ all -> 0x04b5 }
            if (r0 == 0) goto L_0x0369
            r12 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x036c
            r12 = 1
        L_0x0365:
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04b5 }
            goto L_0x036c
        L_0x0369:
            r12 = 1
            goto L_0x0365
        L_0x036c:
            r14 = 0
            goto L_0x036f
        L_0x036e:
            r14 = 1
        L_0x036f:
            com.google.android.gms.measurement.internal.ea r0 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_fi"
            if (r14 == 0) goto L_0x0378
            r14 = 1
            goto L_0x037a
        L_0x0378:
            r14 = 0
        L_0x037a:
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x04b5 }
            java.lang.String r17 = "auto"
            r12 = r0
            r6 = r18
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b5 }
            r1.v(r0, r2)     // Catch:{ all -> 0x04b5 }
            goto L_0x038c
        L_0x038b:
            r6 = r14
        L_0x038c:
            com.google.android.gms.measurement.internal.h5 r0 = r1.j     // Catch:{ NameNotFoundException -> 0x039e }
            android.content.Context r0 = r0.n()     // Catch:{ NameNotFoundException -> 0x039e }
            u80 r0 = defpackage.v80.a(r0)     // Catch:{ NameNotFoundException -> 0x039e }
            java.lang.String r12 = r2.e     // Catch:{ NameNotFoundException -> 0x039e }
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.c(r12, r13)     // Catch:{ NameNotFoundException -> 0x039e }
            goto L_0x03b5
        L_0x039e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h5 r12 = r1.j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.c4 r12 = r12.h()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.e4 r12 = r12.E()     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r14 = r2.e     // Catch:{ all -> 0x04b5 }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.c4.w(r14)     // Catch:{ all -> 0x04b5 }
            r12.c(r13, r14, r0)     // Catch:{ all -> 0x04b5 }
            r0 = 0
        L_0x03b5:
            if (r0 == 0) goto L_0x030e
            int r12 = r0.flags     // Catch:{ all -> 0x04b5 }
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x03c2
            r12 = 1
            r7.putLong(r9, r12)     // Catch:{ all -> 0x04b5 }
        L_0x03c2:
            int r0 = r0.flags     // Catch:{ all -> 0x04b5 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x030e
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04b5 }
            goto L_0x030e
        L_0x03cf:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x03d6
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04b5 }
        L_0x03d6:
            com.google.android.gms.measurement.internal.s r0 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_f"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04b5 }
            r14.<init>(r7)     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b5 }
        L_0x03e7:
            r1.O(r0, r2)     // Catch:{ all -> 0x04b5 }
            goto L_0x0445
        L_0x03eb:
            r5 = 1
            if (r7 != r5) goto L_0x0445
            com.google.android.gms.measurement.internal.ea r5 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04b5 }
            java.lang.String r17 = "auto"
            r12 = r5
            r13 = r6
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b5 }
            r1.v(r5, r2)     // Catch:{ all -> 0x04b5 }
            r21.n0()     // Catch:{ all -> 0x04b5 }
            r21.g0()     // Catch:{ all -> 0x04b5 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x04b5 }
            r5.<init>()     // Catch:{ all -> 0x04b5 }
            r6 = 1
            r5.putLong(r4, r6)     // Catch:{ all -> 0x04b5 }
            r5.putLong(r3, r6)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r3 = r1.j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r3 = r3.b()     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = r2.e     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.u.U     // Catch:{ all -> 0x04b5 }
            boolean r3 = r3.C(r4, r6)     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x042a
            r3 = 1
            r5.putLong(r8, r3)     // Catch:{ all -> 0x04b5 }
            goto L_0x042c
        L_0x042a:
            r3 = 1
        L_0x042c:
            boolean r6 = r2.u     // Catch:{ all -> 0x04b5 }
            if (r6 == 0) goto L_0x0433
            r5.putLong(r0, r3)     // Catch:{ all -> 0x04b5 }
        L_0x0433:
            com.google.android.gms.measurement.internal.s r0 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_v"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04b5 }
            r14.<init>(r5)     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b5 }
            goto L_0x03e7
        L_0x0445:
            com.google.android.gms.measurement.internal.h5 r0 = r1.j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r0 = r0.b()     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = r2.e     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.u.V     // Catch:{ all -> 0x04b5 }
            boolean r0 = r0.C(r3, r4)     // Catch:{ all -> 0x04b5 }
            if (r0 != 0) goto L_0x04a6
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b5 }
            r0.<init>()     // Catch:{ all -> 0x04b5 }
            r3 = 1
            r0.putLong(r8, r3)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r3 = r1.j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r3 = r3.b()     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = r2.e     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.u.U     // Catch:{ all -> 0x04b5 }
            boolean r3 = r3.C(r4, r5)     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x0476
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04b5 }
        L_0x0476:
            com.google.android.gms.measurement.internal.s r3 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_e"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04b5 }
            r14.<init>(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b5 }
        L_0x0487:
            r1.O(r3, r2)     // Catch:{ all -> 0x04b5 }
            goto L_0x04a6
        L_0x048b:
            boolean r0 = r2.m     // Catch:{ all -> 0x04b5 }
            if (r0 == 0) goto L_0x04a6
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b5 }
            r0.<init>()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.s r3 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_cd"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04b5 }
            r14.<init>(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b5 }
            goto L_0x0487
        L_0x04a6:
            com.google.android.gms.measurement.internal.d r0 = r21.Z()     // Catch:{ all -> 0x04b5 }
            r0.u()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.d r0 = r21.Z()
            r0.y0()
            return
        L_0x04b5:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r21.Z()
            r2.y0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.R(com.google.android.gms.measurement.internal.la):void");
    }

    /* access modifiers changed from: package-private */
    public final void S(ua uaVar) {
        la K = K(uaVar.e);
        if (K != null) {
            T(uaVar, K);
        }
    }

    /* access modifiers changed from: package-private */
    public final void T(ua uaVar, la laVar) {
        r.j(uaVar);
        r.f(uaVar.e);
        r.j(uaVar.g);
        r.f(uaVar.g.f);
        n0();
        g0();
        if (a0(laVar)) {
            if (!laVar.l) {
                U(laVar);
                return;
            }
            Z().t0();
            try {
                U(laVar);
                ua p0 = Z().p0(uaVar.e, uaVar.g.f);
                if (p0 != null) {
                    this.j.h().L().c("Removing conditional user property", uaVar.e, this.j.H().z(uaVar.g.f));
                    Z().r0(uaVar.e, uaVar.g.f);
                    if (p0.i) {
                        Z().l0(uaVar.e, uaVar.g.f);
                    }
                    if (uaVar.o != null) {
                        Bundle bundle = null;
                        if (uaVar.o.f != null) {
                            bundle = uaVar.o.f.l();
                        }
                        W(this.j.G().E(uaVar.e, uaVar.o.e, bundle, p0.f, uaVar.o.h, true, false, j21.a() && this.j.b().s(u.T0)), laVar);
                    }
                } else {
                    this.j.h().H().c("Conditional user property doesn't exist", c4.w(uaVar.e), this.j.H().z(uaVar.g.f));
                }
                Z().u();
            } finally {
                Z().y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        if (r1.o() != false) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.f4 U(com.google.android.gms.measurement.internal.la r7) {
        /*
            r6 = this;
            r6.n0()
            r6.g0()
            com.google.android.gms.common.internal.r.j(r7)
            java.lang.String r0 = r7.e
            com.google.android.gms.common.internal.r.f(r0)
            com.google.android.gms.measurement.internal.d r0 = r6.Z()
            java.lang.String r1 = r7.e
            com.google.android.gms.measurement.internal.f4 r0 = r0.j0(r1)
            com.google.android.gms.measurement.internal.e r1 = com.google.android.gms.measurement.internal.e.c
            boolean r2 = defpackage.c31.a()
            if (r2 == 0) goto L_0x003e
            com.google.android.gms.measurement.internal.h5 r2 = r6.j
            com.google.android.gms.measurement.internal.wa r2 = r2.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.Q0
            boolean r2 = r2.s(r3)
            if (r2 == 0) goto L_0x003e
            java.lang.String r1 = r7.e
            com.google.android.gms.measurement.internal.e r1 = r6.b(r1)
            java.lang.String r2 = r7.A
            com.google.android.gms.measurement.internal.e r2 = com.google.android.gms.measurement.internal.e.b(r2)
            com.google.android.gms.measurement.internal.e r1 = r1.k(r2)
        L_0x003e:
            boolean r2 = defpackage.c31.a()
            if (r2 == 0) goto L_0x005c
            com.google.android.gms.measurement.internal.h5 r2 = r6.j
            com.google.android.gms.measurement.internal.wa r2 = r2.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.Q0
            boolean r2 = r2.s(r3)
            if (r2 == 0) goto L_0x005c
            boolean r2 = r1.o()
            if (r2 == 0) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            java.lang.String r2 = ""
            goto L_0x0064
        L_0x005c:
            com.google.android.gms.measurement.internal.c9 r2 = r6.i
            java.lang.String r3 = r7.e
            java.lang.String r2 = r2.v(r3)
        L_0x0064:
            boolean r3 = defpackage.a41.a()
            if (r3 == 0) goto L_0x01a1
            com.google.android.gms.measurement.internal.h5 r3 = r6.j
            com.google.android.gms.measurement.internal.wa r3 = r3.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.u.q0
            boolean r3 = r3.s(r4)
            if (r3 == 0) goto L_0x01a1
            if (r0 != 0) goto L_0x00b6
            com.google.android.gms.measurement.internal.f4 r0 = new com.google.android.gms.measurement.internal.f4
            com.google.android.gms.measurement.internal.h5 r3 = r6.j
            java.lang.String r4 = r7.e
            r0.<init>(r3, r4)
            boolean r3 = defpackage.c31.a()
            if (r3 == 0) goto L_0x00ab
            com.google.android.gms.measurement.internal.h5 r3 = r6.j
            com.google.android.gms.measurement.internal.wa r3 = r3.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.u.Q0
            boolean r3 = r3.s(r4)
            if (r3 == 0) goto L_0x00ab
            boolean r3 = r1.q()
            if (r3 == 0) goto L_0x00a4
            java.lang.String r3 = r6.e(r1)
            r0.c(r3)
        L_0x00a4:
            boolean r1 = r1.o()
            if (r1 == 0) goto L_0x00fd
            goto L_0x00b2
        L_0x00ab:
            java.lang.String r1 = r6.p0()
            r0.c(r1)
        L_0x00b2:
            r0.C(r2)
            goto L_0x00fd
        L_0x00b6:
            boolean r3 = defpackage.c31.a()
            if (r3 == 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.h5 r3 = r6.j
            com.google.android.gms.measurement.internal.wa r3 = r3.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.u.Q0
            boolean r3 = r3.s(r4)
            if (r3 == 0) goto L_0x00d0
            boolean r3 = r1.o()
            if (r3 == 0) goto L_0x00fd
        L_0x00d0:
            java.lang.String r3 = r0.J()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00fd
            r0.C(r2)
            boolean r2 = defpackage.c31.a()
            if (r2 == 0) goto L_0x00f6
            com.google.android.gms.measurement.internal.h5 r2 = r6.j
            com.google.android.gms.measurement.internal.wa r2 = r2.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.Q0
            boolean r2 = r2.s(r3)
            if (r2 == 0) goto L_0x00f6
            java.lang.String r1 = r6.e(r1)
            goto L_0x00fa
        L_0x00f6:
            java.lang.String r1 = r6.p0()
        L_0x00fa:
            r0.c(r1)
        L_0x00fd:
            java.lang.String r1 = r7.f
            r0.r(r1)
            java.lang.String r1 = r7.v
            r0.v(r1)
            boolean r1 = defpackage.s41.a()
            if (r1 == 0) goto L_0x0124
            com.google.android.gms.measurement.internal.h5 r1 = r6.j
            com.google.android.gms.measurement.internal.wa r1 = r1.b()
            java.lang.String r2 = r0.t()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.k0
            boolean r1 = r1.C(r2, r3)
            if (r1 == 0) goto L_0x0124
            java.lang.String r1 = r7.z
            r0.z(r1)
        L_0x0124:
            java.lang.String r1 = r7.o
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0131
            java.lang.String r1 = r7.o
            r0.F(r1)
        L_0x0131:
            long r1 = r7.i
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x013c
            r0.y(r1)
        L_0x013c:
            java.lang.String r1 = r7.g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0149
            java.lang.String r1 = r7.g
            r0.I(r1)
        L_0x0149:
            long r1 = r7.n
            r0.u(r1)
            java.lang.String r1 = r7.h
            if (r1 == 0) goto L_0x0155
            r0.L(r1)
        L_0x0155:
            long r1 = r7.j
            r0.B(r1)
            boolean r1 = r7.l
            r0.e(r1)
            java.lang.String r1 = r7.k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x016c
            java.lang.String r1 = r7.k
            r0.O(r1)
        L_0x016c:
            com.google.android.gms.measurement.internal.h5 r1 = r6.j
            com.google.android.gms.measurement.internal.wa r1 = r1.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.G0
            boolean r1 = r1.s(r2)
            if (r1 != 0) goto L_0x017f
            long r1 = r7.p
            r0.c0(r1)
        L_0x017f:
            boolean r1 = r7.s
            r0.s(r1)
            boolean r1 = r7.t
            r0.w(r1)
            java.lang.Boolean r1 = r7.w
            r0.b(r1)
            long r1 = r7.x
            r0.E(r1)
            boolean r7 = r0.f()
            if (r7 == 0) goto L_0x01a0
            com.google.android.gms.measurement.internal.d r7 = r6.Z()
            r7.O(r0)
        L_0x01a0:
            return r0
        L_0x01a1:
            com.google.android.gms.measurement.internal.f4 r7 = r6.c(r7, r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.U(com.google.android.gms.measurement.internal.la):com.google.android.gms.measurement.internal.f4");
    }

    public final b5 V() {
        P(this.a);
        return this.a;
    }

    public final g4 X() {
        P(this.b);
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final String Y(la laVar) {
        try {
            return (String) this.j.f().v(new aa(this, laVar)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.j.h().E().c("Failed to get app instance id. appId", c4.w(laVar.e), e2);
            return null;
        }
    }

    public final d Z() {
        P(this.c);
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final e b(String str) {
        e eVar = e.c;
        if (c31.a() && this.j.b().s(u.Q0)) {
            n0();
            g0();
            eVar = this.y.get(str);
            if (eVar == null) {
                eVar = Z().C0(str);
                if (eVar == null) {
                    eVar = e.c;
                }
                B(str, eVar);
            }
        }
        return eVar;
    }

    public final ma b0() {
        P(this.f);
        return this.f;
    }

    public final s7 c0() {
        P(this.h);
        return this.h;
    }

    public final ba d0() {
        P(this.g);
        return this.g;
    }

    public final a4 e0() {
        return this.j.H();
    }

    public final a5 f() {
        return this.j.f();
    }

    public final fa f0() {
        return this.j.G();
    }

    /* access modifiers changed from: protected */
    public final void g() {
        this.j.f().b();
        Z().D0();
        if (this.j.x().e.a() == 0) {
            this.j.x().e.b(this.j.l().c());
        }
        H();
    }

    /* access modifiers changed from: package-private */
    public final void g0() {
        if (!this.k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final c4 h() {
        return this.j.h();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:125|126) */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r1.j.h().E().c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.c4.w(r5), r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0353 */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a2 A[Catch:{ all -> 0x038c }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b3 A[Catch:{ all -> 0x038c }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02d7 A[Catch:{ MalformedURLException -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d9 A[Catch:{ MalformedURLException -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02e1 A[Catch:{ MalformedURLException -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02f1 A[Catch:{ MalformedURLException -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0309 A[Catch:{ MalformedURLException -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020a A[Catch:{ all -> 0x038c }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b A[Catch:{ all -> 0x038c }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0211 A[Catch:{ all -> 0x038c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h0() {
        /*
            r17 = this;
            r1 = r17
            r17.n0()
            r17.g0()
            r0 = 1
            r1.s = r0
            r2 = 0
            com.google.android.gms.measurement.internal.h5 r3 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c8 r3 = r3.P()     // Catch:{ all -> 0x038c }
            java.lang.Boolean r3 = r3.a0()     // Catch:{ all -> 0x038c }
            if (r3 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.h5 r0 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r0 = r0.h()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()     // Catch:{ all -> 0x038c }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
        L_0x0024:
            r0.a(r3)     // Catch:{ all -> 0x038c }
        L_0x0027:
            r1.s = r2
            r17.I()
            return
        L_0x002d:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x038c }
            if (r3 == 0) goto L_0x0040
            com.google.android.gms.measurement.internal.h5 r0 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r0 = r0.h()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ all -> 0x038c }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            goto L_0x0024
        L_0x0040:
            long r3 = r1.m     // Catch:{ all -> 0x038c }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x004c
        L_0x0048:
            r17.H()     // Catch:{ all -> 0x038c }
            goto L_0x0027
        L_0x004c:
            r17.n0()     // Catch:{ all -> 0x038c }
            java.util.List<java.lang.Long> r3 = r1.v     // Catch:{ all -> 0x038c }
            if (r3 == 0) goto L_0x0055
            r3 = 1
            goto L_0x0056
        L_0x0055:
            r3 = 0
        L_0x0056:
            if (r3 == 0) goto L_0x0065
            com.google.android.gms.measurement.internal.h5 r0 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r0 = r0.h()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r0 = r0.M()     // Catch:{ all -> 0x038c }
            java.lang.String r3 = "Uploading requested multiple times"
            goto L_0x0024
        L_0x0065:
            com.google.android.gms.measurement.internal.g4 r3 = r17.X()     // Catch:{ all -> 0x038c }
            boolean r3 = r3.x()     // Catch:{ all -> 0x038c }
            if (r3 != 0) goto L_0x007f
            com.google.android.gms.measurement.internal.h5 r0 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r0 = r0.h()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r0 = r0.M()     // Catch:{ all -> 0x038c }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.a(r3)     // Catch:{ all -> 0x038c }
            goto L_0x0048
        L_0x007f:
            com.google.android.gms.measurement.internal.h5 r3 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.common.util.e r3 = r3.l()     // Catch:{ all -> 0x038c }
            long r3 = r3.c()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r7 = r7.b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.u.Q     // Catch:{ all -> 0x038c }
            r9 = 0
            int r7 = r7.u(r9, r8)     // Catch:{ all -> 0x038c }
            long r10 = com.google.android.gms.measurement.internal.wa.L()     // Catch:{ all -> 0x038c }
            long r10 = r3 - r10
            r8 = 0
        L_0x009d:
            if (r8 >= r7) goto L_0x00a8
            boolean r12 = r1.F(r9, r10)     // Catch:{ all -> 0x038c }
            if (r12 == 0) goto L_0x00a8
            int r8 = r8 + 1
            goto L_0x009d
        L_0x00a8:
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.p4 r7 = r7.x()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.t4 r7 = r7.e     // Catch:{ all -> 0x038c }
            long r7 = r7.a()     // Catch:{ all -> 0x038c }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00d1
            com.google.android.gms.measurement.internal.h5 r5 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r5 = r5.h()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r5 = r5.L()     // Catch:{ all -> 0x038c }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x038c }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x038c }
            r5.b(r6, r7)     // Catch:{ all -> 0x038c }
        L_0x00d1:
            com.google.android.gms.measurement.internal.d r5 = r17.Z()     // Catch:{ all -> 0x038c }
            java.lang.String r5 = r5.w()     // Catch:{ all -> 0x038c }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x038c }
            r7 = -1
            if (r6 != 0) goto L_0x0368
            long r10 = r1.x     // Catch:{ all -> 0x038c }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00f1
            com.google.android.gms.measurement.internal.d r6 = r17.Z()     // Catch:{ all -> 0x038c }
            long r6 = r6.I0()     // Catch:{ all -> 0x038c }
            r1.x = r6     // Catch:{ all -> 0x038c }
        L_0x00f1:
            com.google.android.gms.measurement.internal.h5 r6 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r6 = r6.b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.u.g     // Catch:{ all -> 0x038c }
            int r6 = r6.u(r5, r7)     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r7 = r7.b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.u.h     // Catch:{ all -> 0x038c }
            int r7 = r7.u(r5, r8)     // Catch:{ all -> 0x038c }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.d r8 = r17.Z()     // Catch:{ all -> 0x038c }
            java.util.List r6 = r8.J(r5, r6, r7)     // Catch:{ all -> 0x038c }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x038c }
            if (r7 != 0) goto L_0x0027
            boolean r7 = defpackage.c31.a()     // Catch:{ all -> 0x038c }
            if (r7 == 0) goto L_0x0139
            com.google.android.gms.measurement.internal.h5 r7 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r7 = r7.b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x038c }
            boolean r7 = r7.s(r8)     // Catch:{ all -> 0x038c }
            if (r7 == 0) goto L_0x0139
            com.google.android.gms.measurement.internal.e r7 = r1.b(r5)     // Catch:{ all -> 0x038c }
            boolean r7 = r7.o()     // Catch:{ all -> 0x038c }
            if (r7 == 0) goto L_0x018c
        L_0x0139:
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x038c }
        L_0x013d:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x038c }
            if (r8 == 0) goto L_0x015c
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x038c }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x038c }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x038c }
            us0 r8 = (defpackage.us0) r8     // Catch:{ all -> 0x038c }
            java.lang.String r10 = r8.Z()     // Catch:{ all -> 0x038c }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x038c }
            if (r10 != 0) goto L_0x013d
            java.lang.String r7 = r8.Z()     // Catch:{ all -> 0x038c }
            goto L_0x015d
        L_0x015c:
            r7 = r9
        L_0x015d:
            if (r7 == 0) goto L_0x018c
            r8 = 0
        L_0x0160:
            int r10 = r6.size()     // Catch:{ all -> 0x038c }
            if (r8 >= r10) goto L_0x018c
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x038c }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x038c }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x038c }
            us0 r10 = (defpackage.us0) r10     // Catch:{ all -> 0x038c }
            java.lang.String r11 = r10.Z()     // Catch:{ all -> 0x038c }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x038c }
            if (r11 != 0) goto L_0x0189
            java.lang.String r10 = r10.Z()     // Catch:{ all -> 0x038c }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x038c }
            if (r10 != 0) goto L_0x0189
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x038c }
            goto L_0x018c
        L_0x0189:
            int r8 = r8 + 1
            goto L_0x0160
        L_0x018c:
            ts0$a r7 = defpackage.ts0.F()     // Catch:{ all -> 0x038c }
            int r8 = r6.size()     // Catch:{ all -> 0x038c }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x038c }
            int r11 = r6.size()     // Catch:{ all -> 0x038c }
            r10.<init>(r11)     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.h5 r11 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r11 = r11.b()     // Catch:{ all -> 0x038c }
            boolean r11 = r11.I(r5)     // Catch:{ all -> 0x038c }
            if (r11 == 0) goto L_0x01c9
            boolean r11 = defpackage.c31.a()     // Catch:{ all -> 0x038c }
            if (r11 == 0) goto L_0x01c7
            com.google.android.gms.measurement.internal.h5 r11 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r11 = r11.b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x038c }
            boolean r11 = r11.s(r12)     // Catch:{ all -> 0x038c }
            if (r11 == 0) goto L_0x01c7
            com.google.android.gms.measurement.internal.e r11 = r1.b(r5)     // Catch:{ all -> 0x038c }
            boolean r11 = r11.o()     // Catch:{ all -> 0x038c }
            if (r11 == 0) goto L_0x01c9
        L_0x01c7:
            r11 = 1
            goto L_0x01ca
        L_0x01c9:
            r11 = 0
        L_0x01ca:
            boolean r12 = defpackage.c31.a()     // Catch:{ all -> 0x038c }
            if (r12 == 0) goto L_0x01eb
            com.google.android.gms.measurement.internal.h5 r12 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r12 = r12.b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x038c }
            boolean r12 = r12.s(r13)     // Catch:{ all -> 0x038c }
            if (r12 == 0) goto L_0x01eb
            com.google.android.gms.measurement.internal.e r12 = r1.b(r5)     // Catch:{ all -> 0x038c }
            boolean r12 = r12.o()     // Catch:{ all -> 0x038c }
            if (r12 == 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r12 = 0
            goto L_0x01ec
        L_0x01eb:
            r12 = 1
        L_0x01ec:
            boolean r13 = defpackage.c31.a()     // Catch:{ all -> 0x038c }
            if (r13 == 0) goto L_0x020d
            com.google.android.gms.measurement.internal.h5 r13 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r13 = r13.b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x038c }
            boolean r13 = r13.s(r14)     // Catch:{ all -> 0x038c }
            if (r13 == 0) goto L_0x020d
            com.google.android.gms.measurement.internal.e r13 = r1.b(r5)     // Catch:{ all -> 0x038c }
            boolean r13 = r13.q()     // Catch:{ all -> 0x038c }
            if (r13 == 0) goto L_0x020b
            goto L_0x020d
        L_0x020b:
            r13 = 0
            goto L_0x020e
        L_0x020d:
            r13 = 1
        L_0x020e:
            r14 = 0
        L_0x020f:
            if (r14 >= r8) goto L_0x0293
            java.lang.Object r15 = r6.get(r14)     // Catch:{ all -> 0x038c }
            android.util.Pair r15 = (android.util.Pair) r15     // Catch:{ all -> 0x038c }
            java.lang.Object r15 = r15.first     // Catch:{ all -> 0x038c }
            us0 r15 = (defpackage.us0) r15     // Catch:{ all -> 0x038c }
            sy0$b r15 = r15.w()     // Catch:{ all -> 0x038c }
            us0$a r15 = (defpackage.us0.a) r15     // Catch:{ all -> 0x038c }
            java.lang.Object r16 = r6.get(r14)     // Catch:{ all -> 0x038c }
            r0 = r16
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x038c }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x038c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x038c }
            r10.add(r0)     // Catch:{ all -> 0x038c }
            r16 = r10
            r9 = 31049(0x7949, double:1.534E-319)
            r15.r0(r9)     // Catch:{ all -> 0x038c }
            r15.A(r3)     // Catch:{ all -> 0x038c }
            r15.S(r2)     // Catch:{ all -> 0x038c }
            if (r11 != 0) goto L_0x0242
            r15.V0()     // Catch:{ all -> 0x038c }
        L_0x0242:
            boolean r9 = defpackage.c31.a()     // Catch:{ all -> 0x038c }
            if (r9 == 0) goto L_0x0263
            com.google.android.gms.measurement.internal.h5 r9 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r9 = r9.b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x038c }
            boolean r9 = r9.s(r10)     // Catch:{ all -> 0x038c }
            if (r9 == 0) goto L_0x0263
            if (r12 != 0) goto L_0x025e
            r15.F0()     // Catch:{ all -> 0x038c }
            r15.I0()     // Catch:{ all -> 0x038c }
        L_0x025e:
            if (r13 != 0) goto L_0x0263
            r15.L0()     // Catch:{ all -> 0x038c }
        L_0x0263:
            com.google.android.gms.measurement.internal.h5 r9 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r9 = r9.b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.u.Y     // Catch:{ all -> 0x038c }
            boolean r9 = r9.C(r5, r10)     // Catch:{ all -> 0x038c }
            if (r9 == 0) goto L_0x0288
            f01 r9 = r15.k()     // Catch:{ all -> 0x038c }
            sy0 r9 = (defpackage.sy0) r9     // Catch:{ all -> 0x038c }
            us0 r9 = (defpackage.us0) r9     // Catch:{ all -> 0x038c }
            byte[] r9 = r9.h()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.ba r10 = r17.d0()     // Catch:{ all -> 0x038c }
            long r9 = r10.v(r9)     // Catch:{ all -> 0x038c }
            r15.J0(r9)     // Catch:{ all -> 0x038c }
        L_0x0288:
            r7.w(r15)     // Catch:{ all -> 0x038c }
            int r14 = r14 + 1
            r10 = r16
            r0 = 1
            r9 = 0
            goto L_0x020f
        L_0x0293:
            r16 = r10
            com.google.android.gms.measurement.internal.h5 r6 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r6 = r6.h()     // Catch:{ all -> 0x038c }
            r9 = 2
            boolean r6 = r6.B(r9)     // Catch:{ all -> 0x038c }
            if (r6 == 0) goto L_0x02b3
            com.google.android.gms.measurement.internal.ba r6 = r17.d0()     // Catch:{ all -> 0x038c }
            f01 r9 = r7.k()     // Catch:{ all -> 0x038c }
            sy0 r9 = (defpackage.sy0) r9     // Catch:{ all -> 0x038c }
            ts0 r9 = (defpackage.ts0) r9     // Catch:{ all -> 0x038c }
            java.lang.String r6 = r6.C(r9)     // Catch:{ all -> 0x038c }
            goto L_0x02b4
        L_0x02b3:
            r6 = 0
        L_0x02b4:
            r17.d0()     // Catch:{ all -> 0x038c }
            f01 r9 = r7.k()     // Catch:{ all -> 0x038c }
            sy0 r9 = (defpackage.sy0) r9     // Catch:{ all -> 0x038c }
            ts0 r9 = (defpackage.ts0) r9     // Catch:{ all -> 0x038c }
            byte[] r14 = r9.h()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.String> r9 = com.google.android.gms.measurement.internal.u.q     // Catch:{ all -> 0x038c }
            r0 = 0
            java.lang.Object r0 = r9.a(r0)     // Catch:{ all -> 0x038c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x038c }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0353 }
            r13.<init>(r0)     // Catch:{ MalformedURLException -> 0x0353 }
            boolean r9 = r16.isEmpty()     // Catch:{ MalformedURLException -> 0x0353 }
            if (r9 != 0) goto L_0x02d9
            r9 = 1
            goto L_0x02da
        L_0x02d9:
            r9 = 0
        L_0x02da:
            com.google.android.gms.common.internal.r.a(r9)     // Catch:{ MalformedURLException -> 0x0353 }
            java.util.List<java.lang.Long> r9 = r1.v     // Catch:{ MalformedURLException -> 0x0353 }
            if (r9 == 0) goto L_0x02f1
            com.google.android.gms.measurement.internal.h5 r9 = r1.j     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.c4 r9 = r9.h()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.e4 r9 = r9.E()     // Catch:{ MalformedURLException -> 0x0353 }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r9.a(r10)     // Catch:{ MalformedURLException -> 0x0353 }
            goto L_0x02fa
        L_0x02f1:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0353 }
            r10 = r16
            r9.<init>(r10)     // Catch:{ MalformedURLException -> 0x0353 }
            r1.v = r9     // Catch:{ MalformedURLException -> 0x0353 }
        L_0x02fa:
            com.google.android.gms.measurement.internal.h5 r9 = r1.j     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.p4 r9 = r9.x()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.t4 r9 = r9.f     // Catch:{ MalformedURLException -> 0x0353 }
            r9.b(r3)     // Catch:{ MalformedURLException -> 0x0353 }
            java.lang.String r3 = "?"
            if (r8 <= 0) goto L_0x0311
            us0 r3 = r7.x(r2)     // Catch:{ MalformedURLException -> 0x0353 }
            java.lang.String r3 = r3.T2()     // Catch:{ MalformedURLException -> 0x0353 }
        L_0x0311:
            com.google.android.gms.measurement.internal.h5 r4 = r1.j     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.c4 r4 = r4.h()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.e4 r4 = r4.M()     // Catch:{ MalformedURLException -> 0x0353 }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x0353 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x0353 }
            r4.d(r7, r3, r8, r6)     // Catch:{ MalformedURLException -> 0x0353 }
            r3 = 1
            r1.r = r3     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.g4 r11 = r17.X()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.z9 r3 = new com.google.android.gms.measurement.internal.z9     // Catch:{ MalformedURLException -> 0x0353 }
            r3.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x0353 }
            r11.b()     // Catch:{ MalformedURLException -> 0x0353 }
            r11.r()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.common.internal.r.j(r13)     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.common.internal.r.j(r14)     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.common.internal.r.j(r3)     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.a5 r4 = r11.f()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.k4 r6 = new com.google.android.gms.measurement.internal.k4     // Catch:{ MalformedURLException -> 0x0353 }
            r15 = 0
            r10 = r6
            r12 = r5
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x0353 }
            r4.E(r6)     // Catch:{ MalformedURLException -> 0x0353 }
            goto L_0x0027
        L_0x0353:
            com.google.android.gms.measurement.internal.h5 r3 = r1.j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r3 = r3.h()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x038c }
            java.lang.String r4 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.c4.w(r5)     // Catch:{ all -> 0x038c }
            r3.c(r4, r5, r0)     // Catch:{ all -> 0x038c }
            goto L_0x0027
        L_0x0368:
            r1.x = r7     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.d r0 = r17.Z()     // Catch:{ all -> 0x038c }
            long r5 = com.google.android.gms.measurement.internal.wa.L()     // Catch:{ all -> 0x038c }
            long r3 = r3 - r5
            java.lang.String r0 = r0.G(r3)     // Catch:{ all -> 0x038c }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x038c }
            if (r3 != 0) goto L_0x0027
            com.google.android.gms.measurement.internal.d r3 = r17.Z()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.f4 r0 = r3.j0(r0)     // Catch:{ all -> 0x038c }
            if (r0 == 0) goto L_0x0027
            r1.r(r0)     // Catch:{ all -> 0x038c }
            goto L_0x0027
        L_0x038c:
            r0 = move-exception
            r1.s = r2
            r17.I()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.h0():void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void i(int i2, Throwable th, byte[] bArr, String str) {
        d Z;
        n0();
        g0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.r = false;
                I();
                throw th2;
            }
        }
        List<Long> list = this.v;
        this.v = null;
        boolean z2 = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                this.j.x().e.b(this.j.l().c());
                this.j.x().f.b(0);
                H();
                this.j.h().M().c("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                Z().t0();
                try {
                    for (Long next : list) {
                        try {
                            Z = Z();
                            long longValue = next.longValue();
                            Z.b();
                            Z.r();
                            if (Z.v().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e2) {
                            Z.h().E().b("Failed to delete a bundle in a queue table", e2);
                            throw e2;
                        } catch (SQLiteException e3) {
                            if (this.w == null || !this.w.contains(next)) {
                                throw e3;
                            }
                        }
                    }
                    Z().u();
                    Z().y0();
                    this.w = null;
                    if (!X().x() || !G()) {
                        this.x = -1;
                        H();
                    } else {
                        h0();
                    }
                    this.m = 0;
                } catch (Throwable th3) {
                    Z().y0();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                this.j.h().E().b("Database error while trying to delete uploaded bundles", e4);
                this.m = this.j.l().a();
                this.j.h().M().b("Disable upload, time", Long.valueOf(this.m));
            }
        } else {
            this.j.h().M().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            this.j.x().f.b(this.j.l().c());
            if (i2 != 503) {
                if (i2 != 429) {
                    z2 = false;
                }
            }
            if (z2) {
                this.j.x().g.b(this.j.l().c());
            }
            Z().Q(list);
            H();
        }
        this.r = false;
        I();
    }

    /* access modifiers changed from: package-private */
    public final void i0() {
        String str;
        e4 e4Var;
        Integer num;
        Integer num2;
        n0();
        g0();
        if (!this.l) {
            this.l = true;
            if (J()) {
                int a2 = a(this.u);
                int G = this.j.R().G();
                n0();
                if (a2 > G) {
                    e4Var = this.j.h().E();
                    num2 = Integer.valueOf(a2);
                    num = Integer.valueOf(G);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (a2 >= G) {
                    return;
                } else {
                    if (D(G, this.u)) {
                        e4Var = this.j.h().M();
                        num2 = Integer.valueOf(a2);
                        num = Integer.valueOf(G);
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        e4Var = this.j.h().E();
                        num2 = Integer.valueOf(a2);
                        num = Integer.valueOf(G);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                e4Var.c(str, num2, num);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void j0() {
        this.p++;
    }

    /* access modifiers changed from: package-private */
    public final h5 k0() {
        return this.j;
    }

    public final e l() {
        return this.j.l();
    }

    public final Context n() {
        return this.j.n();
    }

    public final va o() {
        return this.j.o();
    }

    /* access modifiers changed from: package-private */
    public final void p(s sVar, la laVar) {
        List<ua> list;
        List<ua> list2;
        List<ua> list3;
        e4 E;
        String str;
        Object w2;
        String z2;
        Object obj;
        s sVar2 = sVar;
        la laVar2 = laVar;
        r.j(laVar);
        r.f(laVar2.e);
        n0();
        g0();
        String str2 = laVar2.e;
        long j2 = sVar2.h;
        d0();
        if (ba.R(sVar, laVar)) {
            if (!laVar2.l) {
                U(laVar2);
                return;
            }
            List<String> list4 = laVar2.y;
            if (list4 != null) {
                if (list4.contains(sVar2.e)) {
                    Bundle l2 = sVar2.f.l();
                    l2.putLong("ga_safelisted", 1);
                    sVar2 = new s(sVar2.e, new n(l2), sVar2.g, sVar2.h);
                } else {
                    this.j.h().L().d("Dropping non-safelisted event. appId, event name, origin", str2, sVar2.e, sVar2.g);
                    return;
                }
            }
            Z().t0();
            try {
                d Z = Z();
                r.f(str2);
                Z.b();
                Z.r();
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i2 < 0) {
                    Z.h().H().c("Invalid time querying timed out conditional properties", c4.w(str2), Long.valueOf(j2));
                    list = Collections.emptyList();
                } else {
                    list = Z.L("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j2)});
                }
                for (ua next : list) {
                    if (next != null) {
                        this.j.h().M().d("User property timed out", next.e, this.j.H().z(next.g.f), next.g.i());
                        if (next.k != null) {
                            W(new s(next.k, j2), laVar2);
                        }
                        Z().r0(str2, next.g.f);
                    }
                }
                d Z2 = Z();
                r.f(str2);
                Z2.b();
                Z2.r();
                if (i2 < 0) {
                    Z2.h().H().c("Invalid time querying expired conditional properties", c4.w(str2), Long.valueOf(j2));
                    list2 = Collections.emptyList();
                } else {
                    list2 = Z2.L("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (ua next2 : list2) {
                    if (next2 != null) {
                        this.j.h().M().d("User property expired", next2.e, this.j.H().z(next2.g.f), next2.g.i());
                        Z().l0(str2, next2.g.f);
                        if (next2.o != null) {
                            arrayList.add(next2.o);
                        }
                        Z().r0(str2, next2.g.f);
                    }
                }
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    W(new s((s) obj2, j2), laVar2);
                }
                d Z3 = Z();
                String str3 = sVar2.e;
                r.f(str2);
                r.f(str3);
                Z3.b();
                Z3.r();
                if (i2 < 0) {
                    Z3.h().H().d("Invalid time querying triggered conditional properties", c4.w(str2), Z3.d().v(str3), Long.valueOf(j2));
                    list3 = Collections.emptyList();
                } else {
                    list3 = Z3.L("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (ua next3 : list3) {
                    if (next3 != null) {
                        ea eaVar = next3.g;
                        ga gaVar = r4;
                        ga gaVar2 = new ga(next3.e, next3.f, eaVar.f, j2, eaVar.i());
                        if (Z().T(gaVar)) {
                            E = this.j.h().M();
                            str = "User property triggered";
                            w2 = next3.e;
                            z2 = this.j.H().z(gaVar.c);
                            obj = gaVar.e;
                        } else {
                            E = this.j.h().E();
                            str = "Too many active user properties, ignoring";
                            w2 = c4.w(next3.e);
                            z2 = this.j.H().z(gaVar.c);
                            obj = gaVar.e;
                        }
                        E.d(str, w2, z2, obj);
                        if (next3.m != null) {
                            arrayList2.add(next3.m);
                        }
                        next3.g = new ea(gaVar);
                        next3.i = true;
                        Z().U(next3);
                    }
                }
                W(sVar2, laVar2);
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    W(new s((s) obj3, j2), laVar2);
                }
                Z().u();
            } finally {
                Z().y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(com.google.android.gms.measurement.internal.s r36, java.lang.String r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r3 = r37
            com.google.android.gms.measurement.internal.d r2 = r35.Z()
            com.google.android.gms.measurement.internal.f4 r2 = r2.j0(r3)
            if (r2 == 0) goto L_0x0112
            java.lang.String r4 = r2.T()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x001c
            goto L_0x0112
        L_0x001c:
            java.lang.Boolean r4 = r0.M(r2)
            if (r4 != 0) goto L_0x0040
            java.lang.String r4 = r1.e
            java.lang.String r5 = "_ui"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.h5 r4 = r0.j
            com.google.android.gms.measurement.internal.c4 r4 = r4.h()
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.c4.w(r37)
            java.lang.String r6 = "Could not find package. appId"
            r4.b(r6, r5)
            goto L_0x005a
        L_0x0040:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.measurement.internal.c4 r1 = r1.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.c4.w(r37)
            java.lang.String r3 = "App version does not match; dropping event. appId"
            r1.b(r3, r2)
            return
        L_0x005a:
            com.google.android.gms.measurement.internal.la r15 = new com.google.android.gms.measurement.internal.la
            java.lang.String r4 = r2.A()
            java.lang.String r5 = r2.T()
            long r6 = r2.V()
            java.lang.String r8 = r2.X()
            long r9 = r2.Z()
            long r11 = r2.b0()
            boolean r14 = r2.e0()
            r16 = 0
            java.lang.String r17 = r2.M()
            long r18 = r2.k()
            r20 = 0
            r22 = 0
            boolean r23 = r2.l()
            boolean r24 = r2.m()
            r25 = 0
            java.lang.String r26 = r2.D()
            java.lang.Boolean r27 = r2.n()
            long r28 = r2.d0()
            java.util.List r30 = r2.o()
            boolean r31 = defpackage.s41.a()
            if (r31 == 0) goto L_0x00bf
            com.google.android.gms.measurement.internal.h5 r13 = r0.j
            com.google.android.gms.measurement.internal.wa r13 = r13.b()
            java.lang.String r1 = r2.t()
            r32 = r14
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.u.k0
            boolean r1 = r13.C(r1, r14)
            if (r1 == 0) goto L_0x00c1
            java.lang.String r1 = r2.G()
            goto L_0x00c2
        L_0x00bf:
            r32 = r14
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            boolean r2 = defpackage.c31.a()
            if (r2 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.h5 r2 = r0.j
            com.google.android.gms.measurement.internal.wa r2 = r2.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.u.Q0
            boolean r2 = r2.s(r13)
            if (r2 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.e r2 = r0.b(r3)
            java.lang.String r2 = r2.e()
            goto L_0x00e1
        L_0x00df:
            java.lang.String r2 = ""
        L_0x00e1:
            r33 = r2
            r2 = r15
            r3 = r37
            r13 = 0
            r14 = r32
            r34 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r19 = r20
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            r29 = r30
            r30 = r1
            r31 = r33
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (boolean) r24, (java.lang.String) r25, (java.lang.Boolean) r26, (long) r27, (java.util.List<java.lang.String>) r29, (java.lang.String) r30, (java.lang.String) r31)
            r1 = r36
            r2 = r34
            r0.O(r1, r2)
            return
        L_0x0112:
            com.google.android.gms.measurement.internal.h5 r1 = r0.j
            com.google.android.gms.measurement.internal.c4 r1 = r1.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.L()
            java.lang.String r2 = "No app data available; dropping event"
            r1.b(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.q(com.google.android.gms.measurement.internal.s, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final void s(u9 u9Var) {
        this.o++;
    }

    /* access modifiers changed from: package-private */
    public final void v(ea eaVar, la laVar) {
        n0();
        g0();
        if (a0(laVar)) {
            if (!laVar.l) {
                U(laVar);
                return;
            }
            int p0 = this.j.G().p0(eaVar.f);
            h5 h5Var = this.j;
            if (p0 != 0) {
                h5Var.G();
                String H = fa.H(eaVar.f, 24, true);
                String str = eaVar.f;
                this.j.G().W(laVar.e, p0, "_ev", H, str != null ? str.length() : 0);
                return;
            }
            int q0 = h5Var.G().q0(eaVar.f, eaVar.i());
            if (q0 != 0) {
                this.j.G();
                String H2 = fa.H(eaVar.f, 24, true);
                Object i2 = eaVar.i();
                this.j.G().W(laVar.e, q0, "_ev", H2, (i2 == null || (!(i2 instanceof String) && !(i2 instanceof CharSequence))) ? 0 : String.valueOf(i2).length());
                return;
            }
            Object y0 = this.j.G().y0(eaVar.f, eaVar.i());
            if (y0 != null) {
                if ("_sid".equals(eaVar.f)) {
                    long j2 = eaVar.g;
                    String str2 = eaVar.j;
                    long j3 = 0;
                    ga o0 = Z().o0(laVar.e, "_sno");
                    if (o0 != null) {
                        Object obj = o0.e;
                        if (obj instanceof Long) {
                            j3 = ((Long) obj).longValue();
                            v(new ea("_sno", j2, Long.valueOf(j3 + 1), str2), laVar);
                        }
                    }
                    if (o0 != null) {
                        this.j.h().H().b("Retrieved last session number from database does not contain a valid (long) value", o0.e);
                    }
                    o D = Z().D(laVar.e, "_s");
                    if (D != null) {
                        j3 = D.c;
                        this.j.h().M().b("Backfill the session number. Last used session number", Long.valueOf(j3));
                    }
                    v(new ea("_sno", j2, Long.valueOf(j3 + 1), str2), laVar);
                }
                ga gaVar = new ga(laVar.e, eaVar.j, eaVar.f, eaVar.g, y0);
                this.j.h().M().c("Setting user property", this.j.H().z(gaVar.c), y0);
                Z().t0();
                try {
                    U(laVar);
                    boolean T = Z().T(gaVar);
                    Z().u();
                    if (!T) {
                        this.j.h().E().c("Too many unique user properties are set. Ignoring user property", this.j.H().z(gaVar.c), gaVar.e);
                        this.j.G().W(laVar.e, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    Z().y0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void w(la laVar) {
        if (this.v != null) {
            ArrayList arrayList = new ArrayList();
            this.w = arrayList;
            arrayList.addAll(this.v);
        }
        d Z = Z();
        String str = laVar.e;
        r.f(str);
        Z.b();
        Z.r();
        try {
            SQLiteDatabase v2 = Z.v();
            String[] strArr = {str};
            int delete = v2.delete("apps", "app_id=?", strArr) + 0 + v2.delete("events", "app_id=?", strArr) + v2.delete("user_attributes", "app_id=?", strArr) + v2.delete("conditional_properties", "app_id=?", strArr) + v2.delete("raw_events", "app_id=?", strArr) + v2.delete("raw_events_metadata", "app_id=?", strArr) + v2.delete("queue", "app_id=?", strArr) + v2.delete("audience_filter_values", "app_id=?", strArr) + v2.delete("main_event_params", "app_id=?", strArr) + v2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                Z.h().M().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            Z.h().E().c("Error resetting analytics data. appId, error", c4.w(str), e2);
        }
        if (laVar.l) {
            R(laVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void x(ua uaVar) {
        la K = K(uaVar.e);
        if (K != null) {
            y(uaVar, K);
        }
    }

    /* access modifiers changed from: package-private */
    public final void y(ua uaVar, la laVar) {
        e4 E;
        String str;
        Object w2;
        String z2;
        Object i2;
        e4 E2;
        String str2;
        Object w3;
        String z3;
        Object obj;
        r.j(uaVar);
        r.f(uaVar.e);
        r.j(uaVar.f);
        r.j(uaVar.g);
        r.f(uaVar.g.f);
        n0();
        g0();
        if (a0(laVar)) {
            if (!laVar.l) {
                U(laVar);
                return;
            }
            ua uaVar2 = new ua(uaVar);
            boolean z4 = false;
            uaVar2.i = false;
            Z().t0();
            try {
                ua p0 = Z().p0(uaVar2.e, uaVar2.g.f);
                if (p0 != null && !p0.f.equals(uaVar2.f)) {
                    this.j.h().H().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.j.H().z(uaVar2.g.f), uaVar2.f, p0.f);
                }
                if (p0 != null && p0.i) {
                    uaVar2.f = p0.f;
                    uaVar2.h = p0.h;
                    uaVar2.l = p0.l;
                    uaVar2.j = p0.j;
                    uaVar2.m = p0.m;
                    uaVar2.i = p0.i;
                    uaVar2.g = new ea(uaVar2.g.f, p0.g.g, uaVar2.g.i(), p0.g.j);
                } else if (TextUtils.isEmpty(uaVar2.j)) {
                    uaVar2.g = new ea(uaVar2.g.f, uaVar2.h, uaVar2.g.i(), uaVar2.g.j);
                    uaVar2.i = true;
                    z4 = true;
                }
                if (uaVar2.i) {
                    ea eaVar = uaVar2.g;
                    ga gaVar = new ga(uaVar2.e, uaVar2.f, eaVar.f, eaVar.g, eaVar.i());
                    if (Z().T(gaVar)) {
                        E2 = this.j.h().L();
                        str2 = "User property updated immediately";
                        w3 = uaVar2.e;
                        z3 = this.j.H().z(gaVar.c);
                        obj = gaVar.e;
                    } else {
                        E2 = this.j.h().E();
                        str2 = "(2)Too many active user properties, ignoring";
                        w3 = c4.w(uaVar2.e);
                        z3 = this.j.H().z(gaVar.c);
                        obj = gaVar.e;
                    }
                    E2.d(str2, w3, z3, obj);
                    if (z4 && uaVar2.m != null) {
                        W(new s(uaVar2.m, uaVar2.h), laVar);
                    }
                }
                if (Z().U(uaVar2)) {
                    E = this.j.h().L();
                    str = "Conditional property added";
                    w2 = uaVar2.e;
                    z2 = this.j.H().z(uaVar2.g.f);
                    i2 = uaVar2.g.i();
                } else {
                    E = this.j.h().E();
                    str = "Too many conditional properties, ignoring";
                    w2 = c4.w(uaVar2.e);
                    z2 = this.j.H().z(uaVar2.g.f);
                    i2 = uaVar2.g.i();
                }
                E.d(str, w2, z2, i2);
                Z().u();
            } finally {
                Z().y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void z(Runnable runnable) {
        n0();
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(runnable);
    }
}
