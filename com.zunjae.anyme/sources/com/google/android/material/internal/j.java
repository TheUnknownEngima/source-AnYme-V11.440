package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;

public class j {
    private final TextPaint a = new TextPaint(1);
    private final fa1 b = new a();
    private float c;
    /* access modifiers changed from: private */
    public boolean d = true;
    /* access modifiers changed from: private */
    public WeakReference<b> e = new WeakReference<>((Object) null);
    private da1 f;

    class a extends fa1 {
        a() {
        }

        public void a(int i) {
            boolean unused = j.this.d = true;
            b bVar = (b) j.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void b(Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = j.this.d = true;
                b bVar = (b) j.this.e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public j(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        return charSequence == null ? Utils.FLOAT_EPSILON : this.a.measureText(charSequence, 0, charSequence.length());
    }

    public da1 d() {
        return this.f;
    }

    public TextPaint e() {
        return this.a;
    }

    public float f(String str) {
        if (!this.d) {
            return this.c;
        }
        float c2 = c(str);
        this.c = c2;
        this.d = false;
        return c2;
    }

    public void g(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void h(da1 da1, Context context) {
        if (this.f != da1) {
            this.f = da1;
            if (da1 != null) {
                da1.j(context, this.a, this.b);
                b bVar = (b) this.e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                da1.i(context, this.a, this.b);
                this.d = true;
            }
            b bVar2 = (b) this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.d = z;
    }

    public void j(Context context) {
        this.f.i(context, this.a, this.b);
    }
}
