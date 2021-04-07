package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qb  reason: default package */
public class qb {
    public static String a(jb jbVar) {
        String format = mb.b().format(jbVar.n());
        try {
            ra.a(jbVar, "session == null");
            ra.a(jbVar.d(), "session.getDevice() == null");
            ra.a(jbVar.a(), "session.getApplicationVersion() == null");
            ra.a(Float.valueOf(jbVar.c()), "session.getBatteryLevel() == null");
            ra.a(Long.valueOf(jbVar.e()), "session.getFreeRam() == null");
            ra.a(jbVar.n(), "session.getTime() == null");
            ra.a(jbVar.i(), "session.getOsVersion() == null");
            ra.a(jbVar.f(), "session.getLanguage() == null");
            ra.a(jbVar.o(), "session.getTimezone() == null");
            ra.a(Long.valueOf(jbVar.p()), "session.getTotalRam() == null");
            ra.a(Long.valueOf(jbVar.j()), "session.getRamUsed() == null");
            ra.a(Integer.valueOf(jbVar.h()), "session.getOrientation() == null");
            ra.a(jbVar.k(), "session.getSdkType() == null");
            ra.a(jbVar.m(), "session.getSessionIdentifier() == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device", d(jbVar.d()));
            jSONObject.put("app_version", c(jbVar.a()));
            jSONObject.put("battery_level", (double) jbVar.c());
            jSONObject.put("ram_free", jbVar.e());
            jSONObject.put("time", format);
            jSONObject.put("os_version", jbVar.i());
            jSONObject.put("language", jbVar.f());
            jSONObject.put("timezone", jbVar.o());
            jSONObject.put("ram_total", jbVar.p());
            jSONObject.put("ram_used", jbVar.j());
            jSONObject.put("orientation", jbVar.h());
            jSONObject.put("sdk_type", jbVar.k());
            jSONObject.put("session_uid", jbVar.m());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static JSONObject b(cb cbVar) {
        try {
            ra.a(cbVar, "application == null");
            ra.a(cbVar.a(), "application.getKey() == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", cbVar.a());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static JSONObject c(db dbVar) {
        try {
            ra.a(dbVar, "applicationVersion == null");
            ra.a(dbVar.a(), "applicationVersion.getApplication() == null");
            ra.a(dbVar.e(), "applicationVersion.getVersionName() == null");
            ra.a(dbVar.d(), "applicationVersion.getVersionCode() == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app", b(dbVar.a()));
            jSONObject.put("version", dbVar.e());
            jSONObject.put("build", dbVar.d());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static JSONObject d(eb ebVar) {
        try {
            ra.a(ebVar, "device == null");
            ra.a(ebVar.l(), "device.getUdid() == null");
            ra.a(ebVar.e(), "device.getName() == null");
            ra.a(ebVar.c(), "device.getDeviceType() == null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("udid", ebVar.l());
            jSONObject.put("name", ebVar.e());
            jSONObject.put("device_type", ebVar.c());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
