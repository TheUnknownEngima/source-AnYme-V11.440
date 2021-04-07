package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: tx1  reason: default package */
public final class tx1 {
    @SerializedName("anime")
    private List<sx1> a;

    public final List<sx1> a() {
        return this.a;
    }

    public final void b(List<sx1> list) {
        this.a = list;
    }
}
