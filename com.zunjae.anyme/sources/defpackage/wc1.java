package defpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: wc1  reason: default package */
class wc1 {
    private static final Charset b = Charset.forName("UTF-8");
    private final File a;

    public wc1(File file) {
        this.a = file;
    }

    private static ed1 c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        ed1 ed1 = new ed1();
        ed1.e(f(jSONObject, "userId"));
        return ed1;
    }

    private static String d(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String f(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    public File a(String str) {
        File file = this.a;
        return new File(file, str + "keys" + ".meta");
    }

    public File b(String str) {
        File file = this.a;
        return new File(file, str + "user" + ".meta");
    }

    public ed1 e(String str) {
        File b2 = b(str);
        if (!b2.exists()) {
            return new ed1();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(b2);
            try {
                ed1 c = c(dc1.J(fileInputStream2));
                dc1.e(fileInputStream2, "Failed to close user metadata file.");
                return c;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    jb1.f().e("Error deserializing user metadata.", e);
                    dc1.e(fileInputStream, "Failed to close user metadata file.");
                    return new ed1();
                } catch (Throwable th) {
                    th = th;
                    dc1.e(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                dc1.e(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            jb1.f().e("Error deserializing user metadata.", e);
            dc1.e(fileInputStream, "Failed to close user metadata file.");
            return new ed1();
        }
    }

    public void g(String str, Map<String, String> map) {
        File a2 = a(str);
        BufferedWriter bufferedWriter = null;
        try {
            String d = d(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a2), b));
            try {
                bufferedWriter2.write(d);
                bufferedWriter2.flush();
                dc1.e(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    jb1.f().e("Error serializing key/value metadata.", e);
                    dc1.e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    dc1.e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                dc1.e(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            jb1.f().e("Error serializing key/value metadata.", e);
            dc1.e(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }
}
