package com.zunjae.anyme.features.download;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.t;
import com.zunjae.downloader.e;
import com.zunjae.downloader.f;
import com.zunjae.downloader.m;
import java.util.List;
import kotlinx.coroutines.f0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.v0;

public final class c extends a0 {
    private t<List<e>> c = new t<>();
    private m d = m.Running;
    /* access modifiers changed from: private */
    public final f e;
    /* access modifiers changed from: private */
    public final ov1 f;

    @y42(c = "com.zunjae.anyme.features.download.DownloadManagerViewModel$cancelDownload$1", f = "DownloadManagerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends d52 implements d62<f0, k42<? super u22>, Object> {
        private f0 i;
        int j;
        final /* synthetic */ c k;
        final /* synthetic */ long l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, long j2, k42 k42) {
            super(2, k42);
            this.k = cVar;
            this.l = j2;
        }

        public final Object G(Object obj, Object obj2) {
            return ((a) a(obj, (k42) obj2)).k(u22.a);
        }

        public final k42<u22> a(Object obj, k42<?> k42) {
            v62.e(k42, "completion");
            a aVar = new a(this.k, this.l, k42);
            aVar.i = (f0) obj;
            return aVar;
        }

        public final Object k(Object obj) {
            Object unused = s42.d();
            if (this.j == 0) {
                n22.b(obj);
                this.k.e.c(this.l);
                return u22.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @y42(c = "com.zunjae.anyme.features.download.DownloadManagerViewModel$saveAnimeDownload$1", f = "DownloadManagerViewModel.kt", l = {44}, m = "invokeSuspend")
    static final class b extends d52 implements d62<f0, k42<? super u22>, Object> {
        private f0 i;
        Object j;
        int k;
        final /* synthetic */ c l;
        final /* synthetic */ com.zunjae.downloader.b m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, com.zunjae.downloader.b bVar, k42 k42) {
            super(2, k42);
            this.l = cVar;
            this.m = bVar;
        }

        public final Object G(Object obj, Object obj2) {
            return ((b) a(obj, (k42) obj2)).k(u22.a);
        }

        public final k42<u22> a(Object obj, k42<?> k42) {
            v62.e(k42, "completion");
            b bVar = new b(this.l, this.m, k42);
            bVar.i = (f0) obj;
            return bVar;
        }

        public final Object k(Object obj) {
            Object d = s42.d();
            int i2 = this.k;
            if (i2 == 0) {
                n22.b(obj);
                f0 f0Var = this.i;
                ov1 f = this.l.f;
                com.zunjae.downloader.b bVar = this.m;
                this.j = f0Var;
                this.k = 1;
                if (f.S(bVar, this) == d) {
                    return d;
                }
            } else if (i2 == 1) {
                f0 f0Var2 = (f0) this.j;
                n22.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u22.a;
        }
    }

    @y42(c = "com.zunjae.anyme.features.download.DownloadManagerViewModel$startLoopObserveDownloads$1", f = "DownloadManagerViewModel.kt", l = {51, 35}, m = "invokeSuspend")
    /* renamed from: com.zunjae.anyme.features.download.c$c  reason: collision with other inner class name */
    static final class C0191c extends d52 implements d62<f0, k42<? super u22>, Object> {
        private f0 i;
        Object j;
        Object k;
        Object l;
        int m;
        final /* synthetic */ c n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0191c(c cVar, k42 k42) {
            super(2, k42);
            this.n = cVar;
        }

        public final Object G(Object obj, Object obj2) {
            return ((C0191c) a(obj, (k42) obj2)).k(u22.a);
        }

        public final k42<u22> a(Object obj, k42<?> k42) {
            v62.e(k42, "completion");
            C0191c cVar = new C0191c(this.n, k42);
            cVar.i = (f0) obj;
            return cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0068 A[LOOP:0: B:11:0x0062->B:13:0x0068, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00eb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object k(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = defpackage.s42.d()
                int r2 = r0.m
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 == r4) goto L_0x0028
                if (r2 != r3) goto L_0x0020
                java.lang.Object r2 = r0.l
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r2 = r0.k
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r2 = r0.j
                kotlinx.coroutines.f0 r2 = (kotlinx.coroutines.f0) r2
                defpackage.n22.b(r19)
                goto L_0x003c
            L_0x0020:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0028:
                java.lang.Object r2 = r0.k
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r5 = r0.j
                kotlinx.coroutines.f0 r5 = (kotlinx.coroutines.f0) r5
                defpackage.n22.b(r19)
                r7 = r19
                r6 = r0
                goto L_0x008d
            L_0x0037:
                defpackage.n22.b(r19)
                kotlinx.coroutines.f0 r2 = r0.i
            L_0x003c:
                r5 = r0
            L_0x003d:
                com.zunjae.anyme.features.download.c r6 = r5.n
                com.zunjae.downloader.f r6 = r6.e
                com.zunjae.anyme.features.download.c r7 = r5.n
                com.zunjae.downloader.m r7 = r7.k()
                java.util.List r6 = r6.a(r7)
                com.zunjae.anyme.features.download.c r7 = r5.n
                ov1 r7 = r7.f
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = defpackage.g32.l(r6, r9)
                r8.<init>(r9)
                java.util.Iterator r9 = r6.iterator()
            L_0x0062:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x007a
                java.lang.Object r10 = r9.next()
                com.zunjae.downloader.e r10 = (com.zunjae.downloader.e) r10
                long r10 = r10.c()
                java.lang.Long r10 = defpackage.u42.b(r10)
                r8.add(r10)
                goto L_0x0062
            L_0x007a:
                r5.j = r2
                r5.k = r6
                r5.m = r4
                java.lang.Object r7 = r7.w(r8, r5)
                if (r7 != r1) goto L_0x0087
                return r1
            L_0x0087:
                r17 = r5
                r5 = r2
                r2 = r6
                r6 = r17
            L_0x008d:
                java.util.List r7 = (java.util.List) r7
                java.util.Iterator r8 = r2.iterator()
            L_0x0093:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x00d1
                java.lang.Object r9 = r8.next()
                com.zunjae.downloader.e r9 = (com.zunjae.downloader.e) r9
                java.util.Iterator r10 = r7.iterator()
            L_0x00a3:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x00ca
                java.lang.Object r11 = r10.next()
                r12 = r11
                com.zunjae.downloader.b r12 = (com.zunjae.downloader.b) r12
                long r12 = r12.c()
                long r14 = r9.c()
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 != 0) goto L_0x00be
                r12 = 1
                goto L_0x00bf
            L_0x00be:
                r12 = 0
            L_0x00bf:
                java.lang.Boolean r12 = defpackage.u42.a(r12)
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L_0x00a3
                goto L_0x00cb
            L_0x00ca:
                r11 = 0
            L_0x00cb:
                com.zunjae.downloader.b r11 = (com.zunjae.downloader.b) r11
                r9.g(r11)
                goto L_0x0093
            L_0x00d1:
                com.zunjae.anyme.features.download.c r8 = r6.n
                androidx.lifecycle.t r8 = r8.i()
                r8.k(r2)
                r8 = 500(0x1f4, double:2.47E-321)
                r6.j = r5
                r6.k = r2
                r6.l = r7
                r6.m = r3
                java.lang.Object r2 = kotlinx.coroutines.p0.a(r8, r6)
                if (r2 != r1) goto L_0x00eb
                return r1
            L_0x00eb:
                r2 = r5
                r5 = r6
                goto L_0x003d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.download.c.C0191c.k(java.lang.Object):java.lang.Object");
        }
    }

    public c(f fVar, ov1 ov1) {
        v62.e(fVar, "downloader");
        v62.e(ov1, "animeRepository");
        this.e = fVar;
        this.f = ov1;
    }

    public final o1 h(long j) {
        return e.b(b0.a(this), v0.b(), (i0) null, new a(this, j, (k42) null), 2, (Object) null);
    }

    public final t<List<e>> i() {
        return this.c;
    }

    public final LiveData<Integer> j(int i) {
        return this.f.y(i);
    }

    public final m k() {
        return this.d;
    }

    public final o1 l(com.zunjae.downloader.b bVar) {
        v62.e(bVar, "downloadEntry");
        return e.b(b0.a(this), v0.b(), (i0) null, new b(this, bVar, (k42) null), 2, (Object) null);
    }

    public final void m(m mVar) {
        v62.e(mVar, "<set-?>");
        this.d = mVar;
    }

    public final o1 n() {
        return e.b(b0.a(this), v0.b(), (i0) null, new C0191c(this, (k42) null), 2, (Object) null);
    }
}
