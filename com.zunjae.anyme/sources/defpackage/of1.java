package defpackage;

import com.github.mikephil.charting.utils.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: of1  reason: default package */
public class of1 {
    /* access modifiers changed from: private */
    public static final short[] h = {10, 20, 30, 60, 120, 300};
    private final uf1 a;
    private final String b;
    private final String c;
    private final pc1 d;
    private final nf1 e;
    /* access modifiers changed from: private */
    public final a f;
    /* access modifiers changed from: private */
    public Thread g;

    /* renamed from: of1$a */
    public interface a {
        boolean a();
    }

    /* renamed from: of1$b */
    public interface b {
        of1 a(jg1 jg1);
    }

    /* renamed from: of1$c */
    public interface c {
        File[] a();

        File[] b();
    }

    /* renamed from: of1$d */
    private class d extends zb1 {
        private final List<rf1> e;
        private final boolean f;
        private final float g;

        d(List<rf1> list, boolean z, float f2) {
            this.e = list;
            this.f = z;
            this.g = f2;
        }

        private void b(List<rf1> list, boolean z) {
            jb1 f2 = jb1.f();
            f2.b("Starting report processing in " + this.g + " second(s)...");
            float f3 = this.g;
            if (f3 > Utils.FLOAT_EPSILON) {
                try {
                    Thread.sleep((long) (f3 * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (!of1.this.f.a()) {
                int i = 0;
                while (list.size() > 0 && !of1.this.f.a()) {
                    jb1 f4 = jb1.f();
                    f4.b("Attempting to send " + list.size() + " report(s)");
                    ArrayList arrayList = new ArrayList();
                    for (rf1 next : list) {
                        if (!of1.this.d(next, z)) {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.size() > 0) {
                        int i2 = i + 1;
                        long j = (long) of1.h[Math.min(i, of1.h.length - 1)];
                        jb1 f5 = jb1.f();
                        f5.b("Report submission: scheduling delayed retry in " + j + " seconds");
                        Thread.sleep(j * 1000);
                        i = i2;
                    }
                    list = arrayList;
                }
            }
        }

        public void a() {
            try {
                b(this.e, this.f);
            } catch (Exception e2) {
                jb1.f().e("An unexpected error occurred while attempting to upload crash reports.", e2);
            }
            Thread unused = of1.this.g = null;
        }
    }

    public of1(String str, String str2, pc1 pc1, nf1 nf1, uf1 uf1, a aVar) {
        if (uf1 != null) {
            this.a = uf1;
            this.b = str;
            this.c = str2;
            this.d = pc1;
            this.e = nf1;
            this.f = aVar;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060 A[Catch:{ Exception -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(defpackage.rf1 r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            pf1 r1 = new pf1     // Catch:{ Exception -> 0x0067 }
            java.lang.String r2 = r5.b     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r5.c     // Catch:{ Exception -> 0x0067 }
            r1.<init>(r2, r3, r6)     // Catch:{ Exception -> 0x0067 }
            pc1 r2 = r5.d     // Catch:{ Exception -> 0x0067 }
            pc1 r3 = defpackage.pc1.ALL     // Catch:{ Exception -> 0x0067 }
            r4 = 1
            if (r2 != r3) goto L_0x001b
            jb1 r7 = defpackage.jb1.f()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = "Send to Reports Endpoint disabled. Removing Reports Endpoint report."
        L_0x0017:
            r7.b(r1)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0030
        L_0x001b:
            pc1 r2 = r5.d     // Catch:{ Exception -> 0x0067 }
            pc1 r3 = defpackage.pc1.JAVA_ONLY     // Catch:{ Exception -> 0x0067 }
            if (r2 != r3) goto L_0x0032
            rf1$a r2 = r6.d()     // Catch:{ Exception -> 0x0067 }
            rf1$a r3 = defpackage.rf1.a.JAVA     // Catch:{ Exception -> 0x0067 }
            if (r2 != r3) goto L_0x0032
            jb1 r7 = defpackage.jb1.f()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = "Send to Reports Endpoint for non-native reports disabled. Removing Reports Uploader report."
            goto L_0x0017
        L_0x0030:
            r7 = 1
            goto L_0x005e
        L_0x0032:
            uf1 r2 = r5.a     // Catch:{ Exception -> 0x0067 }
            boolean r7 = r2.b(r1, r7)     // Catch:{ Exception -> 0x0067 }
            jb1 r1 = defpackage.jb1.f()     // Catch:{ Exception -> 0x0067 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0067 }
            r2.<init>()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = "Crashlytics Reports Endpoint upload "
            r2.append(r3)     // Catch:{ Exception -> 0x0067 }
            if (r7 == 0) goto L_0x004b
            java.lang.String r3 = "complete: "
            goto L_0x004d
        L_0x004b:
            java.lang.String r3 = "FAILED: "
        L_0x004d:
            r2.append(r3)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r6.c()     // Catch:{ Exception -> 0x0067 }
            r2.append(r3)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0067 }
            r1.g(r2)     // Catch:{ Exception -> 0x0067 }
        L_0x005e:
            if (r7 == 0) goto L_0x0080
            nf1 r7 = r5.e     // Catch:{ Exception -> 0x0067 }
            r7.b(r6)     // Catch:{ Exception -> 0x0067 }
            r0 = 1
            goto L_0x0080
        L_0x0067:
            r7 = move-exception
            jb1 r1 = defpackage.jb1.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error occurred sending report "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.e(r6, r7)
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of1.d(rf1, boolean):boolean");
    }

    public synchronized void e(List<rf1> list, boolean z, float f2) {
        if (this.g != null) {
            jb1.f().b("Report upload has already been started.");
            return;
        }
        Thread thread = new Thread(new d(list, z, f2), "Crashlytics Report Uploader");
        this.g = thread;
        thread.start();
    }
}
