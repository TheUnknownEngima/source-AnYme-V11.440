package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.video.t;
import java.util.ArrayList;

public class a0 implements y0 {
    private final Context a;
    private rs<vs> b;
    private int c = 0;
    private long d = 5000;
    private boolean e;
    private boolean f;
    private vx g = vx.a;

    public a0(Context context) {
        this.a = context;
    }

    public u0[] a(Handler handler, t tVar, fr frVar, q20 q20, dy dyVar, rs<vs> rsVar) {
        rs<vs> rsVar2 = rsVar == null ? this.b : rsVar;
        ArrayList arrayList = new ArrayList();
        rs<vs> rsVar3 = rsVar2;
        h(this.a, this.c, this.g, rsVar3, this.e, this.f, handler, tVar, this.d, arrayList);
        c(this.a, this.c, this.g, rsVar3, this.e, this.f, b(), handler, frVar, arrayList);
        ArrayList arrayList2 = arrayList;
        g(this.a, q20, handler.getLooper(), this.c, arrayList2);
        e(this.a, dyVar, handler.getLooper(), this.c, arrayList2);
        d(this.a, this.c, arrayList);
        f(this.a, handler, this.c, arrayList);
        return (u0[]) arrayList.toArray(new u0[0]);
    }

    /* access modifiers changed from: protected */
    public er[] b() {
        return new er[0];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006a A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x0076] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.content.Context r17, int r18, defpackage.vx r19, defpackage.rs<defpackage.vs> r20, boolean r21, boolean r22, defpackage.er[] r23, android.os.Handler r24, defpackage.fr r25, java.util.ArrayList<com.google.android.exoplayer2.u0> r26) {
        /*
            r16 = this;
            r0 = r18
            r1 = r23
            r11 = r26
            java.lang.String r12 = "DefaultRenderersFactory"
            java.lang.Class<er[]> r13 = defpackage.er[].class
            java.lang.Class<fr> r14 = defpackage.fr.class
            pr r15 = new pr
            mr r10 = new mr
            cr r2 = defpackage.cr.b(r17)
            r10.<init>(r2, r1)
            r2 = r15
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r24
            r9 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.add(r15)
            if (r0 != 0) goto L_0x002f
            return
        L_0x002f:
            int r2 = r26.size()
            r3 = 2
            if (r0 != r3) goto L_0x0038
            int r2 = r2 + -1
        L_0x0038:
            r0 = 0
            r4 = 3
            r5 = 1
            java.lang.String r6 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            r7[r5] = r14     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            r7[r3] = r13     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            java.lang.reflect.Constructor r6 = r6.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            r7[r0] = r24     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            r7[r5] = r25     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            r7[r3] = r1     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            com.google.android.exoplayer2.u0 r6 = (com.google.android.exoplayer2.u0) r6     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            int r7 = r2 + 1
            r11.add(r2, r6)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x006a }
            java.lang.String r2 = "Loaded LibopusAudioRenderer."
            defpackage.b50.f(r12, r2)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x006a }
            goto L_0x0074
        L_0x0068:
            r2 = r7
            goto L_0x0073
        L_0x006a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0073:
            r7 = r2
        L_0x0074:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r6[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            r6[r5] = r14     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            r6[r3] = r13     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            r6[r0] = r24     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            r6[r5] = r25     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            r6[r3] = r1     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            java.lang.Object r2 = r2.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            com.google.android.exoplayer2.u0 r2 = (com.google.android.exoplayer2.u0) r2     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            int r6 = r7 + 1
            r11.add(r7, r2)     // Catch:{ ClassNotFoundException -> 0x00a1, Exception -> 0x00a3 }
            java.lang.String r2 = "Loaded LibflacAudioRenderer."
            defpackage.b50.f(r12, r2)     // Catch:{ ClassNotFoundException -> 0x00a1, Exception -> 0x00a3 }
            goto L_0x00ad
        L_0x00a1:
            r7 = r6
            goto L_0x00ac
        L_0x00a3:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00ac:
            r6 = r7
        L_0x00ad:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r7[r5] = r14     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r7[r3] = r13     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r4[r0] = r24     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r4[r5] = r25     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r4[r3] = r1     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.Object r0 = r2.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            com.google.android.exoplayer2.u0 r0 = (com.google.android.exoplayer2.u0) r0     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r11.add(r6, r0)     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            defpackage.b50.f(r12, r0)     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            goto L_0x00e1
        L_0x00d8:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.a0.c(android.content.Context, int, vx, rs, boolean, boolean, er[], android.os.Handler, fr, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public void d(Context context, int i, ArrayList<u0> arrayList) {
        arrayList.add(new y50());
    }

    /* access modifiers changed from: protected */
    public void e(Context context, dy dyVar, Looper looper, int i, ArrayList<u0> arrayList) {
        arrayList.add(new ey(dyVar, looper));
    }

    /* access modifiers changed from: protected */
    public void f(Context context, Handler handler, int i, ArrayList<u0> arrayList) {
    }

    /* access modifiers changed from: protected */
    public void g(Context context, q20 q20, Looper looper, int i, ArrayList<u0> arrayList) {
        arrayList.add(new r20(q20, looper));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        throw new java.lang.RuntimeException("Error instantiating VP9 extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074 A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(android.content.Context r17, int r18, defpackage.vx r19, defpackage.rs<defpackage.vs> r20, boolean r21, boolean r22, android.os.Handler r23, com.google.android.exoplayer2.video.t r24, long r25, java.util.ArrayList<com.google.android.exoplayer2.u0> r27) {
        /*
            r16 = this;
            r0 = r18
            r12 = r27
            java.lang.String r13 = "DefaultRenderersFactory"
            java.lang.Class<com.google.android.exoplayer2.video.t> r14 = com.google.android.exoplayer2.video.t.class
            com.google.android.exoplayer2.video.m r15 = new com.google.android.exoplayer2.video.m
            r11 = 50
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r25
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            r12.add(r15)
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            int r1 = r27.size()
            r2 = 2
            if (r0 != r2) goto L_0x002f
            int r1 = r1 + -1
        L_0x002f:
            r0 = 50
            r3 = 3
            r4 = 0
            r5 = 4
            r6 = 1
            java.lang.String r7 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r4] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class<android.os.Handler> r9 = android.os.Handler.class
            r8[r6] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r2] = r14     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r3] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.reflect.Constructor r7 = r7.getConstructor(r8)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Long r9 = java.lang.Long.valueOf(r25)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r4] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r6] = r23     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r2] = r24     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r3] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Object r7 = r7.newInstance(r8)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            com.google.android.exoplayer2.u0 r7 = (com.google.android.exoplayer2.u0) r7     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            int r8 = r1 + 1
            r12.add(r1, r7)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0074 }
            java.lang.String r1 = "Loaded LibvpxVideoRenderer."
            defpackage.b50.f(r13, r1)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0074 }
            goto L_0x007e
        L_0x0072:
            r1 = r8
            goto L_0x007d
        L_0x0074:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating VP9 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x007d:
            r8 = r1
        L_0x007e:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r7[r4] = r9     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class<android.os.Handler> r9 = android.os.Handler.class
            r7[r6] = r9     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r7[r2] = r14     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r7[r3] = r9     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Long r7 = java.lang.Long.valueOf(r25)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r4] = r7     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r6] = r23     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r2] = r24     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r3] = r0     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Object r0 = r1.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            com.google.android.exoplayer2.u0 r0 = (com.google.android.exoplayer2.u0) r0     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r12.add(r8, r0)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.String r0 = "Loaded Libgav1VideoRenderer."
            defpackage.b50.f(r13, r0)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            goto L_0x00c2
        L_0x00b9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating AV1 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.a0.h(android.content.Context, int, vx, rs, boolean, boolean, android.os.Handler, com.google.android.exoplayer2.video.t, long, java.util.ArrayList):void");
    }
}
