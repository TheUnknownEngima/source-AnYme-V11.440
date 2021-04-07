package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class h extends m80 {
    public static final Parcelable.Creator<h> CREATOR = new q0();
    /* access modifiers changed from: private */
    public static final List<String> K = Arrays.asList(new String[]{MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING});
    /* access modifiers changed from: private */
    public static final int[] L = {0, 1};
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private final int I;
    private final d0 J;
    private final List<String> e;
    private final int[] f;
    private final long g;
    private final String h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public static final class a {
        private String a;
        private List<String> b = h.K;
        private g c;
        private int[] d = h.L;
        private int e = b("smallIconDrawableResId");
        private int f = b("stopLiveStreamDrawableResId");
        private int g = b("pauseDrawableResId");
        private int h = b("playDrawableResId");
        private int i = b("skipNextDrawableResId");
        private int j = b("skipPrevDrawableResId");
        private int k = b("forwardDrawableResId");
        private int l = b("forward10DrawableResId");
        private int m = b("forward30DrawableResId");
        private int n = b("rewindDrawableResId");
        private int o = b("rewind10DrawableResId");
        private int p = b("rewind30DrawableResId");
        private int q = b("disconnectDrawableResId");
        private long r = 10000;

        private static int b(String str) {
            try {
                Integer num = (Integer) Class.forName("com.google.android.gms.cast.framework.media.internal.ResourceProvider").getMethod("findResourceByName", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        public final h a() {
            g gVar = this.c;
            h hVar = r2;
            h hVar2 = new h(this.b, this.d, this.r, this.a, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, b("notificationImageSizeDimenResId"), b("castingToDeviceStringResId"), b("stopLiveStreamStringResId"), b("pauseStringResId"), b("playStringResId"), b("skipNextStringResId"), b("skipPrevStringResId"), b("forwardStringResId"), b("forward10StringResId"), b("forward30StringResId"), b("rewindStringResId"), b("rewind10StringResId"), b("rewind30StringResId"), b("disconnectStringResId"), gVar == null ? null : gVar.a().asBinder());
            return hVar;
        }
    }

    /* JADX WARNING: type inference failed for: r1v31, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(java.util.List<java.lang.String> r7, int[] r8, long r9, java.lang.String r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, android.os.IBinder r39) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r39
            r6.<init>()
            r4 = 0
            if (r1 == 0) goto L_0x0013
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r7)
            r0.e = r5
            goto L_0x0015
        L_0x0013:
            r0.e = r4
        L_0x0015:
            if (r2 == 0) goto L_0x001f
            int r1 = r2.length
            int[] r1 = java.util.Arrays.copyOf(r8, r1)
            r0.f = r1
            goto L_0x0021
        L_0x001f:
            r0.f = r4
        L_0x0021:
            r1 = r9
            r0.g = r1
            r1 = r11
            r0.h = r1
            r1 = r12
            r0.i = r1
            r1 = r13
            r0.j = r1
            r1 = r14
            r0.k = r1
            r1 = r15
            r0.l = r1
            r1 = r16
            r0.m = r1
            r1 = r17
            r0.n = r1
            r1 = r18
            r0.o = r1
            r1 = r19
            r0.p = r1
            r1 = r20
            r0.q = r1
            r1 = r21
            r0.r = r1
            r1 = r22
            r0.s = r1
            r1 = r23
            r0.t = r1
            r1 = r24
            r0.u = r1
            r1 = r25
            r0.v = r1
            r1 = r26
            r0.w = r1
            r1 = r27
            r0.x = r1
            r1 = r28
            r0.y = r1
            r1 = r29
            r0.z = r1
            r1 = r30
            r0.A = r1
            r1 = r31
            r0.B = r1
            r1 = r32
            r0.C = r1
            r1 = r33
            r0.D = r1
            r1 = r34
            r0.E = r1
            r1 = r35
            r0.F = r1
            r1 = r36
            r0.G = r1
            r1 = r37
            r0.H = r1
            r1 = r38
            r0.I = r1
            if (r3 != 0) goto L_0x0092
            goto L_0x00a5
        L_0x0092:
            java.lang.String r1 = "com.google.android.gms.cast.framework.media.INotificationActionsProvider"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.cast.framework.media.d0
            if (r2 == 0) goto L_0x00a0
            r4 = r1
            com.google.android.gms.cast.framework.media.d0 r4 = (com.google.android.gms.cast.framework.media.d0) r4
            goto L_0x00a5
        L_0x00a0:
            com.google.android.gms.cast.framework.media.f0 r4 = new com.google.android.gms.cast.framework.media.f0
            r4.<init>(r3)
        L_0x00a5:
            r0.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.h.<init>(java.util.List, int[], long, java.lang.String, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, android.os.IBinder):void");
    }

    public final int A0() {
        return this.H;
    }

    public final int B0() {
        return this.I;
    }

    public final d0 C0() {
        return this.J;
    }

    public int D() {
        return this.r;
    }

    public int E() {
        return this.m;
    }

    public int F() {
        return this.n;
    }

    public long J() {
        return this.g;
    }

    public int M() {
        return this.i;
    }

    public int N() {
        return this.j;
    }

    public int Q() {
        return this.x;
    }

    public String R() {
        return this.h;
    }

    public final int X() {
        return this.v;
    }

    public final int Y() {
        return this.y;
    }

    public final int d0() {
        return this.z;
    }

    public List<String> i() {
        return this.e;
    }

    public final int i0() {
        return this.A;
    }

    public int j() {
        return this.w;
    }

    public final int j0() {
        return this.B;
    }

    public int[] k() {
        int[] iArr = this.f;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int l() {
        return this.u;
    }

    public int m() {
        return this.p;
    }

    public final int m0() {
        return this.C;
    }

    public int n() {
        return this.q;
    }

    public int o() {
        return this.o;
    }

    public final int o0() {
        return this.D;
    }

    public int p() {
        return this.k;
    }

    public final int q0() {
        return this.E;
    }

    public final int r0() {
        return this.F;
    }

    public int u() {
        return this.l;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = o80.a(parcel);
        o80.u(parcel, 2, i(), false);
        o80.m(parcel, 3, k(), false);
        o80.o(parcel, 4, J());
        o80.s(parcel, 5, R(), false);
        o80.l(parcel, 6, M());
        o80.l(parcel, 7, N());
        o80.l(parcel, 8, p());
        o80.l(parcel, 9, u());
        o80.l(parcel, 10, E());
        o80.l(parcel, 11, F());
        o80.l(parcel, 12, o());
        o80.l(parcel, 13, m());
        o80.l(parcel, 14, n());
        o80.l(parcel, 15, D());
        o80.l(parcel, 16, y());
        o80.l(parcel, 17, z());
        o80.l(parcel, 18, l());
        o80.l(parcel, 19, this.v);
        o80.l(parcel, 20, j());
        o80.l(parcel, 21, Q());
        o80.l(parcel, 22, this.y);
        o80.l(parcel, 23, this.z);
        o80.l(parcel, 24, this.A);
        o80.l(parcel, 25, this.B);
        o80.l(parcel, 26, this.C);
        o80.l(parcel, 27, this.D);
        o80.l(parcel, 28, this.E);
        o80.l(parcel, 29, this.F);
        o80.l(parcel, 30, this.G);
        o80.l(parcel, 31, this.H);
        o80.l(parcel, 32, this.I);
        d0 d0Var = this.J;
        o80.k(parcel, 33, d0Var == null ? null : d0Var.asBinder(), false);
        o80.b(parcel, a2);
    }

    public int y() {
        return this.s;
    }

    public final int y0() {
        return this.G;
    }

    public int z() {
        return this.t;
    }
}
