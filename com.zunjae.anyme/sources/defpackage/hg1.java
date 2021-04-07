package defpackage;

import java.util.Locale;
import org.json.JSONObject;

/* renamed from: hg1  reason: default package */
class hg1 implements gg1 {
    hg1() {
    }

    private static jg1 b(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String string = jSONObject2.getString("status");
        boolean equals = "new".equals(string);
        String string2 = jSONObject.getString("bundle_id");
        String string3 = jSONObject.getString("org_id");
        if (equals) {
            str = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
        } else {
            str = String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", new Object[]{string2});
        }
        return new jg1(string, str, String.format(Locale.US, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", new Object[]{string2}), String.format(Locale.US, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", new Object[]{string2}), string2, string3, jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    private static kg1 c(JSONObject jSONObject) {
        return new kg1(jSONObject.optBoolean("collect_reports", true));
    }

    private static lg1 d() {
        return new lg1(8, 4);
    }

    private static long e(nc1 nc1, long j, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : nc1.a() + (j * 1000);
    }

    public ng1 a(nc1 nc1, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new ng1(e(nc1, (long) optInt2, jSONObject), b(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject("app")), d(), c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
