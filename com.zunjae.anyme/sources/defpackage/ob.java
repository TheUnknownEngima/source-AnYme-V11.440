package defpackage;

import defpackage.wb;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ob  reason: default package */
public class ob {
    public static wb a(String str) {
        try {
            wb wbVar = new wb();
            JSONObject jSONObject = new JSONObject(str);
            wbVar.f(jSONObject.getBoolean("logger_enabled"));
            wbVar.d(jSONObject.getBoolean("crashes_enabled"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("latest_sdk_version");
            if (jSONObject2 != null) {
                wbVar.c(new wb.b(jSONObject2.getInt("android"), jSONObject2.getInt("ios")));
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("error");
            if (optJSONObject != null) {
                wbVar.b(new wb.a(optJSONObject.getString("message"), optJSONObject.getInt("code")));
            }
            return wbVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
