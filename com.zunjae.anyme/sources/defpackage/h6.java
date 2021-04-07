package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* renamed from: h6  reason: default package */
public class h6 {
    /* JADX INFO: finally extract failed */
    public static void a(m6 m6Var) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor R = m6Var.R("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (R.moveToNext()) {
            try {
                arrayList.add(R.getString(0));
            } catch (Throwable th) {
                R.close();
                throw th;
            }
        }
        R.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                m6Var.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(l lVar, p6 p6Var, boolean z, CancellationSignal cancellationSignal) {
        Cursor u = lVar.u(p6Var, cancellationSignal);
        if (!z || !(u instanceof AbstractWindowedCursor)) {
            return u;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) u;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? g6.a(abstractWindowedCursor) : u;
    }

    public static int c(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                return allocate.getInt();
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } finally {
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
    }
}
