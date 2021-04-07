package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: e50  reason: default package */
public final class e50 {
    private static final ArrayList<a> a = new ArrayList<>();

    /* renamed from: e50$a */
    private static final class a {
        public final String a;
        public final String b;
        public final int c;
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 10;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 8;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 3;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 9;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = 6;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 4;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String e : v50.B0(str)) {
            String e2 = e(e);
            if (e2 != null && l(e2)) {
                return e2;
            }
        }
        return null;
    }

    private static String c(String str) {
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a aVar = a.get(i);
            if (str.startsWith(aVar.b)) {
                return aVar.a;
            }
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int d(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 7
            r3 = 6
            r4 = 5
            switch(r0) {
                case -2123537834: goto L_0x0052;
                case -1095064472: goto L_0x0048;
                case 187078296: goto L_0x003e;
                case 187078297: goto L_0x0034;
                case 1504578661: goto L_0x002a;
                case 1504831518: goto L_0x0020;
                case 1505942594: goto L_0x0016;
                case 1556697186: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x005c
        L_0x000c:
            java.lang.String r0 = "audio/true-hd"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r5 = 7
            goto L_0x005d
        L_0x0016:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r5 = 6
            goto L_0x005d
        L_0x0020:
            java.lang.String r0 = "audio/mpeg"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r5 = 0
            goto L_0x005d
        L_0x002a:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r5 = 2
            goto L_0x005d
        L_0x0034:
            java.lang.String r0 = "audio/ac4"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r5 = 4
            goto L_0x005d
        L_0x003e:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r5 = 1
            goto L_0x005d
        L_0x0048:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r5 = 5
            goto L_0x005d
        L_0x0052:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x005c
            r5 = 3
            goto L_0x005d
        L_0x005c:
            r5 = -1
        L_0x005d:
            switch(r5) {
                case 0: goto L_0x0070;
                case 1: goto L_0x006f;
                case 2: goto L_0x006e;
                case 3: goto L_0x006b;
                case 4: goto L_0x0068;
                case 5: goto L_0x0067;
                case 6: goto L_0x0064;
                case 7: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            return r1
        L_0x0061:
            r5 = 14
            return r5
        L_0x0064:
            r5 = 8
            return r5
        L_0x0067:
            return r2
        L_0x0068:
            r5 = 17
            return r5
        L_0x006b:
            r5 = 18
            return r5
        L_0x006e:
            return r3
        L_0x006f:
            return r4
        L_0x0070:
            r5 = 9
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e50.d(java.lang.String):int");
    }

    public static String e(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String G0 = v50.G0(str.trim());
        if (G0.startsWith("avc1") || G0.startsWith("avc3")) {
            return "video/avc";
        }
        if (G0.startsWith("hev1") || G0.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (G0.startsWith("dvav") || G0.startsWith("dva1") || G0.startsWith("dvhe") || G0.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (G0.startsWith("av01")) {
            return "video/av01";
        }
        if (G0.startsWith("vp9") || G0.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (G0.startsWith("vp8") || G0.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!G0.startsWith("mp4a")) {
            return (G0.startsWith("ac-3") || G0.startsWith("dac3")) ? "audio/ac3" : (G0.startsWith("ec-3") || G0.startsWith("dec3")) ? "audio/eac3" : G0.startsWith("ec+3") ? "audio/eac3-joc" : (G0.startsWith("ac-4") || G0.startsWith("dac4")) ? "audio/ac4" : (G0.startsWith("dtsc") || G0.startsWith("dtse")) ? "audio/vnd.dts" : (G0.startsWith("dtsh") || G0.startsWith("dtsl")) ? "audio/vnd.dts.hd" : G0.startsWith("opus") ? "audio/opus" : G0.startsWith("vorbis") ? "audio/vorbis" : G0.startsWith("flac") ? "audio/flac" : G0.startsWith("stpp") ? "application/ttml+xml" : G0.startsWith("wvtt") ? "text/vtt" : c(G0);
        }
        if (G0.startsWith("mp4a.")) {
            String substring = G0.substring(5);
            if (substring.length() >= 2) {
                try {
                    str2 = f(Integer.parseInt(v50.I0(substring.substring(0, 2)), 16));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    public static String f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    private static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (l(str)) {
            return 1;
        }
        if (n(str)) {
            return 2;
        }
        if (m(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        return i(str);
    }

    private static int i(String str) {
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a aVar = a.get(i);
            if (str.equals(aVar.a)) {
                return aVar.c;
            }
        }
        return -1;
    }

    public static int j(String str) {
        return h(e(str));
    }

    public static String k(String str) {
        if (str == null) {
            return null;
        }
        for (String e : v50.B0(str)) {
            String e2 = e(e);
            if (e2 != null && n(e2)) {
                return e2;
            }
        }
        return null;
    }

    public static boolean l(String str) {
        return "audio".equals(g(str));
    }

    public static boolean m(String str) {
        return "text".equals(g(str));
    }

    public static boolean n(String str) {
        return "video".equals(g(str));
    }
}
