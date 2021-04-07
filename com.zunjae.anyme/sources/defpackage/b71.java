package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

/* renamed from: b71  reason: default package */
public final class b71 extends nq0 implements z61 {
    b71(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeLong(j);
        r3(23, p3);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        ir0.c(p3, bundle);
        r3(9, p3);
    }

    public final void clearMeasurementEnabled(long j) {
        Parcel p3 = p3();
        p3.writeLong(j);
        r3(43, p3);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeLong(j);
        r3(24, p3);
    }

    public final void generateEventId(a71 a71) {
        Parcel p3 = p3();
        ir0.b(p3, a71);
        r3(22, p3);
    }

    public final void getAppInstanceId(a71 a71) {
        Parcel p3 = p3();
        ir0.b(p3, a71);
        r3(20, p3);
    }

    public final void getCachedAppInstanceId(a71 a71) {
        Parcel p3 = p3();
        ir0.b(p3, a71);
        r3(19, p3);
    }

    public final void getConditionalUserProperties(String str, String str2, a71 a71) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        ir0.b(p3, a71);
        r3(10, p3);
    }

    public final void getCurrentScreenClass(a71 a71) {
        Parcel p3 = p3();
        ir0.b(p3, a71);
        r3(17, p3);
    }

    public final void getCurrentScreenName(a71 a71) {
        Parcel p3 = p3();
        ir0.b(p3, a71);
        r3(16, p3);
    }

    public final void getGmpAppId(a71 a71) {
        Parcel p3 = p3();
        ir0.b(p3, a71);
        r3(21, p3);
    }

    public final void getMaxUserProperties(String str, a71 a71) {
        Parcel p3 = p3();
        p3.writeString(str);
        ir0.b(p3, a71);
        r3(6, p3);
    }

    public final void getTestFlag(a71 a71, int i) {
        Parcel p3 = p3();
        ir0.b(p3, a71);
        p3.writeInt(i);
        r3(38, p3);
    }

    public final void getUserProperties(String str, String str2, boolean z, a71 a71) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        ir0.d(p3, z);
        ir0.b(p3, a71);
        r3(5, p3);
    }

    public final void initForTests(Map map) {
        Parcel p3 = p3();
        p3.writeMap(map);
        r3(37, p3);
    }

    public final void initialize(w80 w80, sq0 sq0, long j) {
        Parcel p3 = p3();
        ir0.b(p3, w80);
        ir0.c(p3, sq0);
        p3.writeLong(j);
        r3(1, p3);
    }

    public final void isDataCollectionEnabled(a71 a71) {
        Parcel p3 = p3();
        ir0.b(p3, a71);
        r3(40, p3);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        ir0.c(p3, bundle);
        ir0.d(p3, z);
        ir0.d(p3, z2);
        p3.writeLong(j);
        r3(2, p3);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, a71 a71, long j) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        ir0.c(p3, bundle);
        ir0.b(p3, a71);
        p3.writeLong(j);
        r3(3, p3);
    }

    public final void logHealthData(int i, String str, w80 w80, w80 w802, w80 w803) {
        Parcel p3 = p3();
        p3.writeInt(i);
        p3.writeString(str);
        ir0.b(p3, w80);
        ir0.b(p3, w802);
        ir0.b(p3, w803);
        r3(33, p3);
    }

    public final void onActivityCreated(w80 w80, Bundle bundle, long j) {
        Parcel p3 = p3();
        ir0.b(p3, w80);
        ir0.c(p3, bundle);
        p3.writeLong(j);
        r3(27, p3);
    }

    public final void onActivityDestroyed(w80 w80, long j) {
        Parcel p3 = p3();
        ir0.b(p3, w80);
        p3.writeLong(j);
        r3(28, p3);
    }

    public final void onActivityPaused(w80 w80, long j) {
        Parcel p3 = p3();
        ir0.b(p3, w80);
        p3.writeLong(j);
        r3(29, p3);
    }

    public final void onActivityResumed(w80 w80, long j) {
        Parcel p3 = p3();
        ir0.b(p3, w80);
        p3.writeLong(j);
        r3(30, p3);
    }

    public final void onActivitySaveInstanceState(w80 w80, a71 a71, long j) {
        Parcel p3 = p3();
        ir0.b(p3, w80);
        ir0.b(p3, a71);
        p3.writeLong(j);
        r3(31, p3);
    }

    public final void onActivityStarted(w80 w80, long j) {
        Parcel p3 = p3();
        ir0.b(p3, w80);
        p3.writeLong(j);
        r3(25, p3);
    }

    public final void onActivityStopped(w80 w80, long j) {
        Parcel p3 = p3();
        ir0.b(p3, w80);
        p3.writeLong(j);
        r3(26, p3);
    }

    public final void performAction(Bundle bundle, a71 a71, long j) {
        Parcel p3 = p3();
        ir0.c(p3, bundle);
        ir0.b(p3, a71);
        p3.writeLong(j);
        r3(32, p3);
    }

    public final void registerOnMeasurementEventListener(pq0 pq0) {
        Parcel p3 = p3();
        ir0.b(p3, pq0);
        r3(35, p3);
    }

    public final void resetAnalyticsData(long j) {
        Parcel p3 = p3();
        p3.writeLong(j);
        r3(12, p3);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel p3 = p3();
        ir0.c(p3, bundle);
        p3.writeLong(j);
        r3(8, p3);
    }

    public final void setConsent(Bundle bundle, long j) {
        Parcel p3 = p3();
        ir0.c(p3, bundle);
        p3.writeLong(j);
        r3(44, p3);
    }

    public final void setCurrentScreen(w80 w80, String str, String str2, long j) {
        Parcel p3 = p3();
        ir0.b(p3, w80);
        p3.writeString(str);
        p3.writeString(str2);
        p3.writeLong(j);
        r3(15, p3);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel p3 = p3();
        ir0.d(p3, z);
        r3(39, p3);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel p3 = p3();
        ir0.c(p3, bundle);
        r3(42, p3);
    }

    public final void setEventInterceptor(pq0 pq0) {
        Parcel p3 = p3();
        ir0.b(p3, pq0);
        r3(34, p3);
    }

    public final void setInstanceIdProvider(qq0 qq0) {
        Parcel p3 = p3();
        ir0.b(p3, qq0);
        r3(18, p3);
    }

    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel p3 = p3();
        ir0.d(p3, z);
        p3.writeLong(j);
        r3(11, p3);
    }

    public final void setMinimumSessionDuration(long j) {
        Parcel p3 = p3();
        p3.writeLong(j);
        r3(13, p3);
    }

    public final void setSessionTimeoutDuration(long j) {
        Parcel p3 = p3();
        p3.writeLong(j);
        r3(14, p3);
    }

    public final void setUserId(String str, long j) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeLong(j);
        r3(7, p3);
    }

    public final void setUserProperty(String str, String str2, w80 w80, boolean z, long j) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        ir0.b(p3, w80);
        ir0.d(p3, z);
        p3.writeLong(j);
        r3(4, p3);
    }

    public final void unregisterOnMeasurementEventListener(pq0 pq0) {
        Parcel p3 = p3();
        ir0.b(p3, pq0);
        r3(36, p3);
    }
}
