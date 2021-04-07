package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sb  reason: default package */
public class sb {
    public static String a(String str, String str2, hb<?> hbVar) {
        try {
            ra.a(str, "applicationKey == null");
            ra.a(str2, "deviceId == null");
            ra.a(hbVar, "key == null");
            ra.a(hbVar.a(), "key == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_key", str);
            jSONObject.put("device_id", str2);
            jSONObject.put("key", hbVar.a());
            jSONObject.put("value", hbVar.b());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
