package defpackage;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: cy1  reason: default package */
public final class cy1 {
    @SerializedName("AccountCreated")
    private final long a;
    @SerializedName("NotesWritten")
    private final int b;
    @SerializedName("WaifusAdded")
    private final int c;
    @SerializedName("BookmarksCreated")
    private final int d;

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    @SuppressLint({"SimpleDateFormat"})
    public final String d() {
        String format = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date(this.a * ((long) 1000)));
        v62.d(format, "df.format(date)");
        return format;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy1)) {
            return false;
        }
        cy1 cy1 = (cy1) obj;
        return this.a == cy1.a && this.b == cy1.b && this.c == cy1.c && this.d == cy1.d;
    }

    public int hashCode() {
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "KanonUserStats(accountCreated=" + this.a + ", notesWritten=" + this.b + ", waifusAdded=" + this.c + ", bookmarksCreated=" + this.d + ")";
    }
}
