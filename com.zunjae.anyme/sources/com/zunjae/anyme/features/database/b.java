package com.zunjae.anyme.features.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class b extends a {
    /* access modifiers changed from: private */
    public final androidx.room.l a;
    private final androidx.room.e<sy1> b;
    private final androidx.room.e<lx1> c;
    /* access modifiers changed from: private */
    public final jx1 d = new jx1();
    /* access modifiers changed from: private */
    public final hx1 e = new hx1();
    /* access modifiers changed from: private */
    public final yw1 f = new yw1();
    /* access modifiers changed from: private */
    public final ix1 g = new ix1();
    /* access modifiers changed from: private */
    public final gx1 h = new gx1();
    private final androidx.room.e<ux1> i;
    private final androidx.room.e<bs1> j;
    private final androidx.room.e<az1> k;
    private final androidx.room.e<zy1> l;
    /* access modifiers changed from: private */
    public final androidx.room.e<com.zunjae.downloader.b> m;
    private final androidx.room.d<sy1> n;
    private final androidx.room.d<sy1> o;
    private final androidx.room.s p;
    private final androidx.room.s q;
    private final androidx.room.s r;
    private final androidx.room.s s;
    private final androidx.room.s t;
    private final androidx.room.s u;

    class a extends androidx.room.d<sy1> {
        a(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM `animes` WHERE `series_animedb_id` = ?";
        }

        /* renamed from: i */
        public void g(q6 q6Var, sy1 sy1) {
            q6Var.bindLong(1, sy1.c());
        }
    }

    class a0 extends androidx.room.e<lx1> {
        a0(androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `AnimeJikanInfoR2` (`malId`,`title`,`title_english`,`image_url`,`type`,`source`,`episodes`,`status`,`duration`,`rating`,`popularity`,`score`,`rank`,`trailer_url`,`synopsis`,`broadcast`,`studio`,`genre`,`opening_theme`,`ending_theme`,`expirationDate`,`jikanRelated`,`synonyms`,`airedInfo`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, lx1 lx1) {
            if (lx1.n() == null) {
                q6Var.bindNull(1);
            } else {
                q6Var.bindLong(1, (long) lx1.n().intValue());
            }
            if (lx1.z() == null) {
                q6Var.bindNull(2);
            } else {
                q6Var.bindString(2, lx1.z());
            }
            if (lx1.A() == null) {
                q6Var.bindNull(3);
            } else {
                q6Var.bindString(3, lx1.A());
            }
            if (lx1.k() == null) {
                q6Var.bindNull(4);
            } else {
                q6Var.bindString(4, lx1.k());
            }
            if (lx1.C() == null) {
                q6Var.bindNull(5);
            } else {
                q6Var.bindString(5, lx1.C());
            }
            if (lx1.u() == null) {
                q6Var.bindNull(6);
            } else {
                q6Var.bindString(6, lx1.u());
            }
            if (lx1.h() == null) {
                q6Var.bindNull(7);
            } else {
                q6Var.bindLong(7, (long) lx1.h().intValue());
            }
            if (lx1.v() == null) {
                q6Var.bindNull(8);
            } else {
                q6Var.bindString(8, lx1.v());
            }
            if (lx1.e() == null) {
                q6Var.bindNull(9);
            } else {
                q6Var.bindString(9, lx1.e());
            }
            if (lx1.s() == null) {
                q6Var.bindNull(10);
            } else {
                q6Var.bindString(10, lx1.s());
            }
            if (lx1.q() == null) {
                q6Var.bindNull(11);
            } else {
                q6Var.bindString(11, lx1.q());
            }
            if (lx1.t() == null) {
                q6Var.bindNull(12);
            } else {
                q6Var.bindDouble(12, lx1.t().doubleValue());
            }
            if (lx1.r() == null) {
                q6Var.bindNull(13);
            } else {
                q6Var.bindLong(13, (long) lx1.r().intValue());
            }
            if (lx1.B() == null) {
                q6Var.bindNull(14);
            } else {
                q6Var.bindString(14, lx1.B());
            }
            if (lx1.y() == null) {
                q6Var.bindNull(15);
            } else {
                q6Var.bindString(15, lx1.y());
            }
            if (lx1.d() == null) {
                q6Var.bindNull(16);
            } else {
                q6Var.bindString(16, lx1.d());
            }
            String b = b.this.d.b(lx1.w());
            if (b == null) {
                q6Var.bindNull(17);
            } else {
                q6Var.bindString(17, b);
            }
            String b2 = b.this.e.b(lx1.j());
            if (b2 == null) {
                q6Var.bindNull(18);
            } else {
                q6Var.bindString(18, b2);
            }
            String b3 = b.this.f.b(lx1.p());
            if (b3 == null) {
                q6Var.bindNull(19);
            } else {
                q6Var.bindString(19, b3);
            }
            String b4 = b.this.f.b(lx1.g());
            if (b4 == null) {
                q6Var.bindNull(20);
            } else {
                q6Var.bindString(20, b4);
            }
            q6Var.bindLong(21, lx1.i());
            String b5 = b.this.g.b(lx1.l());
            if (b5 == null) {
                q6Var.bindNull(22);
            } else {
                q6Var.bindString(22, b5);
            }
            String b6 = b.this.f.b(lx1.x());
            if (b6 == null) {
                q6Var.bindNull(23);
            } else {
                q6Var.bindString(23, b6);
            }
            String b7 = b.this.h.b(lx1.b());
            if (b7 == null) {
                q6Var.bindNull(24);
            } else {
                q6Var.bindString(24, b7);
            }
        }
    }

    /* renamed from: com.zunjae.anyme.features.database.b$b  reason: collision with other inner class name */
    class C0181b extends androidx.room.d<sy1> {
        C0181b(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE OR ABORT `animes` SET `series_animedb_id` = ?,`series_title` = ?,`series_type` = ?,`series_episodes` = ?,`series_status` = ?,`series_image` = ?,`my_watched_episodes` = ?,`my_score` = ?,`my_status` = ?,`my_order` = ?,`kitsu_malId` = ?,`kitsu_kitsuId` = ?,`kitsu_startDate2` = ?,`kitsu_endDate2` = ?,`kitsu_posterId` = ?,`kitsu_coverId` = ?,`kitsu_type` = ?,`kitsu_titleEnJp` = ?,`kitsu_titleEn` = ?,`kitsu_titleJaJp` = ?,`livechart_malid` = ?,`livechart_time` = ?,`livechart_episode` = ? WHERE `series_animedb_id` = ?";
        }

        /* JADX WARNING: Removed duplicated region for block: B:45:0x0148  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0160  */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(defpackage.q6 r14, defpackage.sy1 r15) {
            /*
                r13 = this;
                long r0 = r15.c()
                r2 = 1
                r14.bindLong(r2, r0)
                java.lang.String r0 = r15.y()
                r1 = 2
                if (r0 != 0) goto L_0x0013
                r14.bindNull(r1)
                goto L_0x001a
            L_0x0013:
                java.lang.String r0 = r15.y()
                r14.bindString(r1, r0)
            L_0x001a:
                r0 = 3
                int r1 = r15.z()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                r0 = 4
                int r1 = r15.u()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                r0 = 5
                int r1 = r15.x()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                java.lang.String r0 = r15.w()
                r1 = 6
                if (r0 != 0) goto L_0x0040
                r14.bindNull(r1)
                goto L_0x0047
            L_0x0040:
                java.lang.String r0 = r15.w()
                r14.bindString(r1, r0)
            L_0x0047:
                r0 = 7
                int r1 = r15.p()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                r0 = 8
                int r1 = r15.m()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                r0 = 9
                int r1 = r15.n()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                r0 = 10
                int r1 = r15.getOrder()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                yy1 r0 = r15.k()
                r1 = 12
                r2 = 11
                r3 = 20
                r4 = 19
                r5 = 18
                r6 = 17
                r7 = 16
                r8 = 15
                r9 = 14
                r10 = 13
                if (r0 == 0) goto L_0x011e
                int r11 = r0.h()
                long r11 = (long) r11
                r14.bindLong(r2, r11)
                int r2 = r0.g()
                long r11 = (long) r2
                r14.bindLong(r1, r11)
                java.lang.String r1 = r0.k()
                if (r1 != 0) goto L_0x00a2
                r14.bindNull(r10)
                goto L_0x00a9
            L_0x00a2:
                java.lang.String r1 = r0.k()
                r14.bindString(r10, r1)
            L_0x00a9:
                java.lang.String r1 = r0.e()
                if (r1 != 0) goto L_0x00b3
                r14.bindNull(r9)
                goto L_0x00ba
            L_0x00b3:
                java.lang.String r1 = r0.e()
                r14.bindString(r9, r1)
            L_0x00ba:
                java.lang.String r1 = r0.i()
                if (r1 != 0) goto L_0x00c4
                r14.bindNull(r8)
                goto L_0x00cb
            L_0x00c4:
                java.lang.String r1 = r0.i()
                r14.bindString(r8, r1)
            L_0x00cb:
                java.lang.String r1 = r0.b()
                if (r1 != 0) goto L_0x00d5
                r14.bindNull(r7)
                goto L_0x00dc
            L_0x00d5:
                java.lang.String r1 = r0.b()
                r14.bindString(r7, r1)
            L_0x00dc:
                java.lang.String r1 = r0.o()
                if (r1 != 0) goto L_0x00e6
                r14.bindNull(r6)
                goto L_0x00ed
            L_0x00e6:
                java.lang.String r1 = r0.o()
                r14.bindString(r6, r1)
            L_0x00ed:
                java.lang.String r1 = r0.m()
                if (r1 != 0) goto L_0x00f7
                r14.bindNull(r5)
                goto L_0x00fe
            L_0x00f7:
                java.lang.String r1 = r0.m()
                r14.bindString(r5, r1)
            L_0x00fe:
                java.lang.String r1 = r0.l()
                if (r1 != 0) goto L_0x0108
                r14.bindNull(r4)
                goto L_0x010f
            L_0x0108:
                java.lang.String r1 = r0.l()
                r14.bindString(r4, r1)
            L_0x010f:
                java.lang.String r1 = r0.n()
                if (r1 != 0) goto L_0x0116
                goto L_0x0139
            L_0x0116:
                java.lang.String r0 = r0.n()
                r14.bindString(r3, r0)
                goto L_0x013c
            L_0x011e:
                r14.bindNull(r2)
                r14.bindNull(r1)
                r14.bindNull(r10)
                r14.bindNull(r9)
                r14.bindNull(r8)
                r14.bindNull(r7)
                r14.bindNull(r6)
                r14.bindNull(r5)
                r14.bindNull(r4)
            L_0x0139:
                r14.bindNull(r3)
            L_0x013c:
                ky1 r0 = r15.d()
                r1 = 23
                r2 = 22
                r3 = 21
                if (r0 == 0) goto L_0x0160
                int r4 = r0.a()
                long r4 = (long) r4
                r14.bindLong(r3, r4)
                long r3 = r0.d()
                r14.bindLong(r2, r3)
                int r0 = r0.b()
                long r2 = (long) r0
                r14.bindLong(r1, r2)
                goto L_0x0169
            L_0x0160:
                r14.bindNull(r3)
                r14.bindNull(r2)
                r14.bindNull(r1)
            L_0x0169:
                r0 = 24
                long r1 = r15.c()
                r14.bindLong(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.C0181b.g(q6, sy1):void");
        }
    }

    class b0 implements Callable<List<vv1>> {
        final /* synthetic */ androidx.room.o a;

        b0(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public List<vv1> call() {
            Cursor b2 = h6.b(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                int b3 = g6.b(b2, "my_status");
                int b4 = g6.b(b2, "Count");
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    arrayList.add(new vv1(b2.getInt(b4), b2.getInt(b3)));
                }
                return arrayList;
            } finally {
                b2.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class c extends androidx.room.s {
        c(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM animes where series_animedb_id = ?";
        }
    }

    class c0 implements Callable<List<uv1>> {
        final /* synthetic */ androidx.room.o a;

        c0(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public List<uv1> call() {
            Cursor b2 = h6.b(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                int b3 = g6.b(b2, "my_score");
                int b4 = g6.b(b2, "Count");
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    arrayList.add(new uv1(b2.getInt(b4), b2.getInt(b3)));
                }
                return arrayList;
            } finally {
                b2.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class d extends androidx.room.s {
        d(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM releasedays";
        }
    }

    class d0 implements Callable<List<com.zunjae.downloader.b>> {
        final /* synthetic */ androidx.room.o a;

        d0(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:161:0x0495 A[Catch:{ all -> 0x0715 }] */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x04e8 A[Catch:{ all -> 0x0715 }] */
        /* JADX WARNING: Removed duplicated region for block: B:185:0x055b A[Catch:{ all -> 0x0715 }] */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x059a A[Catch:{ all -> 0x0715 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<com.zunjae.downloader.b> call() {
            /*
                r71 = this;
                r1 = r71
                java.lang.String r0 = "livechart_malid"
                java.lang.String r2 = "kitsu_titleJaJp"
                java.lang.String r3 = "kitsu_titleEn"
                java.lang.String r4 = "kitsu_titleEnJp"
                java.lang.String r5 = "kitsu_type"
                java.lang.String r6 = "kitsu_coverId"
                java.lang.String r7 = "kitsu_posterId"
                java.lang.String r8 = "kitsu_endDate2"
                java.lang.String r9 = "kitsu_startDate2"
                java.lang.String r10 = "kitsu_kitsuId"
                java.lang.String r11 = "kitsu_malId"
                java.lang.String r12 = "my_order"
                java.lang.String r13 = "my_status"
                java.lang.String r14 = "my_score"
                java.lang.String r15 = "my_watched_episodes"
                r16 = r0
                java.lang.String r0 = "series_image"
                r17 = r2
                java.lang.String r2 = "series_status"
                r18 = r3
                java.lang.String r3 = "series_episodes"
                r19 = r4
                java.lang.String r4 = "series_type"
                r20 = r5
                java.lang.String r5 = "series_title"
                r21 = r6
                java.lang.String r6 = "series_animedb_id"
                r22 = r7
                com.zunjae.anyme.features.database.b r7 = com.zunjae.anyme.features.database.b.this
                androidx.room.l r7 = r7.a
                r23 = r8
                androidx.room.o r8 = r1.a
                r1 = 0
                r24 = r9
                r9 = 0
                android.database.Cursor r1 = defpackage.h6.b(r7, r8, r1, r9)
                java.lang.String r7 = "fileDownloadId"
                int r7 = defpackage.g6.b(r1, r7)     // Catch:{ all -> 0x0715 }
                java.lang.String r8 = "malid"
                int r8 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                java.lang.String r9 = "seriesTitle"
                int r9 = defpackage.g6.b(r1, r9)     // Catch:{ all -> 0x0715 }
                r25 = r9
                java.lang.String r9 = "episodeNumber"
                int r9 = defpackage.g6.b(r1, r9)     // Catch:{ all -> 0x0715 }
                r26 = r9
                int r9 = defpackage.g6.b(r1, r6)     // Catch:{ all -> 0x0715 }
                r27 = r9
                int r9 = defpackage.g6.b(r1, r5)     // Catch:{ all -> 0x0715 }
                r28 = r9
                int r9 = defpackage.g6.b(r1, r4)     // Catch:{ all -> 0x0715 }
                r29 = r9
                int r9 = defpackage.g6.b(r1, r3)     // Catch:{ all -> 0x0715 }
                r30 = r9
                int r9 = defpackage.g6.b(r1, r2)     // Catch:{ all -> 0x0715 }
                r31 = r9
                int r9 = defpackage.g6.b(r1, r0)     // Catch:{ all -> 0x0715 }
                r32 = r9
                int r9 = defpackage.g6.b(r1, r15)     // Catch:{ all -> 0x0715 }
                r33 = r9
                int r9 = defpackage.g6.b(r1, r14)     // Catch:{ all -> 0x0715 }
                r34 = r9
                int r9 = defpackage.g6.b(r1, r13)     // Catch:{ all -> 0x0715 }
                r35 = r9
                int r9 = defpackage.g6.b(r1, r12)     // Catch:{ all -> 0x0715 }
                r36 = r9
                int r9 = defpackage.g6.b(r1, r11)     // Catch:{ all -> 0x0715 }
                r37 = r9
                int r9 = defpackage.g6.b(r1, r10)     // Catch:{ all -> 0x0715 }
                r38 = r9
                r9 = r24
                r24 = r8
                int r8 = defpackage.g6.b(r1, r9)     // Catch:{ all -> 0x0715 }
                r39 = r8
                r8 = r23
                r23 = r7
                int r7 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                r40 = r7
                r7 = r22
                r22 = r8
                int r8 = defpackage.g6.b(r1, r7)     // Catch:{ all -> 0x0715 }
                r41 = r8
                r8 = r21
                r21 = r7
                int r7 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                r42 = r7
                r7 = r20
                r20 = r8
                int r8 = defpackage.g6.b(r1, r7)     // Catch:{ all -> 0x0715 }
                r43 = r8
                r8 = r19
                r19 = r7
                int r7 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                r44 = r7
                r7 = r18
                r18 = r8
                int r8 = defpackage.g6.b(r1, r7)     // Catch:{ all -> 0x0715 }
                r45 = r8
                r8 = r17
                r17 = r7
                int r7 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                r46 = r7
                r7 = r16
                r16 = r8
                int r8 = defpackage.g6.b(r1, r7)     // Catch:{ all -> 0x0715 }
                r47 = r8
                java.lang.String r8 = "livechart_time"
                int r8 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                r48 = r8
                java.lang.String r8 = "livechart_episode"
                int r8 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                int r6 = defpackage.g6.b(r1, r6)     // Catch:{ all -> 0x0715 }
                int r5 = defpackage.g6.b(r1, r5)     // Catch:{ all -> 0x0715 }
                int r4 = defpackage.g6.b(r1, r4)     // Catch:{ all -> 0x0715 }
                int r3 = defpackage.g6.b(r1, r3)     // Catch:{ all -> 0x0715 }
                int r2 = defpackage.g6.b(r1, r2)     // Catch:{ all -> 0x0715 }
                int r0 = defpackage.g6.b(r1, r0)     // Catch:{ all -> 0x0715 }
                int r15 = defpackage.g6.b(r1, r15)     // Catch:{ all -> 0x0715 }
                int r14 = defpackage.g6.b(r1, r14)     // Catch:{ all -> 0x0715 }
                int r13 = defpackage.g6.b(r1, r13)     // Catch:{ all -> 0x0715 }
                int r12 = defpackage.g6.b(r1, r12)     // Catch:{ all -> 0x0715 }
                int r11 = defpackage.g6.b(r1, r11)     // Catch:{ all -> 0x0715 }
                int r10 = defpackage.g6.b(r1, r10)     // Catch:{ all -> 0x0715 }
                int r9 = defpackage.g6.b(r1, r9)     // Catch:{ all -> 0x0715 }
                r49 = r8
                r8 = r22
                int r8 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                r22 = r8
                r8 = r21
                int r8 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                r21 = r8
                r8 = r20
                int r8 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                r20 = r8
                r8 = r19
                int r8 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                r19 = r8
                r8 = r18
                int r8 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                r18 = r8
                r8 = r17
                int r8 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                r17 = r8
                r8 = r16
                int r8 = defpackage.g6.b(r1, r8)     // Catch:{ all -> 0x0715 }
                int r7 = defpackage.g6.b(r1, r7)     // Catch:{ all -> 0x0715 }
                r16 = r7
                java.lang.String r7 = "livechart_time"
                int r7 = defpackage.g6.b(r1, r7)     // Catch:{ all -> 0x0715 }
                r50 = r7
                java.lang.String r7 = "livechart_episode"
                int r7 = defpackage.g6.b(r1, r7)     // Catch:{ all -> 0x0715 }
                r51 = r7
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0715 }
                r52 = r8
                int r8 = r1.getCount()     // Catch:{ all -> 0x0715 }
                r7.<init>(r8)     // Catch:{ all -> 0x0715 }
            L_0x01a5:
                boolean r8 = r1.moveToNext()     // Catch:{ all -> 0x0715 }
                if (r8 == 0) goto L_0x0709
                r8 = r23
                long r54 = r1.getLong(r8)     // Catch:{ all -> 0x0715 }
                r8 = r24
                int r56 = r1.getInt(r8)     // Catch:{ all -> 0x0715 }
                r24 = r8
                r8 = r25
                java.lang.String r57 = r1.getString(r8)     // Catch:{ all -> 0x0715 }
                r25 = r8
                r8 = r26
                int r58 = r1.getInt(r8)     // Catch:{ all -> 0x0715 }
                r26 = r8
                r8 = r27
                boolean r27 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r27 == 0) goto L_0x040d
                r27 = r7
                r7 = r28
                boolean r28 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r28 == 0) goto L_0x040a
                r28 = r7
                r7 = r29
                boolean r29 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r29 == 0) goto L_0x0407
                r29 = r7
                r7 = r30
                boolean r30 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r30 == 0) goto L_0x0404
                r30 = r7
                r7 = r31
                boolean r31 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r31 == 0) goto L_0x0401
                r31 = r7
                r7 = r32
                boolean r32 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r32 == 0) goto L_0x03fe
                r32 = r7
                r7 = r33
                boolean r33 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r33 == 0) goto L_0x03fb
                r33 = r7
                r7 = r34
                boolean r34 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r34 == 0) goto L_0x03f8
                r34 = r7
                r7 = r35
                boolean r35 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r35 == 0) goto L_0x03f5
                r35 = r7
                r7 = r36
                boolean r36 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r36 == 0) goto L_0x03c3
                boolean r36 = r1.isNull(r6)     // Catch:{ all -> 0x0715 }
                if (r36 == 0) goto L_0x03c3
                boolean r36 = r1.isNull(r5)     // Catch:{ all -> 0x0715 }
                if (r36 == 0) goto L_0x03c3
                boolean r36 = r1.isNull(r4)     // Catch:{ all -> 0x0715 }
                if (r36 == 0) goto L_0x03c3
                boolean r36 = r1.isNull(r3)     // Catch:{ all -> 0x0715 }
                if (r36 == 0) goto L_0x03c3
                boolean r36 = r1.isNull(r2)     // Catch:{ all -> 0x0715 }
                if (r36 == 0) goto L_0x03c3
                boolean r36 = r1.isNull(r0)     // Catch:{ all -> 0x0715 }
                if (r36 == 0) goto L_0x03c3
                boolean r36 = r1.isNull(r15)     // Catch:{ all -> 0x0715 }
                if (r36 == 0) goto L_0x03c3
                boolean r36 = r1.isNull(r14)     // Catch:{ all -> 0x0715 }
                if (r36 == 0) goto L_0x03c3
                boolean r36 = r1.isNull(r13)     // Catch:{ all -> 0x0715 }
                if (r36 == 0) goto L_0x03c3
                boolean r36 = r1.isNull(r12)     // Catch:{ all -> 0x0715 }
                if (r36 == 0) goto L_0x03c3
                r36 = r12
                r12 = r37
                boolean r37 = r1.isNull(r12)     // Catch:{ all -> 0x0715 }
                if (r37 == 0) goto L_0x03c7
                r37 = r13
                r13 = r38
                boolean r38 = r1.isNull(r13)     // Catch:{ all -> 0x0715 }
                if (r38 == 0) goto L_0x03cb
                r38 = r14
                r14 = r39
                boolean r39 = r1.isNull(r14)     // Catch:{ all -> 0x0715 }
                if (r39 == 0) goto L_0x03cf
                r39 = r15
                r15 = r40
                boolean r40 = r1.isNull(r15)     // Catch:{ all -> 0x0715 }
                if (r40 == 0) goto L_0x03d3
                r40 = r0
                r0 = r41
                boolean r41 = r1.isNull(r0)     // Catch:{ all -> 0x0715 }
                if (r41 == 0) goto L_0x03d7
                r41 = r2
                r2 = r42
                boolean r42 = r1.isNull(r2)     // Catch:{ all -> 0x0715 }
                if (r42 == 0) goto L_0x03db
                r42 = r3
                r3 = r43
                boolean r43 = r1.isNull(r3)     // Catch:{ all -> 0x0715 }
                if (r43 == 0) goto L_0x03df
                r43 = r4
                r4 = r44
                boolean r44 = r1.isNull(r4)     // Catch:{ all -> 0x0715 }
                if (r44 == 0) goto L_0x03e3
                r44 = r5
                r5 = r45
                boolean r45 = r1.isNull(r5)     // Catch:{ all -> 0x0715 }
                if (r45 == 0) goto L_0x03e7
                r45 = r6
                r6 = r46
                boolean r46 = r1.isNull(r6)     // Catch:{ all -> 0x0715 }
                if (r46 == 0) goto L_0x03eb
                boolean r46 = r1.isNull(r11)     // Catch:{ all -> 0x0715 }
                if (r46 == 0) goto L_0x03eb
                boolean r46 = r1.isNull(r10)     // Catch:{ all -> 0x0715 }
                if (r46 == 0) goto L_0x03eb
                boolean r46 = r1.isNull(r9)     // Catch:{ all -> 0x0715 }
                if (r46 == 0) goto L_0x03eb
                r46 = r7
                r7 = r22
                boolean r22 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r22 == 0) goto L_0x03ef
                r22 = r8
                r8 = r21
                boolean r21 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r21 == 0) goto L_0x03c0
                r21 = r8
                r8 = r20
                boolean r20 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r20 == 0) goto L_0x03bd
                r20 = r8
                r8 = r19
                boolean r19 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r19 == 0) goto L_0x03ba
                r19 = r8
                r8 = r18
                boolean r18 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r18 == 0) goto L_0x03b7
                r18 = r8
                r8 = r17
                boolean r17 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r17 == 0) goto L_0x03b4
                r17 = r8
                r8 = r52
                boolean r52 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r52 == 0) goto L_0x03b1
                r52 = r8
                r8 = r47
                boolean r47 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r47 == 0) goto L_0x03ae
                r47 = r8
                r8 = r48
                boolean r48 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r48 == 0) goto L_0x03ab
                r48 = r8
                r8 = r49
                boolean r49 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r49 == 0) goto L_0x03a8
                r49 = r8
                r8 = r16
                boolean r16 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r16 == 0) goto L_0x03a5
                r16 = r8
                r8 = r50
                boolean r50 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r50 == 0) goto L_0x03a1
                r50 = r8
                r8 = r51
                boolean r51 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r51 != 0) goto L_0x0361
                goto L_0x0441
            L_0x0361:
                r62 = r9
                r61 = r10
                r60 = r17
                r9 = r28
                r10 = r29
                r63 = r47
                r64 = r48
                r29 = r50
                r51 = r52
                r59 = 0
                r52 = r0
                r17 = r2
                r47 = r3
                r48 = r4
                r50 = r7
                r28 = r16
                r4 = r36
                r36 = r37
                r37 = r38
                r38 = r39
                r39 = r40
                r40 = r41
                r41 = r42
                r7 = r43
                r42 = r45
                r16 = r6
                r45 = r8
                r8 = r22
                r6 = r44
                r22 = r49
                r49 = r5
                goto L_0x06b7
            L_0x03a1:
                r50 = r8
                goto L_0x03f1
            L_0x03a5:
                r16 = r8
                goto L_0x03f1
            L_0x03a8:
                r49 = r8
                goto L_0x03f1
            L_0x03ab:
                r48 = r8
                goto L_0x03f1
            L_0x03ae:
                r47 = r8
                goto L_0x03f1
            L_0x03b1:
                r52 = r8
                goto L_0x03f1
            L_0x03b4:
                r17 = r8
                goto L_0x03f1
            L_0x03b7:
                r18 = r8
                goto L_0x03f1
            L_0x03ba:
                r19 = r8
                goto L_0x03f1
            L_0x03bd:
                r20 = r8
                goto L_0x03f1
            L_0x03c0:
                r21 = r8
                goto L_0x03f1
            L_0x03c3:
                r36 = r12
                r12 = r37
            L_0x03c7:
                r37 = r13
                r13 = r38
            L_0x03cb:
                r38 = r14
                r14 = r39
            L_0x03cf:
                r39 = r15
                r15 = r40
            L_0x03d3:
                r40 = r0
                r0 = r41
            L_0x03d7:
                r41 = r2
                r2 = r42
            L_0x03db:
                r42 = r3
                r3 = r43
            L_0x03df:
                r43 = r4
                r4 = r44
            L_0x03e3:
                r44 = r5
                r5 = r45
            L_0x03e7:
                r45 = r6
                r6 = r46
            L_0x03eb:
                r46 = r7
                r7 = r22
            L_0x03ef:
                r22 = r8
            L_0x03f1:
                r8 = r51
                goto L_0x0441
            L_0x03f5:
                r35 = r7
                goto L_0x040f
            L_0x03f8:
                r34 = r7
                goto L_0x040f
            L_0x03fb:
                r33 = r7
                goto L_0x040f
            L_0x03fe:
                r32 = r7
                goto L_0x040f
            L_0x0401:
                r31 = r7
                goto L_0x040f
            L_0x0404:
                r30 = r7
                goto L_0x040f
            L_0x0407:
                r29 = r7
                goto L_0x040f
            L_0x040a:
                r28 = r7
                goto L_0x040f
            L_0x040d:
                r27 = r7
            L_0x040f:
                r7 = r22
                r22 = r8
                r8 = r51
                r70 = r40
                r40 = r0
                r0 = r41
                r41 = r2
                r2 = r42
                r42 = r3
                r3 = r43
                r43 = r4
                r4 = r44
                r44 = r5
                r5 = r45
                r45 = r6
                r6 = r46
                r46 = r36
                r36 = r12
                r12 = r37
                r37 = r13
                r13 = r38
                r38 = r14
                r14 = r39
                r39 = r15
                r15 = r70
            L_0x0441:
                boolean r51 = r1.isNull(r12)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r13)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r14)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r15)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r0)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r2)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r3)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r4)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r5)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r6)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r11)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r10)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r9)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                boolean r51 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r51 == 0) goto L_0x04e8
                r51 = r8
                r8 = r21
                boolean r21 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r21 == 0) goto L_0x04e5
                r21 = r8
                r8 = r20
                boolean r20 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r20 == 0) goto L_0x04e2
                r20 = r8
                r8 = r19
                boolean r19 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r19 == 0) goto L_0x04df
                r19 = r8
                r8 = r18
                boolean r18 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r18 == 0) goto L_0x04dc
                r18 = r8
                r8 = r17
                boolean r17 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r17 == 0) goto L_0x04d9
                r17 = r8
                r8 = r52
                boolean r52 = r1.isNull(r8)     // Catch:{ all -> 0x0715 }
                if (r52 != 0) goto L_0x04d2
                goto L_0x04ec
            L_0x04d2:
                r52 = r0
                r60 = r17
                r0 = 0
                goto L_0x0551
            L_0x04d9:
                r17 = r8
                goto L_0x04ea
            L_0x04dc:
                r18 = r8
                goto L_0x04ea
            L_0x04df:
                r19 = r8
                goto L_0x04ea
            L_0x04e2:
                r20 = r8
                goto L_0x04ea
            L_0x04e5:
                r21 = r8
                goto L_0x04ea
            L_0x04e8:
                r51 = r8
            L_0x04ea:
                r8 = r52
            L_0x04ec:
                int r60 = r1.getInt(r12)     // Catch:{ all -> 0x0715 }
                int r61 = r1.getInt(r13)     // Catch:{ all -> 0x0715 }
                java.lang.String r62 = r1.getString(r14)     // Catch:{ all -> 0x0715 }
                java.lang.String r63 = r1.getString(r15)     // Catch:{ all -> 0x0715 }
                java.lang.String r64 = r1.getString(r0)     // Catch:{ all -> 0x0715 }
                java.lang.String r65 = r1.getString(r2)     // Catch:{ all -> 0x0715 }
                java.lang.String r66 = r1.getString(r3)     // Catch:{ all -> 0x0715 }
                java.lang.String r67 = r1.getString(r4)     // Catch:{ all -> 0x0715 }
                java.lang.String r68 = r1.getString(r5)     // Catch:{ all -> 0x0715 }
                java.lang.String r69 = r1.getString(r6)     // Catch:{ all -> 0x0715 }
                r1.getInt(r11)     // Catch:{ all -> 0x0715 }
                r1.getInt(r10)     // Catch:{ all -> 0x0715 }
                r1.getString(r9)     // Catch:{ all -> 0x0715 }
                r1.getString(r7)     // Catch:{ all -> 0x0715 }
                r52 = r0
                r0 = r21
                r1.getString(r0)     // Catch:{ all -> 0x0715 }
                r21 = r0
                r0 = r20
                r1.getString(r0)     // Catch:{ all -> 0x0715 }
                r20 = r0
                r0 = r19
                r1.getString(r0)     // Catch:{ all -> 0x0715 }
                r19 = r0
                r0 = r18
                r1.getString(r0)     // Catch:{ all -> 0x0715 }
                r18 = r0
                r0 = r17
                r1.getString(r0)     // Catch:{ all -> 0x0715 }
                r1.getString(r8)     // Catch:{ all -> 0x0715 }
                yy1 r17 = new yy1     // Catch:{ all -> 0x0715 }
                r59 = r17
                r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)     // Catch:{ all -> 0x0715 }
                r60 = r0
                r0 = r17
            L_0x0551:
                r17 = r2
                r2 = r47
                boolean r47 = r1.isNull(r2)     // Catch:{ all -> 0x0715 }
                if (r47 == 0) goto L_0x059a
                r47 = r3
                r3 = r48
                boolean r48 = r1.isNull(r3)     // Catch:{ all -> 0x0715 }
                if (r48 == 0) goto L_0x059e
                r48 = r4
                r4 = r49
                boolean r49 = r1.isNull(r4)     // Catch:{ all -> 0x0715 }
                if (r49 == 0) goto L_0x05a2
                r49 = r5
                r5 = r16
                boolean r16 = r1.isNull(r5)     // Catch:{ all -> 0x0715 }
                if (r16 == 0) goto L_0x05a6
                r16 = r6
                r6 = r50
                boolean r50 = r1.isNull(r6)     // Catch:{ all -> 0x0715 }
                if (r50 == 0) goto L_0x05aa
                r50 = r7
                r7 = r51
                boolean r51 = r1.isNull(r7)     // Catch:{ all -> 0x0715 }
                if (r51 != 0) goto L_0x058e
                goto L_0x05ae
            L_0x058e:
                r63 = r2
                r64 = r3
                r51 = r8
                r62 = r9
                r61 = r10
                r3 = 0
                goto L_0x05d2
            L_0x059a:
                r47 = r3
                r3 = r48
            L_0x059e:
                r48 = r4
                r4 = r49
            L_0x05a2:
                r49 = r5
                r5 = r16
            L_0x05a6:
                r16 = r6
                r6 = r50
            L_0x05aa:
                r50 = r7
                r7 = r51
            L_0x05ae:
                r51 = r8
                int r8 = r1.getInt(r2)     // Catch:{ all -> 0x0715 }
                r62 = r9
                r61 = r10
                long r9 = r1.getLong(r3)     // Catch:{ all -> 0x0715 }
                r63 = r2
                int r2 = r1.getInt(r4)     // Catch:{ all -> 0x0715 }
                r1.getInt(r5)     // Catch:{ all -> 0x0715 }
                r1.getLong(r6)     // Catch:{ all -> 0x0715 }
                r1.getInt(r7)     // Catch:{ all -> 0x0715 }
                r64 = r3
                ky1 r3 = new ky1     // Catch:{ all -> 0x0715 }
                r3.<init>(r8, r9, r2)     // Catch:{ all -> 0x0715 }
            L_0x05d2:
                sy1 r2 = new sy1     // Catch:{ all -> 0x0715 }
                r2.<init>()     // Catch:{ all -> 0x0715 }
                r8 = r22
                long r9 = r1.getLong(r8)     // Catch:{ all -> 0x0715 }
                r2.I(r9)     // Catch:{ all -> 0x0715 }
                r9 = r28
                java.lang.String r10 = r1.getString(r9)     // Catch:{ all -> 0x0715 }
                r2.a0(r10)     // Catch:{ all -> 0x0715 }
                r22 = r4
                r10 = r29
                int r4 = r1.getInt(r10)     // Catch:{ all -> 0x0715 }
                r2.b0(r4)     // Catch:{ all -> 0x0715 }
                r28 = r5
                r4 = r30
                int r5 = r1.getInt(r4)     // Catch:{ all -> 0x0715 }
                r2.W(r5)     // Catch:{ all -> 0x0715 }
                r30 = r4
                r5 = r31
                int r4 = r1.getInt(r5)     // Catch:{ all -> 0x0715 }
                r2.Y(r4)     // Catch:{ all -> 0x0715 }
                r31 = r5
                r4 = r32
                java.lang.String r5 = r1.getString(r4)     // Catch:{ all -> 0x0715 }
                r2.X(r5)     // Catch:{ all -> 0x0715 }
                r32 = r4
                r5 = r33
                int r4 = r1.getInt(r5)     // Catch:{ all -> 0x0715 }
                r2.S(r4)     // Catch:{ all -> 0x0715 }
                r33 = r5
                r4 = r34
                int r5 = r1.getInt(r4)     // Catch:{ all -> 0x0715 }
                r2.Q(r5)     // Catch:{ all -> 0x0715 }
                r34 = r4
                r5 = r35
                int r4 = r1.getInt(r5)     // Catch:{ all -> 0x0715 }
                r2.R(r4)     // Catch:{ all -> 0x0715 }
                r35 = r5
                r4 = r46
                int r5 = r1.getInt(r4)     // Catch:{ all -> 0x0715 }
                r2.T(r5)     // Catch:{ all -> 0x0715 }
                r29 = r6
                r5 = r45
                r45 = r7
                long r6 = r1.getLong(r5)     // Catch:{ all -> 0x0715 }
                r2.I(r6)     // Catch:{ all -> 0x0715 }
                r6 = r44
                java.lang.String r7 = r1.getString(r6)     // Catch:{ all -> 0x0715 }
                r2.a0(r7)     // Catch:{ all -> 0x0715 }
                r46 = r4
                r7 = r43
                int r4 = r1.getInt(r7)     // Catch:{ all -> 0x0715 }
                r2.b0(r4)     // Catch:{ all -> 0x0715 }
                r4 = r42
                r42 = r5
                int r5 = r1.getInt(r4)     // Catch:{ all -> 0x0715 }
                r2.W(r5)     // Catch:{ all -> 0x0715 }
                r5 = r41
                r41 = r4
                int r4 = r1.getInt(r5)     // Catch:{ all -> 0x0715 }
                r2.Y(r4)     // Catch:{ all -> 0x0715 }
                r4 = r40
                r40 = r5
                java.lang.String r5 = r1.getString(r4)     // Catch:{ all -> 0x0715 }
                r2.X(r5)     // Catch:{ all -> 0x0715 }
                r5 = r39
                r39 = r4
                int r4 = r1.getInt(r5)     // Catch:{ all -> 0x0715 }
                r2.S(r4)     // Catch:{ all -> 0x0715 }
                r4 = r38
                r38 = r5
                int r5 = r1.getInt(r4)     // Catch:{ all -> 0x0715 }
                r2.Q(r5)     // Catch:{ all -> 0x0715 }
                r5 = r37
                r37 = r4
                int r4 = r1.getInt(r5)     // Catch:{ all -> 0x0715 }
                r2.R(r4)     // Catch:{ all -> 0x0715 }
                r4 = r36
                r36 = r5
                int r5 = r1.getInt(r4)     // Catch:{ all -> 0x0715 }
                r2.T(r5)     // Catch:{ all -> 0x0715 }
                r2.O(r0)     // Catch:{ all -> 0x0715 }
                r2.J(r3)     // Catch:{ all -> 0x0715 }
                r59 = r2
            L_0x06b7:
                com.zunjae.downloader.b r0 = new com.zunjae.downloader.b     // Catch:{ all -> 0x0715 }
                r53 = r0
                r53.<init>(r54, r56, r57, r58, r59)     // Catch:{ all -> 0x0715 }
                r2 = r27
                r2.add(r0)     // Catch:{ all -> 0x0715 }
                r5 = r6
                r27 = r8
                r0 = r39
                r3 = r41
                r6 = r42
                r43 = r47
                r44 = r48
                r41 = r52
                r47 = r63
                r48 = r64
                r39 = r14
                r42 = r17
                r14 = r37
                r52 = r51
                r17 = r60
                r37 = r12
                r51 = r45
                r45 = r49
                r12 = r4
                r4 = r7
                r49 = r22
                r22 = r50
                r7 = r2
                r50 = r29
                r2 = r40
                r29 = r10
                r40 = r15
                r15 = r38
                r10 = r61
                r38 = r13
                r13 = r36
                r36 = r46
                r46 = r16
                r16 = r28
                r28 = r9
                r9 = r62
                goto L_0x01a5
            L_0x0709:
                r2 = r7
                r1.close()
                r3 = r71
                androidx.room.o r0 = r3.a
                r0.l()
                return r2
            L_0x0715:
                r0 = move-exception
                r3 = r71
                r1.close()
                androidx.room.o r1 = r3.a
                r1.l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.d0.call():java.util.List");
        }
    }

    class e extends androidx.room.s {
        e(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM animes";
        }
    }

    class e0 implements Callable<Integer> {
        final /* synthetic */ androidx.room.o a;

        e0(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public Integer call() {
            Integer num = null;
            Cursor b2 = h6.b(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                if (b2.moveToFirst()) {
                    if (!b2.isNull(0)) {
                        num = Integer.valueOf(b2.getInt(0));
                    }
                }
                return num;
            } finally {
                b2.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class f extends androidx.room.s {
        f(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM animerecommendations WHERE parentAnimeId = ?";
        }
    }

    class f0 extends androidx.room.e<ux1> {
        f0(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `animerecommendations` (`animeId`,`parentAnimeId`,`title`,`image`,`priority`,`expirationDate`) VALUES (?,?,?,?,?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, ux1 ux1) {
            q6Var.bindLong(1, ux1.a());
            q6Var.bindLong(2, ux1.d());
            if (ux1.f() == null) {
                q6Var.bindNull(3);
            } else {
                q6Var.bindString(3, ux1.f());
            }
            if (ux1.c() == null) {
                q6Var.bindNull(4);
            } else {
                q6Var.bindString(4, ux1.c());
            }
            q6Var.bindLong(5, (long) ux1.e());
            q6Var.bindLong(6, ux1.b());
        }
    }

    class g extends androidx.room.s {
        g(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM CalendarEntry";
        }
    }

    class g0 extends androidx.room.e<bs1> {
        g0(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `CalendarEntry` (`malid`,`time`,`series_cover`,`tags`,`title`,`episode`,`dayOfWeek`) VALUES (?,?,?,?,?,?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, bs1 bs1) {
            Integer num = bs1.a;
            if (num == null) {
                q6Var.bindNull(1);
            } else {
                q6Var.bindLong(1, (long) num.intValue());
            }
            q6Var.bindLong(2, bs1.b);
            String str = bs1.c;
            if (str == null) {
                q6Var.bindNull(3);
            } else {
                q6Var.bindString(3, str);
            }
            String str2 = bs1.d;
            if (str2 == null) {
                q6Var.bindNull(4);
            } else {
                q6Var.bindString(4, str2);
            }
            String str3 = bs1.e;
            if (str3 == null) {
                q6Var.bindNull(5);
            } else {
                q6Var.bindString(5, str3);
            }
            q6Var.bindLong(6, (long) bs1.f);
            q6Var.bindLong(7, (long) bs1.h);
        }
    }

    class h extends androidx.room.s {
        h(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM related_animes where parent_anime_id = ?";
        }
    }

    class h0 extends androidx.room.e<bs1> {
        h0(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `CalendarEntry` (`malid`,`time`,`series_cover`,`tags`,`title`,`episode`,`dayOfWeek`) VALUES (?,?,?,?,?,?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, bs1 bs1) {
            Integer num = bs1.a;
            if (num == null) {
                q6Var.bindNull(1);
            } else {
                q6Var.bindLong(1, (long) num.intValue());
            }
            q6Var.bindLong(2, bs1.b);
            String str = bs1.c;
            if (str == null) {
                q6Var.bindNull(3);
            } else {
                q6Var.bindString(3, str);
            }
            String str2 = bs1.d;
            if (str2 == null) {
                q6Var.bindNull(4);
            } else {
                q6Var.bindString(4, str2);
            }
            String str3 = bs1.e;
            if (str3 == null) {
                q6Var.bindNull(5);
            } else {
                q6Var.bindString(5, str3);
            }
            q6Var.bindLong(6, (long) bs1.f);
            q6Var.bindLong(7, (long) bs1.h);
        }
    }

    class i extends androidx.room.s {
        i(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM nsfwshows";
        }
    }

    class i0 extends androidx.room.e<az1> {
        i0(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `related_animes` (`parent_anime_id`,`series_id`,`title`,`type`,`episodes`,`picture`,`expiration_date`) VALUES (?,?,?,?,?,?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, az1 az1) {
            q6Var.bindLong(1, (long) az1.d());
            if (az1.f() == null) {
                q6Var.bindNull(2);
            } else {
                q6Var.bindLong(2, (long) az1.f().intValue());
            }
            if (az1.g() == null) {
                q6Var.bindNull(3);
            } else {
                q6Var.bindString(3, az1.g());
            }
            if (az1.h() == null) {
                q6Var.bindNull(4);
            } else {
                q6Var.bindString(4, az1.h());
            }
            if (az1.a() == null) {
                q6Var.bindNull(5);
            } else {
                q6Var.bindLong(5, (long) az1.a().intValue());
            }
            if (az1.e() == null) {
                q6Var.bindNull(6);
            } else {
                q6Var.bindString(6, az1.e());
            }
            q6Var.bindLong(7, az1.b());
        }
    }

    class j implements Callable<u22> {
        final /* synthetic */ com.zunjae.downloader.b a;

        j(com.zunjae.downloader.b bVar) {
            this.a = bVar;
        }

        /* renamed from: a */
        public u22 call() {
            b.this.a.c();
            try {
                b.this.m.i(this.a);
                b.this.a.v();
                return u22.a;
            } finally {
                b.this.a.h();
            }
        }
    }

    class j0 extends androidx.room.e<zy1> {
        j0(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `nsfwshows` (`nsfw_animeid`) VALUES (?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, zy1 zy1) {
            q6Var.bindLong(1, (long) zy1.a());
        }
    }

    class k extends androidx.room.e<sy1> {
        k(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `animes` (`series_animedb_id`,`series_title`,`series_type`,`series_episodes`,`series_status`,`series_image`,`my_watched_episodes`,`my_score`,`my_status`,`my_order`,`kitsu_malId`,`kitsu_kitsuId`,`kitsu_startDate2`,`kitsu_endDate2`,`kitsu_posterId`,`kitsu_coverId`,`kitsu_type`,`kitsu_titleEnJp`,`kitsu_titleEn`,`kitsu_titleJaJp`,`livechart_malid`,`livechart_time`,`livechart_episode`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARNING: Removed duplicated region for block: B:45:0x0148  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0160  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(defpackage.q6 r14, defpackage.sy1 r15) {
            /*
                r13 = this;
                long r0 = r15.c()
                r2 = 1
                r14.bindLong(r2, r0)
                java.lang.String r0 = r15.y()
                r1 = 2
                if (r0 != 0) goto L_0x0013
                r14.bindNull(r1)
                goto L_0x001a
            L_0x0013:
                java.lang.String r0 = r15.y()
                r14.bindString(r1, r0)
            L_0x001a:
                r0 = 3
                int r1 = r15.z()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                r0 = 4
                int r1 = r15.u()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                r0 = 5
                int r1 = r15.x()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                java.lang.String r0 = r15.w()
                r1 = 6
                if (r0 != 0) goto L_0x0040
                r14.bindNull(r1)
                goto L_0x0047
            L_0x0040:
                java.lang.String r0 = r15.w()
                r14.bindString(r1, r0)
            L_0x0047:
                r0 = 7
                int r1 = r15.p()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                r0 = 8
                int r1 = r15.m()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                r0 = 9
                int r1 = r15.n()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                r0 = 10
                int r1 = r15.getOrder()
                long r1 = (long) r1
                r14.bindLong(r0, r1)
                yy1 r0 = r15.k()
                r1 = 12
                r2 = 11
                r3 = 20
                r4 = 19
                r5 = 18
                r6 = 17
                r7 = 16
                r8 = 15
                r9 = 14
                r10 = 13
                if (r0 == 0) goto L_0x011e
                int r11 = r0.h()
                long r11 = (long) r11
                r14.bindLong(r2, r11)
                int r2 = r0.g()
                long r11 = (long) r2
                r14.bindLong(r1, r11)
                java.lang.String r1 = r0.k()
                if (r1 != 0) goto L_0x00a2
                r14.bindNull(r10)
                goto L_0x00a9
            L_0x00a2:
                java.lang.String r1 = r0.k()
                r14.bindString(r10, r1)
            L_0x00a9:
                java.lang.String r1 = r0.e()
                if (r1 != 0) goto L_0x00b3
                r14.bindNull(r9)
                goto L_0x00ba
            L_0x00b3:
                java.lang.String r1 = r0.e()
                r14.bindString(r9, r1)
            L_0x00ba:
                java.lang.String r1 = r0.i()
                if (r1 != 0) goto L_0x00c4
                r14.bindNull(r8)
                goto L_0x00cb
            L_0x00c4:
                java.lang.String r1 = r0.i()
                r14.bindString(r8, r1)
            L_0x00cb:
                java.lang.String r1 = r0.b()
                if (r1 != 0) goto L_0x00d5
                r14.bindNull(r7)
                goto L_0x00dc
            L_0x00d5:
                java.lang.String r1 = r0.b()
                r14.bindString(r7, r1)
            L_0x00dc:
                java.lang.String r1 = r0.o()
                if (r1 != 0) goto L_0x00e6
                r14.bindNull(r6)
                goto L_0x00ed
            L_0x00e6:
                java.lang.String r1 = r0.o()
                r14.bindString(r6, r1)
            L_0x00ed:
                java.lang.String r1 = r0.m()
                if (r1 != 0) goto L_0x00f7
                r14.bindNull(r5)
                goto L_0x00fe
            L_0x00f7:
                java.lang.String r1 = r0.m()
                r14.bindString(r5, r1)
            L_0x00fe:
                java.lang.String r1 = r0.l()
                if (r1 != 0) goto L_0x0108
                r14.bindNull(r4)
                goto L_0x010f
            L_0x0108:
                java.lang.String r1 = r0.l()
                r14.bindString(r4, r1)
            L_0x010f:
                java.lang.String r1 = r0.n()
                if (r1 != 0) goto L_0x0116
                goto L_0x0139
            L_0x0116:
                java.lang.String r0 = r0.n()
                r14.bindString(r3, r0)
                goto L_0x013c
            L_0x011e:
                r14.bindNull(r2)
                r14.bindNull(r1)
                r14.bindNull(r10)
                r14.bindNull(r9)
                r14.bindNull(r8)
                r14.bindNull(r7)
                r14.bindNull(r6)
                r14.bindNull(r5)
                r14.bindNull(r4)
            L_0x0139:
                r14.bindNull(r3)
            L_0x013c:
                ky1 r15 = r15.d()
                r0 = 23
                r1 = 22
                r2 = 21
                if (r15 == 0) goto L_0x0160
                int r3 = r15.a()
                long r3 = (long) r3
                r14.bindLong(r2, r3)
                long r2 = r15.d()
                r14.bindLong(r1, r2)
                int r15 = r15.b()
                long r1 = (long) r15
                r14.bindLong(r0, r1)
                goto L_0x0169
            L_0x0160:
                r14.bindNull(r2)
                r14.bindNull(r1)
                r14.bindNull(r0)
            L_0x0169:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.k.g(q6, sy1):void");
        }
    }

    class k0 extends androidx.room.e<com.zunjae.downloader.b> {
        k0(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `AnimeDownloadEntry` (`fileDownloadId`,`malid`,`seriesTitle`,`episodeNumber`,`series_animedb_id`,`series_title`,`series_type`,`series_episodes`,`series_status`,`series_image`,`my_watched_episodes`,`my_score`,`my_status`,`my_order`,`kitsu_malId`,`kitsu_kitsuId`,`kitsu_startDate2`,`kitsu_endDate2`,`kitsu_posterId`,`kitsu_coverId`,`kitsu_type`,`kitsu_titleEnJp`,`kitsu_titleEn`,`kitsu_titleJaJp`,`livechart_malid`,`livechart_time`,`livechart_episode`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARNING: Removed duplicated region for block: B:52:0x0192  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x01b0  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(defpackage.q6 r17, com.zunjae.downloader.b r18) {
            /*
                r16 = this;
                r0 = r17
                long r1 = r18.c()
                r3 = 1
                r0.bindLong(r3, r1)
                int r1 = r18.d()
                long r1 = (long) r1
                r3 = 2
                r0.bindLong(r3, r1)
                java.lang.String r1 = r18.e()
                r2 = 3
                if (r1 != 0) goto L_0x001e
                r0.bindNull(r2)
                goto L_0x0025
            L_0x001e:
                java.lang.String r1 = r18.e()
                r0.bindString(r2, r1)
            L_0x0025:
                r1 = 4
                int r2 = r18.b()
                long r2 = (long) r2
                r0.bindLong(r1, r2)
                sy1 r1 = r18.a()
                r2 = 12
                r3 = 11
                r4 = 9
                r5 = 8
                r6 = 7
                r7 = 5
                r11 = 16
                r12 = 15
                r13 = 10
                r14 = 6
                r15 = 20
                r10 = 17
                if (r1 == 0) goto L_0x01c0
                long r8 = r1.c()
                r0.bindLong(r7, r8)
                java.lang.String r7 = r1.y()
                if (r7 != 0) goto L_0x005a
                r0.bindNull(r14)
                goto L_0x0061
            L_0x005a:
                java.lang.String r7 = r1.y()
                r0.bindString(r14, r7)
            L_0x0061:
                int r7 = r1.z()
                long r7 = (long) r7
                r0.bindLong(r6, r7)
                int r6 = r1.u()
                long r6 = (long) r6
                r0.bindLong(r5, r6)
                int r5 = r1.x()
                long r5 = (long) r5
                r0.bindLong(r4, r5)
                java.lang.String r4 = r1.w()
                if (r4 != 0) goto L_0x0083
                r0.bindNull(r13)
                goto L_0x008a
            L_0x0083:
                java.lang.String r4 = r1.w()
                r0.bindString(r13, r4)
            L_0x008a:
                int r4 = r1.p()
                long r4 = (long) r4
                r0.bindLong(r3, r4)
                int r3 = r1.m()
                long r3 = (long) r3
                r0.bindLong(r2, r3)
                r2 = 13
                int r3 = r1.n()
                long r3 = (long) r3
                r0.bindLong(r2, r3)
                r2 = 14
                int r3 = r1.getOrder()
                long r3 = (long) r3
                r0.bindLong(r2, r3)
                yy1 r2 = r1.k()
                if (r2 == 0) goto L_0x0162
                int r3 = r2.h()
                long r3 = (long) r3
                r0.bindLong(r12, r3)
                int r3 = r2.g()
                long r3 = (long) r3
                r0.bindLong(r11, r3)
                java.lang.String r3 = r2.k()
                if (r3 != 0) goto L_0x00ce
                r0.bindNull(r10)
                goto L_0x00d5
            L_0x00ce:
                java.lang.String r3 = r2.k()
                r0.bindString(r10, r3)
            L_0x00d5:
                java.lang.String r3 = r2.e()
                if (r3 != 0) goto L_0x00e1
                r3 = 18
                r0.bindNull(r3)
                goto L_0x00ea
            L_0x00e1:
                r3 = 18
                java.lang.String r4 = r2.e()
                r0.bindString(r3, r4)
            L_0x00ea:
                java.lang.String r3 = r2.i()
                if (r3 != 0) goto L_0x00f6
                r3 = 19
                r0.bindNull(r3)
                goto L_0x00ff
            L_0x00f6:
                r3 = 19
                java.lang.String r4 = r2.i()
                r0.bindString(r3, r4)
            L_0x00ff:
                java.lang.String r3 = r2.b()
                if (r3 != 0) goto L_0x0109
                r0.bindNull(r15)
                goto L_0x0110
            L_0x0109:
                java.lang.String r3 = r2.b()
                r0.bindString(r15, r3)
            L_0x0110:
                java.lang.String r3 = r2.o()
                if (r3 != 0) goto L_0x011c
                r3 = 21
                r0.bindNull(r3)
                goto L_0x0125
            L_0x011c:
                r3 = 21
                java.lang.String r4 = r2.o()
                r0.bindString(r3, r4)
            L_0x0125:
                java.lang.String r3 = r2.m()
                if (r3 != 0) goto L_0x0131
                r3 = 22
                r0.bindNull(r3)
                goto L_0x013a
            L_0x0131:
                r3 = 22
                java.lang.String r4 = r2.m()
                r0.bindString(r3, r4)
            L_0x013a:
                java.lang.String r3 = r2.l()
                if (r3 != 0) goto L_0x0146
                r3 = 23
                r0.bindNull(r3)
                goto L_0x014f
            L_0x0146:
                r3 = 23
                java.lang.String r4 = r2.l()
                r0.bindString(r3, r4)
            L_0x014f:
                java.lang.String r3 = r2.n()
                if (r3 != 0) goto L_0x0158
                r3 = 24
                goto L_0x0189
            L_0x0158:
                r3 = 24
                java.lang.String r2 = r2.n()
                r0.bindString(r3, r2)
                goto L_0x018c
            L_0x0162:
                r3 = 24
                r0.bindNull(r12)
                r0.bindNull(r11)
                r0.bindNull(r10)
                r2 = 18
                r0.bindNull(r2)
                r2 = 19
                r0.bindNull(r2)
                r0.bindNull(r15)
                r2 = 21
                r0.bindNull(r2)
                r2 = 22
                r0.bindNull(r2)
                r2 = 23
                r0.bindNull(r2)
            L_0x0189:
                r0.bindNull(r3)
            L_0x018c:
                ky1 r1 = r1.d()
                if (r1 == 0) goto L_0x01b0
                int r2 = r1.a()
                long r2 = (long) r2
                r4 = 25
                r0.bindLong(r4, r2)
                long r2 = r1.d()
                r5 = 26
                r0.bindLong(r5, r2)
                int r1 = r1.b()
                long r1 = (long) r1
                r3 = 27
                r0.bindLong(r3, r1)
                goto L_0x021b
            L_0x01b0:
                r3 = 27
                r4 = 25
                r5 = 26
                r0.bindNull(r4)
                r0.bindNull(r5)
                r0.bindNull(r3)
                goto L_0x021b
            L_0x01c0:
                r0.bindNull(r7)
                r0.bindNull(r14)
                r0.bindNull(r6)
                r0.bindNull(r5)
                r0.bindNull(r4)
                r0.bindNull(r13)
                r0.bindNull(r3)
                r0.bindNull(r2)
                r1 = 13
                r0.bindNull(r1)
                r1 = 14
                r0.bindNull(r1)
                r0.bindNull(r12)
                r0.bindNull(r11)
                r0.bindNull(r10)
                r1 = 18
                r0.bindNull(r1)
                r1 = 19
                r0.bindNull(r1)
                r0.bindNull(r15)
                r1 = 21
                r0.bindNull(r1)
                r1 = 22
                r0.bindNull(r1)
                r1 = 23
                r0.bindNull(r1)
                r1 = 24
                r0.bindNull(r1)
                r1 = 25
                r0.bindNull(r1)
                r1 = 26
                r0.bindNull(r1)
                r1 = 27
                r0.bindNull(r1)
            L_0x021b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.k0.g(q6, com.zunjae.downloader.b):void");
        }
    }

    class l implements Callable<Integer> {
        final /* synthetic */ androidx.room.o a;

        l(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public Integer call() {
            Integer num = null;
            Cursor b2 = h6.b(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                if (b2.moveToFirst()) {
                    if (!b2.isNull(0)) {
                        num = Integer.valueOf(b2.getInt(0));
                    }
                }
                return num;
            } finally {
                b2.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class m implements Callable<List<sy1>> {
        final /* synthetic */ androidx.room.o a;

        m(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x013d A[Catch:{ all -> 0x0201 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x013e A[Catch:{ all -> 0x0201 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<defpackage.sy1> call() {
            /*
                r37 = this;
                r1 = r37
                com.zunjae.anyme.features.database.b r0 = com.zunjae.anyme.features.database.b.this
                androidx.room.l r0 = r0.a
                androidx.room.o r2 = r1.a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = defpackage.h6.b(r0, r2, r3, r4)
                java.lang.String r0 = "series_animedb_id"
                int r0 = defpackage.g6.b(r2, r0)     // Catch:{ all -> 0x0201 }
                java.lang.String r3 = "series_title"
                int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x0201 }
                java.lang.String r5 = "series_type"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                java.lang.String r6 = "series_episodes"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                java.lang.String r7 = "series_status"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                java.lang.String r8 = "series_image"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                java.lang.String r9 = "my_watched_episodes"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r10 = "my_score"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r11 = "my_status"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r12 = "my_order"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r13 = "kitsu_malId"
                int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x0201 }
                java.lang.String r14 = "kitsu_kitsuId"
                int r14 = defpackage.g6.b(r2, r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r15 = "kitsu_startDate2"
                int r15 = defpackage.g6.b(r2, r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r4 = "kitsu_endDate2"
                int r4 = defpackage.g6.b(r2, r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r1 = "kitsu_posterId"
                int r1 = defpackage.g6.b(r2, r1)     // Catch:{ all -> 0x0201 }
                r16 = r12
                java.lang.String r12 = "kitsu_coverId"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                r17 = r11
                java.lang.String r11 = "kitsu_type"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                r18 = r10
                java.lang.String r10 = "kitsu_titleEnJp"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                r19 = r9
                java.lang.String r9 = "kitsu_titleEn"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                r20 = r8
                java.lang.String r8 = "kitsu_titleJaJp"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                r21 = r7
                java.lang.String r7 = "livechart_malid"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                r22 = r6
                java.lang.String r6 = "livechart_time"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                r23 = r5
                java.lang.String r5 = "livechart_episode"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                r24 = r3
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0201 }
                r25 = r0
                int r0 = r2.getCount()     // Catch:{ all -> 0x0201 }
                r3.<init>(r0)     // Catch:{ all -> 0x0201 }
            L_0x00b7:
                boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x01fd
                boolean r0 = r2.isNull(r13)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x0201 }
                if (r0 != 0) goto L_0x00fa
                goto L_0x00fc
            L_0x00fa:
                r0 = 0
                goto L_0x012b
            L_0x00fc:
                int r27 = r2.getInt(r13)     // Catch:{ all -> 0x0201 }
                int r28 = r2.getInt(r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r29 = r2.getString(r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r30 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r31 = r2.getString(r1)     // Catch:{ all -> 0x0201 }
                java.lang.String r32 = r2.getString(r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r33 = r2.getString(r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r34 = r2.getString(r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r35 = r2.getString(r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r36 = r2.getString(r8)     // Catch:{ all -> 0x0201 }
                yy1 r0 = new yy1     // Catch:{ all -> 0x0201 }
                r26 = r0
                r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0201 }
            L_0x012b:
                boolean r26 = r2.isNull(r7)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r6)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r5)     // Catch:{ all -> 0x0201 }
                if (r26 != 0) goto L_0x013e
                goto L_0x014a
            L_0x013e:
                r26 = r1
                r29 = r4
                r30 = r5
                r28 = r7
                r27 = r8
                r5 = 0
                goto L_0x0165
            L_0x014a:
                r26 = r1
                int r1 = r2.getInt(r7)     // Catch:{ all -> 0x0201 }
                r28 = r7
                r27 = r8
                long r7 = r2.getLong(r6)     // Catch:{ all -> 0x0201 }
                r29 = r4
                int r4 = r2.getInt(r5)     // Catch:{ all -> 0x0201 }
                r30 = r5
                ky1 r5 = new ky1     // Catch:{ all -> 0x0201 }
                r5.<init>(r1, r7, r4)     // Catch:{ all -> 0x0201 }
            L_0x0165:
                sy1 r1 = new sy1     // Catch:{ all -> 0x0201 }
                r1.<init>()     // Catch:{ all -> 0x0201 }
                r4 = r25
                long r7 = r2.getLong(r4)     // Catch:{ all -> 0x0201 }
                r1.I(r7)     // Catch:{ all -> 0x0201 }
                r7 = r24
                java.lang.String r8 = r2.getString(r7)     // Catch:{ all -> 0x0201 }
                r1.a0(r8)     // Catch:{ all -> 0x0201 }
                r25 = r4
                r8 = r23
                int r4 = r2.getInt(r8)     // Catch:{ all -> 0x0201 }
                r1.b0(r4)     // Catch:{ all -> 0x0201 }
                r4 = r22
                r22 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.W(r6)     // Catch:{ all -> 0x0201 }
                r6 = r21
                r21 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.Y(r4)     // Catch:{ all -> 0x0201 }
                r4 = r20
                r20 = r6
                java.lang.String r6 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                r1.X(r6)     // Catch:{ all -> 0x0201 }
                r6 = r19
                r19 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.S(r4)     // Catch:{ all -> 0x0201 }
                r4 = r18
                r18 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.Q(r6)     // Catch:{ all -> 0x0201 }
                r6 = r17
                r17 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.R(r4)     // Catch:{ all -> 0x0201 }
                r4 = r16
                r16 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.T(r6)     // Catch:{ all -> 0x0201 }
                r1.O(r0)     // Catch:{ all -> 0x0201 }
                r1.J(r5)     // Catch:{ all -> 0x0201 }
                r3.add(r1)     // Catch:{ all -> 0x0201 }
                r24 = r7
                r23 = r8
                r6 = r22
                r1 = r26
                r8 = r27
                r7 = r28
                r5 = r30
                r22 = r21
                r21 = r20
                r20 = r19
                r19 = r18
                r18 = r17
                r17 = r16
                r16 = r4
                r4 = r29
                goto L_0x00b7
            L_0x01fd:
                r2.close()
                return r3
            L_0x0201:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.m.call():java.util.List");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class n implements Callable<List<sy1>> {
        final /* synthetic */ androidx.room.o a;

        n(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x013d A[Catch:{ all -> 0x0201 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x013e A[Catch:{ all -> 0x0201 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<defpackage.sy1> call() {
            /*
                r37 = this;
                r1 = r37
                com.zunjae.anyme.features.database.b r0 = com.zunjae.anyme.features.database.b.this
                androidx.room.l r0 = r0.a
                androidx.room.o r2 = r1.a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = defpackage.h6.b(r0, r2, r3, r4)
                java.lang.String r0 = "series_animedb_id"
                int r0 = defpackage.g6.b(r2, r0)     // Catch:{ all -> 0x0201 }
                java.lang.String r3 = "series_title"
                int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x0201 }
                java.lang.String r5 = "series_type"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                java.lang.String r6 = "series_episodes"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                java.lang.String r7 = "series_status"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                java.lang.String r8 = "series_image"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                java.lang.String r9 = "my_watched_episodes"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r10 = "my_score"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r11 = "my_status"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r12 = "my_order"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r13 = "kitsu_malId"
                int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x0201 }
                java.lang.String r14 = "kitsu_kitsuId"
                int r14 = defpackage.g6.b(r2, r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r15 = "kitsu_startDate2"
                int r15 = defpackage.g6.b(r2, r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r4 = "kitsu_endDate2"
                int r4 = defpackage.g6.b(r2, r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r1 = "kitsu_posterId"
                int r1 = defpackage.g6.b(r2, r1)     // Catch:{ all -> 0x0201 }
                r16 = r12
                java.lang.String r12 = "kitsu_coverId"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                r17 = r11
                java.lang.String r11 = "kitsu_type"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                r18 = r10
                java.lang.String r10 = "kitsu_titleEnJp"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                r19 = r9
                java.lang.String r9 = "kitsu_titleEn"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                r20 = r8
                java.lang.String r8 = "kitsu_titleJaJp"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                r21 = r7
                java.lang.String r7 = "livechart_malid"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                r22 = r6
                java.lang.String r6 = "livechart_time"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                r23 = r5
                java.lang.String r5 = "livechart_episode"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                r24 = r3
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0201 }
                r25 = r0
                int r0 = r2.getCount()     // Catch:{ all -> 0x0201 }
                r3.<init>(r0)     // Catch:{ all -> 0x0201 }
            L_0x00b7:
                boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x01fd
                boolean r0 = r2.isNull(r13)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x0201 }
                if (r0 != 0) goto L_0x00fa
                goto L_0x00fc
            L_0x00fa:
                r0 = 0
                goto L_0x012b
            L_0x00fc:
                int r27 = r2.getInt(r13)     // Catch:{ all -> 0x0201 }
                int r28 = r2.getInt(r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r29 = r2.getString(r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r30 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r31 = r2.getString(r1)     // Catch:{ all -> 0x0201 }
                java.lang.String r32 = r2.getString(r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r33 = r2.getString(r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r34 = r2.getString(r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r35 = r2.getString(r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r36 = r2.getString(r8)     // Catch:{ all -> 0x0201 }
                yy1 r0 = new yy1     // Catch:{ all -> 0x0201 }
                r26 = r0
                r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0201 }
            L_0x012b:
                boolean r26 = r2.isNull(r7)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r6)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r5)     // Catch:{ all -> 0x0201 }
                if (r26 != 0) goto L_0x013e
                goto L_0x014a
            L_0x013e:
                r26 = r1
                r29 = r4
                r30 = r5
                r28 = r7
                r27 = r8
                r5 = 0
                goto L_0x0165
            L_0x014a:
                r26 = r1
                int r1 = r2.getInt(r7)     // Catch:{ all -> 0x0201 }
                r28 = r7
                r27 = r8
                long r7 = r2.getLong(r6)     // Catch:{ all -> 0x0201 }
                r29 = r4
                int r4 = r2.getInt(r5)     // Catch:{ all -> 0x0201 }
                r30 = r5
                ky1 r5 = new ky1     // Catch:{ all -> 0x0201 }
                r5.<init>(r1, r7, r4)     // Catch:{ all -> 0x0201 }
            L_0x0165:
                sy1 r1 = new sy1     // Catch:{ all -> 0x0201 }
                r1.<init>()     // Catch:{ all -> 0x0201 }
                r4 = r25
                long r7 = r2.getLong(r4)     // Catch:{ all -> 0x0201 }
                r1.I(r7)     // Catch:{ all -> 0x0201 }
                r7 = r24
                java.lang.String r8 = r2.getString(r7)     // Catch:{ all -> 0x0201 }
                r1.a0(r8)     // Catch:{ all -> 0x0201 }
                r25 = r4
                r8 = r23
                int r4 = r2.getInt(r8)     // Catch:{ all -> 0x0201 }
                r1.b0(r4)     // Catch:{ all -> 0x0201 }
                r4 = r22
                r22 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.W(r6)     // Catch:{ all -> 0x0201 }
                r6 = r21
                r21 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.Y(r4)     // Catch:{ all -> 0x0201 }
                r4 = r20
                r20 = r6
                java.lang.String r6 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                r1.X(r6)     // Catch:{ all -> 0x0201 }
                r6 = r19
                r19 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.S(r4)     // Catch:{ all -> 0x0201 }
                r4 = r18
                r18 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.Q(r6)     // Catch:{ all -> 0x0201 }
                r6 = r17
                r17 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.R(r4)     // Catch:{ all -> 0x0201 }
                r4 = r16
                r16 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.T(r6)     // Catch:{ all -> 0x0201 }
                r1.O(r0)     // Catch:{ all -> 0x0201 }
                r1.J(r5)     // Catch:{ all -> 0x0201 }
                r3.add(r1)     // Catch:{ all -> 0x0201 }
                r24 = r7
                r23 = r8
                r6 = r22
                r1 = r26
                r8 = r27
                r7 = r28
                r5 = r30
                r22 = r21
                r21 = r20
                r20 = r19
                r19 = r18
                r18 = r17
                r17 = r16
                r16 = r4
                r4 = r29
                goto L_0x00b7
            L_0x01fd:
                r2.close()
                return r3
            L_0x0201:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.n.call():java.util.List");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class o implements Callable<List<sy1>> {
        final /* synthetic */ androidx.room.o a;

        o(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x013d A[Catch:{ all -> 0x0201 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x013e A[Catch:{ all -> 0x0201 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<defpackage.sy1> call() {
            /*
                r37 = this;
                r1 = r37
                com.zunjae.anyme.features.database.b r0 = com.zunjae.anyme.features.database.b.this
                androidx.room.l r0 = r0.a
                androidx.room.o r2 = r1.a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = defpackage.h6.b(r0, r2, r3, r4)
                java.lang.String r0 = "series_animedb_id"
                int r0 = defpackage.g6.b(r2, r0)     // Catch:{ all -> 0x0201 }
                java.lang.String r3 = "series_title"
                int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x0201 }
                java.lang.String r5 = "series_type"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                java.lang.String r6 = "series_episodes"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                java.lang.String r7 = "series_status"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                java.lang.String r8 = "series_image"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                java.lang.String r9 = "my_watched_episodes"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r10 = "my_score"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r11 = "my_status"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r12 = "my_order"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r13 = "kitsu_malId"
                int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x0201 }
                java.lang.String r14 = "kitsu_kitsuId"
                int r14 = defpackage.g6.b(r2, r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r15 = "kitsu_startDate2"
                int r15 = defpackage.g6.b(r2, r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r4 = "kitsu_endDate2"
                int r4 = defpackage.g6.b(r2, r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r1 = "kitsu_posterId"
                int r1 = defpackage.g6.b(r2, r1)     // Catch:{ all -> 0x0201 }
                r16 = r12
                java.lang.String r12 = "kitsu_coverId"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                r17 = r11
                java.lang.String r11 = "kitsu_type"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                r18 = r10
                java.lang.String r10 = "kitsu_titleEnJp"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                r19 = r9
                java.lang.String r9 = "kitsu_titleEn"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                r20 = r8
                java.lang.String r8 = "kitsu_titleJaJp"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                r21 = r7
                java.lang.String r7 = "livechart_malid"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                r22 = r6
                java.lang.String r6 = "livechart_time"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                r23 = r5
                java.lang.String r5 = "livechart_episode"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                r24 = r3
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0201 }
                r25 = r0
                int r0 = r2.getCount()     // Catch:{ all -> 0x0201 }
                r3.<init>(r0)     // Catch:{ all -> 0x0201 }
            L_0x00b7:
                boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x01fd
                boolean r0 = r2.isNull(r13)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x0201 }
                if (r0 != 0) goto L_0x00fa
                goto L_0x00fc
            L_0x00fa:
                r0 = 0
                goto L_0x012b
            L_0x00fc:
                int r27 = r2.getInt(r13)     // Catch:{ all -> 0x0201 }
                int r28 = r2.getInt(r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r29 = r2.getString(r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r30 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r31 = r2.getString(r1)     // Catch:{ all -> 0x0201 }
                java.lang.String r32 = r2.getString(r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r33 = r2.getString(r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r34 = r2.getString(r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r35 = r2.getString(r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r36 = r2.getString(r8)     // Catch:{ all -> 0x0201 }
                yy1 r0 = new yy1     // Catch:{ all -> 0x0201 }
                r26 = r0
                r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0201 }
            L_0x012b:
                boolean r26 = r2.isNull(r7)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r6)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r5)     // Catch:{ all -> 0x0201 }
                if (r26 != 0) goto L_0x013e
                goto L_0x014a
            L_0x013e:
                r26 = r1
                r29 = r4
                r30 = r5
                r28 = r7
                r27 = r8
                r5 = 0
                goto L_0x0165
            L_0x014a:
                r26 = r1
                int r1 = r2.getInt(r7)     // Catch:{ all -> 0x0201 }
                r28 = r7
                r27 = r8
                long r7 = r2.getLong(r6)     // Catch:{ all -> 0x0201 }
                r29 = r4
                int r4 = r2.getInt(r5)     // Catch:{ all -> 0x0201 }
                r30 = r5
                ky1 r5 = new ky1     // Catch:{ all -> 0x0201 }
                r5.<init>(r1, r7, r4)     // Catch:{ all -> 0x0201 }
            L_0x0165:
                sy1 r1 = new sy1     // Catch:{ all -> 0x0201 }
                r1.<init>()     // Catch:{ all -> 0x0201 }
                r4 = r25
                long r7 = r2.getLong(r4)     // Catch:{ all -> 0x0201 }
                r1.I(r7)     // Catch:{ all -> 0x0201 }
                r7 = r24
                java.lang.String r8 = r2.getString(r7)     // Catch:{ all -> 0x0201 }
                r1.a0(r8)     // Catch:{ all -> 0x0201 }
                r25 = r4
                r8 = r23
                int r4 = r2.getInt(r8)     // Catch:{ all -> 0x0201 }
                r1.b0(r4)     // Catch:{ all -> 0x0201 }
                r4 = r22
                r22 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.W(r6)     // Catch:{ all -> 0x0201 }
                r6 = r21
                r21 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.Y(r4)     // Catch:{ all -> 0x0201 }
                r4 = r20
                r20 = r6
                java.lang.String r6 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                r1.X(r6)     // Catch:{ all -> 0x0201 }
                r6 = r19
                r19 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.S(r4)     // Catch:{ all -> 0x0201 }
                r4 = r18
                r18 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.Q(r6)     // Catch:{ all -> 0x0201 }
                r6 = r17
                r17 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.R(r4)     // Catch:{ all -> 0x0201 }
                r4 = r16
                r16 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.T(r6)     // Catch:{ all -> 0x0201 }
                r1.O(r0)     // Catch:{ all -> 0x0201 }
                r1.J(r5)     // Catch:{ all -> 0x0201 }
                r3.add(r1)     // Catch:{ all -> 0x0201 }
                r24 = r7
                r23 = r8
                r6 = r22
                r1 = r26
                r8 = r27
                r7 = r28
                r5 = r30
                r22 = r21
                r21 = r20
                r20 = r19
                r19 = r18
                r18 = r17
                r17 = r16
                r16 = r4
                r4 = r29
                goto L_0x00b7
            L_0x01fd:
                r2.close()
                return r3
            L_0x0201:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.o.call():java.util.List");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class p implements Callable<List<sy1>> {
        final /* synthetic */ androidx.room.o a;

        p(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x013d A[Catch:{ all -> 0x0201 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x013e A[Catch:{ all -> 0x0201 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<defpackage.sy1> call() {
            /*
                r37 = this;
                r1 = r37
                com.zunjae.anyme.features.database.b r0 = com.zunjae.anyme.features.database.b.this
                androidx.room.l r0 = r0.a
                androidx.room.o r2 = r1.a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = defpackage.h6.b(r0, r2, r3, r4)
                java.lang.String r0 = "series_animedb_id"
                int r0 = defpackage.g6.b(r2, r0)     // Catch:{ all -> 0x0201 }
                java.lang.String r3 = "series_title"
                int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x0201 }
                java.lang.String r5 = "series_type"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                java.lang.String r6 = "series_episodes"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                java.lang.String r7 = "series_status"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                java.lang.String r8 = "series_image"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                java.lang.String r9 = "my_watched_episodes"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r10 = "my_score"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r11 = "my_status"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r12 = "my_order"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r13 = "kitsu_malId"
                int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x0201 }
                java.lang.String r14 = "kitsu_kitsuId"
                int r14 = defpackage.g6.b(r2, r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r15 = "kitsu_startDate2"
                int r15 = defpackage.g6.b(r2, r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r4 = "kitsu_endDate2"
                int r4 = defpackage.g6.b(r2, r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r1 = "kitsu_posterId"
                int r1 = defpackage.g6.b(r2, r1)     // Catch:{ all -> 0x0201 }
                r16 = r12
                java.lang.String r12 = "kitsu_coverId"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                r17 = r11
                java.lang.String r11 = "kitsu_type"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                r18 = r10
                java.lang.String r10 = "kitsu_titleEnJp"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                r19 = r9
                java.lang.String r9 = "kitsu_titleEn"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                r20 = r8
                java.lang.String r8 = "kitsu_titleJaJp"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                r21 = r7
                java.lang.String r7 = "livechart_malid"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                r22 = r6
                java.lang.String r6 = "livechart_time"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                r23 = r5
                java.lang.String r5 = "livechart_episode"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                r24 = r3
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0201 }
                r25 = r0
                int r0 = r2.getCount()     // Catch:{ all -> 0x0201 }
                r3.<init>(r0)     // Catch:{ all -> 0x0201 }
            L_0x00b7:
                boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x01fd
                boolean r0 = r2.isNull(r13)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x0201 }
                if (r0 != 0) goto L_0x00fa
                goto L_0x00fc
            L_0x00fa:
                r0 = 0
                goto L_0x012b
            L_0x00fc:
                int r27 = r2.getInt(r13)     // Catch:{ all -> 0x0201 }
                int r28 = r2.getInt(r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r29 = r2.getString(r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r30 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r31 = r2.getString(r1)     // Catch:{ all -> 0x0201 }
                java.lang.String r32 = r2.getString(r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r33 = r2.getString(r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r34 = r2.getString(r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r35 = r2.getString(r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r36 = r2.getString(r8)     // Catch:{ all -> 0x0201 }
                yy1 r0 = new yy1     // Catch:{ all -> 0x0201 }
                r26 = r0
                r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0201 }
            L_0x012b:
                boolean r26 = r2.isNull(r7)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r6)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r5)     // Catch:{ all -> 0x0201 }
                if (r26 != 0) goto L_0x013e
                goto L_0x014a
            L_0x013e:
                r26 = r1
                r29 = r4
                r30 = r5
                r28 = r7
                r27 = r8
                r5 = 0
                goto L_0x0165
            L_0x014a:
                r26 = r1
                int r1 = r2.getInt(r7)     // Catch:{ all -> 0x0201 }
                r28 = r7
                r27 = r8
                long r7 = r2.getLong(r6)     // Catch:{ all -> 0x0201 }
                r29 = r4
                int r4 = r2.getInt(r5)     // Catch:{ all -> 0x0201 }
                r30 = r5
                ky1 r5 = new ky1     // Catch:{ all -> 0x0201 }
                r5.<init>(r1, r7, r4)     // Catch:{ all -> 0x0201 }
            L_0x0165:
                sy1 r1 = new sy1     // Catch:{ all -> 0x0201 }
                r1.<init>()     // Catch:{ all -> 0x0201 }
                r4 = r25
                long r7 = r2.getLong(r4)     // Catch:{ all -> 0x0201 }
                r1.I(r7)     // Catch:{ all -> 0x0201 }
                r7 = r24
                java.lang.String r8 = r2.getString(r7)     // Catch:{ all -> 0x0201 }
                r1.a0(r8)     // Catch:{ all -> 0x0201 }
                r25 = r4
                r8 = r23
                int r4 = r2.getInt(r8)     // Catch:{ all -> 0x0201 }
                r1.b0(r4)     // Catch:{ all -> 0x0201 }
                r4 = r22
                r22 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.W(r6)     // Catch:{ all -> 0x0201 }
                r6 = r21
                r21 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.Y(r4)     // Catch:{ all -> 0x0201 }
                r4 = r20
                r20 = r6
                java.lang.String r6 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                r1.X(r6)     // Catch:{ all -> 0x0201 }
                r6 = r19
                r19 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.S(r4)     // Catch:{ all -> 0x0201 }
                r4 = r18
                r18 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.Q(r6)     // Catch:{ all -> 0x0201 }
                r6 = r17
                r17 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.R(r4)     // Catch:{ all -> 0x0201 }
                r4 = r16
                r16 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.T(r6)     // Catch:{ all -> 0x0201 }
                r1.O(r0)     // Catch:{ all -> 0x0201 }
                r1.J(r5)     // Catch:{ all -> 0x0201 }
                r3.add(r1)     // Catch:{ all -> 0x0201 }
                r24 = r7
                r23 = r8
                r6 = r22
                r1 = r26
                r8 = r27
                r7 = r28
                r5 = r30
                r22 = r21
                r21 = r20
                r20 = r19
                r19 = r18
                r18 = r17
                r17 = r16
                r16 = r4
                r4 = r29
                goto L_0x00b7
            L_0x01fd:
                r2.close()
                return r3
            L_0x0201:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.p.call():java.util.List");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class q implements Callable<List<bs1>> {
        final /* synthetic */ androidx.room.o a;

        q(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public List<bs1> call() {
            Cursor b2 = h6.b(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                int b3 = g6.b(b2, "malid");
                int b4 = g6.b(b2, "time");
                int b5 = g6.b(b2, "series_cover");
                int b6 = g6.b(b2, "tags");
                int b7 = g6.b(b2, "title");
                int b8 = g6.b(b2, "episode");
                int b9 = g6.b(b2, "dayOfWeek");
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    bs1 bs1 = new bs1();
                    if (b2.isNull(b3)) {
                        bs1.a = null;
                    } else {
                        bs1.a = Integer.valueOf(b2.getInt(b3));
                    }
                    bs1.b = b2.getLong(b4);
                    bs1.c = b2.getString(b5);
                    bs1.d = b2.getString(b6);
                    bs1.e = b2.getString(b7);
                    bs1.f = b2.getInt(b8);
                    bs1.h = b2.getInt(b9);
                    arrayList.add(bs1);
                }
                return arrayList;
            } finally {
                b2.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class r implements Callable<List<bs1>> {
        final /* synthetic */ androidx.room.o a;

        r(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public List<bs1> call() {
            Cursor b2 = h6.b(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                int b3 = g6.b(b2, "malid");
                int b4 = g6.b(b2, "time");
                int b5 = g6.b(b2, "series_cover");
                int b6 = g6.b(b2, "tags");
                int b7 = g6.b(b2, "title");
                int b8 = g6.b(b2, "episode");
                int b9 = g6.b(b2, "dayOfWeek");
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    bs1 bs1 = new bs1();
                    if (b2.isNull(b3)) {
                        bs1.a = null;
                    } else {
                        bs1.a = Integer.valueOf(b2.getInt(b3));
                    }
                    bs1.b = b2.getLong(b4);
                    bs1.c = b2.getString(b5);
                    bs1.d = b2.getString(b6);
                    bs1.e = b2.getString(b7);
                    bs1.f = b2.getInt(b8);
                    bs1.h = b2.getInt(b9);
                    arrayList.add(bs1);
                }
                return arrayList;
            } finally {
                b2.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class s extends androidx.room.e<ly1> {
        s(b bVar, androidx.room.l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `releasedays` (`day`,`anime_id`) VALUES (?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, ly1 ly1) {
            if (ly1.b() == null) {
                q6Var.bindNull(1);
            } else {
                q6Var.bindString(1, ly1.b());
            }
            q6Var.bindLong(2, (long) ly1.a());
        }
    }

    class t implements Callable<Integer> {
        final /* synthetic */ androidx.room.o a;

        t(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public Integer call() {
            Integer num = null;
            Cursor b2 = h6.b(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                if (b2.moveToFirst()) {
                    if (!b2.isNull(0)) {
                        num = Integer.valueOf(b2.getInt(0));
                    }
                }
                return num;
            } finally {
                b2.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class u implements Callable<List<sy1>> {
        final /* synthetic */ androidx.room.o a;

        u(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x013d A[Catch:{ all -> 0x0201 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x013e A[Catch:{ all -> 0x0201 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<defpackage.sy1> call() {
            /*
                r37 = this;
                r1 = r37
                com.zunjae.anyme.features.database.b r0 = com.zunjae.anyme.features.database.b.this
                androidx.room.l r0 = r0.a
                androidx.room.o r2 = r1.a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = defpackage.h6.b(r0, r2, r3, r4)
                java.lang.String r0 = "series_animedb_id"
                int r0 = defpackage.g6.b(r2, r0)     // Catch:{ all -> 0x0201 }
                java.lang.String r3 = "series_title"
                int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x0201 }
                java.lang.String r5 = "series_type"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                java.lang.String r6 = "series_episodes"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                java.lang.String r7 = "series_status"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                java.lang.String r8 = "series_image"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                java.lang.String r9 = "my_watched_episodes"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r10 = "my_score"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r11 = "my_status"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r12 = "my_order"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r13 = "kitsu_malId"
                int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x0201 }
                java.lang.String r14 = "kitsu_kitsuId"
                int r14 = defpackage.g6.b(r2, r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r15 = "kitsu_startDate2"
                int r15 = defpackage.g6.b(r2, r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r4 = "kitsu_endDate2"
                int r4 = defpackage.g6.b(r2, r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r1 = "kitsu_posterId"
                int r1 = defpackage.g6.b(r2, r1)     // Catch:{ all -> 0x0201 }
                r16 = r12
                java.lang.String r12 = "kitsu_coverId"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                r17 = r11
                java.lang.String r11 = "kitsu_type"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                r18 = r10
                java.lang.String r10 = "kitsu_titleEnJp"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                r19 = r9
                java.lang.String r9 = "kitsu_titleEn"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                r20 = r8
                java.lang.String r8 = "kitsu_titleJaJp"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                r21 = r7
                java.lang.String r7 = "livechart_malid"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                r22 = r6
                java.lang.String r6 = "livechart_time"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                r23 = r5
                java.lang.String r5 = "livechart_episode"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                r24 = r3
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0201 }
                r25 = r0
                int r0 = r2.getCount()     // Catch:{ all -> 0x0201 }
                r3.<init>(r0)     // Catch:{ all -> 0x0201 }
            L_0x00b7:
                boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x01fd
                boolean r0 = r2.isNull(r13)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x0201 }
                if (r0 != 0) goto L_0x00fa
                goto L_0x00fc
            L_0x00fa:
                r0 = 0
                goto L_0x012b
            L_0x00fc:
                int r27 = r2.getInt(r13)     // Catch:{ all -> 0x0201 }
                int r28 = r2.getInt(r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r29 = r2.getString(r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r30 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r31 = r2.getString(r1)     // Catch:{ all -> 0x0201 }
                java.lang.String r32 = r2.getString(r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r33 = r2.getString(r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r34 = r2.getString(r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r35 = r2.getString(r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r36 = r2.getString(r8)     // Catch:{ all -> 0x0201 }
                yy1 r0 = new yy1     // Catch:{ all -> 0x0201 }
                r26 = r0
                r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0201 }
            L_0x012b:
                boolean r26 = r2.isNull(r7)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r6)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r5)     // Catch:{ all -> 0x0201 }
                if (r26 != 0) goto L_0x013e
                goto L_0x014a
            L_0x013e:
                r26 = r1
                r29 = r4
                r30 = r5
                r28 = r7
                r27 = r8
                r5 = 0
                goto L_0x0165
            L_0x014a:
                r26 = r1
                int r1 = r2.getInt(r7)     // Catch:{ all -> 0x0201 }
                r28 = r7
                r27 = r8
                long r7 = r2.getLong(r6)     // Catch:{ all -> 0x0201 }
                r29 = r4
                int r4 = r2.getInt(r5)     // Catch:{ all -> 0x0201 }
                r30 = r5
                ky1 r5 = new ky1     // Catch:{ all -> 0x0201 }
                r5.<init>(r1, r7, r4)     // Catch:{ all -> 0x0201 }
            L_0x0165:
                sy1 r1 = new sy1     // Catch:{ all -> 0x0201 }
                r1.<init>()     // Catch:{ all -> 0x0201 }
                r4 = r25
                long r7 = r2.getLong(r4)     // Catch:{ all -> 0x0201 }
                r1.I(r7)     // Catch:{ all -> 0x0201 }
                r7 = r24
                java.lang.String r8 = r2.getString(r7)     // Catch:{ all -> 0x0201 }
                r1.a0(r8)     // Catch:{ all -> 0x0201 }
                r25 = r4
                r8 = r23
                int r4 = r2.getInt(r8)     // Catch:{ all -> 0x0201 }
                r1.b0(r4)     // Catch:{ all -> 0x0201 }
                r4 = r22
                r22 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.W(r6)     // Catch:{ all -> 0x0201 }
                r6 = r21
                r21 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.Y(r4)     // Catch:{ all -> 0x0201 }
                r4 = r20
                r20 = r6
                java.lang.String r6 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                r1.X(r6)     // Catch:{ all -> 0x0201 }
                r6 = r19
                r19 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.S(r4)     // Catch:{ all -> 0x0201 }
                r4 = r18
                r18 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.Q(r6)     // Catch:{ all -> 0x0201 }
                r6 = r17
                r17 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.R(r4)     // Catch:{ all -> 0x0201 }
                r4 = r16
                r16 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.T(r6)     // Catch:{ all -> 0x0201 }
                r1.O(r0)     // Catch:{ all -> 0x0201 }
                r1.J(r5)     // Catch:{ all -> 0x0201 }
                r3.add(r1)     // Catch:{ all -> 0x0201 }
                r24 = r7
                r23 = r8
                r6 = r22
                r1 = r26
                r8 = r27
                r7 = r28
                r5 = r30
                r22 = r21
                r21 = r20
                r20 = r19
                r19 = r18
                r18 = r17
                r17 = r16
                r16 = r4
                r4 = r29
                goto L_0x00b7
            L_0x01fd:
                r2.close()
                return r3
            L_0x0201:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.u.call():java.util.List");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class v implements Callable<List<sy1>> {
        final /* synthetic */ androidx.room.o a;

        v(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x013d A[Catch:{ all -> 0x0201 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x013e A[Catch:{ all -> 0x0201 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<defpackage.sy1> call() {
            /*
                r37 = this;
                r1 = r37
                com.zunjae.anyme.features.database.b r0 = com.zunjae.anyme.features.database.b.this
                androidx.room.l r0 = r0.a
                androidx.room.o r2 = r1.a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = defpackage.h6.b(r0, r2, r3, r4)
                java.lang.String r0 = "series_animedb_id"
                int r0 = defpackage.g6.b(r2, r0)     // Catch:{ all -> 0x0201 }
                java.lang.String r3 = "series_title"
                int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x0201 }
                java.lang.String r5 = "series_type"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                java.lang.String r6 = "series_episodes"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                java.lang.String r7 = "series_status"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                java.lang.String r8 = "series_image"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                java.lang.String r9 = "my_watched_episodes"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r10 = "my_score"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r11 = "my_status"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r12 = "my_order"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r13 = "kitsu_malId"
                int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x0201 }
                java.lang.String r14 = "kitsu_kitsuId"
                int r14 = defpackage.g6.b(r2, r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r15 = "kitsu_startDate2"
                int r15 = defpackage.g6.b(r2, r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r4 = "kitsu_endDate2"
                int r4 = defpackage.g6.b(r2, r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r1 = "kitsu_posterId"
                int r1 = defpackage.g6.b(r2, r1)     // Catch:{ all -> 0x0201 }
                r16 = r12
                java.lang.String r12 = "kitsu_coverId"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0201 }
                r17 = r11
                java.lang.String r11 = "kitsu_type"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0201 }
                r18 = r10
                java.lang.String r10 = "kitsu_titleEnJp"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0201 }
                r19 = r9
                java.lang.String r9 = "kitsu_titleEn"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0201 }
                r20 = r8
                java.lang.String r8 = "kitsu_titleJaJp"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0201 }
                r21 = r7
                java.lang.String r7 = "livechart_malid"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0201 }
                r22 = r6
                java.lang.String r6 = "livechart_time"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0201 }
                r23 = r5
                java.lang.String r5 = "livechart_episode"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0201 }
                r24 = r3
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0201 }
                r25 = r0
                int r0 = r2.getCount()     // Catch:{ all -> 0x0201 }
                r3.<init>(r0)     // Catch:{ all -> 0x0201 }
            L_0x00b7:
                boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x01fd
                boolean r0 = r2.isNull(r13)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x0201 }
                if (r0 == 0) goto L_0x00fc
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x0201 }
                if (r0 != 0) goto L_0x00fa
                goto L_0x00fc
            L_0x00fa:
                r0 = 0
                goto L_0x012b
            L_0x00fc:
                int r27 = r2.getInt(r13)     // Catch:{ all -> 0x0201 }
                int r28 = r2.getInt(r14)     // Catch:{ all -> 0x0201 }
                java.lang.String r29 = r2.getString(r15)     // Catch:{ all -> 0x0201 }
                java.lang.String r30 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                java.lang.String r31 = r2.getString(r1)     // Catch:{ all -> 0x0201 }
                java.lang.String r32 = r2.getString(r12)     // Catch:{ all -> 0x0201 }
                java.lang.String r33 = r2.getString(r11)     // Catch:{ all -> 0x0201 }
                java.lang.String r34 = r2.getString(r10)     // Catch:{ all -> 0x0201 }
                java.lang.String r35 = r2.getString(r9)     // Catch:{ all -> 0x0201 }
                java.lang.String r36 = r2.getString(r8)     // Catch:{ all -> 0x0201 }
                yy1 r0 = new yy1     // Catch:{ all -> 0x0201 }
                r26 = r0
                r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0201 }
            L_0x012b:
                boolean r26 = r2.isNull(r7)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r6)     // Catch:{ all -> 0x0201 }
                if (r26 == 0) goto L_0x014a
                boolean r26 = r2.isNull(r5)     // Catch:{ all -> 0x0201 }
                if (r26 != 0) goto L_0x013e
                goto L_0x014a
            L_0x013e:
                r26 = r1
                r29 = r4
                r30 = r5
                r28 = r7
                r27 = r8
                r5 = 0
                goto L_0x0165
            L_0x014a:
                r26 = r1
                int r1 = r2.getInt(r7)     // Catch:{ all -> 0x0201 }
                r28 = r7
                r27 = r8
                long r7 = r2.getLong(r6)     // Catch:{ all -> 0x0201 }
                r29 = r4
                int r4 = r2.getInt(r5)     // Catch:{ all -> 0x0201 }
                r30 = r5
                ky1 r5 = new ky1     // Catch:{ all -> 0x0201 }
                r5.<init>(r1, r7, r4)     // Catch:{ all -> 0x0201 }
            L_0x0165:
                sy1 r1 = new sy1     // Catch:{ all -> 0x0201 }
                r1.<init>()     // Catch:{ all -> 0x0201 }
                r4 = r25
                long r7 = r2.getLong(r4)     // Catch:{ all -> 0x0201 }
                r1.I(r7)     // Catch:{ all -> 0x0201 }
                r7 = r24
                java.lang.String r8 = r2.getString(r7)     // Catch:{ all -> 0x0201 }
                r1.a0(r8)     // Catch:{ all -> 0x0201 }
                r25 = r4
                r8 = r23
                int r4 = r2.getInt(r8)     // Catch:{ all -> 0x0201 }
                r1.b0(r4)     // Catch:{ all -> 0x0201 }
                r4 = r22
                r22 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.W(r6)     // Catch:{ all -> 0x0201 }
                r6 = r21
                r21 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.Y(r4)     // Catch:{ all -> 0x0201 }
                r4 = r20
                r20 = r6
                java.lang.String r6 = r2.getString(r4)     // Catch:{ all -> 0x0201 }
                r1.X(r6)     // Catch:{ all -> 0x0201 }
                r6 = r19
                r19 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.S(r4)     // Catch:{ all -> 0x0201 }
                r4 = r18
                r18 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.Q(r6)     // Catch:{ all -> 0x0201 }
                r6 = r17
                r17 = r4
                int r4 = r2.getInt(r6)     // Catch:{ all -> 0x0201 }
                r1.R(r4)     // Catch:{ all -> 0x0201 }
                r4 = r16
                r16 = r6
                int r6 = r2.getInt(r4)     // Catch:{ all -> 0x0201 }
                r1.T(r6)     // Catch:{ all -> 0x0201 }
                r1.O(r0)     // Catch:{ all -> 0x0201 }
                r1.J(r5)     // Catch:{ all -> 0x0201 }
                r3.add(r1)     // Catch:{ all -> 0x0201 }
                r24 = r7
                r23 = r8
                r6 = r22
                r1 = r26
                r8 = r27
                r7 = r28
                r5 = r30
                r22 = r21
                r21 = r20
                r20 = r19
                r19 = r18
                r18 = r17
                r17 = r16
                r16 = r4
                r4 = r29
                goto L_0x00b7
            L_0x01fd:
                r2.close()
                return r3
            L_0x0201:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.v.call():java.util.List");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class w implements Callable<sy1> {
        final /* synthetic */ androidx.room.o a;

        w(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x0130 A[Catch:{ all -> 0x01ad }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0131 A[Catch:{ all -> 0x01ad }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public defpackage.sy1 call() {
            /*
                r36 = this;
                r1 = r36
                com.zunjae.anyme.features.database.b r0 = com.zunjae.anyme.features.database.b.this
                androidx.room.l r0 = r0.a
                androidx.room.o r2 = r1.a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = defpackage.h6.b(r0, r2, r3, r4)
                java.lang.String r0 = "series_animedb_id"
                int r0 = defpackage.g6.b(r2, r0)     // Catch:{ all -> 0x01ad }
                java.lang.String r3 = "series_title"
                int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x01ad }
                java.lang.String r5 = "series_type"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x01ad }
                java.lang.String r6 = "series_episodes"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x01ad }
                java.lang.String r7 = "series_status"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x01ad }
                java.lang.String r8 = "series_image"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x01ad }
                java.lang.String r9 = "my_watched_episodes"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x01ad }
                java.lang.String r10 = "my_score"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x01ad }
                java.lang.String r11 = "my_status"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x01ad }
                java.lang.String r12 = "my_order"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x01ad }
                java.lang.String r13 = "kitsu_malId"
                int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x01ad }
                java.lang.String r14 = "kitsu_kitsuId"
                int r14 = defpackage.g6.b(r2, r14)     // Catch:{ all -> 0x01ad }
                java.lang.String r15 = "kitsu_startDate2"
                int r15 = defpackage.g6.b(r2, r15)     // Catch:{ all -> 0x01ad }
                java.lang.String r4 = "kitsu_endDate2"
                int r4 = defpackage.g6.b(r2, r4)     // Catch:{ all -> 0x01ad }
                java.lang.String r1 = "kitsu_posterId"
                int r1 = defpackage.g6.b(r2, r1)     // Catch:{ all -> 0x01ad }
                r16 = r12
                java.lang.String r12 = "kitsu_coverId"
                int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x01ad }
                r17 = r11
                java.lang.String r11 = "kitsu_type"
                int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x01ad }
                r18 = r10
                java.lang.String r10 = "kitsu_titleEnJp"
                int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x01ad }
                r19 = r9
                java.lang.String r9 = "kitsu_titleEn"
                int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x01ad }
                r20 = r8
                java.lang.String r8 = "kitsu_titleJaJp"
                int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x01ad }
                r21 = r7
                java.lang.String r7 = "livechart_malid"
                int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x01ad }
                r22 = r6
                java.lang.String r6 = "livechart_time"
                int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x01ad }
                r23 = r5
                java.lang.String r5 = "livechart_episode"
                int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x01ad }
                boolean r24 = r2.moveToFirst()     // Catch:{ all -> 0x01ad }
                if (r24 == 0) goto L_0x01a8
                boolean r24 = r2.isNull(r13)     // Catch:{ all -> 0x01ad }
                if (r24 == 0) goto L_0x00ef
                boolean r24 = r2.isNull(r14)     // Catch:{ all -> 0x01ad }
                if (r24 == 0) goto L_0x00ef
                boolean r24 = r2.isNull(r15)     // Catch:{ all -> 0x01ad }
                if (r24 == 0) goto L_0x00ef
                boolean r24 = r2.isNull(r4)     // Catch:{ all -> 0x01ad }
                if (r24 == 0) goto L_0x00ef
                boolean r24 = r2.isNull(r1)     // Catch:{ all -> 0x01ad }
                if (r24 == 0) goto L_0x00ef
                boolean r24 = r2.isNull(r12)     // Catch:{ all -> 0x01ad }
                if (r24 == 0) goto L_0x00ef
                boolean r24 = r2.isNull(r11)     // Catch:{ all -> 0x01ad }
                if (r24 == 0) goto L_0x00ef
                boolean r24 = r2.isNull(r10)     // Catch:{ all -> 0x01ad }
                if (r24 == 0) goto L_0x00ef
                boolean r24 = r2.isNull(r9)     // Catch:{ all -> 0x01ad }
                if (r24 == 0) goto L_0x00ef
                boolean r24 = r2.isNull(r8)     // Catch:{ all -> 0x01ad }
                if (r24 != 0) goto L_0x00ed
                goto L_0x00ef
            L_0x00ed:
                r1 = 0
                goto L_0x011e
            L_0x00ef:
                int r26 = r2.getInt(r13)     // Catch:{ all -> 0x01ad }
                int r27 = r2.getInt(r14)     // Catch:{ all -> 0x01ad }
                java.lang.String r28 = r2.getString(r15)     // Catch:{ all -> 0x01ad }
                java.lang.String r29 = r2.getString(r4)     // Catch:{ all -> 0x01ad }
                java.lang.String r30 = r2.getString(r1)     // Catch:{ all -> 0x01ad }
                java.lang.String r31 = r2.getString(r12)     // Catch:{ all -> 0x01ad }
                java.lang.String r32 = r2.getString(r11)     // Catch:{ all -> 0x01ad }
                java.lang.String r33 = r2.getString(r10)     // Catch:{ all -> 0x01ad }
                java.lang.String r34 = r2.getString(r9)     // Catch:{ all -> 0x01ad }
                java.lang.String r35 = r2.getString(r8)     // Catch:{ all -> 0x01ad }
                yy1 r1 = new yy1     // Catch:{ all -> 0x01ad }
                r25 = r1
                r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x01ad }
            L_0x011e:
                boolean r4 = r2.isNull(r7)     // Catch:{ all -> 0x01ad }
                if (r4 == 0) goto L_0x0133
                boolean r4 = r2.isNull(r6)     // Catch:{ all -> 0x01ad }
                if (r4 == 0) goto L_0x0133
                boolean r4 = r2.isNull(r5)     // Catch:{ all -> 0x01ad }
                if (r4 != 0) goto L_0x0131
                goto L_0x0133
            L_0x0131:
                r4 = 0
                goto L_0x0145
            L_0x0133:
                int r4 = r2.getInt(r7)     // Catch:{ all -> 0x01ad }
                long r6 = r2.getLong(r6)     // Catch:{ all -> 0x01ad }
                int r5 = r2.getInt(r5)     // Catch:{ all -> 0x01ad }
                ky1 r8 = new ky1     // Catch:{ all -> 0x01ad }
                r8.<init>(r4, r6, r5)     // Catch:{ all -> 0x01ad }
                r4 = r8
            L_0x0145:
                sy1 r5 = new sy1     // Catch:{ all -> 0x01ad }
                r5.<init>()     // Catch:{ all -> 0x01ad }
                long r6 = r2.getLong(r0)     // Catch:{ all -> 0x01ad }
                r5.I(r6)     // Catch:{ all -> 0x01ad }
                java.lang.String r0 = r2.getString(r3)     // Catch:{ all -> 0x01ad }
                r5.a0(r0)     // Catch:{ all -> 0x01ad }
                r0 = r23
                int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01ad }
                r5.b0(r0)     // Catch:{ all -> 0x01ad }
                r0 = r22
                int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01ad }
                r5.W(r0)     // Catch:{ all -> 0x01ad }
                r0 = r21
                int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01ad }
                r5.Y(r0)     // Catch:{ all -> 0x01ad }
                r0 = r20
                java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x01ad }
                r5.X(r0)     // Catch:{ all -> 0x01ad }
                r0 = r19
                int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01ad }
                r5.S(r0)     // Catch:{ all -> 0x01ad }
                r0 = r18
                int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01ad }
                r5.Q(r0)     // Catch:{ all -> 0x01ad }
                r0 = r17
                int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01ad }
                r5.R(r0)     // Catch:{ all -> 0x01ad }
                r0 = r16
                int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01ad }
                r5.T(r0)     // Catch:{ all -> 0x01ad }
                r5.O(r1)     // Catch:{ all -> 0x01ad }
                r5.J(r4)     // Catch:{ all -> 0x01ad }
                r4 = r5
                goto L_0x01a9
            L_0x01a8:
                r4 = 0
            L_0x01a9:
                r2.close()
                return r4
            L_0x01ad:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.w.call():sy1");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class x implements Callable<lx1> {
        final /* synthetic */ androidx.room.o a;

        x(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public lx1 call() {
            lx1 lx1;
            Cursor b2 = h6.b(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                int b3 = g6.b(b2, "malId");
                int b4 = g6.b(b2, "title");
                int b5 = g6.b(b2, "title_english");
                int b6 = g6.b(b2, "image_url");
                int b7 = g6.b(b2, "type");
                int b8 = g6.b(b2, "source");
                int b9 = g6.b(b2, "episodes");
                int b10 = g6.b(b2, "status");
                int b11 = g6.b(b2, "duration");
                int b12 = g6.b(b2, "rating");
                int b13 = g6.b(b2, "popularity");
                int b14 = g6.b(b2, "score");
                int b15 = g6.b(b2, "rank");
                int b16 = g6.b(b2, "trailer_url");
                try {
                    int b17 = g6.b(b2, "synopsis");
                    int b18 = g6.b(b2, "broadcast");
                    int b19 = g6.b(b2, "studio");
                    int b20 = g6.b(b2, "genre");
                    int b21 = g6.b(b2, "opening_theme");
                    int b22 = g6.b(b2, "ending_theme");
                    int b23 = g6.b(b2, "expirationDate");
                    int b24 = g6.b(b2, "jikanRelated");
                    int b25 = g6.b(b2, "synonyms");
                    int b26 = g6.b(b2, "airedInfo");
                    if (b2.moveToFirst()) {
                        int i = b26;
                        lx1 lx12 = new lx1();
                        lx12.O(b2.isNull(b3) ? null : Integer.valueOf(b2.getInt(b3)));
                        lx12.Z(b2.getString(b4));
                        lx12.a0(b2.getString(b5));
                        lx12.M(b2.getString(b6));
                        lx12.c0(b2.getString(b7));
                        lx12.U(b2.getString(b8));
                        lx12.I(b2.isNull(b9) ? null : Integer.valueOf(b2.getInt(b9)));
                        lx12.V(b2.getString(b10));
                        lx12.G(b2.getString(b11));
                        lx12.S(b2.getString(b12));
                        lx12.Q(b2.getString(b13));
                        lx12.T(b2.isNull(b14) ? null : Double.valueOf(b2.getDouble(b14)));
                        lx12.R(b2.isNull(b15) ? null : Integer.valueOf(b2.getInt(b15)));
                        lx12.b0(b2.getString(b16));
                        lx12.Y(b2.getString(b17));
                        lx12.F(b2.getString(b18));
                        try {
                            lx12.W(b.this.d.a(b2.getString(b19)));
                            lx12.L(b.this.e.a(b2.getString(b20)));
                            lx12.P(b.this.f.a(b2.getString(b21)));
                            lx12.H(b.this.f.a(b2.getString(b22)));
                            lx12.K(b2.getLong(b23));
                            lx12.N(b.this.g.a(b2.getString(b24)));
                            lx12.X(b.this.f.a(b2.getString(b25)));
                            lx12.E(b.this.h.a(b2.getString(i)));
                            lx1 = lx12;
                        } catch (Throwable th) {
                            th = th;
                            b2.close();
                            throw th;
                        }
                    } else {
                        lx1 = null;
                    }
                    b2.close();
                    return lx1;
                } catch (Throwable th2) {
                    th = th2;
                    b2.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                b2.close();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class y implements Callable<List<bs1>> {
        final /* synthetic */ androidx.room.o a;

        y(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public List<bs1> call() {
            Cursor b2 = h6.b(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                int b3 = g6.b(b2, "malid");
                int b4 = g6.b(b2, "time");
                int b5 = g6.b(b2, "series_cover");
                int b6 = g6.b(b2, "tags");
                int b7 = g6.b(b2, "title");
                int b8 = g6.b(b2, "episode");
                int b9 = g6.b(b2, "dayOfWeek");
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    bs1 bs1 = new bs1();
                    if (b2.isNull(b3)) {
                        bs1.a = null;
                    } else {
                        bs1.a = Integer.valueOf(b2.getInt(b3));
                    }
                    bs1.b = b2.getLong(b4);
                    bs1.c = b2.getString(b5);
                    bs1.d = b2.getString(b6);
                    bs1.e = b2.getString(b7);
                    bs1.f = b2.getInt(b8);
                    bs1.h = b2.getInt(b9);
                    arrayList.add(bs1);
                }
                return arrayList;
            } finally {
                b2.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    class z implements Callable<Integer> {
        final /* synthetic */ androidx.room.o a;

        z(androidx.room.o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public Integer call() {
            Integer num = null;
            Cursor b2 = h6.b(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                if (b2.moveToFirst()) {
                    if (!b2.isNull(0)) {
                        num = Integer.valueOf(b2.getInt(0));
                    }
                }
                return num;
            } finally {
                b2.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.l();
        }
    }

    public b(androidx.room.l lVar) {
        this.a = lVar;
        this.b = new k(this, lVar);
        new s(this, lVar);
        this.c = new a0(lVar);
        this.i = new f0(this, lVar);
        new g0(this, lVar);
        this.j = new h0(this, lVar);
        this.k = new i0(this, lVar);
        this.l = new j0(this, lVar);
        this.m = new k0(this, lVar);
        this.n = new a(this, lVar);
        this.o = new C0181b(this, lVar);
        this.p = new c(this, lVar);
        new d(this, lVar);
        this.q = new e(this, lVar);
        this.r = new f(this, lVar);
        this.s = new g(this, lVar);
        this.t = new h(this, lVar);
        this.u = new i(this, lVar);
    }

    public List<Integer> A(int i2) {
        androidx.room.o h2 = androidx.room.o.h("SELECT series_animedb_id from animes where my_score >= ?", 1);
        h2.bindLong(1, (long) i2);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.isNull(0) ? null : Integer.valueOf(b2.getInt(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public LiveData<sy1> B(long j2) {
        androidx.room.o h2 = androidx.room.o.h("SELECT * FROM ANIMES WHERE series_animedb_id = ?", 1);
        h2.bindLong(1, j2);
        return this.a.k().d(new String[]{"ANIMES"}, false, new w(h2));
    }

    public LiveData<List<bs1>> C(int i2) {
        androidx.room.o h2 = androidx.room.o.h("SELECT * FROM CalendarEntry WHERE dayOfWeek = ? ORDER BY time ASC", 1);
        h2.bindLong(1, (long) i2);
        return this.a.k().d(new String[]{"CalendarEntry"}, false, new y(h2));
    }

    public Object D(List<Long> list, k42<? super List<com.zunjae.downloader.b>> k42) {
        StringBuilder b2 = j6.b();
        b2.append("SELECT ");
        b2.append("*");
        b2.append(" FROM AnimeDownloadEntry LEFT JOIN animes ON animes.series_animedb_id == AnimeDownloadEntry.malid  WHERE fileDownloadId in (");
        int size = list.size();
        j6.a(b2, size);
        b2.append(")");
        androidx.room.o h2 = androidx.room.o.h(b2.toString(), size + 0);
        int i2 = 1;
        for (Long next : list) {
            if (next == null) {
                h2.bindNull(i2);
            } else {
                h2.bindLong(i2, next.longValue());
            }
            i2++;
        }
        return androidx.room.a.a(this.a, false, new d0(h2), k42);
    }

    public LiveData<List<uv1>> E() {
        return this.a.k().d(new String[]{"animes"}, false, new c0(androidx.room.o.h("SELECT my_score, count(my_score) as Count from animes GROUP BY my_score", 0)));
    }

    public Integer F(int i2) {
        androidx.room.o h2 = androidx.room.o.h("SELECT COUNT(*) FROM nsfwshows where nsfw_animeid = ?", 1);
        h2.bindLong(1, (long) i2);
        this.a.b();
        Integer num = null;
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            if (b2.moveToFirst()) {
                if (!b2.isNull(0)) {
                    num = Integer.valueOf(b2.getInt(0));
                }
            }
            return num;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public LiveData<Integer> G(int i2) {
        androidx.room.o h2 = androidx.room.o.h("SELECT COUNT(*) FROM AnimeDownloadEntry where malid = ?", 1);
        h2.bindLong(1, (long) i2);
        return this.a.k().d(new String[]{"AnimeDownloadEntry"}, false, new e0(h2));
    }

    public LiveData<Integer> H() {
        return this.a.k().d(new String[]{"animes"}, false, new z(androidx.room.o.h("SELECT COUNT(*) FROM animes where series_status = -1", 0)));
    }

    public LiveData<Integer> I() {
        return this.a.k().d(new String[]{"ANIMES"}, false, new l(androidx.room.o.h("SELECT COUNT(*) FROM ANIMES WHERE my_status = 6 AND series_status IS NOT 3", 0)));
    }

    public List<ux1> J(long j2, long j3) {
        androidx.room.o h2 = androidx.room.o.h("SELECT * from animerecommendations ar where ar.parentAnimeId = ? and expirationDate > ? and ar.animeId not in (SELECT nsfw_animeid FROM nsfwshows)", 2);
        h2.bindLong(1, j2);
        h2.bindLong(2, j3);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            int b3 = g6.b(b2, "animeId");
            int b4 = g6.b(b2, "parentAnimeId");
            int b5 = g6.b(b2, "title");
            int b6 = g6.b(b2, "image");
            int b7 = g6.b(b2, "priority");
            int b8 = g6.b(b2, "expirationDate");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                long j4 = b2.getLong(b3);
                long j5 = b2.getLong(b4);
                arrayList.add(new ux1(j4, b2.getInt(b7), b2.getString(b5), b2.getString(b6), j5, b2.getLong(b8)));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.l();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x03e5 A[Catch:{ all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x045f A[Catch:{ all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0460 A[Catch:{ all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x04a9 A[Catch:{ all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x04aa A[Catch:{ all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01be A[Catch:{ all -> 0x058e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<defpackage.bz1> K(int r49, long r50) {
        /*
            r48 = this;
            r1 = r48
            java.lang.String r0 = "SELECT * from related_animes as re LEFT JOIN animes ON re.series_id = animes.series_animedb_id WHERE expiration_date > ? AND re.parent_anime_id = ? AND re.series_id <> ?"
            r2 = 3
            androidx.room.o r3 = androidx.room.o.h(r0, r2)
            r0 = 1
            r4 = r50
            r3.bindLong(r0, r4)
            r0 = r49
            long r4 = (long) r0
            r0 = 2
            r3.bindLong(r0, r4)
            r3.bindLong(r2, r4)
            androidx.room.l r0 = r1.a
            r0.b()
            androidx.room.l r0 = r1.a
            r2 = 0
            r4 = 0
            android.database.Cursor r2 = defpackage.h6.b(r0, r3, r2, r4)
            java.lang.String r0 = "parent_anime_id"
            int r0 = defpackage.g6.b(r2, r0)     // Catch:{ all -> 0x0590 }
            java.lang.String r5 = "series_id"
            int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0590 }
            java.lang.String r6 = "title"
            int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0590 }
            java.lang.String r7 = "type"
            int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0590 }
            java.lang.String r8 = "episodes"
            int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0590 }
            java.lang.String r9 = "picture"
            int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0590 }
            java.lang.String r10 = "expiration_date"
            int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0590 }
            java.lang.String r11 = "series_animedb_id"
            int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0590 }
            java.lang.String r12 = "series_title"
            int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0590 }
            java.lang.String r13 = "series_type"
            int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x0590 }
            java.lang.String r14 = "series_episodes"
            int r14 = defpackage.g6.b(r2, r14)     // Catch:{ all -> 0x0590 }
            java.lang.String r15 = "series_status"
            int r15 = defpackage.g6.b(r2, r15)     // Catch:{ all -> 0x0590 }
            java.lang.String r4 = "series_image"
            int r4 = defpackage.g6.b(r2, r4)     // Catch:{ all -> 0x0590 }
            java.lang.String r1 = "my_watched_episodes"
            int r1 = defpackage.g6.b(r2, r1)     // Catch:{ all -> 0x0590 }
            r16 = r3
            java.lang.String r3 = "my_score"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r50 = r3
            java.lang.String r3 = "my_status"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r51 = r3
            java.lang.String r3 = "my_order"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r17 = r3
            java.lang.String r3 = "kitsu_malId"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r18 = r3
            java.lang.String r3 = "kitsu_kitsuId"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r19 = r3
            java.lang.String r3 = "kitsu_startDate2"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r20 = r3
            java.lang.String r3 = "kitsu_endDate2"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r21 = r3
            java.lang.String r3 = "kitsu_posterId"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r22 = r3
            java.lang.String r3 = "kitsu_coverId"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r23 = r3
            java.lang.String r3 = "kitsu_type"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r24 = r3
            java.lang.String r3 = "kitsu_titleEnJp"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r25 = r3
            java.lang.String r3 = "kitsu_titleEn"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r26 = r3
            java.lang.String r3 = "kitsu_titleJaJp"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r27 = r3
            java.lang.String r3 = "livechart_malid"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r28 = r3
            java.lang.String r3 = "livechart_time"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r29 = r3
            java.lang.String r3 = "livechart_episode"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x058e }
            r30 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x058e }
            r31 = r1
            int r1 = r2.getCount()     // Catch:{ all -> 0x058e }
            r3.<init>(r1)     // Catch:{ all -> 0x058e }
        L_0x0107:
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x058e }
            if (r1 == 0) goto L_0x0586
            boolean r1 = r2.isNull(r0)     // Catch:{ all -> 0x058e }
            if (r1 == 0) goto L_0x013f
            boolean r1 = r2.isNull(r5)     // Catch:{ all -> 0x058e }
            if (r1 == 0) goto L_0x013f
            boolean r1 = r2.isNull(r6)     // Catch:{ all -> 0x058e }
            if (r1 == 0) goto L_0x013f
            boolean r1 = r2.isNull(r7)     // Catch:{ all -> 0x058e }
            if (r1 == 0) goto L_0x013f
            boolean r1 = r2.isNull(r8)     // Catch:{ all -> 0x058e }
            if (r1 == 0) goto L_0x013f
            boolean r1 = r2.isNull(r9)     // Catch:{ all -> 0x058e }
            if (r1 == 0) goto L_0x013f
            boolean r1 = r2.isNull(r10)     // Catch:{ all -> 0x058e }
            if (r1 != 0) goto L_0x0138
            goto L_0x013f
        L_0x0138:
            r32 = r3
            r3 = r5
            r33 = r6
            r1 = 0
            goto L_0x0192
        L_0x013f:
            az1 r1 = new az1     // Catch:{ all -> 0x058e }
            r1.<init>()     // Catch:{ all -> 0x058e }
            r32 = r3
            int r3 = r2.getInt(r0)     // Catch:{ all -> 0x058e }
            r1.k(r3)     // Catch:{ all -> 0x058e }
            boolean r3 = r2.isNull(r5)     // Catch:{ all -> 0x058e }
            if (r3 == 0) goto L_0x0155
            r3 = 0
            goto L_0x015d
        L_0x0155:
            int r3 = r2.getInt(r5)     // Catch:{ all -> 0x058e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x058e }
        L_0x015d:
            r1.m(r3)     // Catch:{ all -> 0x058e }
            java.lang.String r3 = r2.getString(r6)     // Catch:{ all -> 0x058e }
            r1.n(r3)     // Catch:{ all -> 0x058e }
            java.lang.String r3 = r2.getString(r7)     // Catch:{ all -> 0x058e }
            r1.o(r3)     // Catch:{ all -> 0x058e }
            boolean r3 = r2.isNull(r8)     // Catch:{ all -> 0x058e }
            if (r3 == 0) goto L_0x0176
            r3 = 0
            goto L_0x017e
        L_0x0176:
            int r3 = r2.getInt(r8)     // Catch:{ all -> 0x058e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x058e }
        L_0x017e:
            r1.i(r3)     // Catch:{ all -> 0x058e }
            java.lang.String r3 = r2.getString(r9)     // Catch:{ all -> 0x058e }
            r1.l(r3)     // Catch:{ all -> 0x058e }
            r3 = r5
            r33 = r6
            long r5 = r2.getLong(r10)     // Catch:{ all -> 0x058e }
            r1.j(r5)     // Catch:{ all -> 0x058e }
        L_0x0192:
            boolean r5 = r2.isNull(r11)     // Catch:{ all -> 0x058e }
            if (r5 == 0) goto L_0x03e7
            boolean r5 = r2.isNull(r12)     // Catch:{ all -> 0x058e }
            if (r5 == 0) goto L_0x03e7
            boolean r5 = r2.isNull(r13)     // Catch:{ all -> 0x058e }
            if (r5 == 0) goto L_0x03e7
            boolean r5 = r2.isNull(r14)     // Catch:{ all -> 0x058e }
            if (r5 == 0) goto L_0x03e7
            boolean r5 = r2.isNull(r15)     // Catch:{ all -> 0x058e }
            if (r5 == 0) goto L_0x03e7
            boolean r5 = r2.isNull(r4)     // Catch:{ all -> 0x058e }
            if (r5 == 0) goto L_0x03e7
            r5 = r31
            boolean r6 = r2.isNull(r5)     // Catch:{ all -> 0x058e }
            if (r6 == 0) goto L_0x03e5
            r6 = r50
            boolean r31 = r2.isNull(r6)     // Catch:{ all -> 0x058e }
            if (r31 == 0) goto L_0x03a8
            r50 = r0
            r0 = r51
            boolean r31 = r2.isNull(r0)     // Catch:{ all -> 0x058e }
            if (r31 == 0) goto L_0x036e
            r51 = r3
            r3 = r17
            boolean r17 = r2.isNull(r3)     // Catch:{ all -> 0x058e }
            if (r17 == 0) goto L_0x0338
            r17 = r7
            r7 = r18
            boolean r18 = r2.isNull(r7)     // Catch:{ all -> 0x058e }
            if (r18 == 0) goto L_0x031f
            r18 = r8
            r8 = r19
            boolean r19 = r2.isNull(r8)     // Catch:{ all -> 0x058e }
            if (r19 == 0) goto L_0x0306
            r19 = r9
            r9 = r20
            boolean r20 = r2.isNull(r9)     // Catch:{ all -> 0x058e }
            if (r20 == 0) goto L_0x02ec
            r20 = r10
            r10 = r21
            boolean r21 = r2.isNull(r10)     // Catch:{ all -> 0x058e }
            if (r21 == 0) goto L_0x02d2
            r21 = r1
            r1 = r22
            boolean r22 = r2.isNull(r1)     // Catch:{ all -> 0x058e }
            if (r22 == 0) goto L_0x02b8
            r22 = r3
            r3 = r23
            boolean r23 = r2.isNull(r3)     // Catch:{ all -> 0x058e }
            if (r23 == 0) goto L_0x029e
            r23 = r0
            r0 = r24
            boolean r24 = r2.isNull(r0)     // Catch:{ all -> 0x058e }
            if (r24 == 0) goto L_0x0284
            r24 = r6
            r6 = r25
            boolean r25 = r2.isNull(r6)     // Catch:{ all -> 0x058e }
            if (r25 == 0) goto L_0x0271
            r31 = r5
            r5 = r26
            boolean r25 = r2.isNull(r5)     // Catch:{ all -> 0x058e }
            if (r25 == 0) goto L_0x028c
            r25 = r4
            r4 = r27
            boolean r26 = r2.isNull(r4)     // Catch:{ all -> 0x058e }
            if (r26 == 0) goto L_0x0279
            r26 = r15
            r15 = r28
            boolean r27 = r2.isNull(r15)     // Catch:{ all -> 0x058e }
            if (r27 == 0) goto L_0x0294
            r27 = r14
            r14 = r29
            boolean r28 = r2.isNull(r14)     // Catch:{ all -> 0x058e }
            if (r28 == 0) goto L_0x0281
            r28 = r13
            r13 = r30
            boolean r29 = r2.isNull(r13)     // Catch:{ all -> 0x058e }
            if (r29 != 0) goto L_0x025e
            goto L_0x0423
        L_0x025e:
            r30 = r0
            r29 = r1
            r34 = r3
            r35 = r4
            r36 = r5
            r37 = r6
            r3 = r22
            r5 = r26
            r1 = 0
            goto L_0x053e
        L_0x0271:
            r25 = r4
            r31 = r5
            r5 = r26
            r4 = r27
        L_0x0279:
            r27 = r14
            r26 = r15
            r15 = r28
            r14 = r29
        L_0x0281:
            r28 = r13
            goto L_0x029a
        L_0x0284:
            r31 = r5
            r24 = r6
            r6 = r25
            r5 = r26
        L_0x028c:
            r25 = r4
            r26 = r15
            r4 = r27
            r15 = r28
        L_0x0294:
            r28 = r13
            r27 = r14
            r14 = r29
        L_0x029a:
            r13 = r30
            goto L_0x0423
        L_0x029e:
            r23 = r0
            r31 = r5
            r0 = r24
            r5 = r26
            r24 = r6
            r26 = r15
            r6 = r25
            r15 = r28
            r25 = r4
            r28 = r13
            r4 = r27
            r13 = r30
            goto L_0x0368
        L_0x02b8:
            r22 = r3
            r31 = r5
            r3 = r23
            r5 = r26
            r23 = r0
            r26 = r15
            r0 = r24
            r15 = r28
            r24 = r6
            r28 = r13
            r6 = r25
            r13 = r30
            goto L_0x0364
        L_0x02d2:
            r21 = r1
            r31 = r5
            r1 = r22
            r5 = r26
            r22 = r3
            r26 = r15
            r3 = r23
            r15 = r28
            r23 = r0
            r28 = r13
            r0 = r24
            r13 = r30
            goto L_0x0360
        L_0x02ec:
            r31 = r5
            r20 = r10
            r10 = r21
            r5 = r26
            r21 = r1
            r26 = r15
            r1 = r22
            r15 = r28
            r22 = r3
            r28 = r13
            r3 = r23
            r13 = r30
            goto L_0x035c
        L_0x0306:
            r31 = r5
            r19 = r9
            r9 = r20
            r5 = r26
            r20 = r10
            r26 = r15
            r10 = r21
            r15 = r28
            r21 = r1
            r28 = r13
            r1 = r22
            r13 = r30
            goto L_0x0358
        L_0x031f:
            r31 = r5
            r18 = r8
            r8 = r19
            r5 = r26
            r19 = r9
            r26 = r15
            r9 = r20
            r15 = r28
            r20 = r10
            r28 = r13
            r10 = r21
            r13 = r30
            goto L_0x0354
        L_0x0338:
            r31 = r5
            r17 = r7
            r7 = r18
            r5 = r26
            r18 = r8
            r26 = r15
            r8 = r19
            r15 = r28
            r19 = r9
            r28 = r13
            r9 = r20
            r13 = r30
            r20 = r10
            r10 = r21
        L_0x0354:
            r21 = r1
            r1 = r22
        L_0x0358:
            r22 = r3
            r3 = r23
        L_0x035c:
            r23 = r0
            r0 = r24
        L_0x0360:
            r24 = r6
            r6 = r25
        L_0x0364:
            r25 = r4
            r4 = r27
        L_0x0368:
            r27 = r14
            r14 = r29
            goto L_0x0423
        L_0x036e:
            r51 = r3
            r31 = r5
            r3 = r23
            r5 = r26
            r23 = r0
            r26 = r15
            r0 = r24
            r15 = r28
            r24 = r6
            r28 = r13
            r6 = r25
            r13 = r30
            r25 = r4
            r4 = r27
            r27 = r14
            r14 = r29
            r45 = r21
            r21 = r1
            r1 = r22
            r22 = r17
            r17 = r7
            r7 = r18
            r18 = r8
            r8 = r19
            r19 = r9
            r9 = r20
            r20 = r10
            r10 = r45
            goto L_0x0423
        L_0x03a8:
            r50 = r0
            r31 = r5
            r0 = r24
            r5 = r26
            r24 = r6
            r26 = r15
            r6 = r25
            r15 = r28
            r25 = r4
            r28 = r13
            r4 = r27
            r13 = r30
            r27 = r14
            r14 = r29
            r45 = r23
            r23 = r51
            r51 = r3
            r3 = r45
            r46 = r21
            r21 = r1
            r1 = r22
            r22 = r17
            r17 = r7
            r7 = r18
            r18 = r8
            r8 = r19
            r19 = r9
            r9 = r20
            r20 = r10
            r10 = r46
            goto L_0x0423
        L_0x03e5:
            r31 = r5
        L_0x03e7:
            r6 = r25
            r5 = r26
            r25 = r4
            r26 = r15
            r4 = r27
            r15 = r28
            r28 = r13
            r27 = r14
            r14 = r29
            r13 = r30
            r45 = r24
            r24 = r50
            r50 = r0
            r0 = r45
            r46 = r23
            r23 = r51
            r51 = r3
            r3 = r46
            r47 = r21
            r21 = r1
            r1 = r22
            r22 = r17
            r17 = r7
            r7 = r18
            r18 = r8
            r8 = r19
            r19 = r9
            r9 = r20
            r20 = r10
            r10 = r47
        L_0x0423:
            boolean r29 = r2.isNull(r7)     // Catch:{ all -> 0x058e }
            if (r29 == 0) goto L_0x0464
            boolean r29 = r2.isNull(r8)     // Catch:{ all -> 0x058e }
            if (r29 == 0) goto L_0x0464
            boolean r29 = r2.isNull(r9)     // Catch:{ all -> 0x058e }
            if (r29 == 0) goto L_0x0464
            boolean r29 = r2.isNull(r10)     // Catch:{ all -> 0x058e }
            if (r29 == 0) goto L_0x0464
            boolean r29 = r2.isNull(r1)     // Catch:{ all -> 0x058e }
            if (r29 == 0) goto L_0x0464
            boolean r29 = r2.isNull(r3)     // Catch:{ all -> 0x058e }
            if (r29 == 0) goto L_0x0464
            boolean r29 = r2.isNull(r0)     // Catch:{ all -> 0x058e }
            if (r29 == 0) goto L_0x0464
            boolean r29 = r2.isNull(r6)     // Catch:{ all -> 0x058e }
            if (r29 == 0) goto L_0x0464
            boolean r29 = r2.isNull(r5)     // Catch:{ all -> 0x058e }
            if (r29 == 0) goto L_0x0464
            boolean r29 = r2.isNull(r4)     // Catch:{ all -> 0x058e }
            if (r29 != 0) goto L_0x0460
            goto L_0x0464
        L_0x0460:
            r30 = r0
            r0 = 0
            goto L_0x0497
        L_0x0464:
            int r35 = r2.getInt(r7)     // Catch:{ all -> 0x058e }
            int r36 = r2.getInt(r8)     // Catch:{ all -> 0x058e }
            java.lang.String r37 = r2.getString(r9)     // Catch:{ all -> 0x058e }
            java.lang.String r38 = r2.getString(r10)     // Catch:{ all -> 0x058e }
            java.lang.String r39 = r2.getString(r1)     // Catch:{ all -> 0x058e }
            java.lang.String r40 = r2.getString(r3)     // Catch:{ all -> 0x058e }
            java.lang.String r41 = r2.getString(r0)     // Catch:{ all -> 0x058e }
            java.lang.String r42 = r2.getString(r6)     // Catch:{ all -> 0x058e }
            java.lang.String r43 = r2.getString(r5)     // Catch:{ all -> 0x058e }
            java.lang.String r44 = r2.getString(r4)     // Catch:{ all -> 0x058e }
            yy1 r29 = new yy1     // Catch:{ all -> 0x058e }
            r34 = r29
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x058e }
            r30 = r0
            r0 = r29
        L_0x0497:
            boolean r29 = r2.isNull(r15)     // Catch:{ all -> 0x058e }
            if (r29 == 0) goto L_0x04b6
            boolean r29 = r2.isNull(r14)     // Catch:{ all -> 0x058e }
            if (r29 == 0) goto L_0x04b6
            boolean r29 = r2.isNull(r13)     // Catch:{ all -> 0x058e }
            if (r29 != 0) goto L_0x04aa
            goto L_0x04b6
        L_0x04aa:
            r29 = r1
            r34 = r3
            r35 = r4
            r36 = r5
            r37 = r6
            r6 = 0
            goto L_0x04d1
        L_0x04b6:
            r29 = r1
            int r1 = r2.getInt(r15)     // Catch:{ all -> 0x058e }
            r34 = r3
            r35 = r4
            long r3 = r2.getLong(r14)     // Catch:{ all -> 0x058e }
            r36 = r5
            int r5 = r2.getInt(r13)     // Catch:{ all -> 0x058e }
            r37 = r6
            ky1 r6 = new ky1     // Catch:{ all -> 0x058e }
            r6.<init>(r1, r3, r5)     // Catch:{ all -> 0x058e }
        L_0x04d1:
            sy1 r1 = new sy1     // Catch:{ all -> 0x058e }
            r1.<init>()     // Catch:{ all -> 0x058e }
            long r3 = r2.getLong(r11)     // Catch:{ all -> 0x058e }
            r1.I(r3)     // Catch:{ all -> 0x058e }
            java.lang.String r3 = r2.getString(r12)     // Catch:{ all -> 0x058e }
            r1.a0(r3)     // Catch:{ all -> 0x058e }
            r3 = r28
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x058e }
            r1.b0(r4)     // Catch:{ all -> 0x058e }
            r4 = r27
            int r5 = r2.getInt(r4)     // Catch:{ all -> 0x058e }
            r1.W(r5)     // Catch:{ all -> 0x058e }
            r28 = r3
            r5 = r26
            int r3 = r2.getInt(r5)     // Catch:{ all -> 0x058e }
            r1.Y(r3)     // Catch:{ all -> 0x058e }
            r27 = r4
            r3 = r25
            java.lang.String r4 = r2.getString(r3)     // Catch:{ all -> 0x058e }
            r1.X(r4)     // Catch:{ all -> 0x058e }
            r25 = r3
            r4 = r31
            int r3 = r2.getInt(r4)     // Catch:{ all -> 0x058e }
            r1.S(r3)     // Catch:{ all -> 0x058e }
            r31 = r4
            r3 = r24
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x058e }
            r1.Q(r4)     // Catch:{ all -> 0x058e }
            r24 = r3
            r4 = r23
            int r3 = r2.getInt(r4)     // Catch:{ all -> 0x058e }
            r1.R(r3)     // Catch:{ all -> 0x058e }
            r23 = r4
            r3 = r22
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x058e }
            r1.T(r4)     // Catch:{ all -> 0x058e }
            r1.O(r0)     // Catch:{ all -> 0x058e }
            r1.J(r6)     // Catch:{ all -> 0x058e }
        L_0x053e:
            bz1 r0 = new bz1     // Catch:{ all -> 0x058e }
            r0.<init>()     // Catch:{ all -> 0x058e }
            r4 = r21
            r0.b = r4     // Catch:{ all -> 0x058e }
            r0.a = r1     // Catch:{ all -> 0x058e }
            r1 = r32
            r1.add(r0)     // Catch:{ all -> 0x058e }
            r0 = r50
            r21 = r10
            r10 = r20
            r50 = r24
            r4 = r25
            r22 = r29
            r24 = r30
            r6 = r33
            r26 = r36
            r25 = r37
            r20 = r9
            r30 = r13
            r29 = r14
            r9 = r19
            r14 = r27
            r13 = r28
            r27 = r35
            r19 = r8
            r28 = r15
            r8 = r18
            r15 = r5
            r18 = r7
            r7 = r17
            r5 = r51
            r17 = r3
            r51 = r23
            r23 = r34
            r3 = r1
            goto L_0x0107
        L_0x0586:
            r1 = r3
            r2.close()
            r16.l()
            return r1
        L_0x058e:
            r0 = move-exception
            goto L_0x0593
        L_0x0590:
            r0 = move-exception
            r16 = r3
        L_0x0593:
            r2.close()
            r16.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.K(int, long):java.util.List");
    }

    public int L(int i2) {
        androidx.room.o h2 = androidx.room.o.h("SELECT COUNT(series_animedb_id) from animes where my_status = ?", 1);
        h2.bindLong(1, (long) i2);
        this.a.b();
        int i3 = 0;
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            if (b2.moveToFirst()) {
                i3 = b2.getInt(0);
            }
            return i3;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public LiveData<List<vv1>> M() {
        return this.a.k().d(new String[]{"animes"}, false, new b0(androidx.room.o.h("SELECT my_status, count(*) AS Count FROM animes GROUP BY my_status UNION SELECT 0 as my_status, count(*) AS Count from animes", 0)));
    }

    public List<Integer> N() {
        androidx.room.o h2 = androidx.room.o.h("SELECT series_animedb_id FROM animes WHERE my_score >= 6 and my_status not in (4)", 0);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.isNull(0) ? null : Integer.valueOf(b2.getInt(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public LiveData<List<sy1>> O(int i2) {
        androidx.room.o h2 = androidx.room.o.h("SELECT * FROM animes WHERE my_score > ? ORDER BY my_score DESC", 1);
        h2.bindLong(1, (long) i2);
        return this.a.k().d(new String[]{"animes"}, false, new v(h2));
    }

    public void P(List<sy1> list) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(list);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public void Q(List<bs1> list) {
        this.a.b();
        this.a.c();
        try {
            this.j.h(list);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public void R(ArrayList<zy1> arrayList) {
        this.a.b();
        this.a.c();
        try {
            this.l.h(arrayList);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public void S(List<? extends az1> list) {
        this.a.b();
        this.a.c();
        try {
            this.k.h(list);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public List<xy1> T(List<Integer> list) {
        StringBuilder b2 = j6.b();
        b2.append("SELECT series_animedb_id, series_title, series_image from animes where series_animedb_id in (");
        int size = list.size();
        j6.a(b2, size);
        b2.append(")");
        androidx.room.o h2 = androidx.room.o.h(b2.toString(), size + 0);
        int i2 = 1;
        for (Integer next : list) {
            if (next == null) {
                h2.bindNull(i2);
            } else {
                h2.bindLong(i2, (long) next.intValue());
            }
            i2++;
        }
        this.a.b();
        Cursor b3 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            int b4 = g6.b(b3, "series_animedb_id");
            int b5 = g6.b(b3, "series_title");
            int b6 = g6.b(b3, "series_image");
            ArrayList arrayList = new ArrayList(b3.getCount());
            while (b3.moveToNext()) {
                arrayList.add(new xy1(b3.getLong(b4), b3.getString(b5), b3.getString(b6)));
            }
            return arrayList;
        } finally {
            b3.close();
            h2.l();
        }
    }

    public LiveData<List<bs1>> U() {
        return this.a.k().d(new String[]{"CalendarEntry", "animes"}, false, new q(androidx.room.o.h("SELECT * FROM CalendarEntry where malid in (SELECT series_animedb_id from animes) ORDER BY time ASC", 0)));
    }

    public LiveData<List<sy1>> V() {
        return this.a.k().d(new String[]{"animes", "CalendarEntry"}, false, new m(androidx.room.o.h("SELECT * FROM animes LEFT JOIN CalendarEntry on animes.series_animedb_id = CalendarEntry.malid WHERE animes.my_watched_episodes < (CalendarEntry.episode - 1) AND animes.my_status NOT IN (4) ", 0)));
    }

    public List<Integer> W() {
        androidx.room.o h2 = androidx.room.o.h("SELECT nsfw_animeid FROM nsfwshows", 0);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.isNull(0) ? null : Integer.valueOf(b2.getInt(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public LiveData<Integer> X() {
        return this.a.k().d(new String[]{"animes", "waifus"}, false, new t(androidx.room.o.h("SELECT (SELECT COUNT(*) FROM animes WHERE my_score >= 7) + (SELECT COUNT(*) FROM waifus) as counter", 0)));
    }

    public List<ry1> Y(List<Integer> list) {
        StringBuilder b2 = j6.b();
        b2.append("SELECT ");
        b2.append("*");
        b2.append(" FROM animes where series_animedb_id in (");
        int size = list.size();
        j6.a(b2, size);
        b2.append(")");
        androidx.room.o h2 = androidx.room.o.h(b2.toString(), size + 0);
        int i2 = 1;
        for (Integer next : list) {
            if (next == null) {
                h2.bindNull(i2);
            } else {
                h2.bindLong(i2, (long) next.intValue());
            }
            i2++;
        }
        this.a.b();
        Cursor b3 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            int b4 = g6.b(b3, "series_animedb_id");
            int b5 = g6.b(b3, "series_episodes");
            int b6 = g6.b(b3, "my_watched_episodes");
            int b7 = g6.b(b3, "my_score");
            int b8 = g6.b(b3, "my_status");
            ArrayList arrayList = new ArrayList(b3.getCount());
            while (b3.moveToNext()) {
                arrayList.add(new ry1(b3.getLong(b4), b3.getInt(b6), b3.getInt(b5), b3.getInt(b7), b3.getInt(b8)));
            }
            return arrayList;
        } finally {
            b3.close();
            h2.l();
        }
    }

    public xy1 Z() {
        androidx.room.o h2 = androidx.room.o.h("SELECT * FROM ANIMES WHERE my_status = 6 AND series_status IS NOT 3 ORDER BY RANDOM() limit 1", 0);
        this.a.b();
        xy1 xy1 = null;
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            int b3 = g6.b(b2, "series_animedb_id");
            int b4 = g6.b(b2, "series_title");
            int b5 = g6.b(b2, "series_image");
            if (b2.moveToFirst()) {
                xy1 = new xy1(b2.getLong(b3), b2.getString(b4), b2.getString(b5));
            }
            return xy1;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public void a(lx1 lx1) {
        this.a.b();
        this.a.c();
        try {
            this.c.i(lx1);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public void a0(List<bs1> list) {
        this.a.c();
        try {
            super.a0(list);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public void b(sy1 sy1) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(sy1);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public Object b0(com.zunjae.downloader.b bVar, k42<? super u22> k42) {
        return androidx.room.a.a(this.a, true, new j(bVar), k42);
    }

    public LiveData<List<sy1>> c() {
        return this.a.k().d(new String[]{"animes", "CalendarEntry"}, false, new n(androidx.room.o.h("SELECT * FROM animes LEFT JOIN CalendarEntry on animes.series_animedb_id = CalendarEntry.malid", 0)));
    }

    public void c0(ArrayList<zy1> arrayList) {
        this.a.c();
        try {
            super.c0(arrayList);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public List<Integer> d() {
        androidx.room.o h2 = androidx.room.o.h("SELECT series_animedb_id from animes", 0);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.isNull(0) ? null : Integer.valueOf(b2.getInt(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public void d0(List<ux1> list) {
        this.a.b();
        this.a.c();
        try {
            this.i.h(list);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public LiveData<List<sy1>> e() {
        return this.a.k().d(new String[]{"animes"}, false, new p(androidx.room.o.h("SELECT * FROM animes", 0)));
    }

    public void e0(List<? extends az1> list, int i2) {
        this.a.c();
        try {
            super.e0(list, i2);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public LiveData<List<bs1>> f() {
        return this.a.k().d(new String[]{"CalendarEntry"}, false, new r(androidx.room.o.h("SELECT * FROM CalendarEntry ORDER BY time ASC", 0)));
    }

    public List<ty1> f0() {
        androidx.room.o h2 = androidx.room.o.h("SELECT series_animedb_id, my_score, my_status from animes", 0);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            int b3 = g6.b(b2, "series_animedb_id");
            int b4 = g6.b(b2, "my_score");
            int b5 = g6.b(b2, "my_status");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                ty1 ty1 = new ty1();
                ty1.d(b2.getInt(b3));
                ty1.f(b2.getInt(b4));
                ty1.e(b2.getInt(b5));
                arrayList.add(ty1);
            }
            return arrayList;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public List<Long> g() {
        androidx.room.o h2 = androidx.room.o.h("SELECT series_animedb_id from animes", 0);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.isNull(0) ? null : Long.valueOf(b2.getLong(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public int g0() {
        int i2 = 0;
        androidx.room.o h2 = androidx.room.o.h("SELECT MIN(my_order) from animes", 0);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            if (b2.moveToFirst()) {
                i2 = b2.getInt(0);
            }
            return i2;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public LiveData<List<sy1>> h() {
        return this.a.k().d(new String[]{"animes"}, false, new o(androidx.room.o.h("SELECT * from animes where my_status <> 2", 0)));
    }

    public void h0(sy1 sy1) {
        this.a.b();
        this.a.c();
        try {
            this.o.h(sy1);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public List<yy1> i() {
        androidx.room.o h2 = androidx.room.o.h("SELECT * from minimal_kitsu_info WHERE MALId in (SELECT series_animedb_id from animes)", 0);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            int b3 = g6.b(b2, "malId");
            int b4 = g6.b(b2, "kitsuId");
            int b5 = g6.b(b2, "startDate2");
            int b6 = g6.b(b2, "endDate2");
            int b7 = g6.b(b2, "posterId");
            int b8 = g6.b(b2, "coverId");
            int b9 = g6.b(b2, "type");
            int b10 = g6.b(b2, "titleEnJp");
            int b11 = g6.b(b2, "titleEn");
            int b12 = g6.b(b2, "titleJaJp");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(new yy1(b2.getInt(b3), b2.getInt(b4), b2.getString(b5), b2.getString(b6), b2.getString(b7), b2.getString(b8), b2.getString(b9), b2.getString(b10), b2.getString(b11), b2.getString(b12)));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public void i0(List<sy1> list) {
        this.a.c();
        try {
            super.i0(list);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0144 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0145 A[Catch:{ all -> 0x020c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<defpackage.sy1> j() {
        /*
            r38 = this;
            r1 = r38
            java.lang.String r0 = "SELECT * FROM animes"
            r2 = 0
            androidx.room.o r3 = androidx.room.o.h(r0, r2)
            androidx.room.l r0 = r1.a
            r0.b()
            androidx.room.l r0 = r1.a
            r4 = 0
            android.database.Cursor r2 = defpackage.h6.b(r0, r3, r2, r4)
            java.lang.String r0 = "series_animedb_id"
            int r0 = defpackage.g6.b(r2, r0)     // Catch:{ all -> 0x020e }
            java.lang.String r5 = "series_title"
            int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x020e }
            java.lang.String r6 = "series_type"
            int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x020e }
            java.lang.String r7 = "series_episodes"
            int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x020e }
            java.lang.String r8 = "series_status"
            int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x020e }
            java.lang.String r9 = "series_image"
            int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = "my_watched_episodes"
            int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x020e }
            java.lang.String r11 = "my_score"
            int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x020e }
            java.lang.String r12 = "my_status"
            int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = "my_order"
            int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x020e }
            java.lang.String r14 = "kitsu_malId"
            int r14 = defpackage.g6.b(r2, r14)     // Catch:{ all -> 0x020e }
            java.lang.String r15 = "kitsu_kitsuId"
            int r15 = defpackage.g6.b(r2, r15)     // Catch:{ all -> 0x020e }
            java.lang.String r4 = "kitsu_startDate2"
            int r4 = defpackage.g6.b(r2, r4)     // Catch:{ all -> 0x020e }
            java.lang.String r1 = "kitsu_endDate2"
            int r1 = defpackage.g6.b(r2, r1)     // Catch:{ all -> 0x020e }
            r16 = r3
            java.lang.String r3 = "kitsu_posterId"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x020c }
            r17 = r13
            java.lang.String r13 = "kitsu_coverId"
            int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x020c }
            r18 = r12
            java.lang.String r12 = "kitsu_type"
            int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x020c }
            r19 = r11
            java.lang.String r11 = "kitsu_titleEnJp"
            int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x020c }
            r20 = r10
            java.lang.String r10 = "kitsu_titleEn"
            int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x020c }
            r21 = r9
            java.lang.String r9 = "kitsu_titleJaJp"
            int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x020c }
            r22 = r8
            java.lang.String r8 = "livechart_malid"
            int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x020c }
            r23 = r7
            java.lang.String r7 = "livechart_time"
            int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x020c }
            r24 = r6
            java.lang.String r6 = "livechart_episode"
            int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x020c }
            r25 = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x020c }
            r26 = r0
            int r0 = r2.getCount()     // Catch:{ all -> 0x020c }
            r5.<init>(r0)     // Catch:{ all -> 0x020c }
        L_0x00be:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0205
            boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.isNull(r13)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x020c }
            if (r0 != 0) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r0 = 0
            goto L_0x0132
        L_0x0103:
            int r28 = r2.getInt(r14)     // Catch:{ all -> 0x020c }
            int r29 = r2.getInt(r15)     // Catch:{ all -> 0x020c }
            java.lang.String r30 = r2.getString(r4)     // Catch:{ all -> 0x020c }
            java.lang.String r31 = r2.getString(r1)     // Catch:{ all -> 0x020c }
            java.lang.String r32 = r2.getString(r3)     // Catch:{ all -> 0x020c }
            java.lang.String r33 = r2.getString(r13)     // Catch:{ all -> 0x020c }
            java.lang.String r34 = r2.getString(r12)     // Catch:{ all -> 0x020c }
            java.lang.String r35 = r2.getString(r11)     // Catch:{ all -> 0x020c }
            java.lang.String r36 = r2.getString(r10)     // Catch:{ all -> 0x020c }
            java.lang.String r37 = r2.getString(r9)     // Catch:{ all -> 0x020c }
            yy1 r0 = new yy1     // Catch:{ all -> 0x020c }
            r27 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x020c }
        L_0x0132:
            boolean r27 = r2.isNull(r8)     // Catch:{ all -> 0x020c }
            if (r27 == 0) goto L_0x0151
            boolean r27 = r2.isNull(r7)     // Catch:{ all -> 0x020c }
            if (r27 == 0) goto L_0x0151
            boolean r27 = r2.isNull(r6)     // Catch:{ all -> 0x020c }
            if (r27 != 0) goto L_0x0145
            goto L_0x0151
        L_0x0145:
            r27 = r1
            r29 = r3
            r28 = r4
            r31 = r6
            r30 = r7
            r6 = 0
            goto L_0x016c
        L_0x0151:
            r27 = r1
            int r1 = r2.getInt(r8)     // Catch:{ all -> 0x020c }
            r29 = r3
            r28 = r4
            long r3 = r2.getLong(r7)     // Catch:{ all -> 0x020c }
            r30 = r7
            int r7 = r2.getInt(r6)     // Catch:{ all -> 0x020c }
            r31 = r6
            ky1 r6 = new ky1     // Catch:{ all -> 0x020c }
            r6.<init>(r1, r3, r7)     // Catch:{ all -> 0x020c }
        L_0x016c:
            sy1 r1 = new sy1     // Catch:{ all -> 0x020c }
            r1.<init>()     // Catch:{ all -> 0x020c }
            r4 = r8
            r3 = r26
            long r7 = r2.getLong(r3)     // Catch:{ all -> 0x020c }
            r1.I(r7)     // Catch:{ all -> 0x020c }
            r7 = r25
            java.lang.String r8 = r2.getString(r7)     // Catch:{ all -> 0x020c }
            r1.a0(r8)     // Catch:{ all -> 0x020c }
            r26 = r3
            r8 = r24
            int r3 = r2.getInt(r8)     // Catch:{ all -> 0x020c }
            r1.b0(r3)     // Catch:{ all -> 0x020c }
            r3 = r23
            r23 = r4
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x020c }
            r1.W(r4)     // Catch:{ all -> 0x020c }
            r4 = r22
            r22 = r3
            int r3 = r2.getInt(r4)     // Catch:{ all -> 0x020c }
            r1.Y(r3)     // Catch:{ all -> 0x020c }
            r3 = r21
            r21 = r4
            java.lang.String r4 = r2.getString(r3)     // Catch:{ all -> 0x020c }
            r1.X(r4)     // Catch:{ all -> 0x020c }
            r4 = r20
            r20 = r3
            int r3 = r2.getInt(r4)     // Catch:{ all -> 0x020c }
            r1.S(r3)     // Catch:{ all -> 0x020c }
            r3 = r19
            r19 = r4
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x020c }
            r1.Q(r4)     // Catch:{ all -> 0x020c }
            r4 = r18
            r18 = r3
            int r3 = r2.getInt(r4)     // Catch:{ all -> 0x020c }
            r1.R(r3)     // Catch:{ all -> 0x020c }
            r3 = r17
            r17 = r4
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x020c }
            r1.T(r4)     // Catch:{ all -> 0x020c }
            r1.O(r0)     // Catch:{ all -> 0x020c }
            r1.J(r6)     // Catch:{ all -> 0x020c }
            r5.add(r1)     // Catch:{ all -> 0x020c }
            r25 = r7
            r24 = r8
            r8 = r23
            r1 = r27
            r4 = r28
            r7 = r30
            r6 = r31
            r23 = r22
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r17
            r17 = r3
            r3 = r29
            goto L_0x00be
        L_0x0205:
            r2.close()
            r16.l()
            return r5
        L_0x020c:
            r0 = move-exception
            goto L_0x0211
        L_0x020e:
            r0 = move-exception
            r16 = r3
        L_0x0211:
            r2.close()
            r16.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.j():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x014b A[Catch:{ all -> 0x0213 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014c A[Catch:{ all -> 0x0213 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<defpackage.sy1> k(int r39) {
        /*
            r38 = this;
            r1 = r38
            java.lang.String r0 = "SELECT * FROM animes where my_score = ?"
            r2 = 1
            androidx.room.o r3 = androidx.room.o.h(r0, r2)
            r0 = r39
            long r4 = (long) r0
            r3.bindLong(r2, r4)
            androidx.room.l r0 = r1.a
            r0.b()
            androidx.room.l r0 = r1.a
            r2 = 0
            r4 = 0
            android.database.Cursor r2 = defpackage.h6.b(r0, r3, r2, r4)
            java.lang.String r0 = "series_animedb_id"
            int r0 = defpackage.g6.b(r2, r0)     // Catch:{ all -> 0x0215 }
            java.lang.String r5 = "series_title"
            int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x0215 }
            java.lang.String r6 = "series_type"
            int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0215 }
            java.lang.String r7 = "series_episodes"
            int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0215 }
            java.lang.String r8 = "series_status"
            int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0215 }
            java.lang.String r9 = "series_image"
            int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0215 }
            java.lang.String r10 = "my_watched_episodes"
            int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0215 }
            java.lang.String r11 = "my_score"
            int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0215 }
            java.lang.String r12 = "my_status"
            int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0215 }
            java.lang.String r13 = "my_order"
            int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x0215 }
            java.lang.String r14 = "kitsu_malId"
            int r14 = defpackage.g6.b(r2, r14)     // Catch:{ all -> 0x0215 }
            java.lang.String r15 = "kitsu_kitsuId"
            int r15 = defpackage.g6.b(r2, r15)     // Catch:{ all -> 0x0215 }
            java.lang.String r4 = "kitsu_startDate2"
            int r4 = defpackage.g6.b(r2, r4)     // Catch:{ all -> 0x0215 }
            java.lang.String r1 = "kitsu_endDate2"
            int r1 = defpackage.g6.b(r2, r1)     // Catch:{ all -> 0x0215 }
            r16 = r3
            java.lang.String r3 = "kitsu_posterId"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x0213 }
            r17 = r13
            java.lang.String r13 = "kitsu_coverId"
            int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x0213 }
            r18 = r12
            java.lang.String r12 = "kitsu_type"
            int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x0213 }
            r19 = r11
            java.lang.String r11 = "kitsu_titleEnJp"
            int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x0213 }
            r20 = r10
            java.lang.String r10 = "kitsu_titleEn"
            int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x0213 }
            r21 = r9
            java.lang.String r9 = "kitsu_titleJaJp"
            int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x0213 }
            r22 = r8
            java.lang.String r8 = "livechart_malid"
            int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x0213 }
            r23 = r7
            java.lang.String r7 = "livechart_time"
            int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x0213 }
            r24 = r6
            java.lang.String r6 = "livechart_episode"
            int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x0213 }
            r25 = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0213 }
            r26 = r0
            int r0 = r2.getCount()     // Catch:{ all -> 0x0213 }
            r5.<init>(r0)     // Catch:{ all -> 0x0213 }
        L_0x00c5:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x020c
            boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r2.isNull(r13)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x0213 }
            if (r0 != 0) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r0 = 0
            goto L_0x0139
        L_0x010a:
            int r28 = r2.getInt(r14)     // Catch:{ all -> 0x0213 }
            int r29 = r2.getInt(r15)     // Catch:{ all -> 0x0213 }
            java.lang.String r30 = r2.getString(r4)     // Catch:{ all -> 0x0213 }
            java.lang.String r31 = r2.getString(r1)     // Catch:{ all -> 0x0213 }
            java.lang.String r32 = r2.getString(r3)     // Catch:{ all -> 0x0213 }
            java.lang.String r33 = r2.getString(r13)     // Catch:{ all -> 0x0213 }
            java.lang.String r34 = r2.getString(r12)     // Catch:{ all -> 0x0213 }
            java.lang.String r35 = r2.getString(r11)     // Catch:{ all -> 0x0213 }
            java.lang.String r36 = r2.getString(r10)     // Catch:{ all -> 0x0213 }
            java.lang.String r37 = r2.getString(r9)     // Catch:{ all -> 0x0213 }
            yy1 r0 = new yy1     // Catch:{ all -> 0x0213 }
            r27 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0213 }
        L_0x0139:
            boolean r27 = r2.isNull(r8)     // Catch:{ all -> 0x0213 }
            if (r27 == 0) goto L_0x0158
            boolean r27 = r2.isNull(r7)     // Catch:{ all -> 0x0213 }
            if (r27 == 0) goto L_0x0158
            boolean r27 = r2.isNull(r6)     // Catch:{ all -> 0x0213 }
            if (r27 != 0) goto L_0x014c
            goto L_0x0158
        L_0x014c:
            r27 = r1
            r29 = r3
            r28 = r4
            r31 = r6
            r30 = r7
            r6 = 0
            goto L_0x0173
        L_0x0158:
            r27 = r1
            int r1 = r2.getInt(r8)     // Catch:{ all -> 0x0213 }
            r29 = r3
            r28 = r4
            long r3 = r2.getLong(r7)     // Catch:{ all -> 0x0213 }
            r30 = r7
            int r7 = r2.getInt(r6)     // Catch:{ all -> 0x0213 }
            r31 = r6
            ky1 r6 = new ky1     // Catch:{ all -> 0x0213 }
            r6.<init>(r1, r3, r7)     // Catch:{ all -> 0x0213 }
        L_0x0173:
            sy1 r1 = new sy1     // Catch:{ all -> 0x0213 }
            r1.<init>()     // Catch:{ all -> 0x0213 }
            r4 = r8
            r3 = r26
            long r7 = r2.getLong(r3)     // Catch:{ all -> 0x0213 }
            r1.I(r7)     // Catch:{ all -> 0x0213 }
            r7 = r25
            java.lang.String r8 = r2.getString(r7)     // Catch:{ all -> 0x0213 }
            r1.a0(r8)     // Catch:{ all -> 0x0213 }
            r26 = r3
            r8 = r24
            int r3 = r2.getInt(r8)     // Catch:{ all -> 0x0213 }
            r1.b0(r3)     // Catch:{ all -> 0x0213 }
            r3 = r23
            r23 = r4
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x0213 }
            r1.W(r4)     // Catch:{ all -> 0x0213 }
            r4 = r22
            r22 = r3
            int r3 = r2.getInt(r4)     // Catch:{ all -> 0x0213 }
            r1.Y(r3)     // Catch:{ all -> 0x0213 }
            r3 = r21
            r21 = r4
            java.lang.String r4 = r2.getString(r3)     // Catch:{ all -> 0x0213 }
            r1.X(r4)     // Catch:{ all -> 0x0213 }
            r4 = r20
            r20 = r3
            int r3 = r2.getInt(r4)     // Catch:{ all -> 0x0213 }
            r1.S(r3)     // Catch:{ all -> 0x0213 }
            r3 = r19
            r19 = r4
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x0213 }
            r1.Q(r4)     // Catch:{ all -> 0x0213 }
            r4 = r18
            r18 = r3
            int r3 = r2.getInt(r4)     // Catch:{ all -> 0x0213 }
            r1.R(r3)     // Catch:{ all -> 0x0213 }
            r3 = r17
            r17 = r4
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x0213 }
            r1.T(r4)     // Catch:{ all -> 0x0213 }
            r1.O(r0)     // Catch:{ all -> 0x0213 }
            r1.J(r6)     // Catch:{ all -> 0x0213 }
            r5.add(r1)     // Catch:{ all -> 0x0213 }
            r25 = r7
            r24 = r8
            r8 = r23
            r1 = r27
            r4 = r28
            r7 = r30
            r6 = r31
            r23 = r22
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r17
            r17 = r3
            r3 = r29
            goto L_0x00c5
        L_0x020c:
            r2.close()
            r16.l()
            return r5
        L_0x0213:
            r0 = move-exception
            goto L_0x0218
        L_0x0215:
            r0 = move-exception
            r16 = r3
        L_0x0218:
            r2.close()
            r16.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.k(int):java.util.List");
    }

    public List<Integer> l(int i2) {
        androidx.room.o h2 = androidx.room.o.h("SELECT series_animedb_id from animes where my_score >= ?", 1);
        h2.bindLong(1, (long) i2);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.isNull(0) ? null : Integer.valueOf(b2.getInt(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public List<Integer> m() {
        androidx.room.o h2 = androidx.room.o.h("SELECT series_animedb_id from animes where series_animedb_id not in (SELECT MALId from minimal_kitsu_info WHERE endDate2 IS NOT NULL) limit 1500", 0);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.isNull(0) ? null : Integer.valueOf(b2.getInt(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public int n(int i2) {
        androidx.room.o h2 = androidx.room.o.h("SELECT COUNT(*) from animes where series_animedb_id = ?", 1);
        h2.bindLong(1, (long) i2);
        this.a.b();
        int i3 = 0;
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            if (b2.moveToFirst()) {
                i3 = b2.getInt(0);
            }
            return i3;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public void o() {
        this.a.b();
        q6 a2 = this.q.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.v();
        } finally {
            this.a.h();
            this.q.f(a2);
        }
    }

    public void p() {
        this.a.b();
        q6 a2 = this.s.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.v();
        } finally {
            this.a.h();
            this.s.f(a2);
        }
    }

    public void q() {
        this.a.b();
        q6 a2 = this.u.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.v();
        } finally {
            this.a.h();
            this.u.f(a2);
        }
    }

    public void r(int i2) {
        this.a.b();
        q6 a2 = this.r.a();
        a2.bindLong(1, (long) i2);
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.v();
        } finally {
            this.a.h();
            this.r.f(a2);
        }
    }

    public void s(int i2) {
        this.a.b();
        q6 a2 = this.t.a();
        a2.bindLong(1, (long) i2);
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.v();
        } finally {
            this.a.h();
            this.t.f(a2);
        }
    }

    public void t(sy1 sy1) {
        this.a.b();
        this.a.c();
        try {
            this.n.h(sy1);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public void u(int i2) {
        this.a.b();
        q6 a2 = this.p.a();
        a2.bindLong(1, (long) i2);
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.v();
        } finally {
            this.a.h();
            this.p.f(a2);
        }
    }

    public int v() {
        int i2 = 0;
        androidx.room.o h2 = androidx.room.o.h("SELECT SUM(my_watched_episodes) from animes", 0);
        this.a.b();
        Cursor b2 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            if (b2.moveToFirst()) {
                i2 = b2.getInt(0);
            }
            return i2;
        } finally {
            b2.close();
            h2.l();
        }
    }

    public lx1 w(long j2, long j3) {
        androidx.room.o oVar;
        int b2;
        lx1 lx1;
        androidx.room.o h2 = androidx.room.o.h("SELECT * FROM animejikaninfor2 where malId = ? AND ? < expirationDate", 2);
        h2.bindLong(1, j2);
        h2.bindLong(2, j3);
        this.a.b();
        Cursor b3 = h6.b(this.a, h2, false, (CancellationSignal) null);
        try {
            int b4 = g6.b(b3, "malId");
            int b5 = g6.b(b3, "title");
            int b6 = g6.b(b3, "title_english");
            int b7 = g6.b(b3, "image_url");
            int b8 = g6.b(b3, "type");
            int b9 = g6.b(b3, "source");
            int b10 = g6.b(b3, "episodes");
            int b11 = g6.b(b3, "status");
            int b12 = g6.b(b3, "duration");
            int b13 = g6.b(b3, "rating");
            int b14 = g6.b(b3, "popularity");
            int b15 = g6.b(b3, "score");
            int b16 = g6.b(b3, "rank");
            oVar = h2;
            try {
                b2 = g6.b(b3, "trailer_url");
            } catch (Throwable th) {
                th = th;
                b3.close();
                oVar.l();
                throw th;
            }
            try {
                int b17 = g6.b(b3, "synopsis");
                int b18 = g6.b(b3, "broadcast");
                int b19 = g6.b(b3, "studio");
                int b20 = g6.b(b3, "genre");
                int b21 = g6.b(b3, "opening_theme");
                int b22 = g6.b(b3, "ending_theme");
                int b23 = g6.b(b3, "expirationDate");
                int b24 = g6.b(b3, "jikanRelated");
                int b25 = g6.b(b3, "synonyms");
                int b26 = g6.b(b3, "airedInfo");
                if (b3.moveToFirst()) {
                    int i2 = b26;
                    lx1 lx12 = new lx1();
                    lx12.O(b3.isNull(b4) ? null : Integer.valueOf(b3.getInt(b4)));
                    lx12.Z(b3.getString(b5));
                    lx12.a0(b3.getString(b6));
                    lx12.M(b3.getString(b7));
                    lx12.c0(b3.getString(b8));
                    lx12.U(b3.getString(b9));
                    lx12.I(b3.isNull(b10) ? null : Integer.valueOf(b3.getInt(b10)));
                    lx12.V(b3.getString(b11));
                    lx12.G(b3.getString(b12));
                    lx12.S(b3.getString(b13));
                    lx12.Q(b3.getString(b14));
                    lx12.T(b3.isNull(b15) ? null : Double.valueOf(b3.getDouble(b15)));
                    lx12.R(b3.isNull(b16) ? null : Integer.valueOf(b3.getInt(b16)));
                    lx12.b0(b3.getString(b2));
                    lx12.Y(b3.getString(b17));
                    lx12.F(b3.getString(b18));
                    try {
                        lx12.W(this.d.a(b3.getString(b19)));
                        lx12.L(this.e.a(b3.getString(b20)));
                        lx12.P(this.f.a(b3.getString(b21)));
                        lx12.H(this.f.a(b3.getString(b22)));
                        lx12.K(b3.getLong(b23));
                        lx12.N(this.g.a(b3.getString(b24)));
                        lx12.X(this.f.a(b3.getString(b25)));
                        lx12.E(this.h.a(b3.getString(i2)));
                        lx1 = lx12;
                    } catch (Throwable th2) {
                        th = th2;
                        b3.close();
                        oVar.l();
                        throw th;
                    }
                } else {
                    lx1 = null;
                }
                b3.close();
                oVar.l();
                return lx1;
            } catch (Throwable th3) {
                th = th3;
                b3.close();
                oVar.l();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            oVar = h2;
            b3.close();
            oVar.l();
            throw th;
        }
    }

    public LiveData<lx1> x(long j2) {
        androidx.room.o h2 = androidx.room.o.h("SELECT * FROM animejikaninfor2 where malId = ?", 1);
        h2.bindLong(1, j2);
        return this.a.k().d(new String[]{"animejikaninfor2"}, false, new x(h2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x013d A[Catch:{ all -> 0x01bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013e A[Catch:{ all -> 0x01bd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.sy1 y(long r37) {
        /*
            r36 = this;
            r1 = r36
            java.lang.String r0 = "SELECT * FROM animes where series_animedb_id = ? LIMIT 1"
            r2 = 1
            androidx.room.o r3 = androidx.room.o.h(r0, r2)
            r4 = r37
            r3.bindLong(r2, r4)
            androidx.room.l r0 = r1.a
            r0.b()
            androidx.room.l r0 = r1.a
            r2 = 0
            r4 = 0
            android.database.Cursor r2 = defpackage.h6.b(r0, r3, r2, r4)
            java.lang.String r0 = "series_animedb_id"
            int r0 = defpackage.g6.b(r2, r0)     // Catch:{ all -> 0x01bf }
            java.lang.String r5 = "series_title"
            int r5 = defpackage.g6.b(r2, r5)     // Catch:{ all -> 0x01bf }
            java.lang.String r6 = "series_type"
            int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x01bf }
            java.lang.String r7 = "series_episodes"
            int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x01bf }
            java.lang.String r8 = "series_status"
            int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x01bf }
            java.lang.String r9 = "series_image"
            int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x01bf }
            java.lang.String r10 = "my_watched_episodes"
            int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x01bf }
            java.lang.String r11 = "my_score"
            int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x01bf }
            java.lang.String r12 = "my_status"
            int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x01bf }
            java.lang.String r13 = "my_order"
            int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x01bf }
            java.lang.String r14 = "kitsu_malId"
            int r14 = defpackage.g6.b(r2, r14)     // Catch:{ all -> 0x01bf }
            java.lang.String r15 = "kitsu_kitsuId"
            int r15 = defpackage.g6.b(r2, r15)     // Catch:{ all -> 0x01bf }
            java.lang.String r4 = "kitsu_startDate2"
            int r4 = defpackage.g6.b(r2, r4)     // Catch:{ all -> 0x01bf }
            java.lang.String r1 = "kitsu_endDate2"
            int r1 = defpackage.g6.b(r2, r1)     // Catch:{ all -> 0x01bf }
            r16 = r3
            java.lang.String r3 = "kitsu_posterId"
            int r3 = defpackage.g6.b(r2, r3)     // Catch:{ all -> 0x01bd }
            r38 = r13
            java.lang.String r13 = "kitsu_coverId"
            int r13 = defpackage.g6.b(r2, r13)     // Catch:{ all -> 0x01bd }
            r17 = r12
            java.lang.String r12 = "kitsu_type"
            int r12 = defpackage.g6.b(r2, r12)     // Catch:{ all -> 0x01bd }
            r18 = r11
            java.lang.String r11 = "kitsu_titleEnJp"
            int r11 = defpackage.g6.b(r2, r11)     // Catch:{ all -> 0x01bd }
            r19 = r10
            java.lang.String r10 = "kitsu_titleEn"
            int r10 = defpackage.g6.b(r2, r10)     // Catch:{ all -> 0x01bd }
            r20 = r9
            java.lang.String r9 = "kitsu_titleJaJp"
            int r9 = defpackage.g6.b(r2, r9)     // Catch:{ all -> 0x01bd }
            r21 = r8
            java.lang.String r8 = "livechart_malid"
            int r8 = defpackage.g6.b(r2, r8)     // Catch:{ all -> 0x01bd }
            r22 = r7
            java.lang.String r7 = "livechart_time"
            int r7 = defpackage.g6.b(r2, r7)     // Catch:{ all -> 0x01bd }
            r23 = r6
            java.lang.String r6 = "livechart_episode"
            int r6 = defpackage.g6.b(r2, r6)     // Catch:{ all -> 0x01bd }
            boolean r24 = r2.moveToFirst()     // Catch:{ all -> 0x01bd }
            if (r24 == 0) goto L_0x01b5
            boolean r24 = r2.isNull(r14)     // Catch:{ all -> 0x01bd }
            if (r24 == 0) goto L_0x00fc
            boolean r24 = r2.isNull(r15)     // Catch:{ all -> 0x01bd }
            if (r24 == 0) goto L_0x00fc
            boolean r24 = r2.isNull(r4)     // Catch:{ all -> 0x01bd }
            if (r24 == 0) goto L_0x00fc
            boolean r24 = r2.isNull(r1)     // Catch:{ all -> 0x01bd }
            if (r24 == 0) goto L_0x00fc
            boolean r24 = r2.isNull(r3)     // Catch:{ all -> 0x01bd }
            if (r24 == 0) goto L_0x00fc
            boolean r24 = r2.isNull(r13)     // Catch:{ all -> 0x01bd }
            if (r24 == 0) goto L_0x00fc
            boolean r24 = r2.isNull(r12)     // Catch:{ all -> 0x01bd }
            if (r24 == 0) goto L_0x00fc
            boolean r24 = r2.isNull(r11)     // Catch:{ all -> 0x01bd }
            if (r24 == 0) goto L_0x00fc
            boolean r24 = r2.isNull(r10)     // Catch:{ all -> 0x01bd }
            if (r24 == 0) goto L_0x00fc
            boolean r24 = r2.isNull(r9)     // Catch:{ all -> 0x01bd }
            if (r24 != 0) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r1 = 0
            goto L_0x012b
        L_0x00fc:
            int r26 = r2.getInt(r14)     // Catch:{ all -> 0x01bd }
            int r27 = r2.getInt(r15)     // Catch:{ all -> 0x01bd }
            java.lang.String r28 = r2.getString(r4)     // Catch:{ all -> 0x01bd }
            java.lang.String r29 = r2.getString(r1)     // Catch:{ all -> 0x01bd }
            java.lang.String r30 = r2.getString(r3)     // Catch:{ all -> 0x01bd }
            java.lang.String r31 = r2.getString(r13)     // Catch:{ all -> 0x01bd }
            java.lang.String r32 = r2.getString(r12)     // Catch:{ all -> 0x01bd }
            java.lang.String r33 = r2.getString(r11)     // Catch:{ all -> 0x01bd }
            java.lang.String r34 = r2.getString(r10)     // Catch:{ all -> 0x01bd }
            java.lang.String r35 = r2.getString(r9)     // Catch:{ all -> 0x01bd }
            yy1 r1 = new yy1     // Catch:{ all -> 0x01bd }
            r25 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x01bd }
        L_0x012b:
            boolean r3 = r2.isNull(r8)     // Catch:{ all -> 0x01bd }
            if (r3 == 0) goto L_0x0140
            boolean r3 = r2.isNull(r7)     // Catch:{ all -> 0x01bd }
            if (r3 == 0) goto L_0x0140
            boolean r3 = r2.isNull(r6)     // Catch:{ all -> 0x01bd }
            if (r3 != 0) goto L_0x013e
            goto L_0x0140
        L_0x013e:
            r4 = 0
            goto L_0x0152
        L_0x0140:
            int r3 = r2.getInt(r8)     // Catch:{ all -> 0x01bd }
            long r7 = r2.getLong(r7)     // Catch:{ all -> 0x01bd }
            int r4 = r2.getInt(r6)     // Catch:{ all -> 0x01bd }
            ky1 r6 = new ky1     // Catch:{ all -> 0x01bd }
            r6.<init>(r3, r7, r4)     // Catch:{ all -> 0x01bd }
            r4 = r6
        L_0x0152:
            sy1 r3 = new sy1     // Catch:{ all -> 0x01bd }
            r3.<init>()     // Catch:{ all -> 0x01bd }
            long r6 = r2.getLong(r0)     // Catch:{ all -> 0x01bd }
            r3.I(r6)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = r2.getString(r5)     // Catch:{ all -> 0x01bd }
            r3.a0(r0)     // Catch:{ all -> 0x01bd }
            r0 = r23
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01bd }
            r3.b0(r0)     // Catch:{ all -> 0x01bd }
            r0 = r22
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01bd }
            r3.W(r0)     // Catch:{ all -> 0x01bd }
            r0 = r21
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01bd }
            r3.Y(r0)     // Catch:{ all -> 0x01bd }
            r0 = r20
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x01bd }
            r3.X(r0)     // Catch:{ all -> 0x01bd }
            r0 = r19
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01bd }
            r3.S(r0)     // Catch:{ all -> 0x01bd }
            r0 = r18
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01bd }
            r3.Q(r0)     // Catch:{ all -> 0x01bd }
            r0 = r17
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01bd }
            r3.R(r0)     // Catch:{ all -> 0x01bd }
            r0 = r38
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x01bd }
            r3.T(r0)     // Catch:{ all -> 0x01bd }
            r3.O(r1)     // Catch:{ all -> 0x01bd }
            r3.J(r4)     // Catch:{ all -> 0x01bd }
            r4 = r3
            goto L_0x01b6
        L_0x01b5:
            r4 = 0
        L_0x01b6:
            r2.close()
            r16.l()
            return r4
        L_0x01bd:
            r0 = move-exception
            goto L_0x01c2
        L_0x01bf:
            r0 = move-exception
            r16 = r3
        L_0x01c2:
            r2.close()
            r16.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.database.b.y(long):sy1");
    }

    public LiveData<List<sy1>> z(int i2) {
        androidx.room.o h2 = androidx.room.o.h("SELECT * FROM animes where my_status = ?", 1);
        h2.bindLong(1, (long) i2);
        return this.a.k().d(new String[]{"animes"}, false, new u(h2));
    }
}
