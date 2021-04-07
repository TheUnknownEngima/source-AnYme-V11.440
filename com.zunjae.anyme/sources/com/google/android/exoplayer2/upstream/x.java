package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class x implements i {
    private final i a;
    private long b;
    private Uri c = Uri.EMPTY;
    private Map<String, List<String>> d = Collections.emptyMap();

    public x(i iVar) {
        q40.e(iVar);
        this.a = iVar;
    }

    public int a(byte[] bArr, int i, int i2) {
        int a2 = this.a.a(bArr, i, i2);
        if (a2 != -1) {
            this.b += (long) a2;
        }
        return a2;
    }

    public void b(y yVar) {
        this.a.b(yVar);
    }

    public long c(l lVar) {
        this.c = lVar.a;
        this.d = Collections.emptyMap();
        long c2 = this.a.c(lVar);
        Uri e = e();
        q40.e(e);
        this.c = e;
        this.d = d();
        return c2;
    }

    public void close() {
        this.a.close();
    }

    public Map<String, List<String>> d() {
        return this.a.d();
    }

    public Uri e() {
        return this.a.e();
    }

    public long f() {
        return this.b;
    }

    public Uri g() {
        return this.c;
    }

    public Map<String, List<String>> h() {
        return this.d;
    }

    public void i() {
        this.b = 0;
    }
}
