package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: w80  reason: default package */
public interface w80 extends IInterface {

    /* renamed from: w80$a */
    public static abstract class a extends cp0 implements w80 {

        /* renamed from: w80$a$a  reason: collision with other inner class name */
        public static class C0142a extends dp0 implements w80 {
            C0142a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static w80 q3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof w80 ? (w80) queryLocalInterface : new C0142a(iBinder);
        }
    }
}
