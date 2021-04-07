package defpackage;

import android.os.Binder;

/* renamed from: rt0  reason: default package */
public final /* synthetic */ class rt0 {
    public static <V> V a(qt0<V> qt0) {
        long clearCallingIdentity;
        try {
            return qt0.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = qt0.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
