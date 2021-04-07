package defpackage;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: tb  reason: default package */
public class tb {
    public static String a(long j, List<ib> list) {
        try {
            ra.a(list, "logs == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("session_id", j);
            JSONArray jSONArray = new JSONArray();
            for (ib next : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("l", next.e());
                jSONObject2.put("ll", next.d());
                jSONObject2.put("at", next.a());
                jSONObject2.put("x", mb.b().format(next.b()));
                jSONObject2.put("tg", next.g());
                jSONObject2.put("m", next.f());
                jSONObject2.put("f", next.c());
                jSONObject2.put("t", next.h());
                jSONObject2.put("thn", next.j());
                jSONObject2.put("th", next.i());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("logs", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
