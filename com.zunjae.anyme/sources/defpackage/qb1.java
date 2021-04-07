package defpackage;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qb1  reason: default package */
public class qb1 implements ob1, ub1 {
    private tb1 a;

    private static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public void J(String str, Bundle bundle) {
        tb1 tb1 = this.a;
        if (tb1 != null) {
            try {
                tb1.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                jb1.f().i("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    public void a(tb1 tb1) {
        this.a = tb1;
        jb1.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
