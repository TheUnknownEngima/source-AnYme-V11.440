package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

final class g {
    private final LinkedHashMap<Uri, byte[]> a;

    class a extends LinkedHashMap<Uri, byte[]> {
        final /* synthetic */ int e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, int i, float f, boolean z, int i2) {
            super(i, f, z);
            this.e = i2;
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.e;
        }
    }

    public g(int i) {
        this.a = new a(this, i + 1, 1.0f, false, i);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        LinkedHashMap<Uri, byte[]> linkedHashMap = this.a;
        q40.e(uri);
        q40.e(bArr);
        return (byte[]) linkedHashMap.put(uri, bArr);
    }

    public byte[] c(Uri uri) {
        LinkedHashMap<Uri, byte[]> linkedHashMap = this.a;
        q40.e(uri);
        return (byte[]) linkedHashMap.remove(uri);
    }
}
