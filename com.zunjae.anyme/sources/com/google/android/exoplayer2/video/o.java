package com.google.android.exoplayer2.video;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.github.mikephil.charting.utils.Utils;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

class o implements GLSurfaceView.Renderer, n {
    private static final float[] n = {1.164f, 1.164f, 1.164f, Utils.FLOAT_EPSILON, -0.392f, 2.017f, 1.596f, -0.813f, Utils.FLOAT_EPSILON};
    private static final float[] o = {1.164f, 1.164f, 1.164f, Utils.FLOAT_EPSILON, -0.213f, 2.112f, 1.793f, -0.533f, Utils.FLOAT_EPSILON};
    private static final float[] p = {1.168f, 1.168f, 1.168f, Utils.FLOAT_EPSILON, -0.188f, 2.148f, 1.683f, -0.652f, Utils.FLOAT_EPSILON};
    private static final String[] q = {"y_tex", "u_tex", "v_tex"};
    private static final FloatBuffer r = z40.f(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    private final int[] e = new int[3];
    private final AtomicReference<VideoDecoderOutputBuffer> f = new AtomicReference<>();
    private FloatBuffer[] g = new FloatBuffer[3];
    private int h;
    private int[] i = new int[3];
    private int j;
    private int[] k = new int[3];
    private int[] l = new int[3];
    private VideoDecoderOutputBuffer m;

    public o(GLSurfaceView gLSurfaceView) {
        for (int i2 = 0; i2 < 3; i2++) {
            int[] iArr = this.k;
            this.l[i2] = -1;
            iArr[i2] = -1;
        }
    }

    private void a() {
        GLES20.glGenTextures(3, this.e, 0);
        for (int i2 = 0; i2 < 3; i2++) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.h, q[i2]), i2);
            GLES20.glActiveTexture(33984 + i2);
            GLES20.glBindTexture(3553, this.e[i2]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        z40.b();
    }

    public void onDrawFrame(GL10 gl10) {
        VideoDecoderOutputBuffer andSet = this.f.getAndSet((Object) null);
        if (andSet != null || this.m != null) {
            if (andSet != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.m;
                if (videoDecoderOutputBuffer != null) {
                    videoDecoderOutputBuffer.release();
                }
                this.m = andSet;
            }
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.m;
            float[] fArr = o;
            int i2 = videoDecoderOutputBuffer2.colorspace;
            if (i2 == 1) {
                fArr = n;
            } else if (i2 == 3) {
                fArr = p;
            }
            GLES20.glUniformMatrix3fv(this.j, 1, false, fArr, 0);
            int i3 = 0;
            while (i3 < 3) {
                int i4 = i3 == 0 ? videoDecoderOutputBuffer2.height : (videoDecoderOutputBuffer2.height + 1) / 2;
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.e[i3]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, videoDecoderOutputBuffer2.yuvStrides[i3], i4, 0, 6409, 5121, videoDecoderOutputBuffer2.yuvPlanes[i3]);
                i3++;
            }
            int[] iArr = new int[3];
            iArr[0] = videoDecoderOutputBuffer2.width;
            int i5 = (iArr[0] + 1) / 2;
            iArr[2] = i5;
            iArr[1] = i5;
            for (int i6 = 0; i6 < 3; i6++) {
                if (this.k[i6] != iArr[i6] || this.l[i6] != videoDecoderOutputBuffer2.yuvStrides[i6]) {
                    q40.f(videoDecoderOutputBuffer2.yuvStrides[i6] != 0);
                    float f2 = ((float) iArr[i6]) / ((float) videoDecoderOutputBuffer2.yuvStrides[i6]);
                    this.g[i6] = z40.f(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f2, 0.0f, f2, 1.0f});
                    GLES20.glVertexAttribPointer(this.i[i6], 2, 5126, false, 0, this.g[i6]);
                    this.k[i6] = iArr[i6];
                    this.l[i6] = videoDecoderOutputBuffer2.yuvStrides[i6];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            z40.b();
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        GLES20.glViewport(0, 0, i2, i3);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int c = z40.c("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
        this.h = c;
        GLES20.glUseProgram(c);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.h, "in_pos");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, r);
        this.i[0] = GLES20.glGetAttribLocation(this.h, "in_tc_y");
        GLES20.glEnableVertexAttribArray(this.i[0]);
        this.i[1] = GLES20.glGetAttribLocation(this.h, "in_tc_u");
        GLES20.glEnableVertexAttribArray(this.i[1]);
        this.i[2] = GLES20.glGetAttribLocation(this.h, "in_tc_v");
        GLES20.glEnableVertexAttribArray(this.i[2]);
        z40.b();
        this.j = GLES20.glGetUniformLocation(this.h, "mColorConversion");
        z40.b();
        a();
        z40.b();
    }
}
