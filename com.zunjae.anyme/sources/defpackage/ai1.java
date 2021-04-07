package defpackage;

import com.google.firebase.c;
import defpackage.bi1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ai1  reason: default package */
public class ai1 {
    private final File a;
    private final c b;

    /* renamed from: ai1$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public ai1(c cVar) {
        File filesDir = cVar.g().getFilesDir();
        this.a = new File(filesDir, "PersistedInstallation." + cVar.k() + ".json");
        this.b = cVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject b() {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x002d }
            java.io.File r4 = r6.a     // Catch:{ IOException | JSONException -> 0x002d }
            r3.<init>(r4)     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x0010:
            r4 = 0
            int r5 = r3.read(r2, r4, r1)     // Catch:{ all -> 0x0028 }
            if (r5 >= 0) goto L_0x0024
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r0)     // Catch:{ all -> 0x0028 }
            r3.close()     // Catch:{ IOException | JSONException -> 0x002d }
            return r1
        L_0x0024:
            r0.write(r2, r4, r5)     // Catch:{ all -> 0x0028 }
            goto L_0x0010
        L_0x0028:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x002d:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai1.b():org.json.JSONObject");
    }

    public bi1 a(bi1 bi1) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bi1.d());
            jSONObject.put("Status", bi1.g().ordinal());
            jSONObject.put("AuthToken", bi1.b());
            jSONObject.put("RefreshToken", bi1.f());
            jSONObject.put("TokenCreationEpochInSecs", bi1.h());
            jSONObject.put("ExpiresInSecs", bi1.c());
            jSONObject.put("FisError", bi1.e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.g().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.a)) {
                return bi1;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    public bi1 c() {
        JSONObject b2 = b();
        String optString = b2.optString("Fid", (String) null);
        int optInt = b2.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b2.optString("AuthToken", (String) null);
        String optString3 = b2.optString("RefreshToken", (String) null);
        long optLong = b2.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = b2.optLong("ExpiresInSecs", 0);
        String optString4 = b2.optString("FisError", (String) null);
        bi1.a a2 = bi1.a();
        a2.d(optString);
        a2.g(a.values()[optInt]);
        a2.b(optString2);
        a2.f(optString3);
        a2.h(optLong);
        a2.c(optLong2);
        a2.e(optString4);
        return a2.a();
    }
}
