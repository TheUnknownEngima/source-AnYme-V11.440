package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.offline.f;
import com.google.android.exoplayer2.offline.h;
import com.google.android.exoplayer2.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: h10  reason: default package */
public class h10 implements f<h10> {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final s10 i;
    public final Uri j;
    public final m10 k;
    private final List<l10> l;

    public h10(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, m10 m10, s10 s10, Uri uri, List<l10> list) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = z;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.k = m10;
        this.i = s10;
        this.j = uri;
        this.l = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<g10> c(List<g10> list, LinkedList<h> linkedList) {
        h poll = linkedList.poll();
        int i2 = poll.e;
        ArrayList<g10> arrayList = new ArrayList<>();
        do {
            int i3 = poll.f;
            g10 g10 = list.get(i3);
            List<o10> list2 = g10.c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.g));
                poll = linkedList.poll();
                if (!(poll.e == i2 && poll.f == i3)) {
                    arrayList.add(new g10(g10.a, g10.b, arrayList2, g10.d, g10.e, g10.f));
                }
                arrayList2.add(list2.get(poll.g));
                poll = linkedList.poll();
                break;
            } while (poll.f == i3);
            arrayList.add(new g10(g10.a, g10.b, arrayList2, g10.d, g10.e, g10.f));
        } while (poll.e == i2);
        linkedList.addFirst(poll);
        return arrayList;
    }

    /* renamed from: b */
    public final h10 a(List<h> list) {
        long j2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new h(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i2 >= e()) {
                break;
            }
            if (((h) linkedList.peek()).e != i2) {
                long f2 = f(i2);
                if (f2 != -9223372036854775807L) {
                    j3 += f2;
                }
            } else {
                l10 d2 = d(i2);
                arrayList.add(new l10(d2.a, d2.b - j3, c(d2.c, linkedList), d2.d));
            }
            i2++;
        }
        long j4 = this.b;
        if (j4 != -9223372036854775807L) {
            j2 = j4 - j3;
        }
        return new h10(this.a, j2, this.c, this.d, this.e, this.f, this.g, this.h, this.k, this.i, this.j, arrayList);
    }

    public final l10 d(int i2) {
        return this.l.get(i2);
    }

    public final int e() {
        return this.l.size();
    }

    public final long f(int i2) {
        if (i2 != this.l.size() - 1) {
            return this.l.get(i2 + 1).b - this.l.get(i2).b;
        }
        long j2 = this.b;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 - this.l.get(i2).b;
    }

    public final long g(int i2) {
        return v.a(f(i2));
    }
}
