package defpackage;

import android.text.TextUtils;
import defpackage.gb;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ca  reason: default package */
public class ca implements y9<gb, String> {
    private JSONObject e(gb gbVar) {
        if (gbVar.a() != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", gbVar.a().a());
                return jSONObject;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public gb a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("uid");
            String string = jSONObject.getString("title");
            String string2 = jSONObject.getString("text");
            long j = jSONObject.getLong("sessionId");
            String optString2 = jSONObject.optString("type");
            if (optString2 == null) {
                optString2 = jSONObject.optString("tag");
            }
            String optString3 = jSONObject.optString("raw");
            JSONObject optJSONObject = jSONObject.optJSONObject("application");
            String string3 = optJSONObject != null ? optJSONObject.getString("key") : null;
            if (string3 != null) {
                gb.b j2 = gb.j();
                j2.i(string);
                j2.g(string2);
                j2.a(j);
                j2.b(new cb(string3));
                j2.k(optString2);
                j2.c(optString3);
                if (!TextUtils.isEmpty(optString)) {
                    j2.d(UUID.fromString(optString));
                }
                return j2.e();
            }
            gb.b j3 = gb.j();
            j3.i(string);
            j3.g(string2);
            j3.a(j);
            j3.k(optString2);
            j3.c(optString3);
            if (!TextUtils.isEmpty(optString)) {
                j3.d(UUID.fromString(optString));
            }
            return j3.e();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public String b(gb gbVar) {
        JSONObject e = e(gbVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", gbVar.i().toString());
            jSONObject.put("title", gbVar.g());
            jSONObject.put("text", gbVar.f());
            jSONObject.put("sessionId", gbVar.e());
            jSONObject.put("application", e);
            jSONObject.putOpt("type", gbVar.h());
            jSONObject.putOpt("raw", gbVar.d());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
