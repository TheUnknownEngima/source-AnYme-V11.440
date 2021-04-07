package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rb  reason: default package */
public class rb {
    public static xb a(String str) {
        try {
            return new xb(new JSONObject(str).getInt("id"));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
