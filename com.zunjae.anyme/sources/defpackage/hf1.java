package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: hf1  reason: default package */
public class hf1 implements gf1 {
    private final Context a;

    public hf1(Context context) {
        this.a = context;
    }

    public String a() {
        return new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics").getPath();
    }

    public File b() {
        return c(new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics"));
    }

    /* access modifiers changed from: package-private */
    public File c(File file) {
        if (file == null) {
            jb1.f().b("Null File");
            return null;
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            jb1.f().i("Couldn't create file");
            return null;
        }
    }
}
