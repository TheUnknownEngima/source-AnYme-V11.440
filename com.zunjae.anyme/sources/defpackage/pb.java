package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pb  reason: default package */
public class pb {
    public static String a(gb gbVar) {
        try {
            ra.a(gbVar, "Issue == null");
            ra.a(gbVar.a(), "Application == null");
            ra.a(gbVar.e(), "sessionId == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("uid", gbVar.i() != null ? gbVar.i().toString() : null);
            jSONObject.put("title", gbVar.g());
            jSONObject.put("text", gbVar.f());
            jSONObject.put("session_id", gbVar.e());
            jSONObject.put("app", ub.a(gbVar.a()));
            jSONObject.putOpt("type", gbVar.h());
            jSONObject.putOpt("raw", gbVar.d());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
