package com.google.android.gms.cast.framework.media;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.l;

public interface w extends IInterface {

    public static abstract class a extends m90 implements w {
        public a() {
            super("com.google.android.gms.cast.framework.media.IImagePicker");
        }

        /* access modifiers changed from: protected */
        public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
            k80 k80;
            if (i != 1) {
                if (i == 2) {
                    w80 V = V();
                    parcel2.writeNoException();
                    cb0.c(parcel2, V);
                } else if (i == 3) {
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                } else if (i != 4) {
                    return false;
                } else {
                    k80 = g2((l) cb0.b(parcel, l.CREATOR), (b) cb0.b(parcel, b.CREATOR));
                }
                return true;
            }
            k80 = a2((l) cb0.b(parcel, l.CREATOR), parcel.readInt());
            parcel2.writeNoException();
            cb0.f(parcel2, k80);
            return true;
        }
    }

    w80 V();

    int a();

    k80 a2(l lVar, int i);

    k80 g2(l lVar, b bVar);
}
