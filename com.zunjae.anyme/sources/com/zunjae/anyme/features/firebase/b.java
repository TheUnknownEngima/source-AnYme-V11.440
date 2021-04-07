package com.zunjae.anyme.features.firebase;

import com.google.firebase.remoteconfig.e;

public enum b {
    CheckLoginCookie("CheckLoginCookie", Boolean.TRUE),
    CheckLoginCookieExpirationDays("CheckLoginCookieExpirationDays", 7),
    MinimumScoreStats("MinimumScoreStats", 7),
    MinimumYearDefaultRecommendations("MinimumYearDefaultRecommendations", 2010);
    
    private final String key;
    private final Object value;

    private b(String str, Object obj) {
        this.key = str;
        this.value = obj;
    }

    public final String getKey() {
        return this.key;
    }

    public final Object getValue() {
        return this.value;
    }

    /* renamed from: int  reason: not valid java name */
    public final int m0int() {
        return (int) e.e().g(this.key);
    }

    public final boolean isTrue() {
        if (this.value instanceof Boolean) {
            return e.e().d(this.key);
        }
        return false;
    }

    public String toString() {
        String h = e.e().h(this.key);
        v62.d(h, "FirebaseRemoteConfig.getInstance().getString(key)");
        return h;
    }
}
