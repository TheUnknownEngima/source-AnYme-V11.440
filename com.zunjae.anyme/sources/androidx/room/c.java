package androidx.room;

import android.content.Context;
import androidx.room.l;
import defpackage.n6;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class c {
    public final n6.c a;
    public final Context b;
    public final String c;
    public final l.d d;
    public final List<l.b> e;
    public final boolean f;
    public final l.c g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    private final Set<Integer> m;

    public c(Context context, String str, n6.c cVar, l.d dVar, List<l.b> list, boolean z, l.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = list;
        this.f = z;
        this.g = cVar2;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = set;
    }

    public boolean a(int i2, int i3) {
        Set<Integer> set;
        return (!(i2 > i3) || !this.l) && this.k && ((set = this.m) == null || !set.contains(Integer.valueOf(i2)));
    }
}
