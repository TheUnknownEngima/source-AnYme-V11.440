package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qe1  reason: default package */
class qe1 {
    private final Context a;
    private final a b;

    /* renamed from: qe1$a */
    interface a {
        String a(File file);
    }

    qe1(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    private File b(File file) {
        if (Build.VERSION.SDK_INT < 9 || !file.getAbsolutePath().startsWith("/data")) {
            return file;
        }
        try {
            return new File(this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 0).nativeLibraryDir, file.getName());
        } catch (PackageManager.NameNotFoundException e) {
            jb1.f().e("Error getting ApplicationInfo", e);
            return file;
        }
    }

    private static JSONObject c(String str, se1 se1) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", se1.a);
        jSONObject.put("size", se1.b);
        jSONObject.put("name", se1.d);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    private static byte[] d(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes(Charset.forName("UTF-8"));
        } catch (JSONException e) {
            jb1.f().j("Binary images string is null", e);
            return new byte[0];
        }
    }

    private File e(String str) {
        File file = new File(str);
        return !file.exists() ? b(file) : file;
    }

    private static boolean f(se1 se1) {
        return (se1.c.indexOf(120) == -1 || se1.d.indexOf(47) == -1) ? false : true;
    }

    private JSONObject g(String str) {
        se1 a2 = te1.a(str);
        if (a2 != null && f(a2)) {
            try {
                try {
                    return c(this.b.a(e(a2.d)), a2);
                } catch (JSONException e) {
                    jb1.f().c("Could not create a binary image json string", e);
                    return null;
                }
            } catch (IOException e2) {
                jb1 f = jb1.f();
                f.c("Could not generate ID for file " + a2.d, e2);
            }
        }
        return null;
    }

    private JSONArray h(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject g = g(readLine);
            if (g != null) {
                jSONArray.put(g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] a(BufferedReader bufferedReader) {
        return d(h(bufferedReader));
    }
}
