package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f {
    /* access modifiers changed from: private */
    public static final Date e = new Date(0);
    private JSONObject a;
    private JSONObject b;
    private Date c;
    private JSONArray d;

    public static class b {
        private JSONObject a;
        private Date b;
        private JSONArray c;

        private b() {
            this.a = new JSONObject();
            this.b = f.e;
            this.c = new JSONArray();
        }

        public f a() {
            return new f(this.a, this.b, this.c);
        }

        public b b(Map<String, String> map) {
            this.a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.b = date;
            return this;
        }
    }

    private f(JSONObject jSONObject, Date date, JSONArray jSONArray) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs_key", jSONObject);
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("abt_experiments_key", jSONArray);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.a = jSONObject2;
    }

    static f b(JSONObject jSONObject) {
        return new f(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
    }

    public static b f() {
        return new b();
    }

    public JSONArray c() {
        return this.d;
    }

    public JSONObject d() {
        return this.b;
    }

    public Date e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.a.toString().equals(((f) obj).toString());
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
