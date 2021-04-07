package defpackage;

import defpackage.vj1;

/* renamed from: s02  reason: default package */
public final class s02 extends vj1<s02, a> implements Object {
    /* access modifiers changed from: private */
    public static final s02 o;
    private static volatile xk1<s02> p;
    private String i = "";
    private String j = "";
    private long k;
    private String l = "";
    private long m;
    private long n;

    /* renamed from: s02$a */
    public static final class a extends vj1.a<s02, a> implements Object {
        private a() {
            super(s02.o);
        }

        /* synthetic */ a(q02 q02) {
            this();
        }
    }

    static {
        s02 s02 = new s02();
        o = s02;
        vj1.F(s02.class, s02);
    }

    private s02() {
        vj1.t();
    }

    public static s02 O(byte[] bArr) {
        return (s02) vj1.C(o, bArr);
    }

    public String I() {
        return this.i;
    }

    public long J() {
        return this.k;
    }

    public long K() {
        return this.n;
    }

    public String L() {
        return this.l;
    }

    public long M() {
        return this.m;
    }

    public String N() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final Object s(vj1.f fVar, Object obj, Object obj2) {
        switch (q02.a[fVar.ordinal()]) {
            case 1:
                return new s02();
            case 2:
                return new a((q02) null);
            case 3:
                return vj1.A(o, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"experimentId_", "variantId_", "experimentStartTimeMillis_", "triggerEvent_", "triggerTimeoutMillis_", "timeToLiveMillis_", "setEventToLog_", "activateEventToLog_", "clearEventToLog_", "timeoutEventToLog_", "ttlExpiryEventToLog_", "overflowPolicy_", "ongoingExperiments_", r02.class});
            case 4:
                return o;
            case 5:
                xk1<s02> xk1 = p;
                if (xk1 == null) {
                    synchronized (s02.class) {
                        xk1 = p;
                        if (xk1 == null) {
                            xk1 = new vj1.b<>(o);
                            p = xk1;
                        }
                    }
                }
                return xk1;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
