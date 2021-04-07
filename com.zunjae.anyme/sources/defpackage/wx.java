package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.video.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@SuppressLint({"InlinedApi"})
/* renamed from: wx  reason: default package */
public final class wx {
    private static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<b, List<tx>> b = new HashMap<>();
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private static final SparseIntArray e;
    private static final SparseIntArray f;
    private static final Map<String, Integer> g;
    private static final Map<String, Integer> h;
    private static final Map<String, Integer> i;
    private static final SparseIntArray j;
    private static final SparseIntArray k;
    private static int l = -1;

    /* renamed from: wx$b */
    private static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public int hashCode() {
            int i = 1231;
            int hashCode = (((this.a.hashCode() + 31) * 31) + (this.b ? 1231 : 1237)) * 31;
            if (!this.c) {
                i = 1237;
            }
            return hashCode + i;
        }
    }

    /* renamed from: wx$c */
    public static class c extends Exception {
        private c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: wx$d */
    private interface d {
        MediaCodecInfo a(int i);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* renamed from: wx$e */
    private static final class e implements d {
        private e() {
        }

        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        public int d() {
            return MediaCodecList.getCodecCount();
        }

        public boolean e() {
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: wx$f */
    private static final class f implements d {
        private final int a;
        private MediaCodecInfo[] b;

        public f(boolean z, boolean z2) {
            this.a = (z || z2) ? 1 : 0;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        private void f() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }

        public MediaCodecInfo a(int i) {
            f();
            return this.b[i];
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        public int d() {
            f();
            return this.b.length;
        }

        public boolean e() {
            return true;
        }
    }

    /* renamed from: wx$g */
    private interface g<T> {
        int a(T t);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(66, 1);
        c.put(77, 2);
        c.put(88, 4);
        c.put(100, 8);
        c.put(110, 16);
        c.put(122, 32);
        c.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        d.put(11, 4);
        d.put(12, 8);
        d.put(13, 16);
        d.put(20, 32);
        d.put(21, 64);
        d.put(22, 128);
        d.put(30, 256);
        d.put(31, 512);
        d.put(32, 1024);
        d.put(40, 2048);
        d.put(41, 4096);
        d.put(42, 8192);
        d.put(50, 16384);
        d.put(51, 32768);
        d.put(52, 65536);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        e = sparseIntArray3;
        sparseIntArray3.put(0, 1);
        e.put(1, 2);
        e.put(2, 4);
        e.put(3, 8);
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        f = sparseIntArray4;
        sparseIntArray4.put(10, 1);
        f.put(11, 2);
        f.put(20, 4);
        f.put(21, 8);
        f.put(30, 16);
        f.put(31, 32);
        f.put(40, 64);
        f.put(41, 128);
        f.put(50, 256);
        f.put(51, 512);
        f.put(60, 2048);
        f.put(61, 4096);
        f.put(62, 8192);
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("L30", 1);
        g.put("L60", 4);
        g.put("L63", 16);
        g.put("L90", 64);
        g.put("L93", 256);
        g.put("L120", 1024);
        g.put("L123", 4096);
        g.put("L150", 16384);
        g.put("L153", 65536);
        g.put("L156", 262144);
        g.put("L180", 1048576);
        g.put("L183", 4194304);
        g.put("L186", 16777216);
        g.put("H30", 2);
        g.put("H60", 8);
        g.put("H63", 32);
        g.put("H90", 128);
        g.put("H93", 512);
        g.put("H120", 2048);
        g.put("H123", 8192);
        g.put("H150", 32768);
        g.put("H153", 131072);
        g.put("H156", 524288);
        g.put("H180", 2097152);
        g.put("H183", 8388608);
        g.put("H186", 33554432);
        HashMap hashMap2 = new HashMap();
        h = hashMap2;
        hashMap2.put("00", 1);
        h.put("01", 2);
        h.put("02", 4);
        h.put("03", 8);
        h.put("04", 16);
        h.put("05", 32);
        h.put("06", 64);
        h.put("07", 128);
        h.put("08", 256);
        h.put("09", 512);
        HashMap hashMap3 = new HashMap();
        i = hashMap3;
        hashMap3.put("01", 1);
        i.put("02", 2);
        i.put("03", 4);
        i.put("04", 8);
        i.put("05", 16);
        i.put("06", 32);
        i.put("07", 64);
        i.put("08", 128);
        i.put("09", 256);
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        j = sparseIntArray5;
        sparseIntArray5.put(0, 1);
        j.put(1, 2);
        j.put(2, 4);
        j.put(3, 8);
        j.put(4, 16);
        j.put(5, 32);
        j.put(6, 64);
        j.put(7, 128);
        j.put(8, 256);
        j.put(9, 512);
        j.put(10, 1024);
        j.put(11, 2048);
        j.put(12, 4096);
        j.put(13, 8192);
        j.put(14, 16384);
        j.put(15, 32768);
        j.put(16, 65536);
        j.put(17, 131072);
        j.put(18, 262144);
        j.put(19, 524288);
        j.put(20, 1048576);
        j.put(21, 2097152);
        j.put(22, 4194304);
        j.put(23, 8388608);
        SparseIntArray sparseIntArray6 = new SparseIntArray();
        k = sparseIntArray6;
        sparseIntArray6.put(1, 1);
        k.put(2, 2);
        k.put(3, 3);
        k.put(4, 4);
        k.put(5, 5);
        k.put(6, 6);
        k.put(17, 17);
        k.put(20, 20);
        k.put(23, 23);
        k.put(29, 29);
        k.put(39, 39);
        k.put(42, 42);
    }

    static /* synthetic */ int A(tx txVar) {
        return txVar.a.startsWith("OMX.google") ? 1 : 0;
    }

    static /* synthetic */ int B(f0 f0Var, tx txVar) {
        try {
            return txVar.l(f0Var) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }

    static /* synthetic */ int C(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static int D() {
        if (l == -1) {
            int i2 = 0;
            tx i3 = i("video/avc", false, false);
            if (i3 != null) {
                MediaCodecInfo.CodecProfileLevel[] f2 = i3.f();
                int length = f2.length;
                int i4 = 0;
                while (i2 < length) {
                    i4 = Math.max(b(f2[i2].level), i4);
                    i2++;
                }
                i2 = Math.max(i4, v50.a >= 21 ? 345600 : 172800);
            }
            l = i2;
        }
        return l;
    }

    private static <T> void E(List<T> list, g<T> gVar) {
        Collections.sort(list, new sx(gVar));
    }

    private static void a(String str, List<tx> list) {
        if ("audio/raw".equals(str)) {
            if (v50.a < 26 && v50.b.equals("R9") && list.size() == 1 && list.get(0).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(tx.w("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
            }
            E(list, rx.a);
        }
        if (v50.a < 21 && list.size() > 1) {
            String str2 = list.get(0).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                E(list, px.a);
            }
        }
        if (v50.a < 30 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).a)) {
            list.add(list.remove(0));
        }
    }

    private static int b(int i2) {
        if (i2 == 1 || i2 == 2) {
            return 25344;
        }
        switch (i2) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    private static boolean c(String str) {
        return v50.a <= 22 && ("ODROID-XU3".equals(v50.d) || "Nexus 10".equals(v50.d)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str));
    }

    private static Pair<Integer, Integer> d(String str, String[] strArr) {
        int i2;
        if (strArr.length != 3) {
            String valueOf = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(e50.f(Integer.parseInt(strArr[1], 16))) && (i2 = k.get(Integer.parseInt(strArr[2]), -1)) != -1) {
                return new Pair<>(Integer.valueOf(i2), 0);
            }
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    private static Pair<Integer, Integer> e(String str, String[] strArr, i iVar) {
        StringBuilder sb;
        int i2;
        String sb2;
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        int i3 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                sb = new StringBuilder(32);
                sb.append("Unknown AV1 profile: ");
                sb.append(parseInt);
            } else if (parseInt3 == 8 || parseInt3 == 10) {
                if (parseInt3 != 8) {
                    i3 = (iVar == null || !(iVar.h != null || (i2 = iVar.g) == 7 || i2 == 6)) ? 2 : 4096;
                }
                int i4 = j.get(parseInt2, -1);
                if (i4 != -1) {
                    return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i4));
                }
                sb = new StringBuilder(30);
                sb.append("Unknown AV1 level: ");
                sb.append(parseInt2);
            } else {
                StringBuilder sb3 = new StringBuilder(34);
                sb3.append("Unknown AV1 bit depth: ");
                sb3.append(parseInt3);
                sb2 = sb3.toString();
                b50.h("MediaCodecUtil", sb2);
                return null;
            }
            sb2 = sb.toString();
            b50.h("MediaCodecUtil", sb2);
            return null;
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    private static Pair<Integer, Integer> f(String str, String[] strArr) {
        int i2;
        int i3;
        String sb;
        if (strArr.length < 2) {
            String valueOf = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i3 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i2 = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt = Integer.parseInt(strArr[1]);
                i2 = Integer.parseInt(strArr[2]);
                i3 = parseInt;
            } else {
                String valueOf2 = String.valueOf(str);
                b50.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf2) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            int i4 = c.get(i3, -1);
            if (i4 == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AVC profile: ");
                sb2.append(i3);
                sb = sb2.toString();
            } else {
                int i5 = d.get(i2, -1);
                if (i5 != -1) {
                    return new Pair<>(Integer.valueOf(i4), Integer.valueOf(i5));
                }
                StringBuilder sb3 = new StringBuilder(30);
                sb3.append("Unknown AVC level: ");
                sb3.append(i2);
                sb = sb3.toString();
            }
            b50.h("MediaCodecUtil", sb);
            return null;
        } catch (NumberFormatException unused) {
            String valueOf3 = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    private static String g(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r3.equals("avc1") != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> h(com.google.android.exoplayer2.f0 r6) {
        /*
            java.lang.String r0 = r6.j
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.m
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001d
            java.lang.String r6 = r6.j
            android.util.Pair r6 = m(r6, r0)
            return r6
        L_0x001d:
            r2 = 0
            r3 = r0[r2]
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L_0x0064;
                case 3006243: goto L_0x005b;
                case 3006244: goto L_0x0051;
                case 3199032: goto L_0x0047;
                case 3214780: goto L_0x003d;
                case 3356560: goto L_0x0033;
                case 3624515: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x006e
        L_0x0029:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x006e
            r2 = 2
            goto L_0x006f
        L_0x0033:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x006e
            r2 = 6
            goto L_0x006f
        L_0x003d:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x006e
            r2 = 4
            goto L_0x006f
        L_0x0047:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x006e
            r2 = 3
            goto L_0x006f
        L_0x0051:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x006e
            r2 = 1
            goto L_0x006f
        L_0x005b:
            java.lang.String r5 = "avc1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x006e
            goto L_0x006f
        L_0x0064:
            java.lang.String r2 = "av01"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x006e
            r2 = 5
            goto L_0x006f
        L_0x006e:
            r2 = -1
        L_0x006f:
            switch(r2) {
                case 0: goto L_0x0091;
                case 1: goto L_0x0091;
                case 2: goto L_0x008a;
                case 3: goto L_0x0083;
                case 4: goto L_0x0083;
                case 5: goto L_0x007a;
                case 6: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            return r1
        L_0x0073:
            java.lang.String r6 = r6.j
            android.util.Pair r6 = d(r6, r0)
            return r6
        L_0x007a:
            java.lang.String r1 = r6.j
            com.google.android.exoplayer2.video.i r6 = r6.y
            android.util.Pair r6 = e(r1, r0, r6)
            return r6
        L_0x0083:
            java.lang.String r6 = r6.j
            android.util.Pair r6 = n(r6, r0)
            return r6
        L_0x008a:
            java.lang.String r6 = r6.j
            android.util.Pair r6 = p(r6, r0)
            return r6
        L_0x0091:
            java.lang.String r6 = r6.j
            android.util.Pair r6 = f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx.h(com.google.android.exoplayer2.f0):android.util.Pair");
    }

    public static tx i(String str, boolean z, boolean z2) {
        List<tx> j2 = j(str, z, z2);
        if (j2.isEmpty()) {
            return null;
        }
        return j2.get(0);
    }

    public static synchronized List<tx> j(String str, boolean z, boolean z2) {
        synchronized (wx.class) {
            b bVar = new b(str, z, z2);
            List<tx> list = b.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList<tx> k2 = k(bVar, v50.a >= 21 ? new f(z, z2) : new e());
            if (z && k2.isEmpty() && 21 <= v50.a && v50.a <= 23) {
                k2 = k(bVar, new e());
                if (!k2.isEmpty()) {
                    String str2 = k2.get(0).a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    b50.h("MediaCodecUtil", sb.toString());
                }
            }
            a(str, k2);
            List<tx> unmodifiableList = Collections.unmodifiableList(k2);
            b.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea A[SYNTHETIC, Splitter:B:50:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<defpackage.tx> k(defpackage.wx.b r25, defpackage.wx.d r26) {
        /*
            r1 = r25
            r2 = r26
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0157 }
            r5.<init>()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r15 = r1.a     // Catch:{ Exception -> 0x0157 }
            int r14 = r26.d()     // Catch:{ Exception -> 0x0157 }
            boolean r13 = r26.e()     // Catch:{ Exception -> 0x0157 }
            r0 = 0
            r12 = 0
        L_0x0019:
            if (r12 >= r14) goto L_0x0156
            android.media.MediaCodecInfo r0 = r2.a(r12)     // Catch:{ Exception -> 0x0157 }
            boolean r6 = q(r0)     // Catch:{ Exception -> 0x0157 }
            if (r6 == 0) goto L_0x002d
        L_0x0025:
            r22 = r12
            r23 = r13
            r24 = r14
            goto L_0x0115
        L_0x002d:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x0157 }
            boolean r6 = s(r0, r11, r13, r15)     // Catch:{ Exception -> 0x0157 }
            if (r6 != 0) goto L_0x0038
            goto L_0x0025
        L_0x0038:
            java.lang.String r10 = g(r0, r11, r15)     // Catch:{ Exception -> 0x0157 }
            if (r10 != 0) goto L_0x003f
            goto L_0x0025
        L_0x003f:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x00d7 }
            boolean r6 = r2.b(r4, r10, r9)     // Catch:{ Exception -> 0x00d7 }
            boolean r7 = r2.c(r4, r10, r9)     // Catch:{ Exception -> 0x00d7 }
            boolean r8 = r1.c     // Catch:{ Exception -> 0x00d7 }
            if (r8 != 0) goto L_0x0051
            if (r7 != 0) goto L_0x0025
        L_0x0051:
            boolean r7 = r1.c     // Catch:{ Exception -> 0x00d7 }
            if (r7 == 0) goto L_0x0058
            if (r6 != 0) goto L_0x0058
            goto L_0x0025
        L_0x0058:
            boolean r6 = r2.b(r3, r10, r9)     // Catch:{ Exception -> 0x00d7 }
            boolean r7 = r2.c(r3, r10, r9)     // Catch:{ Exception -> 0x00d7 }
            boolean r8 = r1.b     // Catch:{ Exception -> 0x00d7 }
            if (r8 != 0) goto L_0x0066
            if (r7 != 0) goto L_0x0025
        L_0x0066:
            boolean r7 = r1.b     // Catch:{ Exception -> 0x00d7 }
            if (r7 == 0) goto L_0x006d
            if (r6 != 0) goto L_0x006d
            goto L_0x0025
        L_0x006d:
            boolean r16 = t(r0)     // Catch:{ Exception -> 0x00d7 }
            boolean r17 = v(r0)     // Catch:{ Exception -> 0x00d7 }
            boolean r0 = x(r0)     // Catch:{ Exception -> 0x00d7 }
            boolean r18 = c(r11)     // Catch:{ Exception -> 0x00d7 }
            if (r13 == 0) goto L_0x0083
            boolean r7 = r1.b     // Catch:{ Exception -> 0x00d7 }
            if (r7 == r6) goto L_0x0089
        L_0x0083:
            if (r13 != 0) goto L_0x00ac
            boolean r7 = r1.b     // Catch:{ Exception -> 0x00d7 }
            if (r7 != 0) goto L_0x00ac
        L_0x0089:
            r19 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r20 = r10
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r18
            r24 = r14
            r14 = r19
            tx r0 = defpackage.tx.w(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00aa }
            r5.add(r0)     // Catch:{ Exception -> 0x00aa }
            goto L_0x0115
        L_0x00aa:
            r0 = move-exception
            goto L_0x00e2
        L_0x00ac:
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r24 = r14
            if (r23 != 0) goto L_0x0115
            if (r6 == 0) goto L_0x0115
            java.lang.String r6 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r7 = ".secure"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Exception -> 0x00aa }
            r14 = 1
            r7 = r15
            r8 = r20
            r10 = r16
            r11 = r17
            r12 = r0
            r13 = r18
            tx r0 = defpackage.tx.w(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00aa }
            r5.add(r0)     // Catch:{ Exception -> 0x00aa }
            return r5
        L_0x00d7:
            r0 = move-exception
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r24 = r14
        L_0x00e2:
            int r6 = defpackage.v50.a     // Catch:{ Exception -> 0x0157 }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x011d
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x0157 }
            if (r6 != 0) goto L_0x011d
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x0157 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0157 }
            int r0 = r0 + 46
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r0 = "Skipping codec "
            r6.append(r0)     // Catch:{ Exception -> 0x0157 }
            r7 = r21
            r6.append(r7)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r0 = " (failed to query capabilities)"
            r6.append(r0)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0157 }
            defpackage.b50.c(r8, r0)     // Catch:{ Exception -> 0x0157 }
        L_0x0115:
            int r12 = r22 + 1
            r13 = r23
            r14 = r24
            goto L_0x0019
        L_0x011d:
            r7 = r21
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0157 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0157 }
            int r1 = r1 + 25
            java.lang.String r2 = java.lang.String.valueOf(r20)     // Catch:{ Exception -> 0x0157 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0157 }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "Failed to query codec "
            r2.append(r1)     // Catch:{ Exception -> 0x0157 }
            r2.append(r7)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x0157 }
            r1 = r20
            r2.append(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            defpackage.b50.c(r8, r1)     // Catch:{ Exception -> 0x0157 }
            throw r0     // Catch:{ Exception -> 0x0157 }
        L_0x0156:
            return r5
        L_0x0157:
            r0 = move-exception
            wx$c r1 = new wx$c
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx.k(wx$b, wx$d):java.util.ArrayList");
    }

    public static List<tx> l(List<tx> list, f0 f0Var) {
        ArrayList arrayList = new ArrayList(list);
        E(arrayList, new qx(f0Var));
        return arrayList;
    }

    private static Pair<Integer, Integer> m(String str, String[] strArr) {
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String group = matcher.group(1);
        Integer num = h.get(group);
        if (num == null) {
            String valueOf3 = String.valueOf(group);
            b50.h("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(valueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str2 = strArr[2];
        Integer num2 = i.get(str2);
        if (num2 != null) {
            return new Pair<>(num, num2);
        }
        String valueOf4 = String.valueOf(str2);
        b50.h("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(valueOf4) : new String("Unknown Dolby Vision level string: "));
        return null;
    }

    private static Pair<Integer, Integer> n(String str, String[] strArr) {
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i2 = 1;
        Matcher matcher = a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if ("2".equals(group)) {
                i2 = 2;
            } else {
                String valueOf3 = String.valueOf(group);
                b50.h("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(valueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
        }
        String str2 = strArr[3];
        Integer num = g.get(str2);
        if (num != null) {
            return new Pair<>(Integer.valueOf(i2), num);
        }
        String valueOf4 = String.valueOf(str2);
        b50.h("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(valueOf4) : new String("Unknown HEVC level string: "));
        return null;
    }

    public static tx o() {
        tx i2 = i("audio/raw", false, false);
        if (i2 == null) {
            return null;
        }
        return tx.x(i2.a);
    }

    private static Pair<Integer, Integer> p(String str, String[] strArr) {
        String sb;
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int i2 = e.get(parseInt, -1);
            if (i2 == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown VP9 profile: ");
                sb2.append(parseInt);
                sb = sb2.toString();
            } else {
                int i3 = f.get(parseInt2, -1);
                if (i3 != -1) {
                    return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
                }
                StringBuilder sb3 = new StringBuilder(30);
                sb3.append("Unknown VP9 level: ");
                sb3.append(parseInt2);
                sb = sb3.toString();
            }
            b50.h("MediaCodecUtil", sb);
            return null;
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            b50.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    private static boolean q(MediaCodecInfo mediaCodecInfo) {
        return v50.a >= 29 && r(mediaCodecInfo);
    }

    private static boolean r(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (v50.a < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (v50.a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && ("a70".equals(v50.b) || ("Xiaomi".equals(v50.c) && v50.b.startsWith("HM")))) {
            return false;
        }
        if (v50.a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(v50.b) || "protou".equals(v50.b) || "ville".equals(v50.b) || "villeplus".equals(v50.b) || "villec2".equals(v50.b) || v50.b.startsWith("gee") || "C6602".equals(v50.b) || "C6603".equals(v50.b) || "C6606".equals(v50.b) || "C6616".equals(v50.b) || "L36h".equals(v50.b) || "SO-02E".equals(v50.b))) {
            return false;
        }
        if (v50.a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(v50.b) || "C1505".equals(v50.b) || "C1604".equals(v50.b) || "C1605".equals(v50.b))) {
            return false;
        }
        if (v50.a < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(v50.c) && (v50.b.startsWith("zeroflte") || v50.b.startsWith("zerolte") || v50.b.startsWith("zenlte") || "SC-05G".equals(v50.b) || "marinelteatt".equals(v50.b) || "404SC".equals(v50.b) || "SC-04G".equals(v50.b) || "SCV31".equals(v50.b)))) {
            return false;
        }
        if (v50.a <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(v50.c) && (v50.b.startsWith("d2") || v50.b.startsWith("serrano") || v50.b.startsWith("jflte") || v50.b.startsWith("santos") || v50.b.startsWith("t0"))) {
            return false;
        }
        if (v50.a > 19 || !v50.b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo) {
        return v50.a >= 29 ? u(mediaCodecInfo) : !v(mediaCodecInfo);
    }

    @TargetApi(29)
    private static boolean u(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo) {
        if (v50.a >= 29) {
            return w(mediaCodecInfo);
        }
        String G0 = v50.G0(mediaCodecInfo.getName());
        if (G0.startsWith("arc.")) {
            return false;
        }
        return G0.startsWith("omx.google.") || G0.startsWith("omx.ffmpeg.") || (G0.startsWith("omx.sec.") && G0.contains(".sw.")) || G0.equals("omx.qcom.video.decoder.hevcswvdec") || G0.startsWith("c2.android.") || G0.startsWith("c2.google.") || (!G0.startsWith("omx.") && !G0.startsWith("c2."));
    }

    @TargetApi(29)
    private static boolean w(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo) {
        if (v50.a >= 29) {
            return y(mediaCodecInfo);
        }
        String G0 = v50.G0(mediaCodecInfo.getName());
        return !G0.startsWith("omx.google.") && !G0.startsWith("c2.android.") && !G0.startsWith("c2.google.");
    }

    @TargetApi(29)
    private static boolean y(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    static /* synthetic */ int z(tx txVar) {
        String str = txVar.a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (v50.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
