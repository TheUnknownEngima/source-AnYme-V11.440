package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public interface i {

    public interface a {
        i a();
    }

    int a(byte[] bArr, int i, int i2);

    void b(y yVar);

    long c(l lVar);

    void close();

    Map<String, List<String>> d();

    Uri e();
}
