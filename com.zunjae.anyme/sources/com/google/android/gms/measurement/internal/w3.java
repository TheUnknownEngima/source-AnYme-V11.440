package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class w3 extends nq0 implements u3 {
    w3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final List<ea> E1(String str, String str2, boolean z, la laVar) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        ir0.d(p3, z);
        ir0.c(p3, laVar);
        Parcel q3 = q3(14, p3);
        ArrayList<ea> createTypedArrayList = q3.createTypedArrayList(ea.CREATOR);
        q3.recycle();
        return createTypedArrayList;
    }

    public final List<ea> F1(la laVar, boolean z) {
        Parcel p3 = p3();
        ir0.c(p3, laVar);
        ir0.d(p3, z);
        Parcel q3 = q3(7, p3);
        ArrayList<ea> createTypedArrayList = q3.createTypedArrayList(ea.CREATOR);
        q3.recycle();
        return createTypedArrayList;
    }

    public final void F2(Bundle bundle, la laVar) {
        Parcel p3 = p3();
        ir0.c(p3, bundle);
        ir0.c(p3, laVar);
        r3(19, p3);
    }

    public final void H1(la laVar) {
        Parcel p3 = p3();
        ir0.c(p3, laVar);
        r3(4, p3);
    }

    public final void M(ua uaVar, la laVar) {
        Parcel p3 = p3();
        ir0.c(p3, uaVar);
        ir0.c(p3, laVar);
        r3(12, p3);
    }

    public final String N0(la laVar) {
        Parcel p3 = p3();
        ir0.c(p3, laVar);
        Parcel q3 = q3(11, p3);
        String readString = q3.readString();
        q3.recycle();
        return readString;
    }

    public final void T(la laVar) {
        Parcel p3 = p3();
        ir0.c(p3, laVar);
        r3(20, p3);
    }

    public final void W1(ua uaVar) {
        Parcel p3 = p3();
        ir0.c(p3, uaVar);
        r3(13, p3);
    }

    public final void a3(s sVar, String str, String str2) {
        Parcel p3 = p3();
        ir0.c(p3, sVar);
        p3.writeString(str);
        p3.writeString(str2);
        r3(5, p3);
    }

    public final void e2(la laVar) {
        Parcel p3 = p3();
        ir0.c(p3, laVar);
        r3(6, p3);
    }

    public final void j1(long j, String str, String str2, String str3) {
        Parcel p3 = p3();
        p3.writeLong(j);
        p3.writeString(str);
        p3.writeString(str2);
        p3.writeString(str3);
        r3(10, p3);
    }

    public final byte[] j2(s sVar, String str) {
        Parcel p3 = p3();
        ir0.c(p3, sVar);
        p3.writeString(str);
        Parcel q3 = q3(9, p3);
        byte[] createByteArray = q3.createByteArray();
        q3.recycle();
        return createByteArray;
    }

    public final void k2(s sVar, la laVar) {
        Parcel p3 = p3();
        ir0.c(p3, sVar);
        ir0.c(p3, laVar);
        r3(1, p3);
    }

    public final void n0(ea eaVar, la laVar) {
        Parcel p3 = p3();
        ir0.c(p3, eaVar);
        ir0.c(p3, laVar);
        r3(2, p3);
    }

    public final void n1(la laVar) {
        Parcel p3 = p3();
        ir0.c(p3, laVar);
        r3(18, p3);
    }

    public final List<ua> o1(String str, String str2, String str3) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        p3.writeString(str3);
        Parcel q3 = q3(17, p3);
        ArrayList<ua> createTypedArrayList = q3.createTypedArrayList(ua.CREATOR);
        q3.recycle();
        return createTypedArrayList;
    }

    public final List<ua> p1(String str, String str2, la laVar) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        ir0.c(p3, laVar);
        Parcel q3 = q3(16, p3);
        ArrayList<ua> createTypedArrayList = q3.createTypedArrayList(ua.CREATOR);
        q3.recycle();
        return createTypedArrayList;
    }

    public final List<ea> v0(String str, String str2, String str3, boolean z) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        p3.writeString(str3);
        ir0.d(p3, z);
        Parcel q3 = q3(15, p3);
        ArrayList<ea> createTypedArrayList = q3.createTypedArrayList(ea.CREATOR);
        q3.recycle();
        return createTypedArrayList;
    }
}
