package defpackage;

import defpackage.ib;
import java.text.ParseException;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ea  reason: default package */
public class ea implements y9<ib, String> {
    /* renamed from: c */
    public ib a(String str) {
        Date date;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("line");
            int i2 = jSONObject.getInt("level");
            long j = jSONObject.getLong("absoluteTime");
            try {
                date = mb.b().parse(jSONObject.optString("date"));
            } catch (ParseException unused) {
                date = null;
            }
            String str2 = "";
            String string = jSONObject.has("tag") ? jSONObject.getString("tag") : str2;
            String string2 = jSONObject.has("method") ? jSONObject.getString("method") : str2;
            String string3 = jSONObject.has("file") ? jSONObject.getString("file") : str2;
            String string4 = jSONObject.has("text") ? jSONObject.getString("text") : str2;
            String string5 = jSONObject.has("thn") ? jSONObject.getString("thn") : str2;
            if (jSONObject.has("th")) {
                str2 = jSONObject.getString("th");
            }
            ib.b bVar = new ib.b();
            bVar.f(i);
            bVar.a(i2);
            bVar.b(j);
            bVar.d(date);
            bVar.h(string);
            bVar.g(string2);
            bVar.c(string3);
            bVar.i(string4);
            bVar.k(string5);
            bVar.j(str2);
            return bVar.e();
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* renamed from: d */
    public String b(ib ibVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("line", ibVar.e());
            jSONObject.put("level", ibVar.d());
            jSONObject.put("absoluteTime", ibVar.a());
            jSONObject.put("date", mb.b().format(ibVar.b()));
            String g = ibVar.g();
            String str = "";
            if (g == null) {
                g = str;
            }
            jSONObject.put("tag", g);
            String f = ibVar.f();
            if (f == null) {
                f = str;
            }
            jSONObject.put("method", f);
            String c = ibVar.c();
            if (c == null) {
                c = str;
            }
            jSONObject.put("file", c);
            String h = ibVar.h();
            if (h == null) {
                h = str;
            }
            jSONObject.put("text", h);
            String j = ibVar.j();
            if (j == null) {
                j = str;
            }
            jSONObject.put("thn", j);
            String i = ibVar.i();
            if (i != null) {
                str = i;
            }
            jSONObject.put("th", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
