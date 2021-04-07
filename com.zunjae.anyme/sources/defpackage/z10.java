package defpackage;

import com.google.android.exoplayer2.offline.f;
import java.util.Collections;
import java.util.List;

/* renamed from: z10  reason: default package */
public abstract class z10 implements f<z10> {
    public final String a;
    public final List<String> b;
    public final boolean c;

    protected z10(String str, List<String> list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
