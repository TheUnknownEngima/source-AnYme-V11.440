package androidx.room;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

class q implements n6 {
    private final Context a;
    private final String b;
    private final File c;
    private final int d;
    private final n6 e;
    private c f;
    private boolean g;

    q(Context context, String str, File file, int i, n6 n6Var) {
        this.a = context;
        this.b = str;
        this.c = file;
        this.d = i;
        this.e = n6Var;
    }

    private void d(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.b != null) {
            readableByteChannel = Channels.newChannel(this.a.getAssets().open(this.b));
        } else if (this.c != null) {
            readableByteChannel = new FileInputStream(this.c).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.a.getCacheDir());
        createTempFile.deleteOnExit();
        i6.a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (!createTempFile.renameTo(file)) {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    private void f() {
        String c2 = c();
        File databasePath = this.a.getDatabasePath(c2);
        c cVar = this.f;
        f6 f6Var = new f6(c2, this.a.getFilesDir(), cVar == null || cVar.j);
        try {
            f6Var.b();
            if (!databasePath.exists()) {
                d(databasePath);
                f6Var.c();
            } else if (this.f == null) {
                f6Var.c();
            } else {
                try {
                    int c3 = h6.c(databasePath);
                    if (c3 == this.d) {
                        f6Var.c();
                    } else if (this.f.a(c3, this.d)) {
                        f6Var.c();
                    } else {
                        if (this.a.deleteDatabase(c2)) {
                            try {
                                d(databasePath);
                            } catch (IOException unused) {
                            }
                        } else {
                            "Failed to delete database file (" + c2 + ") for a copy destructive migration.";
                        }
                        f6Var.c();
                    }
                } catch (IOException unused2) {
                    f6Var.c();
                }
            }
        } catch (IOException e2) {
            throw new RuntimeException("Unable to copy database file.", e2);
        } catch (Throwable th) {
            f6Var.c();
            throw th;
        }
    }

    public void a(boolean z) {
        this.e.a(z);
    }

    public synchronized m6 b() {
        if (!this.g) {
            f();
            this.g = true;
        }
        return this.e.b();
    }

    public String c() {
        return this.e.c();
    }

    /* access modifiers changed from: package-private */
    public void e(c cVar) {
        this.f = cVar;
    }
}
