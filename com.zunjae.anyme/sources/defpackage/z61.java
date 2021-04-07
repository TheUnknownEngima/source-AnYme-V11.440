package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* renamed from: z61  reason: default package */
public interface z61 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(a71 a71);

    void getAppInstanceId(a71 a71);

    void getCachedAppInstanceId(a71 a71);

    void getConditionalUserProperties(String str, String str2, a71 a71);

    void getCurrentScreenClass(a71 a71);

    void getCurrentScreenName(a71 a71);

    void getGmpAppId(a71 a71);

    void getMaxUserProperties(String str, a71 a71);

    void getTestFlag(a71 a71, int i);

    void getUserProperties(String str, String str2, boolean z, a71 a71);

    void initForTests(Map map);

    void initialize(w80 w80, sq0 sq0, long j);

    void isDataCollectionEnabled(a71 a71);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, a71 a71, long j);

    void logHealthData(int i, String str, w80 w80, w80 w802, w80 w803);

    void onActivityCreated(w80 w80, Bundle bundle, long j);

    void onActivityDestroyed(w80 w80, long j);

    void onActivityPaused(w80 w80, long j);

    void onActivityResumed(w80 w80, long j);

    void onActivitySaveInstanceState(w80 w80, a71 a71, long j);

    void onActivityStarted(w80 w80, long j);

    void onActivityStopped(w80 w80, long j);

    void performAction(Bundle bundle, a71 a71, long j);

    void registerOnMeasurementEventListener(pq0 pq0);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setCurrentScreen(w80 w80, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(pq0 pq0);

    void setInstanceIdProvider(qq0 qq0);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, w80 w80, boolean z, long j);

    void unregisterOnMeasurementEventListener(pq0 pq0);
}
