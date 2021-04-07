package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.c;
import androidx.work.e;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.f;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.k;
import java.util.List;

public class b implements Runnable {
    private static final String g = h.f("EnqueueRunnable");
    private final f e;
    private final androidx.work.impl.b f = new androidx.work.impl.b();

    public b(f fVar) {
        this.e = fVar;
    }

    private static boolean b(f fVar) {
        boolean c = c(fVar.g(), fVar.f(), (String[]) f.l(fVar).toArray(new String[0]), fVar.d(), fVar.b());
        fVar.k();
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0192 A[LOOP:6: B:103:0x018c->B:105:0x0192, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01bb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(androidx.work.impl.h r16, java.util.List<? extends androidx.work.o> r17, java.lang.String[] r18, java.lang.String r19, androidx.work.f r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            long r3 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r5 = r16.m()
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0017
            int r8 = r0.length
            if (r8 <= 0) goto L_0x0017
            r8 = 1
            goto L_0x0018
        L_0x0017:
            r8 = 0
        L_0x0018:
            if (r8 == 0) goto L_0x005b
            int r9 = r0.length
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
        L_0x001f:
            if (r10 >= r9) goto L_0x005e
            r14 = r0[r10]
            j8 r15 = r5.D()
            i8 r15 = r15.m(r14)
            if (r15 != 0) goto L_0x0043
            androidx.work.h r0 = androidx.work.h.c()
            java.lang.String r1 = g
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r14
            java.lang.String r3 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r6]
            r0.b(r1, r2, r3)
            return r6
        L_0x0043:
            androidx.work.m$a r14 = r15.b
            androidx.work.m$a r15 = androidx.work.m.a.SUCCEEDED
            if (r14 != r15) goto L_0x004b
            r15 = 1
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            r11 = r11 & r15
            androidx.work.m$a r15 = androidx.work.m.a.FAILED
            if (r14 != r15) goto L_0x0053
            r12 = 1
            goto L_0x0058
        L_0x0053:
            androidx.work.m$a r15 = androidx.work.m.a.CANCELLED
            if (r14 != r15) goto L_0x0058
            r13 = 1
        L_0x0058:
            int r10 = r10 + 1
            goto L_0x001f
        L_0x005b:
            r11 = 1
            r12 = 0
            r13 = 0
        L_0x005e:
            boolean r9 = android.text.TextUtils.isEmpty(r19)
            r9 = r9 ^ r7
            if (r9 == 0) goto L_0x0069
            if (r8 != 0) goto L_0x0069
            r10 = 1
            goto L_0x006a
        L_0x0069:
            r10 = 0
        L_0x006a:
            if (r10 == 0) goto L_0x010f
            j8 r10 = r5.D()
            java.util.List r10 = r10.c(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L_0x010f
            androidx.work.f r14 = androidx.work.f.APPEND
            if (r2 != r14) goto L_0x00cb
            a8 r2 = r5.x()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x008b:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x00be
            java.lang.Object r14 = r10.next()
            i8$a r14 = (defpackage.i8.a) r14
            java.lang.String r15 = r14.a
            boolean r15 = r2.d(r15)
            if (r15 != 0) goto L_0x00bc
            androidx.work.m$a r15 = r14.b
            androidx.work.m$a r7 = androidx.work.m.a.SUCCEEDED
            if (r15 != r7) goto L_0x00a7
            r7 = 1
            goto L_0x00a8
        L_0x00a7:
            r7 = 0
        L_0x00a8:
            r7 = r7 & r11
            androidx.work.m$a r11 = r14.b
            androidx.work.m$a r15 = androidx.work.m.a.FAILED
            if (r11 != r15) goto L_0x00b1
            r12 = 1
            goto L_0x00b6
        L_0x00b1:
            androidx.work.m$a r15 = androidx.work.m.a.CANCELLED
            if (r11 != r15) goto L_0x00b6
            r13 = 1
        L_0x00b6:
            java.lang.String r11 = r14.a
            r8.add(r11)
            r11 = r7
        L_0x00bc:
            r7 = 1
            goto L_0x008b
        L_0x00be:
            java.lang.Object[] r0 = r8.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x00c9
            r8 = 1
            goto L_0x010f
        L_0x00c9:
            r8 = 0
            goto L_0x010f
        L_0x00cb:
            androidx.work.f r7 = androidx.work.f.KEEP
            if (r2 != r7) goto L_0x00ea
            java.util.Iterator r2 = r10.iterator()
        L_0x00d3:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00ea
            java.lang.Object r7 = r2.next()
            i8$a r7 = (defpackage.i8.a) r7
            androidx.work.m$a r7 = r7.b
            androidx.work.m$a r14 = androidx.work.m.a.ENQUEUED
            if (r7 == r14) goto L_0x00e9
            androidx.work.m$a r14 = androidx.work.m.a.RUNNING
            if (r7 != r14) goto L_0x00d3
        L_0x00e9:
            return r6
        L_0x00ea:
            r2 = r16
            androidx.work.impl.utils.a r2 = androidx.work.impl.utils.a.b(r1, r2, r6)
            r2.run()
            j8 r2 = r5.D()
            java.util.Iterator r7 = r10.iterator()
        L_0x00fb:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x010d
            java.lang.Object r10 = r7.next()
            i8$a r10 = (defpackage.i8.a) r10
            java.lang.String r10 = r10.a
            r2.e(r10)
            goto L_0x00fb
        L_0x010d:
            r2 = 1
            goto L_0x0110
        L_0x010f:
            r2 = 0
        L_0x0110:
            java.util.Iterator r7 = r17.iterator()
        L_0x0114:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x01c2
            java.lang.Object r10 = r7.next()
            androidx.work.o r10 = (androidx.work.o) r10
            i8 r14 = r10.d()
            if (r8 == 0) goto L_0x0137
            if (r11 != 0) goto L_0x0137
            if (r12 == 0) goto L_0x012f
            androidx.work.m$a r15 = androidx.work.m.a.FAILED
        L_0x012c:
            r14.b = r15
            goto L_0x013f
        L_0x012f:
            if (r13 == 0) goto L_0x0134
            androidx.work.m$a r15 = androidx.work.m.a.CANCELLED
            goto L_0x012c
        L_0x0134:
            androidx.work.m$a r15 = androidx.work.m.a.BLOCKED
            goto L_0x012c
        L_0x0137:
            boolean r15 = r14.d()
            if (r15 != 0) goto L_0x0142
            r14.n = r3
        L_0x013f:
            r16 = r7
            goto L_0x0148
        L_0x0142:
            r16 = r7
            r6 = 0
            r14.n = r6
        L_0x0148:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            if (r6 < r7) goto L_0x0155
            r7 = 25
            if (r6 > r7) goto L_0x0155
            g(r14)
        L_0x0155:
            androidx.work.m$a r6 = r14.b
            androidx.work.m$a r7 = androidx.work.m.a.ENQUEUED
            if (r6 != r7) goto L_0x015c
            r2 = 1
        L_0x015c:
            j8 r6 = r5.D()
            r6.f(r14)
            if (r8 == 0) goto L_0x0182
            int r6 = r0.length
            r7 = 0
        L_0x0167:
            if (r7 >= r6) goto L_0x0182
            r14 = r0[r7]
            z7 r15 = new z7
            r18 = r0
            java.lang.String r0 = r10.b()
            r15.<init>(r0, r14)
            a8 r0 = r5.x()
            r0.a(r15)
            int r7 = r7 + 1
            r0 = r18
            goto L_0x0167
        L_0x0182:
            r18 = r0
            java.util.Set r0 = r10.c()
            java.util.Iterator r0 = r0.iterator()
        L_0x018c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x01a9
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            m8 r7 = r5.E()
            l8 r14 = new l8
            java.lang.String r15 = r10.b()
            r14.<init>(r6, r15)
            r7.a(r14)
            goto L_0x018c
        L_0x01a9:
            if (r9 == 0) goto L_0x01bb
            g8 r0 = r5.C()
            f8 r6 = new f8
            java.lang.String r7 = r10.b()
            r6.<init>(r1, r7)
            r0.a(r6)
        L_0x01bb:
            r7 = r16
            r0 = r18
            r6 = 0
            goto L_0x0114
        L_0x01c2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.b.c(androidx.work.impl.h, java.util.List, java.lang.String[], java.lang.String, androidx.work.f):boolean");
    }

    private static boolean e(f fVar) {
        List<f> e2 = fVar.e();
        boolean z = false;
        if (e2 != null) {
            boolean z2 = false;
            for (f next : e2) {
                if (!next.j()) {
                    z2 |= e(next);
                } else {
                    h.c().h(g, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", next.c())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return b(fVar) | z;
    }

    private static void g(i8 i8Var) {
        c cVar = i8Var.j;
        if (cVar.f() || cVar.i()) {
            String str = i8Var.c;
            e.a aVar = new e.a();
            aVar.c(i8Var.e);
            aVar.e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            i8Var.c = ConstraintTrackingWorker.class.getName();
            i8Var.e = aVar.a();
        }
    }

    public boolean a() {
        WorkDatabase m = this.e.g().m();
        m.c();
        try {
            boolean e2 = e(this.e);
            m.v();
            return e2;
        } finally {
            m.h();
        }
    }

    public k d() {
        return this.f;
    }

    public void f() {
        androidx.work.impl.h g2 = this.e.g();
        androidx.work.impl.e.b(g2.h(), g2.m(), g2.l());
    }

    public void run() {
        try {
            if (!this.e.h()) {
                if (a()) {
                    e.a(this.e.g().g(), RescheduleReceiver.class, true);
                    f();
                }
                this.f.a(k.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.e}));
        } catch (Throwable th) {
            this.f.a(new k.b.a(th));
        }
    }
}
