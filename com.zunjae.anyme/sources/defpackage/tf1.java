package defpackage;

/* renamed from: tf1  reason: default package */
public class tf1 implements uf1 {
    private final vf1 a;
    private final wf1 b;

    /* renamed from: tf1$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                rf1$a[] r0 = defpackage.rf1.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                rf1$a r1 = defpackage.rf1.a.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                rf1$a r1 = defpackage.rf1.a.NATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tf1.a.<clinit>():void");
        }
    }

    public tf1(vf1 vf1, wf1 wf1) {
        this.a = vf1;
        this.b = wf1;
    }

    public boolean b(pf1 pf1, boolean z) {
        int i = a.a[pf1.c.d().ordinal()];
        if (i == 1) {
            this.a.b(pf1, z);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.b.b(pf1, z);
            return true;
        }
    }
}
