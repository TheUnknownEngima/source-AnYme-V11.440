package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import defpackage.xd;
import java.io.IOException;

/* renamed from: fe  reason: default package */
public final class fe implements xd<ParcelFileDescriptor> {
    private final b a;

    /* renamed from: fe$a */
    public static final class a implements xd.a<ParcelFileDescriptor> {
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: c */
        public xd<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new fe(parcelFileDescriptor);
        }
    }

    /* renamed from: fe$b */
    private static final class b {
        private final ParcelFileDescriptor a;

        b(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        /* access modifiers changed from: package-private */
        public ParcelFileDescriptor a() {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public fe(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new b(parcelFileDescriptor);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor a() {
        return this.a.a();
    }
}
