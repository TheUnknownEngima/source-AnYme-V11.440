package com.google.android.exoplayer2.ui;

public interface g {

    public interface a {
        void a(g gVar, long j);

        void b(g gVar, long j, boolean z);

        void g(g gVar, long j);
    }

    void a(long[] jArr, boolean[] zArr, int i);

    void b(a aVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
