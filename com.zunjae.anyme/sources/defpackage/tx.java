package defpackage;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.f0;

/* renamed from: tx  reason: default package */
public final class tx {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final boolean h;

    private tx(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        q40.e(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        boolean z7 = true;
        this.e = !z5 && codecCapabilities != null && g(codecCapabilities);
        if (codecCapabilities != null) {
            boolean r = r(codecCapabilities);
        }
        if (!z6 && (codecCapabilities == null || !p(codecCapabilities))) {
            z7 = false;
        }
        this.f = z7;
        this.h = e50.n(str2);
    }

    private static int a(String str, String str2, int i) {
        if (i > 1 || ((v50.a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("AssumedMaxChannelAdjustment: ");
        sb.append(str);
        sb.append(", [");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append("]");
        b50.h("MediaCodecInfo", sb.toString());
        return i2;
    }

    @TargetApi(21)
    private static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(v50.i(i, widthAlignment) * widthAlignment, v50.i(i2, heightAlignment) * heightAlignment);
    }

    @TargetApi(21)
    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        Point c2 = c(videoCapabilities, i, i2);
        int i3 = c2.x;
        int i4 = c2.y;
        return (d2 == -1.0d || d2 < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d2));
    }

    private static final boolean e(String str) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(v50.b);
    }

    private static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return v50.a >= 19 && h(codecCapabilities);
    }

    @TargetApi(19)
    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return v50.a >= 21 && q(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return v50.a >= 21 && s(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void u(String str) {
        String str2 = this.a;
        String str3 = this.b;
        String str4 = v50.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("AssumedSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        b50.b("MediaCodecInfo", sb.toString());
    }

    private void v(String str) {
        String str2 = this.a;
        String str3 = this.b;
        String str4 = v50.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        b50.b("MediaCodecInfo", sb.toString());
    }

    public static tx w(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new tx(str, str2, str3, codecCapabilities, false, z, z2, z3, z4, z5);
    }

    public static tx x(String str) {
        return new tx(str, (String) null, (String) null, (MediaCodecInfo.CodecCapabilities) null, true, false, true, false, false, false);
    }

    @TargetApi(21)
    public Point b(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.MediaCodecInfo.CodecProfileLevel[] f() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx.f():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    @TargetApi(21)
    public boolean i(int i) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            sb = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                sb = "channelCount.aCaps";
            } else if (a(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
                return true;
            } else {
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("channelCount.support, ");
                sb2.append(i);
                sb = sb2.toString();
            }
        }
        v(sb);
        return false;
    }

    @TargetApi(21)
    public boolean j(int i) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            sb = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                sb = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i)) {
                return true;
            } else {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("sampleRate.support, ");
                sb2.append(i);
                sb = sb2.toString();
            }
        }
        v(sb);
        return false;
    }

    public boolean k(f0 f0Var) {
        String e2;
        String str;
        StringBuilder sb;
        String str2;
        String str3 = f0Var.j;
        if (str3 == null || this.b == null || (e2 = e50.e(str3)) == null) {
            return true;
        }
        if (!this.b.equals(e2)) {
            str = f0Var.j;
            sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(e2).length());
            str2 = "codec.mime ";
        } else {
            Pair<Integer, Integer> h2 = wx.h(f0Var);
            if (h2 == null) {
                return true;
            }
            int intValue = ((Integer) h2.first).intValue();
            int intValue2 = ((Integer) h2.second).intValue();
            if (!this.h && intValue != 42) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : f()) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                    return true;
                }
            }
            str = f0Var.j;
            sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(e2).length());
            str2 = "codec.profileLevel, ";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(", ");
        sb.append(e2);
        v(sb.toString());
        return false;
    }

    public boolean l(f0 f0Var) {
        int i;
        boolean z = false;
        if (!k(f0Var)) {
            return false;
        }
        if (this.h) {
            int i2 = f0Var.r;
            if (i2 <= 0 || (i = f0Var.s) <= 0) {
                return true;
            }
            if (v50.a >= 21) {
                return t(i2, i, (double) f0Var.t);
            }
            if (i2 * i <= wx.D()) {
                z = true;
            }
            if (!z) {
                int i3 = f0Var.r;
                int i4 = f0Var.s;
                StringBuilder sb = new StringBuilder(40);
                sb.append("legacyFrameSize, ");
                sb.append(i3);
                sb.append("x");
                sb.append(i4);
                v(sb.toString());
            }
            return z;
        }
        if (v50.a >= 21) {
            int i5 = f0Var.A;
            if (i5 != -1 && !j(i5)) {
                return false;
            }
            int i6 = f0Var.z;
            return i6 == -1 || i(i6);
        }
    }

    public boolean m() {
        if (v50.a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : f()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean n(f0 f0Var) {
        if (this.h) {
            return this.e;
        }
        Pair<Integer, Integer> h2 = wx.h(f0Var);
        return h2 != null && ((Integer) h2.first).intValue() == 42;
    }

    public boolean o(f0 f0Var, f0 f0Var2, boolean z) {
        if (this.h) {
            return f0Var.m.equals(f0Var2.m) && f0Var.u == f0Var2.u && (this.e || (f0Var.r == f0Var2.r && f0Var.s == f0Var2.s)) && ((!z && f0Var2.y == null) || v50.b(f0Var.y, f0Var2.y));
        }
        if ("audio/mp4a-latm".equals(this.b) && f0Var.m.equals(f0Var2.m) && f0Var.z == f0Var2.z && f0Var.A == f0Var2.A) {
            Pair<Integer, Integer> h2 = wx.h(f0Var);
            Pair<Integer, Integer> h3 = wx.h(f0Var2);
            if (!(h2 == null || h3 == null)) {
                return ((Integer) h2.first).intValue() == 42 && ((Integer) h3.first).intValue() == 42;
            }
        }
        return false;
    }

    @TargetApi(21)
    public boolean t(int i, int i2, double d2) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            sb = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                sb = "sizeAndRate.vCaps";
            } else if (d(videoCapabilities, i, i2, d2)) {
                return true;
            } else {
                if (i >= i2 || !e(this.a) || !d(videoCapabilities, i2, i, d2)) {
                    StringBuilder sb2 = new StringBuilder(69);
                    sb2.append("sizeAndRate.support, ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    sb2.append("x");
                    sb2.append(d2);
                    sb = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder(69);
                    sb3.append("sizeAndRate.rotated, ");
                    sb3.append(i);
                    sb3.append("x");
                    sb3.append(i2);
                    sb3.append("x");
                    sb3.append(d2);
                    u(sb3.toString());
                    return true;
                }
            }
        }
        v(sb);
        return false;
    }

    public String toString() {
        return this.a;
    }
}
