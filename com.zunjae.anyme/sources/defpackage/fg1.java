package defpackage;

import org.json.JSONObject;

/* renamed from: fg1  reason: default package */
public class fg1 {
    private final nc1 a;

    fg1(nc1 nc1) {
        this.a = nc1;
    }

    private static gg1 a(int i) {
        return i != 3 ? new bg1() : new hg1();
    }

    public ng1 b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}
