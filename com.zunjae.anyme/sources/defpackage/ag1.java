package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* renamed from: ag1  reason: default package */
public class ag1 {
    private final Context a;

    public ag1(Context context) {
        this.a = context;
    }

    private File a() {
        return new File(new hf1(this.a).b(), "com.crashlytics.settings.json");
    }

    public JSONObject b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        jb1.f().b("Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a2 = a();
            if (a2.exists()) {
                fileInputStream = new FileInputStream(a2);
                try {
                    jSONObject = new JSONObject(dc1.J(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        jb1.f().e("Failed to fetch cached settings", e);
                        dc1.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        dc1.e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                jb1.f().b("No cached settings found.");
                jSONObject = null;
            }
            dc1.e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            jb1.f().e("Failed to fetch cached settings", e);
            dc1.e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            dc1.e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j, JSONObject jSONObject) {
        jb1.f().b("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    dc1.e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        jb1.f().e("Failed to cache settings", e);
                        dc1.e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        dc1.e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    dc1.e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                jb1.f().e("Failed to cache settings", e);
                dc1.e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
