package defpackage;

import org.json.JSONObject;

/* renamed from: bg1  reason: default package */
class bg1 implements gg1 {
    bg1() {
    }

    private static jg1 b(JSONObject jSONObject) {
        return new jg1(jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    private static kg1 c(JSONObject jSONObject) {
        return new kg1(jSONObject.optBoolean("collect_reports", true));
    }

    private static lg1 d(JSONObject jSONObject) {
        return new lg1(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    static mg1 e(nc1 nc1) {
        JSONObject jSONObject = new JSONObject();
        return new ng1(f(nc1, 3600, jSONObject), (jg1) null, d(jSONObject), c(jSONObject), 0, 3600);
    }

    private static long f(nc1 nc1, long j, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : nc1.a() + (j * 1000);
    }

    public ng1 a(nc1 nc1, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new ng1(f(nc1, (long) optInt2, jSONObject), b(jSONObject.getJSONObject("app")), d(jSONObject.getJSONObject("session")), c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
