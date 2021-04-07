package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.m0;
import defpackage.tt;
import defpackage.vt;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class s implements ht {
    private static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    private final String a;
    private final s50 b;
    private final i50 c = new i50();
    private jt d;
    private byte[] e = new byte[1024];
    private int f;

    public s(String str, s50 s50) {
        this.a = str;
        this.b = s50;
    }

    @RequiresNonNull({"output"})
    private vt b(long j) {
        vt a2 = this.d.a(0, 3);
        a2.d(f0.E((String) null, "text/vtt", (String) null, -1, 0, this.a, (ns) null, j));
        this.d.p();
        return a2;
    }

    @RequiresNonNull({"output"})
    private void c() {
        i50 i50 = new i50(this.e);
        z30.e(i50);
        long j = 0;
        long j2 = 0;
        for (String m = i50.m(); !TextUtils.isEmpty(m); m = i50.m()) {
            if (m.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = g.matcher(m);
                if (!matcher.find()) {
                    String valueOf = String.valueOf(m);
                    throw new m0(valueOf.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(valueOf) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                }
                Matcher matcher2 = h.matcher(m);
                if (!matcher2.find()) {
                    String valueOf2 = String.valueOf(m);
                    throw new m0(valueOf2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(valueOf2) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                } else {
                    j2 = z30.d(matcher.group(1));
                    j = s50.f(Long.parseLong(matcher2.group(1)));
                }
            }
        }
        Matcher a2 = z30.a(i50);
        if (a2 == null) {
            b(0);
            return;
        }
        long d2 = z30.d(a2.group(1));
        long b2 = this.b.b(s50.i((j + d2) - j2));
        vt b3 = b(b2 - d2);
        this.c.K(this.e, this.f);
        b3.b(this.c, this.f);
        b3.c(b2, 1, this.f, 0, (vt.a) null);
    }

    public void a() {
    }

    public boolean d(it itVar) {
        itVar.c(this.e, 0, 6, false);
        this.c.K(this.e, 6);
        if (z30.b(this.c)) {
            return true;
        }
        itVar.c(this.e, 6, 3, false);
        this.c.K(this.e, 9);
        return z30.b(this.c);
    }

    public int f(it itVar, st stVar) {
        q40.e(this.d);
        int g2 = (int) itVar.g();
        int i = this.f;
        byte[] bArr = this.e;
        if (i == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((g2 != -1 ? g2 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i2 = this.f;
        int a2 = itVar.a(bArr2, i2, bArr2.length - i2);
        if (a2 != -1) {
            int i3 = this.f + a2;
            this.f = i3;
            if (g2 == -1 || i3 != g2) {
                return 0;
            }
        }
        c();
        return -1;
    }

    public void g(jt jtVar) {
        this.d = jtVar;
        jtVar.f(new tt.b(-9223372036854775807L));
    }

    public void h(long j, long j2) {
        throw new IllegalStateException();
    }
}
