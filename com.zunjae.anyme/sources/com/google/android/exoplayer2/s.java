package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

final class s {
    private final AudioManager a;
    private final a b;
    private b c;
    private br d;
    private int e;
    private int f;
    private float g = 1.0f;
    private AudioFocusRequest h;
    private boolean i;

    private class a implements AudioManager.OnAudioFocusChangeListener {
        private final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        public /* synthetic */ void a(int i) {
            s.this.g(i);
        }

        public void onAudioFocusChange(int i) {
            this.a.post(new b(this, i));
        }
    }

    public interface b {
        void m(float f);

        void o(int i);
    }

    public s(Context context, Handler handler, b bVar) {
        this.a = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.c = bVar;
        this.b = new a(handler);
        this.e = 0;
    }

    private void a() {
        if (this.e != 0) {
            if (v50.a >= 26) {
                c();
            } else {
                b();
            }
            l(0);
        }
    }

    private void b() {
        this.a.abandonAudioFocus(this.b);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            this.a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private void e(int i2) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.o(i2);
        }
    }

    /* access modifiers changed from: private */
    public void g(int i2) {
        int i3;
        if (i2 == -3 || i2 == -2) {
            if (i2 == -2 || o()) {
                e(0);
                i3 = 2;
            } else {
                i3 = 3;
            }
            l(i3);
        } else if (i2 == -1) {
            e(-1);
            a();
        } else if (i2 != 1) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i2);
            b50.h("AudioFocusManager", sb.toString());
        } else {
            l(1);
            e(1);
        }
    }

    private int i() {
        if (this.e == 1) {
            return 1;
        }
        if ((v50.a >= 26 ? k() : j()) == 1) {
            l(1);
            return 1;
        }
        l(0);
        return -1;
    }

    private int j() {
        AudioManager audioManager = this.a;
        a aVar = this.b;
        br brVar = this.d;
        q40.e(brVar);
        return audioManager.requestAudioFocus(aVar, v50.S(brVar.c), this.f);
    }

    private int k() {
        if (this.h == null || this.i) {
            AudioFocusRequest.Builder builder = this.h == null ? new AudioFocusRequest.Builder(this.f) : new AudioFocusRequest.Builder(this.h);
            boolean o = o();
            br brVar = this.d;
            q40.e(brVar);
            this.h = builder.setAudioAttributes(brVar.a()).setWillPauseWhenDucked(o).setOnAudioFocusChangeListener(this.b).build();
            this.i = false;
        }
        return this.a.requestAudioFocus(this.h);
    }

    private void l(int i2) {
        if (this.e != i2) {
            this.e = i2;
            float f2 = i2 == 3 ? 0.2f : 1.0f;
            if (this.g != f2) {
                this.g = f2;
                b bVar = this.c;
                if (bVar != null) {
                    bVar.m(f2);
                }
            }
        }
    }

    private boolean m(int i2) {
        return i2 == 1 || this.f != 1;
    }

    private boolean o() {
        br brVar = this.d;
        return brVar != null && brVar.a == 1;
    }

    public float f() {
        return this.g;
    }

    public void h() {
        this.c = null;
        a();
    }

    public int n(boolean z, int i2) {
        if (m(i2)) {
            a();
            return z ? 1 : -1;
        } else if (z) {
            return i();
        } else {
            return -1;
        }
    }
}
