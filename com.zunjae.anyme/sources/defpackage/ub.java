package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ub  reason: default package */
public class ub {
    static JSONObject a(cb cbVar) {
        try {
            ra.a(cbVar, "application == null");
            ra.a(cbVar.a(), "application.getKey()");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", cbVar.a());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
