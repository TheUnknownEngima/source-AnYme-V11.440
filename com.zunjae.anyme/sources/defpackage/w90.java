package defpackage;

/* renamed from: w90  reason: default package */
public abstract class w90 extends m90 implements x90 {
    public w90() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        r4.writeNoException();
        defpackage.cb0.a(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        r4.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p3(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            switch(r2) {
                case 1: goto L_0x007a;
                case 2: goto L_0x0067;
                case 3: goto L_0x005b;
                case 4: goto L_0x0044;
                case 5: goto L_0x003c;
                case 6: goto L_0x0038;
                case 7: goto L_0x0033;
                case 8: goto L_0x0023;
                case 9: goto L_0x0017;
                case 10: goto L_0x0009;
                case 11: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            r1.d1()
            goto L_0x0076
        L_0x0009:
            r1.a()
            r4.writeNoException()
            r2 = 12451009(0xbdfcc1, float:1.744758E-38)
            r4.writeInt(r2)
            goto L_0x00a2
        L_0x0017:
            java.lang.String r2 = r1.p2()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x00a2
        L_0x0023:
            java.lang.String r2 = r3.readString()
            android.os.Bundle r2 = r1.x0(r2)
            r4.writeNoException()
            defpackage.cb0.f(r4, r2)
            goto L_0x00a2
        L_0x0033:
            boolean r2 = r1.X1()
            goto L_0x0054
        L_0x0038:
            r1.h3()
            goto L_0x0076
        L_0x003c:
            java.lang.String r2 = r3.readString()
            r1.y2(r2)
            goto L_0x0076
        L_0x0044:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = defpackage.cb0.b(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            int r3 = r3.readInt()
            boolean r2 = r1.L(r2, r3)
        L_0x0054:
            r4.writeNoException()
            defpackage.cb0.a(r4, r2)
            goto L_0x00a2
        L_0x005b:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = defpackage.cb0.b(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.A0(r2)
            goto L_0x0076
        L_0x0067:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = defpackage.cb0.b(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            int r3 = r3.readInt()
            r1.j0(r2, r3)
        L_0x0076:
            r4.writeNoException()
            goto L_0x00a2
        L_0x007a:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = defpackage.cb0.b(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x008a
            r3 = 0
            goto L_0x009e
        L_0x008a:
            java.lang.String r5 = "com.google.android.gms.cast.framework.internal.IMediaRouterCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof defpackage.z90
            if (r0 == 0) goto L_0x0098
            r3 = r5
            z90 r3 = (defpackage.z90) r3
            goto L_0x009e
        L_0x0098:
            y90 r5 = new y90
            r5.<init>(r3)
            r3 = r5
        L_0x009e:
            r1.T2(r2, r3)
            goto L_0x0076
        L_0x00a2:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w90.p3(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
