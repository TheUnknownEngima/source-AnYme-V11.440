package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: nb  reason: default package */
public class nb {
    public static String a(String str, eb ebVar, Map<String, ?> map) {
        try {
            ra.a(str, "applicationToken == null");
            ra.a(ebVar, "device == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_token", str);
            jSONObject.put("device", b(ebVar, map));
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static JSONObject b(eb ebVar, Map<String, ?> map) {
        try {
            ra.a(ebVar, "device == null");
            ra.a(ebVar.l(), "udid == null");
            ra.a(ebVar.e(), "name == null");
            ra.a(ebVar.f(), "osVersion == null");
            ra.a(ebVar.m(), "version == null");
            ra.a(ebVar.b(), "build == null");
            ra.a(ebVar.d(), "language == null");
            ra.a(ebVar.g(), "sdkType == null");
            ra.a(ebVar.i(), "timezone == null");
            ra.a(ebVar.c(), "device_type == null");
            ra.a(ebVar.h(), "sdk_version == null");
            ra.a(Long.valueOf(ebVar.k()), "total_storage_size == null");
            ra.a(Long.valueOf(ebVar.j()), "total_storage_available == null");
            ra.a(Boolean.valueOf(ebVar.n()), "firebase_test_lab == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("udid", ebVar.l());
            jSONObject.put("name", ebVar.e());
            jSONObject.put("os_version", ebVar.f());
            jSONObject.put("version", ebVar.m());
            jSONObject.put("build", ebVar.b());
            jSONObject.put("language", ebVar.d());
            jSONObject.put("sdk_type", ebVar.g());
            jSONObject.put("timezone", ebVar.i());
            jSONObject.put("device_type", ebVar.c());
            jSONObject.put("sdk_version", ebVar.h());
            jSONObject.put("total_storage_size", ebVar.k());
            jSONObject.put("total_storage_available", ebVar.j());
            jSONObject.put("firebase_test_lab", ebVar.n());
            if (!map.isEmpty()) {
                if (map.containsKey("$android_id")) {
                    jSONObject.put("$android_id", map.remove("$android_id"));
                }
                if (map.containsKey("$package_id")) {
                    jSONObject.put("$package_id", map.remove("$package_id"));
                }
                if (!map.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry next : map.entrySet()) {
                        jSONObject2.put((String) next.getKey(), next.getValue());
                    }
                    jSONObject.put("key_values", jSONObject2);
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
