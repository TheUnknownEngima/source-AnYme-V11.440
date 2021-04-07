package com.google.android.exoplayer2.ui.spherical;

import android.opengl.GLES20;
import com.github.mikephil.charting.utils.Utils;
import defpackage.a60;
import java.nio.FloatBuffer;

final class e {
    private static final String[] j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};
    private static final String[] k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};
    private static final float[] l = {1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, -1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, 1.0f};
    private static final float[] m = {1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, -0.5f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0.5f, 1.0f};
    private static final float[] n = {1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, -0.5f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, 1.0f};
    private static final float[] o = {0.5f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, -1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, 1.0f};
    private static final float[] p = {0.5f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, -1.0f, Utils.FLOAT_EPSILON, 0.5f, 1.0f, 1.0f};
    private int a;
    private a b;
    private a c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    private static class a {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final FloatBuffer b;
        /* access modifiers changed from: private */
        public final FloatBuffer c;
        /* access modifiers changed from: private */
        public final int d;

        public a(a60.b bVar) {
            this.a = bVar.a();
            this.b = z40.f(bVar.c);
            this.c = z40.f(bVar.d);
            int i = bVar.b;
            this.d = i != 1 ? i != 2 ? 4 : 6 : 5;
        }
    }

    e() {
    }

    public static boolean c(a60 a60) {
        a60.a aVar = a60.a;
        a60.a aVar2 = a60.b;
        return aVar.b() == 1 && aVar.a(0).a == 0 && aVar2.b() == 1 && aVar2.a(0).a == 0;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, float[] fArr, boolean z) {
        a aVar = z ? this.c : this.b;
        if (aVar != null) {
            GLES20.glUseProgram(this.d);
            z40.b();
            GLES20.glEnableVertexAttribArray(this.g);
            GLES20.glEnableVertexAttribArray(this.h);
            z40.b();
            int i3 = this.a;
            GLES20.glUniformMatrix3fv(this.f, 1, false, i3 == 1 ? z ? n : m : i3 == 2 ? z ? p : o : l, 0);
            GLES20.glUniformMatrix4fv(this.e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i2);
            GLES20.glUniform1i(this.i, 0);
            z40.b();
            GLES20.glVertexAttribPointer(this.g, 3, 5126, false, 12, aVar.b);
            z40.b();
            GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 8, aVar.c);
            z40.b();
            GLES20.glDrawArrays(aVar.d, 0, aVar.a);
            z40.b();
            GLES20.glDisableVertexAttribArray(this.g);
            GLES20.glDisableVertexAttribArray(this.h);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int d2 = z40.d(j, k);
        this.d = d2;
        this.e = GLES20.glGetUniformLocation(d2, "uMvpMatrix");
        this.f = GLES20.glGetUniformLocation(this.d, "uTexMatrix");
        this.g = GLES20.glGetAttribLocation(this.d, "aPosition");
        this.h = GLES20.glGetAttribLocation(this.d, "aTexCoords");
        this.i = GLES20.glGetUniformLocation(this.d, "uTexture");
    }

    public void d(a60 a60) {
        if (c(a60)) {
            this.a = a60.c;
            a aVar = new a(a60.a.a(0));
            this.b = aVar;
            if (!a60.d) {
                aVar = new a(a60.b.a(0));
            }
            this.c = aVar;
        }
    }
}
